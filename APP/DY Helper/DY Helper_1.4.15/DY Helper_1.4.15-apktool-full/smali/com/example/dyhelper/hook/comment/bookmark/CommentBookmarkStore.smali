.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

.field private static final KEY_BOOKMARKS:Ljava/lang/String; = "bookmarks_v1"

.field private static final KEY_CATEGORIES:Ljava/lang/String; = "categories_v1"

.field private static final SP_NAME:Ljava/lang/String; = "dyhelper_comment_bookmark"

.field private static final TAG:Ljava/lang/String; = "r1870ea96169c6d87"

.field private static volatile appContext:Landroid/content/Context;

.field private static final categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final listeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lp70;",
            ">;"
        }
    .end annotation
.end field

.field private static final lock:Ljava/lang/Object;

.field private static final records:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->categories:Ljava/util/List;

    .line 28
    .line 29
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 35
    .line 36
    const/16 v0, 0x8

    .line 37
    .line 38
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->$stable:I

    .line 39
    .line 40
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

.method private final load()V
    .locals 8

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->appContext:Landroid/content/Context;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->categories:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    .line 19
    :try_start_1
    const-string v1, "dyhelper_comment_bookmark"

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v1, "bookmarks_v1"

    .line 27
    .line 28
    const-string v3, "[]"

    .line 29
    .line 30
    invoke-interface {p0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    const-string v1, "[]"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_4

    .line 41
    :cond_1
    :goto_0
    new-instance v3, Lorg/json/JSONArray;

    .line 42
    .line 43
    invoke-direct {v3, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    move v4, v2

    .line 51
    :goto_1
    if-ge v4, v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-nez v5, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;

    .line 61
    .line 62
    invoke-virtual {v6, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-nez v6, :cond_3

    .line 75
    .line 76
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    invoke-virtual {v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    const-string v1, "categories_v1"

    .line 89
    .line 90
    const-string v3, "[]"

    .line 91
    .line 92
    invoke-interface {p0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-nez p0, :cond_5

    .line 97
    .line 98
    const-string p0, "[]"

    .line 99
    .line 100
    :cond_5
    new-instance v1, Lorg/json/JSONArray;

    .line 101
    .line 102
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    :goto_3
    if-ge v2, p0, :cond_7

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-nez v4, :cond_6

    .line 123
    .line 124
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->categories:Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :goto_4
    :try_start_2
    new-instance v1, Leo1;

    .line 136
    .line 137
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    move-object p0, v1

    .line 141
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_8

    .line 146
    .line 147
    const-string v1, "r1870ea96169c6d87"

    .line 148
    .line 149
    const-string v2, "load failed"

    .line 150
    .line 151
    invoke-static {v1, v2, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 152
    .line 153
    .line 154
    goto :goto_6

    .line 155
    :catchall_1
    move-exception p0

    .line 156
    goto :goto_7

    .line 157
    :cond_8
    :goto_6
    monitor-exit v0

    .line 158
    return-void

    .line 159
    :goto_7
    monitor-exit v0

    .line 160
    throw p0
.end method

.method private final notifyChanged()V
    .locals 1

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :catchall_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lp70;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method private final save()V
    .locals 4

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->appContext:Landroid/content/Context;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 7
    .line 8
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    :try_start_1
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast v2, Ljava/lang/Iterable;

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->toJson()Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :try_start_2
    monitor-exit v1

    .line 52
    const-string v1, "dyhelper_comment_bookmark"

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string v1, "bookmarks_v1"

    .line 64
    .line 65
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 74
    .line 75
    .line 76
    sget-object p0, Ls62;->α:Ls62;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :goto_1
    monitor-exit v1

    .line 80
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    :catchall_1
    move-exception p0

    .line 82
    new-instance v0, Leo1;

    .line 83
    .line 84
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    move-object p0, v0

    .line 88
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-eqz p0, :cond_2

    .line 93
    .line 94
    const-string v0, "r1870ea96169c6d87"

    .line 95
    .line 96
    const-string v1, "save failed"

    .line 97
    .line 98
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    :goto_3
    return-void
.end method

.method private final saveCategories()V
    .locals 4

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->appContext:Landroid/content/Context;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 7
    .line 8
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    :try_start_1
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->categories:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :try_start_2
    monitor-exit v1

    .line 39
    const-string v1, "dyhelper_comment_bookmark"

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v1, "categories_v1"

    .line 51
    .line 52
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 61
    .line 62
    .line 63
    sget-object p0, Ls62;->α:Ls62;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :goto_1
    monitor-exit v1

    .line 67
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    :catchall_1
    move-exception p0

    .line 69
    new-instance v0, Leo1;

    .line 70
    .line 71
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object p0, v0

    .line 75
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_2

    .line 80
    .line 81
    const-string v0, "r1870ea96169c6d87"

    .line 82
    .line 83
    const-string v1, "save categories failed"

    .line 84
    .line 85
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    :goto_3
    return-void
.end method

.method public static synthetic updateReplyCount$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;Ljava/lang/String;IZILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->updateReplyCount(Ljava/lang/String;IZ)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic updateReplyCountAndReplies$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;Ljava/lang/String;ILjava/util/List;ZILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->updateReplyCountAndReplies(Ljava/lang/String;ILjava/util/List;Z)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic updateReplyItems$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;Ljava/lang/String;ILjava/util/List;ZILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->updateReplyItems(Ljava/lang/String;ILjava/util/List;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method


# virtual methods
.method public final add(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v2, v3}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    :goto_0
    monitor-exit v0

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    const-string v0, "r1870ea96169c6d87"

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getLastKnownReplyCount()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getContent()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const/16 v5, 0x14

    .line 62
    .line 63
    invoke-static {p1, v5}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v5, "add bookmark cid="

    .line 68
    .line 69
    const-string v6, ", awemeId="

    .line 70
    .line 71
    const-string v7, ", replyCount="

    .line 72
    .line 73
    invoke-static {v5, v2, v6, v3, v7}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v3, ", content="

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const/4 v2, 0x4

    .line 93
    const/4 v3, 0x0

    .line 94
    invoke-static {v0, p1, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->save()V

    .line 98
    .line 99
    .line 100
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->notifyChanged()V

    .line 101
    .line 102
    .line 103
    :cond_2
    return v1

    .line 104
    :catchall_0
    move-exception p0

    .line 105
    monitor-exit v0

    .line 106
    throw p0
.end method

.method public final addCategory(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter p0

    .line 14
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->categories:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 26
    .line 27
    invoke-direct {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->saveCategories()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :goto_1
    monitor-exit p0

    .line 36
    throw p1
.end method

.method public final addListener(Lp70;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp70;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final all()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v0, Ljava/lang/Iterable;

    .line 14
    .line 15
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit p0

    .line 20
    return-object v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    monitor-exit p0

    .line 23
    throw v0
.end method

.method public final clear()V
    .locals 2

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->save()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->notifyChanged()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit v0

    .line 19
    throw p0
.end method

.method public final get(Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-object p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit p0

    .line 25
    throw p1

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public final getCategories()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->categories:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string v0, "\u9ed8\u8ba4"

    .line 13
    .line 14
    const-string v1, "\u91cd\u8981"

    .line 15
    .line 16
    const-string v2, "\u6709\u8da3"

    .line 17
    .line 18
    const-string v3, "\u5f85\u529e"

    .line 19
    .line 20
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    monitor-exit p0

    .line 29
    return-object v0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    :try_start_1
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    monitor-exit p0

    .line 37
    return-object v0

    .line 38
    :goto_0
    monitor-exit p0

    .line 39
    throw v0
.end method

.method public final init(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->appContext:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object p1, v0

    .line 17
    :goto_0
    sput-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->appContext:Landroid/content/Context;

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->load()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final isBookmarked(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit p0

    .line 20
    return p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit p0

    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final isInitialized()Z
    .locals 0

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->appContext:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final markRead(Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getKnownReplyIds()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    const/4 v1, 0x0

    .line 70
    invoke-virtual {p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setHasNewReplies(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setNewReplyCount(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v1

    .line 87
    invoke-virtual {p1, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setLastCheckTimestamp(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    .line 89
    .line 90
    monitor-exit v0

    .line 91
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->save()V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->notifyChanged()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :goto_1
    monitor-exit v0

    .line 99
    throw p0

    .line 100
    :cond_4
    :goto_2
    return-void
.end method

.method public final remove(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

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
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    :cond_1
    monitor-exit v1

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->save()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->notifyChanged()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return v0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v1

    .line 35
    throw p0

    .line 36
    :cond_3
    :goto_0
    return v0
.end method

.method public final removeListener(Lp70;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp70;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final size()I
    .locals 1

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit p0

    .line 11
    return v0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    monitor-exit p0

    .line 14
    throw v0
.end method

.method public final updateReplyCount(Ljava/lang/String;IZ)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 8

    .line 1
    const-string v0, "new replies cid="

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_7

    .line 5
    .line 6
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_0
    if-gez p2, :cond_1

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_1
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v2

    .line 20
    :try_start_0
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {v3, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    monitor-exit v2

    .line 31
    return-object v1

    .line 32
    :cond_2
    :try_start_1
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getLastKnownReplyCount()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    invoke-virtual {v3, v5, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setLastCheckTimestamp(J)V

    .line 41
    .line 42
    .line 43
    if-le p2, v4, :cond_3

    .line 44
    .line 45
    const-string v5, "r1870ea96169c6d87"

    .line 46
    .line 47
    sub-int v6, p2, v4

    .line 48
    .line 49
    new-instance v7, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, ", old="

    .line 58
    .line 59
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p1, ", new="

    .line 66
    .line 67
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, ", diff="

    .line 74
    .line 75
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const/4 v0, 0x4

    .line 86
    invoke-static {v5, p1, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    invoke-virtual {v3, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setHasNewReplies(Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    add-int/2addr p1, v6

    .line 98
    invoke-virtual {v3, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setNewReplyCount(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setLastKnownReplyCount(I)V

    .line 102
    .line 103
    .line 104
    move-object v1, v3

    .line 105
    goto :goto_0

    .line 106
    :catchall_0
    move-exception p0

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getLastKnownReplyCount()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-le p2, p1, :cond_4

    .line 113
    .line 114
    invoke-virtual {v3, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setLastKnownReplyCount(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    .line 117
    :cond_4
    :goto_0
    monitor-exit v2

    .line 118
    if-eqz v1, :cond_6

    .line 119
    .line 120
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->save()V

    .line 121
    .line 122
    .line 123
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->notifyChanged()V

    .line 124
    .line 125
    .line 126
    if-eqz p3, :cond_5

    .line 127
    .line 128
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->notifyNewCommentReply(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    return-object v1

    .line 134
    :cond_6
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->save()V

    .line 135
    .line 136
    .line 137
    return-object v1

    .line 138
    :goto_1
    monitor-exit v2

    .line 139
    throw p0

    .line 140
    :cond_7
    :goto_2
    return-object v1
.end method

.method public final updateReplyCountAndReplies(Ljava/lang/String;ILjava/util/List;Z)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;Z)",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_d

    .line 6
    .line 7
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    if-gez p2, :cond_1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    monitor-exit v1

    .line 32
    return-object v0

    .line 33
    :cond_2
    :try_start_1
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getLastKnownReplyCount()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    invoke-virtual {v2, v4, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setLastCheckTimestamp(J)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v5, 0x4

    .line 49
    const/4 v6, 0x1

    .line 50
    if-nez v4, :cond_7

    .line 51
    .line 52
    invoke-virtual {v2, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setHasNewReplies(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-interface {v4, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    new-instance v7, Ljava/util/HashSet;

    .line 67
    .line 68
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance v8, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_4

    .line 85
    .line 86
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    move-object v10, v9

    .line 91
    check-cast v10, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 92
    .line 93
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    invoke-virtual {v7, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    if-eqz v10, :cond_3

    .line 102
    .line 103
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception p0

    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :cond_4
    new-instance v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore$updateReplyCountAndReplies$lambda$22$$inlined$sortedByDescending$1;

    .line 111
    .line 112
    invoke-direct {v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore$updateReplyCountAndReplies$lambda$22$$inlined$sortedByDescending$1;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-static {v8, v4}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    const/16 v7, 0x32

    .line 120
    .line 121
    invoke-static {v4, v7}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    new-instance v7, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setNewReplyItems(Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :cond_5
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_6

    .line 142
    .line 143
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    check-cast v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 148
    .line 149
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-nez v8, :cond_5

    .line 158
    .line 159
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getKnownReplyIds()Ljava/util/Set;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-interface {v8, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_6
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    add-int/2addr v4, v7

    .line 180
    invoke-virtual {v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setNewReplyCount(I)V

    .line 181
    .line 182
    .line 183
    const-string v4, "r1870ea96169c6d87"

    .line 184
    .line 185
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    new-instance v9, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    const-string v10, "new reply items cid="

    .line 203
    .line 204
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v10, ", count="

    .line 211
    .line 212
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v7, ", total="

    .line 219
    .line 220
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    invoke-static {v4, v7, v0, v5, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    move-object v4, v2

    .line 234
    goto :goto_2

    .line 235
    :cond_7
    move-object v4, v0

    .line 236
    :goto_2
    if-le p2, v3, :cond_9

    .line 237
    .line 238
    const-string v4, "r1870ea96169c6d87"

    .line 239
    .line 240
    sub-int v7, p2, v3

    .line 241
    .line 242
    new-instance v8, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const-string v9, "reply count increased cid="

    .line 248
    .line 249
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string p1, ", old="

    .line 256
    .line 257
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string p1, ", new="

    .line 264
    .line 265
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-string p1, ", diff="

    .line 272
    .line 273
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-static {v4, p1, v0, v5, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setHasNewReplies(Z)V

    .line 287
    .line 288
    .line 289
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-eqz p1, :cond_8

    .line 294
    .line 295
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    add-int/2addr p1, v7

    .line 300
    invoke-virtual {v2, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setNewReplyCount(I)V

    .line 301
    .line 302
    .line 303
    :cond_8
    invoke-virtual {v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setLastKnownReplyCount(I)V

    .line 304
    .line 305
    .line 306
    goto :goto_3

    .line 307
    :cond_9
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getLastKnownReplyCount()I

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    if-eq p2, p1, :cond_a

    .line 312
    .line 313
    invoke-virtual {v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setLastKnownReplyCount(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 314
    .line 315
    .line 316
    :cond_a
    move-object v2, v4

    .line 317
    :goto_3
    monitor-exit v1

    .line 318
    if-eqz v2, :cond_c

    .line 319
    .line 320
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->save()V

    .line 321
    .line 322
    .line 323
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->notifyChanged()V

    .line 324
    .line 325
    .line 326
    if-eqz p4, :cond_b

    .line 327
    .line 328
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;

    .line 329
    .line 330
    invoke-virtual {p0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->notifyNewReply(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)V

    .line 331
    .line 332
    .line 333
    :cond_b
    return-object v2

    .line 334
    :cond_c
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->save()V

    .line 335
    .line 336
    .line 337
    return-object v2

    .line 338
    :goto_4
    monitor-exit v1

    .line 339
    throw p0

    .line 340
    :cond_d
    :goto_5
    return-object v0
.end method

.method public final updateReplyItems(Ljava/lang/String;ILjava/util/List;Z)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;Z)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_11

    .line 6
    .line 7
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_6

    .line 14
    .line 15
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    if-gez p2, :cond_1

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_1
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->lock:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v1

    .line 28
    :try_start_0
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    monitor-exit v1

    .line 39
    return v0

    .line 40
    :cond_2
    :try_start_1
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getKnownReplyIds()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/lang/Iterable;

    .line 45
    .line 46
    invoke-static {v3}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    new-instance v4, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    :cond_3
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_4

    .line 64
    .line 65
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    move-object v7, v6

    .line 70
    check-cast v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 71
    .line 72
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-nez v7, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto/16 :goto_5

    .line 88
    .line 89
    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    :cond_5
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_6

    .line 103
    .line 104
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    move-object v7, v6

    .line 109
    check-cast v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 110
    .line 111
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-nez v7, :cond_5

    .line 120
    .line 121
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_6
    new-instance v3, Ljava/util/HashSet;

    .line 126
    .line 127
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 128
    .line 129
    .line 130
    new-instance v4, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    :cond_7
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_8

    .line 144
    .line 145
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    move-object v7, v6

    .line 150
    check-cast v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 151
    .line 152
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    if-eqz v7, :cond_7

    .line 161
    .line 162
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_8
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    :cond_9
    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_a

    .line 175
    .line 176
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    check-cast v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 181
    .line 182
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-nez v5, :cond_9

    .line 191
    .line 192
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getKnownReplyIds()Ljava/util/Set;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result p3

    .line 208
    const/4 v3, 0x1

    .line 209
    if-nez p3, :cond_d

    .line 210
    .line 211
    invoke-virtual {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setHasNewReplies(Z)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object p3

    .line 218
    invoke-interface {p3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object p3

    .line 225
    new-instance v0, Ljava/util/HashSet;

    .line 226
    .line 227
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 228
    .line 229
    .line 230
    new-instance v5, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object p3

    .line 239
    :cond_b
    :goto_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    if-eqz v6, :cond_c

    .line 244
    .line 245
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    move-object v7, v6

    .line 250
    check-cast v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 251
    .line 252
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-eqz v7, :cond_b

    .line 261
    .line 262
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_c
    new-instance p3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore$updateReplyItems$lambda$18$$inlined$sortedByDescending$1;

    .line 267
    .line 268
    invoke-direct {p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore$updateReplyItems$lambda$18$$inlined$sortedByDescending$1;-><init>()V

    .line 269
    .line 270
    .line 271
    invoke-static {v5, p3}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object p3

    .line 275
    const/16 v0, 0x32

    .line 276
    .line 277
    invoke-static {p3, v0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object p3

    .line 281
    new-instance v0, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setNewReplyItems(Ljava/util/List;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 290
    .line 291
    .line 292
    move-result p3

    .line 293
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    add-int/2addr p3, v0

    .line 298
    invoke-virtual {v2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setNewReplyCount(I)V

    .line 299
    .line 300
    .line 301
    const-string p3, "r1870ea96169c6d87"

    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    new-instance v5, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    const-string v6, "new reply items cid="

    .line 321
    .line 322
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    const-string p1, ", count="

    .line 329
    .line 330
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string p1, ", total="

    .line 337
    .line 338
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    const/4 v0, 0x4

    .line 349
    const/4 v4, 0x0

    .line 350
    invoke-static {p3, p1, v4, v0, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    move v0, v3

    .line 354
    :cond_d
    if-ltz p2, :cond_e

    .line 355
    .line 356
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getLastKnownReplyCount()I

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    if-eq p2, p1, :cond_e

    .line 361
    .line 362
    invoke-virtual {v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setLastKnownReplyCount(I)V

    .line 363
    .line 364
    .line 365
    move v0, v3

    .line 366
    :cond_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 367
    .line 368
    .line 369
    move-result-wide p1

    .line 370
    invoke-virtual {v2, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->setLastCheckTimestamp(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 371
    .line 372
    .line 373
    monitor-exit v1

    .line 374
    if-eqz v0, :cond_10

    .line 375
    .line 376
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->save()V

    .line 377
    .line 378
    .line 379
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->notifyChanged()V

    .line 380
    .line 381
    .line 382
    if-eqz p4, :cond_f

    .line 383
    .line 384
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getHasNewReplies()Z

    .line 385
    .line 386
    .line 387
    move-result p0

    .line 388
    if-ne p0, v3, :cond_f

    .line 389
    .line 390
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;

    .line 391
    .line 392
    invoke-virtual {p0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->notifyNewReply(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)V

    .line 393
    .line 394
    .line 395
    :cond_f
    return v0

    .line 396
    :cond_10
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->save()V

    .line 397
    .line 398
    .line 399
    return v0

    .line 400
    :goto_5
    monitor-exit v1

    .line 401
    throw p0

    .line 402
    :cond_11
    :goto_6
    return v0
.end method

.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

.field private static final KEY_BOOKMARKS:Ljava/lang/String; = "profile_bookmarks_v1"

.field private static final SP_NAME:Ljava/lang/String; = "dyhelper_profile_bookmark"

.field private static final TAG:Ljava/lang/String; = "r7c84497415b5fd17"

.field private static volatile appContext:Landroid/content/Context;

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
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    const/16 v0, 0x8

    .line 30
    .line 31
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->$stable:I

    .line 32
    .line 33
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
    .locals 6

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->appContext:Landroid/content/Context;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    :try_start_1
    const-string v1, "dyhelper_profile_bookmark"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v1, "profile_bookmarks_v1"

    .line 22
    .line 23
    const-string v3, "[]"

    .line 24
    .line 25
    invoke-interface {p0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    const-string p0, "[]"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    :goto_0
    new-instance v1, Lorg/json/JSONArray;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    :goto_1
    if-ge v2, p0, :cond_4

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-nez v3, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;

    .line 55
    .line 56
    invoke-virtual {v4, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_3

    .line 69
    .line 70
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :goto_3
    :try_start_2
    new-instance v1, Leo1;

    .line 82
    .line 83
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    move-object p0, v1

    .line 87
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-eqz p0, :cond_5

    .line 92
    .line 93
    const-string v1, "r7c84497415b5fd17"

    .line 94
    .line 95
    const-string v2, "load failed"

    .line 96
    .line 97
    invoke-static {v1, v2, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 98
    .line 99
    .line 100
    goto :goto_5

    .line 101
    :catchall_1
    move-exception p0

    .line 102
    goto :goto_6

    .line 103
    :cond_5
    :goto_5
    monitor-exit v0

    .line 104
    return-void

    .line 105
    :goto_6
    monitor-exit v0

    .line 106
    throw p0
.end method

.method private final notifyChanged()V
    .locals 1

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->appContext:Landroid/content/Context;

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
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    :try_start_1
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

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
    check-cast v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->toJson()Lorg/json/JSONObject;

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
    const-string v1, "dyhelper_profile_bookmark"

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
    const-string v1, "profile_bookmarks_v1"

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
    const-string v0, "r7c84497415b5fd17"

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

.method public static synthetic updateAwemeSnapshot$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;Ljava/lang/String;Ljava/util/List;IZILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 10
    .line 11
    if-eqz p5, :cond_1

    .line 12
    .line 13
    const/4 p4, 0x1

    .line 14
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->updateAwemeSnapshot(Ljava/lang/String;Ljava/util/List;IZ)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final add(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v3, v0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    :goto_0
    monitor-exit v1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    const-string v1, "r7c84497415b5fd17"

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v5, "add profile bookmark key="

    .line 50
    .line 51
    const-string v6, " uid="

    .line 52
    .line 53
    const-string v7, ", secUid="

    .line 54
    .line 55
    invoke-static {v5, v0, v6, v3, v7}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v3, ", nickname="

    .line 60
    .line 61
    invoke-static {v0, v4, v3, p1}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const/4 v0, 0x4

    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-static {v1, p1, v3, v0, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->save()V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->notifyChanged()V

    .line 74
    .line 75
    .line 76
    :cond_2
    return v2

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    monitor-exit v1

    .line 79
    throw p0
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
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

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
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

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
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

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
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->save()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->notifyChanged()V

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

.method public final get(Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
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
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
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

.method public final init(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->appContext:Landroid/content/Context;

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
    sput-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->appContext:Landroid/content/Context;

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->load()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final isBookmarked(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return p0

    .line 16
    :cond_1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit p0

    .line 26
    return p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    monitor-exit p0

    .line 29
    throw p1
.end method

.method public final isInitialized()Z
    .locals 0

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->appContext:Landroid/content/Context;

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
    .locals 3

    .line 1
    if-eqz p1, :cond_2

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
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
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
    const/4 v1, 0x0

    .line 26
    :try_start_1
    invoke-virtual {p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->setHasNewAweme(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->setNewAwemeCount(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNewAwemeItems()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    invoke-virtual {p1, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->setLastCheckTimestamp(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->save()V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->notifyChanged()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    monitor-exit v0

    .line 56
    throw p0

    .line 57
    :cond_2
    :goto_0
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
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

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
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->save()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->notifyChanged()V

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
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

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

.method public final updateAwemeSnapshot(Ljava/lang/String;Ljava/util/List;IZ)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;IZ)",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_19

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
    goto/16 :goto_9

    .line 14
    .line 15
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto/16 :goto_9

    .line 22
    .line 23
    :cond_1
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->lock:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v1

    .line 26
    :try_start_0
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->records:Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    monitor-exit v1

    .line 37
    return-object v0

    .line 38
    :cond_2
    :try_start_1
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getKnownAwemeIds()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-static {v3}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    new-instance v4, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    :cond_3
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    move-object v7, v6

    .line 68
    check-cast v7, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 69
    .line 70
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-nez v7, :cond_3

    .line 79
    .line 80
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object p0, v0

    .line 86
    goto/16 :goto_8

    .line 87
    .line 88
    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    :cond_5
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_6

    .line 102
    .line 103
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    move-object v7, v6

    .line 108
    check-cast v7, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 109
    .line 110
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-nez v7, :cond_5

    .line 119
    .line 120
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    :cond_7
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_8

    .line 138
    .line 139
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    move-object v6, v5

    .line 144
    check-cast v6, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 145
    .line 146
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getCreateTime()J

    .line 147
    .line 148
    .line 149
    move-result-wide v6

    .line 150
    const-wide/16 v8, 0x3e8

    .line 151
    .line 152
    mul-long/2addr v6, v8

    .line 153
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getCreateTimestamp()J

    .line 154
    .line 155
    .line 156
    move-result-wide v8

    .line 157
    cmp-long v6, v6, v8

    .line 158
    .line 159
    if-ltz v6, :cond_7

    .line 160
    .line 161
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_8
    new-instance v4, Ljava/util/HashSet;

    .line 166
    .line 167
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 168
    .line 169
    .line 170
    new-instance v5, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    :cond_9
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    if-eqz v6, :cond_a

    .line 184
    .line 185
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    move-object v7, v6

    .line 190
    check-cast v7, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 191
    .line 192
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-eqz v7, :cond_9

    .line 201
    .line 202
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_a
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    :cond_b
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-eqz v4, :cond_c

    .line 215
    .line 216
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    check-cast v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 221
    .line 222
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-nez v6, :cond_b

    .line 231
    .line 232
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getKnownAwemeIds()Ljava/util/Set;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    check-cast v6, Ljava/util/Collection;

    .line 237
    .line 238
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_c
    new-instance v3, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    :cond_d
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    if-eqz v6, :cond_e

    .line 260
    .line 261
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    move-object v7, v6

    .line 266
    check-cast v7, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 267
    .line 268
    invoke-virtual {v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    if-nez v7, :cond_d

    .line 277
    .line 278
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_e
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-nez v4, :cond_f

    .line 291
    .line 292
    move-object v4, v0

    .line 293
    goto :goto_6

    .line 294
    :cond_f
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    if-nez v6, :cond_10

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_10
    move-object v6, v4

    .line 306
    check-cast v6, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 307
    .line 308
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getCreateTime()J

    .line 309
    .line 310
    .line 311
    move-result-wide v6

    .line 312
    :cond_11
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    move-object v9, v8

    .line 317
    check-cast v9, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 318
    .line 319
    invoke-virtual {v9}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getCreateTime()J

    .line 320
    .line 321
    .line 322
    move-result-wide v9

    .line 323
    cmp-long v11, v6, v9

    .line 324
    .line 325
    if-gez v11, :cond_12

    .line 326
    .line 327
    move-object v4, v8

    .line 328
    move-wide v6, v9

    .line 329
    :cond_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    if-nez v8, :cond_11

    .line 334
    .line 335
    :goto_6
    check-cast v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 336
    .line 337
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    const/4 v6, 0x1

    .line 342
    if-nez v3, :cond_15

    .line 343
    .line 344
    invoke-virtual {v2, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->setHasNewAweme(Z)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNewAwemeCount()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 352
    .line 353
    .line 354
    move-result v7

    .line 355
    add-int/2addr v3, v7

    .line 356
    invoke-virtual {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->setNewAwemeCount(I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNewAwemeItems()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    invoke-interface {v3, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNewAwemeItems()Ljava/util/List;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    new-instance v7, Ljava/util/HashSet;

    .line 371
    .line 372
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 373
    .line 374
    .line 375
    new-instance v8, Ljava/util/ArrayList;

    .line 376
    .line 377
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 378
    .line 379
    .line 380
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    :cond_13
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 385
    .line 386
    .line 387
    move-result v9

    .line 388
    if-eqz v9, :cond_14

    .line 389
    .line 390
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v9

    .line 394
    move-object v10, v9

    .line 395
    check-cast v10, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 396
    .line 397
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v10

    .line 401
    invoke-virtual {v7, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    if-eqz v10, :cond_13

    .line 406
    .line 407
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    goto :goto_7

    .line 411
    :cond_14
    new-instance v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore$updateAwemeSnapshot$lambda$17$$inlined$sortedByDescending$1;

    .line 412
    .line 413
    invoke-direct {v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore$updateAwemeSnapshot$lambda$17$$inlined$sortedByDescending$1;-><init>()V

    .line 414
    .line 415
    .line 416
    invoke-static {v8, v3}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    const/16 v7, 0x32

    .line 421
    .line 422
    invoke-static {v3, v7}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    new-instance v7, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->setNewAwemeItems(Ljava/util/List;)V

    .line 432
    .line 433
    .line 434
    const-string v3, "r7c84497415b5fd17"

    .line 435
    .line 436
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->displayName()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 441
    .line 442
    .line 443
    move-result v5

    .line 444
    new-instance v8, Ljava/lang/StringBuilder;

    .line 445
    .line 446
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 447
    .line 448
    .line 449
    const-string v9, "new profile aweme key="

    .line 450
    .line 451
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    const-string p1, ", user="

    .line 458
    .line 459
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    const-string p1, ", new="

    .line 466
    .line 467
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    const/4 v5, 0x4

    .line 478
    invoke-static {v3, p1, v0, v5, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    move-object v0, v2

    .line 482
    :cond_15
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 483
    .line 484
    .line 485
    move-result p1

    .line 486
    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    .line 487
    .line 488
    .line 489
    move-result p1

    .line 490
    invoke-virtual {v2, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->setLastAwemeCount(I)V

    .line 491
    .line 492
    .line 493
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 494
    .line 495
    .line 496
    move-result-wide p1

    .line 497
    invoke-virtual {v2, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->setLastCheckTimestamp(J)V

    .line 498
    .line 499
    .line 500
    if-eqz v4, :cond_16

    .line 501
    .line 502
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    invoke-virtual {v2, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->setLastNewestAwemeId(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 507
    .line 508
    .line 509
    :cond_16
    monitor-exit v1

    .line 510
    if-eqz v0, :cond_18

    .line 511
    .line 512
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->save()V

    .line 513
    .line 514
    .line 515
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->notifyChanged()V

    .line 516
    .line 517
    .line 518
    if-eqz p4, :cond_17

    .line 519
    .line 520
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNotificationEnabled()Z

    .line 521
    .line 522
    .line 523
    move-result p0

    .line 524
    if-ne p0, v6, :cond_17

    .line 525
    .line 526
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;

    .line 527
    .line 528
    invoke-virtual {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->notifyNewProfileAweme(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 529
    .line 530
    .line 531
    :cond_17
    return-object v0

    .line 532
    :cond_18
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->save()V

    .line 533
    .line 534
    .line 535
    return-object v0

    .line 536
    :goto_8
    monitor-exit v1

    .line 537
    throw p0

    .line 538
    :cond_19
    :goto_9
    return-object v0
.end method

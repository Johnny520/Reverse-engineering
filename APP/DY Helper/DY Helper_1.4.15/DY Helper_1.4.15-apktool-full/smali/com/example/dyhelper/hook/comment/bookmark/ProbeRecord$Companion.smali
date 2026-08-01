.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;
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
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    const-string p0, "type"

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->valueOf(Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p0, v0

    .line 20
    new-instance v0, Leo1;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p0, v0

    .line 26
    :goto_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->COMMENT:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 27
    .line 28
    instance-of v1, p0, Leo1;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    move-object p0, v0

    .line 33
    :cond_0
    move-object v2, p0

    .line 34
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 35
    .line 36
    const-string p0, "id"

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-string p0, "group"

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const-string p0, "createTime"

    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    invoke-virtual {p1, p0, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    const-string p0, "commentRecord"

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const/4 v0, 0x0

    .line 71
    if-eqz p0, :cond_1

    .line 72
    .line 73
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;

    .line 74
    .line 75
    invoke-virtual {v6, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    move-object v6, p0

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move-object v6, v0

    .line 82
    :goto_1
    const-string p0, "profileRecord"

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-eqz p0, :cond_2

    .line 89
    .line 90
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;

    .line 91
    .line 92
    invoke-virtual {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :cond_2
    move-object v7, v0

    .line 97
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;

    .line 98
    .line 99
    invoke-direct/range {v0 .. v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;-><init>(Ljava/lang/String;Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;Ljava/lang/String;JLcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 100
    .line 101
    .line 102
    return-object v0
.end method

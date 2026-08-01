.class public final Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

.field private static final TAG:Ljava/lang/String; = "r8019613efb2e496"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

    .line 7
    .line 8
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

.method private final buildProfileSchemaCandidates(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "snssdk1128"

    .line 7
    .line 8
    const-string v1, "aweme"

    .line 9
    .line 10
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    invoke-static {p1, p2, v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->buildProfileSchemaCandidates$buildUri(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    invoke-static {p1, p2, v1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->buildProfileSchemaCandidates$buildUri(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_1
    const/4 v2, 0x0

    .line 67
    invoke-static {p1, p2, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->buildProfileSchemaCandidates$buildUri(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-static {p0}, Lxh;->В(Ljava/lang/Iterable;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method

.method private static final buildProfileSchemaCandidates$buildUri(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Landroid/net/Uri$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const-string v0, "user"

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const-string v0, "profile"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    invoke-static {p3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p2, p3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    if-nez p3, :cond_2

    .line 39
    .line 40
    const-string p3, "uid"

    .line 41
    .line 42
    invoke-virtual {p2, p3, p0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 43
    .line 44
    .line 45
    const-string p3, "id"

    .line 46
    .line 47
    invoke-virtual {p2, p3, p0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 48
    .line 49
    .line 50
    const-string p3, "user_id"

    .line 51
    .line 52
    invoke-virtual {p2, p3, p0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_3

    .line 60
    .line 61
    const-string p0, "sec_user_id"

    .line 62
    .line 63
    invoke-virtual {p2, p0, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 64
    .line 65
    .line 66
    const-string p0, "sec_uid"

    .line 67
    .line 68
    invoke-virtual {p2, p0, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 69
    .line 70
    .line 71
    const-string p0, "secUid"

    .line 72
    .line 73
    invoke-virtual {p2, p0, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 74
    .line 75
    .line 76
    :cond_3
    const-string p0, "enter_from"

    .line 77
    .line 78
    const-string p1, "dyhelper_profile_bookmark"

    .line 79
    .line 80
    invoke-virtual {p2, p0, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    return-object p0
.end method

.method private final buildVideoSchemaCandidates(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 38
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->buildVideoSchemaCandidates(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final buildVideoSchemaCandidates(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "snssdk1128://aweme/detail/"

    .line 6
    .line 7
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "aweme://aweme/detail/"

    .line 12
    .line 13
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "snssdk1128://aweme/detail/?aweme_id="

    .line 18
    .line 19
    invoke-static {v1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "aweme://aweme/detail/?aweme_id="

    .line 24
    .line 25
    invoke-static {v2, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    filled-new-array {p1, v0, v1, p0}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method private final jumpToVideoOnly(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->buildVideoSchemaCandidates(Ljava/lang/String;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->jumpToVideoSchemas(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method private final jumpToVideoSchemas(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 v0, 0x4

    .line 10
    const-string v1, "r8019613efb2e496"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Ljava/lang/String;

    .line 20
    .line 21
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v4, "trying video-only schema: "

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v1, v3, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v3, Landroid/content/Intent;

    .line 42
    .line 43
    const-string v4, "android.intent.action.VIEW"

    .line 44
    .line 45
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 50
    .line 51
    .line 52
    const/high16 v4, 0x10000000

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 65
    .line 66
    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v4, "video-only jump started, awemeId="

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v1, v3, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x1

    .line 88
    return p0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    const-string v2, "schema failed: "

    .line 91
    .line 92
    invoke-static {v2, p2, v1, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    const-string p0, "all video-only schemas failed"

    .line 97
    .line 98
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    const/4 p0, 0x0

    .line 102
    return p0
.end method

.method private final openProfileActivityExplicitly(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const-string p0, "r8019613efb2e496"

    .line 2
    .line 3
    const-string v0, "profile jump via explicit UserProfileActivity uid="

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v1, "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CECCA21FDEA59E6D1E697316E64ED89B0A30DD15E164C9063C01C2F6CC0352"

    .line 8
    .line 9
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v2, Landroid/content/Intent;

    .line 30
    .line 31
    invoke-direct {v2, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 32
    .line 33
    .line 34
    const/high16 v1, 0x10000000

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    const-string v1, "uid"

    .line 46
    .line 47
    invoke-virtual {v2, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    const-string v1, "id"

    .line 51
    .line 52
    invoke-virtual {v2, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    const-string v1, "user_id"

    .line 56
    .line 57
    invoke-virtual {v2, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    :goto_0
    invoke-static {p3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    const-string v1, "sec_user_id"

    .line 70
    .line 71
    invoke-virtual {v2, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    const-string v1, "sec_uid"

    .line 75
    .line 76
    invoke-virtual {v2, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    const-string v1, "secUid"

    .line 80
    .line 81
    invoke-virtual {v2, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 82
    .line 83
    .line 84
    :cond_2
    const-string v1, "enter_from"

    .line 85
    .line 86
    const-string v3, "dyhelper_profile_bookmark"

    .line 87
    .line 88
    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 92
    .line 93
    .line 94
    new-instance p1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string p2, " secUid="

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const/4 p2, 0x4

    .line 115
    const/4 p3, 0x0

    .line 116
    invoke-static {p0, p1, p3, p2, p3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    const/4 p1, 0x1

    .line 120
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 121
    .line 122
    .line 123
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    goto :goto_3

    .line 125
    :goto_2
    new-instance p2, Leo1;

    .line 126
    .line 127
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    move-object p1, p2

    .line 131
    :goto_3
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    if-eqz p2, :cond_3

    .line 136
    .line 137
    const-string p3, "explicit UserProfileActivity jump failed"

    .line 138
    .line 139
    invoke-static {p0, p3, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    :cond_3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 143
    .line 144
    instance-of p2, p1, Leo1;

    .line 145
    .line 146
    if-eqz p2, :cond_4

    .line 147
    .line 148
    move-object p1, p0

    .line 149
    :cond_4
    check-cast p1, Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    return p0
.end method

.method private final openProfileBySmartRouter(Landroid/app/Activity;Ljava/util/List;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v1, "r8019613efb2e496"

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    :cond_0
    move/from16 p0, v3

    .line 15
    .line 16
    goto/16 :goto_a

    .line 17
    .line 18
    :cond_1
    const-string v0, "~79141EF2FBD496D84F82136FAD77522A06BB551B75C1AEA3D4F42A80C42F5DAB"

    .line 19
    .line 20
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v4, "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724259A29B43A5807491FC629BF3D81986847A"

    .line 25
    .line 26
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    :try_start_0
    invoke-static {v2, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    new-instance v5, Leo1;

    .line 61
    .line 62
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v5

    .line 66
    :goto_1
    instance-of v5, v0, Leo1;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    move-object v0, v6

    .line 72
    :cond_2
    check-cast v0, Ljava/lang/Class;

    .line 73
    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    array-length v5, v0

    .line 85
    move v7, v3

    .line 86
    :goto_2
    const/4 v8, 0x1

    .line 87
    if-ge v7, v5, :cond_5

    .line 88
    .line 89
    aget-object v9, v0, v7

    .line 90
    .line 91
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    const-string v11, "buildRoute"

    .line 96
    .line 97
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    if-eqz v10, :cond_4

    .line 102
    .line 103
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    array-length v10, v10

    .line 108
    const/4 v11, 0x2

    .line 109
    if-ne v10, v11, :cond_4

    .line 110
    .line 111
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    aget-object v10, v10, v3

    .line 116
    .line 117
    const-class v11, Landroid/content/Context;

    .line 118
    .line 119
    invoke-virtual {v11, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-eqz v10, :cond_4

    .line 124
    .line 125
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    aget-object v10, v10, v8

    .line 130
    .line 131
    const-class v11, Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-eqz v10, :cond_4

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    move-object v9, v6

    .line 144
    :goto_3
    if-nez v9, :cond_6

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_6
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_d

    .line 156
    .line 157
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    move-object v7, v0

    .line 162
    check-cast v7, Ljava/lang/String;

    .line 163
    .line 164
    const/4 v10, 0x4

    .line 165
    move-object/from16 v11, p1

    .line 166
    .line 167
    :try_start_1
    filled-new-array {v11, v7}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v9, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-nez v0, :cond_7

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    invoke-virtual {v12}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 183
    .line 184
    .line 185
    move-result-object v12

    .line 186
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    array-length v13, v12

    .line 190
    move v14, v3

    .line 191
    :goto_5
    if-ge v14, v13, :cond_9

    .line 192
    .line 193
    aget-object v15, v12, v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 194
    .line 195
    move/from16 p0, v3

    .line 196
    .line 197
    :try_start_2
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 201
    move/from16 v16, v8

    .line 202
    .line 203
    :try_start_3
    const-string v8, "open"

    .line 204
    .line 205
    invoke-static {v3, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-eqz v3, :cond_8

    .line 210
    .line 211
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    array-length v3, v3

    .line 219
    if-nez v3, :cond_8

    .line 220
    .line 221
    goto :goto_7

    .line 222
    :catchall_1
    move-exception v0

    .line 223
    goto :goto_9

    .line 224
    :cond_8
    add-int/lit8 v14, v14, 0x1

    .line 225
    .line 226
    move/from16 v3, p0

    .line 227
    .line 228
    move/from16 v8, v16

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :catchall_2
    move-exception v0

    .line 232
    :goto_6
    move/from16 v16, v8

    .line 233
    .line 234
    goto :goto_9

    .line 235
    :catchall_3
    move-exception v0

    .line 236
    move/from16 p0, v3

    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_9
    move/from16 p0, v3

    .line 240
    .line 241
    move/from16 v16, v8

    .line 242
    .line 243
    move-object v15, v6

    .line 244
    :goto_7
    if-nez v15, :cond_b

    .line 245
    .line 246
    :cond_a
    :goto_8
    move/from16 v3, p0

    .line 247
    .line 248
    move/from16 v8, v16

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_b
    invoke-virtual {v15, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    instance-of v3, v0, Ljava/lang/Boolean;

    .line 256
    .line 257
    if-eqz v3, :cond_c

    .line 258
    .line 259
    check-cast v0, Ljava/lang/Boolean;

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_a

    .line 266
    .line 267
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 270
    .line 271
    .line 272
    const-string v3, "profile jump via SmartRouter route="

    .line 273
    .line 274
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-static {v1, v0, v6, v10, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 285
    .line 286
    .line 287
    return v16

    .line 288
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    const-string v3, "SmartRouter profile route failed route="

    .line 293
    .line 294
    const-string v8, " err="

    .line 295
    .line 296
    invoke-static {v3, v7, v8, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v1, v0, v6, v10, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_d
    move-object/from16 v11, p1

    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :goto_a
    return p0
.end method

.method private final walkForPageParam(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_a

    .line 3
    .line 4
    const/4 v1, 0x6

    .line 5
    if-le p2, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E1346FF1258BD4730B619814EC11C79EF1584E39A35A58F164D327A9F9C3714A163C8E912E"

    .line 18
    .line 19
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_a

    .line 35
    .line 36
    instance-of v2, p1, Ljava/lang/String;

    .line 37
    .line 38
    if-nez v2, :cond_a

    .line 39
    .line 40
    instance-of v2, p1, Ljava/lang/Number;

    .line 41
    .line 42
    if-nez v2, :cond_a

    .line 43
    .line 44
    instance-of v2, p1, Ljava/lang/Boolean;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_3

    .line 54
    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :cond_3
    instance-of v2, p1, Ljava/lang/Iterable;

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    check-cast p1, Ljava/lang/Iterable;

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_a

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

    .line 79
    .line 80
    add-int/lit8 v2, p2, 0x1

    .line 81
    .line 82
    invoke-direct {v1, p1, v2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->walkForPageParam(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_7

    .line 94
    .line 95
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    const/4 v2, 0x0

    .line 100
    :goto_0
    if-ge v2, v1, :cond_a

    .line 101
    .line 102
    invoke-static {p1, v2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    add-int/lit8 v5, p2, 0x1

    .line 107
    .line 108
    invoke-direct {p0, v4, v5, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->walkForPageParam(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    if-eqz v4, :cond_6

    .line 113
    .line 114
    return-object v4

    .line 115
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_7
    :goto_1
    if-eqz v1, :cond_a

    .line 119
    .line 120
    const-class v2, Ljava/lang/Object;

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_a

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v2}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    :catchall_0
    :cond_8
    invoke-virtual {v2}, Lτ;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_9

    .line 141
    .line 142
    invoke-virtual {v2}, Lτ;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    check-cast v4, Ljava/lang/reflect/Field;

    .line 147
    .line 148
    :try_start_0
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    add-int/lit8 v5, p2, 0x1

    .line 156
    .line 157
    invoke-direct {p0, v4, v5, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->walkForPageParam(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    if-eqz v4, :cond_8

    .line 162
    .line 163
    return-object v4

    .line 164
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    goto :goto_1

    .line 169
    :cond_a
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final findVideoCommentPageParam(Ljava/util/Collection;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {p0, v0, v2, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->walkForPageParam(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public final jump(Landroid/app/Activity;Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->jumpToVideoOnly(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final jumpToProfile(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x4

    .line 37
    const-string v5, "r8019613efb2e496"

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    new-instance p0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string p1, "jumpToProfile failed, uid/secUid empty, record="

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {v5, p0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return v3

    .line 66
    :cond_0
    invoke-direct {p0, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->buildProfileSchemaCandidates(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->openProfileBySmartRouter(Landroid/app/Activity;Ljava/util/List;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const/4 v7, 0x1

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    return v7

    .line 78
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const-string v8, ", secUid="

    .line 87
    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Ljava/lang/String;

    .line 95
    .line 96
    :try_start_0
    new-instance v9, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v10, "trying profile schema: "

    .line 102
    .line 103
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    invoke-static {v5, v9, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    new-instance v9, Landroid/content/Intent;

    .line 117
    .line 118
    const-string v10, "android.intent.action.VIEW"

    .line 119
    .line 120
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    invoke-direct {v9, v10, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 125
    .line 126
    .line 127
    const/high16 v10, 0x10000000

    .line 128
    .line 129
    invoke-virtual {v9, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-virtual {v9, v10}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    if-nez v10, :cond_2

    .line 144
    .line 145
    const-string v10, "uid"

    .line 146
    .line 147
    invoke-virtual {v9, v10, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    .line 149
    .line 150
    const-string v10, "id"

    .line 151
    .line 152
    invoke-virtual {v9, v10, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    .line 154
    .line 155
    const-string v10, "user_id"

    .line 156
    .line 157
    invoke-virtual {v9, v10, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :catchall_0
    move-exception v8

    .line 162
    goto :goto_2

    .line 163
    :cond_2
    :goto_1
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-nez v10, :cond_3

    .line 168
    .line 169
    const-string v10, "sec_user_id"

    .line 170
    .line 171
    invoke-virtual {v9, v10, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 172
    .line 173
    .line 174
    const-string v10, "sec_uid"

    .line 175
    .line 176
    invoke-virtual {v9, v10, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 177
    .line 178
    .line 179
    const-string v10, "secUid"

    .line 180
    .line 181
    invoke-virtual {v9, v10, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    .line 183
    .line 184
    :cond_3
    const-string v10, "enter_from"

    .line 185
    .line 186
    const-string v11, "dyhelper_profile_bookmark"

    .line 187
    .line 188
    invoke-virtual {v9, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v9}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 192
    .line 193
    .line 194
    new-instance v9, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    const-string v10, "profile jump started, uid="

    .line 200
    .line 201
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v8, ", schema="

    .line 214
    .line 215
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    invoke-static {v5, v8, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 226
    .line 227
    .line 228
    return v7

    .line 229
    :goto_2
    const-string v9, "schema failed: "

    .line 230
    .line 231
    invoke-static {v9, v2, v5, v8}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_4
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->openProfileActivityExplicitly(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Z

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    if-eqz p0, :cond_5

    .line 241
    .line 242
    return v7

    .line 243
    :cond_5
    const-string p0, "all profile schemas failed, uid="

    .line 244
    .line 245
    invoke-static {p0, v0, v8, v1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-static {v5, p0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    return v3
.end method

.method public final jumpToVideo(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance p0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string p1, "jumpToVideo failed, awemeId empty, record="

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/4 p1, 0x4

    .line 32
    const-string p2, "r8019613efb2e496"

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {p2, p0, v0, p1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_0
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->buildVideoSchemaCandidates(Ljava/lang/String;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-direct {p0, p1, v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->jumpToVideoSchemas(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0
.end method

.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

.field private static final MY_PANDA_FRAGMENT:Ljava/lang/String;

.field private static final POST_AWEME_MODEL:Ljava/lang/String;

.field private static final PROFILE_USER_CLASS:Ljava/lang/String;

.field private static final TAG:Ljava/lang/String; = "rd1d88829108d0f54"

.field private static final USER_PANDA_FRAGMENT:Ljava/lang/String;

.field private static final USER_PROFILE_ACTIVITY:Ljava/lang/String;

.field private static volatile appContext:Landroid/content/Context;

.field private static volatile hostClassLoader:Ljava/lang/ClassLoader;

.field private static final installed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static volatile lastProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

.field private static final latestAwemeItemsByProfileKey:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 7
    .line 8
    const-string v0, "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CECCA21FDEA59E6D1E697316E64ED89B0A30DD15E164C9063C01C2F6CC0352"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->USER_PROFILE_ACTIVITY:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654BCB3269353AA13AAC01D1D74242243F4583536FF0BAA7689CC7A0B2BEC39B09E"

    .line 17
    .line 18
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->POST_AWEME_MODEL:Ljava/lang/String;

    .line 23
    .line 24
    const-string v0, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22A325AEF903414FAFE45A7E3E2147D4EB64C679F2AFDEF96783477651D7DF068CED"

    .line 25
    .line 26
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->USER_PANDA_FRAGMENT:Ljava/lang/String;

    .line 31
    .line 32
    const-string v0, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56E12235AEF6A9D8A96D4C6BF6620E3BC7CC2AB8F5AF77DB0E4422D8132D6EA4"

    .line 33
    .line 34
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->MY_PANDA_FRAGMENT:Ljava/lang/String;

    .line 39
    .line 40
    const-string v0, "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD993981847A"

    .line 41
    .line 42
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->PROFILE_USER_CLASS:Ljava/lang/String;

    .line 47
    .line 48
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->installed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->latestAwemeItemsByProfileKey:Ljava/util/concurrent/ConcurrentHashMap;

    .line 62
    .line 63
    const/16 v0, 0x8

    .line 64
    .line 65
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->$stable:I

    .line 66
    .line 67
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

.method public static final synthetic access$cacheCurrentProfileInfo(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->cacheCurrentProfileInfo(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$cacheProfileFromFragment(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->cacheProfileFromFragment(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$cacheProfileFromObject(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->cacheProfileFromObject(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$handleFeedItemListFromModel(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->handleFeedItemListFromModel(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$handlePostAwemeModelMessage(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->handlePostAwemeModelMessage(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final cacheCurrentProfileInfo(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "r7d3fbcce43dd94ea"

    .line 2
    .line 3
    const-string v1, "ra2ee991432cf41a5"

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->lastProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move-object v3, v4

    .line 26
    :goto_0
    if-nez v3, :cond_1

    .line 27
    .line 28
    const-string v3, ""

    .line 29
    .line 30
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lux;->ρ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    :cond_2
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    filled-new-array {v2, p1, v4}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots([Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-nez v2, :cond_3

    .line 76
    .line 77
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->scanSupportFragments(Landroid/app/Activity;Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    :cond_3
    if-nez v2, :cond_4

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {v1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->dumpIntent(Landroid/content/Intent;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->dumpShort(Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_4
    invoke-direct {p0, v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->cacheProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :goto_1
    new-instance p1, Leo1;

    .line 124
    .line 125
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    move-object p0, p1

    .line 129
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-eqz p0, :cond_5

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const-string v0, "cache current profile failed reason="

    .line 140
    .line 141
    const-string v1, ": "

    .line 142
    .line 143
    invoke-static {v0, p2, v1, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    const-string p2, "rd1d88829108d0f54"

    .line 148
    .line 149
    invoke-static {p2, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :cond_5
    return-void
.end method

.method private final cacheProfileFromFragment(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "rdd565d77372ce6c2"

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 7
    .line 8
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots([Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->dumpShort(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-direct {p0, v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->cacheProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :goto_0
    new-instance p1, Leo1;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object p0, p1

    .line 66
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-eqz p0, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string v0, "cacheProfileFromFragment error reason="

    .line 77
    .line 78
    const-string v1, ": "

    .line 79
    .line 80
    invoke-static {v0, p2, v1, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string p2, "rd1d88829108d0f54"

    .line 85
    .line 86
    invoke-static {p2, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_2
    return-void
.end method

.method private final cacheProfileFromObject(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "rde1c2d22870506a2"

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->toProfileRecord(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->dumpShort(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-direct {p0, v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->cacheProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :goto_0
    new-instance p1, Leo1;

    .line 57
    .line 58
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object p0, p1

    .line 62
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v0, "cacheProfileFromObject error reason="

    .line 73
    .line 74
    const-string v1, ": "

    .line 75
    .line 76
    invoke-static {v0, p2, v1, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string p2, "rd1d88829108d0f54"

    .line 81
    .line 82
    invoke-static {p2, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    :goto_2
    return-void
.end method

.method private final cacheProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Ljava/lang/String;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-direct/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->isUsableProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "r5def5dd5165d6640"

    .line 16
    .line 17
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "r267e7507c64cc9bc"

    .line 47
    .line 48
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->lastProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    invoke-direct {v0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->isUsableProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_2

    .line 74
    .line 75
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-static {v5, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-nez v5, :cond_2

    .line 84
    .line 85
    invoke-direct/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->profileRecordQuality(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-direct {v0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->profileRecordQuality(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-ge v5, v0, :cond_2

    .line 94
    .line 95
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    new-instance v3, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v4, "r358291efc7784b37"

    .line 106
    .line 107
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_2
    if-eqz v4, :cond_7

    .line 128
    .line 129
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_7

    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_3

    .line 148
    .line 149
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :cond_3
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSignature()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_4

    .line 162
    .line 163
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSignature()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    :cond_4
    move-object v5, v3

    .line 168
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getAvatarUrl()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-eqz v6, :cond_5

    .line 177
    .line 178
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getAvatarUrl()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    :cond_5
    move-object v6, v3

    .line 183
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getGroup()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    if-eqz v7, :cond_6

    .line 192
    .line 193
    invoke-virtual {v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getGroup()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    :cond_6
    move-object v7, v3

    .line 198
    const v20, 0xffc3

    .line 199
    .line 200
    .line 201
    const/16 v21, 0x0

    .line 202
    .line 203
    const/4 v2, 0x0

    .line 204
    const/4 v3, 0x0

    .line 205
    const/4 v8, 0x0

    .line 206
    const-wide/16 v9, 0x0

    .line 207
    .line 208
    const-wide/16 v11, 0x0

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const/4 v14, 0x0

    .line 212
    const/4 v15, 0x0

    .line 213
    const/16 v16, 0x0

    .line 214
    .line 215
    const/16 v17, 0x0

    .line 216
    .line 217
    const/16 v18, 0x0

    .line 218
    .line 219
    const/16 v19, 0x0

    .line 220
    .line 221
    move-object v4, v0

    .line 222
    move-object/from16 v0, p2

    .line 223
    .line 224
    invoke-static/range {v1 .. v21}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->copy$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    goto :goto_0

    .line 229
    :cond_7
    move-object v0, v2

    .line 230
    move-object/from16 v1, p1

    .line 231
    .line 232
    :goto_0
    sput-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->lastProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 233
    .line 234
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    const-string v5, "r97713f23d3913294"

    .line 251
    .line 252
    invoke-static {v5, v0, v2, v3, v4}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-void
.end method

.method private final getStringField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
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
    if-eqz v4, :cond_3

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
    move-result-object p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :cond_2
    return-object p0

    .line 63
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    goto :goto_0

    .line 68
    :cond_4
    move-object p2, p0

    .line 69
    goto :goto_4

    .line 70
    :goto_3
    new-instance p2, Leo1;

    .line 71
    .line 72
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :goto_4
    if-eqz p2, :cond_5

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_5
    move-object p0, p2

    .line 79
    :goto_5
    check-cast p0, Ljava/lang/String;

    .line 80
    .line 81
    return-object p0
.end method

.method private final handleFeedItemListFromModel(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    const-string v0, "rfb9953027d114767"

    .line 2
    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"

    .line 18
    .line 19
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_1
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 32
    .line 33
    invoke-virtual {v1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findAwemeItems(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->resolveProfileRecordFromModelOrList(Ljava/lang/Object;Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-nez p0, :cond_3

    .line 49
    .line 50
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->lastProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 51
    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_4

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->latestAwemeItemsByProfileKey:Ljava/util/concurrent/ConcurrentHashMap;

    .line 67
    .line 68
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 72
    .line 73
    invoke-virtual {p2, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->get(Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    const/4 v3, 0x1

    .line 84
    invoke-virtual {p2, p1, v1, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->updateAwemeSnapshot(Ljava/lang/String;Ljava/util/List;IZ)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 85
    .line 86
    .line 87
    :cond_5
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->displayName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catchall_0
    move-exception p0

    .line 120
    new-instance p1, Leo1;

    .line 121
    .line 122
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-object p0, p1

    .line 126
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    if-eqz p0, :cond_6

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const-string p1, "rbe16a59a180bc89e"

    .line 137
    .line 138
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_6
    :goto_1
    return-void
.end method

.method private final handlePostAwemeModelMessage(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p2, Landroid/os/Message;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Landroid/os/Message;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x0

    .line 9
    :goto_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    iget-object p2, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 13
    .line 14
    if-nez p2, :cond_2

    .line 15
    .line 16
    :goto_1
    return-void

    .line 17
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->handleFeedItemListFromModel(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final hookPostAwemeModel(Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    :try_start_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->POST_AWEME_MODEL:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p0, "r82114919bc8a8f9b"

    .line 12
    .line 13
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string v0, "handleMsg"

    .line 18
    .line 19
    const-class v1, Landroid/os/Message;

    .line 20
    .line 21
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookPostAwemeModel$1$1;

    .line 22
    .line 23
    invoke-direct {v2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookPostAwemeModel$1$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;)V

    .line 24
    .line 25
    .line 26
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p1, v0, v1}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    array-length v1, p1

    .line 46
    const/4 v2, 0x0

    .line 47
    move v3, v2

    .line 48
    :goto_0
    const/4 v4, 0x1

    .line 49
    if-ge v3, v1, :cond_2

    .line 50
    .line 51
    aget-object v5, p1, v3

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const-string v7, "LJJIIJZLJL"

    .line 58
    .line 59
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_1

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    array-length v6, v6

    .line 70
    if-ne v6, v4, :cond_1

    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    aget-object v4, v4, v2

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const-string v6, "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"

    .line 83
    .line 84
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_1

    .line 93
    .line 94
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Ljava/lang/reflect/Method;

    .line 115
    .line 116
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 117
    .line 118
    .line 119
    sget-object v1, Lxq0;->α:Lxq0;

    .line 120
    .line 121
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookPostAwemeModel$1$3$1;

    .line 122
    .line 123
    invoke-direct {v2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookPostAwemeModel$1$3$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v0, v2}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    const-string p0, "r5d0d79ce3c5441a4"

    .line 131
    .line 132
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catchall_0
    move-exception p0

    .line 139
    new-instance p1, Leo1;

    .line 140
    .line 141
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    move-object p0, p1

    .line 145
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-eqz p0, :cond_4

    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const-string v0, "hook PostAwemeModel failed: "

    .line 156
    .line 157
    const-string v1, "rd1d88829108d0f54"

    .line 158
    .line 159
    invoke-static {v0, p1, v1, p0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    :cond_4
    return-void
.end method

.method private final hookProfileFragments(Ljava/lang/ClassLoader;)V
    .locals 12

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->USER_PANDA_FRAGMENT:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->MY_PANDA_FRAGMENT:Ljava/lang/String;

    .line 4
    .line 5
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_9

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 30
    .line 31
    :try_start_0
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    sget-object v3, Ls62;->α:Ls62;

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v2, "re2b7404ba78efdb1"

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :catchall_0
    move-exception v1

    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :cond_1
    :try_start_2
    sget-object v4, Lxq0;->α:Lxq0;

    .line 65
    .line 66
    const-string v5, "onResume"

    .line 67
    .line 68
    new-instance v6, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$1$1;

    .line 69
    .line 70
    invoke-direct {v6, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$1$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Class;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v2, v5, v6}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception v4

    .line 79
    :try_start_3
    new-instance v5, Leo1;

    .line 80
    .line 81
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    move-object v4, v5

    .line 85
    :goto_1
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    if-eqz v4, :cond_2

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    new-instance v6, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v7, "rc2b02f7846ad6b78"

    .line 105
    .line 106
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-static {v4}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 120
    .line 121
    .line 122
    :cond_2
    :try_start_4
    sget-object v4, Lxq0;->α:Lxq0;

    .line 123
    .line 124
    const-string v5, "onViewCreated"

    .line 125
    .line 126
    new-instance v6, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$3$1;

    .line 127
    .line 128
    invoke-direct {v6, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$3$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Class;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v2, v5, v6}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 132
    .line 133
    .line 134
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 135
    goto :goto_2

    .line 136
    :catchall_2
    move-exception v4

    .line 137
    :try_start_5
    new-instance v5, Leo1;

    .line 138
    .line 139
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    move-object v4, v5

    .line 143
    :goto_2
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    if-eqz v4, :cond_3

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    new-instance v6, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    const-string v7, "r4815d50da722bee"

    .line 163
    .line 164
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-static {v4}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 178
    .line 179
    .line 180
    :cond_3
    :try_start_6
    sget-object v4, Lxq0;->α:Lxq0;

    .line 181
    .line 182
    const-string v5, "setUserVisibleHint"

    .line 183
    .line 184
    new-instance v6, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$5$1;

    .line 185
    .line 186
    invoke-direct {v6, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$5$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Class;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v2, v5, v6}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 190
    .line 191
    .line 192
    move-result-object v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 193
    goto :goto_3

    .line 194
    :catchall_3
    move-exception v4

    .line 195
    :try_start_7
    new-instance v5, Leo1;

    .line 196
    .line 197
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    move-object v4, v5

    .line 201
    :goto_3
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    if-eqz v4, :cond_4

    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    new-instance v6, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    const-string v7, "r203990334e4d17f0"

    .line 221
    .line 222
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-static {v4}, Lux;->ρ(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    new-instance v5, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 248
    .line 249
    .line 250
    array-length v6, v4

    .line 251
    const/4 v7, 0x0

    .line 252
    move v8, v7

    .line 253
    :goto_4
    const/4 v9, 0x1

    .line 254
    if-ge v8, v6, :cond_6

    .line 255
    .line 256
    aget-object v10, v4, v8

    .line 257
    .line 258
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    move-result-object v11

    .line 262
    array-length v11, v11

    .line 263
    if-ne v11, v9, :cond_5

    .line 264
    .line 265
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    aget-object v9, v9, v7

    .line 270
    .line 271
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    sget-object v11, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->PROFILE_USER_CLASS:Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {v9, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    if-eqz v9, :cond_5

    .line 282
    .line 283
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    :cond_7
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    if-eqz v5, :cond_8

    .line 298
    .line 299
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    check-cast v5, Ljava/lang/reflect/Method;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 304
    .line 305
    :try_start_8
    invoke-virtual {v5, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 306
    .line 307
    .line 308
    sget-object v6, Lxq0;->α:Lxq0;

    .line 309
    .line 310
    new-instance v7, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$8$1$1;

    .line 311
    .line 312
    invoke-direct {v7, v1, v2, v5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookProfileFragments$1$1$8$1$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v6, v5, v7}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    new-instance v8, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 329
    .line 330
    .line 331
    const-string v10, "ra06b2b8bdd621a68"

    .line 332
    .line 333
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    invoke-static {v6}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 347
    .line 348
    .line 349
    move-object v7, v3

    .line 350
    goto :goto_6

    .line 351
    :catchall_4
    move-exception v6

    .line 352
    :try_start_9
    new-instance v7, Leo1;

    .line 353
    .line 354
    invoke-direct {v7, v6}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 355
    .line 356
    .line 357
    :goto_6
    invoke-static {v7}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    if-eqz v6, :cond_7

    .line 362
    .line 363
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    new-instance v8, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    .line 379
    .line 380
    const-string v10, "rc75b6e7e9328aa23"

    .line 381
    .line 382
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-static {v5}, Lux;->ρ(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    const-string v2, "rb629cd816f460a34"

    .line 408
    .line 409
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-static {v1}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 420
    .line 421
    .line 422
    goto :goto_8

    .line 423
    :goto_7
    new-instance v3, Leo1;

    .line 424
    .line 425
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    :goto_8
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    if-eqz v1, :cond_0

    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    const-string v3, "hook profile fragment failed "

    .line 439
    .line 440
    const-string v4, ": "

    .line 441
    .line 442
    invoke-static {v3, v0, v4, v2}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    const-string v2, "rd1d88829108d0f54"

    .line 447
    .line 448
    invoke-static {v2, v0, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 449
    .line 450
    .line 451
    goto/16 :goto_0

    .line 452
    .line 453
    :cond_9
    return-void
.end method

.method private final hookUserProfileActivity(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->USER_PROFILE_ACTIVITY:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p0, "rbd1f99afa1f7b172"

    .line 12
    .line 13
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object v0, Lxq0;->α:Lxq0;

    .line 18
    .line 19
    const-string v1, "onCreate"

    .line 20
    .line 21
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$1;

    .line 22
    .line 23
    invoke-direct {v2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1, v1, v2}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    const-string v1, "onResume"

    .line 30
    .line 31
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$2;

    .line 32
    .line 33
    invoke-direct {v2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$2;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1, v1, v2}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    const-string v1, "onWindowFocusChanged"

    .line 40
    .line 41
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$3;

    .line 42
    .line 43
    invoke-direct {v2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook$hookUserProfileActivity$1$3;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1, v1, v2}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    const-string p0, "r7e0847cbdaa89875"

    .line 50
    .line 51
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    new-instance p1, Leo1;

    .line 59
    .line 60
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object p0, p1

    .line 64
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v0, "hook UserProfileActivity failed: "

    .line 75
    .line 76
    const-string v1, "rd1d88829108d0f54"

    .line 77
    .line 78
    invoke-static {v0, p1, v1, p0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    return-void
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

.method private final isUsableProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    move v2, v1

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ge v2, v3, :cond_1

    .line 23
    .line 24
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    move p0, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move p0, v0

    .line 40
    :goto_1
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v3, "-1"

    .line 55
    .line 56
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "true"

    .line 67
    .line 68
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_2

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v3, "false"

    .line 79
    .line 80
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_2

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    const/16 v3, 0x8

    .line 95
    .line 96
    if-lt v2, v3, :cond_2

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    move v2, v1

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    :goto_2
    move v2, v0

    .line 102
    :goto_3
    if-eqz p0, :cond_5

    .line 103
    .line 104
    if-eqz v2, :cond_5

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_4

    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_5

    .line 125
    .line 126
    :cond_4
    return v0

    .line 127
    :cond_5
    return v1
.end method

.method private final profileRecordQuality(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    move v1, v0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ge v1, v2, :cond_1

    .line 22
    .line 23
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v0, 0x2

    .line 38
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    const/16 v1, 0x8

    .line 57
    .line 58
    if-lt p0, v1, :cond_3

    .line 59
    .line 60
    add-int/lit8 v0, v0, 0x3

    .line 61
    .line 62
    :cond_3
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_4

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    :cond_4
    return v0
.end method

.method private final resolveProfileRecordFromModelOrList(Ljava/lang/Object;Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "h"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->getStringField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "i"

    .line 12
    .line 13
    invoke-direct {v0, v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->getStringField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    array-length v5, v0

    .line 31
    move v6, v3

    .line 32
    :goto_0
    if-ge v6, v5, :cond_1

    .line 33
    .line 34
    aget-object v7, v0, v6

    .line 35
    .line 36
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    const-string v9, "getUid"

    .line 41
    .line 42
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    array-length v8, v8

    .line 56
    if-nez v8, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_2

    .line 61
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move-object v7, v4

    .line 65
    :goto_1
    if-eqz v7, :cond_2

    .line 66
    .line 67
    move-object/from16 v0, p2

    .line 68
    .line 69
    invoke-virtual {v7, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    move-object v0, v4

    .line 81
    goto :goto_3

    .line 82
    :goto_2
    new-instance v5, Leo1;

    .line 83
    .line 84
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    move-object v0, v5

    .line 88
    :goto_3
    instance-of v5, v0, Leo1;

    .line 89
    .line 90
    if-eqz v5, :cond_3

    .line 91
    .line 92
    move-object v0, v4

    .line 93
    :cond_3
    check-cast v0, Ljava/lang/String;

    .line 94
    .line 95
    const-string v5, ""

    .line 96
    .line 97
    if-nez v0, :cond_4

    .line 98
    .line 99
    move-object v0, v5

    .line 100
    :cond_4
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->lastProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 101
    .line 102
    if-eqz v6, :cond_5

    .line 103
    .line 104
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    goto :goto_4

    .line 109
    :cond_5
    move-object v7, v4

    .line 110
    :goto_4
    if-eqz v6, :cond_6

    .line 111
    .line 112
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    goto :goto_5

    .line 117
    :cond_6
    move-object v8, v4

    .line 118
    :goto_5
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-nez v9, :cond_7

    .line 123
    .line 124
    move-object v10, v0

    .line 125
    goto :goto_b

    .line 126
    :cond_7
    if-eqz v7, :cond_9

    .line 127
    .line 128
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_8
    move-object v10, v7

    .line 136
    goto :goto_b

    .line 137
    :cond_9
    :goto_6
    if-eqz v2, :cond_d

    .line 138
    .line 139
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_a

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_a
    move v0, v3

    .line 147
    :goto_7
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-ge v0, v7, :cond_c

    .line 152
    .line 153
    invoke-interface {v2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    invoke-static {v7}, Ljava/lang/Character;->isDigit(C)Z

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    if-nez v7, :cond_b

    .line 162
    .line 163
    goto :goto_8

    .line 164
    :cond_b
    add-int/lit8 v0, v0, 0x1

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_c
    move-object v10, v2

    .line 168
    goto :goto_b

    .line 169
    :cond_d
    :goto_8
    if-eqz v1, :cond_11

    .line 170
    .line 171
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_e

    .line 176
    .line 177
    goto :goto_a

    .line 178
    :cond_e
    move v0, v3

    .line 179
    :goto_9
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-ge v0, v7, :cond_10

    .line 184
    .line 185
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    invoke-static {v7}, Ljava/lang/Character;->isDigit(C)Z

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    if-nez v7, :cond_f

    .line 194
    .line 195
    goto :goto_a

    .line 196
    :cond_f
    add-int/lit8 v0, v0, 0x1

    .line 197
    .line 198
    goto :goto_9

    .line 199
    :cond_10
    move-object v10, v1

    .line 200
    goto :goto_b

    .line 201
    :cond_11
    :goto_a
    move-object v10, v5

    .line 202
    :goto_b
    if-eqz v8, :cond_13

    .line 203
    .line 204
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_12

    .line 209
    .line 210
    goto :goto_c

    .line 211
    :cond_12
    move-object v11, v8

    .line 212
    goto :goto_11

    .line 213
    :cond_13
    :goto_c
    if-eqz v2, :cond_16

    .line 214
    .line 215
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_14

    .line 220
    .line 221
    goto :goto_e

    .line 222
    :cond_14
    move v0, v3

    .line 223
    :goto_d
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-ge v0, v7, :cond_16

    .line 228
    .line 229
    invoke-interface {v2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    invoke-static {v7}, Ljava/lang/Character;->isDigit(C)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-nez v7, :cond_15

    .line 238
    .line 239
    move-object v11, v2

    .line 240
    goto :goto_11

    .line 241
    :cond_15
    add-int/lit8 v0, v0, 0x1

    .line 242
    .line 243
    goto :goto_d

    .line 244
    :cond_16
    :goto_e
    if-eqz v1, :cond_19

    .line 245
    .line 246
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-eqz v0, :cond_17

    .line 251
    .line 252
    goto :goto_10

    .line 253
    :cond_17
    :goto_f
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-ge v3, v0, :cond_19

    .line 258
    .line 259
    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-nez v0, :cond_18

    .line 268
    .line 269
    move-object v11, v1

    .line 270
    goto :goto_11

    .line 271
    :cond_18
    add-int/lit8 v3, v3, 0x1

    .line 272
    .line 273
    goto :goto_f

    .line 274
    :cond_19
    :goto_10
    move-object v11, v5

    .line 275
    :goto_11
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_1a

    .line 280
    .line 281
    invoke-static {v11}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_1a

    .line 286
    .line 287
    return-object v4

    .line 288
    :cond_1a
    new-instance v9, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 289
    .line 290
    if-eqz v6, :cond_1b

    .line 291
    .line 292
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    goto :goto_12

    .line 297
    :cond_1b
    move-object v0, v4

    .line 298
    :goto_12
    if-nez v0, :cond_1c

    .line 299
    .line 300
    move-object v12, v5

    .line 301
    goto :goto_13

    .line 302
    :cond_1c
    move-object v12, v0

    .line 303
    :goto_13
    if-eqz v6, :cond_1d

    .line 304
    .line 305
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSignature()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    goto :goto_14

    .line 310
    :cond_1d
    move-object v0, v4

    .line 311
    :goto_14
    if-nez v0, :cond_1e

    .line 312
    .line 313
    move-object v13, v5

    .line 314
    goto :goto_15

    .line 315
    :cond_1e
    move-object v13, v0

    .line 316
    :goto_15
    if-eqz v6, :cond_1f

    .line 317
    .line 318
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getAvatarUrl()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    goto :goto_16

    .line 323
    :cond_1f
    move-object v0, v4

    .line 324
    :goto_16
    if-nez v0, :cond_20

    .line 325
    .line 326
    move-object v14, v5

    .line 327
    goto :goto_17

    .line 328
    :cond_20
    move-object v14, v0

    .line 329
    :goto_17
    if-eqz v6, :cond_21

    .line 330
    .line 331
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getGroup()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    :cond_21
    if-nez v4, :cond_22

    .line 336
    .line 337
    move-object v15, v5

    .line 338
    goto :goto_18

    .line 339
    :cond_22
    move-object v15, v4

    .line 340
    :goto_18
    const v28, 0xffc0

    .line 341
    .line 342
    .line 343
    const/16 v29, 0x0

    .line 344
    .line 345
    const/16 v16, 0x0

    .line 346
    .line 347
    const-wide/16 v17, 0x0

    .line 348
    .line 349
    const-wide/16 v19, 0x0

    .line 350
    .line 351
    const/16 v21, 0x0

    .line 352
    .line 353
    const/16 v22, 0x0

    .line 354
    .line 355
    const/16 v23, 0x0

    .line 356
    .line 357
    const/16 v24, 0x0

    .line 358
    .line 359
    const/16 v25, 0x0

    .line 360
    .line 361
    const/16 v26, 0x0

    .line 362
    .line 363
    const/16 v27, 0x0

    .line 364
    .line 365
    invoke-direct/range {v9 .. v29}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILzq;)V

    .line 366
    .line 367
    .line 368
    return-object v9
.end method

.method private final scanFragmentManager(Ljava/lang/Object;Ljava/lang/String;ILjava/util/IdentityHashMap;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x4

    .line 6
    if-le p3, v1, :cond_1

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_1
    invoke-virtual {p4, p1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-interface {p4, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :try_start_0
    const-string v1, "getFragments"

    .line 22
    .line 23
    invoke-direct {p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v1, p1, Ljava/util/List;

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    move-object p1, v0

    .line 37
    goto :goto_1

    .line 38
    :goto_0
    new-instance v1, Leo1;

    .line 39
    .line 40
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    move-object p1, v1

    .line 44
    :goto_1
    instance-of v1, p1, Leo1;

    .line 45
    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    move-object p1, v0

    .line 49
    :cond_4
    check-cast p1, Ljava/util/List;

    .line 50
    .line 51
    if-nez p1, :cond_5

    .line 52
    .line 53
    sget-object p1, Ljz;->ε:Ljz;

    .line 54
    .line 55
    :cond_5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_8

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    invoke-virtual {p4, v1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_6

    .line 76
    .line 77
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-interface {p4, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 83
    .line 84
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots([Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_7

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance p3, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string p4, "rf10cad313c61db93"

    .line 109
    .line 110
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v2

    .line 130
    :cond_7
    const-string v2, "getChildFragmentManager"

    .line 131
    .line 132
    invoke-direct {p0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    add-int/lit8 v2, p3, 0x1

    .line 137
    .line 138
    invoke-direct {p0, v1, p2, v2, p4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->scanFragmentManager(Ljava/lang/Object;Ljava/lang/String;ILjava/util/IdentityHashMap;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    if-eqz v1, :cond_6

    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_8
    return-object v0
.end method

.method private final scanSupportFragments(Landroid/app/Activity;Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "getSupportFragmentManager"

    .line 3
    .line 4
    invoke-direct {p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    move-object p0, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {p0, p1, p2, v2, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->scanFragmentManager(Ljava/lang/Object;Ljava/lang/String;ILjava/util/IdentityHashMap;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    new-instance p1, Leo1;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object p0, p1

    .line 30
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v1, "r89361a1d24f363b3"

    .line 41
    .line 42
    invoke-static {v1, p2, p1}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    instance-of p1, p0, Leo1;

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object v0, p0

    .line 51
    :goto_1
    check-cast v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 52
    .line 53
    return-object v0
.end method

.method public static synthetic toggleCurrentProfileBookmark$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;Landroid/app/Activity;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-string p2, ""

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->toggleCurrentProfileBookmark(Landroid/app/Activity;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final toggleProfileBookmark$lambda$52(Ljava/lang/String;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Ls62;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 5
    .line 6
    invoke-virtual {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->add(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 7
    .line 8
    .line 9
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->latestAwemeItemsByProfileKey:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/util/List;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    sget-object v1, Ljz;->ε:Ljz;

    .line 20
    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v0, p0, v1, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->updateAwemeSnapshot(Ljava/lang/String;Ljava/util/List;IZ)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->markRead(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getGroup()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance p2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v0, "\u5df2\u6dfb\u52a0\u4e3b\u9875\u4e66\u7b7e ["

    .line 45
    .line 46
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, "]"

    .line 53
    .line 54
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p1, p0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 66
    .line 67
    .line 68
    sget-object p0, Ls62;->α:Ls62;

    .line 69
    .line 70
    return-object p0
.end method

.method public static synthetic α(Ljava/lang/String;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->toggleProfileBookmark$lambda$52(Ljava/lang/String;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final getLastProfileRecord()Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 0

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->lastProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLatestAwemeItems(Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->latestAwemeItemsByProfileKey:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    sget-object p0, Ljz;->ε:Ljz;

    .line 15
    .line 16
    :cond_0
    return-object p0
.end method

.method public final init(Landroid/content/Context;Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p1, v0

    .line 15
    :goto_0
    sput-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->appContext:Landroid/content/Context;

    .line 16
    .line 17
    sput-object p2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->hostClassLoader:Ljava/lang/ClassLoader;

    .line 18
    .line 19
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 20
    .line 21
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->appContext:Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->init(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;

    .line 30
    .line 31
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->appContext:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->init(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->installed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-direct {p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->hookUserProfileActivity(Ljava/lang/ClassLoader;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->hookProfileFragments(Ljava/lang/ClassLoader;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->hookPostAwemeModel(Ljava/lang/ClassLoader;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final toggleCurrentProfileBookmark(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 24

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
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->lastProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-nez v3, :cond_1

    .line 22
    .line 23
    const-string v3, ""

    .line 24
    .line 25
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const-string v5, "rfb641bf00383e452"

    .line 34
    .line 35
    invoke-static {v5, v3, v4}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    :goto_1
    move-object v3, v2

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    :goto_2
    const-string v2, "toggleCurrentProfileBookmark"

    .line 54
    .line 55
    invoke-direct {v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->cacheCurrentProfileInfo(Landroid/app/Activity;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->lastProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :goto_3
    if-eqz v3, :cond_6

    .line 62
    .line 63
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_4
    invoke-static/range {p2 .. p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_5

    .line 79
    .line 80
    const v22, 0xffdf

    .line 81
    .line 82
    .line 83
    const/16 v23, 0x0

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v6, 0x0

    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v8, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const-wide/16 v11, 0x0

    .line 92
    .line 93
    const-wide/16 v13, 0x0

    .line 94
    .line 95
    const/4 v15, 0x0

    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    const/16 v18, 0x0

    .line 101
    .line 102
    const/16 v19, 0x0

    .line 103
    .line 104
    const/16 v20, 0x0

    .line 105
    .line 106
    const/16 v21, 0x0

    .line 107
    .line 108
    move-object/from16 v9, p2

    .line 109
    .line 110
    invoke-static/range {v3 .. v23}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->copy$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    :cond_5
    invoke-virtual {v0, v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->toggleProfileBookmark(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_6
    :goto_4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 119
    .line 120
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->dumpIntent(Landroid/content/Intent;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->dumpShort(Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v3, "r230ae7157611e050"

    .line 133
    .line 134
    invoke-static {v3, v2, v0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string v0, "\u672a\u8bc6\u522b\u5230\u5f53\u524d\u4e3b\u9875\u4fe1\u606f\uff0c\u8bf7\u7a0d\u7b49\u4e3b\u9875\u52a0\u8f7d\u5b8c\u6210\u540e\u91cd\u8bd5"

    .line 138
    .line 139
    const/4 v2, 0x0

    .line 140
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public final toggleProfileBookmark(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    :cond_0
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->init(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->isUsableProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    const-string p0, "\u672a\u8bc6\u522b\u5230\u4f5c\u54c1\u4f5c\u8005\u4e3b\u9875\u4fe1\u606f"

    .line 27
    .line 28
    invoke-static {p1, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 33
    .line 34
    .line 35
    new-instance p0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string p1, "rada9d489d707677d"

    .line 38
    .line 39
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->get(Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->remove(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    const-string p0, "\u5df2\u53d6\u6d88\u4e3b\u9875\u4e66\u7b7e"

    .line 67
    .line 68
    invoke-static {p1, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;

    .line 77
    .line 78
    new-instance v1, Lfj1;

    .line 79
    .line 80
    invoke-direct {v1, p0, p1}, Lfj1;-><init>(Ljava/lang/String;Landroid/app/Activity;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, p1, p2, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;-><init>(Landroid/content/Context;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;La80;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->show()V

    .line 87
    .line 88
    .line 89
    return-void
.end method

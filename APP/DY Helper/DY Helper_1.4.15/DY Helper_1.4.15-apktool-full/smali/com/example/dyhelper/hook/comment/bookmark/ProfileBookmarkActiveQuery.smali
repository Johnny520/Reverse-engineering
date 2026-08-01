.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;

.field private static final TAG:Ljava/lang/String; = "r2ac997fa1bc77e34"

.field private static volatile appContext:Landroid/content/Context;

.field private static final executor:Ljava/util/concurrent/ExecutorService;

.field private static volatile hostClassLoader:Ljava/lang/ClassLoader;

.field private static final inFlight:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;

    .line 7
    .line 8
    new-instance v0, Laj;

    .line 9
    .line 10
    const/16 v1, 0x11

    .line 11
    .line 12
    invoke-direct {v0, v1}, Laj;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->executor:Ljava/util/concurrent/ExecutorService;

    .line 20
    .line 21
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->inFlight:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    const/16 v0, 0x8

    .line 30
    .line 31
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->$stable:I

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

.method private static final executor$lambda$1(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    const-string v0, "r2ac997fa1bc77e34"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Lnx;->σ(Ljava/lang/Runnable;Ljava/lang/String;Z)Ljava/lang/Thread;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public static synthetic queryAll$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;Landroid/app/Activity;La80;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance p2, Lli1;

    .line 6
    .line 7
    const/4 p3, 0x4

    .line 8
    invoke-direct {p2, p3}, Lli1;-><init>(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->queryAll(Landroid/app/Activity;La80;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final queryAll$lambda$2(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;)Ls62;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ls62;->α:Ls62;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final queryAll$lambda$4(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->querySnapshot(Ljava/lang/ClassLoader;Ljava/util/List;Z)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance p1, Ljg1;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-direct {p1, p2, p0, p3, v0}, Ljg1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static final queryAll$lambda$4$lambda$3(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;La80;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->inFlight:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;->toastText()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static synthetic α(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->queryAll$lambda$2(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic β(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->queryAll$lambda$4(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic γ(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->executor$lambda$1(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic δ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;La80;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->queryAll$lambda$4$lambda$3(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;La80;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final init(Landroid/content/Context;Ljava/lang/ClassLoader;)V
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
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p1, p0

    .line 15
    :goto_0
    sput-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->appContext:Landroid/content/Context;

    .line 16
    .line 17
    sput-object p2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->hostClassLoader:Ljava/lang/ClassLoader;

    .line 18
    .line 19
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 20
    .line 21
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->appContext:Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->init(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;

    .line 30
    .line 31
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->appContext:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->init(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final queryAll(Landroid/app/Activity;La80;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "La80;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->hostClassLoader:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    move-object v1, p0

    .line 16
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->inFlight:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-string p0, "\u6b63\u5728\u67e5\u8be2\u4e3b\u9875\u4e66\u7b7e\uff0c\u8bf7\u7a0d\u5019"

    .line 27
    .line 28
    invoke-static {p1, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->all()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 49
    .line 50
    .line 51
    const-string p0, "\u6682\u65e0\u4e3b\u9875\u4e66\u7b7e"

    .line 52
    .line 53
    invoke-static {p1, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 58
    .line 59
    .line 60
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;

    .line 61
    .line 62
    invoke-direct {p0, v2, v2, v2, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;-><init>(IIII)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p2, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    const-string p0, "\u5f00\u59cb\u67e5\u8be2\u4e3b\u9875\u4e66\u7b7e"

    .line 70
    .line 71
    invoke-static {p1, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->executor:Ljava/util/concurrent/ExecutorService;

    .line 79
    .line 80
    move-object v2, v0

    .line 81
    new-instance v0, Lnj;

    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    move-object v3, p1

    .line 85
    move-object v4, p2

    .line 86
    invoke-direct/range {v0 .. v5}, Lnj;-><init>(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;I)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final querySnapshot(Ljava/lang/ClassLoader;Ljava/util/List;Z)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;",
            ">;Z)",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;"
        }
    .end annotation

    .line 1
    const-string v1, ", key="

    .line 2
    .line 3
    const-string v2, "r2ac997fa1bc77e34"

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const/4 v4, 0x0

    .line 16
    move v5, v4

    .line 17
    move v6, v5

    .line 18
    move v7, v6

    .line 19
    :catchall_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    move-object v10, v0

    .line 30
    check-cast v10, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 31
    .line 32
    :try_start_0
    sget-object v8, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;

    .line 33
    .line 34
    const/16 v17, 0x78

    .line 35
    .line 36
    const/16 v18, 0x0

    .line 37
    .line 38
    const/16 v11, 0x14

    .line 39
    .line 40
    const-wide/16 v12, 0x0

    .line 41
    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v15, 0x0

    .line 44
    const/16 v16, 0x0

    .line 45
    .line 46
    move-object/from16 v9, p1

    .line 47
    .line 48
    invoke-static/range {v8 .. v18}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->loadProfileAwemeList$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;IJILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    sget-object v8, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 55
    .line 56
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getItems()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getTotalCount()I

    .line 65
    .line 66
    .line 67
    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 68
    move/from16 v13, p3

    .line 69
    .line 70
    :try_start_1
    invoke-virtual {v8, v9, v11, v12, v13}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->updateAwemeSnapshot(Ljava/lang/String;Ljava/util/List;IZ)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    add-int/lit8 v5, v5, 0x1

    .line 75
    .line 76
    if-eqz v8, :cond_0

    .line 77
    .line 78
    add-int/lit8 v6, v6, 0x1

    .line 79
    .line 80
    :cond_0
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->displayName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getItems()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v8, :cond_1

    .line 97
    .line 98
    const/4 v8, 0x1

    .line 99
    goto :goto_1

    .line 100
    :cond_1
    move v8, v4

    .line 101
    :goto_1
    new-instance v12, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v14, "queried profile="

    .line 107
    .line 108
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v9, ", items="

    .line 121
    .line 122
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v0, ", changed="

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const/4 v8, 0x4

    .line 141
    const/4 v9, 0x0

    .line 142
    invoke-static {v2, v0, v9, v8, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v0, Ls62;->α:Ls62;

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :catchall_1
    move-exception v0

    .line 149
    goto :goto_2

    .line 150
    :catchall_2
    move-exception v0

    .line 151
    move/from16 v13, p3

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_2
    move/from16 v13, p3

    .line 155
    .line 156
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 157
    .line 158
    const-string v8, "loadProfileAwemeList returns null"

    .line 159
    .line 160
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    :goto_2
    new-instance v8, Leo1;

    .line 165
    .line 166
    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    move-object v0, v8

    .line 170
    :goto_3
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-eqz v0, :cond_3

    .line 175
    .line 176
    add-int/lit8 v7, v7, 0x1

    .line 177
    .line 178
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->displayName()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    const-string v10, "query failed profile="

    .line 187
    .line 188
    invoke-static {v10, v8, v1, v9}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-static {v2, v8, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    :cond_3
    const-wide/16 v8, 0xb4

    .line 196
    .line 197
    :try_start_2
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 198
    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_4
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;

    .line 203
    .line 204
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    invoke-direct {v0, v1, v5, v6, v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;-><init>(IIII)V

    .line 209
    .line 210
    .line 211
    return-object v0
.end method

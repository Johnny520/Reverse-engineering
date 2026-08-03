.class public LYue/ۥ۠ۢۦ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;
    }
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۣ۠ۨۨ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e3\u06e8<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟:Ljava/util/concurrent/ExecutorService;

.field public static final ۥ۟۟:Ljava/lang/Object;

.field public static final ۥ۟۟۟:LYue/ۥۢ۟ۡ;
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "LOCK"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e0\u06e2\u06e6\u06df$\u06e5\u06df\u06df\u06df\u06df;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥۣ۠ۨۨ;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, LYue/ۥۣ۠ۨۨ;-><init>(I)V

    sput-object v0, LYue/ۥ۠ۢۦ۟;->ۥ:LYue/ۥۣ۠ۨۨ;

    const/16 v0, 0xa

    const/16 v1, 0x2710

    const-string v2, "fonts-androidx"

    invoke-static {v2, v0, v1}, LYue/ۥۡۦۥ۟;->ۥ(Ljava/lang/String;II)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۢۦ۟;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LYue/ۥ۠ۢۦ۟;->ۥ۟۟:Ljava/lang/Object;

    new-instance v0, LYue/ۥۢ۟ۡ;

    invoke-direct {v0}, LYue/ۥۢ۟ۡ;-><init>()V

    sput-object v0, LYue/ۥ۠ۢۦ۟;->ۥ۟۟۟:LYue/ۥۢ۟ۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(LYue/ۥ۠ۢۥۧ;I)Ljava/lang/String;
    .locals 1
    .param p0    # LYue/ۥ۠ۢۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LYue/ۥ۠ۢۥۧ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "-"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(LYue/ۥ۠ۢۦۢ$ۥ۟;)I
    .locals 5
    .param p0    # LYue/ۥ۠ۢۦۢ$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۢۦۢ$ۥ۟;->ۥ۟۟()I

    move-result v0

    const/4 v1, -0x3

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥ۠ۢۦۢ$ۥ۟;->ۥ۟۟()I

    move-result p0

    if-eq p0, v2, :cond_0

    return v1

    :cond_0
    const/4 p0, -0x2

    return p0

    :cond_1
    invoke-virtual {p0}, LYue/ۥ۠ۢۦۢ$ۥ۟;->ۥ۟()[LYue/ۥ۠ۢۦۢ$ۥ۟۟;

    move-result-object p0

    if-eqz p0, :cond_5

    array-length v0, p0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    array-length v0, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_5

    aget-object v4, p0, v3

    invoke-virtual {v4}, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟()I

    move-result v4

    if-eqz v4, :cond_4

    if-gez v4, :cond_3

    goto :goto_1

    :cond_3
    move v1, v4

    :goto_1
    return v1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    return v2
.end method

.method public static ۥ۟۟(Ljava/lang/String;Landroid/content/Context;LYue/ۥ۠ۢۥۧ;I)LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۢۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, LYue/ۥ۠ۢۦ۟;->ۥ:LYue/ۥۣ۠ۨۨ;

    invoke-virtual {v0, p0}, LYue/ۥۣ۠ۨۨ;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    invoke-direct {p0, v1}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1, p2, v1}, LYue/ۥ۠ۢۥۦ;->ۥ۟۟۟۟(Landroid/content/Context;LYue/ۥ۠ۢۥۧ;Landroid/os/CancellationSignal;)LYue/ۥ۠ۢۦۢ$ۥ۟;

    move-result-object p2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p2}, LYue/ۥ۠ۢۦ۟;->ۥ۟(LYue/ۥ۠ۢۦۢ$ۥ۟;)I

    move-result v2

    if-eqz v2, :cond_1

    new-instance p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    invoke-direct {p0, v2}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;-><init>(I)V

    return-object p0

    :cond_1
    invoke-virtual {p2}, LYue/ۥ۠ۢۦۢ$ۥ۟;->ۥ۟()[LYue/ۥ۠ۢۦۢ$ۥ۟۟;

    move-result-object p2

    invoke-static {p1, v1, p2, p3}, LYue/ۥۣۢۢۨ;->ۥ۟۟۟(Landroid/content/Context;Landroid/os/CancellationSignal;[LYue/ۥ۠ۢۦۢ$ۥ۟۟;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p0, p1}, LYue/ۥۣ۠ۨۨ;->ۥ۟۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    :cond_2
    new-instance p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    const/4 p1, -0x3

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;-><init>(I)V

    return-object p0

    :catch_0
    new-instance p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    const/4 p1, -0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;-><init>(I)V

    return-object p0
.end method

.method public static ۥ۟۟۟(Landroid/content/Context;LYue/ۥ۠ۢۥۧ;ILjava/util/concurrent/Executor;LYue/ۥۣ۟ۧ۟;)Landroid/graphics/Typeface;
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۠ۢۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۟ۧ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p1, p2}, LYue/ۥ۠ۢۦ۟;->ۥ(LYue/ۥ۠ۢۥۧ;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LYue/ۥ۠ۢۦ۟;->ۥ:LYue/ۥۣ۠ۨۨ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۠ۨۨ;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    invoke-direct {p0, v1}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p4, p0}, LYue/ۥۣ۟ۧ۟;->ۥ۟(LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;)V

    return-object v1

    :cond_0
    new-instance v1, LYue/ۥ۠ۢۦ۟$ۥ۟;

    invoke-direct {v1, p4}, LYue/ۥ۠ۢۦ۟$ۥ۟;-><init>(LYue/ۥۣ۟ۧ۟;)V

    sget-object p4, LYue/ۥ۠ۢۦ۟;->ۥ۟۟:Ljava/lang/Object;

    monitor-enter p4

    :try_start_0
    sget-object v2, LYue/ۥ۠ۢۦ۟;->ۥ۟۟۟:LYue/ۥۢ۟ۡ;

    invoke-virtual {v2, v0}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p4

    return-object v4

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v0, v3}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p4, LYue/ۥ۠ۢۦ۟$ۥ۟۟;

    invoke-direct {p4, v0, p0, p1, p2}, LYue/ۥ۠ۢۦ۟$ۥ۟۟;-><init>(Ljava/lang/String;Landroid/content/Context;LYue/ۥ۠ۢۥۧ;I)V

    if-nez p3, :cond_2

    sget-object p3, LYue/ۥ۠ۢۦ۟;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    :cond_2
    new-instance p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟;

    invoke-direct {p0, v0}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟;-><init>(Ljava/lang/String;)V

    invoke-static {p3, p4, p0}, LYue/ۥۡۦۥ۟;->ۥ۟۟(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;LYue/ۥ۟ۧ۠ۧ;)V

    return-object v4

    :goto_0
    :try_start_1
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟۟۟(Landroid/content/Context;LYue/ۥ۠ۢۥۧ;LYue/ۥۣ۟ۧ۟;II)Landroid/graphics/Typeface;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۠ۢۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۟ۧ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p1, p3}, LYue/ۥ۠ۢۦ۟;->ۥ(LYue/ۥ۠ۢۥۧ;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LYue/ۥ۠ۢۦ۟;->ۥ:LYue/ۥۣ۠ۨۨ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۠ۨۨ;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    invoke-direct {p0, v1}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p2, p0}, LYue/ۥۣ۟ۧ۟;->ۥ۟(LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;)V

    return-object v1

    :cond_0
    const/4 v1, -0x1

    if-ne p4, v1, :cond_1

    invoke-static {v0, p0, p1, p3}, LYue/ۥ۠ۢۦ۟;->ۥ۟۟(Ljava/lang/String;Landroid/content/Context;LYue/ۥ۠ۢۥۧ;I)LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    move-result-object p0

    invoke-virtual {p2, p0}, LYue/ۥۣ۟ۧ۟;->ۥ۟(LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;)V

    iget-object p0, p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Typeface;

    return-object p0

    :cond_1
    new-instance v1, LYue/ۥ۠ۢۦ۟$ۥ;

    invoke-direct {v1, v0, p0, p1, p3}, LYue/ۥ۠ۢۦ۟$ۥ;-><init>(Ljava/lang/String;Landroid/content/Context;LYue/ۥ۠ۢۥۧ;I)V

    :try_start_0
    sget-object p0, LYue/ۥ۠ۢۦ۟;->ۥ۟:Ljava/util/concurrent/ExecutorService;

    invoke-static {p0, v1, p4}, LYue/ۥۡۦۥ۟;->ۥ۟۟۟(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Callable;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    invoke-virtual {p2, p0}, LYue/ۥۣ۟ۧ۟;->ۥ۟(LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;)V

    iget-object p0, p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    const/4 p1, -0x3

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;-><init>(I)V

    invoke-virtual {p2, p0}, LYue/ۥۣ۟ۧ۟;->ۥ۟(LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۥ۟۟۟۠()V
    .locals 1

    sget-object v0, LYue/ۥ۠ۢۦ۟;->ۥ:LYue/ۥۣ۠ۨۨ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۨۨ;->ۥ۟۟۟()V

    return-void
.end method

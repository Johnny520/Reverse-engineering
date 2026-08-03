.class public final LYue/ۥۡۡۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:LYue/ۥ۠۠ۧۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟۠:LYue/ۥ۠۠ۧۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "LOCK_FAIL"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥۡۡۨ;->ۥ:LYue/ۥۢ۠ۦۢ;

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "UNLOCK_FAIL"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥۡۡۨ;->ۥ۟:LYue/ۥۢ۠ۦۢ;

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "LOCKED"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥۡۡۨ;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    new-instance v1, LYue/ۥۢ۠ۦۢ;

    const-string v2, "UNLOCKED"

    invoke-direct {v1, v2}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v1, LYue/ۥۡۡۨ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    new-instance v2, LYue/ۥ۠۠ۧۤ;

    invoke-direct {v2, v0}, LYue/ۥ۠۠ۧۤ;-><init>(Ljava/lang/Object;)V

    sput-object v2, LYue/ۥۡۡۨ;->ۥ۟۟۟۟:LYue/ۥ۠۠ۧۤ;

    new-instance v0, LYue/ۥ۠۠ۧۤ;

    invoke-direct {v0, v1}, LYue/ۥ۠۠ۧۤ;-><init>(Ljava/lang/Object;)V

    sput-object v0, LYue/ۥۡۡۨ;->ۥ۟۟۟۠:LYue/ۥ۠۠ۧۤ;

    return-void
.end method

.method public static final ۥ(Z)LYue/ۥۡۡۧۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۡۡۧۨ;

    invoke-direct {v0, p0}, LYue/ۥۡۡۧۨ;-><init>(Z)V

    return-object v0
.end method

.method public static synthetic ۥ۟(ZILjava/lang/Object;)LYue/ۥۡۡۧۧ;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LYue/ۥۡۡۨ;->ۥ(Z)LYue/ۥۡۡۧۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟()LYue/ۥ۠۠ۧۤ;
    .locals 1

    sget-object v0, LYue/ۥۡۡۨ;->ۥ۟۟۟۟:LYue/ۥ۠۠ۧۤ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟()LYue/ۥ۠۠ۧۤ;
    .locals 1

    sget-object v0, LYue/ۥۡۡۨ;->ۥ۟۟۟۠:LYue/ۥ۠۠ۧۤ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟۟()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥۡۡۨ;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟۠()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥۡۡۨ;->ۥ:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟ۡ()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥۡۡۨ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟ۢ()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥۡۡۨ;->ۥ۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static synthetic ۥۣ۟۟۟()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۤ()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۥ()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۦ()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۧ()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۨ()V
    .locals 0

    return-void
.end method

.method public static final ۥ۟۟۠(LYue/ۥۡۡۧۧ;Ljava/lang/Object;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۡۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e1\u06e7\u06e7;",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, LYue/ۥۡۡۨ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LYue/ۥۡۡۨ$ۥ;

    iget v1, v0, LYue/ۥۡۡۨ$ۥ;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۡۡۨ$ۥ;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۡۡۨ$ۥ;

    invoke-direct {v0, p3}, LYue/ۥۡۡۨ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p3, v0, LYue/ۥۡۡۨ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۡۡۨ$ۥ;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۡۡۨ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, LYue/ۥۣ۠۠ۨ;

    iget-object p1, v0, LYue/ۥۡۡۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iget-object p0, v0, LYue/ۥۡۡۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۡۧۧ;

    invoke-static {p3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iput-object p0, v0, LYue/ۥۡۡۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۡۡۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۡۡۨ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۡۡۨ$ۥ;->ۥ۟۟۠ۧ:I

    invoke-interface {p0, p1, v0}, LYue/ۥۡۡۧۧ;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    :try_start_0
    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0, p1}, LYue/ۥۡۡۧۧ;->ۥ۟۟۟(Ljava/lang/Object;)V

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0, p1}, LYue/ۥۡۡۧۧ;->ۥ۟۟۟(Ljava/lang/Object;)V

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p2
.end method

.method public static final ۥ۟۟۠۟(LYue/ۥۡۡۧۧ;Ljava/lang/Object;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e1\u06e7\u06e7;",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-interface {p0, p1, p3}, LYue/ۥۡۡۧۧ;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    const/4 p3, 0x1

    invoke-static {p3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    :try_start_0
    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0, p1}, LYue/ۥۡۡۧۧ;->ۥ۟۟۟(Ljava/lang/Object;)V

    invoke-static {p3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-static {p3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0, p1}, LYue/ۥۡۡۧۧ;->ۥ۟۟۟(Ljava/lang/Object;)V

    invoke-static {p3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p2
.end method

.method public static synthetic ۥ۟۟۠۠(LYue/ۥۡۡۧۧ;Ljava/lang/Object;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p5, 0x1

    and-int/2addr p4, p5

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    const/4 p4, 0x0

    invoke-static {p4}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-interface {p0, p1, p3}, LYue/ۥۡۡۧۧ;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    invoke-static {p5}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    :try_start_0
    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p5}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0, p1}, LYue/ۥۡۡۧۧ;->ۥ۟۟۟(Ljava/lang/Object;)V

    invoke-static {p5}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-static {p5}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0, p1}, LYue/ۥۡۡۧۧ;->ۥ۟۟۟(Ljava/lang/Object;)V

    invoke-static {p5}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p2
.end method

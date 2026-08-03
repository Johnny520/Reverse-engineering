.class public final LYue/ۥۡۨ۟ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:I

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

.field public static final ۥ۟۟۟۟:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟۠:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/16 v4, 0xc

    const/4 v5, 0x0

    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LYue/ۥۢ۠ۧ۟;->ۥ۟۟۟۠(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LYue/ۥۡۨ۟ۥ;->ۥ:I

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "PERMIT"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥۡۨ۟ۥ;->ۥ۟:LYue/ۥۢ۠ۦۢ;

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "TAKEN"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥۡۨ۟ۥ;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "BROKEN"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟۟:LYue/ۥۢ۠ۦۢ;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LYue/ۥۢ۠ۧ۟;->ۥ۟۟۟۠(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟۠:I

    return-void
.end method

.method public static final ۥ(II)LYue/ۥۣۡۨ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۡۨ۟ۤ;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۨ۟ۤ;-><init>(II)V

    return-object v0
.end method

.method public static synthetic ۥ۟(IIILjava/lang/Object;)LYue/ۥۣۡۨ۟;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥۡۨ۟ۥ;->ۥ(II)LYue/ۥۣۡۨ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟(JLYue/ۥۡۨ۟ۦ;)LYue/ۥۡۨ۟ۦ;
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟ۤ(JLYue/ۥۡۨ۟ۦ;)LYue/ۥۡۨ۟ۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟۟()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟۠()I
    .locals 1

    sget v0, LYue/ۥۡۨ۟ۥ;->ۥ:I

    return v0
.end method

.method public static final synthetic ۥ۟۟۟ۡ()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥۡۨ۟ۥ;->ۥ۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟ۢ()I
    .locals 1

    sget v0, LYue/ۥۡۨ۟ۥ;->ۥ۟۟۟۠:I

    return v0
.end method

.method public static final synthetic ۥۣ۟۟۟()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥۡۨ۟ۥ;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final ۥ۟۟۟ۤ(JLYue/ۥۡۨ۟ۦ;)LYue/ۥۡۨ۟ۦ;
    .locals 2

    new-instance v0, LYue/ۥۡۨ۟ۦ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, LYue/ۥۡۨ۟ۦ;-><init>(JLYue/ۥۡۨ۟ۦ;I)V

    return-object v0
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

.method public static synthetic ۥ۟۟۠()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ۟۟۠۟()V
    .locals 0

    return-void
.end method

.method public static final ۥ۟۟۠۠(LYue/ۥۣۡۨ۟;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۣۡۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
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
            "LYue/\u06e5\u06e1\u06e8\u06df\u06e3;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥۡۨ۟ۥ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۡۨ۟ۥ$ۥ;

    iget v1, v0, LYue/ۥۡۨ۟ۥ$ۥ;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۡۨ۟ۥ$ۥ;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۡۨ۟ۥ$ۥ;

    invoke-direct {v0, p2}, LYue/ۥۡۨ۟ۥ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۡۨ۟ۥ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۡۨ۟ۥ$ۥ;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۡۨ۟ۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LYue/ۥۣ۠۠ۨ;

    iget-object p0, v0, LYue/ۥۡۨ۟ۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۣۡۨ۟;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iput-object p0, v0, LYue/ۥۡۨ۟ۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۡۨ۟ۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۡۨ۟ۥ$ۥ;->ۥ۟۟۠ۦ:I

    invoke-interface {p0, v0}, LYue/ۥۣۡۨ۟;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    :try_start_0
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0}, LYue/ۥۣۡۨ۟;->release()V

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0}, LYue/ۥۣۡۨ۟;->release()V

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method

.method public static final ۥ۟۟۠ۡ(LYue/ۥۣۡۨ۟;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06df\u06e3;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-interface {p0, p2}, LYue/ۥۣۡۨ۟;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    :try_start_0
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0}, LYue/ۥۣۡۨ۟;->release()V

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-interface {p0}, LYue/ۥۣۡۨ۟;->release()V

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method

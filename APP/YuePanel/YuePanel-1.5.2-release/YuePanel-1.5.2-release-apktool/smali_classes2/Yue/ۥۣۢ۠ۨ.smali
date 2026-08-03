.class public final LYue/ۥۣۢ۠ۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,426:1\n329#2:427\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n417#1:427\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۠ۢ;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۢ۠ۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    iput-object p2, p0, LYue/ۥۣۢ۠ۨ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۢ;

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥۣۢ۠ۨ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣۢ۠ۨ$ۥ;

    iget v1, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣۢ۠ۨ$ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥۣۢ۠ۨ$ۥ;-><init>(LYue/ۥۣۢ۠ۨ;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۧۢ۠;

    iget-object v4, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v4, LYue/ۥۣۢ۠ۨ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance v2, LYue/ۥۡۧۢ۠;

    iget-object p1, p0, LYue/ۥۣۢ۠ۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    invoke-interface {v0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v5

    invoke-direct {v2, p1, v5}, LYue/ۥۡۧۢ۠;-><init>(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۦۥ;)V

    :try_start_1
    iget-object p1, p0, LYue/ۥۣۢ۠ۨ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۢ;

    iput-object p0, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥ۟۟۠ۧ:I

    invoke-interface {p1, v2, v0}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v4, p0

    :goto_1
    invoke-virtual {v2}, LYue/ۥۡۧۢ۠;->releaseIntercepted()V

    iget-object p1, v4, LYue/ۥۣۢ۠ۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    instance-of v2, p1, LYue/ۥۣۢ۠ۨ;

    if-eqz v2, :cond_6

    check-cast p1, LYue/ۥۣۢ۠ۨ;

    const/4 v2, 0x0

    iput-object v2, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣۢ۠ۨ$ۥ;->ۥ۟۟۠ۧ:I

    invoke-virtual {p1, v0}, LYue/ۥۣۢ۠ۨ;->ۥ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_6
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :goto_3
    invoke-virtual {v2}, LYue/ۥۡۧۢ۠;->releaseIntercepted()V

    throw p1
.end method

.method public ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢ۠ۨ;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    invoke-interface {v0, p1, p2}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

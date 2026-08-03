.class public final LYue/ۥ۠ۢۤۥ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۤۥ;->ۥ۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,112:1\n147#2,13:113\n160#2,6:127\n329#3:126\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n159#1:126\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۠ۢۡ;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۤ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۢۤۥ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۡ;

    iput-object p2, p0, LYue/ۥ۠ۢۤۥ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۤ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 8
    .param p1    # LYue/ۥۣۣ۠ۢ;
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
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;

    iget v1, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;

    invoke-direct {v0, p0, p2}, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;-><init>(LYue/ۥ۠ۢۤۥ$ۥ۟;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۧۢ۠;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    iget-object p1, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۣۣ۠ۢ;

    iget-object v2, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v2, LYue/ۥ۠ۢۤۥ$ۥ۟;

    :try_start_1
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_2
    iget-object p2, p0, LYue/ۥ۠ۢۤۥ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۡ;

    iput-object p0, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput v5, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    invoke-interface {p2, p1, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    :goto_1
    new-instance p2, LYue/ۥۡۧۢ۠;

    invoke-interface {v0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v4

    invoke-direct {p2, p1, v4}, LYue/ۥۡۧۢ۠;-><init>(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۦۥ;)V

    :try_start_3
    iget-object p1, v2, LYue/ۥ۠ۢۤۥ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۤ;

    iput-object p2, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object v6, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v2, 0x6

    invoke-static {v2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-interface {p1, p2, v6, v0}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x7

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object p1, p2

    :goto_2
    invoke-virtual {p1}, LYue/ۥۡۧۢ۠;->releaseIntercepted()V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :catchall_2
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    invoke-virtual {p1}, LYue/ۥۡۧۢ۠;->releaseIntercepted()V

    throw p2

    :catchall_3
    move-exception p1

    move-object v2, p0

    :goto_4
    new-instance p2, LYue/ۥۣۢۡ;

    invoke-direct {p2, p1}, LYue/ۥۣۢۡ;-><init>(Ljava/lang/Throwable;)V

    iget-object v2, v2, LYue/ۥ۠ۢۤۥ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۤ;

    iput-object p1, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object v6, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥ۠ۢۤۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    invoke-static {p2, v2, p1, v0}, LYue/ۥ۠ۢۤۥ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥۣ۠ۢۤ;Ljava/lang/Throwable;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    :goto_5
    throw p1
.end method

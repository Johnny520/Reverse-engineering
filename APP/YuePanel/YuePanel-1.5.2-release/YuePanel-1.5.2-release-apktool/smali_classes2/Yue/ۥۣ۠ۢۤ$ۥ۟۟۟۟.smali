.class public final LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۤ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2"
    f = "Delay.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x160
    }
    m = "invokeSuspend"
    n = {
        "downstream",
        "values",
        "lastValue",
        "ticker"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۠ۢۤ;->ۥ۟۟۟ۢ(LYue/ۥۣ۠ۢۡ;J)LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e0\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
        "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,348:1\n199#2,11:349\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n285#1:349,11\n*E\n"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/Object;

.field public ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public ۥ۟۟۠ۥ:I

.field public synthetic ۥ۟۟۠ۦ:Ljava/lang/Object;

.field public synthetic ۥ۟۟۠ۧ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۨ:J

.field public final synthetic ۥ۟۟ۡ:LYue/ۥۣ۠ۢۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e4\u06e3$\u06e5\u06df\u06df\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:J

    iput-object p3, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۢۡ;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۡۦۡۡ;

    iget-object v4, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object v5, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v5, LYue/ۥۡۦۡۡ;

    iget-object v6, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v6, LYue/ۥۣۣ۠ۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast p1, LYue/ۥ۟ۧۧۥ;

    iget-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۣۣ۠ۢ;

    new-instance v7, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ۟۟;

    iget-object v4, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۢۡ;

    invoke-direct {v7, v4, v3}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ۟۟;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    move-object v4, p1

    invoke-static/range {v4 .. v9}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۢ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object v11

    new-instance v12, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {v12}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    iget-wide v5, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:J

    const/4 v9, 0x2

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v4 .. v10}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۥۥ(LYue/ۥ۟ۧۧۥ;JJILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p1

    move-object v6, v1

    move-object v5, v11

    move-object v4, v12

    move-object v1, p1

    :cond_2
    :goto_0
    iget-object p1, v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object v7, LYue/ۥۡۢۧ;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    if-eq p1, v7, :cond_4

    iput-object v6, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object v5, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-object v4, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:I

    new-instance p1, LYue/ۥۡۧۨۥ;

    invoke-direct {p1, p0}, LYue/ۥۡۧۨۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :try_start_0
    invoke-interface {v5}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟ۧ()LYue/ۥۡۧۨۧ;

    move-result-object v7

    new-instance v8, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ;

    invoke-direct {v8, v4, v1, v3}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)V

    invoke-interface {p1, v7, v8}, LYue/ۥۡۧۨۤ;->ۥ۟۟۠ۦ(LYue/ۥۡۧۨۧ;LYue/ۥۣ۠ۢۢ;)V

    invoke-interface {v1}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟ۦ()LYue/ۥۡۧۨۧ;

    move-result-object v7

    new-instance v8, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ۟;

    invoke-direct {v8, v4, v6, v3}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ۟;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)V

    invoke-interface {p1, v7, v8}, LYue/ۥۡۧۨۤ;->ۥ۟۟۠ۦ(LYue/ۥۡۧۨۧ;LYue/ۥۣ۠ۢۢ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v7

    invoke-virtual {p1, v7}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧۢ(Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {p1}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧۡ()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v7

    if-ne p1, v7, :cond_3

    invoke-static {p0}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_3
    if-ne p1, v0, :cond_2

    return-object v0

    :cond_4
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۟ۧۧۥ;

    check-cast p2, LYue/ۥۣۣ۠ۢ;

    check-cast p3, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ(LYue/ۥ۟ۧۧۥ;LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥ۟ۧۧۥ;LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p1    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;

    iget-wide v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:J

    iget-object v3, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟ۡ:LYue/ۥۣ۠ۢۡ;

    invoke-direct {v0, v1, v2, v3, p3}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;-><init>(JLYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

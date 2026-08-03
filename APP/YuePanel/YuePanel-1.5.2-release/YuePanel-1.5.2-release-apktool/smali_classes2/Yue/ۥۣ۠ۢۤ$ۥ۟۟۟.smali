.class public final LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3"
    f = "Delay.kt"
    i = {
        0x0,
        0x1,
        0x2
    }
    l = {
        0x13a,
        0x13c,
        0x13d
    }
    m = "invokeSuspend"
    n = {
        "$this$produce",
        "$this$produce",
        "$this$produce"
    }
    s = {
        "L$0",
        "L$0",
        "L$0"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۠ۢۤ;->ۥ۟۟۟۠(LYue/ۥ۟ۧۧۥ;JJ)LYue/ۥۡۦۡۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e0\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public synthetic ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۥ:J

.field public final synthetic ۥ۟۟۠ۦ:J


# direct methods
.method public constructor <init>(JJLYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e4\u06e3$\u06e5\u06df\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۥ:J

    iput-wide p3, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    new-instance v6, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;

    iget-wide v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۥ:J

    iget-wide v3, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:J

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;-><init>(JJLYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v6, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۡۥۡۤ;

    check-cast p2, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥۣ۟۟۠:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۡۥۡۤ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    :goto_0
    iget-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۡۥۡۤ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LYue/ۥۡۥۡۤ;

    iget-wide v5, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۥ:J

    iput-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v4, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥۣ۟۟۠:I

    invoke-static {v5, v6, p0}, LYue/ۥ۟ۨۨ۟;->ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    invoke-interface {v1}, LYue/ۥۡۥۡۤ;->ۥ()LYue/ۥۡۨۡ۠;

    move-result-object p1

    sget-object v4, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    iput-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥۣ۟۟۠:I

    invoke-interface {p1, v4, p0}, LYue/ۥۡۨۡ۠;->ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    iget-wide v4, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:J

    iput-object v1, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->ۥۣ۟۟۠:I

    invoke-static {v4, v5, p0}, LYue/ۥ۟ۨۨ۟;->ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥۡۥۡۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    check-cast p1, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

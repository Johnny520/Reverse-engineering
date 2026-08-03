.class public final LYue/ۥۣۢۡۡ$ۥ۟۟;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3"
    f = "TickerChannels.kt"
    i = {}
    l = {
        0x48,
        0x49
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۢۡۡ;->ۥ۟۟۟۟(JJLYue/ۥ۟ۧۦۥ;LYue/ۥۣۢۡۢ;)LYue/ۥۡۦۡۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۢۡۡ$ۥ۟۟$ۥ;
    }
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

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣۢۡۢ;

.field public final synthetic ۥ۟۟۠ۦ:J

.field public final synthetic ۥ۟۟۠ۧ:J


# direct methods
.method public constructor <init>(LYue/ۥۣۢۡۢ;JJLYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e2;",
            "JJ",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e1$\u06e5\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۣۢۡۢ;

    iput-wide p2, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۦ:J

    iput-wide p4, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۧ:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;
    .locals 8
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

    new-instance v7, LYue/ۥۣۢۡۡ$ۥ۟۟;

    iget-object v1, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۣۢۡۢ;

    iget-wide v2, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۦ:J

    iget-wide v4, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۧ:J

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LYue/ۥۣۢۡۡ$ۥ۟۟;-><init>(LYue/ۥۣۢۡۢ;JJLYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v7, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۡۥۡۤ;

    check-cast p2, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۦ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥۣ۟۟۠:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۥۡۤ;

    iget-object v1, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۣۢۡۢ;

    sget-object v4, LYue/ۥۣۢۡۡ$ۥ۟۟$ۥ;->ۥ:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v4, v1

    if-eq v1, v3, :cond_4

    if-eq v1, v2, :cond_3

    goto :goto_0

    :cond_3
    iget-wide v4, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۦ:J

    iget-wide v6, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۧ:J

    invoke-interface {p1}, LYue/ۥۡۥۡۤ;->ۥ()LYue/ۥۡۨۡ۠;

    move-result-object v8

    iput v2, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥۣ۟۟۠:I

    move-object v9, p0

    invoke-static/range {v4 .. v9}, LYue/ۥۣۢۡۡ;->ۥ(JJLYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_4
    iget-wide v1, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۦ:J

    iget-wide v4, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥ۟۟۠ۧ:J

    invoke-interface {p1}, LYue/ۥۡۥۡۤ;->ۥ()LYue/ۥۡۨۡ۠;

    move-result-object p1

    iput v3, p0, LYue/ۥۣۢۡۡ$ۥ۟۟;->ۥۣ۟۟۠:I

    move-wide v3, v4

    move-object v5, p1

    move-object v6, p0

    invoke-static/range {v1 .. v6}, LYue/ۥۣۢۡۡ;->ۥ۟(JJLYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
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

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۡۡ$ۥ۟۟;->create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    check-cast p1, LYue/ۥۣۢۡۡ$ۥ۟۟;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥۣۢۡۡ$ۥ۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

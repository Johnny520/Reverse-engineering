.class public final LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1"
    f = "Channel.kt"
    i = {}
    l = {
        0x177
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۦۡۡ$ۥ$ۥ;->ۥ۟۟ۡ۟(LYue/ۥۡۨ;LYue/ۥۣ۠ۢۢ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e0\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "LYue/\u06e5\u06df\u06e4\u06e2\u06df<",
        "+TE;>;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-TR;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/channels/ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,821:1\n1#2:822\n*E\n"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public synthetic ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣ۠ۢۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "TE;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TE;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1$\u06e5$\u06e5$\u06e5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠ۢۢ;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;
    .locals 2
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

    new-instance v0, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;

    iget-object v1, p0, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠ۢۢ;

    invoke-direct {v0, v1, p2}, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۟ۤۢ۟;

    invoke-virtual {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۠()Ljava/lang/Object;

    move-result-object p1

    check-cast p2, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;->ۥ۟۟۠ۦ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;->ۥۣ۟۟۠:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥ۟ۤۢ۟;

    invoke-virtual {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۠()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, p0, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠ۢۢ;

    invoke-static {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟ۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput v2, p0, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;->ۥۣ۟۟۠:I

    invoke-interface {v1, p1, p0}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1

    :cond_3
    throw v1
.end method

.method public final ۥ۟۟۠ۦ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
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
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟(Ljava/lang/Object;)LYue/ۥ۟ۤۢ۟;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;->create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    check-cast p1, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥۡۦۡۡ$ۥ$ۥ$ۥ;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

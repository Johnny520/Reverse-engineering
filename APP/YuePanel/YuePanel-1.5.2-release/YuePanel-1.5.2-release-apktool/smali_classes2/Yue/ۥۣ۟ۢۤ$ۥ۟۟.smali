.class public final LYue/ۥۣ۟ۢۤ$ۥ۟۟;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2"
    f = "Broadcast.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x35,
        0x36
    }
    m = "invokeSuspend"
    n = {
        "$this$broadcast",
        "$this$broadcast"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۢۤ;->ۥ۟(LYue/ۥۡۦۡۡ;ILYue/ۥ۟ۧۨ;)LYue/ۥۣ۟ۢۡ;
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
        "-TE;>;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/Object;

.field public ۥ۟۟۠ۤ:I

.field public synthetic ۥ۟۟۠ۥ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e3\u06e2\u06e4$\u06e5\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;

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

    new-instance v0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;

    iget-object v1, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;

    invoke-direct {v0, v1, p2}, LYue/ۥۣ۟ۢۤ$ۥ۟۟;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۡۥۡۤ;

    check-cast p2, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۤ:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v1, LYue/ۥ۟ۤۡۧ;

    iget-object v4, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۥۡۤ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :cond_0
    move-object p1, v4

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v1, LYue/ۥ۟ۤۡۧ;

    iget-object v4, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۥۡۤ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۥۡۤ;

    iget-object v1, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;

    invoke-interface {v1}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object v1

    :goto_0
    iput-object p1, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۤ:I

    invoke-interface {v1, p0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    return-object v0

    :cond_4
    move-object v5, v4

    move-object v4, p1

    move-object p1, v5

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v1}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p1

    iput-object v4, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v2, p0, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->ۥ۟۟۠ۤ:I

    invoke-interface {v4, p1, p0}, LYue/ۥۡۨۡ۠;->ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    return-object v0

    :cond_5
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
            "-TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    check-cast p1, LYue/ۥۣ۟ۢۤ$ۥ۟۟;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥۣ۟ۢۤ$ۥ۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

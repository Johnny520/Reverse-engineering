.class public final LYue/ۥۢ۟ۨۨ$ۥ;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۤ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1"
    f = "SharingStarted.kt"
    i = {
        0x1,
        0x2,
        0x3
    }
    l = {
        0xb2,
        0xb4,
        0xb6,
        0xb7,
        0xb9
    }
    m = "invokeSuspend"
    n = {
        "$this$transformLatest",
        "$this$transformLatest",
        "$this$transformLatest"
    }
    s = {
        "L$0",
        "L$0",
        "L$0"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢ۟ۨۨ;->ۥ(LYue/ۥۢ۠۟ۡ;)LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e0\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "-",
        "LYue/\u06e5\u06e1\u06e8\u06e8\u06e6;",
        ">;",
        "Ljava/lang/Integer;",
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

.field public synthetic ۥ۟۟۠ۥ:I

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۢ۟ۨۨ;


# direct methods
.method public constructor <init>(LYue/ۥۢ۟ۨۨ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06df\u06e8\u06e8;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06df\u06e8\u06e8$\u06e5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۢ۟ۨۨ;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥۣ۟۟۠:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

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
    iget-object v1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۣۣ۠ۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    iget-object v1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۣۣ۠ۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۣۣ۠ۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LYue/ۥۣۣ۠ۢ;

    iget p1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۥ:I

    if-lez p1, :cond_6

    sget-object p1, LYue/ۥۡۨۨۦ;->ۥۣ۟۟۠:LYue/ۥۡۨۨۦ;

    iput v6, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥۣ۟۟۠:I

    invoke-interface {v1, p1, p0}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_6
    iget-object p1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۢ۟ۨۨ;

    invoke-static {p1}, LYue/ۥۢ۟ۨۨ;->ۥ۟۟(LYue/ۥۢ۟ۨۨ;)J

    move-result-wide v6

    iput-object v1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v5, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥۣ۟۟۠:I

    invoke-static {v6, v7, p0}, LYue/ۥ۟ۨۨ۟;->ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_1
    iget-object p1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۢ۟ۨۨ;

    invoke-static {p1}, LYue/ۥۢ۟ۨۨ;->ۥ۟(LYue/ۥۢ۟ۨۨ;)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long p1, v5, v7

    if-lez p1, :cond_9

    sget-object p1, LYue/ۥۡۨۨۦ;->ۥ۟۟۠ۤ:LYue/ۥۡۨۨۦ;

    iput-object v1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v4, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥۣ۟۟۠:I

    invoke-interface {v1, p1, p0}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    iget-object p1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۢ۟ۨۨ;

    invoke-static {p1}, LYue/ۥۢ۟ۨۨ;->ۥ۟(LYue/ۥۢ۟ۨۨ;)J

    move-result-wide v4

    iput-object v1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥۣ۟۟۠:I

    invoke-static {v4, v5, p0}, LYue/ۥ۟ۨۨ۟;->ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    :goto_3
    sget-object p1, LYue/ۥۡۨۨۦ;->ۥ۟۟۠ۥ:LYue/ۥۡۨۨۦ;

    const/4 v3, 0x0

    iput-object v3, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥۣ۟۟۠:I

    invoke-interface {v1, p1, p0}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_4
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۣۣ۠ۢ;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;ILYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۣۣ۠ۢ;ILYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p1    # LYue/ۥۣۣ۠ۢ;
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
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e6;",
            ">;I",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۨۨ$ۥ;

    iget-object v1, p0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۢ۟ۨۨ;

    invoke-direct {v0, v1, p3}, LYue/ۥۢ۟ۨۨ$ۥ;-><init>(LYue/ۥۢ۟ۨۨ;LYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput p2, v0, LYue/ۥۢ۟ۨۨ$ۥ;->ۥ۟۟۠ۥ:I

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۨۨ$ۥ;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

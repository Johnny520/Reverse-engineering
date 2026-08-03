.class public final LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;
.super LYue/ۥۡۦۧۢ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.JobSupport$children$1"
    f = "JobSupport.kt"
    i = {
        0x1,
        0x1,
        0x1
    }
    l = {
        0x3b8,
        0x3ba
    }
    m = "invokeSuspend"
    n = {
        "$this$sequence",
        "this_$iv",
        "cur$iv"
    }
    s = {
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۦ۠۟;->ۥ۟۟۠ۨ()LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e1\u06e6\u06e7\u06e2;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
        "-",
        "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
        ">;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1479:1\n645#2,6:1480\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n954#1:1480,6\n*E\n"
.end annotation


# instance fields
.field public ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public ۥ۟۟۠ۥ:Ljava/lang/Object;

.field public ۥ۟۟۠ۦ:I

.field public synthetic ۥ۟۟۠ۧ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۨ:LYue/ۥ۠ۦ۠۟;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦ۠۟;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e6\u06e0\u06df;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e6\u06e0\u06df$\u06e5\u06df\u06df\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۦ۠۟;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LYue/ۥۡۦۧۢ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

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

    new-instance v0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;

    iget-object v1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۦ۠۟;

    invoke-direct {v0, v1, p2}, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;-><init>(LYue/ۥ۠ۦ۠۟;LYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۡۨۢ۠;

    check-cast p2, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۦ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

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

    iget v1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v1, LYue/ۥ۠ۨ۠ۥ;

    iget-object v3, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v3, LYue/ۥۣ۠ۨ۠;

    iget-object v4, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۨۢ۠;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۨۢ۠;

    iget-object v1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۦ۠۟;

    invoke-virtual {v1}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۣ()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, LYue/ۥ۟ۤۦ;

    if-eqz v4, :cond_3

    check-cast v1, LYue/ۥ۟ۤۦ;

    iget-object v1, v1, LYue/ۥ۟ۤۦ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦ۟;

    iput v3, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:I

    invoke-virtual {p1, v1, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_3
    instance-of v3, v1, LYue/ۥ۠ۥۡ۠;

    if-eqz v3, :cond_5

    check-cast v1, LYue/ۥ۠ۥۡ۠;

    invoke-interface {v1}, LYue/ۥ۠ۥۡ۠;->ۥ۟۟ۡ()LYue/ۥۣۡۢۧ;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠ۨ۠ۥ;

    move-object v4, p1

    move-object v5, v3

    move-object v3, v1

    move-object v1, v5

    :goto_0
    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    instance-of p1, v1, LYue/ۥ۟ۤۦ;

    if-eqz p1, :cond_4

    move-object p1, v1

    check-cast p1, LYue/ۥ۟ۤۦ;

    iget-object p1, p1, LYue/ۥ۟ۤۦ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦ۟;

    iput-object v4, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-object v3, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:I

    invoke-virtual {v4, p1, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    invoke-virtual {v1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۡ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v1

    goto :goto_0

    :cond_5
    :goto_2
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥۡۨۢ۠;
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
            "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
            "-",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

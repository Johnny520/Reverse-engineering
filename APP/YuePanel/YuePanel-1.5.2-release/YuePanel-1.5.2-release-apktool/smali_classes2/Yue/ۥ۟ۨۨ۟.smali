.class public final LYue/ۥ۟ۨۨ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,147:1\n314#2,11:148\n314#2,11:159\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n93#1:148,11\n113#1:159,11\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥ۟ۨۨ۟$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LYue/ۥ۟ۨۨ۟$ۥ;

    iget v1, v0, LYue/ۥ۟ۨۨ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۟ۨۨ۟$ۥ;->ۥ۟۟۠ۤ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟ۨۨ۟$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۨۨ۟$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p0, v0, LYue/ۥ۟ۨۨ۟$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۟ۨۨ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p0}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iput v3, v0, LYue/ۥ۟ۨۨ۟$ۥ;->ۥ۟۟۠ۤ:I

    new-instance p0, LYue/ۥۣ۟ۨ۠;

    invoke-static {v0}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v2

    invoke-direct {p0, v2, v3}, LYue/ۥۣ۟ۨ۠;-><init>(LYue/ۥ۟ۧۤۢ;I)V

    invoke-virtual {p0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟ۢ۟()V

    invoke-virtual {p0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v2

    if-ne p0, v2, :cond_3

    invoke-static {v0}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    new-instance p0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p0
.end method

.method public static final ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۨ۠;

    invoke-static {p2}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LYue/ۥۣ۟ۨ۠;-><init>(LYue/ۥ۟ۧۤۢ;I)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟ۢ۟()V

    const-wide v1, 0x7fffffffffffffffL

    cmp-long v1, p0, v1

    if-gez v1, :cond_1

    invoke-interface {v0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۨۨ۟;->ۥ۟۟۟(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۨۨ;

    move-result-object v1

    invoke-interface {v1, p0, p1, v0}, LYue/ۥ۟ۨۨ;->ۥ۟۟ۤۥ(JLYue/ۥۣ۟ۨ۟;)V

    :cond_1
    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_2
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method

.method public static final ۥ۟۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۨۨ۟;->ۥ۟۟۟۟(J)J

    move-result-wide p0

    invoke-static {p0, p1, p2}, LYue/ۥ۟ۨۨ۟;->ۥ۟(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۨۨ;
    .locals 1
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۟ۧۤۥ;->ۥۣ۟۟۟:LYue/ۥ۟ۧۤۥ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    instance-of v0, p0, LYue/ۥ۟ۨۨ;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥ۟ۨۨ;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, LYue/ۥ۟ۨۥۥ;->ۥ()LYue/ۥ۟ۨۨ;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final ۥ۟۟۟۟(J)J
    .locals 2

    sget-object v0, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۠ۢۥ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠۠ۢۥ$ۥ;->ۥۣ۟۟۟()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۟ۥ(JJ)I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0, p1}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۢ۠(J)J

    move-result-wide p0

    const-wide/16 v0, 0x1

    invoke-static {p0, p1, v0, v1}, LYue/ۥۡۦ۟;->ۥ۟۟۠ۥ(JJ)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    const-wide/16 p0, 0x0

    :goto_0
    return-wide p0
.end method

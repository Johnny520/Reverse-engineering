.class public final LYue/ۥ۟ۨۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۨۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,147:1\n314#2,11:148\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n30#1:148,11\n*E\n"
.end annotation


# direct methods
.method public static ۥ(LYue/ۥ۟ۨۨ;JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .param p0    # LYue/ۥ۟ۨۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated without replacement as an internal method never intended for public use"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e8\u06e8;",
            "J",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۨ۠;

    invoke-static {p3}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LYue/ۥۣ۟ۨ۠;-><init>(LYue/ۥ۟ۧۤۢ;I)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟ۢ۟()V

    invoke-interface {p0, p1, p2, v0}, LYue/ۥ۟ۨۨ;->ۥ۟۟ۤۥ(JLYue/ۥۣ۟ۨ۟;)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    invoke-static {p3}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_1
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method

.method public static ۥ۟(LYue/ۥ۟ۨۨ;JLjava/lang/Runnable;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣۣ۠۟;
    .locals 0
    .param p0    # LYue/ۥ۟ۨۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {}, LYue/ۥ۟ۨۥۥ;->ۥ()LYue/ۥ۟ۨۨ;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3, p4}, LYue/ۥ۟ۨۨ;->ۥۣ۟۟(JLjava/lang/Runnable;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣۣ۠۟;

    move-result-object p0

    return-object p0
.end method

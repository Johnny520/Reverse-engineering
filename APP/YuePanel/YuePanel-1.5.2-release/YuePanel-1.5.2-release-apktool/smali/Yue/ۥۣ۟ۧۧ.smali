.class public final LYue/ۥۣ۟ۧۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۣ۟ۧۥ;LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .param p0    # LYue/ۥۣ۟ۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
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
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e3\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Landroid/content/Context;",
            "TR;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥۣ۟ۧۥ;->peekAvailableContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۨ۠;

    invoke-static {p2}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LYue/ۥۣ۟ۨ۠;-><init>(LYue/ۥ۟ۧۤۢ;I)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟ۢ۟()V

    new-instance v1, LYue/ۥۣ۟ۧۧ$ۥ۟;

    invoke-direct {v1, v0, p1}, LYue/ۥۣ۟ۧۧ$ۥ۟;-><init>(LYue/ۥۣ۟ۨ۟;LYue/ۥۣ۠ۡ۟;)V

    invoke-interface {p0, v1}, LYue/ۥۣ۟ۧۥ;->addOnContextAvailableListener(LYue/ۥۣۡۡۧ;)V

    new-instance p1, LYue/ۥۣ۟ۧۧ$ۥ;

    invoke-direct {p1, p0, v1}, LYue/ۥۣ۟ۧۧ$ۥ;-><init>(LYue/ۥۣ۟ۧۥ;LYue/ۥۣ۟ۧۧ$ۥ۟;)V

    invoke-interface {v0, p1}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟۟(LYue/ۥۣ۠ۡ۟;)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    invoke-static {p2}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_1
    return-object p0
.end method

.method public static final ۥ۟(LYue/ۥۣ۟ۧۥ;LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e3\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Landroid/content/Context;",
            "TR;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥۣ۟ۧۥ;->peekAvailableContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    new-instance v0, LYue/ۥۣ۟ۨ۠;

    invoke-static {p2}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LYue/ۥۣ۟ۨ۠;-><init>(LYue/ۥ۟ۧۤۢ;I)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟ۢ۟()V

    new-instance v1, LYue/ۥۣ۟ۧۧ$ۥ۟;

    invoke-direct {v1, v0, p1}, LYue/ۥۣ۟ۧۧ$ۥ۟;-><init>(LYue/ۥۣ۟ۨ۟;LYue/ۥۣ۠ۡ۟;)V

    invoke-interface {p0, v1}, LYue/ۥۣ۟ۧۥ;->addOnContextAvailableListener(LYue/ۥۣۡۡۧ;)V

    new-instance p1, LYue/ۥۣ۟ۧۧ$ۥ;

    invoke-direct {p1, p0, v1}, LYue/ۥۣ۟ۧۧ$ۥ;-><init>(LYue/ۥۣ۟ۧۥ;LYue/ۥۣ۟ۧۧ$ۥ۟;)V

    invoke-interface {v0, p1}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟۟(LYue/ۥۣ۠ۡ۟;)V

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    invoke-static {p2}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_1
    invoke-static {v2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    return-object p0
.end method

.class public final LYue/ۥ۟ۦۣ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۟ۦۢۧ;
    .locals 1
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            ")",
            "LYue/\u06e5\u06df\u06e6\u06e2\u06e7<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۦۢۨ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۦۢۨ;-><init>(LYue/ۥ۠ۦ۟ۡ;)V

    return-object v0
.end method

.method public static final ۥ۟(Ljava/lang/Object;)LYue/ۥ۟ۦۢۧ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "LYue/\u06e5\u06df\u06e6\u06e2\u06e7<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۦۢۨ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۟ۦۢۨ;-><init>(LYue/ۥ۠ۦ۟ۡ;)V

    invoke-virtual {v0, p0}, LYue/ۥ۟ۦۢۨ;->ۥ۟۟ۥۡ(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۠ۦ۟ۡ;ILjava/lang/Object;)LYue/ۥ۟ۦۢۧ;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LYue/ۥ۟ۦۣ;->ۥ(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۟ۦۢۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥ۟ۦۢۧ;Ljava/lang/Object;)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۦۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e6\u06e2\u06e7<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۦۢۧ;->ۥ۟۟ۥۡ(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, LYue/ۥ۟ۦۢۧ;->ۥ۟(Ljava/lang/Throwable;)Z

    move-result p0

    :goto_0
    return p0
.end method

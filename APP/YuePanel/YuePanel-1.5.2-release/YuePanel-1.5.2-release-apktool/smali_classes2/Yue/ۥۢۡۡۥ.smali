.class public final LYue/ۥۢۡۡۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n266#1:289\n1#2:290\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n287#1:289\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(Ljava/lang/ThreadLocal;Ljava/lang/Object;)LYue/ۥۢۡۡۤ;
    .locals 1
    .param p0    # Ljava/lang/ThreadLocal;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/ThreadLocal<",
            "TT;>;TT;)",
            "LYue/\u06e5\u06e2\u06e1\u06e1\u06e4<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢۡۡۧ;

    invoke-direct {v0, p1, p0}, LYue/ۥۢۡۡۧ;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    return-object v0
.end method

.method public static synthetic ۥ۟(Ljava/lang/ThreadLocal;Ljava/lang/Object;ILjava/lang/Object;)LYue/ۥۢۡۡۤ;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, LYue/ۥۢۡۡۥ;->ۥ(Ljava/lang/ThreadLocal;Ljava/lang/Object;)LYue/ۥۢۡۡۤ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(Ljava/lang/ThreadLocal;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p0    # Ljava/lang/ThreadLocal;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ThreadLocal<",
            "*>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    new-instance v1, LYue/ۥۢۡۢ;

    invoke-direct {v1, p0}, LYue/ۥۢۡۢ;-><init>(Ljava/lang/ThreadLocal;)V

    invoke-interface {v0, v1}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ThreadLocal "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is missing from context "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final ۥ۟۟۟(Ljava/lang/ThreadLocal;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ThreadLocal<",
            "*>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 p0, 0x3

    invoke-static {p0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final ۥ۟۟۟۟(Ljava/lang/ThreadLocal;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/ThreadLocal;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ThreadLocal<",
            "*>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    new-instance v0, LYue/ۥۢۡۢ;

    invoke-direct {v0, p0}, LYue/ۥۢۡۢ;-><init>(Ljava/lang/ThreadLocal;)V

    invoke-interface {p1, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, LYue/ۥۣ۟ۢ۟;->ۥ(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۠(Ljava/lang/ThreadLocal;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ThreadLocal<",
            "*>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 p0, 0x3

    invoke-static {p0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    const/4 p0, 0x0

    throw p0
.end method

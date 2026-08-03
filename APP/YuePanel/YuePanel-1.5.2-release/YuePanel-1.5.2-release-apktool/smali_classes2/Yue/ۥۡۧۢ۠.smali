.class public final LYue/ۥۡۧۢ۠;
.super LYue/ۥ۟ۧۤۤ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;
.implements LYue/ۥ۟ۧۧۨ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e4;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "TT;>;",
        "LYue/\u06e5\u06df\u06e7\u06e7\u06e8;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:I
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public ۥ۟۟۠ۦ:LYue/ۥ۟ۧۦۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۠ۧ:LYue/ۥ۟ۧۤۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۦۥ;)V
    .locals 2
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")V"
        }
    .end annotation

    sget-object v0, LYue/ۥۣۡۢۡ;->ۥۣ۟۟۠:LYue/ۥۣۡۢۡ;

    sget-object v1, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    invoke-direct {p0, v0, v1}, LYue/ۥ۟ۧۤۤ;-><init>(LYue/ۥ۟ۧۤۢ;LYue/ۥ۟ۧۦۥ;)V

    iput-object p1, p0, LYue/ۥۡۧۢ۠;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    iput-object p2, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v0, LYue/ۥۡۧۢ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۧۢ۠$ۥ;

    invoke-interface {p2, p1, v0}, LYue/ۥ۟ۧۦۥ;->fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۥ:I

    return-void
.end method


# virtual methods
.method public getCallerFrame()LYue/ۥ۟ۧۧۨ;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۧ:LYue/ۥ۟ۧۤۢ;

    instance-of v1, v0, LYue/ۥ۟ۧۧۨ;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥ۟ۧۧۨ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()LYue/ۥ۟ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۦۥ;

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    return-object v0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LYue/ۥ۠۠۠;

    invoke-virtual {p0}, LYue/ۥۡۧۢ۠;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v2

    invoke-direct {v1, v0, v2}, LYue/ۥ۠۠۠;-><init>(Ljava/lang/Throwable;LYue/ۥ۟ۧۦۥ;)V

    iput-object v1, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۦۥ;

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۧ:LYue/ۥ۟ۧۤۢ;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public releaseIntercepted()V
    .locals 0

    invoke-super {p0}, LYue/ۥ۟ۧۤۤ;->releaseIntercepted()V

    return-void
.end method

.method public ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p2, p1}, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۧ(LYue/ۥ۟ۧۤۢ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_0
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :catchall_0
    move-exception p1

    new-instance v0, LYue/ۥ۠۠۠;

    invoke-interface {p2}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p2

    invoke-direct {v0, p1, p2}, LYue/ۥ۠۠۠;-><init>(Ljava/lang/Throwable;LYue/ۥ۟ۧۦۥ;)V

    iput-object v0, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۦۥ;

    throw p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "TT;)V"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠۠۠;

    if-eqz v0, :cond_0

    check-cast p2, LYue/ۥ۠۠۠;

    invoke-virtual {p0, p2, p3}, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۨ(LYue/ۥ۠۠۠;Ljava/lang/Object;)V

    :cond_0
    invoke-static {p0, p1}, LYue/ۥۡۧۢۢ;->ۥ(LYue/ۥۡۧۢ۠;LYue/ۥ۟ۧۦۥ;)V

    return-void
.end method

.method public final ۥ۟۟۠ۧ(LYue/ۥ۟ۧۤۢ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟ۡ(LYue/ۥ۟ۧۦۥ;)V

    iget-object v1, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۦۥ;

    if-eq v1, v0, :cond_0

    invoke-virtual {p0, v0, v1, p2}, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۦ(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V

    iput-object v0, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۦۥ;

    :cond_0
    iput-object p1, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۧ:LYue/ۥ۟ۧۤۢ;

    invoke-static {}, LYue/ۥۡۧۢۡ;->ۥ()LYue/ۥۣ۠ۢۤ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۡۧۢ۠;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    invoke-interface {p1, v0, p2, p0}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۧ:LYue/ۥ۟ۧۤۢ;

    :cond_1
    return-object p1
.end method

.method public final ۥ۟۟۠ۨ(LYue/ۥ۠۠۠;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, LYue/ۥ۠۠۠;->ۥۣ۟۟۠:Ljava/lang/Throwable;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but then emission attempt of value \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢ۠ۡۨ;->ۥ۟۟۠۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

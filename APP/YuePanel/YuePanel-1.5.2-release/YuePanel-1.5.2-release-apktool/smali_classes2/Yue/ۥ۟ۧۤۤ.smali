.class public abstract LYue/ۥ۟ۧۤۤ;
.super LYue/ۥ۟ۢۥۢ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.3"
.end annotation

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"
.end annotation


# instance fields
.field private final _context:LYue/ۥ۟ۧۦۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field private transient intercepted:LYue/ۥ۟ۧۤۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۤۢ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۧۤۤ;-><init>(LYue/ۥ۟ۧۤۢ;LYue/ۥ۟ۧۦۥ;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥ۟ۧۤۢ;LYue/ۥ۟ۧۦۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, LYue/ۥ۟ۢۥۢ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    .line 2
    iput-object p2, p0, LYue/ۥ۟ۧۤۤ;->_context:LYue/ۥ۟ۧۦۥ;

    return-void
.end method


# virtual methods
.method public getContext()LYue/ۥ۟ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۧۤۤ;->_context:LYue/ۥ۟ۧۦۥ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final intercepted()LYue/ۥ۟ۧۤۢ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۧۤۤ;->intercepted:LYue/ۥ۟ۧۤۢ;

    if-nez v0, :cond_2

    invoke-virtual {p0}, LYue/ۥ۟ۧۤۤ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    sget-object v1, LYue/ۥ۟ۧۤۥ;->ۥۣ۟۟۟:LYue/ۥ۟ۧۤۥ$ۥ۟;

    invoke-interface {v0, v1}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۧۤۥ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, LYue/ۥ۟ۧۤۥ;->interceptContinuation(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, LYue/ۥ۟ۧۤۤ;->intercepted:LYue/ۥ۟ۧۤۢ;

    :cond_2
    return-object v0
.end method

.method public releaseIntercepted()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۟ۧۤۤ;->intercepted:LYue/ۥ۟ۧۤۢ;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۧۤۤ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v1

    sget-object v2, LYue/ۥ۟ۧۤۥ;->ۥۣ۟۟۟:LYue/ۥ۟ۧۤۥ$ۥ۟;

    invoke-interface {v1, v2}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    check-cast v1, LYue/ۥ۟ۧۤۥ;

    invoke-interface {v1, v0}, LYue/ۥ۟ۧۤۥ;->releaseInterceptedContinuation(LYue/ۥ۟ۧۤۢ;)V

    :cond_0
    sget-object v0, LYue/ۥ۟ۦۣۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۦۣۡ;

    iput-object v0, p0, LYue/ۥ۟ۧۤۤ;->intercepted:LYue/ۥ۟ۧۤۢ;

    return-void
.end method

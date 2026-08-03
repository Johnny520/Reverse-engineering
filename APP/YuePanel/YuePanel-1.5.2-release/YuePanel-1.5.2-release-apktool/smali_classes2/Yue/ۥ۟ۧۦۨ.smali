.class public abstract LYue/ۥ۟ۧۦۨ;
.super LYue/ۥ۟۟۠ۨ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۤۥ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۧۦۨ$ۥ;
    }
.end annotation


# static fields
.field public static final Key:LYue/ۥ۟ۧۦۨ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۟ۧۦۨ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۟ۧۦۨ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۟ۧۦۨ;->Key:LYue/ۥ۟ۧۦۨ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, LYue/ۥ۟ۧۤۥ;->ۥۣ۟۟۟:LYue/ۥ۟ۧۤۥ$ۥ۟;

    invoke-direct {p0, v0}, LYue/ۥ۟۟۠ۨ;-><init>(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)V

    return-void
.end method


# virtual methods
.method public abstract dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
.end method

.method public dispatchYield(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۧۦۨ;->dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۤۥ$ۥ;->ۥ۟(LYue/ۥ۟ۧۤۥ;LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p1

    return-object p1
.end method

.method public final interceptContinuation(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;
    .locals 1
    .param p1    # LYue/ۥ۟ۧۤۢ;
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
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠۟ۢ۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠۟ۢ۟;-><init>(LYue/ۥ۟ۧۦۨ;LYue/ۥ۟ۧۤۢ;)V

    return-object v0
.end method

.method public isDispatchNeeded(LYue/ۥ۟ۧۦۥ;)Z
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 p1, 0x1

    return p1
.end method

.method public limitedParallelism(I)LYue/ۥ۟ۧۦۨ;
    .locals 1
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p1}, LYue/ۥ۠ۧ۠۠;->ۥ(I)V

    new-instance v0, LYue/ۥ۠ۧ۠۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۧ۠۟;-><init>(LYue/ۥ۟ۧۦۨ;I)V

    return-object v0
.end method

.method public minusKey(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۤۥ$ۥ;->ۥ۟۟(LYue/ۥ۟ۧۤۥ;LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    return-object p1
.end method

.method public final plus(LYue/ۥ۟ۧۦۨ;)LYue/ۥ۟ۧۦۨ;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Operator \'+\' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left."
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    return-object p1
.end method

.method public final releaseInterceptedContinuation(LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)V"
        }
    .end annotation

    check-cast p1, LYue/ۥ۠۟ۢ۟;

    invoke-virtual {p1}, LYue/ۥ۠۟ۢ۟;->ۥ۟۟۠ۥ()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final LYue/ۥ۠ۦ۠۟$ۥ;
.super LYue/ۥۣ۟ۨ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۦ۠۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e3\u06e8\u06e0<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1479:1\n1#2:1480\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟ۡ۠:LYue/ۥ۠ۦ۠۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۤۢ;LYue/ۥ۠ۦ۠۟;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۦ۠۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;",
            "LYue/\u06e5\u06e0\u06e6\u06e0\u06df;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LYue/ۥۣ۟ۨ۠;-><init>(LYue/ۥ۟ۧۤۢ;I)V

    iput-object p2, p0, LYue/ۥ۠ۦ۠۟$ۥ;->ۥ۟۟ۡ۠:LYue/ۥ۠ۦ۠۟;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۠ۧ(LYue/ۥ۠ۦ۟ۡ;)Ljava/lang/Throwable;
    .locals 2
    .param p1    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۦ۠۟$ۥ;->ۥ۟۟ۡ۠:LYue/ۥ۠ۦ۠۟;

    invoke-virtual {v0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۣ()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LYue/ۥ۠ۦ۠۟$ۥ۟۟;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LYue/ۥ۠ۦ۠۟$ۥ۟۟;

    invoke-virtual {v1}, LYue/ۥ۠ۦ۠۟$ۥ۟۟;->ۥ۟۟۟۟()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, LYue/ۥ۟ۦۣۢ;

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥ۟ۦۣۢ;

    iget-object p1, v0, LYue/ۥ۟ۦۣۢ;->ۥ:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    invoke-interface {p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟ۢۥ()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۦ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "AwaitContinuation"

    return-object v0
.end method

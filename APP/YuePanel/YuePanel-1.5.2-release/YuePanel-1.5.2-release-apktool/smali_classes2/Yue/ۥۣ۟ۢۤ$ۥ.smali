.class public final LYue/ۥۣ۟ۢۤ$ۥ;
.super LYue/ۥ۠ۦ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۢۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n11328#2:128\n11663#2,3:129\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n121#1:128\n121#1:129,3\n*E\n"
.end annotation


# instance fields
.field private volatile synthetic _disposer:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "Ljava/util/List<",
            "+TT;>;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۨ:LYue/ۥۣۣ۠۟;

.field public final synthetic ۥ۟۟ۡ:LYue/ۥۣ۟ۢۤ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e2\u06e4\u06e3<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۢۤ;LYue/ۥۣ۟ۨ۟;)V
    .locals 0
    .param p1    # LYue/ۥۣ۟ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۢۤ;

    invoke-direct {p0}, LYue/ۥ۠ۦ۠;-><init>()V

    iput-object p2, p0, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۣ۟ۢۤ$ۥ;->_disposer:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V
    .locals 5
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۟ۨ۟;->ۥ۟۟ۡۢ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p0}, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟ۦۧ()LYue/ۥۣ۟ۢۤ$ۥ۟;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۤ$ۥ۟;->ۥ۟۟۟()V

    goto :goto_1

    :cond_0
    iget-object p1, p0, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۢۤ;

    sget-object v0, LYue/ۥۣ۟ۢۤ;->ۥ۟:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    iget-object v0, p0, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۢۤ;

    invoke-static {v0}, LYue/ۥۣ۟ۢۤ;->ۥ(LYue/ۥۣ۟ۢۤ;)[LYue/ۥ۟ۨۧۥ;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, LYue/ۥ۟ۨۧۥ;->ۥ۟۟۠()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {v1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۥ۟۟ۦۧ()LYue/ۥۣ۟ۢۤ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e2\u06e4\u06e3<",
            "TT;>.\u06e5\u06df;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۢۤ$ۥ;->_disposer:Ljava/lang/Object;

    check-cast v0, LYue/ۥۣ۟ۢۤ$ۥ۟;

    return-object v0
.end method

.method public final ۥ۟۟ۦۨ()LYue/ۥۣۣ۠۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥۣۣ۠۟;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "handle"

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟ۢۦ(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۥ۟۟ۧ(LYue/ۥۣ۟ۢۤ$ۥ۟;)V
    .locals 0
    .param p1    # LYue/ۥۣ۟ۢۤ$ۥ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06e4\u06e3<",
            "TT;>.\u06e5\u06df;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۢۤ$ۥ;->_disposer:Ljava/lang/Object;

    return-void
.end method

.method public final ۥ۟۟ۧ۟(LYue/ۥۣۣ۠۟;)V
    .locals 0
    .param p1    # LYue/ۥۣۣ۠۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۣ۟ۢۤ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥۣۣ۠۟;

    return-void
.end method

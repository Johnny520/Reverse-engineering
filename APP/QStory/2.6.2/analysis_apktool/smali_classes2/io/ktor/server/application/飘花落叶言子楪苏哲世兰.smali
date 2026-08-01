.class public final Lio/ktor/server/application/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/jvm/internal/ContinuationImpl;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/ClassLoader;

.field public final 飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/jvm/internal/ContinuationImpl;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/ktor/server/application/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 5
    .line 6
    iput-object p2, p0, Lio/ktor/server/application/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    invoke-interface {p1}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lio/ktor/server/application/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/application/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lio/ktor/server/application/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lio/ktor/server/application/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->resumeWith(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

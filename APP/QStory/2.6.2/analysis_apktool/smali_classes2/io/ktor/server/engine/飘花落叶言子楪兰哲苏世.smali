.class public final Lio/ktor/server/engine/飘花落叶言子楪兰哲苏世;
.super Ljava/lang/Thread;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final 飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;)V
    .locals 1

    .line 1
    const-string v0, "KtorShutdownHook"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lio/ktor/server/engine/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lio/ktor/server/engine/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lio/ktor/server/engine/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lio/ktor/server/engine/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

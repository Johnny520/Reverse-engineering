.class public final Lkotlinx/coroutines/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:[Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>([Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:[Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DisposeHandlersOnCancel["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:[Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x5d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 3

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:[Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    iget-object v2, v2, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Lkotlinx/coroutines/飘花落叶言子世哲兰楪苏;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-interface {v2}, Lkotlinx/coroutines/飘花落叶言子世哲兰楪苏;->dispose()V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "handle"

    .line 20
    .line 21
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0

    .line 26
    :cond_1
    return-void
.end method

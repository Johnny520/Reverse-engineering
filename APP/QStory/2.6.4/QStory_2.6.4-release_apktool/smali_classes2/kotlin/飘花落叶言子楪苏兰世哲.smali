.class public abstract Lkotlin/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lkotlin/Result$Failure;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, Lkotlin/Result$Failure;

    .line 7
    .line 8
    iget-object p0, p0, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)Lkotlin/Result$Failure;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkotlin/Result$Failure;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lkotlin/Result$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

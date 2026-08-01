.class public abstract Lkotlinx/coroutines/飘花落叶言子苏哲楪世兰;
.super Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子世哲兰楪苏;
.implements Lkotlinx/coroutines/飘花落叶言子苏楪兰哲世;


# instance fields
.field public 飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;


# virtual methods
.method public final dispose()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏世兰()Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;->飘花落叶言子苏兰楪世哲(Lkotlinx/coroutines/飘花落叶言子苏哲楪世兰;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getParent()Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏世兰()Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x40

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "[job@"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏世兰()Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 p0, 0x5d

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public abstract 飘花落叶言子楪哲兰世苏()Z
.end method

.method public abstract 飘花落叶言子楪哲兰苏世(Ljava/lang/Throwable;)V
.end method

.method public final 飘花落叶言子楪哲苏世兰()Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "job"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final 飘花落叶言子楪苏世兰哲()Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.class public final Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世哲苏兰:[I

.field public 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    sget-object p1, Lio/ktor/http/cio/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Lio/ktor/http/cio/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    invoke-virtual {p1}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, [I

    .line 16
    .line 17
    iput-object p1, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:[I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/ktor/http/cio/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:[I

    .line 7
    .line 8
    iget v1, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    const-string v3, ""

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(I)Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 23
    .line 24
    .line 25
    const-string v3, " => "

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v2}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(I)Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 35
    .line 36
    .line 37
    const-string v3, "\n"

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 40
    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(I)Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "Failed requirement."

    .line 3
    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    iget v2, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
    if-ge p1, v2, :cond_0

    .line 9
    .line 10
    mul-int/lit8 p1, p1, 0x8

    .line 11
    .line 12
    iget-object v0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:[I

    .line 13
    .line 14
    add-int/lit8 v1, p1, 0x4

    .line 15
    .line 16
    aget v1, v0, v1

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x5

    .line 19
    .line 20
    aget p1, v0, p1

    .line 21
    .line 22
    iget-object p0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    invoke-virtual {p0, v1, p1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final 飘花落叶言子楪世兰苏哲()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 3
    .line 4
    iget-object v0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:[I

    .line 5
    .line 6
    sget-object v1, Lio/ktor/http/cio/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:[I

    .line 7
    .line 8
    iput-object v1, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:[I

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    sget-object p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Lio/ktor/http/cio/飘花落叶言子楪世兰苏哲;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(IIIIII)V
    .locals 4

    .line 1
    iget v0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    mul-int/lit8 v1, v0, 0x8

    .line 4
    .line 5
    iget-object v2, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:[I

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_0

    .line 9
    .line 10
    aput p1, v2, v1

    .line 11
    .line 12
    add-int/lit8 p1, v1, 0x1

    .line 13
    .line 14
    aput p2, v2, p1

    .line 15
    .line 16
    add-int/lit8 p1, v1, 0x2

    .line 17
    .line 18
    aput p3, v2, p1

    .line 19
    .line 20
    add-int/lit8 p1, v1, 0x3

    .line 21
    .line 22
    aput p4, v2, p1

    .line 23
    .line 24
    add-int/lit8 p1, v1, 0x4

    .line 25
    .line 26
    aput p5, v2, p1

    .line 27
    .line 28
    add-int/lit8 p1, v1, 0x5

    .line 29
    .line 30
    aput p6, v2, p1

    .line 31
    .line 32
    add-int/lit8 p1, v1, 0x6

    .line 33
    .line 34
    const/4 p2, -0x1

    .line 35
    aput p2, v2, p1

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x7

    .line 38
    .line 39
    aput p2, v2, v1

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    iput v0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance p0, Lkotlin/NotImplementedError;

    .line 47
    .line 48
    const-string p1, "An operation is not implemented: Implement headers overflow"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(I)Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "Failed requirement."

    .line 3
    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    iget v2, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
    if-ge p1, v2, :cond_0

    .line 9
    .line 10
    mul-int/lit8 p1, p1, 0x8

    .line 11
    .line 12
    iget-object v0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:[I

    .line 13
    .line 14
    add-int/lit8 v1, p1, 0x2

    .line 15
    .line 16
    aget v1, v0, v1

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x3

    .line 19
    .line 20
    aget p1, v0, p1

    .line 21
    .line 22
    iget-object p0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    invoke-virtual {p0, v1, p1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;
    .locals 5

    .line 1
    sget-object v0, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p1, v1, v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget v0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 13
    .line 14
    :goto_0
    if-ge v1, v0, :cond_1

    .line 15
    .line 16
    mul-int/lit8 v2, v1, 0x8

    .line 17
    .line 18
    iget-object v3, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:[I

    .line 19
    .line 20
    aget v4, v3, v2

    .line 21
    .line 22
    if-ne v4, p1, :cond_0

    .line 23
    .line 24
    add-int/lit8 p1, v2, 0x4

    .line 25
    .line 26
    aget p1, v3, p1

    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x5

    .line 29
    .line 30
    aget v0, v3, v2

    .line 31
    .line 32
    iget-object p0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(I)I
    .locals 4

    .line 1
    sget-object v0, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "Content-Length"

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-static {v1, v0, v2}, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 15
    .line 16
    :goto_0
    if-ge p1, v1, :cond_1

    .line 17
    .line 18
    mul-int/lit8 v2, p1, 0x8

    .line 19
    .line 20
    iget-object v3, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:[I

    .line 21
    .line 22
    aget v2, v3, v2

    .line 23
    .line 24
    if-ne v2, v0, :cond_0

    .line 25
    .line 26
    return p1

    .line 27
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p0, -0x1

    .line 31
    return p0
.end method

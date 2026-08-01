.class public final Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

.field public final 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/String;

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    iput p2, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 7
    .line 8
    iput p3, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 2

    .line 1
    iget v0, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    iget v1, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(I)C

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const-string v0, "index ("

    .line 18
    .line 19
    const-string v1, ") should be less than length ("

    .line 20
    .line 21
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->length()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const/16 p0, 0x29

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    const-string p0, "index is negative: "

    .line 52
    .line 53
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    instance-of v0, p1, Ljava/lang/CharSequence;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    check-cast p1, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    :goto_0
    return v1

    .line 20
    :cond_1
    invoke-virtual {p0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    move v2, v1

    .line 25
    :goto_1
    if-ge v2, v0, :cond_3

    .line 26
    .line 27
    iget v3, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 28
    .line 29
    add-int/2addr v3, v2

    .line 30
    iget-object v4, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 31
    .line 32
    invoke-virtual {v4, v3}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(I)C

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eq v3, v4, :cond_2

    .line 41
    .line 42
    return v1

    .line 43
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const/4 p0, 0x1

    .line 47
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget v0, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    iget v2, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 14
    .line 15
    if-ge v0, v2, :cond_1

    .line 16
    .line 17
    mul-int/lit8 v1, v1, 0x1f

    .line 18
    .line 19
    iget-object v2, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v1, v2

    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return v1
.end method

.method public final length()I
    .locals 1

    .line 1
    iget v0, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    iget p0, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_3

    .line 3
    .line 4
    const/16 v1, 0x29

    .line 5
    .line 6
    if-gt p1, p2, :cond_2

    .line 7
    .line 8
    iget v2, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 9
    .line 10
    iget v3, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 11
    .line 12
    sub-int/2addr v2, v3

    .line 13
    if-gt p2, v2, :cond_1

    .line 14
    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    const-string p0, ""

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    add-int/2addr p1, v3

    .line 23
    add-int/2addr v3, p2

    .line 24
    iget-object p0, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1, v3}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;-><init>(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;II)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    const-string p1, "end should be less than length ("

    .line 31
    .line 32
    invoke-virtual {p0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->length()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0, v1, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v0, "start ("

    .line 43
    .line 44
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, ") should be less or equal to end ("

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_3
    const-string p0, "start is negative: "

    .line 76
    .line 77
    invoke-static {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    iget v1, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    iget-object v2, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    invoke-virtual {v2, v0, v1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(II)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 20
    .line 21
    :cond_0
    return-object v0
.end method

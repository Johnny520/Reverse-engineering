.class public final L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:I

.field public final 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    iput p3, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    iput p4, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    iget v0, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:I

    .line 4
    .line 5
    iget v1, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:I

    .line 6
    .line 7
    if-eq v1, v0, :cond_0

    .line 8
    .line 9
    invoke-static {v1, v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:I

    .line 15
    .line 16
    iget p1, p1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:I

    .line 17
    .line 18
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget v1, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:I

    .line 4
    .line 5
    iget v2, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    const-string v3, " "

    .line 8
    .line 9
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    new-instance p0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v5, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 44
    .line 45
    invoke-virtual {v5, v2}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v2, ": "

    .line 53
    .line 54
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;

    .line 58
    .line 59
    invoke-virtual {v2, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    if-nez v0, :cond_1

    .line 72
    .line 73
    sget-object p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰苏世哲;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p0, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(I)L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰苏世哲;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :goto_0
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.class public final L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:I

.field public final 飘花落叶言子楪兰世苏哲:I

.field public final 飘花落叶言子楪哲兰世苏:Lcom/android/dex/MethodHandle$MethodHandleType;

.field public final 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Lcom/android/dex/MethodHandle$MethodHandleType;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 7
    .line 8
    iput p3, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    iput p4, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    iput p5, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    iget-object v0, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 4
    .line 5
    iget-object v1, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 6
    .line 7
    if-eq v1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:I

    .line 15
    .line 16
    iget p1, p1, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:I

    .line 17
    .line 18
    invoke-static {p0, p1}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, " "

    .line 2
    .line 3
    iget v1, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    iget-object v2, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    iget-object p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Lcom/android/dex/MethodHandle$MethodHandleType;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/android/dex/MethodHandle$MethodHandleType;->isField()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    iget-object p0, v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Ljava/lang/Comparable;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object p0, v2, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 57
    .line 58
    invoke-virtual {p0, v1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/lang/Comparable;

    .line 63
    .line 64
    :goto_0
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

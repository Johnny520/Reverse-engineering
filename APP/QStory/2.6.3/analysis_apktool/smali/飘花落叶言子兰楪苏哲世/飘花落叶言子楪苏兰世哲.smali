.class public final L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;
.super L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰哲世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>(L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏兰哲;I)V
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
    iput-object p1, p0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    iput p2, p0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_4

    .line 5
    .line 6
    const-class v0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;

    .line 16
    .line 17
    iget v0, p0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:I

    .line 18
    .line 19
    iget v1, p1, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:I

    .line 20
    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    iget-object p0, p0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏兰哲;

    .line 25
    .line 26
    iget-object p1, p1, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏兰哲;

    .line 27
    .line 28
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    invoke-virtual {p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏兰哲;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/2addr p0, v0

    .line 12
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "InProgress(latestEvent="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", direction="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget p0, p0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

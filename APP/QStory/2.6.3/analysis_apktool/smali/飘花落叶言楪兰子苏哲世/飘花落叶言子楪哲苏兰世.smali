.class public final L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲苏兰世:I


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    iget p1, p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    sub-int/2addr p0, p1

    .line 8
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Segment{start="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", end="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget p0, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:I

    .line 19
    .line 20
    const/16 v1, 0x7d

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

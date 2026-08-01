.class public final Lcom/google/android/flexbox/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲苏兰世:I


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/flexbox/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    iget v0, p0, Lcom/google/android/flexbox/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    iget v1, p1, Lcom/google/android/flexbox/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    return v0

    .line 11
    :cond_0
    iget p0, p0, Lcom/google/android/flexbox/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 12
    .line 13
    iget p1, p1, Lcom/google/android/flexbox/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 14
    .line 15
    sub-int/2addr p0, p1

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Order{order="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/google/android/flexbox/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", index="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget p0, p0, Lcom/google/android/flexbox/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

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

.class public final L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世苏哲兰:J


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    iget-wide v3, p0, L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 14
    .line 15
    iget-wide p0, p1, L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 16
    .line 17
    cmp-long p0, v3, p0

    .line 18
    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    return v0

    .line 22
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

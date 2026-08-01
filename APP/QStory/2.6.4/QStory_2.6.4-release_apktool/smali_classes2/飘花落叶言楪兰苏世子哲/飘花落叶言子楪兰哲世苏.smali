.class public final L飘花落叶言楪兰苏世子哲/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p2, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    iget-wide v0, p2, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:D

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

    .line 10
    .line 11
    iget-wide p1, p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:D

    .line 12
    .line 13
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.class public final L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:D

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/List;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 84
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 85
    invoke-direct {p0, p1, v0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/4 v0, 0x0

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    move-object v1, p2

    .line 30
    check-cast v1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;

    .line 31
    .line 32
    iget-object v1, v1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 33
    .line 34
    const-string v2, "q"

    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object p2, v0

    .line 44
    :goto_0
    check-cast p2, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;

    .line 45
    .line 46
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 47
    .line 48
    if-eqz p2, :cond_3

    .line 49
    .line 50
    iget-object p1, p2, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    invoke-static {p1}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏兰楪哲世(Ljava/lang/String;)Ljava/lang/Double;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    const-wide/16 v5, 0x0

    .line 65
    .line 66
    cmpg-double p2, v5, v3

    .line 67
    .line 68
    if-gtz p2, :cond_2

    .line 69
    .line 70
    cmpg-double p2, v3, v1

    .line 71
    .line 72
    if-gtz p2, :cond_2

    .line 73
    .line 74
    move-object v0, p1

    .line 75
    :cond_2
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 78
    .line 79
    .line 80
    move-result-wide v1

    .line 81
    :cond_3
    iput-wide v1, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:D

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

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
    check-cast p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;

    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 25
    .line 26
    iget-object p1, p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

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
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HeaderValue(value="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", params="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p0, 0x29

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

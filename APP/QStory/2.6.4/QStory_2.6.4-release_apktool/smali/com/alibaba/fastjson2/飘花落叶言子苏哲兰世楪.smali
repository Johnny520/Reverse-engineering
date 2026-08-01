.class public Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;
.super Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Z

.field public final 飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

.field public final 飘花落叶言子楪苏世哲兰:Z


# direct methods
.method public varargs constructor <init>(Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V
    .locals 2

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 5
    .line 6
    instance-of p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;

    .line 7
    .line 8
    const/4 p3, 0x1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    instance-of v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰楪世;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    instance-of v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    move v1, p3

    .line 24
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰哲苏:Z

    .line 25
    .line 26
    instance-of v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏世楪兰哲;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    :goto_2
    move p3, v0

    .line 31
    goto :goto_3

    .line 32
    :cond_2
    if-eqz p2, :cond_3

    .line 33
    .line 34
    move-object p2, p1

    .line 35
    check-cast p2, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;

    .line 36
    .line 37
    iget p2, p2, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 38
    .line 39
    if-gez p2, :cond_3

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    instance-of p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;

    .line 43
    .line 44
    if-eqz p2, :cond_4

    .line 45
    .line 46
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲兰苏()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    :goto_3
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪苏世哲兰:Z

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;

    .line 15
    .line 16
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 19
    .line 20
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public 飘花落叶言子楪世哲兰苏()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰哲苏:Z

    .line 2
    .line 3
    return p0
.end method

.method public 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 5
    .line 6
    invoke-direct {v0, p0, v1, v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;)V

    .line 7
    .line 8
    .line 9
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪苏世哲兰:Z

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iput-object p0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2, p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object p0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 27
    .line 28
    return-object p0
.end method

.method public 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 5
    .line 6
    invoke-direct {v0, p0, v1, v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 15
    .line 16
    return-object p0
.end method

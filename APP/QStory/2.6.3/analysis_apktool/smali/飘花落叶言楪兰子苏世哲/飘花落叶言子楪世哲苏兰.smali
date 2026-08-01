.class public final L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世苏哲兰:Ljava/math/BigInteger;


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(Ljava/math/BigInteger;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ltz v1, :cond_0

    .line 11
    .line 12
    iput-object p0, v0, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/math/BigInteger;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string v0, "Attempt to construct ConfigMemorySize with negative number: "

    .line 16
    .line 17
    invoke-static {p0, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    iget-object p1, p1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/math/BigInteger;

    .line 8
    .line 9
    iget-object p0, p0, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/math/BigInteger;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/math/BigInteger;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ConfigMemorySize("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/math/BigInteger;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ")"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

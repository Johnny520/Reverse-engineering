.class abstract Lcom/typesafe/config/impl/ConfigNumber;
.super Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x2L


# instance fields
.field protected final originalText:Ljava/lang/String;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/typesafe/config/impl/ConfigNumber;->originalText:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private isWhole()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigNumber;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    long-to-double v0, v0

    .line 6
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigNumber;->doubleValue()D

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    cmpl-double p0, v0, v2

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public static newNumber(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;DLjava/lang/String;)Lcom/typesafe/config/impl/ConfigNumber;
    .locals 4

    double-to-long v0, p1

    long-to-double v2, v0

    cmpl-double v2, v2, p1

    if-nez v2, :cond_0

    .line 28
    invoke-static {p0, v0, v1, p3}, Lcom/typesafe/config/impl/ConfigNumber;->newNumber(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;JLjava/lang/String;)Lcom/typesafe/config/impl/ConfigNumber;

    move-result-object p0

    return-object p0

    .line 29
    :cond_0
    new-instance v0, Lcom/typesafe/config/impl/ConfigDouble;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/typesafe/config/impl/ConfigDouble;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;DLjava/lang/String;)V

    return-object v0
.end method

.method public static newNumber(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;JLjava/lang/String;)Lcom/typesafe/config/impl/ConfigNumber;
    .locals 2

    .line 1
    const-wide/32 v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    cmp-long v0, p1, v0

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    const-wide/32 v0, -0x80000000

    .line 9
    .line 10
    .line 11
    cmp-long v0, p1, v0

    .line 12
    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lcom/typesafe/config/impl/ConfigInt;

    .line 16
    .line 17
    long-to-int p1, p1

    .line 18
    invoke-direct {v0, p0, p1, p3}, Lcom/typesafe/config/impl/ConfigInt;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance v0, Lcom/typesafe/config/impl/ConfigLong;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/typesafe/config/impl/ConfigLong;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;JLjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/SerializedConfigValue;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/typesafe/config/impl/SerializedConfigValue;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcom/typesafe/config/impl/ConfigNumber;

    .line 2
    .line 3
    return p0
.end method

.method public abstract doubleValue()D
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/typesafe/config/impl/ConfigNumber;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/ConfigNumber;->canEqual(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    check-cast p1, Lcom/typesafe/config/impl/ConfigNumber;

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/typesafe/config/impl/ConfigNumber;->isWhole()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-direct {p1}, Lcom/typesafe/config/impl/ConfigNumber;->isWhole()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigNumber;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-virtual {p1}, Lcom/typesafe/config/impl/ConfigNumber;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    cmp-long p0, v3, p0

    .line 36
    .line 37
    if-nez p0, :cond_0

    .line 38
    .line 39
    return v2

    .line 40
    :cond_0
    return v1

    .line 41
    :cond_1
    invoke-direct {p1}, Lcom/typesafe/config/impl/ConfigNumber;->isWhole()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigNumber;->doubleValue()D

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    invoke-virtual {p1}, Lcom/typesafe/config/impl/ConfigNumber;->doubleValue()D

    .line 52
    .line 53
    .line 54
    move-result-wide p0

    .line 55
    cmpl-double p0, v3, p0

    .line 56
    .line 57
    if-nez p0, :cond_2

    .line 58
    .line 59
    return v2

    .line 60
    :cond_2
    return v1
.end method

.method public hashCode()I
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/typesafe/config/impl/ConfigNumber;->isWhole()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigNumber;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigNumber;->doubleValue()D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    :goto_0
    const/16 p0, 0x20

    .line 21
    .line 22
    ushr-long v2, v0, p0

    .line 23
    .line 24
    xor-long/2addr v0, v2

    .line 25
    long-to-int p0, v0

    .line 26
    return p0
.end method

.method public intValueRangeChecked(Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigNumber;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, -0x80000000

    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-ltz v2, :cond_0

    .line 11
    .line 12
    const-wide/32 v2, 0x7fffffff

    .line 13
    .line 14
    .line 15
    cmp-long v2, v0, v2

    .line 16
    .line 17
    if-gtz v2, :cond_0

    .line 18
    .line 19
    long-to-int p0, v0

    .line 20
    return p0

    .line 21
    :cond_0
    new-instance v2, Lcom/typesafe/config/ConfigException$WrongType;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v3, "out-of-range value "

    .line 28
    .line 29
    invoke-static {v0, v1, v3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "32-bit integer"

    .line 34
    .line 35
    invoke-direct {v2, p0, p1, v1, v0}, Lcom/typesafe/config/ConfigException$WrongType;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v2
.end method

.method public abstract longValue()J
.end method

.method public transformToString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/ConfigNumber;->originalText:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract unwrapped()Ljava/lang/Number;
.end method

.method public bridge synthetic unwrapped()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/ConfigNumber;->unwrapped()Ljava/lang/Number;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public abstract synthetic valueType()Lcom/typesafe/config/ConfigValueType;
.end method

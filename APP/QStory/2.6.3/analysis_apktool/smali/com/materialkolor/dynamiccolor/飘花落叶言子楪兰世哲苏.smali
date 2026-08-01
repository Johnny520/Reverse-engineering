.class public final Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:D

.field public final 飘花落叶言子楪世哲苏兰:D

.field public final 飘花落叶言子楪世苏兰哲:D

.field public final 飘花落叶言子楪世苏哲兰:D


# direct methods
.method public constructor <init>(DDDD)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:D

    .line 5
    .line 6
    iput-wide p3, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:D

    .line 7
    .line 8
    iput-wide p5, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 9
    .line 10
    iput-wide p7, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:D

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;

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
    check-cast p1, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;

    .line 12
    .line 13
    iget-wide v3, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:D

    .line 14
    .line 15
    iget-wide v5, p1, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:D

    .line 16
    .line 17
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-wide v3, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:D

    .line 25
    .line 26
    iget-wide v5, p1, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:D

    .line 27
    .line 28
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-wide v3, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 36
    .line 37
    iget-wide v5, p1, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 38
    .line 39
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-wide v3, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:D

    .line 47
    .line 48
    iget-wide p0, p1, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:D

    .line 49
    .line 50
    invoke-static {v3, v4, p0, p1}, Ljava/lang/Double;->compare(DD)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:D

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:D

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-wide v2, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 19
    .line 20
    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-wide v1, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:D

    .line 28
    .line 29
    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    add-int/2addr p0, v0

    .line 34
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ContrastCurve(low="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:D

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", normal="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:D

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", medium="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", high="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:D

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ")"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()D
    .locals 6

    .line 1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:D

    .line 4
    .line 5
    mul-double/2addr v0, v2

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    iget-wide v4, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 9
    .line 10
    mul-double/2addr v2, v4

    .line 11
    add-double/2addr v2, v0

    .line 12
    return-wide v2
.end method

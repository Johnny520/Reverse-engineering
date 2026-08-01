.class public final Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;
.super Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪苏世兰哲:D

.field public final 飘花落叶言子楪苏哲世兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;


# direct methods
.method public constructor <init>(DL飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:D

    .line 8
    .line 9
    iput-object p3, p0, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;

    .line 10
    .line 11
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
    instance-of v1, p1, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;

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
    check-cast p1, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;

    .line 12
    .line 13
    iget-wide v3, p0, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:D

    .line 14
    .line 15
    iget-wide v5, p1, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:D

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
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;

    .line 25
    .line 26
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;

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
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:D

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
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;

    .line 10
    .line 11
    iget p0, p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Failure(quality="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:D

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", failureStatusCode="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;

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

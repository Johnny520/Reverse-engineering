.class public final L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:J


# direct methods
.method public constructor <init>(IJLjava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0x604

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-wide p2, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 13
    .line 14
    iput-object p4, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 15
    .line 16
    iput p1, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 17
    .line 18
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
    instance-of v1, p1, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;

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
    check-cast p1, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    iget-wide v3, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 14
    .line 15
    iget-wide v5, p1, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-object v1, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget p0, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 34
    .line 35
    iget p1, p1, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 36
    .line 37
    if-eq p0, p1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget p0, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x628

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 16
    .line 17
    const/16 v3, 0x629

    .line 18
    .line 19
    invoke-static {v0, v1, v2, v3}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/StringBuilder;JI)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 23
    .line 24
    const/16 v2, 0x62a

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    iget p0, p0, L飘花落叶言苏世楪哲子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 30
    .line 31
    const/16 v1, 0x29

    .line 32
    .line 33
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

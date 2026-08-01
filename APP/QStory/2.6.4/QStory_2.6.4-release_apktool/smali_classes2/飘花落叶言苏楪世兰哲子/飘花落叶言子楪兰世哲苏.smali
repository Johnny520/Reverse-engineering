.class public final L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
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
    instance-of v1, p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;

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
    check-cast p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;

    .line 12
    .line 13
    iget v1, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 14
    .line 15
    iget v3, p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget p0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    iget p1, p1, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 23
    .line 24
    if-eq p0, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget p0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

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
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x565

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
    iget v1, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 16
    .line 17
    const/16 v2, 0x566

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/StringBuilder;II)V

    .line 20
    .line 21
    .line 22
    iget p0, p0, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 23
    .line 24
    const/16 v1, 0x29

    .line 25
    .line 26
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.class public final L飘花落叶言子楪兰苏哲世/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言子楪兰苏哲世/飘花落叶言子楪世苏兰哲;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, L飘花落叶言子楪兰苏哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:F

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    cmpg-float p0, p1, p0

    .line 8
    .line 9
    if-ltz p0, :cond_1

    .line 10
    .line 11
    const/high16 p0, 0x42c80000    # 100.0f

    .line 12
    .line 13
    cmpl-float p0, p1, p0

    .line 14
    .line 15
    if-lez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    const-string p0, "The percent should be in the range of [0, 100]"

    .line 20
    .line 21
    invoke-static {p0}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言子楪兰苏哲世/飘花落叶言子楪世哲兰苏;

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
    check-cast p1, L飘花落叶言子楪兰苏哲世/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    iget p0, p0, L飘花落叶言子楪兰苏哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:F

    .line 14
    .line 15
    iget p1, p1, L飘花落叶言子楪兰苏哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:F

    .line 16
    .line 17
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言子楪兰苏哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:F

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

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
    const-string v1, "CornerSize(size = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, L飘花落叶言子楪兰苏哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:F

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, "%)"

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

.method public final 飘花落叶言子楪世苏哲兰(JL飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)F
    .locals 0

    .line 1
    invoke-static {p1, p2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(J)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p0, p0, L飘花落叶言子楪兰苏哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:F

    .line 6
    .line 7
    const/high16 p2, 0x42c80000    # 100.0f

    .line 8
    .line 9
    div-float/2addr p0, p2

    .line 10
    mul-float/2addr p0, p1

    .line 11
    return p0
.end method

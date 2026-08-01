.class public final Lgv1;
.super Lv01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv01;"
    }
.end annotation


# instance fields
.field public final α:F

.field public final β:Liv1;

.field public final γ:J

.field public final δ:J


# direct methods
.method public constructor <init>(FLiv1;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lgv1;->α:F

    .line 5
    .line 6
    iput-object p2, p0, Lgv1;->β:Liv1;

    .line 7
    .line 8
    iput-wide p3, p0, Lgv1;->γ:J

    .line 9
    .line 10
    iput-wide p5, p0, Lgv1;->δ:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lgv1;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lgv1;

    .line 10
    .line 11
    iget v0, p0, Lgv1;->α:F

    .line 12
    .line 13
    iget v1, p1, Lgv1;->α:F

    .line 14
    .line 15
    invoke-static {v0, v1}, Liv;->β(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lgv1;->β:Liv1;

    .line 23
    .line 24
    iget-object v1, p1, Lgv1;->β:Liv1;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-wide v0, p0, Lgv1;->γ:J

    .line 34
    .line 35
    iget-wide v2, p1, Lgv1;->γ:J

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, Lci;->γ(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-wide v0, p0, Lgv1;->δ:J

    .line 45
    .line 46
    iget-wide p0, p1, Lgv1;->δ:J

    .line 47
    .line 48
    invoke-static {v0, v1, p0, p1}, Lci;->γ(JJ)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    :goto_0
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 57
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lgv1;->α:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

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
    iget-object v2, p0, Lgv1;->β:Liv1;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {v2, v1, v0}, Llz1;->γ(IIZ)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sget v2, Lci;->θ:I

    .line 24
    .line 25
    iget-wide v2, p0, Lgv1;->γ:J

    .line 26
    .line 27
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-wide v1, p0, Lgv1;->δ:J

    .line 32
    .line 33
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    add-int/2addr p0, v0

    .line 38
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ShadowGraphicsLayerElement(elevation="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lgv1;->α:F

    .line 9
    .line 10
    invoke-static {v1}, Liv;->γ(F)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", shape="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lgv1;->β:Liv1;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", clip=false, ambientColor="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-wide v1, p0, Lgv1;->γ:J

    .line 33
    .line 34
    invoke-static {v1, v2}, Lci;->ι(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", spotColor="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-wide v1, p0, Lgv1;->δ:J

    .line 47
    .line 48
    invoke-static {v1, v2}, Lci;->ι(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const/16 p0, 0x29

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public final δ()Lq01;
    .locals 3

    .line 1
    new-instance v0, Lia;

    .line 2
    .line 3
    new-instance v1, Lb0;

    .line 4
    .line 5
    const/16 v2, 0x14

    .line 6
    .line 7
    invoke-direct {v1, v2, p0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lia;-><init>(La80;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 2

    .line 1
    check-cast p1, Lia;

    .line 2
    .line 3
    new-instance v0, Lb0;

    .line 4
    .line 5
    const/16 v1, 0x14

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p1, Lia;->τ:La80;

    .line 11
    .line 12
    iget-object p0, p1, Lq01;->ε:Lq01;

    .line 13
    .line 14
    iget-boolean p0, p0, Lq01;->σ:Z

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x2

    .line 20
    invoke-static {p1, p0}, Lh62;->ф(Lur;I)Lq31;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p0, p0, Lq31;->τ:Lq31;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {p0, v0, p1}, Lq31;->ｐ(La80;Z)V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void
.end method

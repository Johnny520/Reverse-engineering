.class public final Ls6;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lt6;


# instance fields
.field public final ε:F

.field public final ζ:Lγ;

.field public final η:F


# direct methods
.method public constructor <init>(FLγ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ls6;->ε:F

    .line 5
    .line 6
    iput-object p2, p0, Ls6;->ζ:Lγ;

    .line 7
    .line 8
    iput p1, p0, Ls6;->η:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Ls6;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Ls6;

    .line 10
    .line 11
    iget v0, p0, Ls6;->ε:F

    .line 12
    .line 13
    iget v1, p1, Ls6;->ε:F

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
    iget-object p0, p0, Ls6;->ζ:Lγ;

    .line 23
    .line 24
    iget-object p1, p1, Ls6;->ζ:Lγ;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Ls6;->ε:F

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
    const/4 v2, 0x0

    .line 11
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object p0, p0, Ls6;->ζ:Lγ;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    add-int/2addr p0, v0

    .line 22
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AbsoluteArrangement#spacedAligned("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Ls6;->ε:F

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
    const-string v1, ", "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Ls6;->ζ:Lγ;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 p0, 0x29

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final β()F
    .locals 0

    .line 1
    iget p0, p0, Ls6;->η:F

    .line 2
    .line 3
    return p0
.end method

.method public final δ(ILrx0;[I[I)V
    .locals 7

    .line 1
    array-length v0, p3

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    iget p0, p0, Ls6;->ε:F

    .line 6
    .line 7
    invoke-interface {p2, p0}, Lyr;->Ξ(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    array-length p2, p3

    .line 12
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v1, p2, :cond_1

    .line 18
    .line 19
    aget v3, p3, v1

    .line 20
    .line 21
    add-int/lit8 v5, v4, 0x1

    .line 22
    .line 23
    sub-int v6, p1, v3

    .line 24
    .line 25
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    aput v2, p4, v4

    .line 30
    .line 31
    sub-int v2, p1, v2

    .line 32
    .line 33
    sub-int/2addr v2, v3

    .line 34
    invoke-static {p0, v2}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    aget v4, p4, v4

    .line 39
    .line 40
    add-int/2addr v4, v3

    .line 41
    add-int v3, v4, v2

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    move v4, v3

    .line 46
    move v3, v2

    .line 47
    move v2, v4

    .line 48
    move v4, v5

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sub-int/2addr v2, v3

    .line 51
    sub-int/2addr p1, v2

    .line 52
    if-lez p1, :cond_2

    .line 53
    .line 54
    sub-int/2addr p1, v0

    .line 55
    int-to-float p0, p1

    .line 56
    const/high16 p1, 0x40000000    # 2.0f

    .line 57
    .line 58
    div-float/2addr p0, p1

    .line 59
    const/4 p1, 0x1

    .line 60
    int-to-float p1, p1

    .line 61
    const/4 p2, 0x0

    .line 62
    add-float/2addr p1, p2

    .line 63
    mul-float/2addr p1, p0

    .line 64
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    array-length p1, p4

    .line 71
    :goto_1
    if-ge v0, p1, :cond_2

    .line 72
    .line 73
    aget p2, p4, v0

    .line 74
    .line 75
    add-int/2addr p2, p0

    .line 76
    aput p2, p4, v0

    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    :goto_2
    return-void
.end method

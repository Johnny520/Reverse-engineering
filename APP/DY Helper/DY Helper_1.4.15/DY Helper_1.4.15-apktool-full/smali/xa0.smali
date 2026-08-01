.class final Lxa0;
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

.field public final β:J

.field public final γ:Liv1;

.field public final δ:J

.field public final ε:J


# direct methods
.method public constructor <init>(FJLiv1;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lxa0;->α:F

    .line 5
    .line 6
    iput-wide p2, p0, Lxa0;->β:J

    .line 7
    .line 8
    iput-object p4, p0, Lxa0;->γ:Liv1;

    .line 9
    .line 10
    iput-wide p5, p0, Lxa0;->δ:J

    .line 11
    .line 12
    iput-wide p7, p0, Lxa0;->ε:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lxa0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lxa0;

    .line 13
    .line 14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_2
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_3
    iget v0, p0, Lxa0;->α:F

    .line 33
    .line 34
    iget v2, p1, Lxa0;->α:F

    .line 35
    .line 36
    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    const/4 v0, 0x0

    .line 44
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_9

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_9
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_a

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_a
    const/high16 v0, 0x41000000    # 8.0f

    .line 87
    .line 88
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_b

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_b
    iget-wide v2, p1, Lxa0;->β:J

    .line 96
    .line 97
    sget v0, Lr52;->β:I

    .line 98
    .line 99
    iget-wide v4, p0, Lxa0;->β:J

    .line 100
    .line 101
    cmp-long v0, v4, v2

    .line 102
    .line 103
    if-nez v0, :cond_f

    .line 104
    .line 105
    iget-object v0, p0, Lxa0;->γ:Liv1;

    .line 106
    .line 107
    iget-object v2, p1, Lxa0;->γ:Liv1;

    .line 108
    .line 109
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_c

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_c
    iget-wide v2, p0, Lxa0;->δ:J

    .line 117
    .line 118
    iget-wide v4, p1, Lxa0;->δ:J

    .line 119
    .line 120
    invoke-static {v2, v3, v4, v5}, Lci;->γ(JJ)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_d

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_d
    iget-wide v2, p0, Lxa0;->ε:J

    .line 128
    .line 129
    iget-wide p0, p1, Lxa0;->ε:J

    .line 130
    .line 131
    invoke-static {v2, v3, p0, p1}, Lci;->γ(JJ)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-nez p0, :cond_e

    .line 136
    .line 137
    :goto_0
    return v1

    .line 138
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 139
    return p0

    .line 140
    :cond_f
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    mul-int/2addr v1, v2

    .line 10
    invoke-static {v0, v1, v2}, Llz1;->α(FII)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Lxa0;->α:F

    .line 15
    .line 16
    invoke-static {v1, v0, v2}, Llz1;->α(FII)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v1, v0, v2}, Llz1;->α(FII)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v1, v0, v2}, Llz1;->α(FII)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v1, v0, v2}, Llz1;->α(FII)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v1, v0, v2}, Llz1;->α(FII)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v1, v0, v2}, Llz1;->α(FII)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v1, v0, v2}, Llz1;->α(FII)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/high16 v1, 0x41000000    # 8.0f

    .line 46
    .line 47
    invoke-static {v1, v0, v2}, Llz1;->α(FII)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    sget v1, Lr52;->β:I

    .line 52
    .line 53
    iget-wide v3, p0, Lxa0;->β:J

    .line 54
    .line 55
    invoke-static {v0, v2, v3, v4}, Llz1;->β(IIJ)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Lxa0;->γ:Liv1;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    add-int/2addr v1, v0

    .line 66
    mul-int/2addr v1, v2

    .line 67
    const/4 v0, 0x1

    .line 68
    const/16 v3, 0x3c1

    .line 69
    .line 70
    invoke-static {v1, v3, v0}, Llz1;->γ(IIZ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    sget v1, Lci;->θ:I

    .line 75
    .line 76
    iget-wide v3, p0, Lxa0;->δ:J

    .line 77
    .line 78
    invoke-static {v0, v2, v3, v4}, Llz1;->β(IIJ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-wide v3, p0, Lxa0;->ε:J

    .line 83
    .line 84
    invoke-static {v0, v2, v3, v4}, Llz1;->β(IIJ)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    const/4 v0, 0x0

    .line 89
    invoke-static {v0, p0, v2}, La12;->α(III)I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    const/4 v0, 0x3

    .line 94
    invoke-static {v0, p0, v2}, La12;->α(III)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lxa0;->α:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget v1, Lr52;->β:I

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "TransformOrigin(packedValue="

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-wide v2, p0, Lxa0;->β:J

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const/16 v2, 0x29

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", shape="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lxa0;->γ:Liv1;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", clip=true, renderEffect=null, ambientShadowColor="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-wide v1, p0, Lxa0;->δ:J

    .line 60
    .line 61
    invoke-static {v1, v2}, Lci;->ι(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", spotShadowColor="

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-wide v1, p0, Lxa0;->ε:J

    .line 74
    .line 75
    invoke-static {v1, v2}, Lci;->ι(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p0, ", compositingStrategy=CompositingStrategy(value=0), blendMode="

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x3

    .line 88
    invoke-static {p0}, Lxb;->г(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p0, ", colorFilter=null)"

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method

.method public final δ()Lq01;
    .locals 3

    .line 1
    new-instance v0, Lgw1;

    .line 2
    .line 3
    invoke-direct {v0}, Lq01;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iput v1, v0, Lgw1;->τ:F

    .line 9
    .line 10
    iput v1, v0, Lgw1;->υ:F

    .line 11
    .line 12
    iget v1, p0, Lxa0;->α:F

    .line 13
    .line 14
    iput v1, v0, Lgw1;->φ:F

    .line 15
    .line 16
    const/high16 v1, 0x41000000    # 8.0f

    .line 17
    .line 18
    iput v1, v0, Lgw1;->χ:F

    .line 19
    .line 20
    iget-wide v1, p0, Lxa0;->β:J

    .line 21
    .line 22
    iput-wide v1, v0, Lgw1;->ψ:J

    .line 23
    .line 24
    iget-object v1, p0, Lxa0;->γ:Liv1;

    .line 25
    .line 26
    iput-object v1, v0, Lgw1;->ω:Liv1;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput-boolean v1, v0, Lgw1;->Α:Z

    .line 30
    .line 31
    iget-wide v1, p0, Lxa0;->δ:J

    .line 32
    .line 33
    iput-wide v1, v0, Lgw1;->Β:J

    .line 34
    .line 35
    iget-wide v1, p0, Lxa0;->ε:J

    .line 36
    .line 37
    iput-wide v1, v0, Lgw1;->Γ:J

    .line 38
    .line 39
    const/4 p0, 0x3

    .line 40
    iput p0, v0, Lgw1;->Δ:I

    .line 41
    .line 42
    new-instance p0, Lb0;

    .line 43
    .line 44
    const/16 v1, 0x15

    .line 45
    .line 46
    invoke-direct {p0, v1, v0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iput-object p0, v0, Lgw1;->Ε:Lb0;

    .line 50
    .line 51
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 3

    .line 1
    check-cast p1, Lgw1;

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iput v0, p1, Lgw1;->τ:F

    .line 6
    .line 7
    iput v0, p1, Lgw1;->υ:F

    .line 8
    .line 9
    iget v0, p0, Lxa0;->α:F

    .line 10
    .line 11
    iput v0, p1, Lgw1;->φ:F

    .line 12
    .line 13
    const/high16 v0, 0x41000000    # 8.0f

    .line 14
    .line 15
    iput v0, p1, Lgw1;->χ:F

    .line 16
    .line 17
    iget-wide v0, p0, Lxa0;->β:J

    .line 18
    .line 19
    iput-wide v0, p1, Lgw1;->ψ:J

    .line 20
    .line 21
    iget-object v0, p0, Lxa0;->γ:Liv1;

    .line 22
    .line 23
    iput-object v0, p1, Lgw1;->ω:Liv1;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p1, Lgw1;->Α:Z

    .line 27
    .line 28
    iget-wide v1, p0, Lxa0;->δ:J

    .line 29
    .line 30
    iput-wide v1, p1, Lgw1;->Β:J

    .line 31
    .line 32
    iget-wide v1, p0, Lxa0;->ε:J

    .line 33
    .line 34
    iput-wide v1, p1, Lgw1;->Γ:J

    .line 35
    .line 36
    const/4 p0, 0x3

    .line 37
    iput p0, p1, Lgw1;->Δ:I

    .line 38
    .line 39
    iget-object p0, p1, Lgw1;->Ε:Lb0;

    .line 40
    .line 41
    iget-object v1, p1, Lq01;->ε:Lq01;

    .line 42
    .line 43
    iget-boolean v1, v1, Lq01;->σ:Z

    .line 44
    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v1, 0x2

    .line 49
    invoke-static {p1, v1}, Lh62;->ф(Lur;I)Lq31;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p1, p1, Lq31;->τ:Lq31;

    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1, p0, v0}, Lq31;->ｐ(La80;Z)V

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_0
    return-void
.end method

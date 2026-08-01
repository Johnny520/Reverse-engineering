.class public final Lw90;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:F

.field public final β:F

.field public final γ:F

.field public final δ:F

.field public final ε:F

.field public final ζ:F

.field public final η:F

.field public final θ:F


# direct methods
.method public constructor <init>(FFFFFFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lw90;->α:F

    .line 5
    .line 6
    iput p2, p0, Lw90;->β:F

    .line 7
    .line 8
    iput p3, p0, Lw90;->γ:F

    .line 9
    .line 10
    iput p4, p0, Lw90;->δ:F

    .line 11
    .line 12
    iput p5, p0, Lw90;->ε:F

    .line 13
    .line 14
    iput p6, p0, Lw90;->ζ:F

    .line 15
    .line 16
    iput p7, p0, Lw90;->η:F

    .line 17
    .line 18
    iput p8, p0, Lw90;->θ:F

    .line 19
    .line 20
    return-void
.end method

.method public static α(Lw90;FFFFFFFFI)Lw90;
    .locals 9

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget p1, p0, Lw90;->α:F

    .line 8
    .line 9
    :cond_0
    move v1, p1

    .line 10
    and-int/lit8 p1, v0, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget p2, p0, Lw90;->β:F

    .line 15
    .line 16
    :cond_1
    move v2, p2

    .line 17
    and-int/lit8 p1, v0, 0x4

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget p3, p0, Lw90;->γ:F

    .line 22
    .line 23
    :cond_2
    move v3, p3

    .line 24
    and-int/lit8 p1, v0, 0x8

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    iget p4, p0, Lw90;->δ:F

    .line 29
    .line 30
    :cond_3
    move v4, p4

    .line 31
    and-int/lit8 p1, v0, 0x10

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget p5, p0, Lw90;->ε:F

    .line 36
    .line 37
    :cond_4
    move v5, p5

    .line 38
    and-int/lit8 p1, v0, 0x20

    .line 39
    .line 40
    if-eqz p1, :cond_5

    .line 41
    .line 42
    iget p6, p0, Lw90;->ζ:F

    .line 43
    .line 44
    :cond_5
    move v6, p6

    .line 45
    and-int/lit8 p1, v0, 0x40

    .line 46
    .line 47
    if-eqz p1, :cond_6

    .line 48
    .line 49
    iget p1, p0, Lw90;->η:F

    .line 50
    .line 51
    move v7, p1

    .line 52
    goto :goto_0

    .line 53
    :cond_6
    move/from16 v7, p7

    .line 54
    .line 55
    :goto_0
    and-int/lit16 p1, v0, 0x80

    .line 56
    .line 57
    if-eqz p1, :cond_7

    .line 58
    .line 59
    iget p1, p0, Lw90;->θ:F

    .line 60
    .line 61
    move v8, p1

    .line 62
    goto :goto_1

    .line 63
    :cond_7
    move/from16 v8, p8

    .line 64
    .line 65
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v0, Lw90;

    .line 69
    .line 70
    invoke-direct/range {v0 .. v8}, Lw90;-><init>(FFFFFFFF)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public static β(Lw90;Lw90;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lw90;->α:F

    .line 8
    .line 9
    iget v1, p1, Lw90;->α:F

    .line 10
    .line 11
    sub-float/2addr v0, v1

    .line 12
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const v1, 0x3a03126f    # 5.0E-4f

    .line 17
    .line 18
    .line 19
    cmpg-float v0, v0, v1

    .line 20
    .line 21
    if-gtz v0, :cond_0

    .line 22
    .line 23
    iget v0, p0, Lw90;->β:F

    .line 24
    .line 25
    iget v2, p1, Lw90;->β:F

    .line 26
    .line 27
    sub-float/2addr v0, v2

    .line 28
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    cmpg-float v0, v0, v1

    .line 33
    .line 34
    if-gtz v0, :cond_0

    .line 35
    .line 36
    iget v0, p0, Lw90;->γ:F

    .line 37
    .line 38
    iget v2, p1, Lw90;->γ:F

    .line 39
    .line 40
    sub-float/2addr v0, v2

    .line 41
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    cmpg-float v0, v0, v1

    .line 46
    .line 47
    if-gtz v0, :cond_0

    .line 48
    .line 49
    iget v0, p0, Lw90;->δ:F

    .line 50
    .line 51
    iget v2, p1, Lw90;->δ:F

    .line 52
    .line 53
    sub-float/2addr v0, v2

    .line 54
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    cmpg-float v0, v0, v1

    .line 59
    .line 60
    if-gtz v0, :cond_0

    .line 61
    .line 62
    iget v0, p0, Lw90;->ε:F

    .line 63
    .line 64
    iget v2, p1, Lw90;->ε:F

    .line 65
    .line 66
    sub-float/2addr v0, v2

    .line 67
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    cmpg-float v0, v0, v1

    .line 72
    .line 73
    if-gtz v0, :cond_0

    .line 74
    .line 75
    iget v0, p0, Lw90;->ζ:F

    .line 76
    .line 77
    iget v2, p1, Lw90;->ζ:F

    .line 78
    .line 79
    sub-float/2addr v0, v2

    .line 80
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    cmpg-float v0, v0, v1

    .line 85
    .line 86
    if-gtz v0, :cond_0

    .line 87
    .line 88
    iget v0, p0, Lw90;->η:F

    .line 89
    .line 90
    iget v2, p1, Lw90;->η:F

    .line 91
    .line 92
    sub-float/2addr v0, v2

    .line 93
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    cmpg-float v0, v0, v1

    .line 98
    .line 99
    if-gtz v0, :cond_0

    .line 100
    .line 101
    iget p0, p0, Lw90;->θ:F

    .line 102
    .line 103
    iget p1, p1, Lw90;->θ:F

    .line 104
    .line 105
    sub-float/2addr p0, p1

    .line 106
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    cmpg-float p0, p0, v1

    .line 111
    .line 112
    if-gtz p0, :cond_0

    .line 113
    .line 114
    const/4 p0, 0x1

    .line 115
    return p0

    .line 116
    :cond_0
    const/4 p0, 0x0

    .line 117
    return p0
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
    instance-of v1, p1, Lw90;

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
    check-cast p1, Lw90;

    .line 12
    .line 13
    iget v1, p0, Lw90;->α:F

    .line 14
    .line 15
    iget v3, p1, Lw90;->α:F

    .line 16
    .line 17
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

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
    iget v1, p0, Lw90;->β:F

    .line 25
    .line 26
    iget v3, p1, Lw90;->β:F

    .line 27
    .line 28
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

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
    iget v1, p0, Lw90;->γ:F

    .line 36
    .line 37
    iget v3, p1, Lw90;->γ:F

    .line 38
    .line 39
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

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
    iget v1, p0, Lw90;->δ:F

    .line 47
    .line 48
    iget v3, p1, Lw90;->δ:F

    .line 49
    .line 50
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget v1, p0, Lw90;->ε:F

    .line 58
    .line 59
    iget v3, p1, Lw90;->ε:F

    .line 60
    .line 61
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget v1, p0, Lw90;->ζ:F

    .line 69
    .line 70
    iget v3, p1, Lw90;->ζ:F

    .line 71
    .line 72
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget v1, p0, Lw90;->η:F

    .line 80
    .line 81
    iget v3, p1, Lw90;->η:F

    .line 82
    .line 83
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget p0, p0, Lw90;->θ:F

    .line 91
    .line 92
    iget p1, p1, Lw90;->θ:F

    .line 93
    .line 94
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lw90;->α:F

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
    iget v2, p0, Lw90;->β:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lw90;->γ:F

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lw90;->δ:F

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lw90;->ε:F

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lw90;->ζ:F

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lw90;->η:F

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget p0, p0, Lw90;->θ:F

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GridBounds(firstVertical="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lw90;->α:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", secondVertical="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lw90;->β:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", firstHorizontal="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lw90;->γ:F

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", secondHorizontal="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lw90;->δ:F

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", leftMargin="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lw90;->ε:F

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", rightMargin="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lw90;->ζ:F

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", topMargin="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v1, p0, Lw90;->η:F

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", bottomMargin="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget p0, p0, Lw90;->θ:F

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p0, ")"

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method

.class public final Lm32;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ll32;

.field public final β:Lg11;

.field public final γ:J

.field public final δ:F

.field public final ε:F

.field public final ζ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll32;Lg11;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm32;->α:Ll32;

    .line 5
    .line 6
    iput-object p2, p0, Lm32;->β:Lg11;

    .line 7
    .line 8
    iput-wide p3, p0, Lm32;->γ:J

    .line 9
    .line 10
    iget-object p1, p2, Lg11;->ε:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    const/4 p4, 0x0

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    move p3, p4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p3, 0x0

    .line 24
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lm91;

    .line 29
    .line 30
    iget-object v0, v0, Lm91;->α:Ls2;

    .line 31
    .line 32
    iget-object v0, v0, Ls2;->δ:Lk32;

    .line 33
    .line 34
    invoke-virtual {v0, p3}, Lk32;->γ(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    :goto_0
    iput p3, p0, Lm32;->δ:F

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-static {p1}, Lxh;->П(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lm91;

    .line 52
    .line 53
    iget-object p3, p1, Lm91;->α:Ls2;

    .line 54
    .line 55
    iget-object p3, p3, Ls2;->δ:Lk32;

    .line 56
    .line 57
    iget p4, p3, Lk32;->ζ:I

    .line 58
    .line 59
    add-int/lit8 p4, p4, -0x1

    .line 60
    .line 61
    invoke-virtual {p3, p4}, Lk32;->γ(I)F

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    iget p1, p1, Lm91;->ζ:F

    .line 66
    .line 67
    add-float p4, p3, p1

    .line 68
    .line 69
    :goto_1
    iput p4, p0, Lm32;->ε:F

    .line 70
    .line 71
    iget-object p1, p2, Lg11;->δ:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    iput-object p1, p0, Lm32;->ζ:Ljava/util/ArrayList;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lm32;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lm32;

    .line 10
    .line 11
    iget-object v0, p1, Lm32;->α:Ll32;

    .line 12
    .line 13
    iget-object v1, p0, Lm32;->α:Ll32;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, Lm32;->β:Lg11;

    .line 23
    .line 24
    iget-object v1, p1, Lm32;->β:Lg11;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget-wide v0, p0, Lm32;->γ:J

    .line 34
    .line 35
    iget-wide v2, p1, Lm32;->γ:J

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, Lbn0;->α(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_4
    iget v0, p0, Lm32;->δ:F

    .line 45
    .line 46
    iget v1, p1, Lm32;->δ:F

    .line 47
    .line 48
    cmpg-float v0, v0, v1

    .line 49
    .line 50
    if-nez v0, :cond_6

    .line 51
    .line 52
    iget v0, p0, Lm32;->ε:F

    .line 53
    .line 54
    iget v1, p1, Lm32;->ε:F

    .line 55
    .line 56
    cmpg-float v0, v0, v1

    .line 57
    .line 58
    if-nez v0, :cond_6

    .line 59
    .line 60
    iget-object p0, p0, Lm32;->ζ:Ljava/util/ArrayList;

    .line 61
    .line 62
    iget-object p1, p1, Lm32;->ζ:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_5

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_5
    :goto_0
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 74
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lm32;->α:Ll32;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll32;->hashCode()I

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
    iget-object v2, p0, Lm32;->β:Lg11;

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
    iget-wide v3, p0, Lm32;->γ:J

    .line 19
    .line 20
    invoke-static {v2, v1, v3, v4}, Llz1;->β(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Lm32;->δ:F

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p0, Lm32;->ε:F

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object p0, p0, Lm32;->ζ:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/2addr p0, v0

    .line 43
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextLayoutResult(layoutInput="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lm32;->α:Ll32;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", multiParagraph="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lm32;->β:Lg11;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", size="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Lm32;->γ:J

    .line 29
    .line 30
    invoke-static {v1, v2}, Lbn0;->β(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", firstBaseline="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget v1, p0, Lm32;->δ:F

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", lastBaseline="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget v1, p0, Lm32;->ε:F

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", placeholderRects="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lm32;->ζ:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const/16 p0, 0x29

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public final α(I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lm32;->β:Lg11;

    .line 2
    .line 3
    iget-object v0, p0, Lg11;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object p0, p0, Lg11;->γ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lb8;

    .line 10
    .line 11
    iget-object p0, p0, Lb8;->β:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lg4;

    .line 14
    .line 15
    iget-object p0, p0, Lg4;->ζ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-lt p1, p0, :cond_0

    .line 22
    .line 23
    invoke-static {v0}, Lyh;->Λ(Ljava/util/List;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-gez p1, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {p1, v0}, Lbd;->ο(ILjava/util/List;)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lm91;

    .line 41
    .line 42
    iget-object v0, p0, Lm91;->α:Ls2;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lm91;->α(I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object v0, v0, Ls2;->δ:Lk32;

    .line 49
    .line 50
    iget-object v0, v0, Lk32;->ε:Landroid/text/Layout;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget p0, p0, Lm91;->δ:I

    .line 57
    .line 58
    add-int/2addr p1, p0

    .line 59
    return p1
.end method

.method public final β(F)I
    .locals 7

    .line 1
    iget-object p0, p0, Lm32;->β:Lg11;

    .line 2
    .line 3
    iget-object p0, p0, Lg11;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    invoke-static {p0}, Lxh;->П(Ljava/util/List;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lm91;

    .line 19
    .line 20
    iget v0, v0, Lm91;->η:F

    .line 21
    .line 22
    cmpl-float v0, p1, v0

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-ltz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v1, v0, -0x1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    sub-int/2addr v0, v2

    .line 39
    move v3, v1

    .line 40
    :goto_0
    if-gt v3, v0, :cond_6

    .line 41
    .line 42
    add-int v4, v3, v0

    .line 43
    .line 44
    ushr-int/2addr v4, v2

    .line 45
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Lm91;

    .line 50
    .line 51
    iget v6, v5, Lm91;->ζ:F

    .line 52
    .line 53
    cmpl-float v6, v6, p1

    .line 54
    .line 55
    if-lez v6, :cond_2

    .line 56
    .line 57
    move v5, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget v5, v5, Lm91;->η:F

    .line 60
    .line 61
    cmpg-float v5, v5, p1

    .line 62
    .line 63
    if-gtz v5, :cond_3

    .line 64
    .line 65
    const/4 v5, -0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move v5, v1

    .line 68
    :goto_1
    if-gez v5, :cond_4

    .line 69
    .line 70
    add-int/lit8 v3, v4, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    if-lez v5, :cond_5

    .line 74
    .line 75
    add-int/lit8 v0, v4, -0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    move v1, v4

    .line 79
    goto :goto_2

    .line 80
    :cond_6
    add-int/2addr v3, v2

    .line 81
    neg-int v1, v3

    .line 82
    :goto_2
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Lm91;

    .line 87
    .line 88
    iget v0, p0, Lm91;->γ:I

    .line 89
    .line 90
    iget v1, p0, Lm91;->δ:I

    .line 91
    .line 92
    iget v2, p0, Lm91;->β:I

    .line 93
    .line 94
    sub-int/2addr v0, v2

    .line 95
    if-nez v0, :cond_7

    .line 96
    .line 97
    return v1

    .line 98
    :cond_7
    iget-object v0, p0, Lm91;->α:Ls2;

    .line 99
    .line 100
    iget p0, p0, Lm91;->ζ:F

    .line 101
    .line 102
    sub-float/2addr p1, p0

    .line 103
    iget-object p0, v0, Ls2;->δ:Lk32;

    .line 104
    .line 105
    float-to-int p1, p1

    .line 106
    iget-object v0, p0, Lk32;->ε:Landroid/text/Layout;

    .line 107
    .line 108
    iget p0, p0, Lk32;->η:I

    .line 109
    .line 110
    sub-int/2addr p1, p0

    .line 111
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    add-int/2addr p0, v1

    .line 116
    return p0
.end method

.method public final γ(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lm32;->β:Lg11;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg11;->β(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lg11;->ε:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p1, p0}, Lbd;->π(ILjava/util/List;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lm91;

    .line 19
    .line 20
    iget-object v0, p0, Lm91;->α:Ls2;

    .line 21
    .line 22
    iget v1, p0, Lm91;->δ:I

    .line 23
    .line 24
    sub-int/2addr p1, v1

    .line 25
    iget-object v0, v0, Ls2;->δ:Lk32;

    .line 26
    .line 27
    iget-object v0, v0, Lk32;->ε:Landroid/text/Layout;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineStart(I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget p0, p0, Lm91;->β:I

    .line 34
    .line 35
    add-int/2addr p1, p0

    .line 36
    return p1
.end method

.method public final δ(I)F
    .locals 2

    .line 1
    iget-object p0, p0, Lm32;->β:Lg11;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg11;->β(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lg11;->ε:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p1, p0}, Lbd;->π(ILjava/util/List;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lm91;

    .line 19
    .line 20
    iget-object v0, p0, Lm91;->α:Ls2;

    .line 21
    .line 22
    iget v1, p0, Lm91;->δ:I

    .line 23
    .line 24
    sub-int/2addr p1, v1

    .line 25
    iget-object v0, v0, Ls2;->δ:Lk32;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lk32;->ζ(I)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget p0, p0, Lm91;->ζ:F

    .line 32
    .line 33
    add-float/2addr p1, p0

    .line 34
    return p1
.end method

.method public final ε(I)Lrn1;
    .locals 3

    .line 1
    iget-object p0, p0, Lm32;->β:Lg11;

    .line 2
    .line 3
    iget-object v0, p0, Lg11;->γ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lb8;

    .line 6
    .line 7
    iget-object v0, v0, Lb8;->β:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lg4;

    .line 10
    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object v1, v0, Lg4;->ζ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-gt p1, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v1, "offset("

    .line 23
    .line 24
    const-string v2, ") is out of bounds [0, "

    .line 25
    .line 26
    invoke-static {p1, v1, v2}, La12;->ζ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v0, v0, Lg4;->ζ:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const/16 v0, 0x5d

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lbm0;->α(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v0, p0, Lg11;->γ:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lb8;

    .line 54
    .line 55
    iget-object v0, v0, Lb8;->β:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lg4;

    .line 58
    .line 59
    iget-object v0, v0, Lg4;->ζ:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object p0, p0, Lg11;->ε:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Ljava/util/ArrayList;

    .line 68
    .line 69
    if-ne p1, v0, :cond_1

    .line 70
    .line 71
    invoke-static {p0}, Lyh;->Λ(Ljava/util/List;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {p1, p0}, Lbd;->ο(ILjava/util/List;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    :goto_1
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, Lm91;

    .line 85
    .line 86
    iget-object v0, p0, Lm91;->α:Ls2;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lm91;->α(I)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    iget-object p1, v0, Ls2;->δ:Lk32;

    .line 93
    .line 94
    iget-object v0, p1, Lk32;->ε:Landroid/text/Layout;

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    iget-object p1, p1, Lk32;->ε:Landroid/text/Layout;

    .line 101
    .line 102
    invoke-virtual {p1, p0}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    const/4 p1, 0x1

    .line 107
    if-ne p0, p1, :cond_2

    .line 108
    .line 109
    sget-object p0, Lrn1;->ε:Lrn1;

    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_2
    sget-object p0, Lrn1;->ζ:Lrn1;

    .line 113
    .line 114
    return-object p0
.end method

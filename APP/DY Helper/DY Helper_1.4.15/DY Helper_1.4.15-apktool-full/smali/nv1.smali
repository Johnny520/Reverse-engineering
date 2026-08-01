.class public final Lnv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:I

.field public final β:I

.field public final γ:I

.field public final δ:I

.field public final ε:I

.field public final ζ:I

.field public final η:I

.field public final θ:I

.field public final ι:I

.field public final κ:I


# direct methods
.method public constructor <init>(IIIIIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnv1;->α:I

    .line 5
    .line 6
    iput p2, p0, Lnv1;->β:I

    .line 7
    .line 8
    iput p3, p0, Lnv1;->γ:I

    .line 9
    .line 10
    iput p4, p0, Lnv1;->δ:I

    .line 11
    .line 12
    iput p5, p0, Lnv1;->ε:I

    .line 13
    .line 14
    iput p6, p0, Lnv1;->ζ:I

    .line 15
    .line 16
    iput p7, p0, Lnv1;->η:I

    .line 17
    .line 18
    iput p8, p0, Lnv1;->θ:I

    .line 19
    .line 20
    iput p9, p0, Lnv1;->ι:I

    .line 21
    .line 22
    iput p10, p0, Lnv1;->κ:I

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
    instance-of v1, p1, Lnv1;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lnv1;

    .line 11
    .line 12
    iget v1, p0, Lnv1;->α:I

    .line 13
    .line 14
    iget v2, p1, Lnv1;->α:I

    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget v1, p0, Lnv1;->β:I

    .line 20
    .line 21
    iget v2, p1, Lnv1;->β:I

    .line 22
    .line 23
    if-eq v1, v2, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget v1, p0, Lnv1;->γ:I

    .line 27
    .line 28
    iget v2, p1, Lnv1;->γ:I

    .line 29
    .line 30
    if-eq v1, v2, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    iget v1, p0, Lnv1;->δ:I

    .line 34
    .line 35
    iget v2, p1, Lnv1;->δ:I

    .line 36
    .line 37
    if-eq v1, v2, :cond_5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_5
    iget v1, p0, Lnv1;->ε:I

    .line 41
    .line 42
    iget v2, p1, Lnv1;->ε:I

    .line 43
    .line 44
    if-eq v1, v2, :cond_6

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_6
    iget v1, p0, Lnv1;->ζ:I

    .line 48
    .line 49
    iget v2, p1, Lnv1;->ζ:I

    .line 50
    .line 51
    if-eq v1, v2, :cond_7

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_7
    iget v1, p0, Lnv1;->η:I

    .line 55
    .line 56
    iget v2, p1, Lnv1;->η:I

    .line 57
    .line 58
    if-eq v1, v2, :cond_8

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_8
    iget v1, p0, Lnv1;->θ:I

    .line 62
    .line 63
    iget v2, p1, Lnv1;->θ:I

    .line 64
    .line 65
    if-eq v1, v2, :cond_9

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_9
    iget v1, p0, Lnv1;->ι:I

    .line 69
    .line 70
    iget v2, p1, Lnv1;->ι:I

    .line 71
    .line 72
    if-eq v1, v2, :cond_a

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_a
    iget p0, p0, Lnv1;->κ:I

    .line 76
    .line 77
    iget p1, p1, Lnv1;->κ:I

    .line 78
    .line 79
    if-eq p0, p1, :cond_b

    .line 80
    .line 81
    :goto_0
    const/4 p0, 0x0

    .line 82
    return p0

    .line 83
    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lnv1;->α:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget v2, p0, Lnv1;->β:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lnv1;->γ:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lnv1;->δ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lnv1;->ε:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lnv1;->ζ:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lnv1;->η:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, Lnv1;->θ:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, Lnv1;->ι:I

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget p0, p0, Lnv1;->κ:I

    .line 59
    .line 60
    invoke-static {p0, v0, v1}, La12;->α(III)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    const/4 v0, -0x1

    .line 65
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    add-int/2addr v0, p0

    .line 70
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", cardEnd="

    .line 2
    .line 3
    const-string v1, ", cardStroke="

    .line 4
    .line 5
    const-string v2, "Colors(cardStart="

    .line 6
    .line 7
    iget v3, p0, Lnv1;->α:I

    .line 8
    .line 9
    iget v4, p0, Lnv1;->β:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", textPrimary="

    .line 16
    .line 17
    const-string v2, ", textSecondary="

    .line 18
    .line 19
    iget v3, p0, Lnv1;->γ:I

    .line 20
    .line 21
    iget v4, p0, Lnv1;->δ:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", textTertiary="

    .line 27
    .line 28
    const-string v2, ", chipBg="

    .line 29
    .line 30
    iget v3, p0, Lnv1;->ε:I

    .line 31
    .line 32
    iget v4, p0, Lnv1;->ζ:I

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", chipText="

    .line 38
    .line 39
    const-string v2, ", actionBg="

    .line 40
    .line 41
    iget v3, p0, Lnv1;->η:I

    .line 42
    .line 43
    iget v4, p0, Lnv1;->θ:I

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lnv1;->ι:I

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", actionStroke="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget p0, p0, Lnv1;->κ:I

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, ", iconText=-1)"

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.class public final Lcb1;
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

.field public final λ:I

.field public final μ:I

.field public final ν:Lrc1;


# direct methods
.method public constructor <init>(IIIIIIIIIIIILrc1;)V
    .locals 0

    .line 1
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lcb1;->α:I

    .line 8
    .line 9
    iput p2, p0, Lcb1;->β:I

    .line 10
    .line 11
    iput p3, p0, Lcb1;->γ:I

    .line 12
    .line 13
    iput p4, p0, Lcb1;->δ:I

    .line 14
    .line 15
    iput p5, p0, Lcb1;->ε:I

    .line 16
    .line 17
    iput p6, p0, Lcb1;->ζ:I

    .line 18
    .line 19
    iput p7, p0, Lcb1;->η:I

    .line 20
    .line 21
    iput p8, p0, Lcb1;->θ:I

    .line 22
    .line 23
    iput p9, p0, Lcb1;->ι:I

    .line 24
    .line 25
    iput p10, p0, Lcb1;->κ:I

    .line 26
    .line 27
    iput p11, p0, Lcb1;->λ:I

    .line 28
    .line 29
    iput p12, p0, Lcb1;->μ:I

    .line 30
    .line 31
    iput-object p13, p0, Lcb1;->ν:Lrc1;

    .line 32
    .line 33
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
    instance-of v1, p1, Lcb1;

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
    check-cast p1, Lcb1;

    .line 12
    .line 13
    iget v1, p0, Lcb1;->α:I

    .line 14
    .line 15
    iget v3, p1, Lcb1;->α:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lcb1;->β:I

    .line 21
    .line 22
    iget v3, p1, Lcb1;->β:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lcb1;->γ:I

    .line 28
    .line 29
    iget v3, p1, Lcb1;->γ:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget v1, p0, Lcb1;->δ:I

    .line 35
    .line 36
    iget v3, p1, Lcb1;->δ:I

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget v1, p0, Lcb1;->ε:I

    .line 42
    .line 43
    iget v3, p1, Lcb1;->ε:I

    .line 44
    .line 45
    if-eq v1, v3, :cond_6

    .line 46
    .line 47
    return v2

    .line 48
    :cond_6
    iget v1, p0, Lcb1;->ζ:I

    .line 49
    .line 50
    iget v3, p1, Lcb1;->ζ:I

    .line 51
    .line 52
    if-eq v1, v3, :cond_7

    .line 53
    .line 54
    return v2

    .line 55
    :cond_7
    iget v1, p0, Lcb1;->η:I

    .line 56
    .line 57
    iget v3, p1, Lcb1;->η:I

    .line 58
    .line 59
    if-eq v1, v3, :cond_8

    .line 60
    .line 61
    return v2

    .line 62
    :cond_8
    iget v1, p0, Lcb1;->θ:I

    .line 63
    .line 64
    iget v3, p1, Lcb1;->θ:I

    .line 65
    .line 66
    if-eq v1, v3, :cond_9

    .line 67
    .line 68
    return v2

    .line 69
    :cond_9
    iget v1, p0, Lcb1;->ι:I

    .line 70
    .line 71
    iget v3, p1, Lcb1;->ι:I

    .line 72
    .line 73
    if-eq v1, v3, :cond_a

    .line 74
    .line 75
    return v2

    .line 76
    :cond_a
    iget v1, p0, Lcb1;->κ:I

    .line 77
    .line 78
    iget v3, p1, Lcb1;->κ:I

    .line 79
    .line 80
    if-eq v1, v3, :cond_b

    .line 81
    .line 82
    return v2

    .line 83
    :cond_b
    iget v1, p0, Lcb1;->λ:I

    .line 84
    .line 85
    iget v3, p1, Lcb1;->λ:I

    .line 86
    .line 87
    if-eq v1, v3, :cond_c

    .line 88
    .line 89
    return v2

    .line 90
    :cond_c
    iget v1, p0, Lcb1;->μ:I

    .line 91
    .line 92
    iget v3, p1, Lcb1;->μ:I

    .line 93
    .line 94
    if-eq v1, v3, :cond_d

    .line 95
    .line 96
    return v2

    .line 97
    :cond_d
    iget-object p0, p0, Lcb1;->ν:Lrc1;

    .line 98
    .line 99
    iget-object p1, p1, Lcb1;->ν:Lrc1;

    .line 100
    .line 101
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-nez p0, :cond_e

    .line 106
    .line 107
    return v2

    .line 108
    :cond_e
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcb1;->α:I

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
    iget v2, p0, Lcb1;->β:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcb1;->γ:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcb1;->δ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lcb1;->ε:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lcb1;->ζ:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lcb1;->η:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, Lcb1;->θ:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, Lcb1;->ι:I

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, Lcb1;->κ:I

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, Lcb1;->λ:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v2, p0, Lcb1;->μ:I

    .line 71
    .line 72
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object p0, p0, Lcb1;->ν:Lrc1;

    .line 77
    .line 78
    invoke-virtual {p0}, Lrc1;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int/2addr p0, v0

    .line 83
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", plots="

    .line 2
    .line 3
    const-string v1, ", harvested="

    .line 4
    .line 5
    const-string v2, "Snapshot(people="

    .line 6
    .line 7
    iget v3, p0, Lcb1;->α:I

    .line 8
    .line 9
    iget v4, p0, Lcb1;->β:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", planted="

    .line 16
    .line 17
    const-string v2, ", watered="

    .line 18
    .line 19
    iget v3, p0, Lcb1;->γ:I

    .line 20
    .line 21
    iget v4, p0, Lcb1;->δ:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", skipped="

    .line 27
    .line 28
    const-string v2, ", failures="

    .line 29
    .line 30
    iget v3, p0, Lcb1;->ε:I

    .line 31
    .line 32
    iget v4, p0, Lcb1;->ζ:I

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", completedPeople="

    .line 38
    .line 39
    const-string v2, ", processedOperations="

    .line 40
    .line 41
    iget v3, p0, Lcb1;->η:I

    .line 42
    .line 43
    iget v4, p0, Lcb1;->θ:I

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", totalOperations="

    .line 49
    .line 50
    const-string v2, ", successfulOperations="

    .line 51
    .line 52
    iget v3, p0, Lcb1;->ι:I

    .line 53
    .line 54
    iget v4, p0, Lcb1;->κ:I

    .line 55
    .line 56
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", failedOperations="

    .line 60
    .line 61
    const-string v2, ", quota="

    .line 62
    .line 63
    iget v3, p0, Lcb1;->λ:I

    .line 64
    .line 65
    iget v4, p0, Lcb1;->μ:I

    .line 66
    .line 67
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, Lcb1;->ν:Lrc1;

    .line 71
    .line 72
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p0, ")"

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0
.end method

.method public final α()I
    .locals 0

    .line 1
    iget p0, p0, Lcb1;->γ:I

    .line 2
    .line 3
    return p0
.end method

.method public final β()I
    .locals 0

    .line 1
    iget p0, p0, Lcb1;->δ:I

    .line 2
    .line 3
    return p0
.end method

.method public final γ()I
    .locals 0

    .line 1
    iget p0, p0, Lcb1;->ε:I

    .line 2
    .line 3
    return p0
.end method

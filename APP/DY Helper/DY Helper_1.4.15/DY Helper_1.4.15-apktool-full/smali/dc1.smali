.class public final Ldc1;
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

.field public final θ:Z

.field public final ι:Z


# direct methods
.method public constructor <init>(IIIIIIIZI)V
    .locals 2

    .line 1
    and-int/lit8 v0, p9, 0x4

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p3, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p9, 0x8

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move p4, v1

    .line 12
    :cond_1
    and-int/lit8 v0, p9, 0x10

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    move p5, v1

    .line 17
    :cond_2
    and-int/lit8 v0, p9, 0x20

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    move p6, v1

    .line 22
    :cond_3
    and-int/lit16 v0, p9, 0x80

    .line 23
    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    move p8, v1

    .line 27
    :cond_4
    and-int/lit16 p9, p9, 0x100

    .line 28
    .line 29
    if-eqz p9, :cond_5

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_5
    const/4 v1, 0x1

    .line 33
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput p1, p0, Ldc1;->α:I

    .line 37
    .line 38
    iput p2, p0, Ldc1;->β:I

    .line 39
    .line 40
    iput p3, p0, Ldc1;->γ:I

    .line 41
    .line 42
    iput p4, p0, Ldc1;->δ:I

    .line 43
    .line 44
    iput p5, p0, Ldc1;->ε:I

    .line 45
    .line 46
    iput p6, p0, Ldc1;->ζ:I

    .line 47
    .line 48
    iput p7, p0, Ldc1;->η:I

    .line 49
    .line 50
    iput-boolean p8, p0, Ldc1;->θ:Z

    .line 51
    .line 52
    iput-boolean v1, p0, Ldc1;->ι:Z

    .line 53
    .line 54
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
    instance-of v1, p1, Ldc1;

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
    check-cast p1, Ldc1;

    .line 12
    .line 13
    iget v1, p0, Ldc1;->α:I

    .line 14
    .line 15
    iget v3, p1, Ldc1;->α:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Ldc1;->β:I

    .line 21
    .line 22
    iget v3, p1, Ldc1;->β:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Ldc1;->γ:I

    .line 28
    .line 29
    iget v3, p1, Ldc1;->γ:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget v1, p0, Ldc1;->δ:I

    .line 35
    .line 36
    iget v3, p1, Ldc1;->δ:I

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget v1, p0, Ldc1;->ε:I

    .line 42
    .line 43
    iget v3, p1, Ldc1;->ε:I

    .line 44
    .line 45
    if-eq v1, v3, :cond_6

    .line 46
    .line 47
    return v2

    .line 48
    :cond_6
    iget v1, p0, Ldc1;->ζ:I

    .line 49
    .line 50
    iget v3, p1, Ldc1;->ζ:I

    .line 51
    .line 52
    if-eq v1, v3, :cond_7

    .line 53
    .line 54
    return v2

    .line 55
    :cond_7
    iget v1, p0, Ldc1;->η:I

    .line 56
    .line 57
    iget v3, p1, Ldc1;->η:I

    .line 58
    .line 59
    if-eq v1, v3, :cond_8

    .line 60
    .line 61
    return v2

    .line 62
    :cond_8
    iget-boolean v1, p0, Ldc1;->θ:Z

    .line 63
    .line 64
    iget-boolean v3, p1, Ldc1;->θ:Z

    .line 65
    .line 66
    if-eq v1, v3, :cond_9

    .line 67
    .line 68
    return v2

    .line 69
    :cond_9
    iget-boolean p0, p0, Ldc1;->ι:Z

    .line 70
    .line 71
    iget-boolean p1, p1, Ldc1;->ι:Z

    .line 72
    .line 73
    if-eq p0, p1, :cond_a

    .line 74
    .line 75
    return v2

    .line 76
    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Ldc1;->α:I

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
    iget v2, p0, Ldc1;->β:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Ldc1;->γ:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Ldc1;->δ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Ldc1;->ε:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Ldc1;->ζ:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Ldc1;->η:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Ldc1;->θ:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean p0, p0, Ldc1;->ι:Z

    .line 53
    .line 54
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    add-int/2addr p0, v0

    .line 59
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
    const-string v2, "BatchSummary(people="

    .line 6
    .line 7
    iget v3, p0, Ldc1;->α:I

    .line 8
    .line 9
    iget v4, p0, Ldc1;->β:I

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
    iget v3, p0, Ldc1;->γ:I

    .line 20
    .line 21
    iget v4, p0, Ldc1;->δ:I

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
    iget v3, p0, Ldc1;->ε:I

    .line 31
    .line 32
    iget v4, p0, Ldc1;->ζ:I

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v1, p0, Ldc1;->η:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", cancelled="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-boolean v1, p0, Ldc1;->θ:Z

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", rejectedAsBusy="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ")"

    .line 58
    .line 59
    iget-boolean p0, p0, Ldc1;->ι:Z

    .line 60
    .line 61
    invoke-static {v0, p0, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method public final α()Ljava/lang/String;
    .locals 6

    .line 1
    iget-boolean v0, p0, Ldc1;->ι:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p0, "\u5df2\u6709\u8425\u5730\u5199\u4efb\u52a1\u6b63\u5728\u6267\u884c\uff0c\u672c\u6b21\u672a\u91cd\u590d\u542f\u52a8"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-boolean v0, p0, Ldc1;->θ:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string v0, "\uff0c\u5df2\u53d6\u6d88"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, ""

    .line 16
    .line 17
    :goto_0
    const-string v1, "\uff0c\u5730\u5757 "

    .line 18
    .line 19
    const-string v2, "\uff0c\u6536\u83dc "

    .line 20
    .line 21
    const-string v3, "\u4eba\u5458 "

    .line 22
    .line 23
    iget v4, p0, Ldc1;->α:I

    .line 24
    .line 25
    iget v5, p0, Ldc1;->β:I

    .line 26
    .line 27
    invoke-static {v3, v4, v1, v5, v2}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "\uff0c\u79cd\u5730 "

    .line 32
    .line 33
    const-string v3, "\uff0c\u6d47\u6c34 "

    .line 34
    .line 35
    iget v4, p0, Ldc1;->γ:I

    .line 36
    .line 37
    iget v5, p0, Ldc1;->δ:I

    .line 38
    .line 39
    invoke-static {v1, v4, v2, v5, v3}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "\uff0c\u8df3\u8fc7 "

    .line 43
    .line 44
    const-string v3, "\uff0c\u5931\u8d25 "

    .line 45
    .line 46
    iget v4, p0, Ldc1;->ε:I

    .line 47
    .line 48
    iget v5, p0, Ldc1;->ζ:I

    .line 49
    .line 50
    invoke-static {v1, v4, v2, v5, v3}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget p0, p0, Ldc1;->η:I

    .line 54
    .line 55
    invoke-static {v1, p0, v0}, Lnx;->κ(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

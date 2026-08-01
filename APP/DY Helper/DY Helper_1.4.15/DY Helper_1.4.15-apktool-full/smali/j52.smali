.class public final Lj52;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Ljava/lang/String;

.field public final γ:I

.field public final δ:I

.field public final ε:I

.field public final ζ:I

.field public final η:Z

.field public final θ:Z

.field public final ι:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIIZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj52;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lj52;->β:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lj52;->γ:I

    .line 9
    .line 10
    iput p4, p0, Lj52;->δ:I

    .line 11
    .line 12
    iput p5, p0, Lj52;->ε:I

    .line 13
    .line 14
    iput p6, p0, Lj52;->ζ:I

    .line 15
    .line 16
    iput-boolean p7, p0, Lj52;->η:Z

    .line 17
    .line 18
    iput-boolean p8, p0, Lj52;->θ:Z

    .line 19
    .line 20
    iput-boolean p9, p0, Lj52;->ι:Z

    .line 21
    .line 22
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
    instance-of v0, p1, Lj52;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lj52;

    .line 10
    .line 11
    iget-object v0, p0, Lj52;->α:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lj52;->α:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lj52;->β:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, Lj52;->β:Ljava/lang/String;

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
    goto :goto_0

    .line 33
    :cond_3
    iget v0, p0, Lj52;->γ:I

    .line 34
    .line 35
    iget v1, p1, Lj52;->γ:I

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget v0, p0, Lj52;->δ:I

    .line 41
    .line 42
    iget v1, p1, Lj52;->δ:I

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget v0, p0, Lj52;->ε:I

    .line 48
    .line 49
    iget v1, p1, Lj52;->ε:I

    .line 50
    .line 51
    if-eq v0, v1, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget v0, p0, Lj52;->ζ:I

    .line 55
    .line 56
    iget v1, p1, Lj52;->ζ:I

    .line 57
    .line 58
    if-eq v0, v1, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-boolean v0, p0, Lj52;->η:Z

    .line 62
    .line 63
    iget-boolean v1, p1, Lj52;->η:Z

    .line 64
    .line 65
    if-eq v0, v1, :cond_8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    iget-boolean v0, p0, Lj52;->θ:Z

    .line 69
    .line 70
    iget-boolean v1, p1, Lj52;->θ:Z

    .line 71
    .line 72
    if-eq v0, v1, :cond_9

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_9
    iget-boolean p0, p0, Lj52;->ι:Z

    .line 76
    .line 77
    iget-boolean p1, p1, Lj52;->ι:Z

    .line 78
    .line 79
    if-eq p0, p1, :cond_a

    .line 80
    .line 81
    :goto_0
    const/4 p0, 0x0

    .line 82
    return p0

    .line 83
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 84
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lj52;->α:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Lj52;->β:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lj52;->γ:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lj52;->δ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lj52;->ε:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lj52;->ζ:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lj52;->η:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lj52;->θ:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean p0, p0, Lj52;->ι:Z

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
    const-string v0, ", viewClass="

    .line 2
    .line 3
    const-string v1, ", x="

    .line 4
    .line 5
    const-string v2, "DetectedTab(text="

    .line 6
    .line 7
    iget-object v3, p0, Lj52;->α:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lj52;->β:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", y="

    .line 16
    .line 17
    const-string v2, ", width="

    .line 18
    .line 19
    iget v3, p0, Lj52;->γ:I

    .line 20
    .line 21
    iget v4, p0, Lj52;->δ:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", height="

    .line 27
    .line 28
    const-string v2, ", isKnown="

    .line 29
    .line 30
    iget v3, p0, Lj52;->ε:I

    .line 31
    .line 32
    iget v4, p0, Lj52;->ζ:I

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", isProtected="

    .line 38
    .line 39
    const-string v2, ", willHide="

    .line 40
    .line 41
    iget-boolean v3, p0, Lj52;->η:Z

    .line 42
    .line 43
    iget-boolean v4, p0, Lj52;->θ:Z

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Δ(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, ")"

    .line 49
    .line 50
    iget-boolean p0, p0, Lj52;->ι:Z

    .line 51
    .line 52
    invoke-static {v0, p0, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

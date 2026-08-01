.class public final Lxw;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Z

.field public final β:I

.field public final γ:Z

.field public final δ:Z

.field public final ε:Ljava/lang/String;

.field public final ζ:Z

.field public final η:I

.field public final θ:Z

.field public final ι:Z


# direct methods
.method public constructor <init>(ZIZZLjava/lang/String;ZIZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lxw;->α:Z

    .line 5
    .line 6
    iput p2, p0, Lxw;->β:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lxw;->γ:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lxw;->δ:Z

    .line 11
    .line 12
    iput-object p5, p0, Lxw;->ε:Ljava/lang/String;

    .line 13
    .line 14
    iput-boolean p6, p0, Lxw;->ζ:Z

    .line 15
    .line 16
    iput p7, p0, Lxw;->η:I

    .line 17
    .line 18
    iput-boolean p8, p0, Lxw;->θ:Z

    .line 19
    .line 20
    iput-boolean p9, p0, Lxw;->ι:Z

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
    instance-of v0, p1, Lxw;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lxw;

    .line 10
    .line 11
    iget-boolean v0, p0, Lxw;->α:Z

    .line 12
    .line 13
    iget-boolean v1, p1, Lxw;->α:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, Lxw;->β:I

    .line 19
    .line 20
    iget v1, p1, Lxw;->β:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-boolean v0, p0, Lxw;->γ:Z

    .line 26
    .line 27
    iget-boolean v1, p1, Lxw;->γ:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-boolean v0, p0, Lxw;->δ:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Lxw;->δ:Z

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-object v0, p0, Lxw;->ε:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p1, Lxw;->ε:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_6

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_6
    iget-boolean v0, p0, Lxw;->ζ:Z

    .line 51
    .line 52
    iget-boolean v1, p1, Lxw;->ζ:Z

    .line 53
    .line 54
    if-eq v0, v1, :cond_7

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_7
    iget v0, p0, Lxw;->η:I

    .line 58
    .line 59
    iget v1, p1, Lxw;->η:I

    .line 60
    .line 61
    if-eq v0, v1, :cond_8

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_8
    iget-boolean v0, p0, Lxw;->θ:Z

    .line 65
    .line 66
    iget-boolean v1, p1, Lxw;->θ:Z

    .line 67
    .line 68
    if-eq v0, v1, :cond_9

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_9
    iget-boolean p0, p0, Lxw;->ι:Z

    .line 72
    .line 73
    iget-boolean p1, p1, Lxw;->ι:Z

    .line 74
    .line 75
    if-eq p0, p1, :cond_a

    .line 76
    .line 77
    :goto_0
    const/4 p0, 0x0

    .line 78
    return p0

    .line 79
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 80
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lxw;->α:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget v2, p0, Lxw;->β:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lxw;->γ:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lxw;->δ:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lxw;->ε:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, Lxw;->ζ:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lxw;->η:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lxw;->θ:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean p0, p0, Lxw;->ι:Z

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AlertConfig(enabled="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lxw;->α:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", minutes="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lxw;->β:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", repeat="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", vibrate="

    .line 29
    .line 30
    const-string v2, ", message="

    .line 31
    .line 32
    iget-boolean v3, p0, Lxw;->γ:Z

    .line 33
    .line 34
    iget-boolean v4, p0, Lxw;->δ:Z

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Δ(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lxw;->ε:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", idleExitEnabled="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-boolean v1, p0, Lxw;->ζ:Z

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", idleExitMinutes="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget v1, p0, Lxw;->η:I

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", idleLockScreen="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-boolean v1, p0, Lxw;->θ:Z

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", idleShowCountdown="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ")"

    .line 80
    .line 81
    iget-boolean p0, p0, Lxw;->ι:Z

    .line 82
    .line 83
    invoke-static {v0, p0, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method

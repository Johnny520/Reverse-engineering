.class public final Lj71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Ljava/lang/String;

.field public final γ:Z

.field public final δ:I

.field public final ε:Ljava/lang/String;

.field public final ζ:Ljava/lang/String;

.field public final η:Z

.field public final θ:Lp70;

.field public final ι:Lp70;

.field public final κ:Ljava/lang/String;

.field public final λ:Z

.field public final μ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V
    .locals 4

    .line 1
    and-int/lit8 v0, p11, 0x4

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p3, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p11, 0x40

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move p7, v2

    .line 13
    :cond_1
    and-int/lit16 v0, p11, 0x100

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    move-object p9, v3

    .line 19
    :cond_2
    and-int/lit16 v0, p11, 0x200

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    move-object p10, v3

    .line 24
    :cond_3
    and-int/lit16 v0, p11, 0x400

    .line 25
    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    move v0, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_4
    move v0, v2

    .line 31
    :goto_0
    and-int/lit16 p11, p11, 0x800

    .line 32
    .line 33
    if-eqz p11, :cond_5

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_5
    move v1, v2

    .line 37
    :goto_1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lj71;->α:Ljava/lang/String;

    .line 47
    .line 48
    iput-object p2, p0, Lj71;->β:Ljava/lang/String;

    .line 49
    .line 50
    iput-boolean p3, p0, Lj71;->γ:Z

    .line 51
    .line 52
    iput p4, p0, Lj71;->δ:I

    .line 53
    .line 54
    iput-object p5, p0, Lj71;->ε:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p6, p0, Lj71;->ζ:Ljava/lang/String;

    .line 57
    .line 58
    iput-boolean p7, p0, Lj71;->η:Z

    .line 59
    .line 60
    iput-object p8, p0, Lj71;->θ:Lp70;

    .line 61
    .line 62
    iput-object p9, p0, Lj71;->ι:Lp70;

    .line 63
    .line 64
    iput-object p10, p0, Lj71;->κ:Ljava/lang/String;

    .line 65
    .line 66
    iput-boolean v0, p0, Lj71;->λ:Z

    .line 67
    .line 68
    iput-boolean v1, p0, Lj71;->μ:Z

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lj71;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lj71;

    .line 12
    .line 13
    iget-object v0, p0, Lj71;->α:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lj71;->α:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Lj71;->β:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, Lj71;->β:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-boolean v0, p0, Lj71;->γ:Z

    .line 37
    .line 38
    iget-boolean v1, p1, Lj71;->γ:Z

    .line 39
    .line 40
    if-eq v0, v1, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget v0, p0, Lj71;->δ:I

    .line 44
    .line 45
    iget v1, p1, Lj71;->δ:I

    .line 46
    .line 47
    if-eq v0, v1, :cond_5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_5
    iget-object v0, p0, Lj71;->ε:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, Lj71;->ε:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_6

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_6
    iget-object v0, p0, Lj71;->ζ:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, p1, Lj71;->ζ:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_7

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_7
    iget-boolean v0, p0, Lj71;->η:Z

    .line 73
    .line 74
    iget-boolean v1, p1, Lj71;->η:Z

    .line 75
    .line 76
    if-eq v0, v1, :cond_8

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_8
    iget-object v0, p0, Lj71;->θ:Lp70;

    .line 80
    .line 81
    iget-object v1, p1, Lj71;->θ:Lp70;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_9

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_9
    iget-object v0, p0, Lj71;->ι:Lp70;

    .line 91
    .line 92
    iget-object v1, p1, Lj71;->ι:Lp70;

    .line 93
    .line 94
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_a

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_a
    iget-object v0, p0, Lj71;->κ:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v1, p1, Lj71;->κ:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_b

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_b
    iget-boolean v0, p0, Lj71;->λ:Z

    .line 113
    .line 114
    iget-boolean v1, p1, Lj71;->λ:Z

    .line 115
    .line 116
    if-eq v0, v1, :cond_c

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_c
    iget-boolean p0, p0, Lj71;->μ:Z

    .line 120
    .line 121
    iget-boolean p1, p1, Lj71;->μ:Z

    .line 122
    .line 123
    if-eq p0, p1, :cond_d

    .line 124
    .line 125
    :goto_0
    const/4 p0, 0x0

    .line 126
    return p0

    .line 127
    :cond_d
    :goto_1
    const/4 p0, 0x1

    .line 128
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lj71;->α:Ljava/lang/String;

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
    iget-object v2, p0, Lj71;->β:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lj71;->γ:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lj71;->δ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lj71;->ε:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lj71;->ζ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lj71;->η:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lj71;->θ:Lp70;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-int/2addr v2, v0

    .line 53
    mul-int/2addr v2, v1

    .line 54
    const/4 v0, 0x0

    .line 55
    iget-object v3, p0, Lj71;->ι:Lp70;

    .line 56
    .line 57
    if-nez v3, :cond_0

    .line 58
    .line 59
    move v3, v0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    :goto_0
    add-int/2addr v2, v3

    .line 66
    mul-int/2addr v2, v1

    .line 67
    iget-object v3, p0, Lj71;->κ:Ljava/lang/String;

    .line 68
    .line 69
    if-nez v3, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    :goto_1
    add-int/2addr v2, v0

    .line 77
    mul-int/2addr v2, v1

    .line 78
    iget-boolean v0, p0, Lj71;->λ:Z

    .line 79
    .line 80
    invoke-static {v2, v1, v0}, Llz1;->γ(IIZ)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean p0, p0, Lj71;->μ:Z

    .line 85
    .line 86
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    add-int/2addr p0, v0

    .line 91
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", subtitle="

    .line 2
    .line 3
    const-string v1, ", isPrimary="

    .line 4
    .line 5
    const-string v2, "ActionItem(title="

    .line 6
    .line 7
    iget-object v3, p0, Lj71;->α:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lj71;->β:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v1, p0, Lj71;->γ:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", iconRes="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lj71;->δ:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", iconBg="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", iconTint="

    .line 36
    .line 37
    const-string v2, ", locked="

    .line 38
    .line 39
    iget-object v3, p0, Lj71;->ε:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v4, p0, Lj71;->ζ:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-boolean v1, p0, Lj71;->η:Z

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", onClick="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lj71;->θ:Lp70;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", onLongClick="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lj71;->ι:Lp70;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", secondaryActionLabel="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lj71;->κ:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ", quickActionEligible="

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-boolean v1, p0, Lj71;->λ:Z

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v1, ", sharePanelEligible="

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-boolean p0, p0, Lj71;->μ:Z

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p0, ")"

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
.end method

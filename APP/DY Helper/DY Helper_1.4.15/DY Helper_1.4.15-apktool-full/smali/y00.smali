.class public final Ly00;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Ljava/lang/String;

.field public final γ:Ljava/lang/String;

.field public final δ:Ljava/lang/String;

.field public final ε:Ljava/lang/String;

.field public final ζ:I

.field public final η:I

.field public final θ:I

.field public final ι:I

.field public final κ:Ljava/lang/String;

.field public final λ:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly00;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ly00;->β:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ly00;->γ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Ly00;->δ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Ly00;->ε:Ljava/lang/String;

    .line 13
    .line 14
    iput p6, p0, Ly00;->ζ:I

    .line 15
    .line 16
    iput p7, p0, Ly00;->η:I

    .line 17
    .line 18
    iput p8, p0, Ly00;->θ:I

    .line 19
    .line 20
    iput p9, p0, Ly00;->ι:I

    .line 21
    .line 22
    iput-object p10, p0, Ly00;->κ:Ljava/lang/String;

    .line 23
    .line 24
    iput-wide p11, p0, Ly00;->λ:J

    .line 25
    .line 26
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
    instance-of v0, p1, Ly00;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Ly00;

    .line 12
    .line 13
    iget-object v0, p0, Ly00;->α:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Ly00;->α:Ljava/lang/String;

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
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, Ly00;->β:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p1, Ly00;->β:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-object v0, p0, Ly00;->γ:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p1, Ly00;->γ:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget-object v0, p0, Ly00;->δ:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, p1, Ly00;->δ:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget-object v0, p0, Ly00;->ε:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p1, Ly00;->ε:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_6
    iget v0, p0, Ly00;->ζ:I

    .line 69
    .line 70
    iget v1, p1, Ly00;->ζ:I

    .line 71
    .line 72
    if-eq v0, v1, :cond_7

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_7
    iget v0, p0, Ly00;->η:I

    .line 76
    .line 77
    iget v1, p1, Ly00;->η:I

    .line 78
    .line 79
    if-eq v0, v1, :cond_8

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_8
    iget v0, p0, Ly00;->θ:I

    .line 83
    .line 84
    iget v1, p1, Ly00;->θ:I

    .line 85
    .line 86
    if-eq v0, v1, :cond_9

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_9
    iget v0, p0, Ly00;->ι:I

    .line 90
    .line 91
    iget v1, p1, Ly00;->ι:I

    .line 92
    .line 93
    if-eq v0, v1, :cond_a

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_a
    iget-object v0, p0, Ly00;->κ:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v1, p1, Ly00;->κ:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_b

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_b
    iget-wide v0, p0, Ly00;->λ:J

    .line 108
    .line 109
    iget-wide p0, p1, Ly00;->λ:J

    .line 110
    .line 111
    cmp-long p0, v0, p0

    .line 112
    .line 113
    if-eqz p0, :cond_c

    .line 114
    .line 115
    :goto_0
    const/4 p0, 0x0

    .line 116
    return p0

    .line 117
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 118
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Ly00;->α:Ljava/lang/String;

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, Ly00;->β:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget-object v3, p0, Ly00;->γ:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    move v3, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :goto_1
    add-int/2addr v0, v3

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-object v3, p0, Ly00;->δ:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    move v3, v2

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    :goto_2
    add-int/2addr v0, v3

    .line 46
    mul-int/2addr v0, v1

    .line 47
    iget-object v3, p0, Ly00;->ε:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    move v3, v2

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    :goto_3
    add-int/2addr v0, v3

    .line 58
    mul-int/2addr v0, v1

    .line 59
    iget v3, p0, Ly00;->ζ:I

    .line 60
    .line 61
    invoke-static {v3, v0, v1}, La12;->α(III)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget v3, p0, Ly00;->η:I

    .line 66
    .line 67
    invoke-static {v3, v0, v1}, La12;->α(III)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget v3, p0, Ly00;->θ:I

    .line 72
    .line 73
    invoke-static {v3, v0, v1}, La12;->α(III)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget v3, p0, Ly00;->ι:I

    .line 78
    .line 79
    invoke-static {v3, v0, v1}, La12;->α(III)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-object v3, p0, Ly00;->κ:Ljava/lang/String;

    .line 84
    .line 85
    if-nez v3, :cond_4

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    :goto_4
    add-int/2addr v0, v2

    .line 93
    mul-int/2addr v0, v1

    .line 94
    iget-wide v1, p0, Ly00;->λ:J

    .line 95
    .line 96
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    add-int/2addr p0, v0

    .line 101
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", uniqueId="

    .line 2
    .line 3
    const-string v1, ", uid="

    .line 4
    .line 5
    const-string v2, "AuthorData(nickname="

    .line 6
    .line 7
    iget-object v3, p0, Ly00;->α:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Ly00;->β:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", secUid="

    .line 16
    .line 17
    const-string v2, ", signature="

    .line 18
    .line 19
    iget-object v3, p0, Ly00;->γ:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Ly00;->δ:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Ly00;->ε:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", followerCount="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget v1, p0, Ly00;->ζ:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", followingCount="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", awemeCount="

    .line 47
    .line 48
    const-string v2, ", verificationType="

    .line 49
    .line 50
    iget v3, p0, Ly00;->η:I

    .line 51
    .line 52
    iget v4, p0, Ly00;->θ:I

    .line 53
    .line 54
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v1, ", ipLocation="

    .line 58
    .line 59
    const-string v2, ", liveStatus="

    .line 60
    .line 61
    iget v3, p0, Ly00;->ι:I

    .line 62
    .line 63
    iget-object v4, p0, Ly00;->κ:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v3, v1, v4, v2}, Llz1;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-wide v1, p0, Ly00;->λ:J

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p0, ")"

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method

.method public final α()I
    .locals 0

    .line 1
    iget p0, p0, Ly00;->θ:I

    .line 2
    .line 3
    return p0
.end method

.method public final β()I
    .locals 0

    .line 1
    iget p0, p0, Ly00;->ζ:I

    .line 2
    .line 3
    return p0
.end method

.method public final γ()I
    .locals 0

    .line 1
    iget p0, p0, Ly00;->η:I

    .line 2
    .line 3
    return p0
.end method

.method public final δ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ly00;->κ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ε()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ly00;->λ:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final ζ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ly00;->α:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final η()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ly00;->ε:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final θ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ly00;->β:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ι()I
    .locals 0

    .line 1
    iget p0, p0, Ly00;->ι:I

    .line 2
    .line 3
    return p0
.end method

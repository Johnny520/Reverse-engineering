.class public final Lv10;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Z

.field public β:F

.field public γ:F

.field public δ:J

.field public ε:Ljava/lang/String;

.field public ζ:Ljava/lang/String;

.field public η:Z

.field public θ:Z

.field public ι:Landroid/view/View;

.field public κ:Ljava/lang/Runnable;

.field public λ:J

.field public μ:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lv10;->α:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lv10;->β:F

    .line 9
    .line 10
    iput v1, p0, Lv10;->γ:F

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    iput-wide v1, p0, Lv10;->δ:J

    .line 15
    .line 16
    const-string v3, ""

    .line 17
    .line 18
    iput-object v3, p0, Lv10;->ε:Ljava/lang/String;

    .line 19
    .line 20
    const-string v3, "\u65e0"

    .line 21
    .line 22
    iput-object v3, p0, Lv10;->ζ:Ljava/lang/String;

    .line 23
    .line 24
    iput-boolean v0, p0, Lv10;->η:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lv10;->θ:Z

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    iput-object v3, p0, Lv10;->ι:Landroid/view/View;

    .line 30
    .line 31
    iput-object v3, p0, Lv10;->κ:Ljava/lang/Runnable;

    .line 32
    .line 33
    iput-wide v1, p0, Lv10;->λ:J

    .line 34
    .line 35
    iput-boolean v0, p0, Lv10;->μ:Z

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lv10;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lv10;

    .line 12
    .line 13
    iget-boolean v0, p0, Lv10;->α:Z

    .line 14
    .line 15
    iget-boolean v1, p1, Lv10;->α:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget v0, p0, Lv10;->β:F

    .line 22
    .line 23
    iget v1, p1, Lv10;->β:F

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget v0, p0, Lv10;->γ:F

    .line 33
    .line 34
    iget v1, p1, Lv10;->γ:F

    .line 35
    .line 36
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

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
    iget-wide v0, p0, Lv10;->δ:J

    .line 44
    .line 45
    iget-wide v2, p1, Lv10;->δ:J

    .line 46
    .line 47
    cmp-long v0, v0, v2

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    iget-object v0, p0, Lv10;->ε:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v1, p1, Lv10;->ε:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_6

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_6
    iget-object v0, p0, Lv10;->ζ:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v1, p1, Lv10;->ζ:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_7

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_7
    iget-boolean v0, p0, Lv10;->η:Z

    .line 75
    .line 76
    iget-boolean v1, p1, Lv10;->η:Z

    .line 77
    .line 78
    if-eq v0, v1, :cond_8

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_8
    iget-boolean v0, p0, Lv10;->θ:Z

    .line 82
    .line 83
    iget-boolean v1, p1, Lv10;->θ:Z

    .line 84
    .line 85
    if-eq v0, v1, :cond_9

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_9
    iget-object v0, p0, Lv10;->ι:Landroid/view/View;

    .line 89
    .line 90
    iget-object v1, p1, Lv10;->ι:Landroid/view/View;

    .line 91
    .line 92
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_a

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_a
    iget-object v0, p0, Lv10;->κ:Ljava/lang/Runnable;

    .line 100
    .line 101
    iget-object v1, p1, Lv10;->κ:Ljava/lang/Runnable;

    .line 102
    .line 103
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_b

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_b
    iget-wide v0, p0, Lv10;->λ:J

    .line 111
    .line 112
    iget-wide v2, p1, Lv10;->λ:J

    .line 113
    .line 114
    cmp-long v0, v0, v2

    .line 115
    .line 116
    if-eqz v0, :cond_c

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_c
    iget-boolean p0, p0, Lv10;->μ:Z

    .line 120
    .line 121
    iget-boolean p1, p1, Lv10;->μ:Z

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
    iget-boolean v0, p0, Lv10;->α:Z

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
    iget v2, p0, Lv10;->β:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lv10;->γ:F

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, Lv10;->δ:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lv10;->ε:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lv10;->ζ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lv10;->η:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lv10;->θ:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lv10;->ι:Landroid/view/View;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    move v2, v3

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_0
    add-int/2addr v0, v2

    .line 64
    mul-int/2addr v0, v1

    .line 65
    iget-object v2, p0, Lv10;->κ:Ljava/lang/Runnable;

    .line 66
    .line 67
    if-nez v2, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    :goto_1
    add-int/2addr v0, v3

    .line 75
    mul-int/2addr v0, v1

    .line 76
    iget-wide v2, p0, Lv10;->λ:J

    .line 77
    .line 78
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-boolean p0, p0, Lv10;->μ:Z

    .line 83
    .line 84
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    add-int/2addr p0, v0

    .line 89
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    .line 1
    iget-boolean v0, p0, Lv10;->α:Z

    .line 2
    .line 3
    iget v1, p0, Lv10;->β:F

    .line 4
    .line 5
    iget v2, p0, Lv10;->γ:F

    .line 6
    .line 7
    iget-wide v3, p0, Lv10;->δ:J

    .line 8
    .line 9
    iget-object v5, p0, Lv10;->ε:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, p0, Lv10;->ζ:Ljava/lang/String;

    .line 12
    .line 13
    iget-boolean v7, p0, Lv10;->η:Z

    .line 14
    .line 15
    iget-boolean v8, p0, Lv10;->θ:Z

    .line 16
    .line 17
    iget-object v9, p0, Lv10;->ι:Landroid/view/View;

    .line 18
    .line 19
    iget-object v10, p0, Lv10;->κ:Ljava/lang/Runnable;

    .line 20
    .line 21
    iget-wide v11, p0, Lv10;->λ:J

    .line 22
    .line 23
    iget-boolean p0, p0, Lv10;->μ:Z

    .line 24
    .line 25
    new-instance v13, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v14, "GestureState(trackingDown="

    .line 28
    .line 29
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", downX="

    .line 36
    .line 37
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", downY="

    .line 44
    .line 45
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, ", downTime="

    .line 52
    .line 53
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v13, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, ", downArea="

    .line 60
    .line 61
    const-string v1, ", downLongAction="

    .line 62
    .line 63
    invoke-static {v13, v0, v5, v1, v6}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v0, ", movedTooFar="

    .line 67
    .line 68
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v0, ", longFired="

    .line 75
    .line 76
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v0, ", longHost="

    .line 83
    .line 84
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, ", longRunnable="

    .line 91
    .line 92
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v0, ", contextCacheAt="

    .line 99
    .line 100
    const-string v1, ", contextCacheAllowed="

    .line 101
    .line 102
    invoke-static {v13, v0, v11, v12, v1}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v0, ")"

    .line 106
    .line 107
    invoke-static {v13, p0, v0}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0
.end method

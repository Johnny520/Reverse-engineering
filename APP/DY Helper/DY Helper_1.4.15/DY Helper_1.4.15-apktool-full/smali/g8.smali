.class public final Lg8;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:I

.field public final β:I

.field public final γ:Ljava/lang/Integer;

.field public final δ:Ljava/lang/Integer;

.field public final ε:Ljava/lang/Integer;

.field public final ζ:Ljava/util/List;

.field public final η:Ljava/util/List;

.field public final θ:Ljava/util/List;

.field public final ι:Li8;


# direct methods
.method public constructor <init>(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Li8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lg8;->α:I

    .line 5
    .line 6
    iput p2, p0, Lg8;->β:I

    .line 7
    .line 8
    iput-object p3, p0, Lg8;->γ:Ljava/lang/Integer;

    .line 9
    .line 10
    iput-object p4, p0, Lg8;->δ:Ljava/lang/Integer;

    .line 11
    .line 12
    iput-object p5, p0, Lg8;->ε:Ljava/lang/Integer;

    .line 13
    .line 14
    iput-object p6, p0, Lg8;->ζ:Ljava/util/List;

    .line 15
    .line 16
    iput-object p7, p0, Lg8;->η:Ljava/util/List;

    .line 17
    .line 18
    iput-object p8, p0, Lg8;->θ:Ljava/util/List;

    .line 19
    .line 20
    iput-object p9, p0, Lg8;->ι:Li8;

    .line 21
    .line 22
    return-void
.end method

.method public static α(Lg8;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lg8;
    .locals 10

    .line 1
    iget v1, p0, Lg8;->α:I

    .line 2
    .line 3
    iget v2, p0, Lg8;->β:I

    .line 4
    .line 5
    iget-object v3, p0, Lg8;->γ:Ljava/lang/Integer;

    .line 6
    .line 7
    iget-object v4, p0, Lg8;->δ:Ljava/lang/Integer;

    .line 8
    .line 9
    iget-object v5, p0, Lg8;->ε:Ljava/lang/Integer;

    .line 10
    .line 11
    iget-object v9, p0, Lg8;->ι:Li8;

    .line 12
    .line 13
    new-instance v0, Lg8;

    .line 14
    .line 15
    move-object v6, p1

    .line 16
    move-object v7, p2

    .line 17
    move-object v8, p3

    .line 18
    invoke-direct/range {v0 .. v9}, Lg8;-><init>(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Li8;)V

    .line 19
    .line 20
    .line 21
    return-object v0
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
    instance-of v1, p1, Lg8;

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
    check-cast p1, Lg8;

    .line 12
    .line 13
    iget v1, p0, Lg8;->α:I

    .line 14
    .line 15
    iget v3, p1, Lg8;->α:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lg8;->β:I

    .line 21
    .line 22
    iget v3, p1, Lg8;->β:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-object v1, p0, Lg8;->γ:Ljava/lang/Integer;

    .line 28
    .line 29
    iget-object v3, p1, Lg8;->γ:Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iget-object v1, p0, Lg8;->δ:Ljava/lang/Integer;

    .line 39
    .line 40
    iget-object v3, p1, Lg8;->δ:Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-object v1, p0, Lg8;->ε:Ljava/lang/Integer;

    .line 50
    .line 51
    iget-object v3, p1, Lg8;->ε:Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-object v1, p0, Lg8;->ζ:Ljava/util/List;

    .line 61
    .line 62
    iget-object v3, p1, Lg8;->ζ:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Lg8;->η:Ljava/util/List;

    .line 72
    .line 73
    iget-object v3, p1, Lg8;->η:Ljava/util/List;

    .line 74
    .line 75
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-object v1, p0, Lg8;->θ:Ljava/util/List;

    .line 83
    .line 84
    iget-object v3, p1, Lg8;->θ:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    iget-object p0, p0, Lg8;->ι:Li8;

    .line 94
    .line 95
    iget-object p1, p1, Lg8;->ι:Li8;

    .line 96
    .line 97
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-nez p0, :cond_a

    .line 102
    .line 103
    return v2

    .line 104
    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lg8;->α:I

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
    iget v2, p0, Lg8;->β:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object v3, p0, Lg8;->γ:Ljava/lang/Integer;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    :goto_0
    add-int/2addr v0, v3

    .line 28
    mul-int/2addr v0, v1

    .line 29
    iget-object v3, p0, Lg8;->δ:Ljava/lang/Integer;

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    move v3, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    :goto_1
    add-int/2addr v0, v3

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-object v3, p0, Lg8;->ε:Ljava/lang/Integer;

    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    move v3, v2

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    :goto_2
    add-int/2addr v0, v3

    .line 52
    mul-int/2addr v0, v1

    .line 53
    iget-object v3, p0, Lg8;->ζ:Ljava/util/List;

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    move v3, v2

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    :goto_3
    add-int/2addr v0, v3

    .line 64
    mul-int/2addr v0, v1

    .line 65
    iget-object v3, p0, Lg8;->η:Ljava/util/List;

    .line 66
    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    move v3, v2

    .line 70
    goto :goto_4

    .line 71
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    :goto_4
    add-int/2addr v0, v3

    .line 76
    mul-int/2addr v0, v1

    .line 77
    iget-object v3, p0, Lg8;->θ:Ljava/util/List;

    .line 78
    .line 79
    if-nez v3, :cond_5

    .line 80
    .line 81
    move v3, v2

    .line 82
    goto :goto_5

    .line 83
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    :goto_5
    add-int/2addr v0, v3

    .line 88
    mul-int/2addr v0, v1

    .line 89
    iget-object p0, p0, Lg8;->ι:Li8;

    .line 90
    .line 91
    if-nez p0, :cond_6

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_6
    invoke-virtual {p0}, Li8;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    :goto_6
    add-int/2addr v0, v2

    .line 99
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", imageIndex="

    .line 2
    .line 3
    const-string v1, ", clipType="

    .line 4
    .line 5
    const-string v2, "AwemePageMediaItem(pageIndex="

    .line 6
    .line 7
    iget v3, p0, Lg8;->α:I

    .line 8
    .line 9
    iget v4, p0, Lg8;->β:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lg8;->γ:Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", imageType="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lg8;->δ:Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", livePhotoType="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lg8;->ε:Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", previewUrls="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lg8;->ζ:Ljava/util/List;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", downloadUrls="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lg8;->η:Ljava/util/List;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", watermarkFreeUrls="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lg8;->θ:Ljava/util/List;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", embeddedVideo="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, Lg8;->ι:Li8;

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p0, ")"

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method

.method public final β()Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lg8;->ι:Li8;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Li8;->δ:Ljava/util/List;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    :goto_0
    sget-object v2, Ljz;->ε:Ljz;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    move-object v1, v2

    .line 15
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    const-string v5, "http"

    .line 25
    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    move-object v6, v3

    .line 33
    check-cast v6, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v6, v5, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    move-object v3, v0

    .line 43
    :goto_1
    check-cast v3, Ljava/lang/String;

    .line 44
    .line 45
    if-nez v3, :cond_c

    .line 46
    .line 47
    if-eqz p0, :cond_4

    .line 48
    .line 49
    iget-object v1, p0, Li8;->ζ:Ljava/util/List;

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_4
    move-object v1, v0

    .line 53
    :goto_2
    if-nez v1, :cond_5

    .line 54
    .line 55
    move-object v1, v2

    .line 56
    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_7

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    move-object v6, v3

    .line 71
    check-cast v6, Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v6, v5, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_6

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_7
    move-object v3, v0

    .line 81
    :goto_3
    check-cast v3, Ljava/lang/String;

    .line 82
    .line 83
    if-nez v3, :cond_c

    .line 84
    .line 85
    if-eqz p0, :cond_8

    .line 86
    .line 87
    iget-object p0, p0, Li8;->ε:Ljava/util/List;

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_8
    move-object p0, v0

    .line 91
    :goto_4
    if-nez p0, :cond_9

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_9
    move-object v2, p0

    .line 95
    :goto_5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_b

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    move-object v2, v1

    .line 110
    check-cast v2, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v2, v5, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_a

    .line 117
    .line 118
    move-object v0, v1

    .line 119
    :cond_b
    check-cast v0, Ljava/lang/String;

    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_c
    return-object v3
.end method

.method public final γ()Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, Ljz;->ε:Ljz;

    .line 2
    .line 3
    iget-object v1, p0, Lg8;->θ:Ljava/util/List;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    const-string v4, "http"

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v6, v2

    .line 27
    check-cast v6, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v6, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object v2, v5

    .line 37
    :goto_0
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    if-nez v2, :cond_9

    .line 40
    .line 41
    iget-object v1, p0, Lg8;->η:Ljava/util/List;

    .line 42
    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    move-object v1, v0

    .line 46
    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_5

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object v6, v2

    .line 61
    check-cast v6, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v6, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    move-object v2, v5

    .line 71
    :goto_1
    check-cast v2, Ljava/lang/String;

    .line 72
    .line 73
    if-nez v2, :cond_9

    .line 74
    .line 75
    iget-object p0, p0, Lg8;->ζ:Ljava/util/List;

    .line 76
    .line 77
    if-nez p0, :cond_6

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_6
    move-object v0, p0

    .line 81
    :goto_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_8

    .line 90
    .line 91
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    move-object v1, v0

    .line 96
    check-cast v1, Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v1, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_7

    .line 103
    .line 104
    move-object v5, v0

    .line 105
    :cond_8
    check-cast v5, Ljava/lang/String;

    .line 106
    .line 107
    return-object v5

    .line 108
    :cond_9
    return-object v2
.end method

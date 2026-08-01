.class public final Lzy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Laz0;

.field public final β:I

.field public final γ:I

.field public final δ:Ljava/lang/String;

.field public final ε:Ljava/lang/String;

.field public final ζ:Ljava/lang/String;

.field public final η:Ljava/lang/String;

.field public final θ:Ljava/lang/String;

.field public final ι:Ljava/util/List;

.field public final κ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Laz0;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lzy0;->α:Laz0;

    .line 8
    .line 9
    iput p2, p0, Lzy0;->β:I

    .line 10
    .line 11
    iput p3, p0, Lzy0;->γ:I

    .line 12
    .line 13
    iput-object p4, p0, Lzy0;->δ:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, Lzy0;->ε:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, Lzy0;->ζ:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p7, p0, Lzy0;->η:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p8, p0, Lzy0;->θ:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p9, p0, Lzy0;->ι:Ljava/util/List;

    .line 24
    .line 25
    iput-object p10, p0, Lzy0;->κ:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
.end method

.method public static α(Lzy0;Laz0;Ljava/lang/String;I)Lzy0;
    .locals 11

    .line 1
    iget v2, p0, Lzy0;->β:I

    .line 2
    .line 3
    iget v3, p0, Lzy0;->γ:I

    .line 4
    .line 5
    iget-object v4, p0, Lzy0;->δ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v5, p0, Lzy0;->ε:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v6, p0, Lzy0;->ζ:Ljava/lang/String;

    .line 10
    .line 11
    and-int/lit8 p3, p3, 0x40

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    iget-object p2, p0, Lzy0;->η:Ljava/lang/String;

    .line 16
    .line 17
    :cond_0
    move-object v7, p2

    .line 18
    iget-object v8, p0, Lzy0;->θ:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v9, p0, Lzy0;->ι:Ljava/util/List;

    .line 21
    .line 22
    iget-object v10, p0, Lzy0;->κ:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v0, Lzy0;

    .line 28
    .line 29
    move-object v1, p1

    .line 30
    invoke-direct/range {v0 .. v10}, Lzy0;-><init>(Laz0;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v0
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
    instance-of v0, p1, Lzy0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lzy0;

    .line 12
    .line 13
    iget-object v0, p0, Lzy0;->α:Laz0;

    .line 14
    .line 15
    iget-object v1, p1, Lzy0;->α:Laz0;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget v0, p0, Lzy0;->β:I

    .line 21
    .line 22
    iget v1, p1, Lzy0;->β:I

    .line 23
    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    iget v0, p0, Lzy0;->γ:I

    .line 28
    .line 29
    iget v1, p1, Lzy0;->γ:I

    .line 30
    .line 31
    if-eq v0, v1, :cond_4

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-object v0, p0, Lzy0;->δ:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p1, Lzy0;->δ:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    iget-object v0, p0, Lzy0;->ε:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p1, Lzy0;->ε:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget-object v0, p0, Lzy0;->ζ:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v1, p1, Lzy0;->ζ:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget-object v0, p0, Lzy0;->η:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v1, p1, Lzy0;->η:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_8

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_8
    iget-object v0, p0, Lzy0;->θ:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v1, p1, Lzy0;->θ:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_9

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_9
    iget-object v0, p0, Lzy0;->ι:Ljava/util/List;

    .line 90
    .line 91
    iget-object v1, p1, Lzy0;->ι:Ljava/util/List;

    .line 92
    .line 93
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_a

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_a
    iget-object p0, p0, Lzy0;->κ:Ljava/lang/Object;

    .line 101
    .line 102
    iget-object p1, p1, Lzy0;->κ:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_b

    .line 109
    .line 110
    :goto_0
    const/4 p0, 0x0

    .line 111
    return p0

    .line 112
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 113
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lzy0;->α:Laz0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget v2, p0, Lzy0;->β:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lzy0;->γ:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lzy0;->δ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lzy0;->ε:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, 0x0

    .line 35
    iget-object v3, p0, Lzy0;->ζ:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    move v3, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    :goto_0
    add-int/2addr v0, v3

    .line 46
    mul-int/2addr v0, v1

    .line 47
    iget-object v3, p0, Lzy0;->η:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    move v3, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    :goto_1
    add-int/2addr v0, v3

    .line 58
    mul-int/2addr v0, v1

    .line 59
    iget-object v3, p0, Lzy0;->θ:Ljava/lang/String;

    .line 60
    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    move v3, v2

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    :goto_2
    add-int/2addr v0, v3

    .line 70
    mul-int/2addr v0, v1

    .line 71
    iget-object v3, p0, Lzy0;->ι:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v3, v0, v1}, La12;->γ(Ljava/util/List;II)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object p0, p0, Lzy0;->κ:Ljava/lang/Object;

    .line 78
    .line 79
    if-nez p0, :cond_3

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    :goto_3
    add-int/2addr v0, v2

    .line 87
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MediaItem(kind="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lzy0;->α:Laz0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", pageIndex="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lzy0;->β:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", displayIndex="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", title="

    .line 29
    .line 30
    const-string v2, ", typeText="

    .line 31
    .line 32
    iget v3, p0, Lzy0;->γ:I

    .line 33
    .line 34
    iget-object v4, p0, Lzy0;->δ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Llz1;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", previewUrl="

    .line 40
    .line 41
    const-string v2, ", imageUrl="

    .line 42
    .line 43
    iget-object v3, p0, Lzy0;->ε:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v4, p0, Lzy0;->ζ:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", animatedUrl="

    .line 51
    .line 52
    const-string v2, ", videoCandidates="

    .line 53
    .line 54
    iget-object v3, p0, Lzy0;->η:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v4, p0, Lzy0;->θ:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lzy0;->ι:Ljava/util/List;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", payload="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Lzy0;->κ:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p0, ")"

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

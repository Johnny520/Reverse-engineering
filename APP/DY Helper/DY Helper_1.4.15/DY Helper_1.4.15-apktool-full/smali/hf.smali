.class public final Lhf;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Ljava/lang/ref/WeakReference;

.field public β:I

.field public γ:F

.field public δ:J

.field public ε:I

.field public ζ:J

.field public η:Ljava/util/List;

.field public θ:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lhf;->α:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lhf;->β:I

    .line 9
    .line 10
    const/high16 v0, -0x40800000    # -1.0f

    .line 11
    .line 12
    iput v0, p0, Lhf;->γ:F

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    iput-wide v0, p0, Lhf;->δ:J

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iput v2, p0, Lhf;->ε:I

    .line 20
    .line 21
    iput-wide v0, p0, Lhf;->ζ:J

    .line 22
    .line 23
    sget-object v0, Ljz;->ε:Ljz;

    .line 24
    .line 25
    iput-object v0, p0, Lhf;->η:Ljava/util/List;

    .line 26
    .line 27
    const-wide/16 v0, -0x1

    .line 28
    .line 29
    iput-wide v0, p0, Lhf;->θ:J

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lhf;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lhf;

    .line 10
    .line 11
    iget-object v0, p0, Lhf;->α:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    iget-object v1, p1, Lhf;->α:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget v0, p0, Lhf;->β:I

    .line 23
    .line 24
    iget v1, p1, Lhf;->β:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget v0, p0, Lhf;->γ:F

    .line 30
    .line 31
    iget v1, p1, Lhf;->γ:F

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-wide v0, p0, Lhf;->δ:J

    .line 41
    .line 42
    iget-wide v2, p1, Lhf;->δ:J

    .line 43
    .line 44
    cmp-long v0, v0, v2

    .line 45
    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget v0, p0, Lhf;->ε:I

    .line 50
    .line 51
    iget v1, p1, Lhf;->ε:I

    .line 52
    .line 53
    if-eq v0, v1, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget-wide v0, p0, Lhf;->ζ:J

    .line 57
    .line 58
    iget-wide v2, p1, Lhf;->ζ:J

    .line 59
    .line 60
    cmp-long v0, v0, v2

    .line 61
    .line 62
    if-eqz v0, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-object v0, p0, Lhf;->η:Ljava/util/List;

    .line 66
    .line 67
    iget-object v1, p1, Lhf;->η:Ljava/util/List;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget-wide v0, p0, Lhf;->θ:J

    .line 77
    .line 78
    iget-wide p0, p1, Lhf;->θ:J

    .line 79
    .line 80
    cmp-long p0, v0, p0

    .line 81
    .line 82
    if-eqz p0, :cond_9

    .line 83
    .line 84
    :goto_0
    const/4 p0, 0x0

    .line 85
    return p0

    .line 86
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 87
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lhf;->α:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    const/16 v1, 0x1f

    .line 12
    .line 13
    mul-int/2addr v0, v1

    .line 14
    iget v2, p0, Lhf;->β:I

    .line 15
    .line 16
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v2, p0, Lhf;->γ:F

    .line 21
    .line 22
    invoke-static {v2, v0, v1}, Llz1;->α(FII)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-wide v2, p0, Lhf;->δ:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v2, p0, Lhf;->ε:I

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, Lhf;->ζ:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, Lhf;->η:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, La12;->γ(Ljava/util/List;II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-wide v1, p0, Lhf;->θ:J

    .line 51
    .line 52
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    add-int/2addr p0, v0

    .line 57
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 12

    .line 1
    iget-object v0, p0, Lhf;->α:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    iget v1, p0, Lhf;->β:I

    .line 4
    .line 5
    iget v2, p0, Lhf;->γ:F

    .line 6
    .line 7
    iget-wide v3, p0, Lhf;->δ:J

    .line 8
    .line 9
    iget v5, p0, Lhf;->ε:I

    .line 10
    .line 11
    iget-wide v6, p0, Lhf;->ζ:J

    .line 12
    .line 13
    iget-object v8, p0, Lhf;->η:Ljava/util/List;

    .line 14
    .line 15
    iget-wide v9, p0, Lhf;->θ:J

    .line 16
    .line 17
    new-instance p0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v11, "SeekBarState(awemeRef="

    .line 20
    .line 21
    invoke-direct {p0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", lastIndex="

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", progressRatio="

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", lastCheckAt="

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, ", resolveAttempts="

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, ", nextResolveAt="

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, ", cachedSegments="

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, ", cachedDurationMs="

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ")"

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method

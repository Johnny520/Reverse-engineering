.class public final Lid;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:J

.field public final β:Lpd;

.field public final γ:Lzd1;

.field public final δ:J

.field public final ε:Ljava/lang/Long;

.field public final ζ:Ljava/lang/Long;

.field public final η:Ljava/lang/Long;

.field public final θ:Ljava/util/Set;

.field public final ι:Lod;


# direct methods
.method public synthetic constructor <init>(JLpd;Lzd1;JLjava/lang/Long;Ljava/lang/Long;I)V
    .locals 14

    .line 1
    and-int/lit8 v0, p9, 0x10

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    invoke-virtual/range {p4 .. p4}, Lzd1;->η()Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    move-object v9, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move-object/from16 v9, p7

    .line 17
    .line 18
    :goto_1
    and-int/lit8 v0, p9, 0x20

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    move-object v10, v1

    .line 23
    goto :goto_2

    .line 24
    :cond_2
    move-object/from16 v10, p8

    .line 25
    .line 26
    :goto_2
    sget-object v12, Lnz;->ε:Lnz;

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v13, 0x0

    .line 30
    move-object v2, p0

    .line 31
    move-wide v3, p1

    .line 32
    move-object/from16 v5, p3

    .line 33
    .line 34
    move-object/from16 v6, p4

    .line 35
    .line 36
    move-wide/from16 v7, p5

    .line 37
    .line 38
    invoke-direct/range {v2 .. v13}, Lid;-><init>(JLpd;Lzd1;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Set;Lod;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(JLpd;Lzd1;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Set;Lod;)V
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-wide p1, p0, Lid;->α:J

    .line 44
    iput-object p3, p0, Lid;->β:Lpd;

    .line 45
    iput-object p4, p0, Lid;->γ:Lzd1;

    .line 46
    iput-wide p5, p0, Lid;->δ:J

    .line 47
    iput-object p7, p0, Lid;->ε:Ljava/lang/Long;

    .line 48
    iput-object p8, p0, Lid;->ζ:Ljava/lang/Long;

    .line 49
    iput-object p9, p0, Lid;->η:Ljava/lang/Long;

    .line 50
    iput-object p10, p0, Lid;->θ:Ljava/util/Set;

    .line 51
    iput-object p11, p0, Lid;->ι:Lod;

    return-void
.end method

.method public static α(Lid;Lzd1;I)Lid;
    .locals 12

    .line 1
    iget-wide v1, p0, Lid;->α:J

    .line 2
    .line 3
    and-int/lit8 v0, p2, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lid;->β:Lpd;

    .line 8
    .line 9
    :goto_0
    move-object v3, v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    sget-object v0, Lpd;->θ:Lpd;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :goto_1
    and-int/lit8 p2, p2, 0x4

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lid;->γ:Lzd1;

    .line 19
    .line 20
    :cond_1
    move-object v4, p1

    .line 21
    iget-wide v5, p0, Lid;->δ:J

    .line 22
    .line 23
    iget-object v7, p0, Lid;->ε:Ljava/lang/Long;

    .line 24
    .line 25
    iget-object v8, p0, Lid;->ζ:Ljava/lang/Long;

    .line 26
    .line 27
    iget-object v9, p0, Lid;->η:Ljava/lang/Long;

    .line 28
    .line 29
    iget-object v10, p0, Lid;->θ:Ljava/util/Set;

    .line 30
    .line 31
    iget-object v11, p0, Lid;->ι:Lod;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v0, Lid;

    .line 43
    .line 44
    invoke-direct/range {v0 .. v11}, Lid;-><init>(JLpd;Lzd1;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Set;Lod;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lid;

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
    check-cast p1, Lid;

    .line 12
    .line 13
    iget-wide v3, p0, Lid;->α:J

    .line 14
    .line 15
    iget-wide v5, p1, Lid;->α:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-object v1, p0, Lid;->β:Lpd;

    .line 23
    .line 24
    iget-object v3, p1, Lid;->β:Lpd;

    .line 25
    .line 26
    if-eq v1, v3, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget-object v1, p0, Lid;->γ:Lzd1;

    .line 30
    .line 31
    iget-object v3, p1, Lid;->γ:Lzd1;

    .line 32
    .line 33
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget-wide v3, p0, Lid;->δ:J

    .line 41
    .line 42
    iget-wide v5, p1, Lid;->δ:J

    .line 43
    .line 44
    cmp-long v1, v3, v5

    .line 45
    .line 46
    if-eqz v1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-object v1, p0, Lid;->ε:Ljava/lang/Long;

    .line 50
    .line 51
    iget-object v3, p1, Lid;->ε:Ljava/lang/Long;

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
    iget-object v1, p0, Lid;->ζ:Ljava/lang/Long;

    .line 61
    .line 62
    iget-object v3, p1, Lid;->ζ:Ljava/lang/Long;

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
    iget-object v1, p0, Lid;->η:Ljava/lang/Long;

    .line 72
    .line 73
    iget-object v3, p1, Lid;->η:Ljava/lang/Long;

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
    iget-object v1, p0, Lid;->θ:Ljava/util/Set;

    .line 83
    .line 84
    iget-object v3, p1, Lid;->θ:Ljava/util/Set;

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
    iget-object p0, p0, Lid;->ι:Lod;

    .line 94
    .line 95
    iget-object p1, p1, Lid;->ι:Lod;

    .line 96
    .line 97
    if-eq p0, p1, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-wide v0, p0, Lid;->α:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-object v2, p0, Lid;->β:Lpd;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const/4 v0, 0x0

    .line 19
    iget-object v3, p0, Lid;->γ:Lzd1;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    move v3, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v3}, Lzd1;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    :goto_0
    add-int/2addr v2, v3

    .line 30
    mul-int/2addr v2, v1

    .line 31
    iget-wide v3, p0, Lid;->δ:J

    .line 32
    .line 33
    invoke-static {v2, v1, v3, v4}, Llz1;->β(IIJ)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v3, p0, Lid;->ε:Ljava/lang/Long;

    .line 38
    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    move v3, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    :goto_1
    add-int/2addr v2, v3

    .line 48
    mul-int/2addr v2, v1

    .line 49
    iget-object v3, p0, Lid;->ζ:Ljava/lang/Long;

    .line 50
    .line 51
    if-nez v3, :cond_2

    .line 52
    .line 53
    move v3, v0

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    :goto_2
    add-int/2addr v2, v3

    .line 60
    mul-int/2addr v2, v1

    .line 61
    iget-object v3, p0, Lid;->η:Ljava/lang/Long;

    .line 62
    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    move v3, v0

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    :goto_3
    add-int/2addr v2, v3

    .line 72
    mul-int/2addr v2, v1

    .line 73
    iget-object v3, p0, Lid;->θ:Ljava/util/Set;

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    add-int/2addr v3, v2

    .line 80
    mul-int/2addr v3, v1

    .line 81
    iget-object p0, p0, Lid;->ι:Lod;

    .line 82
    .line 83
    if-nez p0, :cond_4

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    :goto_4
    add-int/2addr v3, v0

    .line 91
    return v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CachedCampState(conversationShortId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lid;->α:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", availability="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lid;->β:Lpd;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", snapshot="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lid;->γ:Lzd1;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", updatedAtMillis="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, Lid;->δ:J

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", nextMatureAtMillis="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lid;->ε:Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", nextWaterAtMillis="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lid;->ζ:Ljava/lang/Long;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", nextRefreshAtMillis="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lid;->η:Ljava/lang/Long;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", pendingRefreshPlotUuids="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lid;->θ:Ljava/util/Set;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", pendingRefreshAfterAction="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, Lid;->ι:Lod;

    .line 89
    .line 90
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p0, ")"

    .line 94
    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method

.method public final β()Lpd;
    .locals 0

    .line 1
    iget-object p0, p0, Lid;->β:Lpd;

    .line 2
    .line 3
    return-object p0
.end method

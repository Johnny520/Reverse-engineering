.class public final Lky1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:J

.field public final γ:J

.field public final δ:I

.field public final ε:I

.field public final ζ:Z

.field public final η:I

.field public final θ:Ljava/lang/String;

.field public final ι:Z

.field public final κ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JJIIZILjava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lky1;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lky1;->β:J

    .line 7
    .line 8
    iput-wide p4, p0, Lky1;->γ:J

    .line 9
    .line 10
    iput p6, p0, Lky1;->δ:I

    .line 11
    .line 12
    iput p7, p0, Lky1;->ε:I

    .line 13
    .line 14
    iput-boolean p8, p0, Lky1;->ζ:Z

    .line 15
    .line 16
    iput p9, p0, Lky1;->η:I

    .line 17
    .line 18
    iput-object p10, p0, Lky1;->θ:Ljava/lang/String;

    .line 19
    .line 20
    iput-boolean p11, p0, Lky1;->ι:Z

    .line 21
    .line 22
    iput-object p12, p0, Lky1;->κ:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public static α(Lky1;JLjava/lang/String;I)Lky1;
    .locals 13

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    iget-object v1, p0, Lky1;->α:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v2, p0, Lky1;->β:J

    .line 6
    .line 7
    and-int/lit8 v4, v0, 0x4

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    iget-wide v4, p0, Lky1;->γ:J

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v4, p1

    .line 15
    :goto_0
    iget v6, p0, Lky1;->δ:I

    .line 16
    .line 17
    iget v7, p0, Lky1;->ε:I

    .line 18
    .line 19
    iget-boolean v8, p0, Lky1;->ζ:Z

    .line 20
    .line 21
    iget v9, p0, Lky1;->η:I

    .line 22
    .line 23
    iget-object v10, p0, Lky1;->θ:Ljava/lang/String;

    .line 24
    .line 25
    and-int/lit16 v11, v0, 0x100

    .line 26
    .line 27
    if-eqz v11, :cond_1

    .line 28
    .line 29
    iget-boolean v11, p0, Lky1;->ι:Z

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v11, 0x1

    .line 33
    :goto_1
    and-int/lit16 v0, v0, 0x200

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object p0, p0, Lky1;->κ:Ljava/lang/String;

    .line 38
    .line 39
    move-object v12, p0

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move-object/from16 v12, p3

    .line 42
    .line 43
    :goto_2
    new-instance v0, Lky1;

    .line 44
    .line 45
    invoke-direct/range {v0 .. v12}, Lky1;-><init>(Ljava/lang/String;JJIIZILjava/lang/String;ZLjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v0
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
    instance-of v0, p1, Lky1;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lky1;

    .line 11
    .line 12
    iget-object v0, p0, Lky1;->α:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p1, Lky1;->α:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-wide v0, p0, Lky1;->β:J

    .line 24
    .line 25
    iget-wide v2, p1, Lky1;->β:J

    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-wide v0, p0, Lky1;->γ:J

    .line 33
    .line 34
    iget-wide v2, p1, Lky1;->γ:J

    .line 35
    .line 36
    cmp-long v0, v0, v2

    .line 37
    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget v0, p0, Lky1;->δ:I

    .line 42
    .line 43
    iget v1, p1, Lky1;->δ:I

    .line 44
    .line 45
    if-eq v0, v1, :cond_5

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_5
    iget v0, p0, Lky1;->ε:I

    .line 49
    .line 50
    iget v1, p1, Lky1;->ε:I

    .line 51
    .line 52
    if-eq v0, v1, :cond_6

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_6
    iget-boolean v0, p0, Lky1;->ζ:Z

    .line 56
    .line 57
    iget-boolean v1, p1, Lky1;->ζ:Z

    .line 58
    .line 59
    if-eq v0, v1, :cond_7

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_7
    iget v0, p0, Lky1;->η:I

    .line 63
    .line 64
    iget v1, p1, Lky1;->η:I

    .line 65
    .line 66
    if-eq v0, v1, :cond_8

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_8
    iget-object v0, p0, Lky1;->θ:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v1, p1, Lky1;->θ:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_9

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_9
    iget-boolean v0, p0, Lky1;->ι:Z

    .line 81
    .line 82
    iget-boolean v1, p1, Lky1;->ι:Z

    .line 83
    .line 84
    if-eq v0, v1, :cond_a

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_a
    iget-object p0, p0, Lky1;->κ:Ljava/lang/String;

    .line 88
    .line 89
    iget-object p1, p1, Lky1;->κ:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_b

    .line 96
    .line 97
    :goto_0
    const/4 p0, 0x0

    .line 98
    return p0

    .line 99
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 100
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lky1;->α:Ljava/lang/String;

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
    iget-wide v2, p0, Lky1;->β:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lky1;->γ:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lky1;->δ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lky1;->ε:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, Lky1;->ζ:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lky1;->η:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lky1;->θ:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, Lky1;->ι:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object p0, p0, Lky1;->κ:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "SparkInfo(conversationId="

    .line 2
    .line 3
    const-string v1, ", conversationShortId="

    .line 4
    .line 5
    iget-object v2, p0, Lky1;->α:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lky1;->β:J

    .line 8
    .line 9
    invoke-static {v0, v2, v3, v4, v1}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", otherUid="

    .line 14
    .line 15
    const-string v2, ", conversationType="

    .line 16
    .line 17
    iget-wide v3, p0, Lky1;->γ:J

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v4, v2}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ", days="

    .line 23
    .line 24
    const-string v2, ", needsRenewal="

    .line 25
    .line 26
    iget v3, p0, Lky1;->δ:I

    .line 27
    .line 28
    iget v4, p0, Lky1;->ε:I

    .line 29
    .line 30
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-boolean v1, p0, Lky1;->ζ:Z

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ", currentState="

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget v1, p0, Lky1;->η:I

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", stateText="

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lky1;->θ:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, ", selfSentToday="

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-boolean v1, p0, Lky1;->ι:Z

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", displayName="

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ")"

    .line 74
    .line 75
    iget-object p0, p0, Lky1;->κ:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v0, p0, v1}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.class public final Lfb/j2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Z

.field public final l:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/lang/String;IIIZJ)V
    .locals 0

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfb/j2;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lfb/j2;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p3, p0, Lfb/j2;->c:Z

    .line 12
    .line 13
    iput-object p4, p0, Lfb/j2;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, Lfb/j2;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, Lfb/j2;->f:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    iput-object p7, p0, Lfb/j2;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput p8, p0, Lfb/j2;->h:I

    .line 22
    .line 23
    iput p9, p0, Lfb/j2;->i:I

    .line 24
    .line 25
    iput p10, p0, Lfb/j2;->j:I

    .line 26
    .line 27
    iput-boolean p11, p0, Lfb/j2;->k:Z

    .line 28
    .line 29
    iput-wide p12, p0, Lfb/j2;->l:J

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lfb/j2;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

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
    instance-of v0, p1, Lfb/j2;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lfb/j2;

    .line 12
    .line 13
    iget-object v0, p0, Lfb/j2;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lfb/j2;->a:Ljava/lang/String;

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
    iget-object v0, p0, Lfb/j2;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, Lfb/j2;->b:Ljava/lang/String;

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
    iget-boolean v0, p0, Lfb/j2;->c:Z

    .line 37
    .line 38
    iget-boolean v1, p1, Lfb/j2;->c:Z

    .line 39
    .line 40
    if-eq v0, v1, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-object v0, p0, Lfb/j2;->d:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, p1, Lfb/j2;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-object v0, p0, Lfb/j2;->e:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v1, p1, Lfb/j2;->e:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-object v0, p0, Lfb/j2;->f:Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    iget-object v1, p1, Lfb/j2;->f:Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget-object v0, p0, Lfb/j2;->g:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v1, p1, Lfb/j2;->g:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    iget v0, p0, Lfb/j2;->h:I

    .line 88
    .line 89
    iget v1, p1, Lfb/j2;->h:I

    .line 90
    .line 91
    if-eq v0, v1, :cond_9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget v0, p0, Lfb/j2;->i:I

    .line 95
    .line 96
    iget v1, p1, Lfb/j2;->i:I

    .line 97
    .line 98
    if-eq v0, v1, :cond_a

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_a
    iget v0, p0, Lfb/j2;->j:I

    .line 102
    .line 103
    iget v1, p1, Lfb/j2;->j:I

    .line 104
    .line 105
    if-eq v0, v1, :cond_b

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_b
    iget-boolean v0, p0, Lfb/j2;->k:Z

    .line 109
    .line 110
    iget-boolean v1, p1, Lfb/j2;->k:Z

    .line 111
    .line 112
    if-eq v0, v1, :cond_c

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_c
    iget-wide v0, p0, Lfb/j2;->l:J

    .line 116
    .line 117
    iget-wide v2, p1, Lfb/j2;->l:J

    .line 118
    .line 119
    cmp-long p1, v0, v2

    .line 120
    .line 121
    if-eqz p1, :cond_d

    .line 122
    .line 123
    :goto_0
    const/4 p1, 0x0

    .line 124
    return p1

    .line 125
    :cond_d
    :goto_1
    const/4 p1, 0x1

    .line 126
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lfb/j2;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lfb/j2;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lfb/j2;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lfb/j2;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lfb/j2;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lfb/j2;->f:Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, Lfb/j2;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v2, v1, v0}, Leh/a;->g(IILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v2, p0, Lfb/j2;->h:I

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget v2, p0, Lfb/j2;->i:I

    .line 55
    .line 56
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget v2, p0, Lfb/j2;->j:I

    .line 61
    .line 62
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-boolean v2, p0, Lfb/j2;->k:Z

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-wide v1, p0, Lfb/j2;->l:J

    .line 73
    .line 74
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/2addr v1, v0

    .line 79
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", pluginId="

    .line 2
    .line 3
    const-string v1, ", existed="

    .line 4
    .line 5
    const-string v2, "ScriptPluginAgentWorkspaceCheckpoint(stagingPath="

    .line 6
    .line 7
    iget-object v3, p0, Lfb/j2;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lfb/j2;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v1, p0, Lfb/j2;->c:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", baseFingerprint="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lfb/j2;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", stageFingerprint="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lfb/j2;->e:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", basePathStates="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lfb/j2;->f:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", initialPluginName="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lfb/j2;->g:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", revision="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget v1, p0, Lfb/j2;->h:I

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", checkedRevision="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", shownRevision="

    .line 76
    .line 77
    const-string v2, ", deletePlugin="

    .line 78
    .line 79
    iget v3, p0, Lfb/j2;->i:I

    .line 80
    .line 81
    iget v4, p0, Lfb/j2;->j:I

    .line 82
    .line 83
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-boolean v1, p0, Lfb/j2;->k:Z

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v1, ", updatedAt="

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-wide v1, p0, Lfb/j2;->l:J

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, ")"

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    return-object v0
.end method

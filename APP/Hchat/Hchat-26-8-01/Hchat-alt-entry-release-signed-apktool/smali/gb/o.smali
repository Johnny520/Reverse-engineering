.class public final Lgb/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:J

.field public final j:J

.field public final k:Ljava/lang/String;

.field public final l:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgb/o;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lgb/o;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lgb/o;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lgb/o;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lgb/o;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lgb/o;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lgb/o;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-wide p8, p0, Lgb/o;->h:J

    .line 19
    .line 20
    iput-wide p10, p0, Lgb/o;->i:J

    .line 21
    .line 22
    iput-wide p12, p0, Lgb/o;->j:J

    .line 23
    .line 24
    iput-object p14, p0, Lgb/o;->k:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p15, p0, Lgb/o;->l:Ljava/util/List;

    .line 27
    .line 28
    return-void
.end method

.method public static a(Lgb/o;JJJI)Lgb/o;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p7

    .line 4
    .line 5
    iget-object v2, v0, Lgb/o;->a:Ljava/lang/String;

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    iget-object v2, v0, Lgb/o;->b:Ljava/lang/String;

    .line 9
    .line 10
    move-object v4, v3

    .line 11
    iget-object v3, v0, Lgb/o;->c:Ljava/lang/String;

    .line 12
    .line 13
    move-object v5, v4

    .line 14
    iget-object v4, v0, Lgb/o;->d:Ljava/lang/String;

    .line 15
    .line 16
    move-object v6, v5

    .line 17
    iget-object v5, v0, Lgb/o;->e:Ljava/lang/String;

    .line 18
    .line 19
    move-object v7, v6

    .line 20
    iget-object v6, v0, Lgb/o;->f:Ljava/lang/String;

    .line 21
    .line 22
    move-object v8, v7

    .line 23
    iget-object v7, v0, Lgb/o;->g:Ljava/lang/String;

    .line 24
    .line 25
    and-int/lit16 v9, v1, 0x80

    .line 26
    .line 27
    if-eqz v9, :cond_0

    .line 28
    .line 29
    iget-wide v9, v0, Lgb/o;->h:J

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-wide/from16 v9, p1

    .line 33
    .line 34
    :goto_0
    and-int/lit16 v11, v1, 0x100

    .line 35
    .line 36
    if-eqz v11, :cond_1

    .line 37
    .line 38
    iget-wide v11, v0, Lgb/o;->i:J

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-wide/from16 v11, p3

    .line 42
    .line 43
    :goto_1
    and-int/lit16 v1, v1, 0x200

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    iget-wide v13, v0, Lgb/o;->j:J

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-wide/from16 v13, p5

    .line 51
    .line 52
    :goto_2
    iget-object v1, v0, Lgb/o;->k:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v15, v0, Lgb/o;->l:Ljava/util/List;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v0, Lgb/o;

    .line 60
    .line 61
    move-wide/from16 v16, v13

    .line 62
    .line 63
    move-object v14, v1

    .line 64
    move-object v1, v8

    .line 65
    move-wide v8, v9

    .line 66
    move-wide v10, v11

    .line 67
    move-wide/from16 v12, v16

    .line 68
    .line 69
    invoke-direct/range {v0 .. v15}, Lgb/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
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
    instance-of v0, p1, Lgb/o;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lgb/o;

    .line 12
    .line 13
    iget-object v0, p0, Lgb/o;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lgb/o;->a:Ljava/lang/String;

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
    iget-object v0, p0, Lgb/o;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, Lgb/o;->b:Ljava/lang/String;

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
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, Lgb/o;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, Lgb/o;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-object v0, p0, Lgb/o;->d:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v1, p1, Lgb/o;->d:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_5
    iget-object v0, p0, Lgb/o;->e:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v1, p1, Lgb/o;->e:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_6

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_6
    iget-object v0, p0, Lgb/o;->f:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v1, p1, Lgb/o;->f:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_7

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_7
    iget-object v0, p0, Lgb/o;->g:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, p1, Lgb/o;->g:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_8

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_8
    iget-wide v0, p0, Lgb/o;->h:J

    .line 93
    .line 94
    iget-wide v2, p1, Lgb/o;->h:J

    .line 95
    .line 96
    cmp-long v0, v0, v2

    .line 97
    .line 98
    if-eqz v0, :cond_9

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_9
    iget-wide v0, p0, Lgb/o;->i:J

    .line 102
    .line 103
    iget-wide v2, p1, Lgb/o;->i:J

    .line 104
    .line 105
    cmp-long v0, v0, v2

    .line 106
    .line 107
    if-eqz v0, :cond_a

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_a
    iget-wide v0, p0, Lgb/o;->j:J

    .line 111
    .line 112
    iget-wide v2, p1, Lgb/o;->j:J

    .line 113
    .line 114
    cmp-long v0, v0, v2

    .line 115
    .line 116
    if-eqz v0, :cond_b

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_b
    iget-object v0, p0, Lgb/o;->k:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v1, p1, Lgb/o;->k:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_c

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_c
    iget-object v0, p0, Lgb/o;->l:Ljava/util/List;

    .line 131
    .line 132
    iget-object p1, p1, Lgb/o;->l:Ljava/util/List;

    .line 133
    .line 134
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_d

    .line 139
    .line 140
    :goto_0
    const/4 p1, 0x0

    .line 141
    return p1

    .line 142
    :cond_d
    :goto_1
    const/4 p1, 0x1

    .line 143
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lgb/o;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lgb/o;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lgb/o;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lgb/o;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lgb/o;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lgb/o;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lgb/o;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, Lgb/o;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, Lgb/o;->i:J

    .line 53
    .line 54
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-wide v2, p0, Lgb/o;->j:J

    .line 59
    .line 60
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, Lgb/o;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v1, p0, Lgb/o;->l:Ljava/util/List;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v1, v0

    .line 77
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", sourcePluginId="

    .line 2
    .line 3
    const-string v1, ", name="

    .line 4
    .line 5
    const-string v2, "PluginMarketPlugin(remotePluginId="

    .line 6
    .line 7
    iget-object v3, p0, Lgb/o;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lgb/o;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", author="

    .line 16
    .line 17
    const-string v2, ", version="

    .line 18
    .line 19
    iget-object v3, p0, Lgb/o;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lgb/o;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", versionId="

    .line 27
    .line 28
    const-string v2, ", updateTime="

    .line 29
    .line 30
    iget-object v3, p0, Lgb/o;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lgb/o;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lgb/o;->g:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", downloadCount="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-wide v1, p0, Lgb/o;->h:J

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", likeCount="

    .line 53
    .line 54
    const-string v2, ", commentCount="

    .line 55
    .line 56
    iget-wide v3, p0, Lgb/o;->i:J

    .line 57
    .line 58
    invoke-static {v0, v1, v3, v4, v2}, Lj8/b;->s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-wide v1, p0, Lgb/o;->j:J

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", description="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lgb/o;->k:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, ", files="

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lgb/o;->l:Ljava/util/List;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ")"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0
.end method

.class public final Lfb/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:I

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lfb/v;->a:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p2, p0, Lfb/v;->b:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p3, p0, Lfb/v;->c:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p4, p0, Lfb/v;->d:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p5, p0, Lfb/v;->e:Ljava/util/List;

    .line 34
    .line 35
    iput-boolean p6, p0, Lfb/v;->f:Z

    .line 36
    .line 37
    iput p7, p0, Lfb/v;->g:I

    .line 38
    .line 39
    iput-boolean p8, p0, Lfb/v;->h:Z

    .line 40
    .line 41
    iput-object p9, p0, Lfb/v;->i:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p10, p0, Lfb/v;->j:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p11, p0, Lfb/v;->k:Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method

.method public static a(Lfb/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lfb/v;
    .locals 14

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lfb/v;->a:Ljava/lang/String;

    .line 8
    .line 9
    move-object v3, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v3, p1

    .line 12
    :goto_0
    and-int/lit8 v1, v0, 0x2

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lfb/v;->b:Ljava/lang/String;

    .line 17
    .line 18
    :goto_1
    move-object v4, v1

    .line 19
    goto :goto_2

    .line 20
    :cond_1
    const-string v1, ""

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :goto_2
    and-int/lit8 v1, v0, 0x4

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lfb/v;->c:Ljava/lang/String;

    .line 28
    .line 29
    move-object v5, v1

    .line 30
    goto :goto_3

    .line 31
    :cond_2
    move-object/from16 v5, p2

    .line 32
    .line 33
    :goto_3
    and-int/lit8 v1, v0, 0x8

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    iget-object v1, p0, Lfb/v;->d:Ljava/lang/String;

    .line 38
    .line 39
    move-object v6, v1

    .line 40
    goto :goto_4

    .line 41
    :cond_3
    move-object/from16 v6, p3

    .line 42
    .line 43
    :goto_4
    and-int/lit8 v1, v0, 0x10

    .line 44
    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    iget-object v1, p0, Lfb/v;->e:Ljava/util/List;

    .line 48
    .line 49
    move-object v7, v1

    .line 50
    goto :goto_5

    .line 51
    :cond_4
    move-object/from16 v7, p4

    .line 52
    .line 53
    :goto_5
    iget-boolean v8, p0, Lfb/v;->f:Z

    .line 54
    .line 55
    and-int/lit8 v1, v0, 0x40

    .line 56
    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    iget v1, p0, Lfb/v;->g:I

    .line 60
    .line 61
    move v9, v1

    .line 62
    goto :goto_6

    .line 63
    :cond_5
    move/from16 v9, p5

    .line 64
    .line 65
    :goto_6
    and-int/lit16 v1, v0, 0x80

    .line 66
    .line 67
    if-eqz v1, :cond_6

    .line 68
    .line 69
    iget-boolean v1, p0, Lfb/v;->h:Z

    .line 70
    .line 71
    move v10, v1

    .line 72
    goto :goto_7

    .line 73
    :cond_6
    move/from16 v10, p6

    .line 74
    .line 75
    :goto_7
    and-int/lit16 v1, v0, 0x100

    .line 76
    .line 77
    if-eqz v1, :cond_7

    .line 78
    .line 79
    iget-object v1, p0, Lfb/v;->i:Ljava/lang/String;

    .line 80
    .line 81
    move-object v11, v1

    .line 82
    goto :goto_8

    .line 83
    :cond_7
    move-object/from16 v11, p7

    .line 84
    .line 85
    :goto_8
    and-int/lit16 v1, v0, 0x200

    .line 86
    .line 87
    if-eqz v1, :cond_8

    .line 88
    .line 89
    iget-object v1, p0, Lfb/v;->j:Ljava/lang/String;

    .line 90
    .line 91
    move-object v12, v1

    .line 92
    goto :goto_9

    .line 93
    :cond_8
    move-object/from16 v12, p8

    .line 94
    .line 95
    :goto_9
    and-int/lit16 v0, v0, 0x400

    .line 96
    .line 97
    if-eqz v0, :cond_9

    .line 98
    .line 99
    iget-object p0, p0, Lfb/v;->k:Ljava/lang/String;

    .line 100
    .line 101
    move-object v13, p0

    .line 102
    goto :goto_a

    .line 103
    :cond_9
    move-object/from16 v13, p9

    .line 104
    .line 105
    :goto_a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v2, Lfb/v;

    .line 127
    .line 128
    invoke-direct/range {v2 .. v13}, Lfb/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v2
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfb/v;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lfb/v;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lfb/v;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfb/v;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

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
    instance-of v0, p1, Lfb/v;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lfb/v;

    .line 12
    .line 13
    iget-object v0, p0, Lfb/v;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lfb/v;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lfb/v;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, Lfb/v;->b:Ljava/lang/String;

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
    iget-object v0, p0, Lfb/v;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v1, p1, Lfb/v;->c:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v0, p0, Lfb/v;->d:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v1, p1, Lfb/v;->d:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    iget-object v0, p0, Lfb/v;->e:Ljava/util/List;

    .line 59
    .line 60
    iget-object v1, p1, Lfb/v;->e:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_6
    iget-boolean v0, p0, Lfb/v;->f:Z

    .line 70
    .line 71
    iget-boolean v1, p1, Lfb/v;->f:Z

    .line 72
    .line 73
    if-eq v0, v1, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget v0, p0, Lfb/v;->g:I

    .line 77
    .line 78
    iget v1, p1, Lfb/v;->g:I

    .line 79
    .line 80
    if-eq v0, v1, :cond_8

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_8
    iget-boolean v0, p0, Lfb/v;->h:Z

    .line 84
    .line 85
    iget-boolean v1, p1, Lfb/v;->h:Z

    .line 86
    .line 87
    if-eq v0, v1, :cond_9

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_9
    iget-object v0, p0, Lfb/v;->i:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v1, p1, Lfb/v;->i:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lfb/v;->j:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v1, p1, Lfb/v;->j:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lfb/v;->k:Ljava/lang/String;

    .line 113
    .line 114
    iget-object p1, p1, Lfb/v;->k:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-nez p1, :cond_c

    .line 121
    .line 122
    :goto_0
    const/4 p1, 0x0

    .line 123
    return p1

    .line 124
    :cond_c
    :goto_1
    const/4 p1, 0x1

    .line 125
    return p1
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfb/v;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lfb/v;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lfb/v;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lfb/v;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lfb/v;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lfb/v;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, Lfb/v;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lfb/v;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lfb/v;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lfb/v;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, Lfb/v;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v1, p0, Lfb/v;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v1, v0

    .line 71
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", apiPath="

    .line 2
    .line 3
    const-string v1, ", apiKey="

    .line 4
    .line 5
    const-string v2, "ScriptPluginAgentConfig(apiBaseUrl="

    .line 6
    .line 7
    iget-object v3, p0, Lfb/v;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lfb/v;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", model="

    .line 16
    .line 17
    const-string v2, ", mcpServers="

    .line 18
    .line 19
    iget-object v3, p0, Lfb/v;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lfb/v;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lfb/v;->e:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", autoCompactEnabled="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-boolean v1, p0, Lfb/v;->f:Z

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", compactTokenThreshold="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget v1, p0, Lfb/v;->g:I

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", webSearchEnabled="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p0, Lfb/v;->h:Z

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", workspaceWriteApprovalMode="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", promptCacheMode="

    .line 67
    .line 68
    const-string v2, ", endpointMode="

    .line 69
    .line 70
    iget-object v3, p0, Lfb/v;->i:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v4, p0, Lfb/v;->j:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v1, ")"

    .line 78
    .line 79
    iget-object v2, p0, Lfb/v;->k:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v0, v2, v1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0
.end method

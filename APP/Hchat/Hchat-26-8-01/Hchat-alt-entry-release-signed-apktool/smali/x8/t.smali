.class public final Lx8/t;
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

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Z

.field public final k:Ljava/lang/String;

.field public final l:Z

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:I

.field public final p:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-static/range {p1 .. p5}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p6, p7, p8, p11, p13}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lx8/t;->a:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, p0, Lx8/t;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p3, p0, Lx8/t;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p4, p0, Lx8/t;->d:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p5, p0, Lx8/t;->e:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p6, p0, Lx8/t;->f:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p7, p0, Lx8/t;->g:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p8, p0, Lx8/t;->h:Ljava/lang/String;

    .line 28
    .line 29
    iput-boolean p9, p0, Lx8/t;->i:Z

    .line 30
    .line 31
    iput-boolean p10, p0, Lx8/t;->j:Z

    .line 32
    .line 33
    iput-object p11, p0, Lx8/t;->k:Ljava/lang/String;

    .line 34
    .line 35
    iput-boolean p12, p0, Lx8/t;->l:Z

    .line 36
    .line 37
    iput-object p13, p0, Lx8/t;->m:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p14, p0, Lx8/t;->n:Ljava/lang/String;

    .line 40
    .line 41
    move p1, p15

    .line 42
    iput p1, p0, Lx8/t;->o:I

    .line 43
    .line 44
    move/from16 p1, p16

    .line 45
    .line 46
    iput p1, p0, Lx8/t;->p:I

    .line 47
    .line 48
    return-void
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
    instance-of v1, p1, Lx8/t;

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
    check-cast p1, Lx8/t;

    .line 12
    .line 13
    iget-object v1, p0, Lx8/t;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lx8/t;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lx8/t;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lx8/t;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lx8/t;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lx8/t;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lx8/t;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lx8/t;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lx8/t;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lx8/t;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lx8/t;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lx8/t;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lx8/t;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lx8/t;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, Lx8/t;->h:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lx8/t;->h:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-boolean v1, p0, Lx8/t;->i:Z

    .line 102
    .line 103
    iget-boolean v3, p1, Lx8/t;->i:Z

    .line 104
    .line 105
    if-eq v1, v3, :cond_a

    .line 106
    .line 107
    return v2

    .line 108
    :cond_a
    iget-boolean v1, p0, Lx8/t;->j:Z

    .line 109
    .line 110
    iget-boolean v3, p1, Lx8/t;->j:Z

    .line 111
    .line 112
    if-eq v1, v3, :cond_b

    .line 113
    .line 114
    return v2

    .line 115
    :cond_b
    iget-object v1, p0, Lx8/t;->k:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v3, p1, Lx8/t;->k:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_c

    .line 124
    .line 125
    return v2

    .line 126
    :cond_c
    iget-boolean v1, p0, Lx8/t;->l:Z

    .line 127
    .line 128
    iget-boolean v3, p1, Lx8/t;->l:Z

    .line 129
    .line 130
    if-eq v1, v3, :cond_d

    .line 131
    .line 132
    return v2

    .line 133
    :cond_d
    iget-object v1, p0, Lx8/t;->m:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v3, p1, Lx8/t;->m:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_e

    .line 142
    .line 143
    return v2

    .line 144
    :cond_e
    iget-object v1, p0, Lx8/t;->n:Ljava/lang/String;

    .line 145
    .line 146
    iget-object v3, p1, Lx8/t;->n:Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_f

    .line 153
    .line 154
    return v2

    .line 155
    :cond_f
    iget v1, p0, Lx8/t;->o:I

    .line 156
    .line 157
    iget v3, p1, Lx8/t;->o:I

    .line 158
    .line 159
    if-eq v1, v3, :cond_10

    .line 160
    .line 161
    return v2

    .line 162
    :cond_10
    iget v1, p0, Lx8/t;->p:I

    .line 163
    .line 164
    iget p1, p1, Lx8/t;->p:I

    .line 165
    .line 166
    if-eq v1, p1, :cond_11

    .line 167
    .line 168
    return v2

    .line 169
    :cond_11
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lx8/t;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lx8/t;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lx8/t;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lx8/t;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lx8/t;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lx8/t;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lx8/t;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lx8/t;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, Lx8/t;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, Lx8/t;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, Lx8/t;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, Lx8/t;->l:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, Lx8/t;->m:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, Lx8/t;->n:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v2, p0, Lx8/t;->o:I

    .line 89
    .line 90
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget v1, p0, Lx8/t;->p:I

    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v1, v0

    .line 101
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", otaUrl="

    .line 2
    .line 3
    const-string v1, ", consoleUrl="

    .line 4
    .line 5
    const-string v2, "AutoReplyXiaozhiConfig(serveUrl="

    .line 6
    .line 7
    iget-object v3, p0, Lx8/t;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lx8/t;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", consolePhone="

    .line 16
    .line 17
    const-string v2, ", consoleToken="

    .line 18
    .line 19
    iget-object v3, p0, Lx8/t;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lx8/t;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", consoleAgentId="

    .line 27
    .line 28
    const-string v2, ", consoleModel="

    .line 29
    .line 30
    iget-object v3, p0, Lx8/t;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lx8/t;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", voiceRole="

    .line 38
    .line 39
    const-string v2, ", musicMcpEnabled="

    .line 40
    .line 41
    iget-object v3, p0, Lx8/t;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, Lx8/t;->h:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", mcpBridgeEnabled="

    .line 49
    .line 50
    const-string v2, ", mcpEndpointUrl="

    .line 51
    .line 52
    iget-boolean v3, p0, Lx8/t;->i:Z

    .line 53
    .line 54
    iget-boolean v4, p0, Lx8/t;->j:Z

    .line 55
    .line 56
    invoke-static {v0, v3, v1, v4, v2}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lx8/t;->k:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", mcpKugouEnabled="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-boolean v1, p0, Lx8/t;->l:Z

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", mcpKugouPluginId="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", mcpKugouFunctionName="

    .line 80
    .line 81
    const-string v2, ", mcpReadySeconds="

    .line 82
    .line 83
    iget-object v3, p0, Lx8/t;->m:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v4, p0, Lx8/t;->n:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget v1, p0, Lx8/t;->o:I

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ", mcpIdleSeconds="

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget v1, p0, Lx8/t;->p:I

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ")"

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    return-object v0
.end method

.class public final Lfb/m2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/Integer;

.field public final n:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZZZZZZZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfb/m2;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lfb/m2;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Lfb/m2;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p4, p0, Lfb/m2;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lfb/m2;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lfb/m2;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Lfb/m2;->g:Z

    .line 17
    .line 18
    iput-boolean p8, p0, Lfb/m2;->h:Z

    .line 19
    .line 20
    iput-boolean p9, p0, Lfb/m2;->i:Z

    .line 21
    .line 22
    iput-boolean p10, p0, Lfb/m2;->j:Z

    .line 23
    .line 24
    iput-boolean p11, p0, Lfb/m2;->k:Z

    .line 25
    .line 26
    iput-object p12, p0, Lfb/m2;->l:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p13, p0, Lfb/m2;->m:Ljava/lang/Integer;

    .line 29
    .line 30
    iput-object p14, p0, Lfb/m2;->n:Ljava/lang/Integer;

    .line 31
    .line 32
    return-void
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
    instance-of v0, p1, Lfb/m2;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lfb/m2;

    .line 12
    .line 13
    iget-object v0, p0, Lfb/m2;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lfb/m2;->a:Ljava/lang/String;

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
    iget-boolean v0, p0, Lfb/m2;->b:Z

    .line 26
    .line 27
    iget-boolean v1, p1, Lfb/m2;->b:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, Lfb/m2;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, Lfb/m2;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-boolean v0, p0, Lfb/m2;->d:Z

    .line 45
    .line 46
    iget-boolean v1, p1, Lfb/m2;->d:Z

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-boolean v0, p0, Lfb/m2;->e:Z

    .line 52
    .line 53
    iget-boolean v1, p1, Lfb/m2;->e:Z

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-boolean v0, p0, Lfb/m2;->f:Z

    .line 59
    .line 60
    iget-boolean v1, p1, Lfb/m2;->f:Z

    .line 61
    .line 62
    if-eq v0, v1, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-boolean v0, p0, Lfb/m2;->g:Z

    .line 66
    .line 67
    iget-boolean v1, p1, Lfb/m2;->g:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-boolean v0, p0, Lfb/m2;->h:Z

    .line 73
    .line 74
    iget-boolean v1, p1, Lfb/m2;->h:Z

    .line 75
    .line 76
    if-eq v0, v1, :cond_9

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_9
    iget-boolean v0, p0, Lfb/m2;->i:Z

    .line 80
    .line 81
    iget-boolean v1, p1, Lfb/m2;->i:Z

    .line 82
    .line 83
    if-eq v0, v1, :cond_a

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_a
    iget-boolean v0, p0, Lfb/m2;->j:Z

    .line 87
    .line 88
    iget-boolean v1, p1, Lfb/m2;->j:Z

    .line 89
    .line 90
    if-eq v0, v1, :cond_b

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_b
    iget-boolean v0, p0, Lfb/m2;->k:Z

    .line 94
    .line 95
    iget-boolean v1, p1, Lfb/m2;->k:Z

    .line 96
    .line 97
    if-eq v0, v1, :cond_c

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_c
    iget-object v0, p0, Lfb/m2;->l:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v1, p1, Lfb/m2;->l:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_d

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_d
    iget-object v0, p0, Lfb/m2;->m:Ljava/lang/Integer;

    .line 112
    .line 113
    iget-object v1, p1, Lfb/m2;->m:Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_e

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_e
    iget-object v0, p0, Lfb/m2;->n:Ljava/lang/Integer;

    .line 123
    .line 124
    iget-object p1, p1, Lfb/m2;->n:Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-nez p1, :cond_f

    .line 131
    .line 132
    :goto_0
    const/4 p1, 0x0

    .line 133
    return p1

    .line 134
    :cond_f
    :goto_1
    const/4 p1, 0x1

    .line 135
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lfb/m2;->a:Ljava/lang/String;

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
    iget-boolean v2, p0, Lfb/m2;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lfb/m2;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lfb/m2;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Lfb/m2;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, Lfb/m2;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lfb/m2;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lfb/m2;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, Lfb/m2;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, Lfb/m2;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, Lfb/m2;->k:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, Lfb/m2;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v2, 0x0

    .line 77
    iget-object v3, p0, Lfb/m2;->m:Ljava/lang/Integer;

    .line 78
    .line 79
    if-nez v3, :cond_0

    .line 80
    .line 81
    move v3, v2

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    :goto_0
    add-int/2addr v0, v3

    .line 88
    mul-int/2addr v0, v1

    .line 89
    iget-object v1, p0, Lfb/m2;->n:Ljava/lang/Integer;

    .line 90
    .line 91
    if-nez v1, :cond_1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    :goto_1
    add-int/2addr v0, v2

    .line 99
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AccessState(path="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lfb/m2;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", exists="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lfb/m2;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", type="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lfb/m2;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", readable="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, Lfb/m2;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", writable="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", executable="

    .line 49
    .line 50
    const-string v2, ", symbolicLink="

    .line 51
    .line 52
    iget-boolean v3, p0, Lfb/m2;->e:Z

    .line 53
    .line 54
    iget-boolean v4, p0, Lfb/m2;->f:Z

    .line 55
    .line 56
    invoke-static {v0, v3, v1, v4, v2}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", parentWritable="

    .line 60
    .line 61
    const-string v2, ", replaceable="

    .line 62
    .line 63
    iget-boolean v3, p0, Lfb/m2;->g:Z

    .line 64
    .line 65
    iget-boolean v4, p0, Lfb/m2;->h:Z

    .line 66
    .line 67
    invoke-static {v0, v3, v1, v4, v2}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", workspaceReadable="

    .line 71
    .line 72
    const-string v2, ", modifiable="

    .line 73
    .line 74
    iget-boolean v3, p0, Lfb/m2;->i:Z

    .line 75
    .line 76
    iget-boolean v4, p0, Lfb/m2;->j:Z

    .line 77
    .line 78
    invoke-static {v0, v3, v1, v4, v2}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-boolean v1, p0, Lfb/m2;->k:Z

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", mode="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lfb/m2;->l:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", ownerUid="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lfb/m2;->m:Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", ownerGid="

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lfb/m2;->n:Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ")"

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0
.end method

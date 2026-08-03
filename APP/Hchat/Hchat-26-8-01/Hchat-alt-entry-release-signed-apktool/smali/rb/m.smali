.class public final Lrb/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:I

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/List;

.field public final i:Z

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I


# direct methods
.method public constructor <init>(ZZLjava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/List;ZIIII)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-boolean p1, p0, Lrb/m;->a:Z

    .line 17
    .line 18
    iput-boolean p2, p0, Lrb/m;->b:Z

    .line 19
    .line 20
    iput-object p3, p0, Lrb/m;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p4, p0, Lrb/m;->d:Ljava/lang/String;

    .line 23
    .line 24
    iput p5, p0, Lrb/m;->e:I

    .line 25
    .line 26
    iput p6, p0, Lrb/m;->f:I

    .line 27
    .line 28
    iput-object p7, p0, Lrb/m;->g:Ljava/util/List;

    .line 29
    .line 30
    iput-object p8, p0, Lrb/m;->h:Ljava/util/List;

    .line 31
    .line 32
    iput-boolean p9, p0, Lrb/m;->i:Z

    .line 33
    .line 34
    iput p10, p0, Lrb/m;->j:I

    .line 35
    .line 36
    iput p11, p0, Lrb/m;->k:I

    .line 37
    .line 38
    iput p12, p0, Lrb/m;->l:I

    .line 39
    .line 40
    iput p13, p0, Lrb/m;->m:I

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lrb/m;->g:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move v2, v0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lrb/d;

    .line 29
    .line 30
    iget-object v3, v3, Lrb/d;->c:Lrb/e;

    .line 31
    .line 32
    sget-object v4, Lrb/e;->h:Lrb/e;

    .line 33
    .line 34
    if-ne v3, v4, :cond_2

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v0

    .line 39
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    if-ltz v2, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-static {}, La/a;->P0()V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    throw v0

    .line 59
    :cond_4
    return v2
.end method

.method public final b()I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lrb/m;->g:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move v2, v0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lrb/d;

    .line 29
    .line 30
    iget-object v3, v3, Lrb/d;->c:Lrb/e;

    .line 31
    .line 32
    sget-object v4, Lrb/e;->i:Lrb/e;

    .line 33
    .line 34
    if-ne v3, v4, :cond_2

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v0

    .line 39
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    if-ltz v2, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-static {}, La/a;->P0()V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    throw v0

    .line 59
    :cond_4
    return v2
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
    instance-of v0, p1, Lrb/m;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lrb/m;

    .line 12
    .line 13
    iget-boolean v0, p0, Lrb/m;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, Lrb/m;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-boolean v0, p0, Lrb/m;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p1, Lrb/m;->b:Z

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_3
    iget-object v0, p0, Lrb/m;->c:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v1, p1, Lrb/m;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_4

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_4
    iget-object v0, p0, Lrb/m;->d:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p1, Lrb/m;->d:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_5
    iget v0, p0, Lrb/m;->e:I

    .line 51
    .line 52
    iget v1, p1, Lrb/m;->e:I

    .line 53
    .line 54
    if-eq v0, v1, :cond_6

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_6
    iget v0, p0, Lrb/m;->f:I

    .line 58
    .line 59
    iget v1, p1, Lrb/m;->f:I

    .line 60
    .line 61
    if-eq v0, v1, :cond_7

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_7
    iget-object v0, p0, Lrb/m;->g:Ljava/util/List;

    .line 65
    .line 66
    iget-object v1, p1, Lrb/m;->g:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_8
    iget-object v0, p0, Lrb/m;->h:Ljava/util/List;

    .line 76
    .line 77
    iget-object v1, p1, Lrb/m;->h:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_9

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_9
    iget-boolean v0, p0, Lrb/m;->i:Z

    .line 87
    .line 88
    iget-boolean v1, p1, Lrb/m;->i:Z

    .line 89
    .line 90
    if-eq v0, v1, :cond_a

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_a
    iget v0, p0, Lrb/m;->j:I

    .line 94
    .line 95
    iget v1, p1, Lrb/m;->j:I

    .line 96
    .line 97
    if-eq v0, v1, :cond_b

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_b
    iget v0, p0, Lrb/m;->k:I

    .line 101
    .line 102
    iget v1, p1, Lrb/m;->k:I

    .line 103
    .line 104
    if-eq v0, v1, :cond_c

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_c
    iget v0, p0, Lrb/m;->l:I

    .line 108
    .line 109
    iget v1, p1, Lrb/m;->l:I

    .line 110
    .line 111
    if-eq v0, v1, :cond_d

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_d
    iget v0, p0, Lrb/m;->m:I

    .line 115
    .line 116
    iget p1, p1, Lrb/m;->m:I

    .line 117
    .line 118
    if-eq v0, p1, :cond_e

    .line 119
    .line 120
    :goto_0
    const/4 p1, 0x0

    .line 121
    return p1

    .line 122
    :cond_e
    :goto_1
    const/4 p1, 0x1

    .line 123
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lrb/m;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, Lrb/m;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lrb/m;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lrb/m;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lrb/m;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lrb/m;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lrb/m;->g:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lrb/m;->h:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, Lrb/m;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, Lrb/m;->j:I

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, Lrb/m;->k:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v2, p0, Lrb/m;->l:I

    .line 71
    .line 72
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v1, p0, Lrb/m;->m:I

    .line 77
    .line 78
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-int/2addr v1, v0

    .line 83
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ZombieCheckSnapshot(ready="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lrb/m;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", running="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lrb/m;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", status="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", currentName="

    .line 29
    .line 30
    const-string v2, ", totalCount="

    .line 31
    .line 32
    iget-object v3, p0, Lrb/m;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, Lrb/m;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", pendingCount="

    .line 40
    .line 41
    const-string v2, ", results="

    .line 42
    .line 43
    iget v3, p0, Lrb/m;->e:I

    .line 44
    .line 45
    iget v4, p0, Lrb/m;->f:I

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lrb/m;->g:Ljava/util/List;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", logs="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lrb/m;->h:Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", deleting="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-boolean v1, p0, Lrb/m;->i:Z

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", deleteTotalCount="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget v1, p0, Lrb/m;->j:I

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", deleteCompletedCount="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", deleteSuccessCount="

    .line 91
    .line 92
    const-string v2, ", deleteFailureCount="

    .line 93
    .line 94
    iget v3, p0, Lrb/m;->k:I

    .line 95
    .line 96
    iget v4, p0, Lrb/m;->l:I

    .line 97
    .line 98
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v1, ")"

    .line 102
    .line 103
    iget v2, p0, Lrb/m;->m:I

    .line 104
    .line 105
    invoke-static {v0, v2, v1}, Lj8/b;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0
.end method

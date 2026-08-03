.class public final Lhb/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/List;

.field public final d:Lfg/q;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Lhb/p;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Lfg/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhb/q;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lhb/q;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput-object p3, p0, Lhb/q;->c:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lhb/q;->d:Lfg/q;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lhb/q;->e:I

    .line 14
    .line 15
    iput p1, p0, Lhb/q;->f:I

    .line 16
    .line 17
    iput p1, p0, Lhb/q;->g:I

    .line 18
    .line 19
    iput p1, p0, Lhb/q;->h:I

    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    iput p1, p0, Lhb/q;->i:I

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Lhb/q;->j:Lhb/p;

    .line 26
    .line 27
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
    instance-of v0, p1, Lhb/q;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lhb/q;

    .line 11
    .line 12
    iget-object v0, p0, Lhb/q;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p1, Lhb/q;->a:Ljava/lang/String;

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
    iget-object v0, p0, Lhb/q;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object v1, p1, Lhb/q;->b:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object v0, p0, Lhb/q;->c:Ljava/util/List;

    .line 35
    .line 36
    iget-object v1, p1, Lhb/q;->c:Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget-object v0, p0, Lhb/q;->d:Lfg/q;

    .line 46
    .line 47
    iget-object v1, p1, Lhb/q;->d:Lfg/q;

    .line 48
    .line 49
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    iget v0, p0, Lhb/q;->e:I

    .line 57
    .line 58
    iget v1, p1, Lhb/q;->e:I

    .line 59
    .line 60
    if-eq v0, v1, :cond_6

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_6
    iget v0, p0, Lhb/q;->f:I

    .line 64
    .line 65
    iget v1, p1, Lhb/q;->f:I

    .line 66
    .line 67
    if-eq v0, v1, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    iget v0, p0, Lhb/q;->g:I

    .line 71
    .line 72
    iget v1, p1, Lhb/q;->g:I

    .line 73
    .line 74
    if-eq v0, v1, :cond_8

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_8
    iget v0, p0, Lhb/q;->h:I

    .line 78
    .line 79
    iget v1, p1, Lhb/q;->h:I

    .line 80
    .line 81
    if-eq v0, v1, :cond_9

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_9
    iget v0, p0, Lhb/q;->i:I

    .line 85
    .line 86
    iget v1, p1, Lhb/q;->i:I

    .line 87
    .line 88
    if-eq v0, v1, :cond_a

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_a
    iget-object v0, p0, Lhb/q;->j:Lhb/p;

    .line 92
    .line 93
    iget-object p1, p1, Lhb/q;->j:Lhb/p;

    .line 94
    .line 95
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_b

    .line 100
    .line 101
    :goto_0
    const/4 p1, 0x0

    .line 102
    return p1

    .line 103
    :cond_b
    :goto_1
    const/4 p1, 0x1

    .line 104
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lhb/q;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lhb/q;->b:Ljava/util/ArrayList;

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
    iget-object v0, p0, Lhb/q;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    iget-object v3, p0, Lhb/q;->d:Lfg/q;

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    move v3, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    :goto_0
    add-int/2addr v0, v3

    .line 36
    mul-int/2addr v0, v1

    .line 37
    iget v3, p0, Lhb/q;->e:I

    .line 38
    .line 39
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget v3, p0, Lhb/q;->f:I

    .line 44
    .line 45
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget v3, p0, Lhb/q;->g:I

    .line 50
    .line 51
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget v3, p0, Lhb/q;->h:I

    .line 56
    .line 57
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget v3, p0, Lhb/q;->i:I

    .line 62
    .line 63
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget-object v1, p0, Lhb/q;->j:Lhb/p;

    .line 68
    .line 69
    if-nez v1, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v1}, Lhb/p;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :goto_1
    add-int/2addr v0, v2

    .line 77
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget v0, p0, Lhb/q;->e:I

    .line 2
    .line 3
    iget v1, p0, Lhb/q;->f:I

    .line 4
    .line 5
    iget v2, p0, Lhb/q;->g:I

    .line 6
    .line 7
    iget v3, p0, Lhb/q;->h:I

    .line 8
    .line 9
    iget v4, p0, Lhb/q;->i:I

    .line 10
    .line 11
    iget-object v5, p0, Lhb/q;->j:Lhb/p;

    .line 12
    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v7, "SendBatch(id="

    .line 16
    .line 17
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v7, p0, Lhb/q;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v7, ", snapshots="

    .line 26
    .line 27
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v7, p0, Lhb/q;->b:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v7, ", targets="

    .line 36
    .line 37
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v7, p0, Lhb/q;->c:Ljava/util/List;

    .line 41
    .line 42
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v7, ", onComplete="

    .line 46
    .line 47
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v7, p0, Lhb/q;->d:Lfg/q;

    .line 51
    .line 52
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v7, ", index="

    .line 56
    .line 57
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v7, ", targetIndex="

    .line 61
    .line 62
    const-string v8, ", success="

    .line 63
    .line 64
    invoke-static {v6, v0, v7, v1, v8}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v0, ", total="

    .line 68
    .line 69
    const-string v1, ", preparedSnapshotIndex="

    .line 70
    .line 71
    invoke-static {v6, v2, v0, v3, v1}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v0, ", directPlan="

    .line 78
    .line 79
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, ")"

    .line 86
    .line 87
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0
.end method

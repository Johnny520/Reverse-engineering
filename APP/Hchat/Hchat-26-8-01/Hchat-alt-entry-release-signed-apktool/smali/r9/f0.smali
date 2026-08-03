.class public final Lr9/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:J

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:J

.field public final l:Z


# direct methods
.method public constructor <init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 0

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lr9/f0;->a:I

    .line 8
    .line 9
    iput-wide p2, p0, Lr9/f0;->b:J

    .line 10
    .line 11
    iput-wide p4, p0, Lr9/f0;->c:J

    .line 12
    .line 13
    iput-object p6, p0, Lr9/f0;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p7, p0, Lr9/f0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p8, p0, Lr9/f0;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p9, p0, Lr9/f0;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p10, p0, Lr9/f0;->h:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p11, p0, Lr9/f0;->i:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p12, p0, Lr9/f0;->j:Ljava/lang/String;

    .line 26
    .line 27
    iput-wide p13, p0, Lr9/f0;->k:J

    .line 28
    .line 29
    iput-boolean p15, p0, Lr9/f0;->l:Z

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
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lr9/f0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lr9/f0;

    .line 12
    .line 13
    iget v0, p0, Lr9/f0;->a:I

    .line 14
    .line 15
    iget v1, p1, Lr9/f0;->a:I

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-wide v0, p0, Lr9/f0;->b:J

    .line 22
    .line 23
    iget-wide v2, p1, Lr9/f0;->b:J

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_3
    iget-wide v0, p0, Lr9/f0;->c:J

    .line 32
    .line 33
    iget-wide v2, p1, Lr9/f0;->c:J

    .line 34
    .line 35
    cmp-long v0, v0, v2

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, Lr9/f0;->d:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p1, Lr9/f0;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-object v0, p0, Lr9/f0;->e:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, p1, Lr9/f0;->e:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-object v0, p0, Lr9/f0;->f:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p1, Lr9/f0;->f:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget-object v0, p0, Lr9/f0;->g:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v1, p1, Lr9/f0;->g:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget-object v0, p0, Lr9/f0;->h:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v1, p1, Lr9/f0;->h:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_9

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_9
    iget-object v0, p0, Lr9/f0;->i:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v1, p1, Lr9/f0;->i:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_a

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_a
    iget-object v0, p0, Lr9/f0;->j:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v1, p1, Lr9/f0;->j:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_b

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_b
    iget-wide v0, p0, Lr9/f0;->k:J

    .line 118
    .line 119
    iget-wide v2, p1, Lr9/f0;->k:J

    .line 120
    .line 121
    cmp-long v0, v0, v2

    .line 122
    .line 123
    if-eqz v0, :cond_c

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_c
    iget-boolean v0, p0, Lr9/f0;->l:Z

    .line 127
    .line 128
    iget-boolean p1, p1, Lr9/f0;->l:Z

    .line 129
    .line 130
    if-eq v0, p1, :cond_d

    .line 131
    .line 132
    :goto_0
    const/4 p1, 0x0

    .line 133
    return p1

    .line 134
    :cond_d
    :goto_1
    const/4 p1, 0x1

    .line 135
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lr9/f0;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-wide v2, p0, Lr9/f0;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lr9/f0;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lr9/f0;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lr9/f0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lr9/f0;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lr9/f0;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lr9/f0;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lr9/f0;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, Lr9/f0;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-wide v2, p0, Lr9/f0;->k:J

    .line 65
    .line 66
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v1, p0, Lr9/f0;->l:Z

    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MessageDetails(type="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lr9/f0;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", id="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Lr9/f0;->b:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", serverId="

    .line 24
    .line 25
    const-string v2, ", talker="

    .line 26
    .line 27
    iget-wide v3, p0, Lr9/f0;->c:J

    .line 28
    .line 29
    invoke-static {v0, v1, v3, v4, v2}, Lj8/b;->s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v1, ", sender="

    .line 33
    .line 34
    const-string v2, ", content="

    .line 35
    .line 36
    iget-object v3, p0, Lr9/f0;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v4, p0, Lr9/f0;->e:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v1, ", body="

    .line 44
    .line 45
    const-string v2, ", msgSource="

    .line 46
    .line 47
    iget-object v3, p0, Lr9/f0;->f:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v4, p0, Lr9/f0;->g:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v1, ", atUserList="

    .line 55
    .line 56
    const-string v2, ", nativeClassName="

    .line 57
    .line 58
    iget-object v3, p0, Lr9/f0;->h:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v4, p0, Lr9/f0;->i:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lr9/f0;->j:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", createTime="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-wide v1, p0, Lr9/f0;->k:J

    .line 76
    .line 77
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", isSelf="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-boolean v1, p0, Lr9/f0;->l:Z

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ")"

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    return-object v0
.end method

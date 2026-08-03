.class public final Lsh/l1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J


# direct methods
.method public constructor <init>(JJJJJJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lsh/l1;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Lsh/l1;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, Lsh/l1;->c:J

    .line 9
    .line 10
    iput-wide p7, p0, Lsh/l1;->d:J

    .line 11
    .line 12
    iput-wide p9, p0, Lsh/l1;->e:J

    .line 13
    .line 14
    iput-wide p11, p0, Lsh/l1;->f:J

    .line 15
    .line 16
    iput-wide p13, p0, Lsh/l1;->g:J

    .line 17
    .line 18
    move-wide p1, p15

    .line 19
    iput-wide p1, p0, Lsh/l1;->h:J

    .line 20
    .line 21
    return-void
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
    instance-of v1, p1, Lsh/l1;

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
    check-cast p1, Lsh/l1;

    .line 12
    .line 13
    iget-wide v3, p0, Lsh/l1;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, Lsh/l1;->a:J

    .line 16
    .line 17
    invoke-static {v3, v4, v5, v6}, Lf1/w;->c(JJ)Z

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
    iget-wide v3, p0, Lsh/l1;->b:J

    .line 25
    .line 26
    iget-wide v5, p1, Lsh/l1;->b:J

    .line 27
    .line 28
    invoke-static {v3, v4, v5, v6}, Lf1/w;->c(JJ)Z

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
    iget-wide v3, p0, Lsh/l1;->c:J

    .line 36
    .line 37
    iget-wide v5, p1, Lsh/l1;->c:J

    .line 38
    .line 39
    invoke-static {v3, v4, v5, v6}, Lf1/w;->c(JJ)Z

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
    iget-wide v3, p0, Lsh/l1;->d:J

    .line 47
    .line 48
    iget-wide v5, p1, Lsh/l1;->d:J

    .line 49
    .line 50
    invoke-static {v3, v4, v5, v6}, Lf1/w;->c(JJ)Z

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
    iget-wide v3, p0, Lsh/l1;->e:J

    .line 58
    .line 59
    iget-wide v5, p1, Lsh/l1;->e:J

    .line 60
    .line 61
    invoke-static {v3, v4, v5, v6}, Lf1/w;->c(JJ)Z

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
    iget-wide v3, p0, Lsh/l1;->f:J

    .line 69
    .line 70
    iget-wide v5, p1, Lsh/l1;->f:J

    .line 71
    .line 72
    invoke-static {v3, v4, v5, v6}, Lf1/w;->c(JJ)Z

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
    iget-wide v3, p0, Lsh/l1;->g:J

    .line 80
    .line 81
    iget-wide v5, p1, Lsh/l1;->g:J

    .line 82
    .line 83
    invoke-static {v3, v4, v5, v6}, Lf1/w;->c(JJ)Z

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
    iget-wide v3, p0, Lsh/l1;->h:J

    .line 91
    .line 92
    iget-wide v5, p1, Lsh/l1;->h:J

    .line 93
    .line 94
    invoke-static {v3, v4, v5, v6}, Lf1/w;->c(JJ)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget v0, Lf1/w;->h:I

    .line 2
    .line 3
    iget-wide v0, p0, Lsh/l1;->a:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-wide v2, p0, Lsh/l1;->b:J

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-wide v2, p0, Lsh/l1;->c:J

    .line 19
    .line 20
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-wide v2, p0, Lsh/l1;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-wide v2, p0, Lsh/l1;->e:J

    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-wide v2, p0, Lsh/l1;->f:J

    .line 37
    .line 38
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-wide v2, p0, Lsh/l1;->g:J

    .line 43
    .line 44
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-wide v1, p0, Lsh/l1;->h:J

    .line 49
    .line 50
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/2addr v1, v0

    .line 55
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-wide v0, p0, Lsh/l1;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lf1/w;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Lsh/l1;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Lf1/w;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, Lsh/l1;->c:J

    .line 14
    .line 15
    invoke-static {v2, v3}, Lf1/w;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v3, p0, Lsh/l1;->d:J

    .line 20
    .line 21
    invoke-static {v3, v4}, Lf1/w;->i(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v4, p0, Lsh/l1;->e:J

    .line 26
    .line 27
    invoke-static {v4, v5}, Lf1/w;->i(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-wide v5, p0, Lsh/l1;->f:J

    .line 32
    .line 33
    invoke-static {v5, v6}, Lf1/w;->i(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-wide v6, p0, Lsh/l1;->g:J

    .line 38
    .line 39
    invoke-static {v6, v7}, Lf1/w;->i(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget-wide v7, p0, Lsh/l1;->h:J

    .line 44
    .line 45
    invoke-static {v7, v8}, Lf1/w;->i(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const-string v8, ", uncheckedThumbColor="

    .line 50
    .line 51
    const-string v9, ", disabledCheckedThumbColor="

    .line 52
    .line 53
    const-string v10, "SwitchColors(checkedThumbColor="

    .line 54
    .line 55
    invoke-static {v10, v0, v8, v1, v9}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, ", disabledUncheckedThumbColor="

    .line 60
    .line 61
    const-string v8, ", checkedTrackColor="

    .line 62
    .line 63
    invoke-static {v0, v2, v1, v3, v8}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v1, ", uncheckedTrackColor="

    .line 67
    .line 68
    const-string v2, ", disabledCheckedTrackColor="

    .line 69
    .line 70
    invoke-static {v0, v4, v1, v5, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v1, ", disabledUncheckedTrackColor="

    .line 74
    .line 75
    const-string v2, ")"

    .line 76
    .line 77
    invoke-static {v0, v6, v1, v7, v2}, Lj8/b;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0
.end method

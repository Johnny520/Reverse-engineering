.class public final Lz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Z

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:J

.field public final k:Z

.field public final l:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Throwable;I)V
    .locals 17

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    move v3, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    and-int/lit8 v1, v0, 0x2

    .line 1
    const-string v9, ""

    if-eqz v1, :cond_1

    move-object v4, v9

    goto :goto_2

    :cond_1
    const-string v1, "\u8f6f\u4ef6\u5b8c\u6574\u6027\u6821\u9a8c\u5931\u8d25\uff0c\u529f\u80fd\u5df2\u505c\u7528"

    move-object v4, v1

    :goto_2
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move-object/from16 v16, v0

    goto :goto_3

    :cond_2
    move-object/from16 v16, p1

    :goto_3
    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object v11, v9

    move-object v12, v9

    move-object/from16 v2, p0

    invoke-direct/range {v2 .. v16}, Lz0/b;-><init>(ZLjava/lang/String;JZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;JZLjava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;JZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;JZLjava/lang/Throwable;)V
    .locals 1

    const-string v0, "serviceMessage"

    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lz0/b;->a:Z

    .line 4
    iput-object p2, p0, Lz0/b;->b:Ljava/lang/String;

    .line 5
    iput-wide p3, p0, Lz0/b;->c:J

    .line 6
    iput-boolean p5, p0, Lz0/b;->d:Z

    .line 7
    iput p6, p0, Lz0/b;->e:I

    .line 8
    iput-object p7, p0, Lz0/b;->f:Ljava/lang/String;

    .line 9
    iput-boolean p8, p0, Lz0/b;->g:Z

    .line 10
    iput-object p9, p0, Lz0/b;->h:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lz0/b;->i:Ljava/lang/String;

    .line 12
    iput-wide p11, p0, Lz0/b;->j:J

    .line 13
    iput-boolean p13, p0, Lz0/b;->k:Z

    .line 14
    iput-object p14, p0, Lz0/b;->l:Ljava/lang/Throwable;

    return-void
.end method

.method public static a(Lz0/b;Ljava/lang/Throwable;I)Lz0/b;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-boolean v2, v0, Lz0/b;->a:Z

    .line 10
    .line 11
    :goto_0
    move v4, v2

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, v0, Lz0/b;->b:Ljava/lang/String;

    .line 20
    .line 21
    :goto_2
    move-object v5, v2

    .line 22
    goto :goto_3

    .line 23
    :cond_1
    const-string v2, "\u914d\u7f6e\u5df2\u8fc7\u671f\u4e14\u65e0\u6cd5\u8fde\u63a5\u540e\u53f0\uff0c\u8f6f\u4ef6\u529f\u80fd\u5df2\u505c\u7528"

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :goto_3
    and-int/lit16 v1, v1, 0x400

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    iget-boolean v1, v0, Lz0/b;->k:Z

    .line 31
    .line 32
    :goto_4
    move/from16 v16, v1

    .line 33
    .line 34
    goto :goto_5

    .line 35
    :cond_2
    const/4 v1, 0x1

    .line 36
    goto :goto_4

    .line 37
    :goto_5
    const-string v1, "serviceMessage"

    .line 38
    .line 39
    invoke-static {v5, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v1, "latestVersionName"

    .line 43
    .line 44
    iget-object v10, v0, Lz0/b;->f:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v10, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v1, "updateMessage"

    .line 50
    .line 51
    iget-object v12, v0, Lz0/b;->h:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v12, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v1, "downloadUrl"

    .line 57
    .line 58
    iget-object v13, v0, Lz0/b;->i:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v13, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Lz0/b;

    .line 64
    .line 65
    iget-wide v6, v0, Lz0/b;->c:J

    .line 66
    .line 67
    iget-boolean v8, v0, Lz0/b;->d:Z

    .line 68
    .line 69
    iget v9, v0, Lz0/b;->e:I

    .line 70
    .line 71
    iget-boolean v11, v0, Lz0/b;->g:Z

    .line 72
    .line 73
    iget-wide v14, v0, Lz0/b;->j:J

    .line 74
    .line 75
    move-object/from16 v17, p1

    .line 76
    .line 77
    invoke-direct/range {v3 .. v17}, Lz0/b;-><init>(ZLjava/lang/String;JZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;JZLjava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    return-object v3
.end method


# virtual methods
.method public final b()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lz0/b;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lz0/b;->d:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lz0/b;->e:I

    .line 10
    .line 11
    const/16 v1, 0x403

    .line 12
    .line 13
    if-le v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lz0/b;->i:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
.end method

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
    instance-of v1, p1, Lz0/b;

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
    check-cast p1, Lz0/b;

    .line 12
    .line 13
    iget-boolean v1, p1, Lz0/b;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p0, Lz0/b;->a:Z

    .line 16
    .line 17
    if-eq v3, v1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lz0/b;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, Lz0/b;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-wide v3, p0, Lz0/b;->c:J

    .line 32
    .line 33
    iget-wide v5, p1, Lz0/b;->c:J

    .line 34
    .line 35
    cmp-long v1, v3, v5

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget-boolean v1, p0, Lz0/b;->d:Z

    .line 41
    .line 42
    iget-boolean v3, p1, Lz0/b;->d:Z

    .line 43
    .line 44
    if-eq v1, v3, :cond_5

    .line 45
    .line 46
    return v2

    .line 47
    :cond_5
    iget v1, p0, Lz0/b;->e:I

    .line 48
    .line 49
    iget v3, p1, Lz0/b;->e:I

    .line 50
    .line 51
    if-eq v1, v3, :cond_6

    .line 52
    .line 53
    return v2

    .line 54
    :cond_6
    iget-object v1, p0, Lz0/b;->f:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v3, p1, Lz0/b;->f:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_7

    .line 63
    .line 64
    return v2

    .line 65
    :cond_7
    iget-boolean v1, p0, Lz0/b;->g:Z

    .line 66
    .line 67
    iget-boolean v3, p1, Lz0/b;->g:Z

    .line 68
    .line 69
    if-eq v1, v3, :cond_8

    .line 70
    .line 71
    return v2

    .line 72
    :cond_8
    iget-object v1, p0, Lz0/b;->h:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v3, p1, Lz0/b;->h:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_9

    .line 81
    .line 82
    return v2

    .line 83
    :cond_9
    iget-object v1, p0, Lz0/b;->i:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v3, p1, Lz0/b;->i:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v1, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_a

    .line 92
    .line 93
    return v2

    .line 94
    :cond_a
    iget-wide v3, p0, Lz0/b;->j:J

    .line 95
    .line 96
    iget-wide v5, p1, Lz0/b;->j:J

    .line 97
    .line 98
    cmp-long v1, v3, v5

    .line 99
    .line 100
    if-eqz v1, :cond_b

    .line 101
    .line 102
    return v2

    .line 103
    :cond_b
    iget-boolean v1, p0, Lz0/b;->k:Z

    .line 104
    .line 105
    iget-boolean v3, p1, Lz0/b;->k:Z

    .line 106
    .line 107
    if-eq v1, v3, :cond_c

    .line 108
    .line 109
    return v2

    .line 110
    :cond_c
    iget-object v1, p0, Lz0/b;->l:Ljava/lang/Throwable;

    .line 111
    .line 112
    iget-object p1, p1, Lz0/b;->l:Ljava/lang/Throwable;

    .line 113
    .line 114
    invoke-static {v1, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_d

    .line 119
    .line 120
    return v2

    .line 121
    :cond_d
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lz0/b;->a:Z

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
    iget-object v2, p0, Lz0/b;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lz0/b;->c:J

    .line 17
    .line 18
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-boolean v0, p0, Lz0/b;->d:Z

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget v2, p0, Lz0/b;->e:I

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, Lz0/b;->f:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-boolean v2, p0, Lz0/b;->g:Z

    .line 45
    .line 46
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, v0

    .line 51
    mul-int/2addr v2, v1

    .line 52
    iget-object v0, p0, Lz0/b;->h:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v2, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, Lz0/b;->i:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-wide v2, p0, Lz0/b;->j:J

    .line 65
    .line 66
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    add-int/2addr v2, v0

    .line 71
    mul-int/2addr v2, v1

    .line 72
    iget-boolean v0, p0, Lz0/b;->k:Z

    .line 73
    .line 74
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, v2

    .line 79
    mul-int/2addr v0, v1

    .line 80
    iget-object v1, p0, Lz0/b;->l:Ljava/lang/Throwable;

    .line 81
    .line 82
    if-nez v1, :cond_0

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    :goto_0
    add-int/2addr v0, v1

    .line 91
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AppUpdateCheckResult(serviceEnabled="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lz0/b;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", serviceMessage="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lz0/b;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", validUntil="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Lz0/b;->c:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", updateEnabled="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, Lz0/b;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", latestVersionCode="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lz0/b;->e:I

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", latestVersionName="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lz0/b;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", forceUpdate="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-boolean v1, p0, Lz0/b;->g:Z

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", updateMessage="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lz0/b;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", downloadUrl="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lz0/b;->i:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", serverTime="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-wide v1, p0, Lz0/b;->j:J

    .line 99
    .line 100
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", fromCache="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-boolean v1, p0, Lz0/b;->k:Z

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", error="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lz0/b;->l:Ljava/lang/Throwable;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ")"

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    return-object v0
.end method

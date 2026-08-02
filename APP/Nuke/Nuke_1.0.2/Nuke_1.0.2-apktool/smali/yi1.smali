.class public final Lyi1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:[B

.field public final e:I

.field public final f:J

.field public final g:J

.field public final h:Ljava/lang/String;

.field public final i:J

.field public final j:J

.field public final k:I

.field public final l:J


# direct methods
.method public constructor <init>(IILjava/lang/String;[BIJJLjava/lang/String;JJIJI)V
    .locals 4

    .line 1
    move/from16 v0, p18

    .line 2
    .line 3
    and-int/lit16 v1, v0, 0x400

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move/from16 v1, p15

    .line 10
    .line 11
    :goto_0
    and-int/lit16 v0, v0, 0x800

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-wide/from16 v2, p16

    .line 19
    .line 20
    :goto_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput p1, p0, Lyi1;->a:I

    .line 24
    .line 25
    iput p2, p0, Lyi1;->b:I

    .line 26
    .line 27
    iput-object p3, p0, Lyi1;->c:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p4, p0, Lyi1;->d:[B

    .line 30
    .line 31
    iput p5, p0, Lyi1;->e:I

    .line 32
    .line 33
    iput-wide p6, p0, Lyi1;->f:J

    .line 34
    .line 35
    iput-wide p8, p0, Lyi1;->g:J

    .line 36
    .line 37
    iput-object p10, p0, Lyi1;->h:Ljava/lang/String;

    .line 38
    .line 39
    move-wide p1, p11

    .line 40
    iput-wide p1, p0, Lyi1;->i:J

    .line 41
    .line 42
    move-wide/from16 p1, p13

    .line 43
    .line 44
    iput-wide p1, p0, Lyi1;->j:J

    .line 45
    .line 46
    iput v1, p0, Lyi1;->k:I

    .line 47
    .line 48
    iput-wide v2, p0, Lyi1;->l:J

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v0, 0x0

    .line 13
    :goto_0
    const-class v1, Lyi1;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, Lyi1;

    .line 27
    .line 28
    iget v0, p0, Lyi1;->a:I

    .line 29
    .line 30
    iget v1, p1, Lyi1;->a:I

    .line 31
    .line 32
    if-eq v0, v1, :cond_3

    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_3
    iget v0, p0, Lyi1;->b:I

    .line 37
    .line 38
    iget v1, p1, Lyi1;->b:I

    .line 39
    .line 40
    if-eq v0, v1, :cond_4

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    iget v0, p0, Lyi1;->e:I

    .line 44
    .line 45
    iget v1, p1, Lyi1;->e:I

    .line 46
    .line 47
    if-eq v0, v1, :cond_5

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_5
    iget-wide v0, p0, Lyi1;->f:J

    .line 51
    .line 52
    iget-wide v2, p1, Lyi1;->f:J

    .line 53
    .line 54
    cmp-long v0, v0, v2

    .line 55
    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_6
    iget-wide v0, p0, Lyi1;->g:J

    .line 60
    .line 61
    iget-wide v2, p1, Lyi1;->g:J

    .line 62
    .line 63
    cmp-long v0, v0, v2

    .line 64
    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_7
    iget-wide v0, p0, Lyi1;->i:J

    .line 69
    .line 70
    iget-wide v2, p1, Lyi1;->i:J

    .line 71
    .line 72
    cmp-long v0, v0, v2

    .line 73
    .line 74
    if-eqz v0, :cond_8

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_8
    iget-wide v0, p0, Lyi1;->j:J

    .line 78
    .line 79
    iget-wide v2, p1, Lyi1;->j:J

    .line 80
    .line 81
    cmp-long v0, v0, v2

    .line 82
    .line 83
    if-eqz v0, :cond_9

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_9
    iget v0, p0, Lyi1;->k:I

    .line 87
    .line 88
    iget v1, p1, Lyi1;->k:I

    .line 89
    .line 90
    if-eq v0, v1, :cond_a

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_a
    iget-wide v0, p0, Lyi1;->l:J

    .line 94
    .line 95
    iget-wide v2, p1, Lyi1;->l:J

    .line 96
    .line 97
    cmp-long v0, v0, v2

    .line 98
    .line 99
    if-eqz v0, :cond_b

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_b
    iget-object v0, p0, Lyi1;->c:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v1, p1, Lyi1;->c:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_c

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_c
    iget-object v0, p0, Lyi1;->d:[B

    .line 114
    .line 115
    iget-object v1, p1, Lyi1;->d:[B

    .line 116
    .line 117
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_d

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_d
    iget-object p0, p0, Lyi1;->h:Ljava/lang/String;

    .line 125
    .line 126
    iget-object p1, p1, Lyi1;->h:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_e

    .line 133
    .line 134
    :goto_1
    const/4 p0, 0x0

    .line 135
    return p0

    .line 136
    :cond_e
    :goto_2
    const/4 p0, 0x1

    .line 137
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lyi1;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    mul-int/2addr v0, v1

    .line 6
    iget v2, p0, Lyi1;->b:I

    .line 7
    .line 8
    add-int/2addr v0, v2

    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lyi1;->e:I

    .line 11
    .line 12
    add-int/2addr v0, v2

    .line 13
    mul-int/2addr v0, v1

    .line 14
    iget-wide v2, p0, Lyi1;->f:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-wide v2, p0, Lyi1;->g:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-wide v2, p0, Lyi1;->i:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-wide v2, p0, Lyi1;->j:J

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget v2, p0, Lyi1;->k:I

    .line 39
    .line 40
    add-int/2addr v0, v2

    .line 41
    mul-int/2addr v0, v1

    .line 42
    iget-wide v2, p0, Lyi1;->l:J

    .line 43
    .line 44
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, Lyi1;->c:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v2, p0, Lyi1;->d:[B

    .line 55
    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 v2, 0x0

    .line 64
    :goto_0
    add-int/2addr v0, v2

    .line 65
    mul-int/2addr v0, v1

    .line 66
    iget-object p0, p0, Lyi1;->h:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {p0, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lyi1;->d:[B

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", status="

    .line 8
    .line 9
    const-string v2, ", talker="

    .line 10
    .line 11
    const-string v3, "MsgInfoBean(isSend="

    .line 12
    .line 13
    iget v4, p0, Lyi1;->a:I

    .line 14
    .line 15
    iget v5, p0, Lyi1;->b:I

    .line 16
    .line 17
    invoke-static {v3, v4, v5, v1, v2}, Lhk1;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, ", lvbuffer="

    .line 22
    .line 23
    const-string v3, ", type="

    .line 24
    .line 25
    iget-object v4, p0, Lyi1;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v4, v2, v0, v3}, Lhk1;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget v0, p0, Lyi1;->e:I

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", msgId="

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-wide v2, p0, Lyi1;->f:J

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", bizChatId="

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-wide v2, p0, Lyi1;->g:J

    .line 51
    .line 52
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ", content="

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lyi1;->h:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, ", createTime="

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-wide v2, p0, Lyi1;->i:J

    .line 71
    .line 72
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, ", msgSvrId="

    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-wide v2, p0, Lyi1;->j:J

    .line 81
    .line 82
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, ", flags="

    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget v0, p0, Lyi1;->k:I

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v0, ", msgSeq="

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-wide v2, p0, Lyi1;->l:J

    .line 101
    .line 102
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p0, ", imgPath=null)"

    .line 106
    .line 107
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0
.end method

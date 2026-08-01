.class final Lwx;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;"
    }
.end annotation


# instance fields
.field public final a:F

.field public final b:J

.field public final c:Lx01;

.field public final d:Z

.field public final e:J

.field public final f:J


# direct methods
.method public constructor <init>(FJLx01;ZJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwx;->a:F

    .line 5
    .line 6
    iput-wide p2, p0, Lwx;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lwx;->c:Lx01;

    .line 9
    .line 10
    iput-boolean p5, p0, Lwx;->d:Z

    .line 11
    .line 12
    iput-wide p6, p0, Lwx;->e:J

    .line 13
    .line 14
    iput-wide p8, p0, Lwx;->f:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final e()Loe0;
    .locals 3

    .line 1
    new-instance v0, Lo11;

    .line 2
    .line 3
    invoke-direct {v0}, Loe0;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iput v1, v0, Lo11;->r:F

    .line 9
    .line 10
    iput v1, v0, Lo11;->s:F

    .line 11
    .line 12
    iput v1, v0, Lo11;->t:F

    .line 13
    .line 14
    iget v1, p0, Lwx;->a:F

    .line 15
    .line 16
    iput v1, v0, Lo11;->u:F

    .line 17
    .line 18
    const/high16 v1, 0x41000000    # 8.0f

    .line 19
    .line 20
    iput v1, v0, Lo11;->v:F

    .line 21
    .line 22
    iget-wide v1, p0, Lwx;->b:J

    .line 23
    .line 24
    iput-wide v1, v0, Lo11;->w:J

    .line 25
    .line 26
    iget-object v1, p0, Lwx;->c:Lx01;

    .line 27
    .line 28
    iput-object v1, v0, Lo11;->x:Lx01;

    .line 29
    .line 30
    iget-boolean v1, p0, Lwx;->d:Z

    .line 31
    .line 32
    iput-boolean v1, v0, Lo11;->y:Z

    .line 33
    .line 34
    iget-wide v1, p0, Lwx;->e:J

    .line 35
    .line 36
    iput-wide v1, v0, Lo11;->z:J

    .line 37
    .line 38
    iget-wide v1, p0, Lwx;->f:J

    .line 39
    .line 40
    iput-wide v1, v0, Lo11;->A:J

    .line 41
    .line 42
    const/4 p0, 0x3

    .line 43
    iput p0, v0, Lo11;->B:I

    .line 44
    .line 45
    new-instance p0, Ls2;

    .line 46
    .line 47
    const/16 v1, 0x16

    .line 48
    .line 49
    invoke-direct {p0, v1, v0}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p0, v0, Lo11;->C:Ls2;

    .line 53
    .line 54
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lwx;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lwx;

    .line 13
    .line 14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_2
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_3
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_4
    const/4 v0, 0x0

    .line 41
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_5

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_5
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget v2, p0, Lwx;->a:F

    .line 57
    .line 58
    iget v3, p1, Lwx;->a:F

    .line 59
    .line 60
    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_9

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_9
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_a

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_a
    const/high16 v0, 0x41000000    # 8.0f

    .line 89
    .line 90
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_b

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_b
    iget-wide v2, p1, Lwx;->b:J

    .line 98
    .line 99
    sget v0, Lt81;->b:I

    .line 100
    .line 101
    iget-wide v4, p0, Lwx;->b:J

    .line 102
    .line 103
    cmp-long v0, v4, v2

    .line 104
    .line 105
    if-nez v0, :cond_10

    .line 106
    .line 107
    iget-object v0, p0, Lwx;->c:Lx01;

    .line 108
    .line 109
    iget-object v2, p1, Lwx;->c:Lx01;

    .line 110
    .line 111
    invoke-static {v0, v2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_c

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_c
    iget-boolean v0, p0, Lwx;->d:Z

    .line 119
    .line 120
    iget-boolean v2, p1, Lwx;->d:Z

    .line 121
    .line 122
    if-eq v0, v2, :cond_d

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_d
    iget-wide v2, p0, Lwx;->e:J

    .line 126
    .line 127
    iget-wide v4, p1, Lwx;->e:J

    .line 128
    .line 129
    invoke-static {v2, v3, v4, v5}, Lff;->c(JJ)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_e

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_e
    iget-wide v2, p0, Lwx;->f:J

    .line 137
    .line 138
    iget-wide p0, p1, Lwx;->f:J

    .line 139
    .line 140
    invoke-static {v2, v3, p0, p1}, Lff;->c(JJ)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-nez p0, :cond_f

    .line 145
    .line 146
    :goto_0
    return v1

    .line 147
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 148
    return p0

    .line 149
    :cond_10
    return v1
.end method

.method public final f(Loe0;)V
    .locals 2

    .line 1
    check-cast p1, Lo11;

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iput v0, p1, Lo11;->r:F

    .line 6
    .line 7
    iput v0, p1, Lo11;->s:F

    .line 8
    .line 9
    iput v0, p1, Lo11;->t:F

    .line 10
    .line 11
    iget v0, p0, Lwx;->a:F

    .line 12
    .line 13
    iput v0, p1, Lo11;->u:F

    .line 14
    .line 15
    const/high16 v0, 0x41000000    # 8.0f

    .line 16
    .line 17
    iput v0, p1, Lo11;->v:F

    .line 18
    .line 19
    iget-wide v0, p0, Lwx;->b:J

    .line 20
    .line 21
    iput-wide v0, p1, Lo11;->w:J

    .line 22
    .line 23
    iget-object v0, p0, Lwx;->c:Lx01;

    .line 24
    .line 25
    iput-object v0, p1, Lo11;->x:Lx01;

    .line 26
    .line 27
    iget-boolean v0, p0, Lwx;->d:Z

    .line 28
    .line 29
    iput-boolean v0, p1, Lo11;->y:Z

    .line 30
    .line 31
    iget-wide v0, p0, Lwx;->e:J

    .line 32
    .line 33
    iput-wide v0, p1, Lo11;->z:J

    .line 34
    .line 35
    iget-wide v0, p0, Lwx;->f:J

    .line 36
    .line 37
    iput-wide v0, p1, Lo11;->A:J

    .line 38
    .line 39
    const/4 p0, 0x3

    .line 40
    iput p0, p1, Lo11;->B:I

    .line 41
    .line 42
    iget-object p0, p1, Lo11;->C:Ls2;

    .line 43
    .line 44
    iget-object v0, p1, Loe0;->d:Loe0;

    .line 45
    .line 46
    iget-boolean v0, v0, Loe0;->q:Z

    .line 47
    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v0, 0x2

    .line 52
    invoke-static {p1, v0}, Lpf1;->O(Lrm;I)Lqj0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object p1, p1, Lqj0;->s:Lqj0;

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    invoke-virtual {p1, p0, v0}, Lqj0;->c1(Lsw;Z)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    return-void
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    mul-int/2addr v1, v2

    .line 10
    invoke-static {v0, v1, v2}, Lt1;->a(FII)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v0, v1, v2}, Lt1;->a(FII)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v1, v0, v2}, Lt1;->a(FII)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v1, v0, v2}, Lt1;->a(FII)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget v3, p0, Lwx;->a:F

    .line 28
    .line 29
    invoke-static {v3, v0, v2}, Lt1;->a(FII)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v1, v0, v2}, Lt1;->a(FII)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v1, v0, v2}, Lt1;->a(FII)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v1, v0, v2}, Lt1;->a(FII)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/high16 v1, 0x41000000    # 8.0f

    .line 46
    .line 47
    invoke-static {v1, v0, v2}, Lt1;->a(FII)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    sget v1, Lt81;->b:I

    .line 52
    .line 53
    iget-wide v3, p0, Lwx;->b:J

    .line 54
    .line 55
    invoke-static {v3, v4, v0, v2}, Lt1;->d(JII)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Lwx;->c:Lx01;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    add-int/2addr v1, v0

    .line 66
    mul-int/2addr v1, v2

    .line 67
    iget-boolean v0, p0, Lwx;->d:Z

    .line 68
    .line 69
    const/16 v3, 0x3c1

    .line 70
    .line 71
    invoke-static {v1, v3, v0}, Lt1;->c(IIZ)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    sget v1, Lff;->h:I

    .line 76
    .line 77
    iget-wide v3, p0, Lwx;->e:J

    .line 78
    .line 79
    invoke-static {v3, v4, v0, v2}, Lt1;->d(JII)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-wide v3, p0, Lwx;->f:J

    .line 84
    .line 85
    invoke-static {v3, v4, v0, v2}, Lt1;->d(JII)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    const/4 v0, 0x0

    .line 90
    invoke-static {v0, p0, v2}, Lt1;->b(III)I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    const/4 v0, 0x3

    .line 95
    invoke-static {v0, p0, v2}, Lt1;->b(III)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=1.0, translationX=0.0, translationY=0.0, shadowElevation="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lwx;->a:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Lwx;->b:J

    .line 19
    .line 20
    invoke-static {v1, v2}, Lt81;->a(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", shape="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lwx;->c:Lx01;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", clip="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-boolean v1, p0, Lwx;->d:Z

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", renderEffect=null, ambientShadowColor="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-wide v1, p0, Lwx;->e:J

    .line 53
    .line 54
    const-string v3, ", spotShadowColor="

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3}, Lt1;->p(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-wide v1, p0, Lwx;->f:J

    .line 60
    .line 61
    invoke-static {v1, v2}, Lff;->i(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p0, ", compositingStrategy=CompositingStrategy(value=0), blendMode="

    .line 69
    .line 70
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x3

    .line 74
    invoke-static {p0}, Lo30;->D(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p0, ", colorFilter=null)"

    .line 82
    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method

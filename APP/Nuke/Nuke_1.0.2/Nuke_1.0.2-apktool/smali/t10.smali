.class public final Lt10;
.super Lyh1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyh1;"
    }
.end annotation


# instance fields
.field public final a:Lq33;

.field public final b:Lk03;

.field public final c:Lt91;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Lus1;

.field public final h:Lb03;

.field public final i:Lxx0;

.field public final j:Lgl0;


# direct methods
.method public constructor <init>(Lq33;Lk03;Lt91;ZZZLus1;Lb03;Lxx0;Lgl0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt10;->a:Lq33;

    .line 5
    .line 6
    iput-object p2, p0, Lt10;->b:Lk03;

    .line 7
    .line 8
    iput-object p3, p0, Lt10;->c:Lt91;

    .line 9
    .line 10
    iput-boolean p4, p0, Lt10;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lt10;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lt10;->f:Z

    .line 15
    .line 16
    iput-object p7, p0, Lt10;->g:Lus1;

    .line 17
    .line 18
    iput-object p8, p0, Lt10;->h:Lb03;

    .line 19
    .line 20
    iput-object p9, p0, Lt10;->i:Lxx0;

    .line 21
    .line 22
    iput-object p10, p0, Lt10;->j:Lgl0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lt10;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    check-cast p1, Lt10;

    .line 12
    .line 13
    iget-object v0, p0, Lt10;->a:Lq33;

    .line 14
    .line 15
    iget-object v2, p1, Lt10;->a:Lq33;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lq33;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, Lt10;->b:Lk03;

    .line 25
    .line 26
    iget-object v2, p1, Lt10;->b:Lk03;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lk03;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-object v0, p0, Lt10;->c:Lt91;

    .line 36
    .line 37
    iget-object v2, p1, Lt10;->c:Lt91;

    .line 38
    .line 39
    if-eq v0, v2, :cond_4

    .line 40
    .line 41
    return v1

    .line 42
    :cond_4
    iget-boolean v0, p0, Lt10;->d:Z

    .line 43
    .line 44
    iget-boolean v2, p1, Lt10;->d:Z

    .line 45
    .line 46
    if-eq v0, v2, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-boolean v0, p0, Lt10;->e:Z

    .line 50
    .line 51
    iget-boolean v2, p1, Lt10;->e:Z

    .line 52
    .line 53
    if-eq v0, v2, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget-boolean v0, p0, Lt10;->f:Z

    .line 57
    .line 58
    iget-boolean v2, p1, Lt10;->f:Z

    .line 59
    .line 60
    if-eq v0, v2, :cond_7

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_7
    iget-object v0, p0, Lt10;->g:Lus1;

    .line 64
    .line 65
    iget-object v2, p1, Lt10;->g:Lus1;

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    iget-object v0, p0, Lt10;->h:Lb03;

    .line 75
    .line 76
    iget-object v2, p1, Lt10;->h:Lb03;

    .line 77
    .line 78
    if-eq v0, v2, :cond_9

    .line 79
    .line 80
    return v1

    .line 81
    :cond_9
    iget-object v0, p0, Lt10;->i:Lxx0;

    .line 82
    .line 83
    iget-object v2, p1, Lt10;->i:Lxx0;

    .line 84
    .line 85
    invoke-static {v0, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_a

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_a
    iget-object p0, p0, Lt10;->j:Lgl0;

    .line 93
    .line 94
    iget-object p1, p1, Lt10;->j:Lgl0;

    .line 95
    .line 96
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_b

    .line 101
    .line 102
    :goto_0
    return v1

    .line 103
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 104
    return p0
.end method

.method public final f()Lth1;
    .locals 3

    .line 1
    new-instance v0, Lw10;

    .line 2
    .line 3
    invoke-direct {v0}, Lu60;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lt10;->a:Lq33;

    .line 7
    .line 8
    iput-object v1, v0, Lw10;->x:Lq33;

    .line 9
    .line 10
    iget-object v1, p0, Lt10;->b:Lk03;

    .line 11
    .line 12
    iput-object v1, v0, Lw10;->y:Lk03;

    .line 13
    .line 14
    iget-object v1, p0, Lt10;->c:Lt91;

    .line 15
    .line 16
    iput-object v1, v0, Lw10;->z:Lt91;

    .line 17
    .line 18
    iget-boolean v1, p0, Lt10;->d:Z

    .line 19
    .line 20
    iput-boolean v1, v0, Lw10;->A:Z

    .line 21
    .line 22
    iget-boolean v1, p0, Lt10;->e:Z

    .line 23
    .line 24
    iput-boolean v1, v0, Lw10;->B:Z

    .line 25
    .line 26
    iget-boolean v1, p0, Lt10;->f:Z

    .line 27
    .line 28
    iput-boolean v1, v0, Lw10;->C:Z

    .line 29
    .line 30
    iget-object v1, p0, Lt10;->g:Lus1;

    .line 31
    .line 32
    iput-object v1, v0, Lw10;->D:Lus1;

    .line 33
    .line 34
    iget-object v1, p0, Lt10;->h:Lb03;

    .line 35
    .line 36
    iput-object v1, v0, Lw10;->E:Lb03;

    .line 37
    .line 38
    iget-object v2, p0, Lt10;->i:Lxx0;

    .line 39
    .line 40
    iput-object v2, v0, Lw10;->F:Lxx0;

    .line 41
    .line 42
    iget-object p0, p0, Lt10;->j:Lgl0;

    .line 43
    .line 44
    iput-object p0, v0, Lw10;->G:Lgl0;

    .line 45
    .line 46
    new-instance p0, Lu10;

    .line 47
    .line 48
    const/4 v2, 0x4

    .line 49
    invoke-direct {p0, v0, v2}, Lu10;-><init>(Lw10;I)V

    .line 50
    .line 51
    .line 52
    iput-object p0, v1, Lb03;->g:Lxm0;

    .line 53
    .line 54
    return-object v0
.end method

.method public final g(Lth1;)V
    .locals 12

    .line 1
    check-cast p1, Lw10;

    .line 2
    .line 3
    iget-boolean v0, p1, Lw10;->B:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v3, p1, Lw10;->A:Z

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    move v3, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v3, v1

    .line 16
    :goto_0
    iget-boolean v4, p1, Lw10;->C:Z

    .line 17
    .line 18
    iget-object v5, p1, Lw10;->F:Lxx0;

    .line 19
    .line 20
    iget-object v6, p1, Lw10;->E:Lb03;

    .line 21
    .line 22
    iget-boolean v7, p0, Lt10;->d:Z

    .line 23
    .line 24
    iget-boolean v8, p0, Lt10;->e:Z

    .line 25
    .line 26
    if-eqz v8, :cond_1

    .line 27
    .line 28
    if-nez v7, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v2, v1

    .line 32
    :goto_1
    iget-object v9, p0, Lt10;->a:Lq33;

    .line 33
    .line 34
    iput-object v9, p1, Lw10;->x:Lq33;

    .line 35
    .line 36
    iget-object v9, p0, Lt10;->b:Lk03;

    .line 37
    .line 38
    iput-object v9, p1, Lw10;->y:Lk03;

    .line 39
    .line 40
    iget-object v10, p0, Lt10;->c:Lt91;

    .line 41
    .line 42
    iput-object v10, p1, Lw10;->z:Lt91;

    .line 43
    .line 44
    iput-boolean v7, p1, Lw10;->A:Z

    .line 45
    .line 46
    iput-boolean v8, p1, Lw10;->B:Z

    .line 47
    .line 48
    iget-object v7, p0, Lt10;->g:Lus1;

    .line 49
    .line 50
    iput-object v7, p1, Lw10;->D:Lus1;

    .line 51
    .line 52
    iget-object v7, p0, Lt10;->h:Lb03;

    .line 53
    .line 54
    iput-object v7, p1, Lw10;->E:Lb03;

    .line 55
    .line 56
    iget-object v10, p0, Lt10;->i:Lxx0;

    .line 57
    .line 58
    iput-object v10, p1, Lw10;->F:Lxx0;

    .line 59
    .line 60
    iget-object v11, p0, Lt10;->j:Lgl0;

    .line 61
    .line 62
    iput-object v11, p1, Lw10;->G:Lgl0;

    .line 63
    .line 64
    if-ne v8, v0, :cond_2

    .line 65
    .line 66
    if-ne v2, v3, :cond_2

    .line 67
    .line 68
    invoke-static {v10, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    iget-boolean p0, p0, Lt10;->f:Z

    .line 75
    .line 76
    if-ne p0, v4, :cond_2

    .line 77
    .line 78
    iget-wide v2, v9, Lk03;->b:J

    .line 79
    .line 80
    invoke-static {v2, v3}, Lf13;->c(J)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_3

    .line 85
    .line 86
    :cond_2
    invoke-static {p1}, Lqp0;->E(Lon2;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    if-eq v7, v6, :cond_4

    .line 90
    .line 91
    new-instance p0, Lu10;

    .line 92
    .line 93
    invoke-direct {p0, p1, v1}, Lu10;-><init>(Lw10;I)V

    .line 94
    .line 95
    .line 96
    iput-object p0, v7, Lb03;->g:Lxm0;

    .line 97
    .line 98
    :cond_4
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lt10;->a:Lq33;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq33;->hashCode()I

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
    iget-object v2, p0, Lt10;->b:Lk03;

    .line 11
    .line 12
    invoke-virtual {v2}, Lk03;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lt10;->c:Lt91;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-boolean v2, p0, Lt10;->d:Z

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-boolean v2, p0, Lt10;->e:Z

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-boolean v2, p0, Lt10;->f:Z

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, Lt10;->g:Lus1;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, v0

    .line 51
    mul-int/2addr v2, v1

    .line 52
    iget-object v0, p0, Lt10;->h:Lb03;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v0, v2

    .line 59
    mul-int/2addr v0, v1

    .line 60
    iget-object v2, p0, Lt10;->i:Lxx0;

    .line 61
    .line 62
    invoke-virtual {v2}, Lxx0;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/2addr v2, v0

    .line 67
    mul-int/2addr v2, v1

    .line 68
    iget-object p0, p0, Lt10;->j:Lgl0;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    add-int/2addr p0, v2

    .line 75
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CoreTextFieldSemanticsModifier(transformedText="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lt10;->a:Lq33;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", value="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lt10;->b:Lk03;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", state="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lt10;->c:Lt91;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", readOnly="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, Lt10;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", enabled="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-boolean v1, p0, Lt10;->e:Z

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", isPassword="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-boolean v1, p0, Lt10;->f:Z

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", offsetMapping="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lt10;->g:Lus1;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", manager="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lt10;->h:Lb03;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", imeOptions="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lt10;->i:Lxx0;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", focusRequester="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, Lt10;->j:Lgl0;

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const/16 p0, 0x29

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
.end method

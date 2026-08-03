.class public final Lr9/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/Set;

.field public final e:Ljava/time/format/DateTimeFormatter;

.field public final f:F

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:Z

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:I


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/time/format/DateTimeFormatter;FIIIZIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lr9/z;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Lr9/z;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lr9/z;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lr9/z;->d:Ljava/util/Set;

    .line 11
    .line 12
    iput-object p5, p0, Lr9/z;->e:Ljava/time/format/DateTimeFormatter;

    .line 13
    .line 14
    iput p6, p0, Lr9/z;->f:F

    .line 15
    .line 16
    iput p7, p0, Lr9/z;->g:I

    .line 17
    .line 18
    iput p8, p0, Lr9/z;->h:I

    .line 19
    .line 20
    iput p9, p0, Lr9/z;->i:I

    .line 21
    .line 22
    iput-boolean p10, p0, Lr9/z;->j:Z

    .line 23
    .line 24
    iput p11, p0, Lr9/z;->k:I

    .line 25
    .line 26
    iput p12, p0, Lr9/z;->l:I

    .line 27
    .line 28
    iput p13, p0, Lr9/z;->m:I

    .line 29
    .line 30
    iput p14, p0, Lr9/z;->n:I

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
    instance-of v0, p1, Lr9/z;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lr9/z;

    .line 12
    .line 13
    iget-boolean v0, p0, Lr9/z;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, Lr9/z;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-object v0, p0, Lr9/z;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p1, Lr9/z;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, Lr9/z;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, Lr9/z;->c:Ljava/lang/String;

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
    iget-object v0, p0, Lr9/z;->d:Ljava/util/Set;

    .line 45
    .line 46
    iget-object v1, p1, Lr9/z;->d:Ljava/util/Set;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, Lr9/z;->e:Ljava/time/format/DateTimeFormatter;

    .line 56
    .line 57
    iget-object v1, p1, Lr9/z;->e:Ljava/time/format/DateTimeFormatter;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget v0, p0, Lr9/z;->f:F

    .line 67
    .line 68
    iget v1, p1, Lr9/z;->f:F

    .line 69
    .line 70
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget v0, p0, Lr9/z;->g:I

    .line 78
    .line 79
    iget v1, p1, Lr9/z;->g:I

    .line 80
    .line 81
    if-eq v0, v1, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget v0, p0, Lr9/z;->h:I

    .line 85
    .line 86
    iget v1, p1, Lr9/z;->h:I

    .line 87
    .line 88
    if-eq v0, v1, :cond_9

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_9
    iget v0, p0, Lr9/z;->i:I

    .line 92
    .line 93
    iget v1, p1, Lr9/z;->i:I

    .line 94
    .line 95
    if-eq v0, v1, :cond_a

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_a
    iget-boolean v0, p0, Lr9/z;->j:Z

    .line 99
    .line 100
    iget-boolean v1, p1, Lr9/z;->j:Z

    .line 101
    .line 102
    if-eq v0, v1, :cond_b

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_b
    iget v0, p0, Lr9/z;->k:I

    .line 106
    .line 107
    iget v1, p1, Lr9/z;->k:I

    .line 108
    .line 109
    if-eq v0, v1, :cond_c

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_c
    iget v0, p0, Lr9/z;->l:I

    .line 113
    .line 114
    iget v1, p1, Lr9/z;->l:I

    .line 115
    .line 116
    if-eq v0, v1, :cond_d

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_d
    iget v0, p0, Lr9/z;->m:I

    .line 120
    .line 121
    iget v1, p1, Lr9/z;->m:I

    .line 122
    .line 123
    if-eq v0, v1, :cond_e

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_e
    iget v0, p0, Lr9/z;->n:I

    .line 127
    .line 128
    iget p1, p1, Lr9/z;->n:I

    .line 129
    .line 130
    if-eq v0, p1, :cond_f

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
    .locals 3

    .line 1
    iget-boolean v0, p0, Lr9/z;->a:Z

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
    iget-object v2, p0, Lr9/z;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lr9/z;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lr9/z;->d:Ljava/util/Set;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, Lr9/z;->e:Ljava/time/format/DateTimeFormatter;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget v2, p0, Lr9/z;->f:F

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, Leh/a;->d(FII)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v2, p0, Lr9/z;->g:I

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget v2, p0, Lr9/z;->h:I

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget v2, p0, Lr9/z;->i:I

    .line 57
    .line 58
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v2, p0, Lr9/z;->j:Z

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget v2, p0, Lr9/z;->k:I

    .line 69
    .line 70
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget v2, p0, Lr9/z;->l:I

    .line 75
    .line 76
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget v2, p0, Lr9/z;->m:I

    .line 81
    .line 82
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget v1, p0, Lr9/z;->n:I

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    add-int/2addr v1, v0

    .line 93
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MessageDetailsConfig(enabled="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lr9/z;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", position="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lr9/z;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", format="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lr9/z;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", tokens="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lr9/z;->d:Ljava/util/Set;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", timeFormatter="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lr9/z;->e:Ljava/time/format/DateTimeFormatter;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", textSizeSp="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lr9/z;->f:F

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", avatarGapDp="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", leftMarginDp="

    .line 69
    .line 70
    const-string v2, ", rightMarginDp="

    .line 71
    .line 72
    iget v3, p0, Lr9/z;->g:I

    .line 73
    .line 74
    iget v4, p0, Lr9/z;->h:I

    .line 75
    .line 76
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget v1, p0, Lr9/z;->i:I

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", clickShow="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-boolean v1, p0, Lr9/z;->j:Z

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", lightTextColor="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, ", darkTextColor="

    .line 100
    .line 101
    const-string v2, ", lightBgColor="

    .line 102
    .line 103
    iget v3, p0, Lr9/z;->k:I

    .line 104
    .line 105
    iget v4, p0, Lr9/z;->l:I

    .line 106
    .line 107
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget v1, p0, Lr9/z;->m:I

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v1, ", darkBgColor="

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget v1, p0, Lr9/z;->n:I

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v1, ")"

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0
.end method

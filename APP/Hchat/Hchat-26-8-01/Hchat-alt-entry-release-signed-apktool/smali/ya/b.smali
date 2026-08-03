.class public final Lya/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/view/View;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/CharSequence;

.field public final h:I

.field public final i:F

.field public final j:Landroid/graphics/Typeface;

.field public final k:I

.field public final l:Z

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View;IIIILjava/lang/CharSequence;IFLandroid/graphics/Typeface;IZIIIILandroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lya/b;->a:Landroid/view/View;

    .line 8
    .line 9
    iput-object p2, p0, Lya/b;->b:Landroid/view/View;

    .line 10
    .line 11
    iput p3, p0, Lya/b;->c:I

    .line 12
    .line 13
    iput p4, p0, Lya/b;->d:I

    .line 14
    .line 15
    iput p5, p0, Lya/b;->e:I

    .line 16
    .line 17
    iput p6, p0, Lya/b;->f:I

    .line 18
    .line 19
    iput-object p7, p0, Lya/b;->g:Ljava/lang/CharSequence;

    .line 20
    .line 21
    iput p8, p0, Lya/b;->h:I

    .line 22
    .line 23
    iput p9, p0, Lya/b;->i:F

    .line 24
    .line 25
    iput-object p10, p0, Lya/b;->j:Landroid/graphics/Typeface;

    .line 26
    .line 27
    iput p11, p0, Lya/b;->k:I

    .line 28
    .line 29
    iput-boolean p12, p0, Lya/b;->l:Z

    .line 30
    .line 31
    iput p13, p0, Lya/b;->m:I

    .line 32
    .line 33
    iput p14, p0, Lya/b;->n:I

    .line 34
    .line 35
    iput p15, p0, Lya/b;->o:I

    .line 36
    .line 37
    move/from16 p1, p16

    .line 38
    .line 39
    iput p1, p0, Lya/b;->p:I

    .line 40
    .line 41
    move-object/from16 p1, p17

    .line 42
    .line 43
    iput-object p1, p0, Lya/b;->q:Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lya/b;

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
    check-cast p1, Lya/b;

    .line 12
    .line 13
    iget-object v1, p0, Lya/b;->a:Landroid/view/View;

    .line 14
    .line 15
    iget-object v3, p1, Lya/b;->a:Landroid/view/View;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lya/b;->b:Landroid/view/View;

    .line 25
    .line 26
    iget-object v3, p1, Lya/b;->b:Landroid/view/View;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget v1, p0, Lya/b;->c:I

    .line 36
    .line 37
    iget v3, p1, Lya/b;->c:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget v1, p0, Lya/b;->d:I

    .line 43
    .line 44
    iget v3, p1, Lya/b;->d:I

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget v1, p0, Lya/b;->e:I

    .line 50
    .line 51
    iget v3, p1, Lya/b;->e:I

    .line 52
    .line 53
    if-eq v1, v3, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    iget v1, p0, Lya/b;->f:I

    .line 57
    .line 58
    iget v3, p1, Lya/b;->f:I

    .line 59
    .line 60
    if-eq v1, v3, :cond_7

    .line 61
    .line 62
    return v2

    .line 63
    :cond_7
    iget-object v1, p0, Lya/b;->g:Ljava/lang/CharSequence;

    .line 64
    .line 65
    iget-object v3, p1, Lya/b;->g:Ljava/lang/CharSequence;

    .line 66
    .line 67
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_8

    .line 72
    .line 73
    return v2

    .line 74
    :cond_8
    iget v1, p0, Lya/b;->h:I

    .line 75
    .line 76
    iget v3, p1, Lya/b;->h:I

    .line 77
    .line 78
    if-eq v1, v3, :cond_9

    .line 79
    .line 80
    return v2

    .line 81
    :cond_9
    iget v1, p0, Lya/b;->i:F

    .line 82
    .line 83
    iget v3, p1, Lya/b;->i:F

    .line 84
    .line 85
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_a

    .line 90
    .line 91
    return v2

    .line 92
    :cond_a
    iget-object v1, p0, Lya/b;->j:Landroid/graphics/Typeface;

    .line 93
    .line 94
    iget-object v3, p1, Lya/b;->j:Landroid/graphics/Typeface;

    .line 95
    .line 96
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_b

    .line 101
    .line 102
    return v2

    .line 103
    :cond_b
    iget v1, p0, Lya/b;->k:I

    .line 104
    .line 105
    iget v3, p1, Lya/b;->k:I

    .line 106
    .line 107
    if-eq v1, v3, :cond_c

    .line 108
    .line 109
    return v2

    .line 110
    :cond_c
    iget-boolean v1, p0, Lya/b;->l:Z

    .line 111
    .line 112
    iget-boolean v3, p1, Lya/b;->l:Z

    .line 113
    .line 114
    if-eq v1, v3, :cond_d

    .line 115
    .line 116
    return v2

    .line 117
    :cond_d
    iget v1, p0, Lya/b;->m:I

    .line 118
    .line 119
    iget v3, p1, Lya/b;->m:I

    .line 120
    .line 121
    if-eq v1, v3, :cond_e

    .line 122
    .line 123
    return v2

    .line 124
    :cond_e
    iget v1, p0, Lya/b;->n:I

    .line 125
    .line 126
    iget v3, p1, Lya/b;->n:I

    .line 127
    .line 128
    if-eq v1, v3, :cond_f

    .line 129
    .line 130
    return v2

    .line 131
    :cond_f
    iget v1, p0, Lya/b;->o:I

    .line 132
    .line 133
    iget v3, p1, Lya/b;->o:I

    .line 134
    .line 135
    if-eq v1, v3, :cond_10

    .line 136
    .line 137
    return v2

    .line 138
    :cond_10
    iget v1, p0, Lya/b;->p:I

    .line 139
    .line 140
    iget v3, p1, Lya/b;->p:I

    .line 141
    .line 142
    if-eq v1, v3, :cond_11

    .line 143
    .line 144
    return v2

    .line 145
    :cond_11
    iget-object v1, p0, Lya/b;->q:Landroid/graphics/drawable/Drawable;

    .line 146
    .line 147
    iget-object p1, p1, Lya/b;->q:Landroid/graphics/drawable/Drawable;

    .line 148
    .line 149
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-nez p1, :cond_12

    .line 154
    .line 155
    return v2

    .line 156
    :cond_12
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lya/b;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, Lya/b;->b:Landroid/view/View;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget v3, p0, Lya/b;->c:I

    .line 24
    .line 25
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v3, p0, Lya/b;->d:I

    .line 30
    .line 31
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget v3, p0, Lya/b;->e:I

    .line 36
    .line 37
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget v3, p0, Lya/b;->f:I

    .line 42
    .line 43
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v3, p0, Lya/b;->g:Ljava/lang/CharSequence;

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    move v3, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    :goto_1
    add-int/2addr v0, v3

    .line 58
    mul-int/2addr v0, v1

    .line 59
    iget v3, p0, Lya/b;->h:I

    .line 60
    .line 61
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget v3, p0, Lya/b;->i:F

    .line 66
    .line 67
    invoke-static {v3, v0, v1}, Leh/a;->d(FII)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v3, p0, Lya/b;->j:Landroid/graphics/Typeface;

    .line 72
    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    move v3, v2

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-virtual {v3}, Landroid/graphics/Typeface;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    :goto_2
    add-int/2addr v0, v3

    .line 82
    mul-int/2addr v0, v1

    .line 83
    iget v3, p0, Lya/b;->k:I

    .line 84
    .line 85
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-boolean v3, p0, Lya/b;->l:Z

    .line 90
    .line 91
    invoke-static {v0, v1, v3}, Leh/a;->h(IIZ)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget v3, p0, Lya/b;->m:I

    .line 96
    .line 97
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget v3, p0, Lya/b;->n:I

    .line 102
    .line 103
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iget v3, p0, Lya/b;->o:I

    .line 108
    .line 109
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iget v3, p0, Lya/b;->p:I

    .line 114
    .line 115
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iget-object v1, p0, Lya/b;->q:Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    if-nez v1, :cond_3

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    :goto_3
    add-int/2addr v0, v2

    .line 129
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DragTarget(contextView="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lya/b;->a:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", source="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lya/b;->b:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", screenLeft="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", screenTop="

    .line 29
    .line 30
    const-string v2, ", width="

    .line 31
    .line 32
    iget v3, p0, Lya/b;->c:I

    .line 33
    .line 34
    iget v4, p0, Lya/b;->d:I

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", height="

    .line 40
    .line 41
    const-string v2, ", text="

    .line 42
    .line 43
    iget v3, p0, Lya/b;->e:I

    .line 44
    .line 45
    iget v4, p0, Lya/b;->f:I

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lya/b;->g:Ljava/lang/CharSequence;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", textColor="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget v1, p0, Lya/b;->h:I

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", textSizePx="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget v1, p0, Lya/b;->i:F

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", typeface="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lya/b;->j:Landroid/graphics/Typeface;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", gravity="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget v1, p0, Lya/b;->k:I

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ", includeFontPadding="

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-boolean v1, p0, Lya/b;->l:Z

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ", paddingLeft="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", paddingTop="

    .line 111
    .line 112
    const-string v2, ", paddingRight="

    .line 113
    .line 114
    iget v3, p0, Lya/b;->m:I

    .line 115
    .line 116
    iget v4, p0, Lya/b;->n:I

    .line 117
    .line 118
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string v1, ", paddingBottom="

    .line 122
    .line 123
    const-string v2, ", background="

    .line 124
    .line 125
    iget v3, p0, Lya/b;->o:I

    .line 126
    .line 127
    iget v4, p0, Lya/b;->p:I

    .line 128
    .line 129
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v1, p0, Lya/b;->q:Landroid/graphics/drawable/Drawable;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v1, ")"

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0
.end method

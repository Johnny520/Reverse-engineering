.class public final Lg71;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Lf71;

.field public final b:Lng0;

.field public final c:J

.field public final d:F

.field public final e:F

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lf71;Lng0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg71;->a:Lf71;

    .line 5
    .line 6
    iput-object p2, p0, Lg71;->b:Lng0;

    .line 7
    .line 8
    iput-wide p3, p0, Lg71;->c:J

    .line 9
    .line 10
    iget-object p1, p2, Lng0;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    const/4 p4, 0x0

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    move p1, p4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p3, 0x0

    .line 24
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lwo0;

    .line 29
    .line 30
    iget-object p1, p1, Lwo0;->a:Ly5;

    .line 31
    .line 32
    iget-object p1, p1, Ly5;->d:Le71;

    .line 33
    .line 34
    invoke-virtual {p1, p3}, Le71;->c(I)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    :goto_0
    iput p1, p0, Lg71;->d:F

    .line 39
    .line 40
    iget-object p1, p2, Lng0;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    if-eqz p3, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {p1}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lwo0;

    .line 56
    .line 57
    iget-object p3, p1, Lwo0;->a:Ly5;

    .line 58
    .line 59
    iget-object p3, p3, Ly5;->d:Le71;

    .line 60
    .line 61
    iget p4, p3, Le71;->f:I

    .line 62
    .line 63
    add-int/lit8 p4, p4, -0x1

    .line 64
    .line 65
    invoke-virtual {p3, p4}, Le71;->c(I)F

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    iget p1, p1, Lwo0;->f:F

    .line 70
    .line 71
    add-float p4, p3, p1

    .line 72
    .line 73
    :goto_1
    iput p4, p0, Lg71;->e:F

    .line 74
    .line 75
    iget-object p1, p2, Lng0;->d:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Ljava/util/ArrayList;

    .line 78
    .line 79
    iput-object p1, p0, Lg71;->f:Ljava/util/ArrayList;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lg71;->b:Lng0;

    .line 2
    .line 3
    iget-object v0, p0, Lng0;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object p0, p0, Lng0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lr9;

    .line 10
    .line 11
    iget-object p0, p0, Lr9;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lf8;

    .line 14
    .line 15
    iget-object p0, p0, Lf8;->e:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-lt p1, p0, :cond_0

    .line 22
    .line 23
    invoke-static {v0}, Lo30;->r(Ljava/util/List;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-gez p1, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {p1, v0}, Lw60;->q(ILjava/util/List;)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lwo0;

    .line 41
    .line 42
    iget-object v0, p0, Lwo0;->a:Ly5;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lwo0;->a(I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object v0, v0, Ly5;->d:Le71;

    .line 49
    .line 50
    iget-object v0, v0, Le71;->e:Landroid/text/Layout;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget p0, p0, Lwo0;->d:I

    .line 57
    .line 58
    add-int/2addr p1, p0

    .line 59
    return p1
.end method

.method public final b(F)I
    .locals 7

    .line 1
    iget-object p0, p0, Lg71;->b:Lng0;

    .line 2
    .line 3
    iget-object p0, p0, Lng0;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    invoke-static {p0}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lwo0;

    .line 19
    .line 20
    iget v0, v0, Lwo0;->g:F

    .line 21
    .line 22
    cmpl-float v0, p1, v0

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-ltz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v1, v0, -0x1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    sub-int/2addr v0, v2

    .line 39
    move v3, v1

    .line 40
    :goto_0
    if-gt v3, v0, :cond_6

    .line 41
    .line 42
    add-int v4, v3, v0

    .line 43
    .line 44
    ushr-int/2addr v4, v2

    .line 45
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Lwo0;

    .line 50
    .line 51
    iget v6, v5, Lwo0;->f:F

    .line 52
    .line 53
    cmpl-float v6, v6, p1

    .line 54
    .line 55
    if-lez v6, :cond_2

    .line 56
    .line 57
    move v5, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget v5, v5, Lwo0;->g:F

    .line 60
    .line 61
    cmpg-float v5, v5, p1

    .line 62
    .line 63
    if-gtz v5, :cond_3

    .line 64
    .line 65
    const/4 v5, -0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move v5, v1

    .line 68
    :goto_1
    if-gez v5, :cond_4

    .line 69
    .line 70
    add-int/lit8 v3, v4, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    if-lez v5, :cond_5

    .line 74
    .line 75
    add-int/lit8 v0, v4, -0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    move v1, v4

    .line 79
    goto :goto_2

    .line 80
    :cond_6
    add-int/2addr v3, v2

    .line 81
    neg-int v1, v3

    .line 82
    :goto_2
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Lwo0;

    .line 87
    .line 88
    iget v0, p0, Lwo0;->c:I

    .line 89
    .line 90
    iget v1, p0, Lwo0;->d:I

    .line 91
    .line 92
    iget v2, p0, Lwo0;->b:I

    .line 93
    .line 94
    sub-int/2addr v0, v2

    .line 95
    if-nez v0, :cond_7

    .line 96
    .line 97
    return v1

    .line 98
    :cond_7
    iget-object v0, p0, Lwo0;->a:Ly5;

    .line 99
    .line 100
    iget p0, p0, Lwo0;->f:F

    .line 101
    .line 102
    sub-float/2addr p1, p0

    .line 103
    iget-object p0, v0, Ly5;->d:Le71;

    .line 104
    .line 105
    float-to-int p1, p1

    .line 106
    iget-object v0, p0, Le71;->e:Landroid/text/Layout;

    .line 107
    .line 108
    iget p0, p0, Le71;->g:I

    .line 109
    .line 110
    sub-int/2addr p1, p0

    .line 111
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    add-int/2addr p0, v1

    .line 116
    return p0
.end method

.method public final c(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lg71;->b:Lng0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lng0;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lng0;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p1, p0}, Lw60;->r(ILjava/util/List;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lwo0;

    .line 19
    .line 20
    iget-object v0, p0, Lwo0;->a:Ly5;

    .line 21
    .line 22
    iget v1, p0, Lwo0;->d:I

    .line 23
    .line 24
    sub-int/2addr p1, v1

    .line 25
    iget-object v0, v0, Ly5;->d:Le71;

    .line 26
    .line 27
    iget-object v0, v0, Le71;->e:Landroid/text/Layout;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineStart(I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget p0, p0, Lwo0;->b:I

    .line 34
    .line 35
    add-int/2addr p1, p0

    .line 36
    return p1
.end method

.method public final d(I)F
    .locals 2

    .line 1
    iget-object p0, p0, Lg71;->b:Lng0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lng0;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lng0;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p1, p0}, Lw60;->r(ILjava/util/List;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lwo0;

    .line 19
    .line 20
    iget-object v0, p0, Lwo0;->a:Ly5;

    .line 21
    .line 22
    iget v1, p0, Lwo0;->d:I

    .line 23
    .line 24
    sub-int/2addr p1, v1

    .line 25
    iget-object v0, v0, Ly5;->d:Le71;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Le71;->f(I)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget p0, p0, Lwo0;->f:F

    .line 32
    .line 33
    add-float/2addr p1, p0

    .line 34
    return p1
.end method

.method public final e(I)Lwu0;
    .locals 3

    .line 1
    iget-object p0, p0, Lg71;->b:Lng0;

    .line 2
    .line 3
    iget-object v0, p0, Lng0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lr9;

    .line 6
    .line 7
    iget-object v0, v0, Lr9;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lf8;

    .line 10
    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object v1, v0, Lf8;->e:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-gt p1, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "offset("

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, ") is out of bounds [0, "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, Lf8;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/16 v0, 0x5d

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lx10;->a(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    iget-object v0, p0, Lng0;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lr9;

    .line 61
    .line 62
    iget-object v0, v0, Lr9;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lf8;

    .line 65
    .line 66
    iget-object v0, v0, Lf8;->e:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object p0, p0, Lng0;->e:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ljava/util/ArrayList;

    .line 75
    .line 76
    if-ne p1, v0, :cond_1

    .line 77
    .line 78
    invoke-static {p0}, Lo30;->r(Ljava/util/List;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-static {p1, p0}, Lw60;->q(ILjava/util/List;)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    :goto_1
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Lwo0;

    .line 92
    .line 93
    iget-object v0, p0, Lwo0;->a:Ly5;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Lwo0;->a(I)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    iget-object p1, v0, Ly5;->d:Le71;

    .line 100
    .line 101
    iget-object v0, p1, Le71;->e:Landroid/text/Layout;

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    iget-object p1, p1, Le71;->e:Landroid/text/Layout;

    .line 108
    .line 109
    invoke-virtual {p1, p0}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    const/4 p1, 0x1

    .line 114
    if-ne p0, p1, :cond_2

    .line 115
    .line 116
    sget-object p0, Lwu0;->d:Lwu0;

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_2
    sget-object p0, Lwu0;->e:Lwu0;

    .line 120
    .line 121
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lg71;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lg71;

    .line 10
    .line 11
    iget-object v0, p1, Lg71;->a:Lf71;

    .line 12
    .line 13
    iget-object v1, p0, Lg71;->a:Lf71;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, Lg71;->b:Lng0;

    .line 23
    .line 24
    iget-object v1, p1, Lg71;->b:Lng0;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget-wide v0, p0, Lg71;->c:J

    .line 34
    .line 35
    iget-wide v2, p1, Lg71;->c:J

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, Ld30;->a(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_4
    iget v0, p0, Lg71;->d:F

    .line 45
    .line 46
    iget v1, p1, Lg71;->d:F

    .line 47
    .line 48
    cmpg-float v0, v0, v1

    .line 49
    .line 50
    if-nez v0, :cond_6

    .line 51
    .line 52
    iget v0, p0, Lg71;->e:F

    .line 53
    .line 54
    iget v1, p1, Lg71;->e:F

    .line 55
    .line 56
    cmpg-float v0, v0, v1

    .line 57
    .line 58
    if-nez v0, :cond_6

    .line 59
    .line 60
    iget-object p0, p0, Lg71;->f:Ljava/util/ArrayList;

    .line 61
    .line 62
    iget-object p1, p1, Lg71;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-static {p0, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_5

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_5
    :goto_0
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 74
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lg71;->a:Lf71;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf71;->hashCode()I

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
    iget-object v2, p0, Lg71;->b:Lng0;

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
    iget-wide v3, p0, Lg71;->c:J

    .line 19
    .line 20
    invoke-static {v3, v4, v2, v1}, Lt1;->d(JII)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Lg71;->d:F

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Lt1;->a(FII)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p0, Lg71;->e:F

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Lt1;->a(FII)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object p0, p0, Lg71;->f:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/2addr p0, v0

    .line 43
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextLayoutResult(layoutInput="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lg71;->a:Lf71;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", multiParagraph="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lg71;->b:Lng0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", size="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Lg71;->c:J

    .line 29
    .line 30
    invoke-static {v1, v2}, Ld30;->b(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", firstBaseline="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget v1, p0, Lg71;->d:F

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", lastBaseline="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget v1, p0, Lg71;->e:F

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", placeholderRects="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lg71;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const/16 p0, 0x29

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

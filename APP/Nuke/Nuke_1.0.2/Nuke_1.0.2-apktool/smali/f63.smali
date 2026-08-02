.class public final Lf63;
.super Lxs1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final l:Ld63;


# direct methods
.method public constructor <init>(Ld63;)V
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lkj0;

    .line 3
    .line 4
    iget-object v0, v0, Lkj0;->i:[Ljava/lang/Object;

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    add-int/2addr v0, v1

    .line 11
    invoke-direct {p0, v1, v0}, Lxs1;-><init>(II)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lf63;->l:Ld63;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Lz70;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lz70;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lb42;

    .line 4
    .line 5
    iget-object p0, p0, Lf63;->l:Ld63;

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    check-cast v0, Lkj0;

    .line 9
    .line 10
    iget-object v0, v0, Lkj0;->i:[Ljava/lang/Object;

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0, v1}, Ld63;->getType(I)Lo43;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1, v2}, Lb42;->q(Lo43;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final b()Lg21;
    .locals 0

    .line 1
    sget-object p0, Lg21;->s:Lg21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(Lxs1;)I
    .locals 7

    .line 1
    check-cast p1, Lf63;

    .line 2
    .line 3
    iget-object p1, p1, Lf63;->l:Ld63;

    .line 4
    .line 5
    sget-object v0, Lwu2;->j:Lwu2;

    .line 6
    .line 7
    iget-object p0, p0, Lf63;->l:Ld63;

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    check-cast v0, Lkj0;

    .line 11
    .line 12
    iget-object v0, v0, Lkj0;->i:[Ljava/lang/Object;

    .line 13
    .line 14
    array-length v0, v0

    .line 15
    move-object v1, p1

    .line 16
    check-cast v1, Lkj0;

    .line 17
    .line 18
    iget-object v1, v1, Lkj0;->i:[Ljava/lang/Object;

    .line 19
    .line 20
    array-length v1, v1

    .line 21
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    move v4, v3

    .line 27
    :goto_0
    if-ge v4, v2, :cond_1

    .line 28
    .line 29
    invoke-interface {p0, v4}, Ld63;->getType(I)Lo43;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-interface {p1, v4}, Ld63;->getType(I)Lo43;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-object v5, v5, Lo43;->h:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v6, v6, Lo43;->h:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v5, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    return v5

    .line 48
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    if-ne v0, v1, :cond_2

    .line 52
    .line 53
    return v3

    .line 54
    :cond_2
    if-ge v0, v1, :cond_3

    .line 55
    .line 56
    const/4 p0, -0x1

    .line 57
    return p0

    .line 58
    :cond_3
    const/4 p0, 0x1

    .line 59
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget-object v0, Lwu2;->j:Lwu2;

    .line 2
    .line 3
    iget-object p0, p0, Lf63;->l:Ld63;

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lkj0;

    .line 7
    .line 8
    iget-object v0, v0, Lkj0;->i:[Ljava/lang/Object;

    .line 9
    .line 10
    array-length v0, v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    mul-int/lit8 v2, v2, 0x1f

    .line 16
    .line 17
    invoke-interface {p0, v1}, Ld63;->getType(I)Lo43;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v3, v3, Lo43;->h:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v2, v3

    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return v2
.end method

.method public final k(Lz70;Lyn;)V
    .locals 7

    .line 1
    iget-object p1, p1, Lz70;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lb42;

    .line 4
    .line 5
    iget-object v0, p0, Lf63;->l:Ld63;

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lkj0;

    .line 9
    .line 10
    iget-object v1, v1, Lkj0;->i:[Ljava/lang/Object;

    .line 11
    .line 12
    array-length v1, v1

    .line 13
    invoke-virtual {p2}, Lyn;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lxs1;->g()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v2, " type_list"

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p2, p0, v3}, Lyn;->c(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lpp0;->K(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v2, "  size: "

    .line 38
    .line 39
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 v2, 0x4

    .line 44
    invoke-virtual {p2, p0, v2}, Lyn;->c(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    move p0, v3

    .line 48
    :goto_0
    if-ge p0, v1, :cond_0

    .line 49
    .line 50
    invoke-interface {v0, p0}, Ld63;->getType(I)Lo43;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {p1, v2}, Lb42;->n(Lo43;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    new-instance v5, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v6, "  "

    .line 61
    .line 62
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v4}, Lpp0;->J(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v4, " // "

    .line 73
    .line 74
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Lo43;->b()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const/4 v4, 0x2

    .line 89
    invoke-virtual {p2, v2, v4}, Lyn;->c(Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 p0, p0, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {p2, v1}, Lyn;->j(I)V

    .line 96
    .line 97
    .line 98
    :goto_1
    if-ge v3, v1, :cond_1

    .line 99
    .line 100
    invoke-interface {v0, v3}, Ld63;->getType(I)Lo43;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p1, p0}, Lb42;->n(Lo43;)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    invoke-virtual {p2, p0}, Lyn;->k(I)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    return-void
.end method

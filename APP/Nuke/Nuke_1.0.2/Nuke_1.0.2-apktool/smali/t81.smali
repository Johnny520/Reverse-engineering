.class public final Lt81;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Ld91;

.field public final b:Ls81;

.field public final c:Lo71;

.field public final d:Le9;


# direct methods
.method public constructor <init>(Ld91;Ls81;Lo71;Le9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt81;->a:Ld91;

    .line 5
    .line 6
    iput-object p2, p0, Lt81;->b:Ls81;

    .line 7
    .line 8
    iput-object p3, p0, Lt81;->c:Lo71;

    .line 9
    .line 10
    iput-object p4, p0, Lt81;->d:Le9;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Lpx;I)V
    .locals 6

    .line 1
    move-object v4, p3

    .line 2
    check-cast v4, Lgo0;

    .line 3
    .line 4
    const p3, -0x1b900aca

    .line 5
    .line 6
    .line 7
    invoke-virtual {v4, p3}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v4, p1}, Lgo0;->d(I)Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    const/4 p3, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p3, 0x2

    .line 19
    :goto_0
    or-int/2addr p3, p4

    .line 20
    invoke-virtual {v4, p2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/16 v0, 0x20

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 v0, 0x10

    .line 30
    .line 31
    :goto_1
    or-int/2addr p3, v0

    .line 32
    invoke-virtual {v4, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const/16 v0, 0x100

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/16 v0, 0x80

    .line 42
    .line 43
    :goto_2
    or-int/2addr p3, v0

    .line 44
    and-int/lit16 v0, p3, 0x93

    .line 45
    .line 46
    const/16 v1, 0x92

    .line 47
    .line 48
    if-eq v0, v1, :cond_3

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    const/4 v0, 0x0

    .line 53
    :goto_3
    and-int/lit8 v1, p3, 0x1

    .line 54
    .line 55
    invoke-virtual {v4, v1, v0}, Lgo0;->O(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    iget-object v0, p0, Lt81;->a:Ld91;

    .line 62
    .line 63
    iget-object v2, v0, Ld91;->r:Lg81;

    .line 64
    .line 65
    new-instance v0, Lb8;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, Lb8;-><init>(Lt81;I)V

    .line 68
    .line 69
    .line 70
    const v1, -0x3128503e

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v0, v4}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    shr-int/lit8 v0, p3, 0x3

    .line 78
    .line 79
    and-int/lit8 v0, v0, 0xe

    .line 80
    .line 81
    or-int/lit16 v0, v0, 0xc00

    .line 82
    .line 83
    shl-int/lit8 p3, p3, 0x3

    .line 84
    .line 85
    and-int/lit8 p3, p3, 0x70

    .line 86
    .line 87
    or-int v5, v0, p3

    .line 88
    .line 89
    move v1, p1

    .line 90
    move-object v0, p2

    .line 91
    invoke-static/range {v0 .. v5}, Lp40;->a(Ljava/lang/Object;ILg81;Lkw;Lpx;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_4
    move v1, p1

    .line 96
    move-object v0, p2

    .line 97
    invoke-virtual {v4}, Lgo0;->R()V

    .line 98
    .line 99
    .line 100
    :goto_4
    invoke-virtual {v4}, Lgo0;->r()Lb62;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    new-instance p2, La81;

    .line 107
    .line 108
    invoke-direct {p2, p0, v1, v0, p4}, La81;-><init>(Lt81;ILjava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    iput-object p2, p1, Lb62;->d:Lmn0;

    .line 112
    .line 113
    :cond_5
    return-void
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lt81;->b:Ls81;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ls81;->a:Le9;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Le9;->e(I)Ll11;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget v0, p0, Ll11;->a:I

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    iget-object p0, p0, Ll11;->c:Lb5;

    .line 16
    .line 17
    iget-object p0, p0, Lb5;->j:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lin0;

    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final c()I
    .locals 0

    .line 1
    iget-object p0, p0, Lt81;->b:Ls81;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ls81;->a:Le9;

    .line 7
    .line 8
    iget p0, p0, Le9;->i:I

    .line 9
    .line 10
    return p0
.end method

.method public final d(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lt81;->d:Le9;

    .line 2
    .line 3
    iget-object v1, v0, Le9;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, Le9;->i:I

    .line 8
    .line 9
    sub-int v0, p1, v0

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-ge v0, v2, :cond_0

    .line 15
    .line 16
    aget-object v0, v1, v0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-nez v0, :cond_3

    .line 21
    .line 22
    iget-object p0, p0, Lt81;->b:Ls81;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Ls81;->a:Le9;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Le9;->e(I)Ll11;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget v0, p0, Ll11;->a:I

    .line 34
    .line 35
    sub-int v0, p1, v0

    .line 36
    .line 37
    iget-object p0, p0, Ll11;->c:Lb5;

    .line 38
    .line 39
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lin0;

    .line 42
    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {p0, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    return-object p0

    .line 57
    :cond_2
    :goto_1
    new-instance p0, Lu50;

    .line 58
    .line 59
    invoke-direct {p0, p1}, Lu50;-><init>(I)V

    .line 60
    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lt81;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lt81;

    .line 12
    .line 13
    iget-object p1, p1, Lt81;->b:Ls81;

    .line 14
    .line 15
    iget-object p0, p0, Lt81;->b:Ls81;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lt81;->b:Ls81;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

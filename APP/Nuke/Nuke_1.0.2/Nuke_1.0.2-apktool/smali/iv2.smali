.class public final Liv2;
.super Lxs1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final l:Lq30;


# direct methods
.method public constructor <init>(Lq30;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lq30;->h:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lpp0;->M(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p1, Lq30;->i:Ldk;

    .line 12
    .line 13
    iget v1, v1, Ldk;->i:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    const/4 v1, 0x1

    .line 17
    add-int/2addr v0, v1

    .line 18
    invoke-direct {p0, v1, v0}, Lxs1;-><init>(II)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Liv2;->l:Lq30;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lz70;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Lg21;
    .locals 0

    .line 1
    sget-object p0, Lg21;->v:Lg21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(Lxs1;)I
    .locals 0

    .line 1
    check-cast p1, Liv2;

    .line 2
    .line 3
    iget-object p0, p0, Liv2;->l:Lq30;

    .line 4
    .line 5
    iget-object p1, p1, Liv2;->l:Lq30;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ldz;->d(Ldz;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final k(Lz70;Lyn;)V
    .locals 4

    .line 1
    iget-object p0, p0, Liv2;->l:Lq30;

    .line 2
    .line 3
    iget-object p1, p0, Lq30;->i:Ldk;

    .line 4
    .line 5
    iget-object v0, p0, Lq30;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p2}, Lyn;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {v0}, Lpp0;->M(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v0}, Lpp0;->K(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "utf16_size: "

    .line 26
    .line 27
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p2, v2, v1}, Lyn;->c(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    iget v1, p1, Ldk;->i:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    invoke-virtual {p0}, Lq30;->g()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p2, p0, v1}, Lyn;->c(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p2, v0}, Lyn;->m(I)I

    .line 46
    .line 47
    .line 48
    iget p0, p1, Ldk;->i:I

    .line 49
    .line 50
    iget v0, p2, Lyn;->c:I

    .line 51
    .line 52
    add-int/2addr p0, v0

    .line 53
    iget-boolean v1, p2, Lyn;->a:Z

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    invoke-virtual {p2, p0}, Lyn;->f(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iget-object v1, p2, Lyn;->b:[B

    .line 62
    .line 63
    array-length v1, v1

    .line 64
    if-gt p0, v1, :cond_3

    .line 65
    .line 66
    :goto_0
    iget-object v1, p2, Lyn;->b:[B

    .line 67
    .line 68
    array-length v2, v1

    .line 69
    sub-int/2addr v2, v0

    .line 70
    iget v3, p1, Ldk;->i:I

    .line 71
    .line 72
    if-lt v2, v3, :cond_2

    .line 73
    .line 74
    iget-object p1, p1, Ldk;->j:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, [B

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-static {p1, v2, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 80
    .line 81
    .line 82
    iput p0, p2, Lyn;->c:I

    .line 83
    .line 84
    invoke-virtual {p2, v2}, Lyn;->i(I)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    const-string p0, "(out.length - offset) < size()"

    .line 89
    .line 90
    invoke-static {p0}, Ls;->d(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    invoke-static {}, Lyn;->g()V

    .line 95
    .line 96
    .line 97
    const/4 p0, 0x0

    .line 98
    throw p0
.end method

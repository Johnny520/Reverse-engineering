.class public final Lo9;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;"
    }
.end annotation


# instance fields
.field public a:Ln9;

.field public b:Log;


# virtual methods
.method public final e()Loe0;
    .locals 1

    .line 1
    new-instance v0, Ln9;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ln9;-><init>(Lo9;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method public final bridge synthetic f(Loe0;)V
    .locals 0

    .line 1
    check-cast p1, Ln9;

    .line 2
    .line 3
    return-void
.end method

.method public final g(Ljk;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lo9;->b:Log;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Log;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lj40;-><init>(Z)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v2}, Lj40;->Q(Lc40;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lo9;->b:Log;

    .line 16
    .line 17
    iget-object p0, p0, Lo9;->a:Ln9;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iget-boolean v2, p0, Loe0;->q:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Ln9;->w0()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0}, Lj40;->N()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    instance-of v2, p0, Ly00;

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    instance-of p1, p0, Lrg;

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    invoke-static {p0}, Ls91;->U(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    check-cast p0, Lrg;

    .line 46
    .line 47
    iget-object p0, p0, Lrg;->a:Ljava/lang/Throwable;

    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    invoke-virtual {v0, p0}, Lj40;->d0(Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-ltz p0, :cond_0

    .line 55
    .line 56
    new-instance p0, Lg40;

    .line 57
    .line 58
    invoke-static {p1}, Lrd0;->z(Lik;)Lik;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p0, p1, v0}, Lg40;-><init>(Lik;Log;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lwc;->v()V

    .line 66
    .line 67
    .line 68
    new-instance p1, Ldv0;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Ldv0;-><init>(Lg40;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1, p1}, Lpf1;->C(Lc40;ZLf40;)Lpo;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v0, Lrc;

    .line 78
    .line 79
    invoke-direct {v0, v1, p1}, Lrc;-><init>(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lwc;->z(Lzj0;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lwc;->t()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    :goto_0
    sget-object p1, Lzk;->d:Lzk;

    .line 90
    .line 91
    if-ne p0, p1, :cond_3

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_3
    sget-object p0, Lna1;->a:Lna1;

    .line 95
    .line 96
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const/16 p0, 0xea

    .line 2
    .line 3
    return p0
.end method

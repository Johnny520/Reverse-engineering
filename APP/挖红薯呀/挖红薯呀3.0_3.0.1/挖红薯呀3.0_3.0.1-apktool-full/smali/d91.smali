.class public abstract Ld91;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lus0;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lz60;->I(Lhw;)Lu60;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final a(Lb91;Lq91;Ljava/lang/String;Lji;)Lw81;
    .locals 3

    .line 1
    move-object v0, p3

    .line 2
    check-cast v0, Lpi;

    .line 3
    .line 4
    invoke-virtual {v0, p0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    check-cast p3, Lpi;

    .line 9
    .line 10
    invoke-virtual {p3}, Lpi;->L()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lii;->a:Lr3;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    if-ne v1, v2, :cond_1

    .line 19
    .line 20
    :cond_0
    new-instance v1, Lw81;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1, p2}, Lw81;-><init>(Lb91;Lq91;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    check-cast v1, Lw81;

    .line 29
    .line 30
    invoke-virtual {p3, p0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p3, v1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    or-int/2addr p1, p2

    .line 39
    invoke-virtual {p3}, Lpi;->L()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    if-ne p2, v2, :cond_3

    .line 46
    .line 47
    :cond_2
    new-instance p2, Lc;

    .line 48
    .line 49
    const/16 p1, 0x16

    .line 50
    .line 51
    invoke-direct {p2, p1, p0, v1}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3, p2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    check-cast p2, Lsw;

    .line 58
    .line 59
    invoke-static {v1, p2, p3}, Ls91;->c(Ljava/lang/Object;Lsw;Lji;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lb91;->g()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_4

    .line 67
    .line 68
    iget-object p0, v1, Lw81;->b:Lgp0;

    .line 69
    .line 70
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lv81;

    .line 75
    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    iget-object p1, v1, Lw81;->c:Lb91;

    .line 79
    .line 80
    iget-object p2, p0, Lv81;->d:Ly81;

    .line 81
    .line 82
    iget-object p3, p0, Lv81;->f:Lsw;

    .line 83
    .line 84
    invoke-virtual {p1}, Lb91;->f()Lx81;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v0, v0, Lx81;->a:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-interface {p3, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    iget-object v0, p0, Lv81;->f:Lsw;

    .line 95
    .line 96
    invoke-virtual {p1}, Lb91;->f()Lx81;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iget-object v2, v2, Lx81;->b:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-interface {v0, v2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object p0, p0, Lv81;->e:Lsw;

    .line 107
    .line 108
    invoke-virtual {p1}, Lb91;->f()Lx81;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-interface {p0, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Ltt;

    .line 117
    .line 118
    invoke-virtual {p2, p3, v0, p0}, Ly81;->f(Ljava/lang/Object;Ljava/lang/Object;Ltt;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    return-object v1
.end method

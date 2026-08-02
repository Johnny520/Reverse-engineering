.class public final Lj03;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lgy;
.implements Lj61;


# instance fields
.field public final v:Lm13;

.field public w:Lm63;

.field public x:Lh03;


# direct methods
.method public constructor <init>(Lm13;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj03;->v:Lm13;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final E0()V
    .locals 8

    .line 1
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lr61;->G:Ld61;

    .line 6
    .line 7
    iget-object v1, p0, Lj03;->v:Lm13;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lxe1;->k0(Lm13;Ld61;)Lm13;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    sget-object v0, Lly;->k:Ltu2;

    .line 14
    .line 15
    invoke-static {p0, v0}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v5, v0

    .line 20
    check-cast v5, Lxl0;

    .line 21
    .line 22
    invoke-virtual {p0, v6, v5}, Lj03;->M0(Lm13;Lxl0;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lh03;

    .line 26
    .line 27
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v3, v0, Lr61;->G:Ld61;

    .line 32
    .line 33
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v4, v0, Lr61;->F:Le70;

    .line 38
    .line 39
    iget-object v0, p0, Lj03;->w:Lm63;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v7, v0, Lm63;->h:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-direct/range {v2 .. v7}, Lh03;-><init>(Ld61;Le70;Lxl0;Lm13;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lj03;->x:Lh03;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    const-string p0, "Font resolution state is not set."

    .line 52
    .line 53
    invoke-static {p0}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ls;->b()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final F0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lj03;->w:Lm63;

    .line 3
    .line 4
    iput-object v0, p0, Lj03;->x:Lh03;

    .line 5
    .line 6
    return-void
.end method

.method public final M0(Lm13;Lxl0;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lm13;->a:Llt2;

    .line 2
    .line 3
    iget-object v0, p1, Llt2;->f:Lmx2;

    .line 4
    .line 5
    iget-object v1, p1, Llt2;->c:Lim0;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Lim0;->j:Lim0;

    .line 10
    .line 11
    :cond_0
    iget-object v2, p1, Llt2;->d:Lgm0;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget v2, v2, Lgm0;->a:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v2, 0x0

    .line 19
    :goto_0
    iget-object p1, p1, Llt2;->e:Lhm0;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget p1, p1, Lhm0;->a:I

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    const p1, 0xffff

    .line 27
    .line 28
    .line 29
    :goto_1
    check-cast p2, Lyl0;

    .line 30
    .line 31
    invoke-virtual {p2, v0, v1, v2, p1}, Lyl0;->b(Lmx2;Lim0;II)Lm63;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lj03;->w:Lm63;

    .line 36
    .line 37
    invoke-static {p0}, Lgf1;->A(Lj61;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj03;->x:Lh03;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lr61;->F:Le70;

    .line 10
    .line 11
    const/16 v2, 0x1d

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, v3, v1, v3, v2}, Lh03;->a(Lh03;Ld61;Le70;Lm13;I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lgf1;->A(Lj61;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 5

    .line 1
    iget-object v0, p0, Lj03;->x:Lh03;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v2, v0, Lh03;->f:Lnx1;

    .line 7
    .line 8
    iget-object p0, p0, Lj03;->w:Lm63;

    .line 9
    .line 10
    if-eqz p0, :cond_2

    .line 11
    .line 12
    iget-object p0, p0, Lm63;->h:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v1, v0, Lh03;->e:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {p0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iput-object p0, v0, Lh03;->e:Ljava/lang/Object;

    .line 23
    .line 24
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v2, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v2}, Lnx1;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Lh03;->c:Lxl0;

    .line 42
    .line 43
    iget-object v1, v0, Lh03;->d:Lm13;

    .line 44
    .line 45
    iget-object v3, v0, Lh03;->b:Le70;

    .line 46
    .line 47
    invoke-static {v1, v3, p0}, Llz2;->b(Lm13;Le70;Lxl0;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    iput-wide v3, v0, Lh03;->g:J

    .line 52
    .line 53
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {v2, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-wide v0, v0, Lh03;->g:J

    .line 59
    .line 60
    const/16 p0, 0x20

    .line 61
    .line 62
    shr-long v2, v0, p0

    .line 63
    .line 64
    long-to-int p0, v2

    .line 65
    const-wide v2, 0xffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v0, v2

    .line 71
    long-to-int v0, v0

    .line 72
    const/16 v1, 0xa

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-static {p0, v2, v0, v2, v1}, Lgz;->b(IIIII)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    invoke-static {p3, p4, v0, v1}, Lgz;->e(JJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide p3

    .line 83
    invoke-interface {p2, p3, p4}, Lif1;->e(J)Lsz1;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    iget p2, p0, Lsz1;->h:I

    .line 88
    .line 89
    iget p3, p0, Lsz1;->i:I

    .line 90
    .line 91
    new-instance p4, Lpg;

    .line 92
    .line 93
    const/4 v0, 0x6

    .line 94
    invoke-direct {p4, p0, v0}, Lpg;-><init>(Lsz1;I)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lce0;->h:Lce0;

    .line 98
    .line 99
    invoke-interface {p1, p2, p3, p0, p4}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_2
    const-string p0, "Font resolution state is not set."

    .line 105
    .line 106
    invoke-static {p0}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Ls;->b()V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :cond_3
    const-string p0, "Min size state is not set."

    .line 114
    .line 115
    invoke-static {p0}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Ls;->b()V

    .line 119
    .line 120
    .line 121
    return-object v1
.end method

.method public final w0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj03;->x:Lh03;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lr61;->G:Ld61;

    .line 10
    .line 11
    const/16 v2, 0x1e

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, v1, v3, v3, v2}, Lh03;->a(Lh03;Ld61;Le70;Lm13;I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lgf1;->A(Lj61;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

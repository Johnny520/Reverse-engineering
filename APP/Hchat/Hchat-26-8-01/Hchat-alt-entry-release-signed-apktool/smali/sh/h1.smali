.class public final synthetic Lsh/h1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly0/o;

.field public final synthetic h:Lf1/r0;

.field public final synthetic i:J

.field public final synthetic j:F

.field public final synthetic k:Ls0/d;


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lf1/r0;JFLs0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/h1;->g:Ly0/o;

    .line 5
    .line 6
    iput-object p2, p0, Lsh/h1;->h:Lf1/r0;

    .line 7
    .line 8
    iput-wide p3, p0, Lsh/h1;->i:J

    .line 9
    .line 10
    iput p5, p0, Lsh/h1;->j:F

    .line 11
    .line 12
    iput-object p6, p0, Lsh/h1;->k:Ls0/d;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Li0/h0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/2addr p2, v3

    .line 20
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_3

    .line 25
    .line 26
    iget-object p2, p0, Lsh/h1;->g:Ly0/o;

    .line 27
    .line 28
    iget-object v0, p0, Lsh/h1;->h:Lf1/r0;

    .line 29
    .line 30
    iget-wide v4, p0, Lsh/h1;->i:J

    .line 31
    .line 32
    iget v1, p0, Lsh/h1;->j:F

    .line 33
    .line 34
    invoke-static {p2, v0, v4, v5, v1}, Lsh/s;->u(Ly0/o;Lf1/r0;JF)Ly0/o;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v1, Li0/l;->a:Li0/e;

    .line 43
    .line 44
    if-ne v0, v1, :cond_1

    .line 45
    .line 46
    new-instance v0, Lr9/p;

    .line 47
    .line 48
    const/4 v1, 0x6

    .line 49
    invoke-direct {v0, v1}, Lr9/p;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    check-cast v0, Lfg/l;

    .line 56
    .line 57
    sget-object v1, Lf2/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 58
    .line 59
    new-instance v1, Lf2/b;

    .line 60
    .line 61
    invoke-direct {v1, v2, v0}, Lf2/b;-><init>(ZLfg/l;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p2, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    sget-object v0, Ly0/b;->g:Ly0/g;

    .line 69
    .line 70
    invoke-static {v0, v3}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-wide v4, p1, Li0/h0;->T:J

    .line 75
    .line 76
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-static {p1, p2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 94
    .line 95
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 96
    .line 97
    .line 98
    iget-boolean v6, p1, Li0/h0;->S:Z

    .line 99
    .line 100
    if-eqz v6, :cond_2

    .line 101
    .line 102
    invoke-virtual {p1, v5}, Li0/h0;->k(Lfg/a;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 107
    .line 108
    .line 109
    :goto_1
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 110
    .line 111
    invoke-static {v5, p1, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    sget-object v0, Lx1/f;->d:Lx1/e;

    .line 115
    .line 116
    invoke-static {v0, p1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    sget-object v1, Lx1/f;->f:Lx1/e;

    .line 124
    .line 125
    invoke-static {p1, v0, v1}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 126
    .line 127
    .line 128
    sget-object v0, Lx1/f;->g:Lx1/d;

    .line 129
    .line 130
    invoke-static {v0, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 131
    .line 132
    .line 133
    sget-object v0, Lx1/f;->c:Lx1/e;

    .line 134
    .line 135
    invoke-static {v0, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    iget-object v0, p0, Lsh/h1;->k:Ls0/d;

    .line 143
    .line 144
    invoke-virtual {v0, p1, p2}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_3
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 152
    .line 153
    .line 154
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 155
    .line 156
    return-object p1
.end method

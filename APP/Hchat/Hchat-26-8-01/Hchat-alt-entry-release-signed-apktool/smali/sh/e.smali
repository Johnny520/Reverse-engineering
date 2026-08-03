.class public final synthetic Lsh/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:F

.field public final synthetic h:F

.field public final synthetic i:Lp/x0;

.field public final synthetic j:Ls0/d;


# direct methods
.method public synthetic constructor <init>(FFLp/x0;Ls0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lsh/e;->g:F

    .line 5
    .line 6
    iput p2, p0, Lsh/e;->h:F

    .line 7
    .line 8
    iput-object p3, p0, Lsh/e;->i:Lp/x0;

    .line 9
    .line 10
    iput-object p4, p0, Lsh/e;->j:Ls0/d;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

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
    const/4 v2, 0x1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    and-int/2addr p2, v2

    .line 19
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    iget p2, p0, Lsh/e;->g:F

    .line 26
    .line 27
    iget v0, p0, Lsh/e;->h:F

    .line 28
    .line 29
    invoke-static {p2, v0}, Lp/h1;->a(FF)Ly0/o;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object v0, p0, Lsh/e;->i:Lp/x0;

    .line 34
    .line 35
    invoke-static {p2, v0}, Lp/d;->k(Ly0/o;Lp/x0;)Ly0/o;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    sget-object v0, Lp/j;->e:Lp/f;

    .line 40
    .line 41
    sget-object v1, Ly0/b;->q:Ly0/f;

    .line 42
    .line 43
    const/16 v3, 0x36

    .line 44
    .line 45
    invoke-static {v0, v1, p1, v3}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-wide v3, p1, Li0/h0;->T:J

    .line 50
    .line 51
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {p1, p2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    sget-object v4, Lx1/g;->f:Lx1/f;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    sget-object v4, Lx1/f;->b:Lx1/y;

    .line 69
    .line 70
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 71
    .line 72
    .line 73
    iget-boolean v5, p1, Li0/h0;->S:Z

    .line 74
    .line 75
    if-eqz v5, :cond_1

    .line 76
    .line 77
    invoke-virtual {p1, v4}, Li0/h0;->k(Lfg/a;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 82
    .line 83
    .line 84
    :goto_1
    sget-object v4, Lx1/f;->e:Lx1/e;

    .line 85
    .line 86
    invoke-static {v4, p1, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lx1/f;->d:Lx1/e;

    .line 90
    .line 91
    invoke-static {v0, p1, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v1, Lx1/f;->f:Lx1/e;

    .line 99
    .line 100
    invoke-static {p1, v0, v1}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 101
    .line 102
    .line 103
    sget-object v0, Lx1/f;->g:Lx1/d;

    .line 104
    .line 105
    invoke-static {v0, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Lx1/f;->c:Lx1/e;

    .line 109
    .line 110
    invoke-static {v0, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    const/4 p2, 0x6

    .line 114
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    iget-object v0, p0, Lsh/e;->j:Ls0/d;

    .line 119
    .line 120
    sget-object v1, Lp/f1;->a:Lp/f1;

    .line 121
    .line 122
    invoke-virtual {v0, v1, p1, p2}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v2}, Li0/h0;->p(Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_2
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 130
    .line 131
    .line 132
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 133
    .line 134
    return-object p1
.end method

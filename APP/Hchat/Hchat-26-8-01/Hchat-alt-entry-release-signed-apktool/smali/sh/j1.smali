.class public final synthetic Lsh/j1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly0/o;

.field public final synthetic h:Lf1/r0;

.field public final synthetic i:J

.field public final synthetic j:F

.field public final synthetic k:Ln/k;

.field public final synthetic l:Lk/y0;

.field public final synthetic m:Z

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Ls0/d;


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lf1/r0;JFLn/k;Lk/y0;ZLi0/a1;Ls0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/j1;->g:Ly0/o;

    .line 5
    .line 6
    iput-object p2, p0, Lsh/j1;->h:Lf1/r0;

    .line 7
    .line 8
    iput-wide p3, p0, Lsh/j1;->i:J

    .line 9
    .line 10
    iput p5, p0, Lsh/j1;->j:F

    .line 11
    .line 12
    iput-object p6, p0, Lsh/j1;->k:Ln/k;

    .line 13
    .line 14
    iput-object p7, p0, Lsh/j1;->l:Lk/y0;

    .line 15
    .line 16
    iput-boolean p8, p0, Lsh/j1;->m:Z

    .line 17
    .line 18
    iput-object p9, p0, Lsh/j1;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p10, p0, Lsh/j1;->o:Ls0/d;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

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
    if-eqz p2, :cond_2

    .line 25
    .line 26
    iget-object p2, p0, Lsh/j1;->g:Ly0/o;

    .line 27
    .line 28
    iget-object v0, p0, Lsh/j1;->h:Lf1/r0;

    .line 29
    .line 30
    iget-wide v4, p0, Lsh/j1;->i:J

    .line 31
    .line 32
    iget v1, p0, Lsh/j1;->j:F

    .line 33
    .line 34
    invoke-static {p2, v0, v4, v5, v1}, Lsh/s;->u(Ly0/o;Lf1/r0;JF)Ly0/o;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-object p2, p0, Lsh/j1;->n:Li0/a1;

    .line 39
    .line 40
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    move-object v11, p2

    .line 45
    check-cast v11, Lfg/a;

    .line 46
    .line 47
    const/16 v12, 0x18

    .line 48
    .line 49
    iget-object v7, p0, Lsh/j1;->k:Ln/k;

    .line 50
    .line 51
    iget-object v8, p0, Lsh/j1;->l:Lk/y0;

    .line 52
    .line 53
    iget-boolean v9, p0, Lsh/j1;->m:Z

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    invoke-static/range {v6 .. v12}, Lk/n;->i(Ly0/o;Ln/k;Lk/y0;ZLf2/i;Lfg/a;I)Ly0/o;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    sget-object v0, Ly0/b;->g:Ly0/g;

    .line 61
    .line 62
    invoke-static {v0, v3}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-wide v4, p1, Li0/h0;->T:J

    .line 67
    .line 68
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {p1, p2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 86
    .line 87
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 88
    .line 89
    .line 90
    iget-boolean v6, p1, Li0/h0;->S:Z

    .line 91
    .line 92
    if-eqz v6, :cond_1

    .line 93
    .line 94
    invoke-virtual {p1, v5}, Li0/h0;->k(Lfg/a;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 99
    .line 100
    .line 101
    :goto_1
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 102
    .line 103
    invoke-static {v5, p1, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    sget-object v0, Lx1/f;->d:Lx1/e;

    .line 107
    .line 108
    invoke-static {v0, p1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sget-object v1, Lx1/f;->f:Lx1/e;

    .line 116
    .line 117
    invoke-static {p1, v0, v1}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 118
    .line 119
    .line 120
    sget-object v0, Lx1/f;->g:Lx1/d;

    .line 121
    .line 122
    invoke-static {v0, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 123
    .line 124
    .line 125
    sget-object v0, Lx1/f;->c:Lx1/e;

    .line 126
    .line 127
    invoke-static {v0, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    iget-object v0, p0, Lsh/j1;->o:Ls0/d;

    .line 135
    .line 136
    invoke-virtual {v0, p1, p2}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_2
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 144
    .line 145
    .line 146
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 147
    .line 148
    return-object p1
.end method

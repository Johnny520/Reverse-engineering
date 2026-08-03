.class public final synthetic Lwb/qr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:J

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lwb/qr;->g:J

    .line 5
    .line 6
    iput-object p3, p0, Lwb/qr;->h:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lr/d;

    .line 2
    .line 3
    move-object v4, p2

    .line 4
    check-cast v4, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p1, p2, 0x11

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    const/4 v6, 0x1

    .line 19
    const/16 v0, 0x10

    .line 20
    .line 21
    if-eq p1, v0, :cond_0

    .line 22
    .line 23
    move p1, v6

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p1, p3

    .line 26
    :goto_0
    and-int/2addr p2, v6

    .line 27
    invoke-virtual {v4, p2, p1}, Li0/h0;->S(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    sget-object p1, Ly0/l;->a:Ly0/l;

    .line 34
    .line 35
    const/high16 p2, 0x3f800000    # 1.0f

    .line 36
    .line 37
    invoke-static {p1, p2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    int-to-float p2, v0

    .line 42
    const/16 v0, 0xa

    .line 43
    .line 44
    int-to-float v0, v0

    .line 45
    invoke-static {p1, p2, v0}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    sget-object p2, Lp/j;->a:Lp/c;

    .line 50
    .line 51
    sget-object v0, Ly0/b;->p:Ly0/f;

    .line 52
    .line 53
    invoke-static {p2, v0, v4, p3}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iget-wide v0, v4, Li0/h0;->T:J

    .line 58
    .line 59
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v4, p1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget-object v1, Lx1/g;->f:Lx1/f;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    sget-object v1, Lx1/f;->b:Lx1/y;

    .line 77
    .line 78
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 79
    .line 80
    .line 81
    iget-boolean v2, v4, Li0/h0;->S:Z

    .line 82
    .line 83
    if-eqz v2, :cond_1

    .line 84
    .line 85
    invoke-virtual {v4, v1}, Li0/h0;->k(Lfg/a;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 90
    .line 91
    .line 92
    :goto_1
    sget-object v1, Lx1/f;->e:Lx1/e;

    .line 93
    .line 94
    invoke-static {v1, v4, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p2, Lx1/f;->d:Lx1/e;

    .line 98
    .line 99
    invoke-static {p2, v4, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    sget-object p3, Lx1/f;->f:Lx1/e;

    .line 107
    .line 108
    invoke-static {p3, v4, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object p2, Lx1/f;->g:Lx1/d;

    .line 112
    .line 113
    invoke-static {p2, v4}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 114
    .line 115
    .line 116
    sget-object p2, Lx1/f;->c:Lx1/e;

    .line 117
    .line 118
    invoke-static {p2, v4, p1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Lwb/y2;->n:Lwb/y2;

    .line 122
    .line 123
    const/16 v5, 0x180

    .line 124
    .line 125
    iget-wide v1, p0, Lwb/qr;->g:J

    .line 126
    .line 127
    iget-object v3, p0, Lwb/qr;->h:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual/range {v0 .. v5}, Lwb/y2;->s0(JLjava/lang/String;Li0/h0;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v6}, Li0/h0;->p(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_2
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 137
    .line 138
    .line 139
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 140
    .line 141
    return-object p1
.end method

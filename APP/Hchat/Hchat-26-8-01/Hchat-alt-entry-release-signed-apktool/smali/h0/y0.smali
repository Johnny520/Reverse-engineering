.class public final Lh0/y0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lw/y0;


# instance fields
.field public final synthetic a:Lh0/d1;


# direct methods
.method public constructor <init>(Lh0/d1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh0/y0;->a:Lh0/d1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(JLg1/d;)V
    .locals 2

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object p2, p0, Lh0/y0;->a:Lh0/d1;

    .line 3
    .line 4
    invoke-virtual {p2, p1}, Lh0/d1;->l(Z)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-static {v0, v1}, Lh0/h0;->a(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object p1, p2, Lh0/d1;->d:Lw/q0;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Lw/q0;->d()Lw/m1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1, v0, v1}, Lw/m1;->e(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iput-wide v0, p2, Lh0/d1;->n:J

    .line 28
    .line 29
    new-instance p1, Le1/b;

    .line 30
    .line 31
    invoke-direct {p1, v0, v1}, Le1/b;-><init>(J)V

    .line 32
    .line 33
    .line 34
    iget-object p3, p2, Lh0/d1;->r:Li0/j1;

    .line 35
    .line 36
    invoke-virtual {p3, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const-wide/16 v0, 0x0

    .line 40
    .line 41
    iput-wide v0, p2, Lh0/d1;->p:J

    .line 42
    .line 43
    sget-object p1, Lw/g0;->g:Lw/g0;

    .line 44
    .line 45
    iget-object p3, p2, Lh0/d1;->q:Li0/j1;

    .line 46
    .line 47
    invoke-virtual {p3, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    invoke-virtual {p2, p1}, Lh0/d1;->t(Z)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/y0;->a:Lh0/d1;

    .line 2
    .line 3
    iget-object v1, v0, Lh0/d1;->q:Li0/j1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, v0, Lh0/d1;->r:Li0/j1;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/y0;->a:Lh0/d1;

    .line 2
    .line 3
    iget-object v1, v0, Lh0/d1;->q:Li0/j1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, v0, Lh0/d1;->r:Li0/j1;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d()V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lh0/y0;->a:Lh0/d1;

    .line 2
    .line 3
    iget-wide v1, v0, Lh0/d1;->p:J

    .line 4
    .line 5
    invoke-static {v1, v2, p1, p2}, Le1/b;->e(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    iput-wide p1, v0, Lh0/d1;->p:J

    .line 10
    .line 11
    iget-object p1, v0, Lh0/d1;->d:Lw/q0;

    .line 12
    .line 13
    if-eqz p1, :cond_3

    .line 14
    .line 15
    invoke-virtual {p1}, Lw/q0;->d()Lw/m1;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    iget-wide v1, v0, Lh0/d1;->n:J

    .line 22
    .line 23
    iget-wide v3, v0, Lh0/d1;->p:J

    .line 24
    .line 25
    invoke-static {v1, v2, v3, v4}, Le1/b;->e(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    new-instance p2, Le1/b;

    .line 30
    .line 31
    invoke-direct {p2, v1, v2}, Le1/b;-><init>(J)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lh0/d1;->r:Li0/j1;

    .line 35
    .line 36
    invoke-virtual {v1, p2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p2, v0, Lh0/d1;->b:Lb5/k;

    .line 40
    .line 41
    invoke-virtual {v0}, Lh0/d1;->i()Le1/b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-wide v1, v1, Le1/b;->a:J

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    invoke-virtual {p1, v1, v2, v3}, Lw/m1;->b(JZ)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {p2, p1}, Lb5/k;->n(I)I

    .line 56
    .line 57
    .line 58
    invoke-static {p1, p1}, Li2/e0;->b(II)J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-wide v1, v1, Ln2/s;->b:J

    .line 67
    .line 68
    invoke-static {p1, p2, v1, v2}, Li2/m0;->b(JJ)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    iget-object v1, v0, Lh0/d1;->d:Lw/q0;

    .line 76
    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    iget-object v1, v1, Lw/q0;->q:Li0/j1;

    .line 80
    .line 81
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    iget-object v1, v0, Lh0/d1;->j:Ln1/a;

    .line 95
    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    const/16 v2, 0x9

    .line 99
    .line 100
    check-cast v1, Ln1/c;

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ln1/c;->a(I)V

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_0
    iget-object v1, v0, Lh0/d1;->c:Lfg/l;

    .line 106
    .line 107
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iget-object v2, v2, Ln2/s;->a:Li2/g;

    .line 112
    .line 113
    invoke-static {v2, p1, p2}, Lh0/d1;->e(Li2/g;J)Ln2/s;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-interface {v1, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    new-instance v1, Li2/m0;

    .line 121
    .line 122
    invoke-direct {v1, p1, p2}, Li2/m0;-><init>(J)V

    .line 123
    .line 124
    .line 125
    iput-object v1, v0, Lh0/d1;->v:Li2/m0;

    .line 126
    .line 127
    :cond_3
    :goto_1
    return-void
.end method

.method public final onCancel()V
    .locals 0

    .line 1
    return-void
.end method

.class public final Lw/l1;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/h;
.implements Lx1/v;


# instance fields
.field public final u:Li2/n0;

.field public v:Lm2/r;

.field public w:Lvh/f;


# direct methods
.method public constructor <init>(Li2/n0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/l1;->u:Li2/n0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final c1()V
    .locals 8

    .line 1
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lx1/f0;->F:Lu2/m;

    .line 6
    .line 7
    iget-object v1, p0, Lw/l1;->u:Li2/n0;

    .line 8
    .line 9
    invoke-static {v1, v0}, Li2/e0;->h(Li2/n0;Lu2/m;)Li2/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    sget-object v0, Ly1/h1;->k:Li0/m2;

    .line 14
    .line 15
    invoke-static {p0, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v5, v0

    .line 20
    check-cast v5, Lm2/d;

    .line 21
    .line 22
    invoke-virtual {p0, v6, v5}, Lw/l1;->k1(Li2/n0;Lm2/d;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lvh/f;

    .line 26
    .line 27
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v3, v0, Lx1/f0;->F:Lu2/m;

    .line 32
    .line 33
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v4, v0, Lx1/f0;->E:Lu2/c;

    .line 38
    .line 39
    iget-object v0, p0, Lw/l1;->v:Lm2/r;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v7, v0, Lm2/r;->g:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-direct/range {v2 .. v7}, Lvh/f;-><init>(Lu2/m;Lu2/c;Lm2/d;Li2/n0;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lw/l1;->w:Lvh/f;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    const-string v0, "Font resolution state is not set."

    .line 52
    .line 53
    invoke-static {v0}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lokio/a;->c()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final d1()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw/l1;->v:Lm2/r;

    .line 3
    .line 4
    iput-object v0, p0, Lw/l1;->w:Lvh/f;

    .line 5
    .line 6
    return-void
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 5

    .line 1
    iget-object v0, p0, Lw/l1;->w:Lvh/f;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, v0, Lvh/f;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Li0/j1;

    .line 8
    .line 9
    iget-object v2, p0, Lw/l1;->v:Lm2/r;

    .line 10
    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    iget-object v2, v2, Lm2/r;->g:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v3, v0, Lvh/f;->f:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iput-object v2, v0, Lvh/f;->f:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iget-object v2, v0, Lvh/f;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Lm2/d;

    .line 45
    .line 46
    iget-object v3, v0, Lvh/f;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Li2/n0;

    .line 49
    .line 50
    iget-object v4, v0, Lvh/f;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, Lu2/c;

    .line 53
    .line 54
    invoke-static {v3, v4, v2}, Lw/a1;->b(Li2/n0;Lu2/c;Lm2/d;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    iput-wide v2, v0, Lvh/f;->b:J

    .line 59
    .line 60
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-wide v0, v0, Lvh/f;->b:J

    .line 66
    .line 67
    const/16 v2, 0x20

    .line 68
    .line 69
    shr-long v2, v0, v2

    .line 70
    .line 71
    long-to-int v2, v2

    .line 72
    const-wide v3, 0xffffffffL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    and-long/2addr v0, v3

    .line 78
    long-to-int v0, v0

    .line 79
    const/16 v1, 0xa

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-static {v2, v3, v0, v3, v1}, Lu2/b;->b(IIIII)J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    invoke-static {p3, p4, v0, v1}, Lu2/b;->e(JJ)J

    .line 87
    .line 88
    .line 89
    move-result-wide p3

    .line 90
    invoke-interface {p2, p3, p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iget p3, p2, Lv1/b1;->g:I

    .line 95
    .line 96
    iget p4, p2, Lv1/b1;->h:I

    .line 97
    .line 98
    new-instance v0, Lg0/g;

    .line 99
    .line 100
    const/16 v1, 0x8

    .line 101
    .line 102
    invoke-direct {v0, p2, v1}, Lg0/g;-><init>(Lv1/b1;I)V

    .line 103
    .line 104
    .line 105
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 106
    .line 107
    invoke-interface {p1, p3, p4, p2, v0}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :cond_2
    const-string p1, "Font resolution state is not set."

    .line 113
    .line 114
    invoke-static {p1}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lokio/a;->c()V

    .line 118
    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    return-object p1

    .line 122
    :cond_3
    const-string p1, "Min size state is not set."

    .line 123
    .line 124
    invoke-static {p1}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lokio/a;->c()V

    .line 128
    .line 129
    .line 130
    const/4 p1, 0x0

    .line 131
    return-object p1
.end method

.method public final k0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lw/l1;->w:Lvh/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lx1/f0;->F:Lu2/m;

    .line 10
    .line 11
    const/16 v2, 0x1e

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, v1, v3, v3, v2}, Lvh/f;->a(Lvh/f;Lu2/m;Lu2/c;Li2/n0;I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lx1/k;->m(Lx1/v;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final k1(Li2/n0;Lm2/d;)V
    .locals 3

    .line 1
    iget-object p1, p1, Li2/n0;->a:Li2/f0;

    .line 2
    .line 3
    iget-object v0, p1, Li2/f0;->f:Lm2/p;

    .line 4
    .line 5
    iget-object v1, p1, Li2/f0;->c:Lm2/k;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Lm2/k;->i:Lm2/k;

    .line 10
    .line 11
    :cond_0
    iget-object v2, p1, Li2/f0;->d:Lm2/i;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget v2, v2, Lm2/i;->a:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v2, 0x0

    .line 19
    :goto_0
    iget-object p1, p1, Li2/f0;->e:Lm2/j;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget p1, p1, Lm2/j;->a:I

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
    check-cast p2, Lm2/e;

    .line 30
    .line 31
    invoke-virtual {p2, v0, v1, v2, p1}, Lm2/e;->b(Lm2/p;Lm2/k;II)Lm2/r;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lw/l1;->v:Lm2/r;

    .line 36
    .line 37
    invoke-static {p0}, Lx1/k;->m(Lx1/v;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final m()V
    .locals 4

    .line 1
    iget-object v0, p0, Lw/l1;->w:Lvh/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lx1/f0;->E:Lu2/c;

    .line 10
    .line 11
    const/16 v2, 0x1d

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, v3, v1, v3, v2}, Lvh/f;->a(Lvh/f;Lu2/m;Lu2/c;Li2/n0;I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Lx1/k;->m(Lx1/v;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

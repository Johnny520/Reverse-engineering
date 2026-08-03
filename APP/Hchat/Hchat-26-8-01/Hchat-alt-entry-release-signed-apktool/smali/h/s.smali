.class public final Lh/s;
.super Lh/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public v:Li/d1;

.field public w:Li0/a1;

.field public x:Lh/t;

.field public y:J


# virtual methods
.method public final e1()V
    .locals 2

    .line 1
    sget-wide v0, Lh/k;->a:J

    .line 2
    .line 3
    iput-wide v0, p0, Lh/s;->y:J

    .line 4
    .line 5
    return-void
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 7

    .line 1
    invoke-interface {p2, p3, p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lv1/o;->u0()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    const-wide v0, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/16 p4, 0x20

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    iget p3, p2, Lv1/b1;->g:I

    .line 19
    .line 20
    iget v2, p2, Lv1/b1;->h:I

    .line 21
    .line 22
    int-to-long v3, p3

    .line 23
    shl-long/2addr v3, p4

    .line 24
    int-to-long v5, v2

    .line 25
    and-long/2addr v5, v0

    .line 26
    or-long v2, v3, v5

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p3, p0, Lh/s;->v:Li/d1;

    .line 30
    .line 31
    iget v2, p2, Lv1/b1;->g:I

    .line 32
    .line 33
    if-nez p3, :cond_1

    .line 34
    .line 35
    iget p3, p2, Lv1/b1;->h:I

    .line 36
    .line 37
    int-to-long v2, v2

    .line 38
    shl-long/2addr v2, p4

    .line 39
    int-to-long v4, p3

    .line 40
    and-long/2addr v4, v0

    .line 41
    or-long/2addr v2, v4

    .line 42
    iput-wide v2, p0, Lh/s;->y:J

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget v3, p2, Lv1/b1;->h:I

    .line 46
    .line 47
    int-to-long v4, v2

    .line 48
    shl-long/2addr v4, p4

    .line 49
    int-to-long v2, v3

    .line 50
    and-long/2addr v2, v0

    .line 51
    or-long/2addr v2, v4

    .line 52
    new-instance v4, Lh/r;

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-direct {v4, p0, v2, v3, v5}, Lh/r;-><init>(Lh/s;JI)V

    .line 56
    .line 57
    .line 58
    new-instance v5, Lh/r;

    .line 59
    .line 60
    const/4 v6, 0x1

    .line 61
    invoke-direct {v5, p0, v2, v3, v6}, Lh/r;-><init>(Lh/s;JI)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, v4, v5}, Li/d1;->a(Lfg/l;Lfg/l;)Li/c1;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    iget-object v2, p0, Lh/s;->x:Lh/t;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Li/c1;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lu2/l;

    .line 78
    .line 79
    iget-wide v2, v2, Lu2/l;->a:J

    .line 80
    .line 81
    invoke-virtual {p3}, Li/c1;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    check-cast p3, Lu2/l;

    .line 86
    .line 87
    iget-wide v4, p3, Lu2/l;->a:J

    .line 88
    .line 89
    iput-wide v4, p0, Lh/s;->y:J

    .line 90
    .line 91
    :goto_0
    shr-long p3, v2, p4

    .line 92
    .line 93
    long-to-int p3, p3

    .line 94
    and-long/2addr v0, v2

    .line 95
    long-to-int p4, v0

    .line 96
    new-instance v0, Lh/q;

    .line 97
    .line 98
    invoke-direct {v0, p0, p2, v2, v3}, Lh/q;-><init>(Lh/s;Lv1/b1;J)V

    .line 99
    .line 100
    .line 101
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 102
    .line 103
    invoke-interface {p1, p3, p4, p2, v0}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1
.end method

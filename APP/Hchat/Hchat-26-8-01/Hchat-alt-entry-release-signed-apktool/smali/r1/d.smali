.class public final Lr1/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Lr1/i;

.field public b:Lr1/i;

.field public c:Lgg/m;

.field public d:Lqg/t;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld1/c0;

    .line 5
    .line 6
    const/16 v1, 0xc

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lr1/d;->c:Lgg/m;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(JJLyf/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p5, Lr1/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lr1/b;

    .line 7
    .line 8
    iget v1, v0, Lr1/b;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lr1/b;->i:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lr1/b;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lr1/b;-><init>(Lr1/d;Lyf/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, Lr1/b;->g:Ljava/lang/Object;

    .line 28
    .line 29
    iget v0, v6, Lr1/b;->i:I

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    if-eq v0, v2, :cond_2

    .line 36
    .line 37
    if-ne v0, v1, :cond_1

    .line 38
    .line 39
    invoke-static {p5}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_5

    .line 43
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    return-object p1

    .line 50
    :cond_2
    invoke-static {p5}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_3
    invoke-static {p5}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p5, p0, Lr1/d;->a:Lr1/i;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    if-eqz p5, :cond_4

    .line 61
    .line 62
    invoke-virtual {p5}, Lr1/i;->l1()Lr1/i;

    .line 63
    .line 64
    .line 65
    move-result-object p5

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move-object p5, v0

    .line 68
    :goto_2
    const-wide/16 v3, 0x0

    .line 69
    .line 70
    sget-object v7, Lxf/a;->g:Lxf/a;

    .line 71
    .line 72
    if-nez p5, :cond_6

    .line 73
    .line 74
    iget-object v1, p0, Lr1/d;->b:Lr1/i;

    .line 75
    .line 76
    if-eqz v1, :cond_a

    .line 77
    .line 78
    iput v2, v6, Lr1/b;->i:I

    .line 79
    .line 80
    move-wide v2, p1

    .line 81
    move-wide v4, p3

    .line 82
    invoke-virtual/range {v1 .. v6}, Lr1/i;->m0(JJLyf/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p5

    .line 86
    if-ne p5, v7, :cond_5

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_5
    :goto_3
    check-cast p5, Lu2/q;

    .line 90
    .line 91
    iget-wide v3, p5, Lu2/q;->a:J

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_6
    move-wide v8, v3

    .line 95
    move-wide v2, p1

    .line 96
    move-wide p1, v8

    .line 97
    move-wide v4, p3

    .line 98
    iget-object p3, p0, Lr1/d;->a:Lr1/i;

    .line 99
    .line 100
    if-eqz p3, :cond_7

    .line 101
    .line 102
    invoke-virtual {p3}, Lr1/i;->l1()Lr1/i;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :cond_7
    if-eqz v0, :cond_9

    .line 107
    .line 108
    iput v1, v6, Lr1/b;->i:I

    .line 109
    .line 110
    move-object v1, v0

    .line 111
    invoke-virtual/range {v1 .. v6}, Lr1/i;->m0(JJLyf/c;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p5

    .line 115
    if-ne p5, v7, :cond_8

    .line 116
    .line 117
    :goto_4
    return-object v7

    .line 118
    :cond_8
    :goto_5
    check-cast p5, Lu2/q;

    .line 119
    .line 120
    iget-wide v3, p5, Lu2/q;->a:J

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_9
    move-wide v3, p1

    .line 124
    :cond_a
    :goto_6
    new-instance p1, Lu2/q;

    .line 125
    .line 126
    invoke-direct {p1, v3, v4}, Lu2/q;-><init>(J)V

    .line 127
    .line 128
    .line 129
    return-object p1
.end method

.method public final b(JJI)J
    .locals 7

    .line 1
    iget-object v0, p0, Lr1/d;->a:Lr1/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr1/i;->l1()Lr1/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    move-object v1, v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :goto_1
    if-eqz v1, :cond_1

    .line 14
    .line 15
    move-wide v2, p1

    .line 16
    move-wide v4, p3

    .line 17
    move v6, p5

    .line 18
    invoke-virtual/range {v1 .. v6}, Lr1/i;->M0(JJI)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    return-wide p1

    .line 23
    :cond_1
    const-wide/16 p1, 0x0

    .line 24
    .line 25
    return-wide p1
.end method

.method public final c(JLyf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lr1/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lr1/c;

    .line 7
    .line 8
    iget v1, v0, Lr1/c;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lr1/c;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr1/c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lr1/c;-><init>(Lr1/d;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lr1/c;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lr1/c;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    return-object p1

    .line 45
    :cond_2
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p3, p0, Lr1/d;->a:Lr1/i;

    .line 49
    .line 50
    if-eqz p3, :cond_3

    .line 51
    .line 52
    invoke-virtual {p3}, Lr1/i;->l1()Lr1/i;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    const/4 p3, 0x0

    .line 58
    :goto_1
    if-eqz p3, :cond_5

    .line 59
    .line 60
    iput v2, v0, Lr1/c;->i:I

    .line 61
    .line 62
    invoke-virtual {p3, p1, p2, v0}, Lr1/i;->M(JLwf/c;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 67
    .line 68
    if-ne p3, p1, :cond_4

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_4
    :goto_2
    check-cast p3, Lu2/q;

    .line 72
    .line 73
    iget-wide p1, p3, Lu2/q;->a:J

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    const-wide/16 p1, 0x0

    .line 77
    .line 78
    :goto_3
    new-instance p3, Lu2/q;

    .line 79
    .line 80
    invoke-direct {p3, p1, p2}, Lu2/q;-><init>(J)V

    .line 81
    .line 82
    .line 83
    return-object p3
.end method

.method public final d(IJ)J
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/d;->a:Lr1/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr1/i;->l1()Lr1/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lr1/i;->f0(IJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    return-wide p1

    .line 18
    :cond_1
    const-wide/16 p1, 0x0

    .line 19
    .line 20
    return-wide p1
.end method

.method public final e()Lqg/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/d;->c:Lgg/m;

    .line 2
    .line 3
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqg/t;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const-string v0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 13
    .line 14
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0
.end method

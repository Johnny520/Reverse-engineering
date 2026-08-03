.class public final Ls/x0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv0/f;
.implements Lv0/c;


# instance fields
.field public final g:Lv0/g;

.field public final h:Lv0/d;

.field public final i:Lf/l0;


# direct methods
.method public constructor <init>(Lv0/f;Ljava/util/Map;Lv0/d;)V
    .locals 2

    .line 1
    new-instance v0, Lnb/a;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lv0/h;->a:Li0/m2;

    .line 9
    .line 10
    new-instance p1, Lv0/g;

    .line 11
    .line 12
    invoke-direct {p1, p2, v0}, Lv0/g;-><init>(Ljava/util/Map;Lfg/l;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Ls/x0;->g:Lv0/g;

    .line 19
    .line 20
    iput-object p3, p0, Ls/x0;->h:Lv0/d;

    .line 21
    .line 22
    sget-object p1, Lf/s0;->a:Lf/l0;

    .line 23
    .line 24
    new-instance p1, Lf/l0;

    .line 25
    .line 26
    invoke-direct {p1}, Lf/l0;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ls/x0;->i:Lf/l0;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ls/x0;->g:Lv0/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lv0/g;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final b(Ljava/lang/Object;Ls0/d;Li0/h0;I)V
    .locals 6

    .line 1
    const v0, -0x33289084    # -1.1295024E8f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p4

    .line 23
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p3, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p3, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    const/16 v1, 0x100

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    const/16 v1, 0x80

    .line 53
    .line 54
    :goto_3
    or-int/2addr v0, v1

    .line 55
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 56
    .line 57
    const/16 v2, 0x92

    .line 58
    .line 59
    if-eq v1, v2, :cond_6

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    goto :goto_4

    .line 63
    :cond_6
    const/4 v1, 0x0

    .line 64
    :goto_4
    and-int/lit8 v2, v0, 0x1

    .line 65
    .line 66
    invoke-virtual {p3, v2, v1}, Li0/h0;->S(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_9

    .line 71
    .line 72
    and-int/lit8 v0, v0, 0x7e

    .line 73
    .line 74
    iget-object v1, p0, Ls/x0;->h:Lv0/d;

    .line 75
    .line 76
    invoke-virtual {v1, p1, p2, p3, v0}, Lv0/d;->b(Ljava/lang/Object;Ls0/d;Li0/h0;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {p3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    or-int/2addr v0, v1

    .line 88
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-nez v0, :cond_7

    .line 93
    .line 94
    sget-object v0, Li0/l;->a:Li0/e;

    .line 95
    .line 96
    if-ne v1, v0, :cond_8

    .line 97
    .line 98
    :cond_7
    new-instance v1, Lm/b;

    .line 99
    .line 100
    const/16 v0, 0xd

    .line 101
    .line 102
    invoke-direct {v1, p0, v0, p1}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_8
    check-cast v1, Lfg/l;

    .line 109
    .line 110
    invoke-static {p1, v1, p3}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_9
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 115
    .line 116
    .line 117
    :goto_5
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    if-eqz p3, :cond_a

    .line 122
    .line 123
    new-instance v0, Lb0/r;

    .line 124
    .line 125
    const/4 v5, 0x7

    .line 126
    move-object v1, p0

    .line 127
    move-object v2, p1

    .line 128
    move-object v3, p2

    .line 129
    move v4, p4

    .line 130
    invoke-direct/range {v0 .. v5}, Lb0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 131
    .line 132
    .line 133
    iput-object v0, p3, Li0/r1;->d:Lfg/p;

    .line 134
    .line 135
    :cond_a
    return-void
.end method

.method public final c()Ljava/util/Map;
    .locals 14

    .line 1
    iget-object v0, p0, Ls/x0;->i:Lf/l0;

    .line 2
    .line 3
    iget-object v1, v0, Lf/l0;->b:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v0, v0, Lf/l0;->a:[J

    .line 6
    .line 7
    array-length v2, v0

    .line 8
    add-int/lit8 v2, v2, -0x2

    .line 9
    .line 10
    if-ltz v2, :cond_3

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    aget-wide v5, v0, v4

    .line 15
    .line 16
    not-long v7, v5

    .line 17
    const/4 v9, 0x7

    .line 18
    shl-long/2addr v7, v9

    .line 19
    and-long/2addr v7, v5

    .line 20
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v7, v9

    .line 26
    cmp-long v7, v7, v9

    .line 27
    .line 28
    if-eqz v7, :cond_2

    .line 29
    .line 30
    sub-int v7, v4, v2

    .line 31
    .line 32
    not-int v7, v7

    .line 33
    ushr-int/lit8 v7, v7, 0x1f

    .line 34
    .line 35
    const/16 v8, 0x8

    .line 36
    .line 37
    rsub-int/lit8 v7, v7, 0x8

    .line 38
    .line 39
    move v9, v3

    .line 40
    :goto_1
    if-ge v9, v7, :cond_1

    .line 41
    .line 42
    const-wide/16 v10, 0xff

    .line 43
    .line 44
    and-long/2addr v10, v5

    .line 45
    const-wide/16 v12, 0x80

    .line 46
    .line 47
    cmp-long v10, v10, v12

    .line 48
    .line 49
    if-gez v10, :cond_0

    .line 50
    .line 51
    shl-int/lit8 v10, v4, 0x3

    .line 52
    .line 53
    add-int/2addr v10, v9

    .line 54
    aget-object v10, v1, v10

    .line 55
    .line 56
    iget-object v11, p0, Ls/x0;->h:Lv0/d;

    .line 57
    .line 58
    iget-object v12, v11, Lv0/d;->h:Lf/k0;

    .line 59
    .line 60
    invoke-virtual {v12, v10}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    if-nez v12, :cond_0

    .line 65
    .line 66
    iget-object v11, v11, Lv0/d;->g:Ljava/util/Map;

    .line 67
    .line 68
    invoke-interface {v11, v10}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_0
    shr-long/2addr v5, v8

    .line 72
    add-int/lit8 v9, v9, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    if-ne v7, v8, :cond_3

    .line 76
    .line 77
    :cond_2
    if-eq v4, v2, :cond_3

    .line 78
    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    iget-object v0, p0, Ls/x0;->g:Lv0/g;

    .line 83
    .line 84
    invoke-virtual {v0}, Lv0/g;->c()Ljava/util/Map;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls/x0;->g:Lv0/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lv0/g;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final e(Ljava/lang/String;Lfg/a;)Lv0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Ls/x0;->g:Lv0/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lv0/g;->e(Ljava/lang/String;Lfg/a;)Lv0/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

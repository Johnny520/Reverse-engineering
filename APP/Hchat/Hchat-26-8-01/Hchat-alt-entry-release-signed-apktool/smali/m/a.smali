.class public final Lm/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk7/f;
.implements Lr7/g;
.implements Ls5/a;
.implements Lr1/a;
.implements Lt3/e;
.implements Ltg/d;
.implements Lokhttp3/CookieJar;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Lm/a;->g:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v0, 0x1c

    .line 12
    .line 13
    if-lt p1, v0, :cond_0

    .line 14
    .line 15
    new-instance p1, Ll3/w;

    .line 16
    .line 17
    const/4 v0, 0x6

    .line 18
    invoke-direct {p1, v0}, Ll3/w;-><init>(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ll3/w;

    .line 23
    .line 24
    const/4 v0, 0x7

    .line 25
    invoke-direct {p1, v0}, Ll3/w;-><init>(I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iput-object p1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 29
    .line 30
    return-void

    .line 31
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 40
    .line 41
    return-void

    .line 42
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lx1/a2;

    .line 46
    .line 47
    sget-object v0, Lx1/k;->a:Lx1/o1;

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 53
    .line 54
    return-void

    .line 55
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance p1, Ld/b;

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-direct {p1, v0}, Ld/b;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance p1, Lt1/b;

    .line 79
    .line 80
    invoke-direct {p1}, Lt1/b;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 84
    .line 85
    return-void

    .line 86
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance p1, Lf/p;

    .line 90
    .line 91
    invoke-direct {p1}, Lf/p;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 95
    .line 96
    return-void

    .line 97
    :sswitch_data_0
    .sparse-switch
        0xf -> :sswitch_4
        0x11 -> :sswitch_3
        0x15 -> :sswitch_2
        0x1c -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 98
    iput p1, p0, Lm/a;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lfg/p;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lm/a;->g:I

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    check-cast p1, Lyf/i;

    iput-object p1, p0, Lm/a;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 97
    iput p2, p0, Lm/a;->g:I

    iput-object p1, p0, Lm/a;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([J)V
    .locals 5

    const/16 v0, 0x18

    iput v0, p0, Lm/a;->g:I

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_4

    .line 100
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    .line 101
    new-instance v0, Lf/y;

    array-length v1, p1

    invoke-direct {v0, v1}, Lf/y;-><init>(I)V

    .line 102
    iget v1, v0, Lf/y;->b:I

    if-ltz v1, :cond_3

    .line 103
    array-length v2, p1

    if-nez v2, :cond_0

    goto :goto_0

    .line 104
    :cond_0
    array-length v2, p1

    add-int/2addr v2, v1

    .line 105
    iget-object v3, v0, Lf/y;->a:[J

    .line 106
    array-length v4, v3

    if-ge v4, v2, :cond_1

    .line 107
    array-length v4, v3

    mul-int/lit8 v4, v4, 0x3

    div-int/lit8 v4, v4, 0x2

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 108
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    iput-object v2, v0, Lf/y;->a:[J

    .line 109
    :cond_1
    iget-object v2, v0, Lf/y;->a:[J

    .line 110
    iget v3, v0, Lf/y;->b:I

    if-eq v1, v3, :cond_2

    .line 111
    array-length v4, p1

    add-int/2addr v4, v1

    .line 112
    invoke-static {v2, v2, v4, v1, v3}, Ltf/l;->q0([J[JIII)V

    :cond_2
    const/4 v3, 0x0

    .line 113
    array-length v4, p1

    invoke-static {p1, v2, v1, v3, v4}, Ltf/l;->q0([J[JIII)V

    .line 114
    iget v1, v0, Lf/y;->b:I

    array-length p1, p1

    add-int/2addr v1, p1

    iput v1, v0, Lf/y;->b:I

    goto :goto_0

    .line 115
    :cond_3
    const-string p1, ""

    .line 116
    invoke-static {p1}, Lokio/a;->i(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 117
    :cond_4
    new-instance v0, Lf/y;

    invoke-direct {v0}, Lf/y;-><init>()V

    .line 118
    :goto_0
    iput-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    return-void
.end method

.method public static v(Lm/a;I)Ls/l0;
    .locals 8

    .line 1
    iget-object p0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lr/z;

    .line 4
    .line 5
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lw0/f;->e()Lfg/l;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :try_start_0
    iget-object v3, p0, Lr/z;->f:Li0/j1;

    .line 22
    .line 23
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lr/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    invoke-static {v0, v2, v1}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lr/z;->q:Ls/m0;

    .line 33
    .line 34
    iget-wide v1, v3, Lr/p;->j:J

    .line 35
    .line 36
    iget-boolean p0, p0, Lr/z;->d:Z

    .line 37
    .line 38
    new-instance v4, Lo9/e;

    .line 39
    .line 40
    invoke-direct {v4, p1, v3}, Lo9/e;-><init>(ILr/p;)V

    .line 41
    .line 42
    .line 43
    iget-object v3, v0, Ls/m0;->c:Lj8/f;

    .line 44
    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    iget-object v0, v0, Ls/m0;->b:Lb5/c;

    .line 48
    .line 49
    new-instance v5, Ls/z0;

    .line 50
    .line 51
    iget-object v6, v3, Lj8/f;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, Ls/a1;

    .line 54
    .line 55
    instance-of v7, v6, Ls/b;

    .line 56
    .line 57
    invoke-direct {v5, v3, p1, v0, v4}, Ls/z0;-><init>(Lj8/f;ILb5/c;Lo9/e;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lu2/a;

    .line 61
    .line 62
    invoke-direct {v0, v1, v2}, Lu2/a;-><init>(J)V

    .line 63
    .line 64
    .line 65
    iput-object v0, v5, Ls/z0;->d:Lu2/a;

    .line 66
    .line 67
    if-eqz v7, :cond_2

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    if-eqz p0, :cond_1

    .line 71
    .line 72
    check-cast v6, Ls/b;

    .line 73
    .line 74
    iget-object p0, v6, Ls/b;->h:Ljava/util/PriorityQueue;

    .line 75
    .line 76
    new-instance v1, Ls/d1;

    .line 77
    .line 78
    invoke-direct {v1, v0, v5}, Ls/d1;-><init>(ILs/z0;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-boolean p0, v6, Ls/b;->i:Z

    .line 85
    .line 86
    if-nez p0, :cond_3

    .line 87
    .line 88
    iput-boolean v0, v6, Ls/b;->i:Z

    .line 89
    .line 90
    iget-object p0, v6, Ls/b;->g:Landroid/view/View;

    .line 91
    .line 92
    invoke-virtual {p0, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    check-cast v6, Ls/b;

    .line 97
    .line 98
    iget-object p0, v6, Ls/b;->h:Ljava/util/PriorityQueue;

    .line 99
    .line 100
    new-instance v1, Ls/d1;

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    invoke-direct {v1, v2, v5}, Ls/d1;-><init>(ILs/z0;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    iget-boolean p0, v6, Ls/b;->i:Z

    .line 110
    .line 111
    if-nez p0, :cond_3

    .line 112
    .line 113
    iput-boolean v0, v6, Ls/b;->i:Z

    .line 114
    .line 115
    iget-object p0, v6, Ls/b;->g:Landroid/view/View;

    .line 116
    .line 117
    invoke-virtual {p0, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    invoke-interface {v6, v5}, Ls/a1;->a(Ls/z0;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    :goto_1
    const-string p0, "compose:lazy:schedule_prefetch:index"

    .line 125
    .line 126
    int-to-long v0, p1

    .line 127
    invoke-static {v0, v1, p0}, Lf8/i;->K0(JLjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-object v5

    .line 131
    :cond_4
    sget-object p0, Ls/h;->a:Ls/h;

    .line 132
    .line 133
    return-object p0

    .line 134
    :catchall_0
    move-exception p0

    .line 135
    invoke-static {v0, v2, v1}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 136
    .line 137
    .line 138
    throw p0
.end method


# virtual methods
.method public M0(JJI)J
    .locals 5

    .line 1
    iget-object p5, p0, Lm/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p5, Lsh/x;

    .line 4
    .line 5
    iget-object v0, p5, Lsh/x;->a:Lsh/e2;

    .line 6
    .line 7
    iget-object p5, p5, Lsh/x;->d:Lfg/a;

    .line 8
    .line 9
    invoke-interface {p5}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p5

    .line 13
    check-cast p5, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p5

    .line 19
    if-nez p5, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p5, v0, Lsh/e2;->b:Li0/f1;

    .line 23
    .line 24
    invoke-virtual {p5}, Li0/f1;->g()F

    .line 25
    .line 26
    .line 27
    move-result p5

    .line 28
    const-wide v1, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr p1, v1

    .line 34
    long-to-int p1, p1

    .line 35
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    add-float/2addr p2, p5

    .line 40
    iget-object p5, v0, Lsh/e2;->b:Li0/f1;

    .line 41
    .line 42
    invoke-virtual {p5, p2}, Li0/f1;->h(F)V

    .line 43
    .line 44
    .line 45
    and-long p2, p3, v1

    .line 46
    .line 47
    long-to-int p2, p2

    .line 48
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    const/4 p4, 0x0

    .line 53
    cmpg-float p3, p3, p4

    .line 54
    .line 55
    const/16 p5, 0x20

    .line 56
    .line 57
    if-ltz p3, :cond_3

    .line 58
    .line 59
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    cmpg-float p3, p3, p4

    .line 64
    .line 65
    if-gez p3, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    cmpl-float p1, p1, p4

    .line 73
    .line 74
    if-lez p1, :cond_2

    .line 75
    .line 76
    iget-object p1, v0, Lsh/e2;->c:Li0/f1;

    .line 77
    .line 78
    invoke-virtual {p1}, Li0/f1;->g()F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget-object p3, v0, Lsh/e2;->c:Li0/f1;

    .line 83
    .line 84
    invoke-virtual {p3}, Li0/f1;->g()F

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    add-float/2addr p2, p3

    .line 93
    invoke-virtual {v0, p2}, Lsh/e2;->b(F)V

    .line 94
    .line 95
    .line 96
    iget-object p2, v0, Lsh/e2;->c:Li0/f1;

    .line 97
    .line 98
    invoke-virtual {p2}, Li0/f1;->g()F

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    sub-float/2addr p2, p1

    .line 103
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    int-to-long p3, p1

    .line 108
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    int-to-long p1, p1

    .line 113
    shl-long/2addr p3, p5

    .line 114
    and-long/2addr p1, v1

    .line 115
    or-long/2addr p1, p3

    .line 116
    return-wide p1

    .line 117
    :cond_2
    :goto_0
    const-wide/16 p1, 0x0

    .line 118
    .line 119
    return-wide p1

    .line 120
    :cond_3
    :goto_1
    iget-object p2, v0, Lsh/e2;->c:Li0/f1;

    .line 121
    .line 122
    invoke-virtual {p2}, Li0/f1;->g()F

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    iget-object p3, v0, Lsh/e2;->c:Li0/f1;

    .line 127
    .line 128
    invoke-virtual {p3}, Li0/f1;->g()F

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    add-float/2addr p1, p3

    .line 137
    invoke-virtual {v0, p1}, Lsh/e2;->b(F)V

    .line 138
    .line 139
    .line 140
    iget-object p1, v0, Lsh/e2;->c:Li0/f1;

    .line 141
    .line 142
    invoke-virtual {p1}, Li0/f1;->g()F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    sub-float/2addr p1, p2

    .line 147
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    int-to-long p2, p2

    .line 152
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    int-to-long v3, p1

    .line 157
    shl-long p1, p2, p5

    .line 158
    .line 159
    and-long p3, v3, v1

    .line 160
    .line 161
    or-long/2addr p1, p3

    .line 162
    return-wide p1
.end method

.method public a()V
    .locals 2

    .line 1
    const-string v0, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 2
    .line 3
    const-string v1, "ProfileInstaller"

    .line 4
    .line 5
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Ltg/e;Lwf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Ltg/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ltg/a;

    .line 7
    .line 8
    iget v1, v0, Ltg/a;->j:I

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
    iput v1, v0, Ltg/a;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ltg/a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ltg/a;-><init>(Lm/a;Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ltg/a;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ltg/a;->j:I

    .line 28
    .line 29
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Ltg/a;->g:Lug/k;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_0
    move-exception p2

    .line 43
    goto :goto_4

    .line 44
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    return-object p1

    .line 51
    :cond_2
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lug/k;

    .line 55
    .line 56
    invoke-interface {v0}, Lwf/c;->getContext()Lwf/g;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-direct {p2, p1, v1}, Lug/k;-><init>(Ltg/e;Lwf/g;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    iput-object p2, v0, Ltg/a;->g:Lug/k;

    .line 64
    .line 65
    iput v3, v0, Ltg/a;->j:I

    .line 66
    .line 67
    iget-object p1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Lyf/i;

    .line 70
    .line 71
    invoke-interface {p1, p2, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 76
    .line 77
    if-ne p1, v0, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object p1, v2

    .line 81
    :goto_1
    if-ne p1, v0, :cond_4

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_4
    move-object p1, p2

    .line 85
    :goto_2
    invoke-virtual {p1}, Lyf/c;->releaseIntercepted()V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :goto_3
    move-object v4, p2

    .line 90
    move-object p2, p1

    .line 91
    move-object p1, v4

    .line 92
    goto :goto_4

    .line 93
    :catchall_1
    move-exception p1

    .line 94
    goto :goto_3

    .line 95
    :goto_4
    invoke-virtual {p1}, Lyf/c;->releaseIntercepted()V

    .line 96
    .line 97
    .line 98
    throw p2
.end method

.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p2, p0, Lm/a;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public f(Lx1/f0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lx1/f0;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.add called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lx1/a2;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public f0(IJ)J
    .locals 4

    .line 1
    iget-object p1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lsh/x;

    .line 4
    .line 5
    iget-object v0, p1, Lsh/x;->a:Lsh/e2;

    .line 6
    .line 7
    iget-object p1, p1, Lsh/x;->d:Lfg/a;

    .line 8
    .line 9
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    const-wide v1, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v1, p2

    .line 27
    long-to-int p1, v1

    .line 28
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    cmpl-float v1, v1, v2

    .line 34
    .line 35
    if-lez v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v1, v0, Lsh/e2;->c:Li0/f1;

    .line 39
    .line 40
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget-object v3, v0, Lsh/e2;->c:Li0/f1;

    .line 45
    .line 46
    invoke-virtual {v3}, Li0/f1;->g()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    add-float/2addr p1, v3

    .line 55
    invoke-virtual {v0, p1}, Lsh/e2;->b(F)V

    .line 56
    .line 57
    .line 58
    iget-object p1, v0, Lsh/e2;->c:Li0/f1;

    .line 59
    .line 60
    invoke-virtual {p1}, Li0/f1;->g()F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    cmpg-float p1, v1, p1

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const/4 p1, 0x2

    .line 70
    invoke-static {p2, p3, v2, p1}, Le1/b;->a(JFI)J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    return-wide p1

    .line 75
    :cond_2
    :goto_0
    const-wide/16 p1, 0x0

    .line 76
    .line 77
    return-wide p1
.end method

.method public g(ILjava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const/16 v1, 0x2d

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, "dp"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public get()I
    .locals 2

    .line 1
    iget v0, p0, Lm/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lp7/l;

    .line 9
    .line 10
    iget-object v1, v0, Lp7/a;->o:Lr7/f;

    .line 11
    .line 12
    iget v1, v1, Lr7/f;->n:I

    .line 13
    .line 14
    iget-object v0, v0, Lp7/a;->n:Lr7/a;

    .line 15
    .line 16
    iget v0, v0, Lr7/a;->o:I

    .line 17
    .line 18
    sub-int/2addr v1, v0

    .line 19
    div-int/lit8 v1, v1, 0x4

    .line 20
    .line 21
    return v1

    .line 22
    :pswitch_0
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lm7/t;

    .line 25
    .line 26
    iget-object v1, v0, Ll7/a;->m:Lp7/a;

    .line 27
    .line 28
    check-cast v1, Lp7/m;

    .line 29
    .line 30
    iget-object v1, v1, Lp7/a;->n:Lr7/a;

    .line 31
    .line 32
    iget v1, v1, Lr7/a;->o:I

    .line 33
    .line 34
    iget-object v0, v0, Lm7/t;->q:Lr7/a;

    .line 35
    .line 36
    iget v0, v0, Lr7/a;->o:I

    .line 37
    .line 38
    add-int/2addr v1, v0

    .line 39
    return v1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "this"

    .line 2
    .line 3
    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo5/h;

    .line 4
    .line 5
    iget-object v0, v0, Lo5/h;->i:Lac/k;

    .line 6
    .line 7
    iget-object v0, v0, Lac/k;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lk5/z;

    .line 10
    .line 11
    iget-object v0, v0, Lk5/z;->k:Lk5/o;

    .line 12
    .line 13
    invoke-virtual {v0}, Lk5/o;->getType()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public h(Lv7/k;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const/16 v1, 0x2d

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object p1, p1, Lv7/k;->g:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public i(ILjava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const/16 v1, 0x2d

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public j(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt1/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    cmpl-float v1, v1, v2

    .line 14
    .line 15
    if-lez v1, :cond_0

    .line 16
    .line 17
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    cmpl-float v1, v1, v2

    .line 22
    .line 23
    if-lez v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v2, "maximumVelocity should be a positive value. You specified="

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Lu2/q;->g(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iget-object v1, v0, Lt1/b;->a:Lt1/d;

    .line 48
    .line 49
    invoke-static {p1, p2}, Lu2/q;->b(J)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {v1, v2}, Lt1/d;->b(F)F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget-object v0, v0, Lt1/b;->b:Lt1/d;

    .line 58
    .line 59
    invoke-static {p1, p2}, Lu2/q;->c(J)F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {v0, p1}, Lt1/d;->b(F)F

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {v1, p1}, La/a;->d(FF)J

    .line 68
    .line 69
    .line 70
    move-result-wide p1

    .line 71
    return-wide p1
.end method

.method public k(I)V
    .locals 2

    .line 1
    iget v0, p0, Lm/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lp7/l;

    .line 9
    .line 10
    mul-int/lit8 p1, p1, 0x4

    .line 11
    .line 12
    iget-object v1, v0, Lp7/a;->n:Lr7/a;

    .line 13
    .line 14
    iget v1, v1, Lr7/a;->o:I

    .line 15
    .line 16
    add-int/2addr p1, v1

    .line 17
    iget-object v0, v0, Lp7/a;->o:Lr7/f;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lr7/f;->k(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lm7/t;

    .line 26
    .line 27
    iget-object v1, v0, Lm7/t;->q:Lr7/a;

    .line 28
    .line 29
    iget-object v0, v0, Ll7/a;->m:Lp7/a;

    .line 30
    .line 31
    check-cast v0, Lp7/m;

    .line 32
    .line 33
    invoke-virtual {v0}, Lk7/c;->p()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sub-int/2addr p1, v0

    .line 38
    invoke-virtual {v1, p1}, Lr7/a;->k(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public l(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 4

    .line 1
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpa/c;

    .line 4
    .line 5
    iget-boolean v1, v0, Lpa/c;->b:Z

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    iget-object v1, v0, Lpa/c;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Landroid/os/Bundle;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-static {p1, v1}, La7/a;->x(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v3, v2

    .line 29
    :goto_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iput-object v2, v0, Lpa/c;->g:Ljava/lang/Object;

    .line 39
    .line 40
    :cond_2
    return-object v3

    .line 41
    :cond_3
    const-string p1, "You can \'consumeRestoredStateForKey\' only after the corresponding component has moved to the \'CREATED\' state"

    .line 42
    .line 43
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    return-object p1
.end method

.method public loadForRequest(Lokhttp3/HttpUrl;)Ljava/util/List;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 21
    .line 22
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    move-object v2, v1

    .line 42
    check-cast v2, Lokhttp3/Cookie;

    .line 43
    .line 44
    invoke-virtual {v2}, Lokhttp3/Cookie;->expiresAt()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    cmp-long v2, v2, v4

    .line 53
    .line 54
    if-lez v2, :cond_2

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/4 v2, 0x0

    .line 59
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    return-object v0
.end method

.method public m(Ljava/io/File;Lqf/b;)Lnf/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb/e;

    .line 4
    .line 5
    iget-object v1, v0, Lb/e;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, ".apk"

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    sget-object v2, Lnf/d;->j:Lnf/d;

    .line 22
    .line 23
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lqf/b;->c()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Lqf/b;->h()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v3, p2, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x4

    .line 40
    .line 41
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getShort()S

    .line 48
    .line 49
    .line 50
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    const v3, 0xffff

    .line 52
    .line 53
    .line 54
    and-int/2addr v2, v3

    .line 55
    if-ne v2, v3, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    sget-object v2, Lnf/d;->i:Lnf/d;

    .line 59
    .line 60
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    new-instance p2, Lof/b;

    .line 67
    .line 68
    invoke-direct {p2, p1, v0}, Lof/b;-><init>(Ljava/io/File;Lb/e;)V

    .line 69
    .line 70
    .line 71
    return-object p2

    .line 72
    :catch_0
    move-exception v1

    .line 73
    sget-object v2, Lqf/b;->r:Lmh/b;

    .line 74
    .line 75
    const-string v3, "Jadx parser can\'t open zip file: {}"

    .line 76
    .line 77
    iget-object p2, p2, Lqf/b;->g:Ljava/io/File;

    .line 78
    .line 79
    invoke-interface {v2, p2, v3, v1}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    new-instance p2, Lof/b;

    .line 83
    .line 84
    invoke-direct {p2, p1, v0}, Lof/b;-><init>(Ljava/io/File;Lb/e;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    :goto_1
    return-object p2
.end method

.method public m0(JJLyf/c;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    iget-object v1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lsh/x;

    .line 6
    .line 7
    iget-object v2, v1, Lsh/x;->a:Lsh/e2;

    .line 8
    .line 9
    instance-of v3, v0, Lsh/w;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lsh/w;

    .line 15
    .line 16
    iget v4, v3, Lsh/w;->l:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, Lsh/w;->l:I

    .line 26
    .line 27
    :goto_0
    move-object v9, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v3, Lsh/w;

    .line 30
    .line 31
    invoke-direct {v3, p0, v0}, Lsh/w;-><init>(Lm/a;Lyf/c;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v0, v9, Lsh/w;->j:Ljava/lang/Object;

    .line 36
    .line 37
    iget v3, v9, Lsh/w;->l:I

    .line 38
    .line 39
    const/4 v10, 0x2

    .line 40
    const/4 v4, 0x1

    .line 41
    sget-object v11, Lxf/a;->g:Lxf/a;

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    if-eq v3, v4, :cond_2

    .line 46
    .line 47
    if-ne v3, v10, :cond_1

    .line 48
    .line 49
    iget-wide v1, v9, Lsh/w;->i:J

    .line 50
    .line 51
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    return-object v0

    .line 62
    :cond_2
    iget-wide v3, v9, Lsh/w;->h:J

    .line 63
    .line 64
    iget-wide v5, v9, Lsh/w;->g:J

    .line 65
    .line 66
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-static/range {p3 .. p4}, Lu2/q;->c(J)F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    const/4 v3, 0x0

    .line 78
    cmpl-float v0, v0, v3

    .line 79
    .line 80
    if-lez v0, :cond_4

    .line 81
    .line 82
    iget-object v0, v2, Lsh/e2;->b:Li0/f1;

    .line 83
    .line 84
    invoke-virtual {v0, v3}, Li0/f1;->h(F)V

    .line 85
    .line 86
    .line 87
    :cond_4
    iput-wide p1, v9, Lsh/w;->g:J

    .line 88
    .line 89
    move-wide/from16 v7, p3

    .line 90
    .line 91
    iput-wide v7, v9, Lsh/w;->h:J

    .line 92
    .line 93
    iput v4, v9, Lsh/w;->l:I

    .line 94
    .line 95
    move-object v4, p0

    .line 96
    move-wide v5, p1

    .line 97
    invoke-super/range {v4 .. v9}, Lr1/a;->m0(JJLyf/c;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-ne v0, v11, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    move-wide v5, p1

    .line 105
    move-wide/from16 v3, p3

    .line 106
    .line 107
    :goto_2
    check-cast v0, Lu2/q;

    .line 108
    .line 109
    iget-wide v7, v0, Lu2/q;->a:J

    .line 110
    .line 111
    invoke-static {v3, v4}, Lu2/q;->c(J)F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v12, v1, Lsh/x;->c:Li/u;

    .line 116
    .line 117
    iget-object v1, v1, Lsh/x;->b:Li/r0;

    .line 118
    .line 119
    iput-wide v5, v9, Lsh/w;->g:J

    .line 120
    .line 121
    iput-wide v3, v9, Lsh/w;->h:J

    .line 122
    .line 123
    iput-wide v7, v9, Lsh/w;->i:J

    .line 124
    .line 125
    iput v10, v9, Lsh/w;->l:I

    .line 126
    .line 127
    invoke-static {v2, v0, v12, v1, v9}, Lsh/s;->r(Lsh/e2;FLi/u;Li/r0;Lyf/c;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-ne v0, v11, :cond_6

    .line 132
    .line 133
    :goto_3
    return-object v11

    .line 134
    :cond_6
    move-wide v1, v7

    .line 135
    :goto_4
    check-cast v0, Lu2/q;

    .line 136
    .line 137
    iget-wide v3, v0, Lu2/q;->a:J

    .line 138
    .line 139
    invoke-static {v1, v2, v3, v4}, Lu2/q;->e(JJ)J

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    new-instance v2, Lu2/q;

    .line 144
    .line 145
    invoke-direct {v2, v0, v1}, Lu2/q;-><init>(J)V

    .line 146
    .line 147
    .line 148
    return-object v2
.end method

.method public n()Lk7/a;
    .locals 6

    .line 1
    new-instance v0, Lm7/c;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lv7/j0;-><init>(II)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lr7/b;->k:[B

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, -0x1

    .line 14
    invoke-static {v1, v3, v4}, Lk7/a;->D([BII)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    invoke-static {v1, v5, v4}, Lk7/a;->D([BII)V

    .line 19
    .line 20
    .line 21
    const/16 v5, 0x8

    .line 22
    .line 23
    invoke-static {v1, v5, v4}, Lk7/a;->D([BII)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lb/e;

    .line 29
    .line 30
    invoke-virtual {v1}, Lb/e;->get()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0, v1, v3}, Lr7/b;->M(IZ)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lr7/b;->p()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    sub-int/2addr v1, v2

    .line 42
    iget-object v3, v0, Lr7/b;->k:[B

    .line 43
    .line 44
    int-to-short v1, v1

    .line 45
    invoke-static {v3, v2, v1}, Lk7/a;->F([BIS)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public o()Li0/l2;
    .locals 7

    .line 1
    invoke-static {}, Ll3/i;->a()Ll3/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ll3/i;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    new-instance v0, Lq2/k;

    .line 13
    .line 14
    invoke-direct {v0, v2}, Lq2/k;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, Lq2/g;

    .line 25
    .line 26
    invoke-direct {v3, v1, p0}, Lq2/g;-><init>(Li0/j1;Lm/a;)V

    .line 27
    .line 28
    .line 29
    iget-object v4, v0, Ll3/i;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 36
    .line 37
    .line 38
    :try_start_0
    iget v4, v0, Ll3/i;->c:I

    .line 39
    .line 40
    if-eq v4, v2, :cond_2

    .line 41
    .line 42
    iget v2, v0, Ll3/i;->c:I

    .line 43
    .line 44
    const/4 v4, 0x2

    .line 45
    if-ne v2, v4, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v2, v0, Ll3/i;->b:Lf/f;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Lf/f;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception v1

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    :goto_0
    iget-object v2, v0, Ll3/i;->d:Landroid/os/Handler;

    .line 57
    .line 58
    new-instance v4, Ll3/g;

    .line 59
    .line 60
    iget v5, v0, Ll3/i;->c:I

    .line 61
    .line 62
    filled-new-array {v3}, [Lq2/g;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const/4 v6, 0x0

    .line 71
    invoke-direct {v4, v3, v5, v6}, Ll3/g;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    :goto_1
    iget-object v0, v0, Ll3/i;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :goto_2
    iget-object v0, v0, Ll3/i;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 94
    .line 95
    .line 96
    throw v1
.end method

.method public p()Lm/a;
    .locals 7

    .line 1
    sget-object v0, Lv7/b;->h:Lv7/b;

    .line 2
    .line 3
    iget-object v1, p0, Lm/a;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [Lm/a;

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v4, v2, :cond_1

    .line 11
    .line 12
    aget-object v5, v1, v4

    .line 13
    .line 14
    iget-object v6, v5, Lm/a;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v6, Lv7/e0;

    .line 17
    .line 18
    invoke-virtual {v6}, Lv7/e0;->a0()Lv7/b;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    if-ne v6, v0, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v5, 0x0

    .line 29
    :goto_1
    if-nez v5, :cond_2

    .line 30
    .line 31
    aget-object v0, v1, v3

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_2
    return-object v5
.end method

.method public q(Lv4/a;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr4/p;

    .line 4
    .line 5
    iget-object v1, v0, Lr4/p;->i:Lr4/w;

    .line 6
    .line 7
    instance-of v2, p1, Lv4/c0;

    .line 8
    .line 9
    const-string v3, "not found"

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Lr4/p;->f:Lr4/h0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lr4/h0;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/TreeMap;

    .line 21
    .line 22
    check-cast p1, Lv4/c0;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lr4/z;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    goto/16 :goto_1

    .line 33
    .line 34
    :cond_0
    invoke-static {v3}, Lj8/o;->t(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    :cond_1
    instance-of v2, p1, Lv4/d0;

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    iget-object v0, v0, Lr4/p;->g:Lr4/h0;

    .line 44
    .line 45
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 46
    .line 47
    .line 48
    move-object v1, p1

    .line 49
    check-cast v1, Lv4/d0;

    .line 50
    .line 51
    iget-object v1, v1, Lv4/d0;->g:Lw4/c;

    .line 52
    .line 53
    iget-object v0, v0, Lr4/h0;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ljava/util/TreeMap;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lr4/z;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    move-object p1, v0

    .line 66
    goto/16 :goto_1

    .line 67
    .line 68
    :cond_2
    const-string v0, "not found: "

    .line 69
    .line 70
    invoke-static {p1, v0}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    instance-of v2, p1, Lv4/e;

    .line 75
    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    iget-object v0, v0, Lr4/p;->j:Lr4/j0;

    .line 79
    .line 80
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 81
    .line 82
    .line 83
    iget-object v0, v0, Lr4/j0;->f:Ljava/util/TreeMap;

    .line 84
    .line 85
    check-cast p1, Lv4/e;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lr4/z;

    .line 92
    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    goto/16 :goto_1

    .line 96
    .line 97
    :cond_4
    invoke-static {v3}, Lj8/o;->t(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    instance-of v2, p1, Lv4/m;

    .line 102
    .line 103
    if-eqz v2, :cond_7

    .line 104
    .line 105
    invoke-virtual {v1}, Lr4/o0;->f()V

    .line 106
    .line 107
    .line 108
    iget-object v0, v1, Lr4/w;->f:Ljava/util/TreeMap;

    .line 109
    .line 110
    check-cast p1, Lv4/m;

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Lr4/z;

    .line 117
    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    goto/16 :goto_1

    .line 121
    .line 122
    :cond_6
    invoke-static {v3}, Lj8/o;->t(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_7
    instance-of v2, p1, Lv4/l;

    .line 127
    .line 128
    if-eqz v2, :cond_8

    .line 129
    .line 130
    check-cast p1, Lv4/l;

    .line 131
    .line 132
    invoke-virtual {p1}, Lv4/l;->k()Lv4/m;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {v1, p1}, Lr4/w;->m(Lv4/m;)Lr4/v;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    goto :goto_1

    .line 141
    :cond_8
    instance-of v1, p1, Lv4/a0;

    .line 142
    .line 143
    if-eqz v1, :cond_a

    .line 144
    .line 145
    iget-object v0, v0, Lr4/p;->h:Lr4/h0;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 151
    .line 152
    .line 153
    check-cast p1, Lv4/a0;

    .line 154
    .line 155
    iget-object v0, v0, Lr4/h0;->g:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Ljava/util/TreeMap;

    .line 158
    .line 159
    iget-object p1, p1, Lv4/a0;->g:Lw4/a;

    .line 160
    .line 161
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, Lr4/z;

    .line 166
    .line 167
    if-eqz p1, :cond_9

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_9
    invoke-static {v3}, Lj8/o;->t(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_a
    instance-of v1, p1, Lv4/x;

    .line 176
    .line 177
    if-eqz v1, :cond_c

    .line 178
    .line 179
    iget-object v0, v0, Lr4/p;->n:Lr4/h0;

    .line 180
    .line 181
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 182
    .line 183
    .line 184
    iget-object v0, v0, Lr4/h0;->g:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Ljava/util/TreeMap;

    .line 187
    .line 188
    check-cast p1, Lv4/x;

    .line 189
    .line 190
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, Lr4/z;

    .line 195
    .line 196
    if-eqz p1, :cond_b

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_b
    invoke-static {v3}, Lj8/o;->t(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_c
    instance-of v1, p1, Lv4/i;

    .line 205
    .line 206
    if-eqz v1, :cond_e

    .line 207
    .line 208
    iget-object v0, v0, Lr4/p;->m:Lr4/g;

    .line 209
    .line 210
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 211
    .line 212
    .line 213
    iget-object v0, v0, Lr4/g;->g:Ljava/util/TreeMap;

    .line 214
    .line 215
    check-cast p1, Lv4/i;

    .line 216
    .line 217
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    check-cast p1, Lr4/z;

    .line 222
    .line 223
    if-eqz p1, :cond_d

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_d
    invoke-static {v3}, Lj8/o;->t(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_e
    const/4 p1, 0x0

    .line 232
    :goto_1
    if-nez p1, :cond_f

    .line 233
    .line 234
    const/4 p1, -0x1

    .line 235
    return p1

    .line 236
    :cond_f
    invoke-virtual {p1}, Lr4/z;->e()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    return p1
.end method

.method public r(Ljava/io/File;)Lnf/c;
    .locals 4

    .line 1
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb/e;

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Lqf/b;

    .line 6
    .line 7
    invoke-direct {v1, p1, v0}, Lqf/b;-><init>(Ljava/io/File;Lb/e;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v1}, Lm/a;->m(Ljava/io/File;Lqf/b;)Lnf/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v2, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Lqf/b;->close()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v2}, Lnf/b;->d()Lnf/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p1

    .line 27
    :goto_1
    iget-object v2, v0, Lb/e;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Ljava/util/Set;

    .line 30
    .line 31
    sget-object v3, Lnf/d;->j:Lnf/d;

    .line 32
    .line 33
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    new-instance v1, Lof/b;

    .line 40
    .line 41
    invoke-direct {v1, p1, v0}, Lof/b;-><init>(Ljava/io/File;Lb/e;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lof/b;->d()Lnf/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 50
    .line 51
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v2, "Failed to open zip: "

    .line 56
    .line 57
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {v0, p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw v0
.end method

.method public s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr6/c;

    .line 4
    .line 5
    sget-object v1, Lr6/b;->i:Lr6/b;

    .line 6
    .line 7
    iput-object v1, v0, Lr6/c;->b:Lr6/b;

    .line 8
    .line 9
    return-void
.end method

.method public saveFromResponse(Lokhttp3/HttpUrl;Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v1, Log/u;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v1, v2, p2}, Log/u;-><init>(ILjava/util/List;)V

    .line 26
    .line 27
    .line 28
    new-instance p2, Leb/v;

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    invoke-direct {p2, v2, v1}, Leb/v;-><init>(ILfg/p;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public t(Lp4/t;Ly1/t;)Lh0/q0;
    .locals 41

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, Lm/a;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lf/p;

    .line 8
    .line 9
    new-instance v3, Lf/p;

    .line 10
    .line 11
    iget-object v4, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-direct {v3, v5}, Lf/p;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v7, 0x0

    .line 27
    :goto_0
    if-ge v7, v5, :cond_4

    .line 28
    .line 29
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    check-cast v8, Ls1/v;

    .line 34
    .line 35
    iget-wide v9, v8, Ls1/v;->a:J

    .line 36
    .line 37
    iget-object v11, v2, Lf/p;->h:[J

    .line 38
    .line 39
    iget v12, v2, Lf/p;->j:I

    .line 40
    .line 41
    invoke-static {v11, v12, v9, v10}, Lg/a;->b([JIJ)I

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    if-ltz v11, :cond_0

    .line 46
    .line 47
    iget-object v12, v2, Lf/p;->i:[Ljava/lang/Object;

    .line 48
    .line 49
    aget-object v11, v12, v11

    .line 50
    .line 51
    sget-object v12, Lf/q;->a:Ljava/lang/Object;

    .line 52
    .line 53
    if-ne v11, v12, :cond_1

    .line 54
    .line 55
    :cond_0
    const/4 v11, 0x0

    .line 56
    :cond_1
    check-cast v11, Ls1/u;

    .line 57
    .line 58
    if-nez v11, :cond_2

    .line 59
    .line 60
    iget-wide v11, v8, Ls1/v;->b:J

    .line 61
    .line 62
    iget-wide v13, v8, Ls1/v;->d:J

    .line 63
    .line 64
    move/from16 v16, v7

    .line 65
    .line 66
    move-wide/from16 v26, v11

    .line 67
    .line 68
    move-wide/from16 v28, v13

    .line 69
    .line 70
    const/16 v30, 0x0

    .line 71
    .line 72
    move-object/from16 v11, p2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget-wide v12, v11, Ls1/u;->a:J

    .line 76
    .line 77
    iget-boolean v14, v11, Ls1/u;->c:Z

    .line 78
    .line 79
    move/from16 v16, v7

    .line 80
    .line 81
    iget-wide v6, v11, Ls1/u;->b:J

    .line 82
    .line 83
    move-object/from16 v11, p2

    .line 84
    .line 85
    invoke-virtual {v11, v6, v7}, Ly1/t;->J(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v6

    .line 89
    move-wide/from16 v28, v6

    .line 90
    .line 91
    move-wide/from16 v26, v12

    .line 92
    .line 93
    move/from16 v30, v14

    .line 94
    .line 95
    :goto_1
    iget-wide v6, v8, Ls1/v;->a:J

    .line 96
    .line 97
    new-instance v17, Ls1/t;

    .line 98
    .line 99
    iget-wide v12, v8, Ls1/v;->b:J

    .line 100
    .line 101
    move-object v14, v4

    .line 102
    move/from16 v40, v5

    .line 103
    .line 104
    iget-wide v4, v8, Ls1/v;->d:J

    .line 105
    .line 106
    iget-boolean v15, v8, Ls1/v;->e:Z

    .line 107
    .line 108
    iget v1, v8, Ls1/v;->f:F

    .line 109
    .line 110
    move/from16 v25, v1

    .line 111
    .line 112
    iget v1, v8, Ls1/v;->g:I

    .line 113
    .line 114
    move/from16 v31, v1

    .line 115
    .line 116
    iget-object v1, v8, Ls1/v;->i:Ljava/util/ArrayList;

    .line 117
    .line 118
    move-wide/from16 v22, v4

    .line 119
    .line 120
    iget-wide v4, v8, Ls1/v;->j:J

    .line 121
    .line 122
    move-object/from16 v32, v1

    .line 123
    .line 124
    iget v1, v8, Ls1/v;->k:F

    .line 125
    .line 126
    move-wide/from16 v33, v4

    .line 127
    .line 128
    iget-wide v4, v8, Ls1/v;->l:J

    .line 129
    .line 130
    move-wide/from16 v36, v4

    .line 131
    .line 132
    iget-wide v4, v8, Ls1/v;->m:J

    .line 133
    .line 134
    move/from16 v35, v1

    .line 135
    .line 136
    move-wide/from16 v38, v4

    .line 137
    .line 138
    move-wide/from16 v18, v6

    .line 139
    .line 140
    move-wide/from16 v20, v12

    .line 141
    .line 142
    move/from16 v24, v15

    .line 143
    .line 144
    invoke-direct/range {v17 .. v39}, Ls1/t;-><init>(JJJZFJJZILjava/util/ArrayList;JFJJ)V

    .line 145
    .line 146
    .line 147
    move-object/from16 v1, v17

    .line 148
    .line 149
    move-wide/from16 v4, v18

    .line 150
    .line 151
    invoke-virtual {v3, v1, v4, v5}, Lf/p;->b(Ljava/lang/Object;J)V

    .line 152
    .line 153
    .line 154
    iget-boolean v1, v8, Ls1/v;->e:Z

    .line 155
    .line 156
    if-eqz v1, :cond_3

    .line 157
    .line 158
    new-instance v17, Ls1/u;

    .line 159
    .line 160
    iget-wide v4, v8, Ls1/v;->b:J

    .line 161
    .line 162
    iget-wide v6, v8, Ls1/v;->c:J

    .line 163
    .line 164
    move/from16 v22, v1

    .line 165
    .line 166
    move-wide/from16 v18, v4

    .line 167
    .line 168
    move-wide/from16 v20, v6

    .line 169
    .line 170
    invoke-direct/range {v17 .. v22}, Ls1/u;-><init>(JJZ)V

    .line 171
    .line 172
    .line 173
    move-object/from16 v1, v17

    .line 174
    .line 175
    invoke-virtual {v2, v1, v9, v10}, Lf/p;->b(Ljava/lang/Object;J)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_3
    invoke-virtual {v2, v9, v10}, Lf/p;->c(J)V

    .line 180
    .line 181
    .line 182
    :goto_2
    add-int/lit8 v7, v16, 0x1

    .line 183
    .line 184
    move-object/from16 v1, p0

    .line 185
    .line 186
    move-object v4, v14

    .line 187
    move/from16 v5, v40

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_4
    new-instance v1, Lh0/q0;

    .line 192
    .line 193
    invoke-direct {v1, v3, v0}, Lh0/q0;-><init>(Lf/p;Lp4/t;)V

    .line 194
    .line 195
    .line 196
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lm/a;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sparse-switch v0, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :sswitch_0
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lx1/a2;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lm/a;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lv7/e0;

    .line 29
    .line 30
    invoke-virtual {v2}, Lv7/e0;->a0()Lv7/b;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    invoke-virtual {v2}, Lv7/e0;->Z()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v2}, Lv7/j0;->i()Ll7/f;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v4}, Ll7/f;->Y()Ll7/l;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    if-nez v5, :cond_2

    .line 53
    .line 54
    :goto_0
    move-object v3, v1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-virtual {v5, v4, v3}, Ll7/l;->X(Ll7/f;I)Lt7/b;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :goto_1
    if-eqz v3, :cond_3

    .line 61
    .line 62
    invoke-virtual {v3}, Lt7/b;->b()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :cond_3
    :goto_2
    if-nez v1, :cond_4

    .line 67
    .line 68
    invoke-virtual {v2}, Lv7/e0;->Z()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    sget-object v3, Ln7/g;->a:Ljava/util/HashMap;

    .line 73
    .line 74
    const-string v3, "r0x"

    .line 75
    .line 76
    invoke-static {v1, v3}, Ly7/a;->p(ILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, "="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Lv7/j0;->O()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    const/16 v2, 0x8

    .line 93
    .line 94
    invoke-static {v1, v2}, Ly7/a;->k(II)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0

    .line 106
    :sswitch_2
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, [Lm/a;

    .line 109
    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lm/a;->p()Lm/a;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget-object v3, v3, Lm/a;->h:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v3, Lv7/e0;

    .line 122
    .line 123
    const-class v4, Lv7/d;

    .line 124
    .line 125
    invoke-virtual {v3, v4}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Lv7/d;

    .line 130
    .line 131
    if-eqz v3, :cond_8

    .line 132
    .line 133
    iget-object v4, v3, Lv7/d;->k:Lv7/g0;

    .line 134
    .line 135
    if-eqz v4, :cond_5

    .line 136
    .line 137
    iget-object v4, v4, Lv7/g0;->k:Lv7/i0;

    .line 138
    .line 139
    invoke-virtual {v4}, Lv7/i0;->N()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    goto :goto_3

    .line 144
    :cond_5
    const/4 v4, -0x1

    .line 145
    :goto_3
    if-gez v4, :cond_6

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_6
    const-class v5, Ll7/f;

    .line 149
    .line 150
    invoke-virtual {v3, v5}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Ll7/f;

    .line 155
    .line 156
    if-nez v3, :cond_7

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_7
    iget-object v1, v3, Ll7/f;->p:Lu7/b;

    .line 160
    .line 161
    invoke-virtual {v1, v4}, Lu7/c;->V(I)Lr7/s;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, Lr7/q;

    .line 166
    .line 167
    :goto_4
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    :cond_8
    array-length v1, v0

    .line 171
    const-string v3, ", childes="

    .line 172
    .line 173
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const/4 v3, 0x0

    .line 180
    :goto_5
    if-ge v3, v1, :cond_9

    .line 181
    .line 182
    aget-object v4, v0, v3

    .line 183
    .line 184
    const-string v5, "\n    ["

    .line 185
    .line 186
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    add-int/lit8 v3, v3, 0x1

    .line 190
    .line 191
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v5, "]  "

    .line 195
    .line 196
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Lm/a;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_9
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    :sswitch_3
    invoke-virtual {p0}, Lm/a;->get()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    return-object v0

    .line 221
    :sswitch_4
    invoke-virtual {p0}, Lm/a;->get()I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    return-object v0

    .line 230
    nop

    .line 231
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_4
        0xb -> :sswitch_3
        0x19 -> :sswitch_2
        0x1a -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Lx1/f0;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lx1/f0;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.remove called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lx1/a2;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

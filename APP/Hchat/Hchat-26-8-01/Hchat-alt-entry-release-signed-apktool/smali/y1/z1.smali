.class public final Ly1/z1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ly0/p;


# instance fields
.field public final g:Landroid/content/Context;

.field public h:Lvg/c;

.field public final i:Li0/f1;

.field public j:Lqg/e1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/z1;->g:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Li0/f1;

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    invoke-direct {p1, v0}, Li0/f1;-><init>(F)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ly1/z1;->i:Li0/f1;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final e(Lwf/g;)Lwf/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf8/i;->q0(Lwf/e;Lwf/g;)Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final i()F
    .locals 10

    .line 1
    iget-object v0, p0, Ly1/z1;->j:Lqg/e1;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v6, p0, Ly1/z1;->g:Landroid/content/Context;

    .line 6
    .line 7
    sget-object v8, Ly1/v2;->a:Lf/k0;

    .line 8
    .line 9
    monitor-enter v8

    .line 10
    :try_start_0
    invoke-virtual {v8, v6}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v9, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v0, "animator_duration_scale"

    .line 22
    .line 23
    invoke-static {v0}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v0, -0x1

    .line 28
    const/4 v1, 0x6

    .line 29
    invoke-static {v0, v1, v9}, Lsg/j;->a(IILsg/a;)Lsg/c;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, La/a;->C(Landroid/os/Looper;)Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v4, Ly1/u2;

    .line 42
    .line 43
    invoke-direct {v4, v5, v0}, Ly1/u2;-><init>(Lsg/c;Landroid/os/Handler;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lwb/on;

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    invoke-direct/range {v1 .. v7}, Lwb/on;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Ly1/u2;Lsg/c;Landroid/content/Context;Lwf/c;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lm/a;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Lm/a;-><init>(Lfg/p;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Lvg/c;

    .line 58
    .line 59
    new-instance v2, Lqg/g1;

    .line 60
    .line 61
    invoke-direct {v2, v9}, Lqg/t0;-><init>(Lqg/r0;)V

    .line 62
    .line 63
    .line 64
    sget-object v3, Lqg/c0;->a:Lxg/e;

    .line 65
    .line 66
    sget-object v3, Lvg/m;->a:Lrg/e;

    .line 67
    .line 68
    invoke-static {v2, v3}, Lf8/i;->q0(Lwf/e;Lwf/g;)Lwf/g;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-direct {v1, v2}, Lvg/c;-><init>(Lwf/g;)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Ltg/y;

    .line 76
    .line 77
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const-string v4, "animator_duration_scale"

    .line 85
    .line 86
    const/high16 v5, 0x3f800000    # 1.0f

    .line 87
    .line 88
    invoke-static {v3, v4, v5}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v0, v1, v2, v3}, Ltg/s;->h(Lm/a;Lvg/c;Ltg/y;Ljava/lang/Float;)Ltg/o;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v8, v6, v0}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_1

    .line 106
    :cond_0
    :goto_0
    check-cast v0, Ltg/z;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    monitor-exit v8

    .line 109
    invoke-interface {v0}, Ltg/z;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ljava/lang/Number;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    iget-object v2, p0, Ly1/z1;->i:Li0/f1;

    .line 120
    .line 121
    invoke-virtual {v2, v1}, Li0/f1;->h(F)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Ly1/z1;->h:Lvg/c;

    .line 125
    .line 126
    if-eqz v1, :cond_1

    .line 127
    .line 128
    new-instance v2, Lci/j;

    .line 129
    .line 130
    const/16 v3, 0x1b

    .line 131
    .line 132
    invoke-direct {v2, v0, p0, v9, v3}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x3

    .line 136
    invoke-static {v1, v9, v2, v0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iput-object v0, p0, Ly1/z1;->j:Lqg/e1;

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_1
    const-string v0, "MotionDurationScale scale factor requested before recomposer loop start"

    .line 144
    .line 145
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const/4 v0, 0x0

    .line 149
    return v0

    .line 150
    :goto_1
    monitor-exit v8

    .line 151
    throw v0

    .line 152
    :cond_2
    :goto_2
    iget-object v0, p0, Ly1/z1;->i:Li0/f1;

    .line 153
    .line 154
    invoke-virtual {v0}, Li0/f1;->g()F

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    return v0
.end method

.method public final k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final s(Lwf/f;)Lwf/e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf8/i;->w(Lwf/e;Lwf/f;)Lwf/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final t(Lwf/f;)Lwf/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf8/i;->l0(Lwf/e;Lwf/f;)Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

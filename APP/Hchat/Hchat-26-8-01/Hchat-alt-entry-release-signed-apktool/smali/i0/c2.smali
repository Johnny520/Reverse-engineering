.class public final Li0/c2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqg/t;
.implements Li0/a2;


# static fields
.field public static final j:Li0/g;


# instance fields
.field public final g:Lwf/g;

.field public final h:Li0/c2;

.field public volatile i:Lwf/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Li0/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li0/c2;->j:Li0/g;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lwf/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/c2;->g:Lwf/g;

    .line 5
    .line 6
    iput-object p0, p0, Li0/c2;->h:Li0/c2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Li0/c2;->h:Li0/c2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Li0/c2;->i:Lwf/g;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Li0/c2;->j:Li0/g;

    .line 9
    .line 10
    iput-object v1, p0, Li0/c2;->i:Lwf/g;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    new-instance v2, Li0/c0;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3}, Li0/c0;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sget-object v3, Lqg/q;->h:Lqg/q;

    .line 22
    .line 23
    invoke-interface {v1, v3}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lqg/r0;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v1, v2}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw v1
.end method

.method public final d()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li0/c2;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li0/c2;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n()Lwf/g;
    .locals 6

    .line 1
    iget-object v0, p0, Li0/c2;->i:Lwf/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Li0/c2;->j:Li0/g;

    .line 6
    .line 7
    if-ne v0, v1, :cond_4

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Li0/c2;->g:Lwf/g;

    .line 10
    .line 11
    sget-object v1, Lx0/d;->h:Luf/d;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lx0/d;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v1, Li0/b2;

    .line 22
    .line 23
    invoke-direct {v1, v0, p0}, Li0/b2;-><init>(Lx0/d;Li0/c2;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object v1, Lwf/h;->g:Lwf/h;

    .line 28
    .line 29
    :goto_0
    iget-object v0, p0, Li0/c2;->h:Li0/c2;

    .line 30
    .line 31
    monitor-enter v0

    .line 32
    :try_start_0
    iget-object v2, p0, Li0/c2;->i:Lwf/g;

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    iget-object v2, p0, Li0/c2;->g:Lwf/g;

    .line 37
    .line 38
    sget-object v3, Lqg/q;->h:Lqg/q;

    .line 39
    .line 40
    invoke-interface {v2, v3}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lqg/r0;

    .line 45
    .line 46
    new-instance v4, Lqg/t0;

    .line 47
    .line 48
    invoke-direct {v4, v3}, Lqg/t0;-><init>(Lqg/r0;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2, v4}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v3, Lwf/h;->g:Lwf/h;

    .line 56
    .line 57
    invoke-interface {v2, v3}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {v2, v1}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception v1

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    sget-object v3, Li0/c2;->j:Li0/g;

    .line 69
    .line 70
    if-ne v2, v3, :cond_3

    .line 71
    .line 72
    iget-object v2, p0, Li0/c2;->g:Lwf/g;

    .line 73
    .line 74
    sget-object v3, Lqg/q;->h:Lqg/q;

    .line 75
    .line 76
    invoke-interface {v2, v3}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lqg/r0;

    .line 81
    .line 82
    new-instance v4, Lqg/t0;

    .line 83
    .line 84
    invoke-direct {v4, v3}, Lqg/t0;-><init>(Lqg/r0;)V

    .line 85
    .line 86
    .line 87
    new-instance v3, Li0/c0;

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    invoke-direct {v3, v5}, Li0/c0;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v3}, Lqg/y0;->v(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    invoke-interface {v2, v4}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    sget-object v3, Lwf/h;->g:Lwf/h;

    .line 101
    .line 102
    invoke-interface {v2, v3}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {v2, v1}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    goto :goto_1

    .line 111
    :cond_3
    move-object v1, v2

    .line 112
    :goto_1
    iput-object v1, p0, Li0/c2;->i:Lwf/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    monitor-exit v0

    .line 115
    move-object v0, v1

    .line 116
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    :goto_2
    monitor-exit v0

    .line 121
    throw v1
.end method

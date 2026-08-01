.class public final Lnr;
.super Ls91;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final synthetic G:Lor;


# direct methods
.method public constructor <init>(Lor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnr;->G:Lor;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnr;->G:Lor;

    .line 2
    .line 3
    iget-object p0, p0, Lor;->a:Lrr;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lrr;->d(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final I(Ly2;)V
    .locals 7

    .line 1
    iget-object p0, p0, Lnr;->G:Lor;

    .line 2
    .line 3
    iput-object p1, p0, Lor;->c:Ly2;

    .line 4
    .line 5
    new-instance v0, Lo8;

    .line 6
    .line 7
    iget-object p1, p0, Lor;->c:Ly2;

    .line 8
    .line 9
    iget-object v1, p0, Lor;->a:Lrr;

    .line 10
    .line 11
    iget-object v2, v1, Lrr;->g:Lr3;

    .line 12
    .line 13
    iget-object v1, v1, Lrr;->i:Lxl;

    .line 14
    .line 15
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v4, 0x22

    .line 18
    .line 19
    if-lt v3, v4, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lxr;->a()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Lpf1;->x()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :goto_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, v0, Lo8;->a:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p1, v0, Lo8;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v1, v0, Lo8;->c:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, [I

    .line 61
    .line 62
    move-object v2, v1

    .line 63
    new-instance v1, Ljava/lang/String;

    .line 64
    .line 65
    array-length v3, v2

    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-direct {v1, v2, v4, v3}, Ljava/lang/String;-><init>([III)V

    .line 68
    .line 69
    .line 70
    new-instance v6, Lzr;

    .line 71
    .line 72
    invoke-direct {v6, v1, v4}, Lzr;-><init>(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    const/4 v4, 0x1

    .line 80
    const/4 v5, 0x1

    .line 81
    const/4 v2, 0x0

    .line 82
    invoke-virtual/range {v0 .. v6}, Lo8;->l(Ljava/lang/CharSequence;IIIZLyr;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    :goto_2
    iput-object v0, p0, Lor;->b:Lo8;

    .line 87
    .line 88
    iget-object p0, p0, Lor;->a:Lrr;

    .line 89
    .line 90
    new-instance p1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lrr;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 102
    .line 103
    .line 104
    const/4 v0, 0x1

    .line 105
    :try_start_0
    iput v0, p0, Lrr;->c:I

    .line 106
    .line 107
    iget-object v0, p0, Lrr;->b:Le9;

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lrr;->b:Le9;

    .line 113
    .line 114
    invoke-virtual {v0}, Le9;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lrr;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lrr;->d:Landroid/os/Handler;

    .line 127
    .line 128
    new-instance v1, Lpr;

    .line 129
    .line 130
    iget p0, p0, Lrr;->c:I

    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-direct {v1, p1, p0, v2}, Lpr;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    move-object p1, v0

    .line 142
    iget-object p0, p0, Lrr;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 143
    .line 144
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 149
    .line 150
    .line 151
    throw p1
.end method

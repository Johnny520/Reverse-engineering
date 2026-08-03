.class public final Ll3/e;
.super La7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic b:Ll3/f;


# direct methods
.method public constructor <init>(Ll3/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll3/e;->b:Ll3/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final D(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/e;->b:Ll3/f;

    .line 2
    .line 3
    iget-object v0, v0, Ll3/f;->a:Ll3/i;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ll3/i;->f(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final E(Lhb/c;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ll3/e;->b:Ll3/f;

    .line 2
    .line 3
    iput-object p1, v0, Ll3/f;->c:Lhb/c;

    .line 4
    .line 5
    new-instance v1, Lb5/c;

    .line 6
    .line 7
    iget-object p1, v0, Ll3/f;->c:Lhb/c;

    .line 8
    .line 9
    iget-object v2, v0, Ll3/f;->a:Ll3/i;

    .line 10
    .line 11
    iget-object v3, v2, Ll3/i;->g:La2/a;

    .line 12
    .line 13
    iget-object v2, v2, Ll3/i;->i:Ll3/d;

    .line 14
    .line 15
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v5, 0x22

    .line 18
    .line 19
    if-lt v4, v5, :cond_0

    .line 20
    .line 21
    invoke-static {}, Ll3/n;->a()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Lac/p;->v()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    :goto_0
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v3, v1, Lb5/c;->a:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p1, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v2, v1, Lb5/c;->c:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

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
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

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
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, [I

    .line 61
    .line 62
    move-object v3, v2

    .line 63
    new-instance v2, Ljava/lang/String;

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    array-length v5, v3

    .line 67
    invoke-direct {v2, v3, v4, v5}, Ljava/lang/String;-><init>([III)V

    .line 68
    .line 69
    .line 70
    new-instance v7, Ll3/q;

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-direct {v7, v2, v3}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const/4 v5, 0x1

    .line 81
    const/4 v6, 0x1

    .line 82
    invoke-virtual/range {v1 .. v7}, Lb5/c;->G(Ljava/lang/CharSequence;IIIZLl3/o;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    :goto_2
    iput-object v1, v0, Ll3/f;->b:Lb5/c;

    .line 87
    .line 88
    iget-object p1, v0, Ll3/f;->a:Ll3/i;

    .line 89
    .line 90
    new-instance v0, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    iget-object v1, p1, Ll3/i;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 102
    .line 103
    .line 104
    const/4 v1, 0x1

    .line 105
    :try_start_0
    iput v1, p1, Ll3/i;->c:I

    .line 106
    .line 107
    iget-object v1, p1, Ll3/i;->b:Lf/f;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 110
    .line 111
    .line 112
    iget-object v1, p1, Ll3/i;->b:Lf/f;

    .line 113
    .line 114
    invoke-virtual {v1}, Lf/f;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    .line 117
    iget-object v1, p1, Ll3/i;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 124
    .line 125
    .line 126
    iget-object v1, p1, Ll3/i;->d:Landroid/os/Handler;

    .line 127
    .line 128
    new-instance v2, Ll3/g;

    .line 129
    .line 130
    iget p1, p1, Ll3/i;->c:I

    .line 131
    .line 132
    const/4 v3, 0x0

    .line 133
    invoke-direct {v2, v0, p1, v3}, Ll3/g;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    iget-object p1, p1, Ll3/i;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 148
    .line 149
    .line 150
    throw v0
.end method

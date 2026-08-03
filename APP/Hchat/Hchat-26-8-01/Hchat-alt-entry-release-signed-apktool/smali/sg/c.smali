.class public Lsg/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lsg/g;


# static fields
.field public static final synthetic h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic k:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _closeCause$volatile:Ljava/lang/Object;

.field private volatile synthetic bufferEnd$volatile:J

.field private volatile synthetic bufferEndSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic closeHandler$volatile:Ljava/lang/Object;

.field private volatile synthetic completedExpandBuffersAndPauseFlag$volatile:J

.field public final g:I

.field private volatile synthetic receiveSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic receivers$volatile:J

.field private volatile synthetic sendSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic sendersAndCloseStatus$volatile:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "sendersAndCloseStatus$volatile"

    .line 2
    .line 3
    const-class v1, Lsg/c;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    const-string v0, "receivers$volatile"

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 18
    .line 19
    const-string v0, "bufferEnd$volatile"

    .line 20
    .line 21
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lsg/c;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 26
    .line 27
    const-string v0, "completedExpandBuffersAndPauseFlag$volatile"

    .line 28
    .line 29
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lsg/c;->k:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 34
    .line 35
    const-string v0, "sendSegment$volatile"

    .line 36
    .line 37
    const-class v2, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lsg/c;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 44
    .line 45
    const-string v0, "receiveSegment$volatile"

    .line 46
    .line 47
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lsg/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 52
    .line 53
    const-string v0, "bufferEndSegment$volatile"

    .line 54
    .line 55
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lsg/c;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 60
    .line 61
    const-string v0, "_closeCause$volatile"

    .line 62
    .line 63
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lsg/c;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 68
    .line 69
    const-string v0, "closeHandler$volatile"

    .line 70
    .line 71
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lsg/c;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>(I)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lsg/c;->g:I

    .line 5
    .line 6
    if-ltz p1, :cond_3

    .line 7
    .line 8
    sget-object v0, Lsg/e;->a:Lsg/k;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const v0, 0x7fffffff

    .line 13
    .line 14
    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    int-to-long v0, p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    :goto_0
    iput-wide v0, p0, Lsg/c;->bufferEnd$volatile:J

    .line 28
    .line 29
    sget-object p1, Lsg/c;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    iput-wide v0, p0, Lsg/c;->completedExpandBuffersAndPauseFlag$volatile:J

    .line 36
    .line 37
    new-instance v2, Lsg/k;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v7, 0x3

    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    move-object v6, p0

    .line 44
    invoke-direct/range {v2 .. v7}, Lsg/k;-><init>(JLsg/k;Lsg/c;I)V

    .line 45
    .line 46
    .line 47
    iput-object v2, v6, Lsg/c;->sendSegment$volatile:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v2, v6, Lsg/c;->receiveSegment$volatile:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {p0}, Lsg/c;->w()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    sget-object v2, Lsg/e;->a:Lsg/k;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    :cond_2
    iput-object v2, v6, Lsg/c;->bufferEndSegment$volatile:Ljava/lang/Object;

    .line 63
    .line 64
    sget-object p1, Lsg/e;->s:Ll3/q;

    .line 65
    .line 66
    iput-object p1, v6, Lsg/c;->_closeCause$volatile:Ljava/lang/Object;

    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    move-object v6, p0

    .line 70
    const-string v0, "Invalid channel capacity: "

    .line 71
    .line 72
    const-string v1, ", should be >=0"

    .line 73
    .line 74
    invoke-static {p1, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    throw p1
.end method

.method public static B(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p0, Lqg/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p0, Lqg/f;

    .line 7
    .line 8
    sget-object v0, Lsg/e;->a:Lsg/k;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-interface {p0, v2, v0}, Lqg/f;->j(Ljava/lang/Object;Lfg/q;)Ll3/q;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, v0}, Lqg/f;->A(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    return v1

    .line 25
    :cond_1
    const-string v0, "Unexpected waiter: "

    .line 26
    .line 27
    invoke-static {p0, v0}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return v1
.end method

.method public static final b(Lsg/c;JLsg/k;)Lsg/k;
    .locals 11

    .line 1
    sget-object v0, Lsg/e;->a:Lsg/k;

    .line 2
    .line 3
    sget-object v0, Lsg/d;->n:Lsg/d;

    .line 4
    .line 5
    :goto_0
    invoke-static {p3, p1, p2, v0}, Lvg/a;->b(Lvg/q;JLfg/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lvg/a;->e(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_4

    .line 14
    .line 15
    invoke-static {v1}, Lvg/a;->c(Ljava/lang/Object;)Lvg/q;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_1
    sget-object v3, Lsg/c;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Lvg/q;

    .line 26
    .line 27
    iget-wide v5, v4, Lvg/q;->c:J

    .line 28
    .line 29
    iget-wide v7, v2, Lvg/q;->c:J

    .line 30
    .line 31
    cmp-long v5, v5, v7

    .line 32
    .line 33
    if-ltz v5, :cond_1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    invoke-virtual {v2}, Lvg/q;->i()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {v3, p0, v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    invoke-virtual {v4}, Lvg/q;->e()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {v4}, Lvg/b;->d()V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    if-eq v5, v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v2}, Lvg/q;->e()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    invoke-virtual {v2}, Lvg/b;->d()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    :goto_2
    invoke-static {v1}, Lvg/a;->e(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v2, 0x0

    .line 80
    sget-object v3, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0}, Lsg/c;->u()Z

    .line 85
    .line 86
    .line 87
    iget-wide p1, p3, Lvg/q;->c:J

    .line 88
    .line 89
    sget v0, Lsg/e;->b:I

    .line 90
    .line 91
    int-to-long v0, v0

    .line 92
    mul-long/2addr p1, v0

    .line 93
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    cmp-long p0, p1, v0

    .line 98
    .line 99
    if-gez p0, :cond_7

    .line 100
    .line 101
    invoke-virtual {p3}, Lvg/b;->a()V

    .line 102
    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_5
    invoke-static {v1}, Lvg/a;->c(Ljava/lang/Object;)Lvg/q;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    check-cast p3, Lsg/k;

    .line 110
    .line 111
    iget-wide v0, p3, Lvg/q;->c:J

    .line 112
    .line 113
    cmp-long p1, v0, p1

    .line 114
    .line 115
    if-lez p1, :cond_9

    .line 116
    .line 117
    sget p1, Lsg/e;->b:I

    .line 118
    .line 119
    int-to-long p1, p1

    .line 120
    mul-long/2addr p1, v0

    .line 121
    :goto_3
    sget-object v4, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 122
    .line 123
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 124
    .line 125
    .line 126
    move-result-wide v7

    .line 127
    const-wide v4, 0xfffffffffffffffL

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    and-long/2addr v4, v7

    .line 133
    cmp-long v6, v4, p1

    .line 134
    .line 135
    if-ltz v6, :cond_6

    .line 136
    .line 137
    move-object v6, p0

    .line 138
    goto :goto_4

    .line 139
    :cond_6
    const/16 v6, 0x3c

    .line 140
    .line 141
    shr-long v9, v7, v6

    .line 142
    .line 143
    long-to-int v9, v9

    .line 144
    int-to-long v9, v9

    .line 145
    shl-long/2addr v9, v6

    .line 146
    add-long/2addr v9, v4

    .line 147
    sget-object v5, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 148
    .line 149
    move-object v6, p0

    .line 150
    invoke-virtual/range {v5 .. v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-eqz p0, :cond_8

    .line 155
    .line 156
    :goto_4
    sget p0, Lsg/e;->b:I

    .line 157
    .line 158
    int-to-long p0, p0

    .line 159
    mul-long/2addr v0, p0

    .line 160
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 161
    .line 162
    .line 163
    move-result-wide p0

    .line 164
    cmp-long p0, v0, p0

    .line 165
    .line 166
    if-gez p0, :cond_7

    .line 167
    .line 168
    invoke-virtual {p3}, Lvg/b;->a()V

    .line 169
    .line 170
    .line 171
    :cond_7
    return-object v2

    .line 172
    :cond_8
    move-object p0, v6

    .line 173
    goto :goto_3

    .line 174
    :cond_9
    return-object p3
.end method

.method public static final c(Lsg/c;Ljava/lang/Object;Lqg/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsg/c;->o()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance p1, Lsf/f;

    .line 6
    .line 7
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p1}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final e(Lsg/c;Lsg/k;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 4

    .line 1
    invoke-virtual {p1, p2, p3}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    invoke-virtual/range {p0 .. p7}, Lsg/c;->D(Lsg/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p1, p2}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0, p4, p5}, Lsg/c;->g(J)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Lsg/e;->d:Ll3/q;

    .line 26
    .line 27
    invoke-virtual {p1, v2, p2, v0}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_6

    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    if-nez p6, :cond_2

    .line 35
    .line 36
    const/4 p0, 0x3

    .line 37
    return p0

    .line 38
    :cond_2
    invoke-virtual {p1, v2, p2, p6}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_6

    .line 43
    .line 44
    const/4 p0, 0x2

    .line 45
    return p0

    .line 46
    :cond_3
    instance-of v3, v0, Lqg/o1;

    .line 47
    .line 48
    if-eqz v3, :cond_6

    .line 49
    .line 50
    invoke-virtual {p1, p2, v2}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0, p3}, Lsg/c;->A(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_4

    .line 58
    .line 59
    sget-object p0, Lsg/e;->i:Ll3/q;

    .line 60
    .line 61
    invoke-virtual {p1, p2, p0}, Lsg/k;->n(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_4
    sget-object p0, Lsg/e;->k:Ll3/q;

    .line 67
    .line 68
    iget-object p3, p1, Lsg/k;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 69
    .line 70
    mul-int/lit8 p4, p2, 0x2

    .line 71
    .line 72
    add-int/2addr p4, v1

    .line 73
    invoke-virtual {p3, p4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    if-eq p3, p0, :cond_5

    .line 78
    .line 79
    invoke-virtual {p1, p2, v1}, Lsg/k;->l(IZ)V

    .line 80
    .line 81
    .line 82
    :cond_5
    const/4 p0, 0x5

    .line 83
    return p0

    .line 84
    :cond_6
    invoke-virtual/range {p0 .. p7}, Lsg/c;->D(Lsg/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0
.end method

.method public static s(Lsg/c;)V
    .locals 7

    .line 1
    sget-object v0, Lsg/c;->k:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 10
    .line 11
    and-long/2addr v1, v3

    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    cmp-long v1, v1, v5

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    and-long/2addr v1, v3

    .line 23
    cmp-long v1, v1, v5

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lsg/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lsg/b;

    .line 9
    .line 10
    iget-object v0, p1, Lsg/b;->h:Lqg/g;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object v3, p1, Lsg/b;->h:Lqg/g;

    .line 16
    .line 17
    iput-object p2, p1, Lsg/b;->g:Ljava/lang/Object;

    .line 18
    .line 19
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    iget-object p1, p1, Lsg/b;->i:Lsg/c;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object p1, Lsg/e;->a:Lsg/k;

    .line 27
    .line 28
    invoke-virtual {v0, p2, v3}, Lqg/g;->j(Ljava/lang/Object;Lfg/q;)Ll3/q;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lqg/g;->A(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return v2

    .line 38
    :cond_0
    return v1

    .line 39
    :cond_1
    instance-of v0, p1, Lqg/f;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    check-cast p1, Lqg/f;

    .line 44
    .line 45
    sget-object v0, Lsg/e;->a:Lsg/k;

    .line 46
    .line 47
    invoke-interface {p1, p2, v3}, Lqg/f;->j(Ljava/lang/Object;Lfg/q;)Ll3/q;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    if-eqz p2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1, p2}, Lqg/f;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return v2

    .line 57
    :cond_2
    return v1

    .line 58
    :cond_3
    const-string p2, "Unexpected receiver type: "

    .line 59
    .line 60
    invoke-static {p1, p2}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return v1
.end method

.method public final C(Lsg/k;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p1, Lsg/k;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const-wide v3, 0xfffffffffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    sget-object v5, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v6

    .line 21
    and-long/2addr v6, v3

    .line 22
    cmp-long v6, p3, v6

    .line 23
    .line 24
    if-ltz v6, :cond_2

    .line 25
    .line 26
    if-nez p5, :cond_0

    .line 27
    .line 28
    sget-object p1, Lsg/e;->n:Ll3/q;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    invoke-virtual {p1, v1, p2, p5}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lsg/c;->k()V

    .line 38
    .line 39
    .line 40
    sget-object p1, Lsg/e;->m:Ll3/q;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    sget-object v6, Lsg/e;->d:Ll3/q;

    .line 44
    .line 45
    if-ne v1, v6, :cond_2

    .line 46
    .line 47
    sget-object v6, Lsg/e;->i:Ll3/q;

    .line 48
    .line 49
    invoke-virtual {p1, v1, p2, v6}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0}, Lsg/c;->k()V

    .line 56
    .line 57
    .line 58
    mul-int/lit8 p3, p2, 0x2

    .line 59
    .line 60
    invoke-virtual {v0, p3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-virtual {p1, p2, v2}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object p3

    .line 68
    :cond_2
    invoke-virtual {p1, p2}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_b

    .line 73
    .line 74
    sget-object v6, Lsg/e;->e:Ll3/q;

    .line 75
    .line 76
    if-ne v1, v6, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    sget-object v6, Lsg/e;->d:Ll3/q;

    .line 80
    .line 81
    if-ne v1, v6, :cond_4

    .line 82
    .line 83
    sget-object v6, Lsg/e;->i:Ll3/q;

    .line 84
    .line 85
    invoke-virtual {p1, v1, p2, v6}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_2

    .line 90
    .line 91
    invoke-virtual {p0}, Lsg/c;->k()V

    .line 92
    .line 93
    .line 94
    mul-int/lit8 p3, p2, 0x2

    .line 95
    .line 96
    invoke-virtual {v0, p3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    invoke-virtual {p1, p2, v2}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-object p3

    .line 104
    :cond_4
    sget-object v6, Lsg/e;->j:Ll3/q;

    .line 105
    .line 106
    if-ne v1, v6, :cond_5

    .line 107
    .line 108
    sget-object p1, Lsg/e;->o:Ll3/q;

    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_5
    sget-object v7, Lsg/e;->h:Ll3/q;

    .line 112
    .line 113
    if-ne v1, v7, :cond_6

    .line 114
    .line 115
    sget-object p1, Lsg/e;->o:Ll3/q;

    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_6
    sget-object v7, Lsg/e;->l:Ll3/q;

    .line 119
    .line 120
    if-ne v1, v7, :cond_7

    .line 121
    .line 122
    invoke-virtual {p0}, Lsg/c;->k()V

    .line 123
    .line 124
    .line 125
    sget-object p1, Lsg/e;->o:Ll3/q;

    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_7
    sget-object v7, Lsg/e;->g:Ll3/q;

    .line 129
    .line 130
    if-eq v1, v7, :cond_2

    .line 131
    .line 132
    sget-object v7, Lsg/e;->f:Ll3/q;

    .line 133
    .line 134
    invoke-virtual {p1, v1, p2, v7}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-eqz v7, :cond_2

    .line 139
    .line 140
    instance-of p3, v1, Lsg/q;

    .line 141
    .line 142
    if-eqz p3, :cond_8

    .line 143
    .line 144
    check-cast v1, Lsg/q;

    .line 145
    .line 146
    iget-object v1, v1, Lsg/q;->a:Lqg/o1;

    .line 147
    .line 148
    :cond_8
    invoke-static {v1}, Lsg/c;->B(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p4

    .line 152
    if-eqz p4, :cond_9

    .line 153
    .line 154
    sget-object p3, Lsg/e;->i:Ll3/q;

    .line 155
    .line 156
    invoke-virtual {p1, p2, p3}, Lsg/k;->n(ILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lsg/c;->k()V

    .line 160
    .line 161
    .line 162
    mul-int/lit8 p3, p2, 0x2

    .line 163
    .line 164
    invoke-virtual {v0, p3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p3

    .line 168
    invoke-virtual {p1, p2, v2}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    return-object p3

    .line 172
    :cond_9
    invoke-virtual {p1, p2, v6}, Lsg/k;->n(ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Lvg/q;->h()V

    .line 176
    .line 177
    .line 178
    if-eqz p3, :cond_a

    .line 179
    .line 180
    invoke-virtual {p0}, Lsg/c;->k()V

    .line 181
    .line 182
    .line 183
    :cond_a
    sget-object p1, Lsg/e;->o:Ll3/q;

    .line 184
    .line 185
    return-object p1

    .line 186
    :cond_b
    :goto_0
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 187
    .line 188
    .line 189
    move-result-wide v6

    .line 190
    and-long/2addr v6, v3

    .line 191
    cmp-long v6, p3, v6

    .line 192
    .line 193
    if-gez v6, :cond_c

    .line 194
    .line 195
    sget-object v6, Lsg/e;->h:Ll3/q;

    .line 196
    .line 197
    invoke-virtual {p1, v1, p2, v6}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_2

    .line 202
    .line 203
    invoke-virtual {p0}, Lsg/c;->k()V

    .line 204
    .line 205
    .line 206
    sget-object p1, Lsg/e;->o:Ll3/q;

    .line 207
    .line 208
    return-object p1

    .line 209
    :cond_c
    if-nez p5, :cond_d

    .line 210
    .line 211
    sget-object p1, Lsg/e;->n:Ll3/q;

    .line 212
    .line 213
    return-object p1

    .line 214
    :cond_d
    invoke-virtual {p1, v1, p2, p5}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_2

    .line 219
    .line 220
    invoke-virtual {p0}, Lsg/c;->k()V

    .line 221
    .line 222
    .line 223
    sget-object p1, Lsg/e;->m:Ll3/q;

    .line 224
    .line 225
    return-object p1
.end method

.method public final D(Lsg/k;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 5

    .line 1
    :cond_0
    invoke-virtual {p1, p2}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x4

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0, p4, p5}, Lsg/c;->g(J)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-nez p7, :cond_1

    .line 17
    .line 18
    sget-object v0, Lsg/e;->d:Ll3/q;

    .line 19
    .line 20
    invoke-virtual {p1, v3, p2, v0}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    if-eqz p7, :cond_2

    .line 28
    .line 29
    sget-object v0, Lsg/e;->j:Ll3/q;

    .line 30
    .line 31
    invoke-virtual {p1, v3, p2, v0}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Lvg/q;->h()V

    .line 38
    .line 39
    .line 40
    return v1

    .line 41
    :cond_2
    if-nez p6, :cond_3

    .line 42
    .line 43
    const/4 p1, 0x3

    .line 44
    return p1

    .line 45
    :cond_3
    invoke-virtual {p1, v3, p2, p6}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    return p1

    .line 53
    :cond_4
    sget-object v4, Lsg/e;->e:Ll3/q;

    .line 54
    .line 55
    if-ne v0, v4, :cond_5

    .line 56
    .line 57
    sget-object v1, Lsg/e;->d:Ll3/q;

    .line 58
    .line 59
    invoke-virtual {p1, v0, p2, v1}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    :goto_0
    return v2

    .line 66
    :cond_5
    sget-object p4, Lsg/e;->k:Ll3/q;

    .line 67
    .line 68
    const/4 p5, 0x5

    .line 69
    if-ne v0, p4, :cond_6

    .line 70
    .line 71
    invoke-virtual {p1, p2, v3}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return p5

    .line 75
    :cond_6
    sget-object p6, Lsg/e;->h:Ll3/q;

    .line 76
    .line 77
    if-ne v0, p6, :cond_7

    .line 78
    .line 79
    invoke-virtual {p1, p2, v3}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return p5

    .line 83
    :cond_7
    sget-object p6, Lsg/e;->l:Ll3/q;

    .line 84
    .line 85
    if-ne v0, p6, :cond_8

    .line 86
    .line 87
    invoke-virtual {p1, p2, v3}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lsg/c;->u()Z

    .line 91
    .line 92
    .line 93
    return v1

    .line 94
    :cond_8
    invoke-virtual {p1, p2, v3}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    instance-of p6, v0, Lsg/q;

    .line 98
    .line 99
    if-eqz p6, :cond_9

    .line 100
    .line 101
    check-cast v0, Lsg/q;

    .line 102
    .line 103
    iget-object v0, v0, Lsg/q;->a:Lqg/o1;

    .line 104
    .line 105
    :cond_9
    invoke-virtual {p0, v0, p3}, Lsg/c;->A(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    if-eqz p3, :cond_a

    .line 110
    .line 111
    sget-object p3, Lsg/e;->i:Ll3/q;

    .line 112
    .line 113
    invoke-virtual {p1, p2, p3}, Lsg/k;->n(ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    const/4 p1, 0x0

    .line 117
    return p1

    .line 118
    :cond_a
    iget-object p3, p1, Lsg/k;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 119
    .line 120
    mul-int/lit8 p6, p2, 0x2

    .line 121
    .line 122
    add-int/2addr p6, v2

    .line 123
    invoke-virtual {p3, p6, p4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    if-eq p3, p4, :cond_b

    .line 128
    .line 129
    invoke-virtual {p1, p2, v2}, Lsg/k;->l(IZ)V

    .line 130
    .line 131
    .line 132
    :cond_b
    return p5
.end method

.method public final E(J)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Lsg/c;->w()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :cond_0
    :goto_0
    sget-object v6, Lsg/c;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v6, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    cmp-long v0, v2, p1

    .line 18
    .line 19
    if-lez v0, :cond_8

    .line 20
    .line 21
    sget v0, Lsg/e;->c:I

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    move v2, v7

    .line 25
    :goto_1
    sget-object v3, Lsg/c;->k:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 26
    .line 27
    const-wide v8, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-ge v2, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {v6, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v10

    .line 42
    and-long/2addr v8, v10

    .line 43
    cmp-long v3, v4, v8

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v6, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v8

    .line 51
    cmp-long v3, v4, v8

    .line 52
    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    goto :goto_6

    .line 56
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move-object v0, v3

    .line 60
    :goto_2
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    and-long v4, v2, v8

    .line 65
    .line 66
    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    .line 67
    .line 68
    add-long/2addr v4, v10

    .line 69
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_7

    .line 74
    .line 75
    :goto_3
    invoke-virtual {v6, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    move-wide v4, v2

    .line 80
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    and-long v12, v2, v8

    .line 85
    .line 86
    and-long v14, v2, v10

    .line 87
    .line 88
    const-wide/16 v16, 0x0

    .line 89
    .line 90
    cmp-long v14, v14, v16

    .line 91
    .line 92
    if-eqz v14, :cond_3

    .line 93
    .line 94
    const/4 v14, 0x1

    .line 95
    goto :goto_4

    .line 96
    :cond_3
    move v14, v7

    .line 97
    :goto_4
    cmp-long v15, v4, v12

    .line 98
    .line 99
    if-nez v15, :cond_5

    .line 100
    .line 101
    invoke-virtual {v6, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v15

    .line 105
    cmp-long v4, v4, v15

    .line 106
    .line 107
    if-nez v4, :cond_5

    .line 108
    .line 109
    :goto_5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 110
    .line 111
    .line 112
    move-result-wide v2

    .line 113
    and-long v4, v2, v8

    .line 114
    .line 115
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_4

    .line 120
    .line 121
    :goto_6
    return-void

    .line 122
    :cond_4
    move-object/from16 v1, p0

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_5
    if-nez v14, :cond_6

    .line 126
    .line 127
    add-long v4, v10, v12

    .line 128
    .line 129
    move-object/from16 v1, p0

    .line 130
    .line 131
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    move-object/from16 v1, p0

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    move-object/from16 v1, p0

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_8
    move-object/from16 v1, p0

    .line 142
    .line 143
    goto/16 :goto_0
.end method

.method public final a(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 4
    .line 5
    const-string v0, "Channel was cancelled"

    .line 6
    .line 7
    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, p1, v0}, Lsg/c;->h(Ljava/lang/Throwable;Z)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    sget-object v3, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    const/4 v6, 0x1

    .line 14
    invoke-virtual {p0, v4, v5, v6}, Lsg/c;->t(JZ)Z

    .line 15
    .line 16
    .line 17
    move-result v7

    .line 18
    if-eqz v7, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lsg/c;->m()Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lsg/h;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lsg/h;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    const-wide v7, 0xfffffffffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v4, v7

    .line 36
    cmp-long v1, v1, v4

    .line 37
    .line 38
    sget-object v2, Lsg/j;->a:Lsg/i;

    .line 39
    .line 40
    if-ltz v1, :cond_1

    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_1
    sget-object v12, Lsg/e;->k:Ll3/q;

    .line 44
    .line 45
    sget-object v1, Lsg/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lsg/k;

    .line 52
    .line 53
    :goto_0
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v4

    .line 57
    invoke-virtual {p0, v4, v5, v6}, Lsg/c;->t(JZ)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Lsg/c;->m()Ljava/lang/Throwable;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v1, Lsg/h;

    .line 68
    .line 69
    invoke-direct {v1, v0}, Lsg/h;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v10

    .line 77
    sget v4, Lsg/e;->b:I

    .line 78
    .line 79
    int-to-long v4, v4

    .line 80
    div-long v7, v10, v4

    .line 81
    .line 82
    rem-long v4, v10, v4

    .line 83
    .line 84
    long-to-int v9, v4

    .line 85
    iget-wide v4, v1, Lvg/q;->c:J

    .line 86
    .line 87
    cmp-long v4, v4, v7

    .line 88
    .line 89
    if-eqz v4, :cond_4

    .line 90
    .line 91
    invoke-virtual {p0, v7, v8, v1}, Lsg/c;->l(JLsg/k;)Lsg/k;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    if-nez v4, :cond_3

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    move-object v8, v4

    .line 99
    :goto_1
    move-object v7, p0

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    move-object v8, v1

    .line 102
    goto :goto_1

    .line 103
    :goto_2
    invoke-virtual/range {v7 .. v12}, Lsg/c;->C(Lsg/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    move-object v4, v8

    .line 108
    sget-object v5, Lsg/e;->m:Ll3/q;

    .line 109
    .line 110
    if-ne v1, v5, :cond_7

    .line 111
    .line 112
    instance-of v0, v12, Lqg/o1;

    .line 113
    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    check-cast v12, Lqg/o1;

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_5
    const/4 v12, 0x0

    .line 120
    :goto_3
    if-eqz v12, :cond_6

    .line 121
    .line 122
    invoke-interface {v12, v4, v9}, Lqg/o1;->a(Lvg/q;I)V

    .line 123
    .line 124
    .line 125
    :cond_6
    invoke-virtual {p0, v10, v11}, Lsg/c;->E(J)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4}, Lvg/q;->h()V

    .line 129
    .line 130
    .line 131
    return-object v2

    .line 132
    :cond_7
    sget-object v5, Lsg/e;->o:Ll3/q;

    .line 133
    .line 134
    if-ne v1, v5, :cond_9

    .line 135
    .line 136
    invoke-virtual {p0}, Lsg/c;->r()J

    .line 137
    .line 138
    .line 139
    move-result-wide v8

    .line 140
    cmp-long v1, v10, v8

    .line 141
    .line 142
    if-gez v1, :cond_8

    .line 143
    .line 144
    invoke-virtual {v4}, Lvg/b;->a()V

    .line 145
    .line 146
    .line 147
    :cond_8
    move-object v1, v4

    .line 148
    goto :goto_0

    .line 149
    :cond_9
    sget-object v0, Lsg/e;->n:Ll3/q;

    .line 150
    .line 151
    if-eq v1, v0, :cond_a

    .line 152
    .line 153
    invoke-virtual {v4}, Lvg/b;->a()V

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :cond_a
    const-string v0, "unexpected"

    .line 158
    .line 159
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const/4 v0, 0x0

    .line 163
    return-object v0
.end method

.method public final f(Lwf/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lsg/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lsg/k;

    .line 10
    .line 11
    :goto_0
    sget-object v7, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v7, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const/4 v8, 0x1

    .line 18
    invoke-virtual {v1, v3, v4, v8}, Lsg/c;->t(JZ)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_10

    .line 23
    .line 24
    sget-object v9, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 25
    .line 26
    invoke-virtual {v9, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    sget v3, Lsg/e;->b:I

    .line 31
    .line 32
    int-to-long v10, v3

    .line 33
    div-long v12, v4, v10

    .line 34
    .line 35
    rem-long v10, v4, v10

    .line 36
    .line 37
    long-to-int v3, v10

    .line 38
    iget-wide v10, v2, Lvg/q;->c:J

    .line 39
    .line 40
    cmp-long v6, v10, v12

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1, v12, v13, v2}, Lsg/c;->l(JLsg/k;)Lsg/k;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    if-nez v6, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v2, v6

    .line 52
    :cond_1
    const/4 v6, 0x0

    .line 53
    invoke-virtual/range {v1 .. v6}, Lsg/c;->C(Lsg/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    sget-object v10, Lsg/e;->m:Ll3/q;

    .line 58
    .line 59
    const/4 v11, 0x0

    .line 60
    const-string v12, "unexpected"

    .line 61
    .line 62
    if-eq v6, v10, :cond_f

    .line 63
    .line 64
    sget-object v13, Lsg/e;->o:Ll3/q;

    .line 65
    .line 66
    if-ne v6, v13, :cond_3

    .line 67
    .line 68
    invoke-virtual/range {p0 .. p0}, Lsg/c;->r()J

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    cmp-long v1, v4, v6

    .line 73
    .line 74
    if-gez v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 77
    .line 78
    .line 79
    :cond_2
    move-object/from16 v1, p0

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    sget-object v1, Lsg/e;->n:Ll3/q;

    .line 83
    .line 84
    if-ne v6, v1, :cond_e

    .line 85
    .line 86
    invoke-static/range {p1 .. p1}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, Lqg/v;->l(Lwf/c;)Lqg/g;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    move-object/from16 v1, p0

    .line 95
    .line 96
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Lsg/c;->C(Lsg/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    if-ne v14, v10, :cond_4

    .line 101
    .line 102
    invoke-virtual {v6, v2, v3}, Lqg/g;->a(Lvg/q;I)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_2

    .line 106
    .line 107
    :catchall_0
    move-exception v0

    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :cond_4
    if-ne v14, v13, :cond_d

    .line 111
    .line 112
    invoke-virtual {v1}, Lsg/c;->r()J

    .line 113
    .line 114
    .line 115
    move-result-wide v13

    .line 116
    cmp-long v3, v4, v13

    .line 117
    .line 118
    if-gez v3, :cond_5

    .line 119
    .line 120
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 121
    .line 122
    .line 123
    :cond_5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Lsg/k;

    .line 128
    .line 129
    :goto_1
    invoke-virtual {v7, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    invoke-virtual {v1, v2, v3, v8}, Lsg/c;->t(JZ)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    invoke-virtual {v1}, Lsg/c;->n()Ljava/lang/Throwable;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    new-instance v2, Lsf/f;

    .line 144
    .line 145
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6, v2}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_6
    invoke-virtual {v9, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 153
    .line 154
    .line 155
    move-result-wide v4

    .line 156
    sget v2, Lsg/e;->b:I

    .line 157
    .line 158
    int-to-long v2, v2

    .line 159
    div-long v13, v4, v2

    .line 160
    .line 161
    rem-long v2, v4, v2

    .line 162
    .line 163
    long-to-int v3, v2

    .line 164
    move-object v15, v9

    .line 165
    iget-wide v8, v0, Lvg/q;->c:J

    .line 166
    .line 167
    cmp-long v2, v8, v13

    .line 168
    .line 169
    if-eqz v2, :cond_7

    .line 170
    .line 171
    invoke-virtual {v1, v13, v14, v0}, Lsg/c;->l(JLsg/k;)Lsg/k;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    if-nez v2, :cond_8

    .line 176
    .line 177
    move-object v9, v15

    .line 178
    const/4 v8, 0x1

    .line 179
    goto :goto_1

    .line 180
    :cond_7
    move-object v2, v0

    .line 181
    :cond_8
    invoke-virtual/range {v1 .. v6}, Lsg/c;->C(Lsg/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    sget-object v1, Lsg/e;->m:Ll3/q;

    .line 186
    .line 187
    if-ne v0, v1, :cond_9

    .line 188
    .line 189
    invoke-virtual {v6, v2, v3}, Lqg/g;->a(Lvg/q;I)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_9
    sget-object v1, Lsg/e;->o:Ll3/q;

    .line 194
    .line 195
    if-ne v0, v1, :cond_b

    .line 196
    .line 197
    invoke-virtual/range {p0 .. p0}, Lsg/c;->r()J

    .line 198
    .line 199
    .line 200
    move-result-wide v0

    .line 201
    cmp-long v0, v4, v0

    .line 202
    .line 203
    if-gez v0, :cond_a

    .line 204
    .line 205
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 206
    .line 207
    .line 208
    :cond_a
    const/4 v8, 0x1

    .line 209
    move-object/from16 v1, p0

    .line 210
    .line 211
    move-object v0, v2

    .line 212
    move-object v9, v15

    .line 213
    goto :goto_1

    .line 214
    :cond_b
    sget-object v1, Lsg/e;->n:Ll3/q;

    .line 215
    .line 216
    if-eq v0, v1, :cond_c

    .line 217
    .line 218
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v0, v11}, Lqg/g;->y(Ljava/lang/Object;Lfg/q;)V

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 226
    .line 227
    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v0

    .line 231
    :cond_d
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6, v14, v11}, Lqg/g;->y(Ljava/lang/Object;Lfg/q;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    .line 236
    .line 237
    :goto_2
    invoke-virtual {v6}, Lqg/g;->o()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    return-object v0

    .line 242
    :goto_3
    invoke-virtual {v6}, Lqg/g;->x()V

    .line 243
    .line 244
    .line 245
    throw v0

    .line 246
    :cond_e
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 247
    .line 248
    .line 249
    return-object v6

    .line 250
    :cond_f
    invoke-static {v12}, Lj8/o;->A(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-object v11

    .line 254
    :cond_10
    invoke-virtual/range {p0 .. p0}, Lsg/c;->n()Ljava/lang/Throwable;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    sget v1, Lvg/r;->a:I

    .line 259
    .line 260
    throw v0
.end method

.method public final g(J)Z
    .locals 4

    .line 1
    sget-object v0, Lsg/c;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    cmp-long v0, p1, v0

    .line 8
    .line 9
    if-ltz v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget v2, p0, Lsg/c;->g:I

    .line 18
    .line 19
    int-to-long v2, v2

    .line 20
    add-long/2addr v0, v2

    .line 21
    cmp-long p1, p1, v0

    .line 22
    .line 23
    if-gez p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public final h(Ljava/lang/Throwable;Z)Z
    .locals 12

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    const-wide v1, 0xfffffffffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    sget-object v3, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 9
    .line 10
    const/4 v9, 0x1

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    shr-long v7, v5, v0

    .line 18
    .line 19
    long-to-int v4, v7

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    and-long v7, v5, v1

    .line 23
    .line 24
    sget-object v4, Lsg/e;->a:Lsg/k;

    .line 25
    .line 26
    int-to-long v10, v9

    .line 27
    shl-long/2addr v10, v0

    .line 28
    add-long/2addr v7, v10

    .line 29
    move-object v4, p0

    .line 30
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v4, p0

    .line 38
    :goto_0
    sget-object v5, Lsg/e;->s:Ll3/q;

    .line 39
    .line 40
    :cond_2
    sget-object v6, Lsg/c;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 41
    .line 42
    invoke-virtual {v6, p0, v5, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_3

    .line 47
    .line 48
    move v10, v9

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    if-eq v6, v5, :cond_2

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    move v10, p1

    .line 58
    :goto_1
    const/4 v11, 0x3

    .line 59
    if-eqz p2, :cond_5

    .line 60
    .line 61
    :cond_4
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    and-long p1, v5, v1

    .line 66
    .line 67
    int-to-long v7, v11

    .line 68
    shl-long/2addr v7, v0

    .line 69
    add-long/2addr v7, p1

    .line 70
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_5
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v5

    .line 81
    shr-long p1, v5, v0

    .line 82
    .line 83
    long-to-int p1, p1

    .line 84
    if-eqz p1, :cond_7

    .line 85
    .line 86
    if-eq p1, v9, :cond_6

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    and-long p1, v5, v1

    .line 90
    .line 91
    int-to-long v7, v11

    .line 92
    :goto_2
    shl-long/2addr v7, v0

    .line 93
    add-long/2addr v7, p1

    .line 94
    goto :goto_3

    .line 95
    :cond_7
    and-long p1, v5, v1

    .line 96
    .line 97
    const/4 v7, 0x2

    .line 98
    int-to-long v7, v7

    .line 99
    goto :goto_2

    .line 100
    :goto_3
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    :goto_4
    invoke-virtual {p0}, Lsg/c;->u()Z

    .line 107
    .line 108
    .line 109
    if-eqz v10, :cond_c

    .line 110
    .line 111
    :goto_5
    sget-object p1, Lsg/c;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 112
    .line 113
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    if-nez p2, :cond_8

    .line 118
    .line 119
    sget-object v0, Lsg/e;->q:Ll3/q;

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_8
    sget-object v0, Lsg/e;->r:Ll3/q;

    .line 123
    .line 124
    :cond_9
    :goto_6
    invoke-virtual {p1, p0, p2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_b

    .line 129
    .line 130
    if-nez p2, :cond_a

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_a
    invoke-static {v9, p2}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    check-cast p2, Lfg/l;

    .line 137
    .line 138
    invoke-virtual {p0}, Lsg/c;->m()Ljava/lang/Throwable;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-interface {p2, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    return v10

    .line 146
    :cond_b
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    if-eq v1, p2, :cond_9

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_c
    :goto_7
    return v10
.end method

.method public final i(J)Lsg/k;
    .locals 12

    .line 1
    sget-object v0, Lsg/c;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lsg/c;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lsg/k;

    .line 14
    .line 15
    iget-wide v2, v1, Lvg/q;->c:J

    .line 16
    .line 17
    move-object v4, v0

    .line 18
    check-cast v4, Lsg/k;

    .line 19
    .line 20
    iget-wide v4, v4, Lvg/q;->c:J

    .line 21
    .line 22
    cmp-long v2, v2, v4

    .line 23
    .line 24
    if-lez v2, :cond_0

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_0
    sget-object v1, Lsg/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lsg/k;

    .line 34
    .line 35
    iget-wide v2, v1, Lvg/q;->c:J

    .line 36
    .line 37
    move-object v4, v0

    .line 38
    check-cast v4, Lsg/k;

    .line 39
    .line 40
    iget-wide v4, v4, Lvg/q;->c:J

    .line 41
    .line 42
    cmp-long v2, v2, v4

    .line 43
    .line 44
    if-lez v2, :cond_1

    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :cond_1
    check-cast v0, Lvg/b;

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget-object v1, Lvg/b;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget-object v3, Lvg/a;->a:Ll3/q;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    if-ne v2, v3, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    check-cast v2, Lvg/b;

    .line 65
    .line 66
    if-nez v2, :cond_15

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v1, v0, v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_14

    .line 73
    .line 74
    :goto_1
    check-cast v0, Lsg/k;

    .line 75
    .line 76
    invoke-virtual {p0}, Lsg/c;->v()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/4 v2, 0x1

    .line 81
    const/4 v3, -0x1

    .line 82
    if-eqz v1, :cond_a

    .line 83
    .line 84
    move-object v1, v0

    .line 85
    :cond_4
    sget v5, Lsg/e;->b:I

    .line 86
    .line 87
    sub-int/2addr v5, v2

    .line 88
    :goto_2
    const-wide/16 v6, -0x1

    .line 89
    .line 90
    if-ge v3, v5, :cond_9

    .line 91
    .line 92
    iget-wide v8, v1, Lvg/q;->c:J

    .line 93
    .line 94
    sget v10, Lsg/e;->b:I

    .line 95
    .line 96
    int-to-long v10, v10

    .line 97
    mul-long/2addr v8, v10

    .line 98
    int-to-long v10, v5

    .line 99
    add-long/2addr v8, v10

    .line 100
    sget-object v10, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 101
    .line 102
    invoke-virtual {v10, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v10

    .line 106
    cmp-long v10, v8, v10

    .line 107
    .line 108
    if-gez v10, :cond_5

    .line 109
    .line 110
    :goto_3
    move-wide v8, v6

    .line 111
    goto :goto_5

    .line 112
    :cond_5
    invoke-virtual {v1, v5}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    if-eqz v10, :cond_7

    .line 117
    .line 118
    sget-object v11, Lsg/e;->e:Ll3/q;

    .line 119
    .line 120
    if-ne v10, v11, :cond_6

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    sget-object v11, Lsg/e;->d:Ll3/q;

    .line 124
    .line 125
    if-ne v10, v11, :cond_8

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_7
    :goto_4
    sget-object v11, Lsg/e;->l:Ll3/q;

    .line 129
    .line 130
    invoke-virtual {v1, v10, v5, v11}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-eqz v10, :cond_5

    .line 135
    .line 136
    invoke-virtual {v1}, Lvg/q;->h()V

    .line 137
    .line 138
    .line 139
    :cond_8
    add-int/lit8 v5, v5, -0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_9
    sget-object v5, Lvg/b;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 143
    .line 144
    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lvg/b;

    .line 149
    .line 150
    check-cast v1, Lsg/k;

    .line 151
    .line 152
    if-nez v1, :cond_4

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :goto_5
    cmp-long v1, v8, v6

    .line 156
    .line 157
    if-eqz v1, :cond_a

    .line 158
    .line 159
    invoke-virtual {p0, v8, v9}, Lsg/c;->j(J)V

    .line 160
    .line 161
    .line 162
    :cond_a
    move-object v1, v0

    .line 163
    :goto_6
    if-eqz v1, :cond_11

    .line 164
    .line 165
    sget v5, Lsg/e;->b:I

    .line 166
    .line 167
    sub-int/2addr v5, v2

    .line 168
    :goto_7
    if-ge v3, v5, :cond_10

    .line 169
    .line 170
    iget-wide v6, v1, Lvg/q;->c:J

    .line 171
    .line 172
    sget v8, Lsg/e;->b:I

    .line 173
    .line 174
    int-to-long v8, v8

    .line 175
    mul-long/2addr v6, v8

    .line 176
    int-to-long v8, v5

    .line 177
    add-long/2addr v6, v8

    .line 178
    cmp-long v6, v6, p1

    .line 179
    .line 180
    if-ltz v6, :cond_11

    .line 181
    .line 182
    :cond_b
    invoke-virtual {v1, v5}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    if-eqz v6, :cond_e

    .line 187
    .line 188
    sget-object v7, Lsg/e;->e:Ll3/q;

    .line 189
    .line 190
    if-ne v6, v7, :cond_c

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_c
    instance-of v7, v6, Lsg/q;

    .line 194
    .line 195
    if-eqz v7, :cond_d

    .line 196
    .line 197
    sget-object v7, Lsg/e;->l:Ll3/q;

    .line 198
    .line 199
    invoke-virtual {v1, v6, v5, v7}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-eqz v7, :cond_b

    .line 204
    .line 205
    check-cast v6, Lsg/q;

    .line 206
    .line 207
    iget-object v6, v6, Lsg/q;->a:Lqg/o1;

    .line 208
    .line 209
    invoke-static {v4, v6}, Lvg/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-virtual {v1, v5, v2}, Lsg/k;->l(IZ)V

    .line 214
    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_d
    instance-of v7, v6, Lqg/o1;

    .line 218
    .line 219
    if-eqz v7, :cond_f

    .line 220
    .line 221
    sget-object v7, Lsg/e;->l:Ll3/q;

    .line 222
    .line 223
    invoke-virtual {v1, v6, v5, v7}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-eqz v7, :cond_b

    .line 228
    .line 229
    invoke-static {v4, v6}, Lvg/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-virtual {v1, v5, v2}, Lsg/k;->l(IZ)V

    .line 234
    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_e
    :goto_8
    sget-object v7, Lsg/e;->l:Ll3/q;

    .line 238
    .line 239
    invoke-virtual {v1, v6, v5, v7}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    if-eqz v6, :cond_b

    .line 244
    .line 245
    invoke-virtual {v1}, Lvg/q;->h()V

    .line 246
    .line 247
    .line 248
    :cond_f
    :goto_9
    add-int/lit8 v5, v5, -0x1

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_10
    sget-object v5, Lvg/b;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 252
    .line 253
    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Lvg/b;

    .line 258
    .line 259
    check-cast v1, Lsg/k;

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_11
    if-eqz v4, :cond_13

    .line 263
    .line 264
    instance-of p1, v4, Ljava/util/ArrayList;

    .line 265
    .line 266
    if-nez p1, :cond_12

    .line 267
    .line 268
    check-cast v4, Lqg/o1;

    .line 269
    .line 270
    invoke-virtual {p0, v4, v2}, Lsg/c;->z(Lqg/o1;Z)V

    .line 271
    .line 272
    .line 273
    return-object v0

    .line 274
    :cond_12
    check-cast v4, Ljava/util/ArrayList;

    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    sub-int/2addr p1, v2

    .line 281
    :goto_a
    if-ge v3, p1, :cond_13

    .line 282
    .line 283
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p2

    .line 287
    check-cast p2, Lqg/o1;

    .line 288
    .line 289
    invoke-virtual {p0, p2, v2}, Lsg/c;->z(Lqg/o1;Z)V

    .line 290
    .line 291
    .line 292
    add-int/lit8 p1, p1, -0x1

    .line 293
    .line 294
    goto :goto_a

    .line 295
    :cond_13
    return-object v0

    .line 296
    :cond_14
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    if-eqz v2, :cond_3

    .line 301
    .line 302
    goto/16 :goto_0

    .line 303
    .line 304
    :cond_15
    move-object v0, v2

    .line 305
    goto/16 :goto_0
.end method

.method public final iterator()Lsg/b;
    .locals 1

    .line 1
    new-instance v0, Lsg/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lsg/b;-><init>(Lsg/c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final j(J)V
    .locals 9

    .line 1
    sget-object v0, Lsg/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsg/k;

    .line 8
    .line 9
    :cond_0
    :goto_0
    sget-object v1, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    iget v2, p0, Lsg/c;->g:I

    .line 16
    .line 17
    int-to-long v5, v2

    .line 18
    add-long/2addr v5, v3

    .line 19
    sget-object v2, Lsg/c;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 20
    .line 21
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    cmp-long v2, p1, v5

    .line 30
    .line 31
    if-gez v2, :cond_1

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    const-wide/16 v5, 0x1

    .line 35
    .line 36
    add-long/2addr v5, v3

    .line 37
    move-object v2, p0

    .line 38
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    sget v1, Lsg/e;->b:I

    .line 45
    .line 46
    int-to-long v5, v1

    .line 47
    div-long v7, v3, v5

    .line 48
    .line 49
    rem-long v5, v3, v5

    .line 50
    .line 51
    long-to-int v1, v5

    .line 52
    iget-wide v5, v0, Lvg/q;->c:J

    .line 53
    .line 54
    cmp-long v5, v5, v7

    .line 55
    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0, v7, v8, v0}, Lsg/c;->l(JLsg/k;)Lsg/k;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    if-nez v5, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object v0, v5

    .line 66
    :cond_3
    const/4 v7, 0x0

    .line 67
    move-wide v5, v3

    .line 68
    move-object v3, v0

    .line 69
    move v4, v1

    .line 70
    invoke-virtual/range {v2 .. v7}, Lsg/c;->C(Lsg/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v1, Lsg/e;->o:Ll3/q;

    .line 75
    .line 76
    if-ne v0, v1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p0}, Lsg/c;->r()J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    cmp-long v0, v5, v0

    .line 83
    .line 84
    if-gez v0, :cond_5

    .line 85
    .line 86
    invoke-virtual {v3}, Lvg/b;->a()V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-virtual {v3}, Lvg/b;->a()V

    .line 91
    .line 92
    .line 93
    :cond_5
    :goto_1
    move-object v0, v3

    .line 94
    goto :goto_0
.end method

.method public final k()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lsg/c;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v6, Lsg/c;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lsg/k;

    .line 15
    .line 16
    move-object v7, v0

    .line 17
    :goto_0
    sget-object v0, Lsg/c;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v8

    .line 23
    sget v0, Lsg/e;->b:I

    .line 24
    .line 25
    int-to-long v2, v0

    .line 26
    div-long v2, v8, v2

    .line 27
    .line 28
    invoke-virtual {p0}, Lsg/c;->r()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    cmp-long v0, v4, v8

    .line 33
    .line 34
    if-gtz v0, :cond_2

    .line 35
    .line 36
    iget-wide v4, v7, Lvg/q;->c:J

    .line 37
    .line 38
    cmp-long v0, v4, v2

    .line 39
    .line 40
    if-gez v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {v7}, Lvg/b;->b()Lvg/b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, v2, v3, v7}, Lsg/c;->x(JLsg/k;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-static {p0}, Lsg/c;->s(Lsg/c;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    iget-wide v4, v7, Lvg/q;->c:J

    .line 56
    .line 57
    cmp-long v0, v4, v2

    .line 58
    .line 59
    if-eqz v0, :cond_d

    .line 60
    .line 61
    sget-object v0, Lsg/d;->n:Lsg/d;

    .line 62
    .line 63
    :goto_1
    invoke-static {v7, v2, v3, v0}, Lvg/a;->b(Lvg/q;JLfg/p;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, Lvg/a;->e(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_7

    .line 72
    .line 73
    invoke-static {v4}, Lvg/a;->c(Ljava/lang/Object;)Lvg/q;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    :cond_3
    :goto_2
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    check-cast v10, Lvg/q;

    .line 82
    .line 83
    iget-wide v11, v10, Lvg/q;->c:J

    .line 84
    .line 85
    iget-wide v13, v5, Lvg/q;->c:J

    .line 86
    .line 87
    cmp-long v11, v11, v13

    .line 88
    .line 89
    if-ltz v11, :cond_4

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    invoke-virtual {v5}, Lvg/q;->i()Z

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    if-nez v11, :cond_5

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    invoke-virtual {v6, p0, v10, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    if-eqz v11, :cond_6

    .line 104
    .line 105
    invoke-virtual {v10}, Lvg/q;->e()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_7

    .line 110
    .line 111
    invoke-virtual {v10}, Lvg/b;->d()V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    if-eq v11, v10, :cond_5

    .line 120
    .line 121
    invoke-virtual {v5}, Lvg/q;->e()Z

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    if-eqz v10, :cond_3

    .line 126
    .line 127
    invoke-virtual {v5}, Lvg/b;->d()V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_7
    :goto_3
    invoke-static {v4}, Lvg/a;->e(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    const/4 v10, 0x0

    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    invoke-virtual {p0}, Lsg/c;->u()Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v2, v3, v7}, Lsg/c;->x(JLsg/k;)V

    .line 142
    .line 143
    .line 144
    invoke-static {p0}, Lsg/c;->s(Lsg/c;)V

    .line 145
    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_8
    invoke-static {v4}, Lvg/a;->c(Ljava/lang/Object;)Lvg/q;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Lsg/k;

    .line 153
    .line 154
    iget-wide v4, v0, Lvg/q;->c:J

    .line 155
    .line 156
    cmp-long v2, v4, v2

    .line 157
    .line 158
    if-lez v2, :cond_a

    .line 159
    .line 160
    const-wide/16 v2, 0x1

    .line 161
    .line 162
    add-long/2addr v2, v8

    .line 163
    sget v0, Lsg/e;->b:I

    .line 164
    .line 165
    int-to-long v11, v0

    .line 166
    mul-long/2addr v4, v11

    .line 167
    sget-object v0, Lsg/c;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 168
    .line 169
    move-object v1, p0

    .line 170
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_9

    .line 175
    .line 176
    sub-long/2addr v4, v8

    .line 177
    sget-object v0, Lsg/c;->k:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 178
    .line 179
    invoke-virtual {v0, p0, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 180
    .line 181
    .line 182
    move-result-wide v2

    .line 183
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 184
    .line 185
    and-long/2addr v2, v4

    .line 186
    const-wide/16 v11, 0x0

    .line 187
    .line 188
    cmp-long v2, v2, v11

    .line 189
    .line 190
    if-eqz v2, :cond_b

    .line 191
    .line 192
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 193
    .line 194
    .line 195
    move-result-wide v2

    .line 196
    and-long/2addr v2, v4

    .line 197
    cmp-long v2, v2, v11

    .line 198
    .line 199
    if-eqz v2, :cond_b

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_9
    invoke-static {p0}, Lsg/c;->s(Lsg/c;)V

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_a
    move-object v10, v0

    .line 207
    :cond_b
    :goto_5
    if-nez v10, :cond_c

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_c
    move-object v7, v10

    .line 212
    :cond_d
    sget v0, Lsg/e;->b:I

    .line 213
    .line 214
    int-to-long v2, v0

    .line 215
    rem-long v2, v8, v2

    .line 216
    .line 217
    long-to-int v0, v2

    .line 218
    invoke-virtual {v7, v0}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    instance-of v3, v2, Lqg/o1;

    .line 223
    .line 224
    sget-object v4, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 225
    .line 226
    if-eqz v3, :cond_f

    .line 227
    .line 228
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 229
    .line 230
    .line 231
    move-result-wide v10

    .line 232
    cmp-long v3, v8, v10

    .line 233
    .line 234
    if-ltz v3, :cond_f

    .line 235
    .line 236
    sget-object v3, Lsg/e;->g:Ll3/q;

    .line 237
    .line 238
    invoke-virtual {v7, v2, v0, v3}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    if-eqz v3, :cond_f

    .line 243
    .line 244
    invoke-static {v2}, Lsg/c;->B(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_e

    .line 249
    .line 250
    sget-object v2, Lsg/e;->d:Ll3/q;

    .line 251
    .line 252
    invoke-virtual {v7, v0, v2}, Lsg/k;->n(ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_8

    .line 256
    .line 257
    :cond_e
    sget-object v2, Lsg/e;->j:Ll3/q;

    .line 258
    .line 259
    invoke-virtual {v7, v0, v2}, Lsg/k;->n(ILjava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7}, Lvg/q;->h()V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_f
    :goto_6
    invoke-virtual {v7, v0}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    instance-of v3, v2, Lqg/o1;

    .line 271
    .line 272
    if-eqz v3, :cond_12

    .line 273
    .line 274
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 275
    .line 276
    .line 277
    move-result-wide v10

    .line 278
    cmp-long v3, v8, v10

    .line 279
    .line 280
    if-gez v3, :cond_10

    .line 281
    .line 282
    new-instance v3, Lsg/q;

    .line 283
    .line 284
    move-object v5, v2

    .line 285
    check-cast v5, Lqg/o1;

    .line 286
    .line 287
    invoke-direct {v3, v5}, Lsg/q;-><init>(Lqg/o1;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7, v2, v0, v3}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-eqz v2, :cond_f

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_10
    sget-object v3, Lsg/e;->g:Ll3/q;

    .line 298
    .line 299
    invoke-virtual {v7, v2, v0, v3}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    if-eqz v3, :cond_f

    .line 304
    .line 305
    invoke-static {v2}, Lsg/c;->B(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    if-eqz v2, :cond_11

    .line 310
    .line 311
    sget-object v2, Lsg/e;->d:Ll3/q;

    .line 312
    .line 313
    invoke-virtual {v7, v0, v2}, Lsg/k;->n(ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_11
    sget-object v2, Lsg/e;->j:Ll3/q;

    .line 318
    .line 319
    invoke-virtual {v7, v0, v2}, Lsg/k;->n(ILjava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v7}, Lvg/q;->h()V

    .line 323
    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_12
    sget-object v3, Lsg/e;->j:Ll3/q;

    .line 327
    .line 328
    if-ne v2, v3, :cond_13

    .line 329
    .line 330
    :goto_7
    invoke-static {p0}, Lsg/c;->s(Lsg/c;)V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_0

    .line 334
    .line 335
    :cond_13
    if-nez v2, :cond_14

    .line 336
    .line 337
    sget-object v3, Lsg/e;->e:Ll3/q;

    .line 338
    .line 339
    invoke-virtual {v7, v2, v0, v3}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_f

    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_14
    sget-object v3, Lsg/e;->d:Ll3/q;

    .line 347
    .line 348
    if-ne v2, v3, :cond_15

    .line 349
    .line 350
    goto :goto_8

    .line 351
    :cond_15
    sget-object v3, Lsg/e;->h:Ll3/q;

    .line 352
    .line 353
    if-eq v2, v3, :cond_19

    .line 354
    .line 355
    sget-object v3, Lsg/e;->i:Ll3/q;

    .line 356
    .line 357
    if-eq v2, v3, :cond_19

    .line 358
    .line 359
    sget-object v3, Lsg/e;->k:Ll3/q;

    .line 360
    .line 361
    if-ne v2, v3, :cond_16

    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_16
    sget-object v3, Lsg/e;->l:Ll3/q;

    .line 365
    .line 366
    if-ne v2, v3, :cond_17

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_17
    sget-object v3, Lsg/e;->f:Ll3/q;

    .line 370
    .line 371
    if-ne v2, v3, :cond_18

    .line 372
    .line 373
    goto :goto_6

    .line 374
    :cond_18
    const-string v0, "Unexpected cell state: "

    .line 375
    .line 376
    invoke-static {v2, v0}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :cond_19
    :goto_8
    invoke-static {p0}, Lsg/c;->s(Lsg/c;)V

    .line 381
    .line 382
    .line 383
    return-void
.end method

.method public final l(JLsg/k;)Lsg/k;
    .locals 9

    .line 1
    sget-object v0, Lsg/e;->a:Lsg/k;

    .line 2
    .line 3
    sget-object v0, Lsg/d;->n:Lsg/d;

    .line 4
    .line 5
    :goto_0
    invoke-static {p3, p1, p2, v0}, Lvg/a;->b(Lvg/q;JLfg/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lvg/a;->e(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_4

    .line 14
    .line 15
    invoke-static {v1}, Lvg/a;->c(Ljava/lang/Object;)Lvg/q;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_1
    sget-object v3, Lsg/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Lvg/q;

    .line 26
    .line 27
    iget-wide v5, v4, Lvg/q;->c:J

    .line 28
    .line 29
    iget-wide v7, v2, Lvg/q;->c:J

    .line 30
    .line 31
    cmp-long v5, v5, v7

    .line 32
    .line 33
    if-ltz v5, :cond_1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    invoke-virtual {v2}, Lvg/q;->i()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {v3, p0, v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    invoke-virtual {v4}, Lvg/q;->e()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {v4}, Lvg/b;->d()V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    if-eq v5, v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v2}, Lvg/q;->e()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    invoke-virtual {v2}, Lvg/b;->d()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    :goto_2
    invoke-static {v1}, Lvg/a;->e(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v2, 0x0

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    invoke-virtual {p0}, Lsg/c;->u()Z

    .line 83
    .line 84
    .line 85
    iget-wide p1, p3, Lvg/q;->c:J

    .line 86
    .line 87
    sget v0, Lsg/e;->b:I

    .line 88
    .line 89
    int-to-long v0, v0

    .line 90
    mul-long/2addr p1, v0

    .line 91
    invoke-virtual {p0}, Lsg/c;->r()J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    cmp-long p1, p1, v0

    .line 96
    .line 97
    if-gez p1, :cond_c

    .line 98
    .line 99
    invoke-virtual {p3}, Lvg/b;->a()V

    .line 100
    .line 101
    .line 102
    return-object v2

    .line 103
    :cond_5
    invoke-static {v1}, Lvg/a;->c(Ljava/lang/Object;)Lvg/q;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    check-cast p3, Lsg/k;

    .line 108
    .line 109
    iget-wide v0, p3, Lvg/q;->c:J

    .line 110
    .line 111
    invoke-virtual {p0}, Lsg/c;->w()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_9

    .line 116
    .line 117
    sget-object v3, Lsg/c;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 118
    .line 119
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v3

    .line 123
    sget v5, Lsg/e;->b:I

    .line 124
    .line 125
    int-to-long v5, v5

    .line 126
    div-long/2addr v3, v5

    .line 127
    cmp-long v3, p1, v3

    .line 128
    .line 129
    if-gtz v3, :cond_9

    .line 130
    .line 131
    :cond_6
    :goto_3
    sget-object v3, Lsg/c;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 132
    .line 133
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    check-cast v4, Lvg/q;

    .line 138
    .line 139
    iget-wide v5, v4, Lvg/q;->c:J

    .line 140
    .line 141
    cmp-long v5, v5, v0

    .line 142
    .line 143
    if-gez v5, :cond_9

    .line 144
    .line 145
    invoke-virtual {p3}, Lvg/q;->i()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_9

    .line 150
    .line 151
    :cond_7
    invoke-virtual {v3, p0, v4, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_8

    .line 156
    .line 157
    invoke-virtual {v4}, Lvg/q;->e()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_9

    .line 162
    .line 163
    invoke-virtual {v4}, Lvg/b;->d()V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_8
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    if-eq v5, v4, :cond_7

    .line 172
    .line 173
    invoke-virtual {p3}, Lvg/q;->e()Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-eqz v3, :cond_6

    .line 178
    .line 179
    invoke-virtual {p3}, Lvg/b;->d()V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_9
    :goto_4
    cmp-long p1, v0, p1

    .line 184
    .line 185
    if-lez p1, :cond_d

    .line 186
    .line 187
    sget p1, Lsg/e;->b:I

    .line 188
    .line 189
    int-to-long p1, p1

    .line 190
    mul-long v7, v0, p1

    .line 191
    .line 192
    :cond_a
    sget-object p1, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 193
    .line 194
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 195
    .line 196
    .line 197
    move-result-wide v5

    .line 198
    cmp-long p1, v5, v7

    .line 199
    .line 200
    if-ltz p1, :cond_b

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_b
    sget-object v3, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 204
    .line 205
    move-object v4, p0

    .line 206
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_a

    .line 211
    .line 212
    :goto_5
    sget p1, Lsg/e;->b:I

    .line 213
    .line 214
    int-to-long p1, p1

    .line 215
    mul-long/2addr v0, p1

    .line 216
    invoke-virtual {p0}, Lsg/c;->r()J

    .line 217
    .line 218
    .line 219
    move-result-wide p1

    .line 220
    cmp-long p1, v0, p1

    .line 221
    .line 222
    if-gez p1, :cond_c

    .line 223
    .line 224
    invoke-virtual {p3}, Lvg/b;->a()V

    .line 225
    .line 226
    .line 227
    :cond_c
    return-object v2

    .line 228
    :cond_d
    return-object p3
.end method

.method public final m()Ljava/lang/Throwable;
    .locals 1

    .line 1
    sget-object v0, Lsg/c;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Throwable;

    .line 8
    .line 9
    return-object v0
.end method

.method public final n()Ljava/lang/Throwable;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsg/c;->m()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lsg/l;

    .line 8
    .line 9
    const-string v1, "Channel was closed"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public final o()Ljava/lang/Throwable;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsg/c;->m()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lsg/m;

    .line 8
    .line 9
    const-string v1, "Channel was closed"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    .line 1
    sget-object v8, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v8, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const/4 v9, 0x0

    .line 8
    invoke-virtual {p0, v1, v2, v9}, Lsg/c;->t(JZ)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v10, 0x1

    .line 13
    const-wide v11, 0xfffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    move v1, v9

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    and-long/2addr v1, v11

    .line 23
    invoke-virtual {p0, v1, v2}, Lsg/c;->g(J)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    xor-int/2addr v1, v10

    .line 28
    :goto_0
    sget-object v13, Lsg/j;->a:Lsg/i;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    return-object v13

    .line 33
    :cond_1
    sget-object v6, Lsg/e;->j:Ll3/q;

    .line 34
    .line 35
    sget-object v1, Lsg/c;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lsg/k;

    .line 42
    .line 43
    :goto_1
    invoke-virtual {v8, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    and-long v4, v2, v11

    .line 48
    .line 49
    invoke-virtual {p0, v2, v3, v9}, Lsg/c;->t(JZ)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    sget v14, Lsg/e;->b:I

    .line 54
    .line 55
    int-to-long v2, v14

    .line 56
    div-long v11, v4, v2

    .line 57
    .line 58
    rem-long v2, v4, v2

    .line 59
    .line 60
    long-to-int v2, v2

    .line 61
    iget-wide v9, v1, Lvg/q;->c:J

    .line 62
    .line 63
    cmp-long v3, v9, v11

    .line 64
    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    invoke-static {p0, v11, v12, v1}, Lsg/c;->b(Lsg/c;JLsg/k;)Lsg/k;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-nez v3, :cond_3

    .line 72
    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    invoke-virtual {p0}, Lsg/c;->o()Ljava/lang/Throwable;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Lsg/h;

    .line 80
    .line 81
    invoke-direct {v2, v1}, Lsg/h;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_2
    const/4 v9, 0x0

    .line 86
    const/4 v10, 0x1

    .line 87
    :goto_2
    const-wide v11, 0xfffffffffffffffL

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    move-object v1, v3

    .line 94
    :cond_4
    move-object v0, p0

    .line 95
    move-object/from16 v3, p1

    .line 96
    .line 97
    invoke-static/range {v0 .. v7}, Lsg/c;->e(Lsg/c;Lsg/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 102
    .line 103
    if-eqz v9, :cond_e

    .line 104
    .line 105
    const/4 v10, 0x1

    .line 106
    if-eq v9, v10, :cond_d

    .line 107
    .line 108
    const/4 v3, 0x2

    .line 109
    if-eq v9, v3, :cond_9

    .line 110
    .line 111
    const/4 v2, 0x3

    .line 112
    if-eq v9, v2, :cond_8

    .line 113
    .line 114
    const/4 v2, 0x4

    .line 115
    if-eq v9, v2, :cond_6

    .line 116
    .line 117
    const/4 v2, 0x5

    .line 118
    if-eq v9, v2, :cond_5

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    invoke-virtual {v1}, Lvg/b;->a()V

    .line 122
    .line 123
    .line 124
    :goto_3
    const/4 v9, 0x0

    .line 125
    goto :goto_2

    .line 126
    :cond_6
    sget-object v2, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 127
    .line 128
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    cmp-long v2, v4, v2

    .line 133
    .line 134
    if-gez v2, :cond_7

    .line 135
    .line 136
    invoke-virtual {v1}, Lvg/b;->a()V

    .line 137
    .line 138
    .line 139
    :cond_7
    invoke-virtual {p0}, Lsg/c;->o()Ljava/lang/Throwable;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    new-instance v2, Lsg/h;

    .line 144
    .line 145
    invoke-direct {v2, v1}, Lsg/h;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    return-object v2

    .line 149
    :cond_8
    const-string v1, "unexpected"

    .line 150
    .line 151
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const/4 v1, 0x0

    .line 155
    return-object v1

    .line 156
    :cond_9
    if-eqz v7, :cond_a

    .line 157
    .line 158
    invoke-virtual {v1}, Lvg/q;->h()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lsg/c;->o()Ljava/lang/Throwable;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    new-instance v2, Lsg/h;

    .line 166
    .line 167
    invoke-direct {v2, v1}, Lsg/h;-><init>(Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    return-object v2

    .line 171
    :cond_a
    instance-of v3, v6, Lqg/o1;

    .line 172
    .line 173
    if-eqz v3, :cond_b

    .line 174
    .line 175
    check-cast v6, Lqg/o1;

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_b
    const/4 v6, 0x0

    .line 179
    :goto_4
    if-eqz v6, :cond_c

    .line 180
    .line 181
    add-int/2addr v2, v14

    .line 182
    invoke-interface {v6, v1, v2}, Lqg/o1;->a(Lvg/q;I)V

    .line 183
    .line 184
    .line 185
    :cond_c
    invoke-virtual {v1}, Lvg/q;->h()V

    .line 186
    .line 187
    .line 188
    return-object v13

    .line 189
    :cond_d
    return-object v3

    .line 190
    :cond_e
    invoke-virtual {v1}, Lvg/b;->a()V

    .line 191
    .line 192
    .line 193
    return-object v3
.end method

.method public q(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lsg/c;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lsg/k;

    .line 10
    .line 11
    :cond_0
    :goto_0
    sget-object v9, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v9, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide v10, 0xfffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long v5, v3, v10

    .line 23
    .line 24
    const/4 v12, 0x0

    .line 25
    invoke-virtual {v1, v3, v4, v12}, Lsg/c;->t(JZ)Z

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    sget v13, Lsg/e;->b:I

    .line 30
    .line 31
    int-to-long v3, v13

    .line 32
    div-long v14, v5, v3

    .line 33
    .line 34
    rem-long v3, v5, v3

    .line 35
    .line 36
    long-to-int v3, v3

    .line 37
    move-wide/from16 v16, v10

    .line 38
    .line 39
    iget-wide v10, v2, Lvg/q;->c:J

    .line 40
    .line 41
    cmp-long v4, v10, v14

    .line 42
    .line 43
    sget-object v10, Lxf/a;->g:Lxf/a;

    .line 44
    .line 45
    sget-object v11, Lsf/n;->a:Lsf/n;

    .line 46
    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    invoke-static {v1, v14, v15, v2}, Lsg/c;->b(Lsg/c;JLsg/k;)Lsg/k;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    if-eqz v8, :cond_0

    .line 56
    .line 57
    invoke-virtual/range {p0 .. p2}, Lsg/c;->y(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-ne v0, v10, :cond_1

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_1
    move-object v4, v1

    .line 65
    goto/16 :goto_9

    .line 66
    .line 67
    :cond_2
    move-object v2, v4

    .line 68
    :cond_3
    const/4 v7, 0x0

    .line 69
    move-object/from16 v4, p1

    .line 70
    .line 71
    invoke-static/range {v1 .. v8}, Lsg/c;->e(Lsg/c;Lsg/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_1b

    .line 76
    .line 77
    const/4 v14, 0x1

    .line 78
    if-eq v7, v14, :cond_1

    .line 79
    .line 80
    const/4 v15, 0x2

    .line 81
    if-eq v7, v15, :cond_19

    .line 82
    .line 83
    sget-object v4, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 84
    .line 85
    const/4 v8, 0x5

    .line 86
    const/4 v12, 0x4

    .line 87
    const/4 v15, 0x3

    .line 88
    if-eq v7, v15, :cond_7

    .line 89
    .line 90
    if-eq v7, v12, :cond_5

    .line 91
    .line 92
    if-eq v7, v8, :cond_4

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 100
    .line 101
    .line 102
    move-result-wide v3

    .line 103
    cmp-long v0, v5, v3

    .line 104
    .line 105
    if-gez v0, :cond_6

    .line 106
    .line 107
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 108
    .line 109
    .line 110
    :cond_6
    invoke-virtual/range {p0 .. p2}, Lsg/c;->y(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-ne v0, v10, :cond_1

    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_7
    invoke-static/range {p2 .. p2}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-static {v7}, Lqg/v;->l(Lwf/c;)Lqg/g;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    move/from16 v18, v8

    .line 126
    .line 127
    const/4 v8, 0x0

    .line 128
    move-object/from16 v19, v4

    .line 129
    .line 130
    move/from16 v15, v18

    .line 131
    .line 132
    move-object/from16 v4, p1

    .line 133
    .line 134
    :try_start_0
    invoke-static/range {v1 .. v8}, Lsg/c;->e(Lsg/c;Lsg/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 135
    .line 136
    .line 137
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    if-eqz v8, :cond_17

    .line 139
    .line 140
    if-eq v8, v14, :cond_16

    .line 141
    .line 142
    const/4 v14, 0x2

    .line 143
    if-eq v8, v14, :cond_15

    .line 144
    .line 145
    if-eq v8, v12, :cond_14

    .line 146
    .line 147
    const-string v13, "unexpected"

    .line 148
    .line 149
    if-ne v8, v15, :cond_13

    .line 150
    .line 151
    :try_start_1
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Lsg/k;

    .line 159
    .line 160
    :goto_1
    invoke-virtual {v9, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 161
    .line 162
    .line 163
    move-result-wide v2

    .line 164
    and-long v5, v2, v16

    .line 165
    .line 166
    const/4 v14, 0x0

    .line 167
    invoke-virtual {v1, v2, v3, v14}, Lsg/c;->t(JZ)Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    sget v2, Lsg/e;->b:I

    .line 172
    .line 173
    int-to-long v14, v2

    .line 174
    move-object/from16 v20, v13

    .line 175
    .line 176
    div-long v12, v5, v14

    .line 177
    .line 178
    rem-long v14, v5, v14

    .line 179
    .line 180
    long-to-int v3, v14

    .line 181
    iget-wide v14, v0, Lvg/q;->c:J

    .line 182
    .line 183
    cmp-long v14, v14, v12

    .line 184
    .line 185
    if-eqz v14, :cond_a

    .line 186
    .line 187
    invoke-static {v1, v12, v13, v0}, Lsg/c;->b(Lsg/c;JLsg/k;)Lsg/k;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    if-nez v12, :cond_9

    .line 192
    .line 193
    if-eqz v8, :cond_8

    .line 194
    .line 195
    invoke-static {v1, v4, v7}, Lsg/c;->c(Lsg/c;Ljava/lang/Object;Lqg/g;)V

    .line 196
    .line 197
    .line 198
    move-object v4, v1

    .line 199
    goto/16 :goto_6

    .line 200
    .line 201
    :catchall_0
    move-exception v0

    .line 202
    move-object v4, v1

    .line 203
    goto/16 :goto_8

    .line 204
    .line 205
    :cond_8
    move-object/from16 v13, v20

    .line 206
    .line 207
    const/4 v12, 0x4

    .line 208
    const/4 v15, 0x5

    .line 209
    goto :goto_1

    .line 210
    :cond_9
    move v0, v2

    .line 211
    move-object v2, v12

    .line 212
    goto :goto_2

    .line 213
    :cond_a
    move/from16 v21, v2

    .line 214
    .line 215
    move-object v2, v0

    .line 216
    move/from16 v0, v21

    .line 217
    .line 218
    :goto_2
    invoke-static/range {v1 .. v8}, Lsg/c;->e(Lsg/c;Lsg/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 219
    .line 220
    .line 221
    move-result v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    move-object/from16 v21, v4

    .line 223
    .line 224
    move-object v4, v1

    .line 225
    move-object v1, v2

    .line 226
    move v2, v3

    .line 227
    move-object/from16 v3, v21

    .line 228
    .line 229
    if-eqz v12, :cond_12

    .line 230
    .line 231
    const/4 v13, 0x1

    .line 232
    if-eq v12, v13, :cond_11

    .line 233
    .line 234
    const/4 v14, 0x2

    .line 235
    if-eq v12, v14, :cond_f

    .line 236
    .line 237
    const/4 v15, 0x3

    .line 238
    if-eq v12, v15, :cond_e

    .line 239
    .line 240
    const/4 v0, 0x4

    .line 241
    if-eq v12, v0, :cond_c

    .line 242
    .line 243
    const/4 v2, 0x5

    .line 244
    if-eq v12, v2, :cond_b

    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_b
    :try_start_2
    invoke-virtual {v1}, Lvg/b;->a()V

    .line 248
    .line 249
    .line 250
    :goto_3
    move v12, v0

    .line 251
    move-object v0, v1

    .line 252
    move v15, v2

    .line 253
    move-object v1, v4

    .line 254
    move-object/from16 v13, v20

    .line 255
    .line 256
    move-object v4, v3

    .line 257
    goto :goto_1

    .line 258
    :catchall_1
    move-exception v0

    .line 259
    goto/16 :goto_8

    .line 260
    .line 261
    :cond_c
    move-object/from16 v0, v19

    .line 262
    .line 263
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 264
    .line 265
    .line 266
    move-result-wide v8

    .line 267
    cmp-long v0, v5, v8

    .line 268
    .line 269
    if-gez v0, :cond_d

    .line 270
    .line 271
    invoke-virtual {v1}, Lvg/b;->a()V

    .line 272
    .line 273
    .line 274
    :cond_d
    :goto_4
    invoke-static {v4, v3, v7}, Lsg/c;->c(Lsg/c;Ljava/lang/Object;Lqg/g;)V

    .line 275
    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 279
    .line 280
    move-object/from16 v1, v20

    .line 281
    .line 282
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v0

    .line 286
    :cond_f
    if-eqz v8, :cond_10

    .line 287
    .line 288
    invoke-virtual {v1}, Lvg/q;->h()V

    .line 289
    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_10
    add-int v3, v2, v0

    .line 293
    .line 294
    invoke-virtual {v7, v1, v3}, Lqg/g;->a(Lvg/q;I)V

    .line 295
    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_11
    :goto_5
    invoke-virtual {v7, v11}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_12
    invoke-virtual {v1}, Lvg/b;->a()V

    .line 303
    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_13
    move-object v4, v1

    .line 307
    move-object v1, v13

    .line 308
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 309
    .line 310
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v0

    .line 314
    :cond_14
    move-object v3, v4

    .line 315
    move-object/from16 v0, v19

    .line 316
    .line 317
    move-object v4, v1

    .line 318
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 319
    .line 320
    .line 321
    move-result-wide v0

    .line 322
    cmp-long v0, v5, v0

    .line 323
    .line 324
    if-gez v0, :cond_d

    .line 325
    .line 326
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_15
    move-object v4, v1

    .line 331
    add-int/2addr v3, v13

    .line 332
    invoke-virtual {v7, v2, v3}, Lqg/g;->a(Lvg/q;I)V

    .line 333
    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_16
    move-object v4, v1

    .line 337
    invoke-virtual {v7, v11}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_17
    move-object v4, v1

    .line 342
    invoke-virtual {v2}, Lvg/b;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :goto_6
    invoke-virtual {v7}, Lqg/g;->o()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    if-ne v0, v10, :cond_18

    .line 351
    .line 352
    goto :goto_7

    .line 353
    :cond_18
    move-object v0, v11

    .line 354
    :goto_7
    if-ne v0, v10, :cond_1a

    .line 355
    .line 356
    return-object v0

    .line 357
    :goto_8
    invoke-virtual {v7}, Lqg/g;->x()V

    .line 358
    .line 359
    .line 360
    throw v0

    .line 361
    :cond_19
    move-object/from16 v3, p1

    .line 362
    .line 363
    move-object v4, v1

    .line 364
    if-eqz v8, :cond_1a

    .line 365
    .line 366
    invoke-virtual {v2}, Lvg/q;->h()V

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {p0 .. p2}, Lsg/c;->y(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    if-ne v0, v10, :cond_1a

    .line 374
    .line 375
    return-object v0

    .line 376
    :cond_1a
    :goto_9
    return-object v11

    .line 377
    :cond_1b
    move-object v4, v1

    .line 378
    invoke-virtual {v2}, Lvg/b;->a()V

    .line 379
    .line 380
    .line 381
    return-object v11
.end method

.method public final r()J
    .locals 4

    .line 1
    sget-object v0, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, 0xfffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v0, v2

    .line 13
    return-wide v0
.end method

.method public final t(JZ)Z
    .locals 13

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_1d

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v0, v2, :cond_1d

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    sget-object v4, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    const-wide v5, 0xfffffffffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    if-eq v0, v3, :cond_d

    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    if-ne v0, v3, :cond_c

    .line 24
    .line 25
    and-long/2addr v5, p1

    .line 26
    invoke-virtual {p0, v5, v6}, Lsg/c;->i(J)Lsg/k;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v3, 0x0

    .line 31
    move-object v5, v3

    .line 32
    :cond_0
    sget v6, Lsg/e;->b:I

    .line 33
    .line 34
    sub-int/2addr v6, v2

    .line 35
    :goto_0
    const/4 v7, -0x1

    .line 36
    if-ge v7, v6, :cond_9

    .line 37
    .line 38
    iget-wide v8, v0, Lvg/q;->c:J

    .line 39
    .line 40
    sget v10, Lsg/e;->b:I

    .line 41
    .line 42
    int-to-long v10, v10

    .line 43
    mul-long/2addr v8, v10

    .line 44
    int-to-long v10, v6

    .line 45
    add-long/2addr v8, v10

    .line 46
    :cond_1
    invoke-virtual {v0, v6}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    sget-object v11, Lsg/e;->i:Ll3/q;

    .line 51
    .line 52
    if-eq v10, v11, :cond_a

    .line 53
    .line 54
    sget-object v11, Lsg/e;->d:Ll3/q;

    .line 55
    .line 56
    if-ne v10, v11, :cond_2

    .line 57
    .line 58
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v11

    .line 62
    cmp-long v11, v8, v11

    .line 63
    .line 64
    if-ltz v11, :cond_a

    .line 65
    .line 66
    sget-object v11, Lsg/e;->l:Ll3/q;

    .line 67
    .line 68
    invoke-virtual {v0, v10, v6, v11}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-eqz v10, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0, v6, v3}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lvg/q;->h()V

    .line 78
    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_2
    sget-object v11, Lsg/e;->e:Ll3/q;

    .line 82
    .line 83
    if-eq v10, v11, :cond_8

    .line 84
    .line 85
    if-nez v10, :cond_3

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    instance-of v11, v10, Lqg/o1;

    .line 89
    .line 90
    if-nez v11, :cond_6

    .line 91
    .line 92
    instance-of v11, v10, Lsg/q;

    .line 93
    .line 94
    if-eqz v11, :cond_4

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    sget-object v11, Lsg/e;->g:Ll3/q;

    .line 98
    .line 99
    if-eq v10, v11, :cond_a

    .line 100
    .line 101
    sget-object v12, Lsg/e;->f:Ll3/q;

    .line 102
    .line 103
    if-ne v10, v12, :cond_5

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_5
    if-eq v10, v11, :cond_1

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_6
    :goto_1
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 110
    .line 111
    .line 112
    move-result-wide v11

    .line 113
    cmp-long v11, v8, v11

    .line 114
    .line 115
    if-ltz v11, :cond_a

    .line 116
    .line 117
    instance-of v11, v10, Lsg/q;

    .line 118
    .line 119
    if-eqz v11, :cond_7

    .line 120
    .line 121
    move-object v11, v10

    .line 122
    check-cast v11, Lsg/q;

    .line 123
    .line 124
    iget-object v11, v11, Lsg/q;->a:Lqg/o1;

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_7
    move-object v11, v10

    .line 128
    check-cast v11, Lqg/o1;

    .line 129
    .line 130
    :goto_2
    sget-object v12, Lsg/e;->l:Ll3/q;

    .line 131
    .line 132
    invoke-virtual {v0, v10, v6, v12}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-eqz v10, :cond_1

    .line 137
    .line 138
    invoke-static {v5, v11}, Lvg/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v0, v6, v3}, Lsg/k;->m(ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Lvg/q;->h()V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_8
    :goto_3
    sget-object v11, Lsg/e;->l:Ll3/q;

    .line 150
    .line 151
    invoke-virtual {v0, v10, v6, v11}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    if-eqz v10, :cond_1

    .line 156
    .line 157
    invoke-virtual {v0}, Lvg/q;->h()V

    .line 158
    .line 159
    .line 160
    :goto_4
    add-int/lit8 v6, v6, -0x1

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_9
    sget-object v6, Lvg/b;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 164
    .line 165
    invoke-virtual {v6, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Lvg/b;

    .line 170
    .line 171
    check-cast v0, Lsg/k;

    .line 172
    .line 173
    if-nez v0, :cond_0

    .line 174
    .line 175
    :cond_a
    :goto_5
    if-eqz v5, :cond_1c

    .line 176
    .line 177
    instance-of v0, v5, Ljava/util/ArrayList;

    .line 178
    .line 179
    if-nez v0, :cond_b

    .line 180
    .line 181
    check-cast v5, Lqg/o1;

    .line 182
    .line 183
    invoke-virtual {p0, v5, v1}, Lsg/c;->z(Lqg/o1;Z)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_a

    .line 187
    .line 188
    :cond_b
    check-cast v5, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    sub-int/2addr v0, v2

    .line 195
    :goto_6
    if-ge v7, v0, :cond_1c

    .line 196
    .line 197
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    check-cast v3, Lqg/o1;

    .line 202
    .line 203
    invoke-virtual {p0, v3, v1}, Lsg/c;->z(Lqg/o1;Z)V

    .line 204
    .line 205
    .line 206
    add-int/lit8 v0, v0, -0x1

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_c
    const-string v1, "unexpected close status: "

    .line 210
    .line 211
    invoke-static {v0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    const/4 v0, 0x0

    .line 219
    return v0

    .line 220
    :cond_d
    and-long/2addr v5, p1

    .line 221
    invoke-virtual {p0, v5, v6}, Lsg/c;->i(J)Lsg/k;

    .line 222
    .line 223
    .line 224
    if-eqz p3, :cond_1c

    .line 225
    .line 226
    :cond_e
    :goto_7
    sget-object v0, Lsg/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 227
    .line 228
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    check-cast v3, Lsg/k;

    .line 233
    .line 234
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 235
    .line 236
    .line 237
    move-result-wide v7

    .line 238
    invoke-virtual {p0}, Lsg/c;->r()J

    .line 239
    .line 240
    .line 241
    move-result-wide v5

    .line 242
    cmp-long v5, v5, v7

    .line 243
    .line 244
    if-gtz v5, :cond_f

    .line 245
    .line 246
    goto/16 :goto_a

    .line 247
    .line 248
    :cond_f
    sget v5, Lsg/e;->b:I

    .line 249
    .line 250
    int-to-long v5, v5

    .line 251
    div-long v9, v7, v5

    .line 252
    .line 253
    iget-wide v11, v3, Lvg/q;->c:J

    .line 254
    .line 255
    cmp-long v11, v11, v9

    .line 256
    .line 257
    if-eqz v11, :cond_10

    .line 258
    .line 259
    invoke-virtual {p0, v9, v10, v3}, Lsg/c;->l(JLsg/k;)Lsg/k;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    if-nez v3, :cond_10

    .line 264
    .line 265
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, Lsg/k;

    .line 270
    .line 271
    iget-wide v5, v0, Lvg/q;->c:J

    .line 272
    .line 273
    cmp-long v0, v5, v9

    .line 274
    .line 275
    if-gez v0, :cond_e

    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_10
    invoke-virtual {v3}, Lvg/b;->a()V

    .line 279
    .line 280
    .line 281
    rem-long v5, v7, v5

    .line 282
    .line 283
    long-to-int v0, v5

    .line 284
    :cond_11
    invoke-virtual {v3, v0}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    if-eqz v5, :cond_1a

    .line 289
    .line 290
    sget-object v6, Lsg/e;->e:Ll3/q;

    .line 291
    .line 292
    if-ne v5, v6, :cond_12

    .line 293
    .line 294
    goto :goto_8

    .line 295
    :cond_12
    sget-object v0, Lsg/e;->d:Ll3/q;

    .line 296
    .line 297
    if-ne v5, v0, :cond_13

    .line 298
    .line 299
    goto :goto_b

    .line 300
    :cond_13
    sget-object v0, Lsg/e;->j:Ll3/q;

    .line 301
    .line 302
    if-ne v5, v0, :cond_14

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_14
    sget-object v0, Lsg/e;->l:Ll3/q;

    .line 306
    .line 307
    if-ne v5, v0, :cond_15

    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_15
    sget-object v0, Lsg/e;->i:Ll3/q;

    .line 311
    .line 312
    if-ne v5, v0, :cond_16

    .line 313
    .line 314
    goto :goto_9

    .line 315
    :cond_16
    sget-object v0, Lsg/e;->h:Ll3/q;

    .line 316
    .line 317
    if-ne v5, v0, :cond_17

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_17
    sget-object v0, Lsg/e;->g:Ll3/q;

    .line 321
    .line 322
    if-ne v5, v0, :cond_18

    .line 323
    .line 324
    goto :goto_b

    .line 325
    :cond_18
    sget-object v0, Lsg/e;->f:Ll3/q;

    .line 326
    .line 327
    if-ne v5, v0, :cond_19

    .line 328
    .line 329
    goto :goto_9

    .line 330
    :cond_19
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 331
    .line 332
    .line 333
    move-result-wide v5

    .line 334
    cmp-long v0, v7, v5

    .line 335
    .line 336
    if-nez v0, :cond_1b

    .line 337
    .line 338
    goto :goto_b

    .line 339
    :cond_1a
    :goto_8
    sget-object v6, Lsg/e;->h:Ll3/q;

    .line 340
    .line 341
    invoke-virtual {v3, v5, v0, v6}, Lsg/k;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    if-eqz v5, :cond_11

    .line 346
    .line 347
    invoke-virtual {p0}, Lsg/c;->k()V

    .line 348
    .line 349
    .line 350
    :cond_1b
    :goto_9
    const-wide/16 v5, 0x1

    .line 351
    .line 352
    add-long v9, v7, v5

    .line 353
    .line 354
    sget-object v5, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 355
    .line 356
    move-object v6, p0

    .line 357
    invoke-virtual/range {v5 .. v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 358
    .line 359
    .line 360
    goto/16 :goto_7

    .line 361
    .line 362
    :cond_1c
    :goto_a
    return v2

    .line 363
    :cond_1d
    :goto_b
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const/16 v4, 0x3c

    .line 15
    .line 16
    shr-long/2addr v2, v4

    .line 17
    long-to-int v2, v2

    .line 18
    const/4 v3, 0x3

    .line 19
    const/4 v4, 0x2

    .line 20
    if-eq v2, v4, :cond_1

    .line 21
    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v2, "cancelled,"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string v2, "closed,"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v5, "capacity="

    .line 39
    .line 40
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget v5, v0, Lsg/c;->g:I

    .line 44
    .line 45
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 v5, 0x2c

    .line 49
    .line 50
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v2, "data=["

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    new-array v2, v3, [Lsg/k;

    .line 66
    .line 67
    sget-object v3, Lsg/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const/4 v6, 0x0

    .line 74
    aput-object v3, v2, v6

    .line 75
    .line 76
    sget-object v3, Lsg/c;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 77
    .line 78
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const/4 v7, 0x1

    .line 83
    aput-object v3, v2, v7

    .line 84
    .line 85
    sget-object v3, Lsg/c;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 86
    .line 87
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    aput-object v3, v2, v4

    .line 92
    .line 93
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    new-instance v3, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_3

    .line 111
    .line 112
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    move-object v8, v4

    .line 117
    check-cast v8, Lsg/k;

    .line 118
    .line 119
    sget-object v9, Lsg/e;->a:Lsg/k;

    .line 120
    .line 121
    if-eq v8, v9, :cond_2

    .line 122
    .line 123
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_15

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-nez v4, :cond_4

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    move-object v4, v3

    .line 149
    check-cast v4, Lsg/k;

    .line 150
    .line 151
    iget-wide v8, v4, Lvg/q;->c:J

    .line 152
    .line 153
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    move-object v10, v4

    .line 158
    check-cast v10, Lsg/k;

    .line 159
    .line 160
    iget-wide v10, v10, Lvg/q;->c:J

    .line 161
    .line 162
    cmp-long v12, v8, v10

    .line 163
    .line 164
    if-lez v12, :cond_6

    .line 165
    .line 166
    move-object v3, v4

    .line 167
    move-wide v8, v10

    .line 168
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-nez v4, :cond_5

    .line 173
    .line 174
    :goto_2
    check-cast v3, Lsg/k;

    .line 175
    .line 176
    sget-object v2, Lsg/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 177
    .line 178
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 179
    .line 180
    .line 181
    move-result-wide v10

    .line 182
    invoke-virtual {v0}, Lsg/c;->r()J

    .line 183
    .line 184
    .line 185
    move-result-wide v12

    .line 186
    :goto_3
    sget v2, Lsg/e;->b:I

    .line 187
    .line 188
    move v4, v6

    .line 189
    :goto_4
    if-ge v4, v2, :cond_12

    .line 190
    .line 191
    iget-wide v8, v3, Lvg/q;->c:J

    .line 192
    .line 193
    sget v14, Lsg/e;->b:I

    .line 194
    .line 195
    int-to-long v14, v14

    .line 196
    mul-long/2addr v8, v14

    .line 197
    int-to-long v14, v4

    .line 198
    add-long/2addr v8, v14

    .line 199
    cmp-long v14, v8, v12

    .line 200
    .line 201
    if-ltz v14, :cond_8

    .line 202
    .line 203
    cmp-long v15, v8, v10

    .line 204
    .line 205
    if-gez v15, :cond_7

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_7
    move/from16 v16, v7

    .line 209
    .line 210
    goto/16 :goto_9

    .line 211
    .line 212
    :cond_8
    :goto_5
    invoke-virtual {v3, v4}, Lsg/k;->k(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v15

    .line 216
    iget-object v6, v3, Lsg/k;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 217
    .line 218
    move/from16 v16, v7

    .line 219
    .line 220
    mul-int/lit8 v7, v4, 0x2

    .line 221
    .line 222
    invoke-virtual {v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    instance-of v7, v15, Lqg/f;

    .line 227
    .line 228
    if-eqz v7, :cond_b

    .line 229
    .line 230
    cmp-long v7, v8, v10

    .line 231
    .line 232
    if-gez v7, :cond_9

    .line 233
    .line 234
    if-ltz v14, :cond_9

    .line 235
    .line 236
    const-string v7, "receive"

    .line 237
    .line 238
    goto/16 :goto_7

    .line 239
    .line 240
    :cond_9
    if-gez v14, :cond_a

    .line 241
    .line 242
    if-ltz v7, :cond_a

    .line 243
    .line 244
    const-string v7, "send"

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_a
    const-string v7, "cont"

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_b
    instance-of v7, v15, Lsg/q;

    .line 251
    .line 252
    if-eqz v7, :cond_c

    .line 253
    .line 254
    new-instance v7, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    const-string v8, "EB("

    .line 257
    .line 258
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const/16 v8, 0x29

    .line 265
    .line 266
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    goto :goto_7

    .line 274
    :cond_c
    sget-object v7, Lsg/e;->f:Ll3/q;

    .line 275
    .line 276
    invoke-static {v15, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    if-nez v7, :cond_f

    .line 281
    .line 282
    sget-object v7, Lsg/e;->g:Ll3/q;

    .line 283
    .line 284
    invoke-static {v15, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    if-eqz v7, :cond_d

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_d
    if-eqz v15, :cond_11

    .line 292
    .line 293
    sget-object v7, Lsg/e;->e:Ll3/q;

    .line 294
    .line 295
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    if-nez v7, :cond_11

    .line 300
    .line 301
    sget-object v7, Lsg/e;->i:Ll3/q;

    .line 302
    .line 303
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v7

    .line 307
    if-nez v7, :cond_11

    .line 308
    .line 309
    sget-object v7, Lsg/e;->h:Ll3/q;

    .line 310
    .line 311
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    if-nez v7, :cond_11

    .line 316
    .line 317
    sget-object v7, Lsg/e;->k:Ll3/q;

    .line 318
    .line 319
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    if-nez v7, :cond_11

    .line 324
    .line 325
    sget-object v7, Lsg/e;->j:Ll3/q;

    .line 326
    .line 327
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    if-nez v7, :cond_11

    .line 332
    .line 333
    sget-object v7, Lsg/e;->l:Ll3/q;

    .line 334
    .line 335
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    if-eqz v7, :cond_e

    .line 340
    .line 341
    goto :goto_8

    .line 342
    :cond_e
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v7

    .line 346
    goto :goto_7

    .line 347
    :cond_f
    :goto_6
    const-string v7, "resuming_sender"

    .line 348
    .line 349
    :goto_7
    if-eqz v6, :cond_10

    .line 350
    .line 351
    new-instance v8, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    const-string v9, "("

    .line 354
    .line 355
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    const-string v6, "),"

    .line 368
    .line 369
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    goto :goto_8

    .line 380
    :cond_10
    new-instance v6, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    :cond_11
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 399
    .line 400
    move/from16 v7, v16

    .line 401
    .line 402
    const/4 v6, 0x0

    .line 403
    goto/16 :goto_4

    .line 404
    .line 405
    :cond_12
    move/from16 v16, v7

    .line 406
    .line 407
    invoke-virtual {v3}, Lvg/b;->b()Lvg/b;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    move-object v3, v2

    .line 412
    check-cast v3, Lsg/k;

    .line 413
    .line 414
    if-nez v3, :cond_14

    .line 415
    .line 416
    :goto_9
    invoke-static {v1}, Log/m;->u0(Ljava/lang/CharSequence;)C

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    if-ne v2, v5, :cond_13

    .line 421
    .line 422
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    add-int/lit8 v2, v2, -0x1

    .line 427
    .line 428
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    :cond_13
    const-string v2, "]"

    .line 436
    .line 437
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    return-object v1

    .line 445
    :cond_14
    move/from16 v7, v16

    .line 446
    .line 447
    const/4 v6, 0x0

    .line 448
    goto/16 :goto_3

    .line 449
    .line 450
    :cond_15
    invoke-static {}, Lbsh/j;->e()V

    .line 451
    .line 452
    .line 453
    const/4 v1, 0x0

    .line 454
    return-object v1
.end method

.method public final u()Z
    .locals 3

    .line 1
    sget-object v0, Lsg/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p0, v0, v1, v2}, Lsg/c;->t(JZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public v()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final w()Z
    .locals 4

    .line 1
    sget-object v0, Lsg/c;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    const-wide v2, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0

    .line 25
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 26
    return v0
.end method

.method public final x(JLsg/k;)V
    .locals 4

    .line 1
    :goto_0
    iget-wide v0, p3, Lvg/q;->c:J

    .line 2
    .line 3
    cmp-long v0, v0, p1

    .line 4
    .line 5
    if-gez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p3}, Lvg/b;->b()Lvg/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lsg/k;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    move-object p3, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    :goto_1
    invoke-virtual {p3}, Lvg/q;->c()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    invoke-virtual {p3}, Lvg/b;->b()Lvg/b;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lsg/k;

    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object p3, p1

    .line 34
    goto :goto_1

    .line 35
    :cond_3
    :goto_2
    sget-object p1, Lsg/c;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, Lvg/q;

    .line 42
    .line 43
    iget-wide v0, p2, Lvg/q;->c:J

    .line 44
    .line 45
    iget-wide v2, p3, Lvg/q;->c:J

    .line 46
    .line 47
    cmp-long v0, v0, v2

    .line 48
    .line 49
    if-ltz v0, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    invoke-virtual {p3}, Lvg/q;->i()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_5
    invoke-virtual {p1, p0, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_7

    .line 64
    .line 65
    invoke-virtual {p2}, Lvg/q;->e()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_6

    .line 70
    .line 71
    invoke-virtual {p2}, Lvg/b;->d()V

    .line 72
    .line 73
    .line 74
    :cond_6
    :goto_3
    return-void

    .line 75
    :cond_7
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eq v0, p2, :cond_5

    .line 80
    .line 81
    invoke-virtual {p3}, Lvg/q;->e()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p3}, Lvg/b;->d()V

    .line 88
    .line 89
    .line 90
    goto :goto_2
.end method

.method public final y(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Lqg/g;

    .line 2
    .line 3
    invoke-static {p2}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, Lqg/g;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lqg/g;->p()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lsg/c;->o()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    new-instance v0, Lsf/f;

    .line 19
    .line 20
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lqg/g;->o()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 31
    .line 32
    if-ne p1, p2, :cond_0

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 36
    .line 37
    return-object p1
.end method

.method public final z(Lqg/o1;Z)V
    .locals 1

    .line 1
    instance-of v0, p1, Lqg/f;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lwf/c;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lsg/c;->n()Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lsg/c;->o()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    :goto_0
    new-instance v0, Lsf/f;

    .line 19
    .line 20
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, Lwf/c;->resumeWith(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    instance-of p2, p1, Lsg/b;

    .line 28
    .line 29
    if-eqz p2, :cond_3

    .line 30
    .line 31
    check-cast p1, Lsg/b;

    .line 32
    .line 33
    iget-object p2, p1, Lsg/b;->h:Lqg/g;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-object v0, p1, Lsg/b;->h:Lqg/g;

    .line 40
    .line 41
    sget-object v0, Lsg/e;->l:Ll3/q;

    .line 42
    .line 43
    iput-object v0, p1, Lsg/b;->g:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p1, p1, Lsg/b;->i:Lsg/c;

    .line 46
    .line 47
    invoke-virtual {p1}, Lsg/c;->m()Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    new-instance v0, Lsf/f;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, v0}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    const-string p2, "Unexpected waiter: "

    .line 69
    .line 70
    invoke-static {p1, p2}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

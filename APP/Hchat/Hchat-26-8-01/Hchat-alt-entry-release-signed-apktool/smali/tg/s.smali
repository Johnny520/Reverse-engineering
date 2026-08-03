.class public abstract Ltg/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ll3/q;

.field public static final b:Ll3/q;

.field public static final c:Ll3/q;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll3/q;

    .line 2
    .line 3
    const-string v1, "NO_VALUE"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ltg/s;->a:Ll3/q;

    .line 10
    .line 11
    new-instance v0, Ll3/q;

    .line 12
    .line 13
    const-string v1, "NONE"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Ltg/s;->b:Ll3/q;

    .line 19
    .line 20
    new-instance v0, Ll3/q;

    .line 21
    .line 22
    const-string v1, "PENDING"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ltg/s;->c:Ll3/q;

    .line 28
    .line 29
    return-void
.end method

.method public static a(ILsg/a;)Ltg/r;
    .locals 2

    .line 1
    and-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :goto_0
    and-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    const/16 v1, 0x10

    .line 15
    .line 16
    :goto_1
    if-gtz v0, :cond_3

    .line 17
    .line 18
    if-gtz v1, :cond_3

    .line 19
    .line 20
    sget-object p0, Lsg/a;->g:Lsg/a;

    .line 21
    .line 22
    if-ne p1, p0, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    const-string p0, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "

    .line 26
    .line 27
    invoke-static {p1, p0}, Lj8/o;->z(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_3
    :goto_2
    add-int/2addr v1, v0

    .line 33
    if-gez v1, :cond_4

    .line 34
    .line 35
    const v1, 0x7fffffff

    .line 36
    .line 37
    .line 38
    :cond_4
    new-instance p0, Ltg/r;

    .line 39
    .line 40
    invoke-direct {p0, v0, v1, p1}, Ltg/r;-><init>(IILsg/a;)V

    .line 41
    .line 42
    .line 43
    return-object p0
.end method

.method public static final b(Ljava/lang/Object;)Ltg/b0;
    .locals 1

    .line 1
    new-instance v0, Ltg/b0;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lug/c;->b:Ll3/q;

    .line 6
    .line 7
    :cond_0
    invoke-direct {v0, p0}, Ltg/b0;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final c([Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 0

    .line 1
    long-to-int p1, p1

    .line 2
    array-length p2, p0

    .line 3
    add-int/lit8 p2, p2, -0x1

    .line 4
    .line 5
    and-int/2addr p1, p2

    .line 6
    aput-object p3, p0, p1

    .line 7
    .line 8
    return-void
.end method

.method public static final d(Ltg/d;)Ltg/d;
    .locals 1

    .line 1
    instance-of v0, p0, Ltg/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Ltg/c;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    new-instance v0, Ltg/c;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ltg/c;-><init>(Ltg/d;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final e(Ltg/e;Lsg/o;ZLyf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Ltg/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ltg/f;

    .line 7
    .line 8
    iget v1, v0, Ltg/f;->l:I

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
    iput v1, v0, Ltg/f;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ltg/f;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ltg/f;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ltg/f;->l:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    if-eq v1, v4, :cond_3

    .line 37
    .line 38
    if-ne v1, v3, :cond_2

    .line 39
    .line 40
    iget-boolean p2, v0, Ltg/f;->j:Z

    .line 41
    .line 42
    iget-object p0, v0, Ltg/f;->i:Lsg/b;

    .line 43
    .line 44
    iget-object p1, v0, Ltg/f;->h:Lsg/g;

    .line 45
    .line 46
    iget-object v1, v0, Ltg/f;->g:Ltg/e;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :cond_1
    move-object p3, p0

    .line 52
    move-object p0, v1

    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_4

    .line 56
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    return-object p0

    .line 63
    :cond_3
    iget-boolean p2, v0, Ltg/f;->j:Z

    .line 64
    .line 65
    iget-object p0, v0, Ltg/f;->i:Lsg/b;

    .line 66
    .line 67
    iget-object p1, v0, Ltg/f;->h:Lsg/g;

    .line 68
    .line 69
    iget-object v1, v0, Ltg/f;->g:Ltg/e;

    .line 70
    .line 71
    :try_start_1
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :try_start_2
    invoke-virtual {p1}, Lsg/o;->iterator()Lsg/b;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    :goto_1
    iput-object p0, v0, Ltg/f;->g:Ltg/e;

    .line 83
    .line 84
    iput-object p1, v0, Ltg/f;->h:Lsg/g;

    .line 85
    .line 86
    iput-object p3, v0, Ltg/f;->i:Lsg/b;

    .line 87
    .line 88
    iput-boolean p2, v0, Ltg/f;->j:Z

    .line 89
    .line 90
    iput v4, v0, Ltg/f;->l:I

    .line 91
    .line 92
    invoke-virtual {p3, v0}, Lsg/b;->b(Lyf/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-ne v1, v5, :cond_5

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    move-object v6, v1

    .line 100
    move-object v1, p0

    .line 101
    move-object p0, p3

    .line 102
    move-object p3, v6

    .line 103
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    if-eqz p3, :cond_6

    .line 110
    .line 111
    invoke-virtual {p0}, Lsg/b;->c()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    iput-object v1, v0, Ltg/f;->g:Ltg/e;

    .line 116
    .line 117
    iput-object p1, v0, Ltg/f;->h:Lsg/g;

    .line 118
    .line 119
    iput-object p0, v0, Ltg/f;->i:Lsg/b;

    .line 120
    .line 121
    iput-boolean p2, v0, Ltg/f;->j:Z

    .line 122
    .line 123
    iput v3, v0, Ltg/f;->l:I

    .line 124
    .line 125
    invoke-interface {v1, p3, v0}, Ltg/e;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    if-ne p3, v5, :cond_1

    .line 130
    .line 131
    :goto_3
    return-object v5

    .line 132
    :cond_6
    if-eqz p2, :cond_7

    .line 133
    .line 134
    invoke-interface {p1, v2}, Lsg/g;->a(Ljava/util/concurrent/CancellationException;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 138
    .line 139
    return-object p0

    .line 140
    :goto_4
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 141
    :catchall_1
    move-exception p3

    .line 142
    if-eqz p2, :cond_a

    .line 143
    .line 144
    instance-of p2, p0, Ljava/util/concurrent/CancellationException;

    .line 145
    .line 146
    if-eqz p2, :cond_8

    .line 147
    .line 148
    move-object v2, p0

    .line 149
    check-cast v2, Ljava/util/concurrent/CancellationException;

    .line 150
    .line 151
    :cond_8
    if-nez v2, :cond_9

    .line 152
    .line 153
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 154
    .line 155
    const-string p2, "Channel was consumed, consumer had failed"

    .line 156
    .line 157
    invoke-direct {v2, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    :cond_9
    invoke-interface {p1, v2}, Lsg/g;->a(Ljava/util/concurrent/CancellationException;)V

    .line 164
    .line 165
    .line 166
    :cond_a
    throw p3
.end method

.method public static final f(Ltg/d;Lfg/p;Lyf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lug/c;->b:Ll3/q;

    .line 2
    .line 3
    instance-of v1, p2, Ltg/l;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, Ltg/l;

    .line 9
    .line 10
    iget v2, v1, Ltg/l;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Ltg/l;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ltg/l;

    .line 23
    .line 24
    invoke-direct {v1, p2}, Lyf/c;-><init>(Lwf/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, Ltg/l;->j:Ljava/lang/Object;

    .line 28
    .line 29
    iget v2, v1, Ltg/l;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v1, Ltg/l;->i:Lh0/l0;

    .line 37
    .line 38
    iget-object p1, v1, Ltg/l;->h:Lgg/u;

    .line 39
    .line 40
    iget-object v1, v1, Ltg/l;->g:Lyf/i;

    .line 41
    .line 42
    check-cast v1, Lfg/p;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lug/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception p2

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Lgg/u;

    .line 61
    .line 62
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p2, Lgg/u;->g:Ljava/lang/Object;

    .line 66
    .line 67
    new-instance v2, Lh0/l0;

    .line 68
    .line 69
    const/4 v4, 0x2

    .line 70
    invoke-direct {v2, p1, v4, p2}, Lh0/l0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :try_start_1
    move-object v4, p1

    .line 74
    check-cast v4, Lyf/i;

    .line 75
    .line 76
    iput-object v4, v1, Ltg/l;->g:Lyf/i;

    .line 77
    .line 78
    iput-object p2, v1, Ltg/l;->h:Lgg/u;

    .line 79
    .line 80
    iput-object v2, v1, Ltg/l;->i:Lh0/l0;

    .line 81
    .line 82
    iput v3, v1, Ltg/l;->k:I

    .line 83
    .line 84
    invoke-interface {p0, v2, v1}, Ltg/d;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0
    :try_end_1
    .catch Lug/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 88
    sget-object v1, Lxf/a;->g:Lxf/a;

    .line 89
    .line 90
    if-ne p0, v1, :cond_3

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_3
    move-object v1, p1

    .line 94
    move-object p1, p2

    .line 95
    goto :goto_2

    .line 96
    :catch_1
    move-exception p0

    .line 97
    move-object v1, p1

    .line 98
    move-object p1, p2

    .line 99
    move-object p2, p0

    .line 100
    move-object p0, v2

    .line 101
    :goto_1
    iget-object v2, p2, Lug/a;->g:Ljava/lang/Object;

    .line 102
    .line 103
    if-ne v2, p0, :cond_5

    .line 104
    .line 105
    :goto_2
    iget-object p0, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 106
    .line 107
    if-eq p0, v0, :cond_4

    .line 108
    .line 109
    return-object p0

    .line 110
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 111
    .line 112
    new-instance p1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string p2, "Expected at least one element matching the predicate "

    .line 115
    .line 116
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p0

    .line 130
    :cond_5
    throw p2
.end method

.method public static final g(Lxb/g;Lyf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lug/c;->b:Ll3/q;

    .line 2
    .line 3
    instance-of v1, p1, Ltg/k;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Ltg/k;

    .line 9
    .line 10
    iget v2, v1, Ltg/k;->j:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Ltg/k;->j:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ltg/k;

    .line 23
    .line 24
    invoke-direct {v1, p1}, Lyf/c;-><init>(Lwf/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Ltg/k;->i:Ljava/lang/Object;

    .line 28
    .line 29
    iget v2, v1, Ltg/k;->j:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v1, Ltg/k;->h:Lci/i;

    .line 37
    .line 38
    iget-object v1, v1, Ltg/k;->g:Lgg/u;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lug/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lgg/u;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v0, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 62
    .line 63
    new-instance v2, Lci/i;

    .line 64
    .line 65
    const/4 v4, 0x3

    .line 66
    invoke-direct {v2, p1, v4}, Lci/i;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    :try_start_1
    iput-object p1, v1, Ltg/k;->g:Lgg/u;

    .line 70
    .line 71
    iput-object v2, v1, Ltg/k;->h:Lci/i;

    .line 72
    .line 73
    iput v3, v1, Ltg/k;->j:I

    .line 74
    .line 75
    invoke-virtual {p0, v2, v1}, Lxb/g;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_1
    .catch Lug/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 79
    sget-object v1, Lxf/a;->g:Lxf/a;

    .line 80
    .line 81
    if-ne p0, v1, :cond_3

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_3
    move-object v1, p1

    .line 85
    goto :goto_3

    .line 86
    :catch_1
    move-exception p0

    .line 87
    move-object v1, p1

    .line 88
    move-object p1, p0

    .line 89
    move-object p0, v2

    .line 90
    :goto_2
    iget-object v2, p1, Lug/a;->g:Ljava/lang/Object;

    .line 91
    .line 92
    if-ne v2, p0, :cond_5

    .line 93
    .line 94
    :goto_3
    iget-object p0, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 95
    .line 96
    if-eq p0, v0, :cond_4

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_4
    const-string p0, "Expected at least one element"

    .line 100
    .line 101
    invoke-static {p0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    throw p1
.end method

.method public static final h(Lm/a;Lvg/c;Ltg/y;Ljava/lang/Float;)Ltg/o;
    .locals 10

    .line 1
    sget-object v0, Lsg/g;->e:Lsg/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lsg/f;->a:Lsg/f;

    .line 7
    .line 8
    const/16 v0, 0x9

    .line 9
    .line 10
    new-instance v1, Lp4/t;

    .line 11
    .line 12
    sget-object v2, Lwf/h;->g:Lwf/h;

    .line 13
    .line 14
    invoke-direct {v1, p0, v0, v2}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p3}, Ltg/s;->b(Ljava/lang/Object;)Ltg/b0;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    iget-object p0, v1, Lp4/t;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lwf/g;

    .line 24
    .line 25
    iget-object v0, v1, Lp4/t;->h:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v5, v0

    .line 28
    check-cast v5, Ltg/d;

    .line 29
    .line 30
    sget-object v0, Ltg/v;->a:Ltg/w;

    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ltg/y;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    sget-object v0, Lqg/u;->g:Lqg/u;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v0, Lqg/u;->j:Lqg/u;

    .line 42
    .line 43
    :goto_0
    new-instance v3, Lci/e;

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/16 v9, 0x8

    .line 47
    .line 48
    move-object v4, p2

    .line 49
    move-object v7, p3

    .line 50
    invoke-direct/range {v3 .. v9}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lvg/c;->n()Lwf/g;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 p2, 0x1

    .line 58
    invoke-static {p1, p0, p2}, Lqg/v;->h(Lwf/g;Lwf/g;Z)Lwf/g;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    sget-object p1, Lqg/c0;->a:Lxg/e;

    .line 63
    .line 64
    if-eq p0, p1, :cond_1

    .line 65
    .line 66
    sget-object p3, Lwf/d;->g:Lwf/d;

    .line 67
    .line 68
    invoke-interface {p0, p3}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    if-nez p3, :cond_1

    .line 73
    .line 74
    invoke-interface {p0, p1}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :cond_1
    sget-object p1, Lqg/u;->h:Lqg/u;

    .line 79
    .line 80
    if-ne v0, p1, :cond_2

    .line 81
    .line 82
    new-instance p1, Lqg/z0;

    .line 83
    .line 84
    invoke-direct {p1, p0, v3}, Lqg/z0;-><init>(Lwf/g;Lfg/p;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    new-instance p1, Lqg/e1;

    .line 89
    .line 90
    invoke-direct {p1, p0, p2}, Lqg/a;-><init>(Lwf/g;Z)V

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-virtual {p1, v0, p1, v3}, Lqg/a;->c0(Lqg/u;Lqg/a;Lfg/p;)V

    .line 94
    .line 95
    .line 96
    new-instance p0, Ltg/o;

    .line 97
    .line 98
    invoke-direct {p0, v6}, Ltg/o;-><init>(Ltg/b0;)V

    .line 99
    .line 100
    .line 101
    return-object p0
.end method

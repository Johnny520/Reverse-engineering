.class public abstract Lqg/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ll3/q;

.field public static final b:Ll3/q;

.field public static final c:Ll3/q;

.field public static final d:Ll3/q;

.field public static final e:Ll3/q;

.field public static final f:Ll3/q;

.field public static final g:Ll3/q;

.field public static final h:Ll3/q;

.field public static final i:Lqg/f0;

.field public static final j:Lqg/f0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll3/q;

    .line 2
    .line 3
    const-string v1, "RESUME_TOKEN"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lqg/v;->a:Ll3/q;

    .line 10
    .line 11
    new-instance v0, Ll3/q;

    .line 12
    .line 13
    const-string v1, "REMOVED_TASK"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lqg/v;->b:Ll3/q;

    .line 19
    .line 20
    new-instance v0, Ll3/q;

    .line 21
    .line 22
    const-string v1, "CLOSED_EMPTY"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lqg/v;->c:Ll3/q;

    .line 28
    .line 29
    new-instance v0, Ll3/q;

    .line 30
    .line 31
    const-string v1, "COMPLETING_ALREADY"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lqg/v;->d:Ll3/q;

    .line 37
    .line 38
    new-instance v0, Ll3/q;

    .line 39
    .line 40
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lqg/v;->e:Ll3/q;

    .line 46
    .line 47
    new-instance v0, Ll3/q;

    .line 48
    .line 49
    const-string v1, "COMPLETING_RETRY"

    .line 50
    .line 51
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lqg/v;->f:Ll3/q;

    .line 55
    .line 56
    new-instance v0, Ll3/q;

    .line 57
    .line 58
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 59
    .line 60
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lqg/v;->g:Ll3/q;

    .line 64
    .line 65
    new-instance v0, Ll3/q;

    .line 66
    .line 67
    const-string v1, "SEALED"

    .line 68
    .line 69
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lqg/v;->h:Ll3/q;

    .line 73
    .line 74
    new-instance v0, Lqg/f0;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-direct {v0, v1}, Lqg/f0;-><init>(Z)V

    .line 78
    .line 79
    .line 80
    sput-object v0, Lqg/v;->i:Lqg/f0;

    .line 81
    .line 82
    new-instance v0, Lqg/f0;

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    invoke-direct {v0, v1}, Lqg/f0;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    sput-object v0, Lqg/v;->j:Lqg/f0;

    .line 89
    .line 90
    return-void
.end method

.method public static final a(Lwf/g;)Lvg/c;
    .locals 3

    .line 1
    new-instance v0, Lvg/c;

    .line 2
    .line 3
    sget-object v1, Lqg/q;->h:Lqg/q;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v1, Lqg/t0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, v2}, Lqg/t0;-><init>(Lqg/r0;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v1}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-direct {v0, p0}, Lvg/c;-><init>(Lwf/g;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final b(Lyf/c;)V
    .locals 4

    .line 1
    instance-of v0, p0, Lqg/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lqg/z;

    .line 7
    .line 8
    iget v1, v0, Lqg/z;->h:I

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
    iput v1, v0, Lqg/z;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqg/z;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lqg/z;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lqg/z;->h:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput v2, v0, Lqg/z;->h:I

    .line 48
    .line 49
    new-instance p0, Lqg/g;

    .line 50
    .line 51
    invoke-static {v0}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p0, v2, v0}, Lqg/g;-><init>(ILwf/c;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lqg/g;->p()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lqg/g;->o()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 66
    .line 67
    if-ne p0, v0, :cond_3

    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    :goto_1
    invoke-static {}, Lokio/a;->c()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public static final c(Lqg/t;Ls1/w;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Lqg/t;->n()Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lqg/q;->h:Lqg/q;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lqg/r0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p1, "Scope cannot be cancelled because it does not have a job: "

    .line 20
    .line 21
    invoke-static {p0, p1}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final d(Lqg/r0;Lyf/i;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 3
    .line 4
    .line 5
    invoke-interface {p0, p1}, Lqg/r0;->g(Lyf/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 10
    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final e(Lfg/p;Lwf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lvg/p;

    .line 2
    .line 3
    invoke-interface {p1}, Lwf/c;->getContext()Lwf/g;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p1, v1}, Lvg/p;-><init>(Lwf/c;Lwf/g;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v0, p0}, Lfb/v0;->L(Lvg/p;Lvg/p;Lfg/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final f(JLwf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lqg/g;

    .line 9
    .line 10
    invoke-static {p2}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p2}, Lqg/g;-><init>(ILwf/c;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lqg/g;->p()V

    .line 19
    .line 20
    .line 21
    const-wide v1, 0x7fffffffffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long p2, p0, v1

    .line 27
    .line 28
    if-gez p2, :cond_1

    .line 29
    .line 30
    iget-object p2, v0, Lqg/g;->k:Lwf/g;

    .line 31
    .line 32
    invoke-static {p2}, Lqg/v;->i(Lwf/g;)Lqg/y;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p2, p0, p1, v0}, Lqg/y;->u(JLqg/g;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0}, Lqg/g;->o()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 44
    .line 45
    if-ne p0, p1, :cond_2

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    :goto_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    return-object p0
.end method

.method public static final g(Lwf/g;)V
    .locals 1

    .line 1
    sget-object v0, Lqg/q;->h:Lqg/q;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqg/r0;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Lqg/r0;->b()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p0}, Lqg/r0;->h()Ljava/util/concurrent/CancellationException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    throw p0

    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public static final h(Lwf/g;Lwf/g;Z)Lwf/g;
    .locals 3

    .line 1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, Li2/y;

    .line 4
    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v0, p2}, Lwf/g;->k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v1, Li2/y;

    .line 21
    .line 22
    const/16 v2, 0xd

    .line 23
    .line 24
    invoke-direct {v1, v2}, Li2/y;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v1, p2}, Lwf/g;->k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    if-nez p2, :cond_0

    .line 40
    .line 41
    invoke-interface {p0, p1}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_0
    new-instance v0, Li2/y;

    .line 47
    .line 48
    const/16 v1, 0xb

    .line 49
    .line 50
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 51
    .line 52
    .line 53
    sget-object v1, Lwf/h;->g:Lwf/h;

    .line 54
    .line 55
    invoke-interface {p0, v0, v1}, Lwf/g;->k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lwf/g;

    .line 60
    .line 61
    if-eqz p2, :cond_1

    .line 62
    .line 63
    check-cast p1, Lwf/g;

    .line 64
    .line 65
    new-instance p2, Li2/y;

    .line 66
    .line 67
    const/16 v0, 0xc

    .line 68
    .line 69
    invoke-direct {p2, v0}, Li2/y;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, p2, v1}, Lwf/g;->k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :cond_1
    check-cast p1, Lwf/g;

    .line 77
    .line 78
    invoke-interface {p0, p1}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method

.method public static final i(Lwf/g;)Lqg/y;
    .locals 1

    .line 1
    sget-object v0, Lwf/d;->g:Lwf/d;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Lqg/y;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Lqg/y;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    sget-object p0, Lqg/x;->a:Lqg/y;

    .line 18
    .line 19
    :cond_1
    return-object p0
.end method

.method public static final j(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final k(Lwf/g;)Lqg/r0;
    .locals 1

    .line 1
    sget-object v0, Lqg/q;->h:Lqg/q;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqg/r0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const-string v0, "Current context doesn\'t contain Job in it: "

    .line 13
    .line 14
    invoke-static {p0, v0}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static final l(Lwf/c;)Lqg/g;
    .locals 6

    .line 1
    instance-of v0, p0, Lvg/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lqg/g;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, Lqg/g;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, Lvg/f;

    .line 14
    .line 15
    sget-object v1, Lvg/a;->c:Ll3/q;

    .line 16
    .line 17
    sget-object v2, Lvg/f;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 18
    .line 19
    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v3, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    instance-of v5, v3, Lqg/g;

    .line 32
    .line 33
    if-eqz v5, :cond_8

    .line 34
    .line 35
    :cond_3
    invoke-virtual {v2, v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_7

    .line 40
    .line 41
    check-cast v3, Lqg/g;

    .line 42
    .line 43
    :goto_1
    if-eqz v3, :cond_6

    .line 44
    .line 45
    sget-object v0, Lqg/g;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    instance-of v2, v1, Lqg/m;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    check-cast v1, Lqg/m;

    .line 56
    .line 57
    iget-object v1, v1, Lqg/m;->d:Ljava/lang/Object;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v3}, Lqg/g;->l()V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    sget-object v1, Lqg/g;->l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 66
    .line 67
    const v2, 0x1fffffff

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    sget-object v1, Lqg/b;->a:Lqg/b;

    .line 74
    .line 75
    invoke-virtual {v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v4, v3

    .line 79
    :goto_2
    if-nez v4, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    return-object v4

    .line 83
    :cond_6
    :goto_3
    new-instance v0, Lqg/g;

    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    invoke-direct {v0, v1, p0}, Lqg/g;-><init>(ILwf/c;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_7
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-eq v5, v3, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_8
    if-eq v3, v1, :cond_1

    .line 98
    .line 99
    instance-of v4, v3, Ljava/lang/Throwable;

    .line 100
    .line 101
    if-eqz v4, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    const-string p0, "Inconsistent state "

    .line 105
    .line 106
    invoke-static {v3, p0}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 p0, 0x0

    .line 110
    return-object p0
.end method

.method public static final m(Ljava/lang/Throwable;Lwf/g;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lqg/q;->g:Lqg/q;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqg/r;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p0, p1}, Lqg/r;->m(Ljava/lang/Throwable;Lwf/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p0, p1}, Lvg/a;->d(Ljava/lang/Throwable;Lwf/g;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    if-ne p0, v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, p0}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p0, v1

    .line 35
    :goto_1
    invoke-static {p0, p1}, Lvg/a;->d(Ljava/lang/Throwable;Lwf/g;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final n(Lqg/r0;ZLqg/u0;)Lqg/d0;
    .locals 10

    .line 1
    instance-of v0, p0, Lqg/y0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lqg/y0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lqg/y0;->M(ZLqg/u0;)Lqg/d0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p2}, Lqg/u0;->k()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-instance v1, Lp8/p;

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    const/16 v9, 0xd

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const-class v4, Lqg/u0;

    .line 23
    .line 24
    const-string v5, "invoke"

    .line 25
    .line 26
    const-string v6, "invoke(Ljava/lang/Throwable;)V"

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    move-object v3, p2

    .line 30
    invoke-direct/range {v1 .. v9}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, v0, p1, v1}, Lqg/r0;->c(ZZLp8/p;)Lqg/d0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static final o(Lqg/t;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lqg/t;->n()Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lqg/q;->h:Lqg/q;

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lqg/r0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Lqg/r0;->b()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static final p(Lwf/g;)Z
    .locals 1

    .line 1
    sget-object v0, Lqg/q;->h:Lqg/q;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqg/r0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lqg/r0;->b()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lwf/h;->g:Lwf/h;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    sget-object p3, Lqg/u;->g:Lqg/u;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    sget-object p3, Lqg/u;->j:Lqg/u;

    .line 15
    .line 16
    :goto_0
    invoke-interface {p0}, Lqg/t;->n()Lwf/g;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-static {p0, p1, v0}, Lqg/v;->h(Lwf/g;Lwf/g;Z)Lwf/g;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object p1, Lqg/c0;->a:Lxg/e;

    .line 26
    .line 27
    if-eq p0, p1, :cond_2

    .line 28
    .line 29
    sget-object v1, Lwf/d;->g:Lwf/d;

    .line 30
    .line 31
    invoke-interface {p0, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    invoke-interface {p0, p1}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :cond_2
    sget-object p1, Lqg/u;->h:Lqg/u;

    .line 42
    .line 43
    if-ne p3, p1, :cond_3

    .line 44
    .line 45
    new-instance p1, Lqg/z0;

    .line 46
    .line 47
    invoke-direct {p1, p0, p2}, Lqg/z0;-><init>(Lwf/g;Lfg/p;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    new-instance p1, Lqg/e1;

    .line 52
    .line 53
    invoke-direct {p1, p0, v0}, Lqg/a;-><init>(Lwf/g;Z)V

    .line 54
    .line 55
    .line 56
    :goto_1
    invoke-virtual {p1, p3, p1, p2}, Lqg/a;->c0(Lqg/u;Lqg/a;Lfg/p;)V

    .line 57
    .line 58
    .line 59
    return-object p1
.end method

.method public static final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lqg/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lqg/n;

    .line 6
    .line 7
    iget-object p0, p0, Lqg/n;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {p0}, Lf8/i;->q(Ljava/lang/Throwable;)Lsf/f;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method public static final s(Lqg/g;Lwf/c;Z)V
    .locals 2

    .line 1
    sget-object v0, Lqg/g;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lqg/g;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance p0, Lsf/f;

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0, v0}, Lqg/g;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    if-eqz p2, :cond_6

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast p1, Lvg/f;

    .line 29
    .line 30
    iget-object p2, p1, Lvg/f;->k:Lyf/c;

    .line 31
    .line 32
    iget-object p1, p1, Lvg/f;->m:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {p2}, Lwf/c;->getContext()Lwf/g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0, p1}, Lvg/a;->l(Lwf/g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object v1, Lvg/a;->d:Ll3/q;

    .line 43
    .line 44
    if-eq p1, v1, :cond_1

    .line 45
    .line 46
    invoke-static {p2, v0, p1}, Lqg/v;->w(Lwf/c;Lwf/g;Ljava/lang/Object;)Lqg/m1;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    :goto_1
    :try_start_0
    invoke-interface {p2, p0}, Lwf/c;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1}, Lqg/m1;->d0()Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    return-void

    .line 65
    :cond_3
    :goto_2
    invoke-static {v0, p1}, Lvg/a;->g(Lwf/g;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    invoke-virtual {v1}, Lqg/m1;->d0()Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_5

    .line 77
    .line 78
    :cond_4
    invoke-static {v0, p1}, Lvg/a;->g(Lwf/g;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    throw p0

    .line 82
    :cond_6
    invoke-interface {p1, p0}, Lwf/c;->resumeWith(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public static final t(Lqg/j1;Lfg/p;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lvg/p;->j:Lwf/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lwf/c;->getContext()Lwf/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lqg/v;->i(Lwf/g;)Lqg/y;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, Lqg/j1;->k:J

    .line 12
    .line 13
    iget-object v3, p0, Lqg/a;->i:Lwf/g;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, p0, v3}, Lqg/y;->q(JLqg/j1;Lwf/g;)Lqg/d0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lqg/e0;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, v0, v2}, Lqg/e0;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-static {p0, v0, v1}, Lqg/v;->n(Lqg/r0;ZLqg/u0;)Lqg/d0;

    .line 27
    .line 28
    .line 29
    :try_start_0
    instance-of v0, p1, Lyf/a;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    invoke-static {p1, p0, p0}, Lfb/v0;->Q(Lfg/p;Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v0, 0x2

    .line 41
    invoke-static {v0, p1}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, p0, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_1

    .line 49
    :goto_0
    new-instance v0, Lqg/n;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, p1, v1}, Lqg/n;-><init>(Ljava/lang/Throwable;Z)V

    .line 53
    .line 54
    .line 55
    move-object p1, v0

    .line 56
    :goto_1
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 57
    .line 58
    if-ne p1, v0, :cond_1

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_1
    invoke-virtual {p0, p1}, Lqg/y0;->O(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v2, Lqg/v;->e:Ll3/q;

    .line 66
    .line 67
    if-ne v1, v2, :cond_2

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    instance-of v0, v1, Lqg/n;

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    check-cast v1, Lqg/n;

    .line 75
    .line 76
    iget-object v0, v1, Lqg/n;->a:Ljava/lang/Throwable;

    .line 77
    .line 78
    instance-of v1, v0, Lqg/i1;

    .line 79
    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    move-object v1, v0

    .line 83
    check-cast v1, Lqg/i1;

    .line 84
    .line 85
    iget-object v1, v1, Lqg/i1;->g:Lqg/j1;

    .line 86
    .line 87
    if-ne v1, p0, :cond_4

    .line 88
    .line 89
    instance-of p0, p1, Lqg/n;

    .line 90
    .line 91
    if-nez p0, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    check-cast p1, Lqg/n;

    .line 95
    .line 96
    iget-object p0, p1, Lqg/n;->a:Ljava/lang/Throwable;

    .line 97
    .line 98
    throw p0

    .line 99
    :cond_4
    throw v0

    .line 100
    :cond_5
    invoke-static {v1}, Lqg/v;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_2
    move-object v0, p1

    .line 105
    :goto_3
    return-object v0
.end method

.method public static final u(Lwf/c;)Ljava/lang/String;
    .locals 3

    .line 1
    instance-of v0, p0, Lvg/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lvg/f;

    .line 6
    .line 7
    invoke-virtual {p0}, Lvg/f;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 v0, 0x40

    .line 13
    .line 14
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lqg/v;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    new-instance v2, Lsf/f;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    move-object v1, v2

    .line 44
    :goto_0
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, Lqg/v;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    return-object v1
.end method

.method public static final v(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lqg/p0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lqg/p0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, Lqg/p0;->a:Lqg/o0;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    return-object v0

    .line 18
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final w(Lwf/c;Lwf/g;Ljava/lang/Object;)Lqg/m1;
    .locals 2

    .line 1
    instance-of v0, p0, Lyf/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    sget-object v0, Lqg/n1;->g:Lqg/n1;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    check-cast p0, Lyf/d;

    .line 16
    .line 17
    :cond_1
    instance-of v0, p0, Lqg/a0;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-interface {p0}, Lyf/d;->getCallerFrame()Lyf/d;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    instance-of v0, p0, Lqg/m1;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    check-cast v1, Lqg/m1;

    .line 35
    .line 36
    :goto_0
    if-eqz v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, Lqg/m1;->e0(Lwf/g;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_4
    :goto_1
    return-object v1
.end method

.method public static final x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p2}, Lwf/c;->getContext()Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    new-instance v2, Li2/y;

    .line 8
    .line 9
    const/16 v3, 0xd

    .line 10
    .line 11
    invoke-direct {v2, v3}, Li2/y;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, v2, v1}, Lwf/g;->k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, p0}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0, p0, v2}, Lqg/v;->h(Lwf/g;Lwf/g;Z)Lwf/g;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    invoke-static {p0}, Lqg/v;->g(Lwf/g;)V

    .line 37
    .line 38
    .line 39
    if-ne p0, v0, :cond_1

    .line 40
    .line 41
    new-instance v0, Lvg/p;

    .line 42
    .line 43
    invoke-direct {v0, p2, p0}, Lvg/p;-><init>(Lwf/c;Lwf/g;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v0, p1}, Lfb/v0;->L(Lvg/p;Lvg/p;Lfg/p;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    sget-object v1, Lwf/d;->g:Lwf/d;

    .line 52
    .line 53
    invoke-interface {p0, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v0, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    new-instance v0, Lqg/m1;

    .line 68
    .line 69
    invoke-direct {v0, p2, p0}, Lqg/m1;-><init>(Lwf/c;Lwf/g;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    iget-object p2, v0, Lqg/a;->i:Lwf/g;

    .line 74
    .line 75
    invoke-static {p2, p0}, Lvg/a;->l(Lwf/g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :try_start_0
    invoke-static {v0, v0, p1}, Lfb/v0;->L(Lvg/p;Lvg/p;Lfg/p;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    invoke-static {p2, p0}, Lvg/a;->g(Lwf/g;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object p0, p1

    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    invoke-static {p2, p0}, Lvg/a;->g(Lwf/g;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_2
    new-instance v0, Lqg/a0;

    .line 94
    .line 95
    invoke-direct {v0, p2, p0}, Lvg/p;-><init>(Lwf/c;Lwf/g;)V

    .line 96
    .line 97
    .line 98
    :try_start_1
    invoke-static {p1, v0, v0}, Lfb/v0;->j(Lfg/p;Lwf/c;Lwf/c;)Lwf/c;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 107
    .line 108
    invoke-static {p1, p0}, Lvg/a;->h(Ljava/lang/Object;Lwf/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    .line 110
    .line 111
    sget-object p0, Lqg/a0;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 112
    .line 113
    :cond_3
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    const/4 p0, 0x2

    .line 120
    if-ne p1, p0, :cond_5

    .line 121
    .line 122
    sget-object p0, Lqg/y0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 123
    .line 124
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, Lqg/v;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    instance-of p1, p0, Lqg/n;

    .line 133
    .line 134
    if-nez p1, :cond_4

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    check-cast p0, Lqg/n;

    .line 138
    .line 139
    iget-object p0, p0, Lqg/n;->a:Ljava/lang/Throwable;

    .line 140
    .line 141
    throw p0

    .line 142
    :cond_5
    const-string p0, "Already suspended"

    .line 143
    .line 144
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const/4 p0, 0x0

    .line 148
    return-object p0

    .line 149
    :cond_6
    const/4 p1, 0x1

    .line 150
    invoke-virtual {p0, v0, v2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_3

    .line 155
    .line 156
    sget-object p0, Lxf/a;->g:Lxf/a;

    .line 157
    .line 158
    :goto_1
    return-object p0

    .line 159
    :catchall_1
    move-exception p0

    .line 160
    new-instance p1, Lsf/f;

    .line 161
    .line 162
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, p1}, Lqg/a;->resumeWith(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    throw p0
.end method

.method public static final y(JLfg/p;Lyf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lqg/k1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lqg/k1;

    .line 7
    .line 8
    iget v1, v0, Lqg/k1;->i:I

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
    iput v1, v0, Lqg/k1;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqg/k1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lqg/k1;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lqg/k1;->i:I

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
    iget-object p0, v0, Lqg/k1;->g:Lgg/u;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lqg/i1; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-object p3

    .line 40
    :catch_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v3, 0x0

    .line 53
    .line 54
    cmp-long p3, p0, v3

    .line 55
    .line 56
    if-gtz p3, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    new-instance p3, Lgg/u;

    .line 60
    .line 61
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    :try_start_1
    iput-object p3, v0, Lqg/k1;->g:Lgg/u;

    .line 65
    .line 66
    iput v2, v0, Lqg/k1;->i:I

    .line 67
    .line 68
    new-instance v1, Lqg/j1;

    .line 69
    .line 70
    invoke-direct {v1, p0, p1, v0}, Lqg/j1;-><init>(JLqg/k1;)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p3, Lgg/u;->g:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {v1, p2}, Lqg/v;->t(Lqg/j1;Lfg/p;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_1
    .catch Lqg/i1; {:try_start_1 .. :try_end_1} :catch_1

    .line 79
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 80
    .line 81
    if-ne p0, p1, :cond_4

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_4
    return-object p0

    .line 85
    :catch_1
    move-exception p1

    .line 86
    move-object p0, p3

    .line 87
    :goto_1
    iget-object p2, p1, Lqg/i1;->g:Lqg/j1;

    .line 88
    .line 89
    iget-object p0, p0, Lgg/u;->g:Ljava/lang/Object;

    .line 90
    .line 91
    if-ne p2, p0, :cond_5

    .line 92
    .line 93
    :goto_2
    const/4 p0, 0x0

    .line 94
    return-object p0

    .line 95
    :cond_5
    throw p1
.end method

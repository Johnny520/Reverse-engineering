.class public abstract Ls0/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:[Ljava/lang/StackTraceElement;

.field public static final b:Ls0/j;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 3
    .line 4
    sput-object v0, Ls0/i;->a:[Ljava/lang/StackTraceElement;

    .line 5
    .line 6
    new-instance v0, Ls0/j;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v2, v1, [J

    .line 10
    .line 11
    new-array v3, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Ls0/j;-><init>(I[J[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ls0/i;->b:Ls0/j;

    .line 17
    .line 18
    return-void
.end method

.method public static final a(II)I
    .locals 0

    .line 1
    rem-int/lit8 p1, p1, 0xa

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x3

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    shl-int/2addr p0, p1

    .line 8
    return p0
.end method

.method public static final b(ILsf/b;)Ls0/d;
    .locals 2

    .line 1
    new-instance v0, Ls0/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static final c()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public static final d(Li0/h0;Lfg/p;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    invoke-static {v0, p1}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p1, p0, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final e(ILsf/b;Li0/h0;)Ls0/d;
    .locals 4

    .line 1
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Li0/l;->a:Li0/e;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Ls0/d;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p0, p1, v1}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    check-cast v0, Ls0/d;

    .line 19
    .line 20
    iget-object p0, v0, Ls0/d;->i:Lsf/b;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_5

    .line 27
    .line 28
    iput-object p1, v0, Ls0/d;->i:Lsf/b;

    .line 29
    .line 30
    iget-boolean p0, v0, Ls0/d;->h:Z

    .line 31
    .line 32
    if-eqz p0, :cond_5

    .line 33
    .line 34
    iget-object p0, v0, Ls0/d;->j:Li0/r1;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    iget-object p2, p0, Li0/r1;->a:Li0/q;

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    invoke-virtual {p2, p0, p1}, Li0/q;->s(Li0/r1;Ljava/lang/Object;)Li0/o0;

    .line 44
    .line 45
    .line 46
    :cond_1
    iput-object p1, v0, Ls0/d;->j:Li0/r1;

    .line 47
    .line 48
    :cond_2
    iget-object p0, v0, Ls0/d;->k:Ljava/util/ArrayList;

    .line 49
    .line 50
    if-eqz p0, :cond_5

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    const/4 v1, 0x0

    .line 57
    :goto_0
    if-ge v1, p2, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Li0/r1;

    .line 64
    .line 65
    iget-object v3, v2, Li0/r1;->a:Li0/q;

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    invoke-virtual {v3, v2, p1}, Li0/q;->s(Li0/r1;Ljava/lang/Object;)Li0/o0;

    .line 70
    .line 71
    .line 72
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 76
    .line 77
    .line 78
    :cond_5
    return-object v0
.end method

.method public static final f(Li0/r1;Li0/r1;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Li0/r1;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Li0/r1;->c:Ll0/b;

    .line 16
    .line 17
    iget-object p1, p1, Li0/r1;->c:Ll0/b;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

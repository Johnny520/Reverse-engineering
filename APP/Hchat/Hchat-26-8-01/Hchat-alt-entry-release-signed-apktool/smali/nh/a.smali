.class public final Lnh/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lmh/b;
.implements Ljava/io/Serializable;


# instance fields
.field public g:Ljava/lang/String;

.field public h:Loh/e;

.field public i:Ljava/util/Queue;


# virtual methods
.method public final A(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    instance-of p4, p3, Ljava/lang/Throwable;

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p0, p1, p2}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p0, p1, p2}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final B(ILjava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    array-length p2, p3

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    array-length p2, p3

    .line 6
    add-int/lit8 p2, p2, -0x1

    .line 7
    .line 8
    aget-object p2, p3, p2

    .line 9
    .line 10
    instance-of v0, p2, Ljava/lang/Throwable;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Throwable;

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 18
    :goto_1
    if-eqz p2, :cond_4

    .line 19
    .line 20
    array-length p2, p3

    .line 21
    if-eqz p2, :cond_3

    .line 22
    .line 23
    array-length p2, p3

    .line 24
    add-int/lit8 p2, p2, -0x1

    .line 25
    .line 26
    new-array v0, p2, [Ljava/lang/Object;

    .line 27
    .line 28
    if-lez p2, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {p3, v1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0, p1, v0}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_3
    const-string p1, "non-sensical empty or null argument array"

    .line 39
    .line 40
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_4
    invoke-virtual {p0, p1, p3}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final C(I[Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Lnh/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    iput p1, v0, Lnh/b;->a:I

    .line 10
    .line 11
    iget-object p1, p0, Lnh/a;->h:Loh/e;

    .line 12
    .line 13
    iput-object p1, v0, Lnh/b;->b:Loh/e;

    .line 14
    .line 15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    iput-object p2, v0, Lnh/b;->c:[Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p1, p0, Lnh/a;->i:Ljava/util/Queue;

    .line 25
    .line 26
    invoke-interface {p1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p2, 0x3

    .line 2
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, p2, p1}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    const/4 p2, 0x0

    .line 3
    invoke-virtual {p0, p1, p2}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Ljava/lang/Integer;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "Found resource shared library {}, pkgId: {}"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {p0, v1, p2, p1, v0}, Lnh/a;->A(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final g()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnh/a;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    .line 2
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, p2, p1}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final varargs i(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1, p2}, Lnh/a;->B(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final j()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final k(Ljava/lang/String;Ljava/lang/Long;)V
    .locals 0

    .line 1
    const/4 p1, 0x5

    .line 2
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    invoke-virtual {p0, p1, p2}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 p1, 0x4

    .line 2
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final m()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, p1, p3, p2}, Lnh/a;->A(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final varargs o(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0, p1, p2}, Lnh/a;->B(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final p(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0, p1, p3, p2}, Lnh/a;->A(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final varargs q([Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "Potential zip bomb attack detected, invalid sizes: compressed {}, uncompressed {}, name {}"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v1, v0, p1}, Lnh/a;->B(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final r(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, p2, p1}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1, p3, p2}, Lnh/a;->A(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final t(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    const/4 p2, 0x0

    .line 3
    invoke-virtual {p0, p1, p2}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const/4 p1, 0x2

    .line 2
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 p1, 0x2

    .line 2
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final x(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p2, 0x4

    .line 2
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, p2, p1}, Lnh/a;->C(I[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0, p1, p3, p2}, Lnh/a;->A(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final varargs z([Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "Loaded classes: {}, methods: {}, instructions: {}"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {p0, v1, v0, p1}, Lnh/a;->B(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

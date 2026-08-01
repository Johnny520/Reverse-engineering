.class public final Le50;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lju0;
.implements Lsk;


# instance fields
.field public final d:Lpk;

.field public final e:Lww;

.field public final f:Lhk;

.field public g:Lr31;


# direct methods
.method public constructor <init>(Lpk;Lww;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le50;->d:Lpk;

    .line 5
    .line 6
    iput-object p2, p0, Le50;->e:Lww;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lpk;->h(Lpk;)Lpk;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lp30;->e(Lpk;)Lhk;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Le50;->f:Lhk;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Le50;->g:Lr31;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 7
    .line 8
    const-string v3, "Old job was still running!"

    .line 9
    .line 10
    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lj40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Le50;->e:Lww;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    iget-object v3, p0, Le50;->f:Lhk;

    .line 23
    .line 24
    invoke-static {v3, v1, v0, v2}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Le50;->g:Lr31;

    .line 29
    .line 30
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Le50;->g:Lr31;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lfw;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Lfw;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lj40;->B(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Le50;->g:Lr31;

    .line 16
    .line 17
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Le50;->g:Lr31;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lfw;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Lfw;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lj40;->B(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Le50;->g:Lr31;

    .line 16
    .line 17
    return-void
.end method

.method public final getKey()Lok;
    .locals 0

    .line 1
    sget-object p0, Ln2;->x:Ln2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lpk;)Lpk;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpf1;->J(Lnk;Lpk;)Lpk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final l(Lok;)Lnk;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpf1;->v(Lnk;Lok;)Lnk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final n(Lpk;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-object v0, Lwi;->e:Lr3;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lpk;->l(Lok;)Lnk;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lwi;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lc7;

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-direct {v1, v2, v0, p0}, Lc7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p2, v1}, Lrd0;->W(Ljava/lang/Throwable;Lhw;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Le50;->d:Lpk;

    .line 21
    .line 22
    sget-object v0, Ln2;->x:Ln2;

    .line 23
    .line 24
    invoke-interface {p0, v0}, Lpk;->l(Lok;)Lnk;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lsk;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-interface {p0, p1, p2}, Lsk;->n(Lpk;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    throw p2
.end method

.method public final p(Lww;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final t(Lok;)Lpk;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpf1;->F(Lnk;Lok;)Lpk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

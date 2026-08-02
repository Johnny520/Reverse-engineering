.class public final Ly51;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements La82;
.implements Ld20;


# instance fields
.field public final h:La20;

.field public final i:Lmn0;

.field public final j:Ls00;

.field public k:Lzt2;


# direct methods
.method public constructor <init>(La20;Lmn0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly51;->h:La20;

    .line 5
    .line 6
    iput-object p2, p0, Ly51;->i:Lmn0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La20;->k(La20;)La20;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lte;->e(La20;)Ls00;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Ly51;->j:Ls00;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly51;->k:Lzt2;

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
    invoke-virtual {v0, v2}, Lr21;->c(Ljava/util/concurrent/CancellationException;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ly51;->i:Lmn0;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    iget-object v3, p0, Ly51;->j:Ls00;

    .line 23
    .line 24
    invoke-static {v3, v1, v0, v2}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Ly51;->k:Lzt2;

    .line 29
    .line 30
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly51;->k:Lzt2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lmm0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Lmm0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lr21;->D(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Ly51;->k:Lzt2;

    .line 16
    .line 17
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly51;->k:Lzt2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lmm0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Lmm0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lr21;->D(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Ly51;->k:Lzt2;

    .line 16
    .line 17
    return-void
.end method

.method public final getKey()Lz10;
    .locals 0

    .line 1
    sget-object p0, Lgd3;->q:Lgd3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(La20;)La20;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe1;->f0(Ly10;La20;)La20;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final o(Lz10;)Ly10;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe1;->u(Ly10;Lz10;)Ly10;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final p(La20;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-object v0, Lcy;->i:Lz8;

    .line 2
    .line 3
    invoke-interface {p1, v0}, La20;->o(Lz10;)Ly10;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcy;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lr1;

    .line 12
    .line 13
    const/16 v2, 0xc

    .line 14
    .line 15
    invoke-direct {v1, v2, v0, p0}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p2, v1}, Lse;->R(Ljava/lang/Throwable;Lxm0;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, Ly51;->h:La20;

    .line 22
    .line 23
    sget-object v0, Lgd3;->q:Lgd3;

    .line 24
    .line 25
    invoke-interface {p0, v0}, La20;->o(Lz10;)Ly10;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ld20;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    invoke-interface {p0, p1, p2}, Ld20;->p(La20;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    throw p2
.end method

.method public final r(Lmn0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final u(Lz10;)La20;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe1;->W(Ly10;Lz10;)La20;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

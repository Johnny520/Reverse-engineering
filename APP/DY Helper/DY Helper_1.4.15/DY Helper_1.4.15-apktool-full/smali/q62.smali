.class public final Lq62;
.super Lwq1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field private volatile threadLocalIsSet:Z

.field public final ι:Ljava/lang/ThreadLocal;


# direct methods
.method public constructor <init>(Lup;Lq3;)V
    .locals 2

    .line 1
    sget-object v0, Lr62;->ε:Lr62;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lup;->θ(Ltp;)Lsp;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lup;->η(Lup;)Lup;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, p1

    .line 15
    :goto_0
    invoke-direct {p0, p2, v0}, Lwq1;-><init>(Lop;Lup;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lq62;->ι:Ljava/lang/ThreadLocal;

    .line 24
    .line 25
    iget-object p2, p2, Lpp;->ζ:Lup;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v0, Lx;->Γ:Lx;

    .line 31
    .line 32
    invoke-interface {p2, v0}, Lup;->θ(Ltp;)Lsp;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    instance-of p2, p2, Lkotlinx/coroutines/α;

    .line 37
    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    invoke-static {p1, p2}, Lpd2;->б(Lup;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p1, p2}, Lpd2;->Π(Lup;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, Lq62;->д(Lup;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method


# virtual methods
.method public final π(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lq62;->threadLocalIsSet:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lq62;->ι:Ljava/lang/ThreadLocal;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ll91;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Ll91;->ε:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lup;

    .line 18
    .line 19
    iget-object v0, v0, Ll91;->ζ:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v1, v0}, Lpd2;->Π(Lup;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lq62;->ι:Ljava/lang/ThreadLocal;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-static {p1}, Lyh;->о(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p0, Lwq1;->θ:Lop;

    .line 34
    .line 35
    invoke-interface {v0}, Lop;->γ()Lup;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {v1, v2}, Lpd2;->б(Lup;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    sget-object v4, Lpd2;->θ:Luy;

    .line 45
    .line 46
    if-eq v3, v4, :cond_2

    .line 47
    .line 48
    invoke-static {v0, v1, v3}, Ls1;->Η(Lop;Lup;Ljava/lang/Object;)Lq62;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :cond_2
    :try_start_0
    iget-object p0, p0, Lwq1;->θ:Lop;

    .line 53
    .line 54
    invoke-interface {p0, p1}, Lop;->ζ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    invoke-virtual {v2}, Lq62;->г()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    return-void

    .line 67
    :cond_4
    :goto_0
    invoke-static {v1, v3}, Lpd2;->Π(Lup;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    invoke-virtual {v2}, Lq62;->г()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_6

    .line 79
    .line 80
    :cond_5
    invoke-static {v1, v3}, Lpd2;->Π(Lup;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_6
    throw p0
.end method

.method public final г()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq62;->threadLocalIsSet:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lq62;->ι:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget-object p0, p0, Lq62;->ι:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 20
    .line 21
    .line 22
    xor-int/lit8 p0, v0, 0x1

    .line 23
    .line 24
    return p0
.end method

.method public final д(Lup;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq62;->threadLocalIsSet:Z

    .line 3
    .line 4
    iget-object p0, p0, Lq62;->ι:Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    new-instance v0, Ll91;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.class public final Lo80;
.super Lw10;


# instance fields
.field public final e:Ljava/lang/ThreadLocal;

.field private volatile threadLocalIsSet:Z


# direct methods
.method public constructor <init>(Lge;Lm50;)V
    .locals 2

    .line 1
    sget-object v0, Lp80;->a:Lp80;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lge;->b(Lfe;)Lee;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lge;->i(Lge;)Lge;

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
    invoke-direct {p0, v0, p2}, Lw10;-><init>(Lge;Lm50;)V

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
    iput-object v0, p0, Lo80;->e:Ljava/lang/ThreadLocal;

    .line 24
    .line 25
    iget-object p2, p2, Lm50;->b:Lge;

    .line 26
    .line 27
    invoke-static {p2}, Lip;->l(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lvh;->b:Lvh;

    .line 31
    .line 32
    invoke-interface {p2, v0}, Lge;->b(Lfe;)Lee;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    instance-of p2, p2, Lke;

    .line 37
    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    invoke-static {p1, p2}, Lff;->V(Lge;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p1, p2}, Lff;->L(Lge;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, Lo80;->L(Lge;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method


# virtual methods
.method public final K()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lo80;->threadLocalIsSet:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lo80;->e:Ljava/lang/ThreadLocal;

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
    iget-object v2, p0, Lo80;->e:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    .line 20
    .line 21
    .line 22
    xor-int/2addr v0, v1

    .line 23
    return v0
.end method

.method public final L(Lge;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lo80;->threadLocalIsSet:Z

    .line 3
    .line 4
    iget-object v0, p0, Lo80;->e:Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    new-instance v1, Lkx;

    .line 7
    .line 8
    invoke-direct {v1, p1, p2}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final l(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lo80;->threadLocalIsSet:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lo80;->e:Ljava/lang/ThreadLocal;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lkx;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lkx;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lge;

    .line 18
    .line 19
    iget-object v0, v0, Lkx;->b:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v1, v0}, Lff;->L(Lge;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lo80;->e:Ljava/lang/ThreadLocal;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-static {p1}, La80;->A(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p0, Lw10;->d:Lm50;

    .line 34
    .line 35
    iget-object v1, v0, Lm50;->b:Lge;

    .line 36
    .line 37
    invoke-static {v1}, Lip;->l(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v1, v2}, Lff;->V(Lge;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget-object v4, Lff;->x:Ll0;

    .line 46
    .line 47
    if-eq v3, v4, :cond_2

    .line 48
    .line 49
    invoke-static {v0, v1, v3}, Lip;->b0(Lld;Lge;Ljava/lang/Object;)Lo80;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :cond_2
    :try_start_0
    iget-object v0, p0, Lw10;->d:Lm50;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lm50;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    invoke-virtual {v2}, Lo80;->K()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    return-void

    .line 68
    :cond_4
    :goto_0
    invoke-static {v1, v3}, Lff;->L(Lge;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    invoke-virtual {v2}, Lo80;->K()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    :cond_5
    invoke-static {v1, v3}, Lff;->L(Lge;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_6
    throw p1
.end method

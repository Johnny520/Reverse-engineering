.class public final Lxp;
.super Lwp;


# instance fields
.field public final e:Laq;

.field public final f:Lyp;

.field public final g:Lma;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Laq;Lyp;Lma;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzr;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxp;->e:Laq;

    .line 5
    .line 6
    iput-object p2, p0, Lxp;->f:Lyp;

    .line 7
    .line 8
    iput-object p3, p0, Lxp;->g:Lma;

    .line 9
    .line 10
    iput-object p4, p0, Lxp;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxp;->l(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lxh;->n:Lxh;

    .line 7
    .line 8
    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lxp;->g:Lma;

    .line 2
    .line 3
    invoke-static {p1}, Laq;->D(Lzr;)Lma;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lxp;->e:Laq;

    .line 8
    .line 9
    iget-object v1, p0, Lxp;->f:Lyp;

    .line 10
    .line 11
    iget-object v2, p0, Lxp;->h:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    :cond_0
    iget-object v3, p1, Lma;->e:Laq;

    .line 16
    .line 17
    new-instance v4, Lxp;

    .line 18
    .line 19
    invoke-direct {v4, v0, v1, p1, v2}, Lxp;-><init>(Laq;Lyp;Lma;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    invoke-static {v3, v4, v5}, Lg80;->r(Lqp;Lwp;I)Lbh;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sget-object v4, Lvw;->a:Lvw;

    .line 28
    .line 29
    if-eq v3, v4, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-static {p1}, Laq;->D(Lzr;)Lma;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    :cond_2
    invoke-virtual {v0, v1, v2}, Laq;->s(Lyp;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1}, Laq;->k(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.class public abstract Lg;
.super Lwp;

# interfaces
.implements Lld;
.implements Loe;


# instance fields
.field public final c:Lge;


# direct methods
.method public constructor <init>(Lge;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lwp;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Lvh;->h:Lvh;

    .line 5
    .line 6
    invoke-interface {p1, p2}, Lge;->b(Lfe;)Lee;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lmp;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lwp;->A(Lmp;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lge;->i(Lge;)Lge;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lg;->c:Lge;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lnb;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lnb;

    .line 6
    .line 7
    sget-object v0, Lnb;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final d()Lge;
    .locals 1

    .line 1
    iget-object v0, p0, Lg;->c:Lge;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lge;
    .locals 1

    .line 1
    iget-object v0, p0, Lg;->c:Lge;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lf10;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Lnb;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1}, Lnb;-><init>(Ljava/lang/Throwable;Z)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lwp;->C(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Lip;->g:Ll0;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Lg;->l(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final o()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, " was cancelled"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final z(Lpb;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg;->c:Lge;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lff;->u(Lge;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

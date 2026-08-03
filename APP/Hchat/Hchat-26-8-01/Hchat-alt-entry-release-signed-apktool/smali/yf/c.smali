.class public abstract Lyf/c;
.super Lyf/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final _context:Lwf/g;

.field private transient intercepted:Lwf/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwf/c;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwf/c;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lwf/c;->getContext()Lwf/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p1, v0}, Lyf/c;-><init>(Lwf/c;Lwf/g;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lwf/c;Lwf/g;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lyf/a;-><init>(Lwf/c;)V

    .line 14
    iput-object p2, p0, Lyf/c;->_context:Lwf/g;

    return-void
.end method


# virtual methods
.method public getContext()Lwf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lyf/c;->_context:Lwf/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final intercepted()Lwf/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwf/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lyf/c;->intercepted:Lwf/c;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lyf/c;->getContext()Lwf/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lwf/d;->g:Lwf/d;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lqg/p;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v1, Lvg/f;

    .line 20
    .line 21
    invoke-direct {v1, v0, p0}, Lvg/f;-><init>(Lqg/p;Lyf/c;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, p0

    .line 26
    :goto_0
    iput-object v1, p0, Lyf/c;->intercepted:Lwf/c;

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1
    return-object v0
.end method

.method public releaseIntercepted()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyf/c;->intercepted:Lwf/c;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eq v0, p0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lyf/c;->getContext()Lwf/g;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lwf/d;->g:Lwf/d;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v1, Lqg/p;

    .line 21
    .line 22
    check-cast v0, Lvg/f;

    .line 23
    .line 24
    sget-object v1, Lvg/f;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Lvg/a;->c:Ll3/q;

    .line 31
    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    instance-of v1, v0, Lqg/g;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast v0, Lqg/g;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lqg/g;->l()V

    .line 49
    .line 50
    .line 51
    :cond_2
    sget-object v0, Lyf/b;->g:Lyf/b;

    .line 52
    .line 53
    iput-object v0, p0, Lyf/c;->intercepted:Lwf/c;

    .line 54
    .line 55
    return-void
.end method

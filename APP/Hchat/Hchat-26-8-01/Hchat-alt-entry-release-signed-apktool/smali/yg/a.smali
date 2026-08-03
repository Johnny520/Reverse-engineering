.class public final Lyg/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqg/f;
.implements Lqg/o1;


# instance fields
.field public final g:Lqg/g;

.field public final synthetic h:Lyg/b;


# direct methods
.method public constructor <init>(Lyg/b;Lqg/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyg/a;->h:Lyg/b;

    .line 5
    .line 6
    iput-object p2, p0, Lyg/a;->g:Lqg/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyg/a;->g:Lqg/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lqg/g;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a(Lvg/q;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyg/a;->g:Lqg/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lqg/g;->a(Lvg/q;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getContext()Lwf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lyg/a;->g:Lqg/g;

    .line 2
    .line 3
    iget-object v0, v0, Lqg/g;->k:Lwf/g;

    .line 4
    .line 5
    return-object v0
.end method

.method public final j(Ljava/lang/Object;Lfg/q;)Ll3/q;
    .locals 2

    .line 1
    check-cast p1, Lsf/n;

    .line 2
    .line 3
    new-instance p2, Lf0/h;

    .line 4
    .line 5
    iget-object v0, p0, Lyg/a;->h:Lyg/b;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, Lf0/h;-><init>(Lyg/b;Lyg/a;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lyg/a;->g:Lqg/g;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2}, Lqg/g;->j(Ljava/lang/Object;Lfg/q;)Ll3/q;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object p2, Lyg/b;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p1
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyg/a;->g:Lqg/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lyg/a;->g:Lqg/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lqg/g;->w(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

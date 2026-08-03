.class public Lvg/p;
.super Lqg/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lyf/d;


# instance fields
.field public final j:Lwf/c;


# direct methods
.method public constructor <init>(Lwf/c;Lwf/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, Lqg/a;-><init>(Lwf/g;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lvg/p;->j:Lwf/c;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final N()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final getCallerFrame()Lyf/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lvg/p;->j:Lwf/c;

    .line 2
    .line 3
    instance-of v1, v0, Lyf/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lyf/d;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public r(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvg/p;->j:Lwf/c;

    .line 2
    .line 3
    invoke-static {v0}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lqg/v;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, v0}, Lvg/a;->h(Ljava/lang/Object;Lwf/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public u(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvg/p;->j:Lwf/c;

    .line 2
    .line 3
    invoke-static {p1}, Lqg/v;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lwf/c;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

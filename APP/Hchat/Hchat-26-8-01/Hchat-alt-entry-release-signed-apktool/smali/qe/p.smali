.class public final Lqe/p;
.super Lqe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic c:Lqe/r;


# direct methods
.method public constructor <init>(Lqe/r;Lud/p;Lqd/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqe/p;->c:Lqe/r;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lqe/a;-><init>(Lud/p;Lqd/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/e0;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lqe/a;->a:Lud/p;

    .line 2
    .line 3
    iget-object v1, v0, Lud/p;->l:Lqd/r;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroidx/lifecycle/e0;->b(Lqd/l;)Lqd/j;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v2}, Lud/p;->S(I)Lqd/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Landroidx/lifecycle/e0;->b(Lqd/l;)Lqd/j;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lqe/p;->c:Lqe/r;

    .line 19
    .line 20
    iget-object v0, v0, Lqe/r;->c:Lqe/k;

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lqe/l;->b()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Lqe/l;->d()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return v2

    .line 40
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 41
    return p1
.end method

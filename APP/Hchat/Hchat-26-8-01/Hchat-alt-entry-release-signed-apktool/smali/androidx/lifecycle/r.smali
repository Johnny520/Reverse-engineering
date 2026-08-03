.class public final Landroidx/lifecycle/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Landroidx/lifecycle/l;

.field public b:Landroidx/lifecycle/o;


# virtual methods
.method public final a(Landroidx/lifecycle/q;Landroidx/lifecycle/k;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroidx/lifecycle/k;->a()Landroidx/lifecycle/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/lifecycle/r;->a:Landroidx/lifecycle/l;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    :cond_0
    iput-object v1, p0, Landroidx/lifecycle/r;->a:Landroidx/lifecycle/l;

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/lifecycle/r;->b:Landroidx/lifecycle/o;

    .line 20
    .line 21
    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/o;->b(Landroidx/lifecycle/q;Landroidx/lifecycle/k;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/lifecycle/r;->a:Landroidx/lifecycle/l;

    .line 25
    .line 26
    return-void
.end method

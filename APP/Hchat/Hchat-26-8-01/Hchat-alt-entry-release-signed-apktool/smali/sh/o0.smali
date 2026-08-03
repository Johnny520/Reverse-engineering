.class public final Lsh/o0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lp/x0;


# instance fields
.field public final a:Li0/j1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    int-to-float v0, v0

    .line 6
    new-instance v1, Lp/z0;

    .line 7
    .line 8
    invoke-direct {v1, v0, v0, v0, v0}, Lp/z0;-><init>(FFFF)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lsh/o0;->a:Li0/j1;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    iget-object v0, p0, Lsh/o0;->a:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp/x0;

    .line 8
    .line 9
    invoke-interface {v0}, Lp/x0;->a()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final b(Lu2/m;)F
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsh/o0;->a:Li0/j1;

    .line 5
    .line 6
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lp/x0;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lp/x0;->b(Lu2/m;)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final c()F
    .locals 1

    .line 1
    iget-object v0, p0, Lsh/o0;->a:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp/x0;

    .line 8
    .line 9
    invoke-interface {v0}, Lp/x0;->c()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final d(Lu2/m;)F
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsh/o0;->a:Li0/j1;

    .line 5
    .line 6
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lp/x0;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lp/x0;->d(Lu2/m;)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

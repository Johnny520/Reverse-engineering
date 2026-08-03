.class public abstract Lh/g1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Lh/g1;->a:F

    .line 6
    .line 7
    return-void
.end method

.method public static final a(Li0/h0;)Li/u;
    .locals 3

    .line 1
    sget-object v0, Ly1/h1;->h:Li0/m2;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lu2/c;

    .line 8
    .line 9
    invoke-interface {v0}, Lu2/c;->d()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0, v1}, Li0/h0;->c(F)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    sget-object v1, Li0/l;->a:Li0/e;

    .line 24
    .line 25
    if-ne v2, v1, :cond_1

    .line 26
    .line 27
    :cond_0
    new-instance v1, Landroidx/lifecycle/x;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Landroidx/lifecycle/x;-><init>(Lu2/c;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Li/u;

    .line 33
    .line 34
    invoke-direct {v2, v1}, Li/u;-><init>(Landroidx/lifecycle/x;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    check-cast v2, Li/u;

    .line 41
    .line 42
    return-object v2
.end method

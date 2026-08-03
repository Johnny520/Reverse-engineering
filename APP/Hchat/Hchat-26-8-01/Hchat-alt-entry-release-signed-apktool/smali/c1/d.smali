.class public final Lc1/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lu2/c;


# instance fields
.field public g:Lc1/a;

.field public h:Landroidx/lifecycle/x;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lc1/l;->g:Lc1/l;

    .line 5
    .line 6
    iput-object v0, p0, Lc1/d;->g:Lc1/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()F
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/d;->g:Lc1/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lc1/a;->d()Lu2/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lu2/c;->d()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final e(Lfg/l;)Landroidx/lifecycle/x;
    .locals 3

    .line 1
    new-instance v0, Landroidx/lifecycle/x;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/x;-><init>(IZ)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, Lc1/d;->h:Landroidx/lifecycle/x;

    .line 11
    .line 12
    return-object v0
.end method

.method public final q0()F
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/d;->g:Lc1/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lc1/a;->d()Lu2/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lu2/c;->q0()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

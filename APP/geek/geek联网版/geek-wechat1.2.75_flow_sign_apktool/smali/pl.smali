.class public final Lpl;
.super Lgf;

# interfaces
.implements Lxa0;
.implements Lsq;
.implements Ldm;


# instance fields
.field public final A:Landroid/os/Handler;

.field public final B:Lam;

.field public final synthetic C:Landroidx/fragment/app/FragmentActivity;

.field public final y:Landroidx/fragment/app/FragmentActivity;

.field public final z:Landroidx/fragment/app/FragmentActivity;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpl;->C:Landroidx/fragment/app/FragmentActivity;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lam;

    .line 12
    .line 13
    invoke-direct {v1}, Lam;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lpl;->B:Lam;

    .line 17
    .line 18
    iput-object p1, p0, Lpl;->y:Landroidx/fragment/app/FragmentActivity;

    .line 19
    .line 20
    iput-object p1, p0, Lpl;->z:Landroidx/fragment/app/FragmentActivity;

    .line 21
    .line 22
    iput-object v0, p0, Lpl;->A:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final K(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lpl;->C:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final L()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lpl;->C:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()Lwa0;
    .locals 1

    .line 1
    iget-object v0, p0, Lpl;->C:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->d()Lwa0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e()Landroidx/lifecycle/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lpl;->C:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/FragmentActivity;->t:Landroidx/lifecycle/a;

    .line 4
    .line 5
    return-object v0
.end method

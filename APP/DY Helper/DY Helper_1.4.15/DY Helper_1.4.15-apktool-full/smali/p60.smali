.class public final Lp60;
.super Lxb;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lr92;
.implements Lhr0;
.implements Lkq1;
.implements Lf70;


# instance fields
.field public final synthetic Α:Landroidx/fragment/app/FragmentActivity;

.field public final φ:Landroidx/fragment/app/FragmentActivity;

.field public final χ:Landroidx/fragment/app/FragmentActivity;

.field public final ψ:Landroid/os/Handler;

.field public final ω:Lb70;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lb70;

    .line 12
    .line 13
    invoke-direct {v1}, Lb70;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lp60;->ω:Lb70;

    .line 17
    .line 18
    iput-object p1, p0, Lp60;->φ:Landroidx/fragment/app/FragmentActivity;

    .line 19
    .line 20
    iput-object p1, p0, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 21
    .line 22
    iput-object v0, p0, Lp60;->ψ:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final Ρ(I)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final Σ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final α()Ln5;
    .locals 0

    .line 1
    iget-object p0, p0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ι:Ln5;

    .line 4
    .line 5
    iget-object p0, p0, Ln5;->η:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ln5;

    .line 8
    .line 9
    return-object p0
.end method

.method public final β()V
    .locals 0

    .line 1
    return-void
.end method

.method public final γ()Lq92;
    .locals 0

    .line 1
    iget-object p0, p0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->γ()Lq92;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final δ()Ljr0;
    .locals 0

    .line 1
    iget-object p0, p0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ω:Ljr0;

    .line 4
    .line 5
    return-object p0
.end method

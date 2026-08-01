.class public final Landroidx/appcompat/widget/α;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lz92;


# instance fields
.field public α:Z

.field public β:I

.field public final synthetic γ:Landroidx/appcompat/widget/AbsActionBarView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AbsActionBarView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/widget/α;->γ:Landroidx/appcompat/widget/AbsActionBarView;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Landroidx/appcompat/widget/α;->α:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/α;->α:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, Landroidx/appcompat/widget/α;->γ:Landroidx/appcompat/widget/AbsActionBarView;

    .line 8
    .line 9
    iput-object v0, v1, Landroidx/appcompat/widget/AbsActionBarView;->κ:Lx92;

    .line 10
    .line 11
    iget p0, p0, Landroidx/appcompat/widget/α;->β:I

    .line 12
    .line 13
    invoke-static {v1, p0}, Landroidx/appcompat/widget/AbsActionBarView;->β(Landroidx/appcompat/widget/AbsActionBarView;I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final β()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/appcompat/widget/α;->α:Z

    .line 3
    .line 4
    return-void
.end method

.method public final γ()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/α;->γ:Landroidx/appcompat/widget/AbsActionBarView;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/appcompat/widget/AbsActionBarView;->α(Landroidx/appcompat/widget/AbsActionBarView;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/appcompat/widget/α;->α:Z

    .line 8
    .line 9
    return-void
.end method

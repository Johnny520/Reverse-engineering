.class public Landroidx/constraintlayout/widget/ۥ۟۟۟ۢ;
.super Landroidx/constraintlayout/widget/ۥ۟۟;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ۥ۟۟;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ۥ۟۟;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ۥ۟۟;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroidx/constraintlayout/widget/ۥ۟۟;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ۥ۟۟;->ۥۣ۟۟۟()V

    return-void
.end method

.method public setElevation(F)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ۥ۟۟;->ۥۣ۟۟۟()V

    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ۥ۟۟;->ۥۣ۟۟۟()V

    return-void
.end method

.method public ۥ۟۟۠(Landroid/util/AttributeSet;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ۥ۟۟;->ۥ۟۟۠(Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ۥ۟۟;->ۥ۟۟۠ۧ:Z

    return-void
.end method

.method public ۥۣ۟۟۠(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$ۥ۟;

    iget-object v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$ۥ۟;->ۥ۟۟ۤۥ:LYue/ۥ۟ۧ۟ۢ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۠ۡ۟(I)V

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$ۥ۟;->ۥ۟۟ۤۥ:LYue/ۥ۟ۧ۟ۢ;

    invoke-virtual {p1, v1}, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟ۨ(I)V

    return-void
.end method

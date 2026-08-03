.class public Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۡ;
.super LYue/ۥۢۤۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۠۟ۤ(LYue/ۥ۟۟ۧ۟$ۥ;)LYue/ۥ۟۟ۧ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {p0}, LYue/ۥۢۤۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۧ:LYue/ۥۢۤۦۦ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۤ(LYue/ۥۢۤۦۨ;)LYue/ۥۢۤۦۦ;

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iput-object v0, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۧ:LYue/ۥۢۤۦۦ;

    return-void
.end method

.method public ۥ۟۟(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠ۤ(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.class public Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;
.super LYue/ۥۢۤۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    invoke-direct {p0}, LYue/ۥۢۤۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-boolean v0, p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۡ:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۟:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۦ:LYue/ۥۢۤۦۧ;

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۣ()V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠ۤ(Landroid/view/View;)V

    :cond_1
    return-void
.end method

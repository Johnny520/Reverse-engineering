.class public Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۠۟ۤ(LYue/ۥ۟۟ۧ۟$ۥ;)LYue/ۥ۟۟ۧ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;


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

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v1, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۥ:Landroid/widget/PopupWindow;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x37

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۥۨ()V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۠۟ۡ()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v2, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, LYue/ۥۢۤۤۦ;->ۥ۟۟۟ۡ(Landroid/view/View;)LYue/ۥۢۤۦۦ;

    move-result-object v2

    invoke-virtual {v2, v1}, LYue/ۥۢۤۦۦ;->ۥ۟(F)LYue/ۥۢۤۦۦ;

    move-result-object v1

    iput-object v1, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۧ:LYue/ۥۢۤۦۦ;

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۧ:LYue/ۥۢۤۦۦ;

    new-instance v1, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠$ۥ;

    invoke-direct {v1, p0}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠$ۥ;-><init>(Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;)V

    invoke-virtual {v0, v1}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۤ(LYue/ۥۢۤۦۨ;)LYue/ۥۢۤۦۦ;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۟۠;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥۣ۟۟ۤ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

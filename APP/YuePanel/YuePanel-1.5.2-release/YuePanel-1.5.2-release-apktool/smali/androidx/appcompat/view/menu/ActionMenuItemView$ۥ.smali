.class public Landroidx/appcompat/view/menu/ActionMenuItemView$ۥ;
.super LYue/ۥ۠ۢۦۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/view/menu/ActionMenuItemView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟ۡۡ:Landroidx/appcompat/view/menu/ActionMenuItemView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$ۥ;->ۥ۟۟ۡۡ:Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۦۨ;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public ۥ۟()LYue/ۥۢ۟۠ۤ;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$ۥ;->ۥ۟۟ۡۡ:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->ۥ۟۟۠ۨ:Landroidx/appcompat/view/menu/ActionMenuItemView$ۥ۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ActionMenuItemView$ۥ۟;->ۥ()LYue/ۥۢ۟۠ۤ;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟()Z
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$ۥ;->ۥ۟۟ۡۡ:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v1, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->ۥ۟۟۠ۦ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ۟;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    invoke-interface {v1, v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ۟;->ۥ(Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$ۥ;->ۥ۟()LYue/ۥۢ۟۠ۤ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LYue/ۥۢ۟۠ۤ;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

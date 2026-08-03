.class public Lcom/google/android/material/internal/NavigationSubMenu;
.super Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/material/internal/NavigationMenu;Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;)V

    return-void
.end method


# virtual methods
.method public onItemsChanged(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->onItemsChanged(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->getParentMenu()Landroid/view/Menu;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->onItemsChanged(Z)V

    return-void
.end method

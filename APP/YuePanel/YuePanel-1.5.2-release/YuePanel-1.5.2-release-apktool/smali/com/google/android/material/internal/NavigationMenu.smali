.class public Lcom/google/android/material/internal/NavigationMenu;
.super Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    new-instance p2, Lcom/google/android/material/internal/NavigationSubMenu;

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3, p0, p1}, Lcom/google/android/material/internal/NavigationSubMenu;-><init>(Landroid/content/Context;Lcom/google/android/material/internal/NavigationMenu;Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۟(Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;)V

    return-object p2
.end method

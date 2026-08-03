.class public LYue/ۥ۟ۡۡۢ;
.super Landroidx/fragment/app/ۥ۟۟۟۟;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/ۥ۟۟۟۟;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠ۦۨۧ;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1}, Landroidx/fragment/app/ۥ۟۟۟۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance p1, LYue/ۥ۟ۡۡۡ;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/ۥ۟۟۟۟;->getTheme()I

    move-result v1

    invoke-direct {p1, v0, v1}, LYue/ۥ۟ۡۡۡ;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public setupDialog(Landroid/app/Dialog;I)V
    .locals 3
    .param p1    # Landroid/app/Dialog;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۟ۡۡۡ;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LYue/ۥ۟ۡۡۡ;

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x2

    if-eq p2, v2, :cond_1

    const/4 v2, 0x3

    if-eq p2, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x18

    invoke-virtual {p1, p2}, Landroid/view/Window;->addFlags(I)V

    :cond_1
    invoke-virtual {v0, v1}, LYue/ۥ۟ۡۡۡ;->supportRequestWindowFeature(I)Z

    goto :goto_0

    :cond_2
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/ۥ۟۟۟۟;->setupDialog(Landroid/app/Dialog;I)V

    :goto_0
    return-void
.end method

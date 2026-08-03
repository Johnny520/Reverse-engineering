.class public final LYue/ۥۣۢۤۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۦۡ۠;
    name = "ViewTreeSavedStateRegistryOwner"
.end annotation


# direct methods
.method public static final ۥ(Landroid/view/View;)LYue/ۥۡۧۤۢ;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "get"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۣۢۤۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۢۤۧ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟ۨ(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;

    move-result-object p0

    sget-object v0, LYue/ۥۣۢۤۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۢۤۧ$ۥ۟;

    invoke-static {p0, v0}, LYue/ۥۡۨۢۦ;->ۥۣ۟۠۟(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۨۢۦ;->ۥ۟۟ۦۡ(LYue/ۥۡۨۢ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥۡۧۤۢ;

    return-object p0
.end method

.method public static final ۥ۟(Landroid/view/View;LYue/ۥۡۧۤۢ;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "set"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LYue/ۥۡۥۦۨ$ۥ;->ۥ:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

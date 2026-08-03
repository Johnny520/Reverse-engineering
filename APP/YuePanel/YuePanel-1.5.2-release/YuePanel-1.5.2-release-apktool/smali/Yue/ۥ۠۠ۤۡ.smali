.class public final LYue/ۥ۠۠ۤۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠۠ۤۧ;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x17
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۢ۠ۦۨ;LYue/ۥۢ۠ۦۨ;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 0
    .param p1    # LYue/ۥۢ۠ۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢ۠ۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Landroid/view/Window;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    const-string p6, "statusBarStyle"

    invoke-static {p1, p6}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "navigationBarStyle"

    invoke-static {p2, p6}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "window"

    invoke-static {p3, p6}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "view"

    invoke-static {p4, p6}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p6, 0x0

    invoke-static {p3, p6}, LYue/ۥۢۥۣۣ;->ۥ۟۟(Landroid/view/Window;Z)V

    invoke-virtual {p1, p5}, LYue/ۥۢ۠ۦۨ;->ۥ۟۟۟ۡ(Z)I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    invoke-virtual {p2}, LYue/ۥۢ۠ۦۨ;->ۥ۟۟۟()I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    new-instance p1, LYue/ۥۢۥۨۦ;

    invoke-direct {p1, p3, p4}, LYue/ۥۢۥۨۦ;-><init>(Landroid/view/Window;Landroid/view/View;)V

    xor-int/lit8 p2, p5, 0x1

    invoke-virtual {p1, p2}, LYue/ۥۢۥۨۦ;->ۥۣ۟۟۟(Z)V

    return-void
.end method

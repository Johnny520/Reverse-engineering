.class public final LYue/ۥ۠۠ۤ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠۠ۤۧ;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
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

    const-string p5, "statusBarStyle"

    invoke-static {p1, p5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "navigationBarStyle"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "window"

    invoke-static {p3, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "view"

    invoke-static {p4, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p3, p1}, LYue/ۥۢۥۣۣ;->ۥ۟۟(Landroid/view/Window;Z)V

    const/high16 p1, 0x4000000

    invoke-virtual {p3, p1}, Landroid/view/Window;->addFlags(I)V

    const/high16 p1, 0x8000000

    invoke-virtual {p3, p1}, Landroid/view/Window;->addFlags(I)V

    return-void
.end method

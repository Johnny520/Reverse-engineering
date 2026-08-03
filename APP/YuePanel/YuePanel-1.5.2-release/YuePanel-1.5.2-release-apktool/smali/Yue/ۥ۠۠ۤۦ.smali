.class public final LYue/ۥ۠۠ۤۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠۠ۤۧ;


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

    const-string p5, "statusBarStyle"

    invoke-static {p1, p5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "navigationBarStyle"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "window"

    invoke-static {p3, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "view"

    invoke-static {p4, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

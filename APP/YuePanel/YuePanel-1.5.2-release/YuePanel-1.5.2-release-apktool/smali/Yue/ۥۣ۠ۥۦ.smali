.class public LYue/ۥۣ۠ۥۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/View;Landroid/view/ViewGroup;Landroid/graphics/Matrix;)LYue/ۥۣ۠ۥۢ;
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-static {p0, p1, p2}, LYue/ۥۣ۠ۥۤ;->ۥ۟(Landroid/view/View;Landroid/view/ViewGroup;Landroid/graphics/Matrix;)LYue/ۥۣ۠ۥۢ;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥۣ۠ۥۥ;->ۥ۟(Landroid/view/View;Landroid/view/ViewGroup;Landroid/graphics/Matrix;)LYue/ۥۣ۠ۥۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Landroid/view/View;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۣ۠ۥۤ;->ۥ۟۟۟۠(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, LYue/ۥۣ۠ۥۥ;->ۥ۟۟۟۠(Landroid/view/View;)V

    :goto_0
    return-void
.end method

.class public LYue/ۥۢۤۤۦ$ۥۣ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x17
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۤۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/View;)LYue/ۥۢۥۦ;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {v0}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ(Landroid/view/WindowInsets;)LYue/ۥۢۥۦ;

    move-result-object v0

    invoke-virtual {v0, v0}, LYue/ۥۢۥۦ;->ۥ۟۟ۡۦ(LYue/ۥۢۥۦ;)V

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, LYue/ۥۢۥۦ;->ۥ۟۟۟(Landroid/view/View;)V

    return-object v0
.end method

.method public static ۥ۟(Landroid/view/View;)I
    .locals 0
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getScrollIndicators()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Landroid/view/View;I)V
    .locals 0
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/View;->setScrollIndicators(I)V

    return-void
.end method

.method public static ۥ۟۟۟(Landroid/view/View;II)V
    .locals 0
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setScrollIndicators(II)V

    return-void
.end method

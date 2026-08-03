.class public LYue/ۥۢۥۣۥ$ۥ۟۟;
.super LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۣۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟۠:Landroid/view/animation/Interpolator;

.field public static final ۥ۟۟۟ۡ:Landroid/view/animation/Interpolator;

.field public static final ۥ۟۟۟ۢ:Landroid/view/animation/Interpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3f8ccccd    # 1.1f

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v3, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟۠:Landroid/view/animation/Interpolator;

    new-instance v0, LYue/ۥ۠ۡۦۤ;

    invoke-direct {v0}, LYue/ۥ۠ۡۦۤ;-><init>()V

    sput-object v0, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟ۡ:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟ۢ:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 0
    .param p2    # Landroid/view/animation/Interpolator;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2, p3, p4}, LYue/ۥۢۥۣۥ$ۥ۟۟۟۟;-><init>(ILandroid/view/animation/Interpolator;J)V

    return-void
.end method

.method public static ۥۣ۟۟۟(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ;)I
    .locals 4
    .param p0    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_1

    invoke-virtual {p0, v1}, LYue/ۥۢۥۦ;->ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;

    move-result-object v2

    invoke-virtual {p1, v1}, LYue/ۥۢۥۦ;->ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;

    move-result-object v3

    invoke-virtual {v2, v3}, LYue/ۥ۠ۥۣۡ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    or-int/2addr v0, v1

    :cond_0
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static ۥ۟۟۟ۤ(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ;I)LYue/ۥۢۥۣۥ$ۥ;
    .locals 4
    .param p0    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p2}, LYue/ۥۢۥۦ;->ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;

    move-result-object p0

    invoke-virtual {p1, p2}, LYue/ۥۢۥۦ;->ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    iget p2, p0, LYue/ۥ۠ۥۣۡ;->ۥ:I

    iget v0, p1, LYue/ۥ۠ۥۣۡ;->ۥ:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget v0, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    iget v1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    iget v2, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v2, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    iget v3, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {p2, v0, v1, v2}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p2

    iget v0, p0, LYue/ۥ۠ۥۣۡ;->ۥ:I

    iget v1, p1, LYue/ۥ۠ۥۣۡ;->ۥ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    iget v2, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget v2, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    iget v3, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget p0, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    iget p1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {v0, v1, v2, p0}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p0

    new-instance p1, LYue/ۥۢۥۣۥ$ۥ;

    invoke-direct {p1, p2, p0}, LYue/ۥۢۥۣۥ$ۥ;-><init>(LYue/ۥ۠ۥۣۡ;LYue/ۥ۠ۥۣۡ;)V

    return-object p1
.end method

.method public static ۥ۟۟۟ۥ(ILYue/ۥۢۥۦ;LYue/ۥۢۥۦ;)Landroid/view/animation/Interpolator;
    .locals 0

    and-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_1

    invoke-static {}, LYue/ۥۢۥۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟()I

    move-result p0

    invoke-virtual {p1, p0}, LYue/ۥۢۥۦ;->ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;

    move-result-object p0

    iget p0, p0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    invoke-static {}, LYue/ۥۢۥۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟()I

    move-result p1

    invoke-virtual {p2, p1}, LYue/ۥۢۥۦ;->ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    iget p1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    if-le p0, p1, :cond_0

    sget-object p0, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟۠:Landroid/view/animation/Interpolator;

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟ۡ:Landroid/view/animation/Interpolator;

    return-object p0

    :cond_1
    sget-object p0, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟ۢ:Landroid/view/animation/Interpolator;

    return-object p0
.end method

.method public static ۥ۟۟۟ۦ(Landroid/view/View;LYue/ۥۢۥۣۥ$ۥ۟;)Landroid/view/View$OnApplyWindowInsetsListener;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۥۣۥ$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;-><init>(Landroid/view/View;LYue/ۥۢۥۣۥ$ۥ۟;)V

    return-object v0
.end method

.method public static ۥ۟۟۟ۧ(Landroid/view/View;LYue/ۥۢۥۣۥ;)V
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۥۣۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠ۡ(Landroid/view/View;)LYue/ۥۢۥۣۥ$ۥ۟;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥۢۥۣۥ$ۥ۟;->onEnd(LYue/ۥۢۥۣۥ;)V

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ$ۥ۟;->getDispatchMode()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟ۧ(Landroid/view/View;LYue/ۥۢۥۣۥ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۥ۟۟۟ۨ(Landroid/view/View;LYue/ۥۢۥۣۥ;Landroid/view/WindowInsets;Z)V
    .locals 2

    invoke-static {p0}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠ۡ(Landroid/view/View;)LYue/ۥۢۥۣۥ$ۥ۟;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iput-object p2, v0, LYue/ۥۢۥۣۥ$ۥ۟;->mDispachedInsets:Landroid/view/WindowInsets;

    if-nez p3, :cond_1

    invoke-virtual {v0, p1}, LYue/ۥۢۥۣۥ$ۥ۟;->onPrepare(LYue/ۥۢۥۣۥ;)V

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ$ۥ۟;->getDispatchMode()I

    move-result p3

    if-nez p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    move p3, v1

    :cond_1
    :goto_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/ViewGroup;

    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1, p2, p3}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟ۨ(Landroid/view/View;LYue/ۥۢۥۣۥ;Landroid/view/WindowInsets;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static ۥ۟۟۠(Landroid/view/View;LYue/ۥۢۥۦ;Ljava/util/List;)V
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LYue/\u06e5\u06e2\u06e5\u06e6;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06e5;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠ۡ(Landroid/view/View;)LYue/ۥۢۥۣۥ$ۥ۟;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۥۣۥ$ۥ۟;->onProgress(LYue/ۥۢۥۦ;Ljava/util/List;)LYue/ۥۢۥۦ;

    move-result-object p1

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ$ۥ۟;->getDispatchMode()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1, p2}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠(Landroid/view/View;LYue/ۥۢۥۦ;Ljava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۥ۟۟۠۟(Landroid/view/View;LYue/ۥۢۥۣۥ;LYue/ۥۢۥۣۥ$ۥ;)V
    .locals 2

    invoke-static {p0}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠ۡ(Landroid/view/View;)LYue/ۥۢۥۣۥ$ۥ۟;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۥۣۥ$ۥ۟;->onStart(LYue/ۥۢۥۣۥ;LYue/ۥۢۥۣۥ$ۥ;)LYue/ۥۢۥۣۥ$ۥ;

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ$ۥ۟;->getDispatchMode()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1, p2}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۠۟(Landroid/view/View;LYue/ۥۢۥۣۥ;LYue/ۥۢۥۣۥ$ۥ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۥ۟۟۠۠(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/view/WindowInsets;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۤۡ:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠ۡ(Landroid/view/View;)LYue/ۥۢۥۣۥ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۥ:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;

    iget-object p0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟$ۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static ۥ۟۟۠ۢ(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ;FI)LYue/ۥۢۥۦ;
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    new-instance v0, LYue/ۥۢۥۦ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۢۥۦ$ۥ۟;-><init>(LYue/ۥۢۥۦ;)V

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_1

    and-int v2, p3, v1

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, LYue/ۥۢۥۦ;->ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LYue/ۥۢۥۦ$ۥ۟;->ۥ۟۟(ILYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, LYue/ۥۢۥۦ;->ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;

    move-result-object v2

    invoke-virtual {p1, v1}, LYue/ۥۢۥۦ;->ۥ۟۟۟۠(I)LYue/ۥ۠ۥۣۡ;

    move-result-object v3

    iget v4, v2, LYue/ۥ۠ۥۣۡ;->ۥ:I

    iget v5, v3, LYue/ۥ۠ۥۣۡ;->ۥ:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v5, p2

    mul-float/2addr v4, v5

    float-to-double v6, v4

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    add-double/2addr v6, v8

    double-to-int v4, v6

    iget v6, v2, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    iget v7, v3, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    mul-float/2addr v6, v5

    float-to-double v6, v6

    add-double/2addr v6, v8

    double-to-int v6, v6

    iget v7, v2, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    iget v10, v3, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    sub-int/2addr v7, v10

    int-to-float v7, v7

    mul-float/2addr v7, v5

    float-to-double v10, v7

    add-double/2addr v10, v8

    double-to-int v7, v10

    iget v10, v2, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    iget v3, v3, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    sub-int/2addr v10, v3

    int-to-float v3, v10

    mul-float/2addr v3, v5

    float-to-double v10, v3

    add-double/2addr v10, v8

    double-to-int v3, v10

    invoke-static {v2, v4, v6, v7, v3}, LYue/ۥۢۥۦ;->ۥ۟۟ۡ(LYue/ۥ۠ۥۣۡ;IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LYue/ۥۢۥۦ$ۥ۟;->ۥ۟۟(ILYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟;->ۥ()LYue/ۥۢۥۦ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥۣ۟۟۠(Landroid/view/View;LYue/ۥۢۥۣۥ$ۥ۟;)V
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۥۣۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۤۡ:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_0

    sget p1, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۥ:I

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-nez v0, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟;->ۥ۟۟۟ۦ(Landroid/view/View;LYue/ۥۢۥۣۥ$ۥ۟;)Landroid/view/View$OnApplyWindowInsetsListener;

    move-result-object p1

    sget v1, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۥ:I

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    :cond_1
    :goto_0
    return-void
.end method

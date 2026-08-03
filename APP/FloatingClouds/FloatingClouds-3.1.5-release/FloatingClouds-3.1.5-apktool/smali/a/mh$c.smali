.class public final La/mh$c;
.super La/mh$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/mh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/mh$c$a;
    }
.end annotation


# static fields
.field public static final e:Landroid/view/animation/PathInterpolator;

.field public static final f:La/l6;

.field public static final g:Landroid/view/animation/DecelerateInterpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const v3, 0x3f8ccccd    # 1.1f

    invoke-direct {v0, v2, v3, v2, v1}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, La/mh$c;->e:Landroid/view/animation/PathInterpolator;

    new-instance v0, La/l6;

    invoke-direct {v0}, La/l6;-><init>()V

    sput-object v0, La/mh$c;->f:La/l6;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, La/mh$c;->g:Landroid/view/animation/DecelerateInterpolator;

    return-void
.end method

.method public static e(La/mh;Landroid/view/View;)V
    .locals 2

    invoke-static {p1}, La/mh$c;->j(Landroid/view/View;)La/mh$b;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, La/b9;

    iget-object p0, v0, La/b9;->b:Landroid/view/View;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {p0, v1}, La/mh$c;->e(La/mh;Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static f(Landroid/view/View;La/mh;Landroid/view/WindowInsets;Z)V
    .locals 2

    invoke-static {p0}, La/mh$c;->j(Landroid/view/View;)La/mh$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object p2, v0, La/mh$b;->a:Landroid/view/WindowInsets;

    if-nez p3, :cond_0

    check-cast v0, La/b9;

    iget-object p3, v0, La/b9;->b:Landroid/view/View;

    iget-object v1, v0, La/b9;->e:[I

    invoke-virtual {p3, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 p3, 0x1

    aget v1, v1, p3

    iput v1, v0, La/b9;->c:I

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

    invoke-static {v1, p1, p2, p3}, La/mh$c;->f(Landroid/view/View;La/mh;Landroid/view/WindowInsets;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static g(Landroid/view/View;La/nh;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "La/nh;",
            "Ljava/util/List<",
            "La/mh;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, La/mh$c;->j(Landroid/view/View;)La/mh$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, La/mh$b;->a(La/nh;Ljava/util/List;)La/nh;

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

    invoke-static {v1, p1, p2}, La/mh$c;->g(Landroid/view/View;La/nh;Ljava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static h(Landroid/view/View;La/mh;La/mh$a;)V
    .locals 2

    invoke-static {p0}, La/mh$c;->j(Landroid/view/View;)La/mh$b;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, La/b9;

    iget-object p0, v0, La/b9;->b:Landroid/view/View;

    iget-object p1, v0, La/b9;->e:[I

    invoke-virtual {p0, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 p2, 0x1

    aget p1, p1, p2

    iget p2, v0, La/b9;->c:I

    sub-int/2addr p2, p1

    iput p2, v0, La/b9;->d:I

    int-to-float p1, p2

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

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

    invoke-static {v1, p1, p2}, La/mh$c;->h(Landroid/view/View;La/mh;La/mh$a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    sget v0, Landroidx/core/R$id;->tag_on_apply_window_listener:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method public static j(Landroid/view/View;)La/mh$b;
    .locals 1

    sget v0, Landroidx/core/R$id;->tag_window_insets_animation_callback:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, La/mh$c$a;

    if-eqz v0, :cond_0

    check-cast p0, La/mh$c$a;

    iget-object p0, p0, La/mh$c$a;->a:La/b9;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

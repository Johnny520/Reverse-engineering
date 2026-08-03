.class public final La/mh$d$a;
.super Landroid/view/WindowInsetsAnimation$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/mh$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:La/b9;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La/mh;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/mh;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/WindowInsetsAnimation;",
            "La/mh;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/b9;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/view/WindowInsetsAnimation$Callback;-><init>(I)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La/mh$d$a;->d:Ljava/util/HashMap;

    iput-object p1, p0, La/mh$d$a;->a:La/b9;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/WindowInsetsAnimation;)La/mh;
    .locals 5

    iget-object v0, p0, La/mh$d$a;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/mh;

    if-nez v0, :cond_1

    new-instance v0, La/mh;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, La/mh;-><init>(ILandroid/view/animation/Interpolator;J)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    new-instance v1, La/mh$d;

    invoke-direct {v1, p1}, La/mh$d;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v1, v0, La/mh;->a:La/mh$e;

    :cond_0
    iget-object v1, p0, La/mh$d$a;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final onEnd(Landroid/view/WindowInsetsAnimation;)V
    .locals 2

    iget-object v0, p0, La/mh$d$a;->a:La/b9;

    invoke-virtual {p0, p1}, La/mh$d$a;->a(Landroid/view/WindowInsetsAnimation;)La/mh;

    iget-object v0, v0, La/b9;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, La/mh$d$a;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onPrepare(Landroid/view/WindowInsetsAnimation;)V
    .locals 2

    iget-object v0, p0, La/mh$d$a;->a:La/b9;

    invoke-virtual {p0, p1}, La/mh$d$a;->a(Landroid/view/WindowInsetsAnimation;)La/mh;

    iget-object p1, v0, La/b9;->b:Landroid/view/View;

    iget-object v1, v0, La/b9;->e:[I

    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 p1, 0x1

    aget p1, v1, p1

    iput p1, v0, La/b9;->c:I

    return-void
.end method

.method public final onProgress(Landroid/view/WindowInsets;Ljava/util/List;)Landroid/view/WindowInsets;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/WindowInsets;",
            "Ljava/util/List<",
            "Landroid/view/WindowInsetsAnimation;",
            ">;)",
            "Landroid/view/WindowInsets;"
        }
    .end annotation

    iget-object v0, p0, La/mh$d$a;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, La/mh$d$a;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La/mh$d$a;->b:Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/F;->j(Ljava/lang/Object;)Landroid/view/WindowInsetsAnimation;

    move-result-object v1

    invoke-virtual {p0, v1}, La/mh$d$a;->a(Landroid/view/WindowInsetsAnimation;)La/mh;

    move-result-object v2

    invoke-static {v1}, La/F;->s(Landroid/view/WindowInsetsAnimation;)F

    move-result v1

    iget-object v3, v2, La/mh;->a:La/mh$e;

    invoke-virtual {v3, v1}, La/mh$e;->d(F)V

    iget-object v1, p0, La/mh$d$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    iget-object p2, p0, La/mh$d$a;->a:La/b9;

    const/4 v0, 0x0

    invoke-static {v0, p1}, La/nh;->g(Landroid/view/View;Landroid/view/WindowInsets;)La/nh;

    move-result-object p1

    iget-object v0, p0, La/mh$d$a;->b:Ljava/util/List;

    invoke-virtual {p2, p1, v0}, La/b9;->a(La/nh;Ljava/util/List;)La/nh;

    invoke-virtual {p1}, La/nh;->f()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method

.method public final onStart(Landroid/view/WindowInsetsAnimation;Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 4

    iget-object v0, p0, La/mh$d$a;->a:La/b9;

    invoke-virtual {p0, p1}, La/mh$d$a;->a(Landroid/view/WindowInsetsAnimation;)La/mh;

    invoke-static {p2}, La/F;->u(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, La/a9;->c(Landroid/graphics/Insets;)La/a9;

    move-result-object p1

    invoke-static {p2}, La/F;->f(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {p2}, La/a9;->c(Landroid/graphics/Insets;)La/a9;

    move-result-object p2

    iget-object v1, v0, La/b9;->b:Landroid/view/View;

    iget-object v2, v0, La/b9;->e:[I

    invoke-virtual {v1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v3, 0x1

    aget v2, v2, v3

    iget v3, v0, La/b9;->c:I

    sub-int/2addr v3, v2

    iput v3, v0, La/b9;->d:I

    int-to-float v0, v3

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    invoke-static {}, La/F;->m()V

    invoke-virtual {p1}, La/a9;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {p2}, La/a9;->d()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {p1, p2}, La/F;->h(Landroid/graphics/Insets;Landroid/graphics/Insets;)Landroid/view/WindowInsetsAnimation$Bounds;

    move-result-object p1

    return-object p1
.end method

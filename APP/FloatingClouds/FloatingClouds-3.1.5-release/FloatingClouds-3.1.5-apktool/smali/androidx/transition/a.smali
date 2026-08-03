.class public final Landroidx/transition/a;
.super Landroidx/transition/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/a$g;,
        Landroidx/transition/a$f;
    }
.end annotation


# static fields
.field public static final C:[Ljava/lang/String;

.field public static final D:Landroidx/transition/a$a;

.field public static final E:Landroidx/transition/a$b;

.field public static final F:Landroidx/transition/a$c;

.field public static final G:Landroidx/transition/a$d;

.field public static final H:Landroidx/transition/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "android:changeBounds:clip"

    const-string v1, "android:changeBounds:parent"

    const-string v2, "android:changeBounds:bounds"

    const-string v3, "android:changeBounds:windowX"

    const-string v4, "android:changeBounds:windowY"

    filled-new-array {v2, v0, v1, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/transition/a;->C:[Ljava/lang/String;

    new-instance v0, Landroidx/transition/a$a;

    const-class v1, Landroid/graphics/PointF;

    const-string v2, "topLeft"

    invoke-direct {v0, v1, v2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/a;->D:Landroidx/transition/a$a;

    new-instance v0, Landroidx/transition/a$b;

    const-string v3, "bottomRight"

    invoke-direct {v0, v1, v3}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/a;->E:Landroidx/transition/a$b;

    new-instance v0, Landroidx/transition/a$c;

    invoke-direct {v0, v1, v3}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/a;->F:Landroidx/transition/a$c;

    new-instance v0, Landroidx/transition/a$d;

    invoke-direct {v0, v1, v2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/a;->G:Landroidx/transition/a$d;

    new-instance v0, Landroidx/transition/a$e;

    const-string v2, "position"

    invoke-direct {v0, v1, v2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/a;->H:Landroidx/transition/a$e;

    return-void
.end method

.method public static K(La/Ff;)V
    .locals 6

    iget-object v0, p0, La/Ff;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v1, p0, La/Ff;->a:Ljava/util/HashMap;

    new-instance v2, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-direct {v2, v3, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    const-string v0, "android:changeBounds:bounds"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, La/Ff;->b:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    const-string v0, "android:changeBounds:parent"

    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(La/Ff;)V
    .locals 0

    invoke-static {p1}, Landroidx/transition/a;->K(La/Ff;)V

    return-void
.end method

.method public final g(La/Ff;)V
    .locals 0

    invoke-static {p1}, Landroidx/transition/a;->K(La/Ff;)V

    return-void
.end method

.method public final k(Landroid/widget/FrameLayout;La/Ff;La/Ff;)Landroid/animation/Animator;
    .locals 18

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    if-eqz v1, :cond_0

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    move-object/from16 v1, p0

    goto/16 :goto_6

    :cond_1
    iget-object v1, v1, La/Ff;->a:Ljava/util/HashMap;

    iget-object v6, v2, La/Ff;->a:Ljava/util/HashMap;

    const-string v7, "android:changeBounds:parent"

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/ViewGroup;

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup;

    if-eqz v8, :cond_0

    if-nez v7, :cond_2

    goto :goto_0

    :cond_2
    const-string v7, "android:changeBounds:bounds"

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/Rect;

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/Rect;

    iget v9, v8, Landroid/graphics/Rect;->left:I

    iget v10, v7, Landroid/graphics/Rect;->left:I

    iget v11, v8, Landroid/graphics/Rect;->top:I

    iget v12, v7, Landroid/graphics/Rect;->top:I

    iget v13, v8, Landroid/graphics/Rect;->right:I

    iget v14, v7, Landroid/graphics/Rect;->right:I

    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    sub-int v15, v13, v9

    const/16 p1, 0x0

    sub-int v4, v8, v11

    const/16 v16, 0x1

    sub-int v5, v14, v10

    sub-int v3, v7, v12

    const-string v0, "android:changeBounds:clip"

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-eqz v15, :cond_3

    if-nez v4, :cond_4

    :cond_3
    if-eqz v5, :cond_8

    if-eqz v3, :cond_8

    :cond_4
    if-ne v9, v10, :cond_6

    if-eq v11, v12, :cond_5

    goto :goto_1

    :cond_5
    move/from16 v6, p1

    goto :goto_2

    :cond_6
    :goto_1
    move/from16 v6, v16

    :goto_2
    if-ne v13, v14, :cond_7

    if-eq v8, v7, :cond_9

    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_8
    move/from16 v6, p1

    :cond_9
    :goto_3
    if-eqz v1, :cond_a

    invoke-virtual {v1, v0}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_b

    :cond_a
    if-nez v1, :cond_c

    if-eqz v0, :cond_c

    :cond_b
    add-int/lit8 v6, v6, 0x1

    :cond_c
    if-lez v6, :cond_0

    iget-object v0, v2, La/Ff;->b:Landroid/view/View;

    invoke-static {v0, v9, v11, v13, v8}, La/Qg;->a(Landroid/view/View;IIII)V

    const/4 v1, 0x2

    if-ne v6, v1, :cond_e

    if-ne v15, v5, :cond_d

    if-ne v4, v3, :cond_d

    move-object/from16 v1, p0

    iget-object v2, v1, Landroidx/transition/e;->v:Landroidx/transition/e$a;

    int-to-float v3, v9

    int-to-float v4, v11

    int-to-float v5, v10

    int-to-float v6, v12

    invoke-virtual {v2, v3, v4, v5, v6}, Landroidx/transition/e$a;->g(FFFF)Landroid/graphics/Path;

    move-result-object v2

    sget-object v3, Landroidx/transition/a;->H:Landroidx/transition/a$e;

    invoke-static {v0, v3, v2}, La/Sb;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    goto :goto_5

    :cond_d
    move-object/from16 v1, p0

    new-instance v2, Landroidx/transition/a$g;

    invoke-direct {v2, v0}, Landroidx/transition/a$g;-><init>(Landroid/view/View;)V

    iget-object v3, v1, Landroidx/transition/e;->v:Landroidx/transition/e$a;

    int-to-float v4, v9

    int-to-float v5, v11

    int-to-float v6, v10

    int-to-float v9, v12

    invoke-virtual {v3, v4, v5, v6, v9}, Landroidx/transition/e$a;->g(FFFF)Landroid/graphics/Path;

    move-result-object v3

    sget-object v4, Landroidx/transition/a;->D:Landroidx/transition/a$a;

    invoke-static {v2, v4, v3}, La/Sb;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v3

    iget-object v4, v1, Landroidx/transition/e;->v:Landroidx/transition/e$a;

    int-to-float v5, v13

    int-to-float v6, v8

    int-to-float v8, v14

    int-to-float v7, v7

    invoke-virtual {v4, v5, v6, v8, v7}, Landroidx/transition/e$a;->g(FFFF)Landroid/graphics/Path;

    move-result-object v4

    sget-object v5, Landroidx/transition/a;->E:Landroidx/transition/a$b;

    invoke-static {v2, v5, v4}, La/Sb;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v4

    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v6, 0x2

    new-array v6, v6, [Landroid/animation/Animator;

    aput-object v3, v6, p1

    aput-object v4, v6, v16

    invoke-virtual {v5, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v3, Landroidx/transition/b;

    invoke-direct {v3, v2}, Landroidx/transition/b;-><init>(Landroidx/transition/a$g;)V

    invoke-virtual {v5, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object v2, v5

    goto :goto_5

    :cond_e
    move-object/from16 v1, p0

    if-ne v9, v10, :cond_10

    if-eq v11, v12, :cond_f

    goto :goto_4

    :cond_f
    iget-object v2, v1, Landroidx/transition/e;->v:Landroidx/transition/e$a;

    int-to-float v3, v13

    int-to-float v4, v8

    int-to-float v5, v14

    int-to-float v6, v7

    invoke-virtual {v2, v3, v4, v5, v6}, Landroidx/transition/e$a;->g(FFFF)Landroid/graphics/Path;

    move-result-object v2

    sget-object v3, Landroidx/transition/a;->F:Landroidx/transition/a$c;

    invoke-static {v0, v3, v2}, La/Sb;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    goto :goto_5

    :cond_10
    :goto_4
    iget-object v2, v1, Landroidx/transition/e;->v:Landroidx/transition/e$a;

    int-to-float v3, v9

    int-to-float v4, v11

    int-to-float v5, v10

    int-to-float v6, v12

    invoke-virtual {v2, v3, v4, v5, v6}, Landroidx/transition/e$a;->g(FFFF)Landroid/graphics/Path;

    move-result-object v2

    sget-object v3, Landroidx/transition/a;->G:Landroidx/transition/a$d;

    invoke-static {v0, v3, v2}, La/Sb;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    :goto_5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v3, v3, Landroid/view/ViewGroup;

    if-eqz v3, :cond_11

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    move/from16 v3, v16

    invoke-static {v0, v3}, La/Ag;->a(Landroid/view/ViewGroup;Z)V

    invoke-virtual {v1}, Landroidx/transition/e;->o()Landroidx/transition/e;

    move-result-object v3

    new-instance v4, Landroidx/transition/a$f;

    invoke-direct {v4, v0}, Landroidx/transition/a$f;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v3, v4}, Landroidx/transition/e;->a(Landroidx/transition/e$f;)V

    :cond_11
    return-object v2

    :goto_6
    const/4 v0, 0x0

    return-object v0
.end method

.method public final q()[Ljava/lang/String;
    .locals 1

    sget-object v0, Landroidx/transition/a;->C:[Ljava/lang/String;

    return-object v0
.end method

.class public final LoF;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final a:Lxb;

.field public b:LLF;


# direct methods
.method public constructor <init>(Landroid/view/View;Lxb;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LoF;->a:Lxb;

    sget-object p2, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, LfE;->a(Landroid/view/View;)LLF;

    move-result-object p1

    if-eqz p1, :cond_4

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x22

    if-lt p2, v0, :cond_0

    new-instance p2, LyF;

    invoke-direct {p2, p1}, LyF;-><init>(LLF;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x1f

    if-lt p2, v0, :cond_1

    new-instance p2, LxF;

    invoke-direct {p2, p1}, LxF;-><init>(LLF;)V

    goto :goto_0

    :cond_1
    const/16 v0, 0x1e

    if-lt p2, v0, :cond_2

    new-instance p2, LwF;

    invoke-direct {p2, p1}, LwF;-><init>(LLF;)V

    goto :goto_0

    :cond_2
    const/16 v0, 0x1d

    if-lt p2, v0, :cond_3

    new-instance p2, LvF;

    invoke-direct {p2, p1}, LvF;-><init>(LLF;)V

    goto :goto_0

    :cond_3
    new-instance p2, LuF;

    invoke-direct {p2, p1}, LuF;-><init>(LLF;)V

    :goto_0
    invoke-virtual {p2}, LzF;->b()LLF;

    move-result-object p1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, LoF;->b:LLF;

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    invoke-virtual {v6}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static/range {p1 .. p2}, LLF;->h(Landroid/view/View;Landroid/view/WindowInsets;)LLF;

    move-result-object v1

    iput-object v1, v0, LoF;->b:LLF;

    invoke-static/range {p1 .. p2}, LpF;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_0
    invoke-static/range {p1 .. p2}, LLF;->h(Landroid/view/View;Landroid/view/WindowInsets;)LLF;

    move-result-object v3

    iget-object v1, v3, LLF;->a:LHF;

    iget-object v2, v0, LoF;->b:LLF;

    if-nez v2, :cond_1

    sget-object v2, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {v6}, LfE;->a(Landroid/view/View;)LLF;

    move-result-object v2

    iput-object v2, v0, LoF;->b:LLF;

    :cond_1
    iget-object v2, v0, LoF;->b:LLF;

    if-nez v2, :cond_2

    iput-object v3, v0, LoF;->b:LLF;

    invoke-static/range {p1 .. p2}, LpF;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_2
    invoke-static {v6}, LpF;->j(Landroid/view/View;)Lxb;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, v2, Lxb;->b:Ljava/lang/Object;

    check-cast v2, LLF;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static/range {p1 .. p2}, LpF;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_3
    const/4 v2, 0x1

    new-array v4, v2, [I

    new-array v5, v2, [I

    iget-object v7, v0, LoF;->b:LLF;

    move v8, v2

    :goto_0
    const/16 v9, 0x200

    if-gt v8, v9, :cond_a

    invoke-virtual {v1, v8}, LHF;->g(I)Lyl;

    move-result-object v9

    iget-object v11, v7, LLF;->a:LHF;

    invoke-virtual {v11, v8}, LHF;->g(I)Lyl;

    move-result-object v11

    iget v12, v9, Lyl;->a:I

    iget v13, v9, Lyl;->d:I

    iget v14, v9, Lyl;->c:I

    iget v9, v9, Lyl;->b:I

    iget v15, v11, Lyl;->a:I

    iget v2, v11, Lyl;->d:I

    const/16 v17, 0x0

    iget v10, v11, Lyl;->c:I

    iget v11, v11, Lyl;->b:I

    if-gt v12, v15, :cond_5

    if-gt v9, v11, :cond_5

    if-gt v14, v10, :cond_5

    if-le v13, v2, :cond_4

    goto :goto_1

    :cond_4
    move-object/from16 v18, v4

    move/from16 v4, v17

    goto :goto_2

    :cond_5
    :goto_1
    move-object/from16 v18, v4

    const/4 v4, 0x1

    :goto_2
    if-lt v12, v15, :cond_7

    if-lt v9, v11, :cond_7

    if-lt v14, v10, :cond_7

    if-ge v13, v2, :cond_6

    goto :goto_3

    :cond_6
    move/from16 v2, v17

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v2, 0x1

    :goto_4
    if-eq v4, v2, :cond_9

    if-eqz v4, :cond_8

    aget v2, v18, v17

    or-int/2addr v2, v8

    aput v2, v18, v17

    goto :goto_5

    :cond_8
    aget v2, v5, v17

    or-int/2addr v2, v8

    aput v2, v5, v17

    :cond_9
    :goto_5
    shl-int/lit8 v8, v8, 0x1

    move-object/from16 v4, v18

    const/4 v2, 0x1

    goto :goto_0

    :cond_a
    move-object/from16 v18, v4

    const/16 v17, 0x0

    aget v2, v18, v17

    aget v4, v5, v17

    or-int v5, v2, v4

    if-nez v5, :cond_b

    iput-object v3, v0, LoF;->b:LLF;

    invoke-static/range {p1 .. p2}, LpF;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_b
    iget-object v7, v0, LoF;->b:LLF;

    and-int/lit8 v8, v2, 0x8

    if-eqz v8, :cond_c

    sget-object v2, LpF;->e:Landroid/view/animation/PathInterpolator;

    goto :goto_6

    :cond_c
    and-int/lit8 v8, v4, 0x8

    if-eqz v8, :cond_d

    sget-object v2, LpF;->f:Leh;

    goto :goto_6

    :cond_d
    and-int/lit16 v2, v2, 0x207

    if-eqz v2, :cond_e

    sget-object v2, LpF;->g:Landroid/view/animation/DecelerateInterpolator;

    goto :goto_6

    :cond_e
    and-int/lit16 v2, v4, 0x207

    if-eqz v2, :cond_f

    sget-object v2, LpF;->h:Landroid/view/animation/AccelerateInterpolator;

    goto :goto_6

    :cond_f
    const/4 v2, 0x0

    :goto_6
    new-instance v4, LtF;

    and-int/lit8 v8, v5, 0x8

    if-eqz v8, :cond_10

    const-wide/16 v8, 0xa0

    goto :goto_7

    :cond_10
    const-wide/16 v8, 0xfa

    :goto_7
    invoke-direct {v4, v5, v2, v8, v9}, LtF;-><init>(ILandroid/view/animation/Interpolator;J)V

    iget-object v2, v4, LtF;->a:LsF;

    const/4 v8, 0x0

    invoke-virtual {v2, v8}, LsF;->d(F)V

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    iget-object v8, v4, LtF;->a:LsF;

    invoke-virtual {v8}, LsF;->a()J

    move-result-wide v8

    invoke-virtual {v2, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v8

    invoke-virtual {v1, v5}, LHF;->g(I)Lyl;

    move-result-object v1

    iget-object v2, v7, LLF;->a:LHF;

    invoke-virtual {v2, v5}, LHF;->g(I)Lyl;

    move-result-object v2

    iget v9, v1, Lyl;->a:I

    iget v10, v2, Lyl;->a:I

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    iget v10, v1, Lyl;->b:I

    iget v11, v2, Lyl;->b:I

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v12

    iget v13, v1, Lyl;->c:I

    iget v14, v2, Lyl;->c:I

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v15

    move-object/from16 v16, v4

    iget v4, v1, Lyl;->d:I

    move/from16 v18, v5

    iget v5, v2, Lyl;->d:I

    move-object/from16 v19, v7

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-static {v9, v12, v15, v7}, Lyl;->b(IIII)Lyl;

    move-result-object v7

    iget v1, v1, Lyl;->a:I

    iget v2, v2, Lyl;->a:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v1, v2, v9, v4}, Lyl;->b(IIII)Lyl;

    move-result-object v1

    new-instance v9, LGy;

    const/4 v2, 0x6

    invoke-direct {v9, v2, v7, v1}, LGy;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move/from16 v1, v17

    invoke-static {v6, v3, v1}, LpF;->f(Landroid/view/View;LLF;Z)V

    new-instance v1, LnF;

    move-object/from16 v2, v16

    move/from16 v5, v18

    move-object/from16 v4, v19

    invoke-direct/range {v1 .. v6}, LnF;-><init>(LtF;LLF;LLF;ILandroid/view/View;)V

    invoke-virtual {v8, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v1, LFB;

    invoke-direct {v1, v2, v6}, LFB;-><init>(LtF;Landroid/view/View;)V

    invoke-virtual {v8, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v1, Lew;

    invoke-direct {v1, v6, v2, v9, v8}, Lew;-><init>(Landroid/view/View;LtF;LGy;Landroid/animation/ValueAnimator;)V

    invoke-static {v6, v1}, Lst;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-object v3, v0, LoF;->b:LLF;

    invoke-static/range {p1 .. p2}, LpF;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

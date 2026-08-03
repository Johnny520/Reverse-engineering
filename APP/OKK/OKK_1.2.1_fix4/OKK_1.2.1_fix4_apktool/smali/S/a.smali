.class public final synthetic LS/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LS/a;->a:I

    iput p1, p0, LS/a;->b:I

    iput-object p2, p0, LS/a;->c:Ljava/lang/Object;

    iput-object p3, p0, LS/a;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LS/b;ILjava/io/Serializable;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, LS/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/a;->c:Ljava/lang/Object;

    iput p2, p0, LS/a;->b:I

    iput-object p3, p0, LS/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Landroid/view/View;I)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, LS/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/a;->c:Ljava/lang/Object;

    iput-object p2, p0, LS/a;->d:Ljava/lang/Object;

    iput p3, p0, LS/a;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget v3, p0, LS/a;->a:I

    packed-switch v3, :pswitch_data_0

    iget-object v3, p0, LS/a;->c:Ljava/lang/Object;

    check-cast v3, Landroid/view/View;

    iget-object v4, p0, LS/a;->d:Ljava/lang/Object;

    check-cast v4, Landroid/view/View;

    iget v5, p0, LS/a;->b:I

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    if-lez v5, :cond_0

    sput-boolean v2, LU/S;->s:Z

    const/4 v6, 0x0

    invoke-virtual {v3, v0, v6}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    new-instance v6, Landroid/animation/AnimatorSet;

    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    sget-object v7, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    invoke-virtual {v3}, Landroid/view/View;->getTranslationX()F

    move-result v8

    int-to-float v5, v5

    neg-float v5, v5

    new-array v9, v0, [F

    aput v8, v9, v1

    aput v5, v9, v2

    invoke-static {v3, v7, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    sget-object v7, Landroid/view/View;->ALPHA:Landroid/util/Property;

    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    move-result v8

    const/4 v9, 0x0

    new-array v10, v0, [F

    aput v8, v10, v1

    aput v9, v10, v2

    invoke-static {v4, v7, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    new-array v0, v0, [Landroid/animation/Animator;

    aput-object v5, v0, v1

    aput-object v4, v0, v2

    invoke-virtual {v6, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const-wide/16 v4, 0xa0

    invoke-virtual {v6, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v2, 0x3f4ccccd    # 0.8f

    const v4, 0x3e19999a    # 0.15f

    const v5, 0x3e99999a    # 0.3f

    invoke-direct {v0, v5, v9, v2, v4}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    invoke-virtual {v6, v0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v0, Ld0/p;

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct {v0, v3, v1}, Ld0/p;-><init>(Landroid/widget/LinearLayout;I)V

    invoke-virtual {v6, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_0

    :cond_0
    invoke-static {v1}, LU/S;->n(Z)V

    :goto_0
    return-void

    :pswitch_0
    iget v0, p0, LS/a;->b:I

    iget-object v1, p0, LS/a;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, LS/a;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "$targets"

    invoke-static {v1, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$body"

    invoke-static {v2, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lc0/h1;->e:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    sget-object v4, Lc0/h1;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eq v0, v4, :cond_1

    monitor-exit v3

    goto :goto_4

    :cond_1
    :try_start_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    sget-object v4, Lc0/h1;->a:Lc0/h1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_2
    :goto_2
    sget-object v4, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v1, v2, v4}, LN0/k;->j0(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_3
    :try_start_3
    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_3
    monitor-exit v3

    :goto_4
    return-void

    :goto_5
    monitor-exit v3

    throw v0

    :pswitch_1
    const-string v0, "$bar"

    iget-object v1, p0, LS/a;->c:Ljava/lang/Object;

    check-cast v1, Ld0/s;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$parent"

    iget-object v3, p0, LS/a;->d:Ljava/lang/Object;

    check-cast v3, Landroid/view/ViewGroup;

    invoke-static {v3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LS/a;->b:I

    sub-int/2addr v0, v2

    invoke-static {v1, v3, v0}, Lc0/G;->f(Ld0/s;Landroid/view/ViewGroup;I)V

    return-void

    :pswitch_2
    iget-object v0, p0, LS/a;->c:Ljava/lang/Object;

    check-cast v0, LS/b;

    iget-object v0, v0, LS/b;->b:LS/f;

    iget-object v1, p0, LS/a;->d:Ljava/lang/Object;

    check-cast v1, Ljava/io/Serializable;

    iget v2, p0, LS/a;->b:I

    invoke-interface {v0, v2, v1}, LS/f;->n(ILjava/io/Serializable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lio/sentry/android/replay/t;
.super LBn;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/e;Ljava/io/Serializable;I)V
    .locals 0

    .line 2
    iput p3, p0, Lio/sentry/android/replay/t;->b:I

    iput-object p1, p0, Lio/sentry/android/replay/t;->c:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/replay/t;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/replay/v;Ljava/util/ArrayList;Landroid/graphics/Canvas;)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lio/sentry/android/replay/t;->b:I

    .line 1
    iput-object p1, p0, Lio/sentry/android/replay/t;->c:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/replay/t;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lio/sentry/android/replay/t;->b:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lio/sentry/android/replay/capture/m;

    iget-object v2, v0, Lio/sentry/android/replay/t;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/replay/capture/q;

    instance-of v3, v1, Lio/sentry/android/replay/capture/k;

    if-eqz v3, :cond_0

    check-cast v1, Lio/sentry/android/replay/capture/k;

    iget-object v3, v2, Lio/sentry/android/replay/capture/q;->s:Lio/sentry/Z;

    invoke-static {v1, v3}, Lio/sentry/android/replay/capture/k;->a(Lio/sentry/android/replay/capture/k;Lio/sentry/Z;)V

    :cond_0
    const/4 v1, -0x1

    invoke-virtual {v2, v1}, Lio/sentry/android/replay/capture/e;->l(I)V

    iget-object v1, v0, Lio/sentry/android/replay/t;->d:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    invoke-static {v1}, Lio/sentry/config/a;->f(Ljava/io/File;)Z

    sget-object v1, LTC;->a:LTC;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lio/sentry/android/replay/capture/m;

    iget-object v2, v0, Lio/sentry/android/replay/t;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/replay/capture/h;

    iget-object v3, v2, Lio/sentry/android/replay/capture/h;->v:Ljava/util/ArrayList;

    iget-object v2, v2, Lio/sentry/android/replay/capture/h;->s:Lio/sentry/Z;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    move-object v4, v6

    goto :goto_0

    :cond_1
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    :goto_0
    check-cast v4, Lio/sentry/android/replay/capture/k;

    :goto_1
    if-eqz v4, :cond_3

    invoke-static {v4, v2}, Lio/sentry/android/replay/capture/k;->a(Lio/sentry/android/replay/capture/k;Lio/sentry/Z;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v4, v6

    goto :goto_2

    :cond_2
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    :goto_2
    check-cast v4, Lio/sentry/android/replay/capture/k;

    const-wide/16 v7, 0x64

    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_1

    :cond_3
    instance-of v3, v1, Lio/sentry/android/replay/capture/k;

    if-eqz v3, :cond_4

    check-cast v1, Lio/sentry/android/replay/capture/k;

    invoke-static {v1, v2}, Lio/sentry/android/replay/capture/k;->a(Lio/sentry/android/replay/capture/k;Lio/sentry/Z;)V

    iget-object v2, v0, Lio/sentry/android/replay/t;->d:Ljava/lang/Object;

    check-cast v2, Lht;

    iget-object v1, v1, Lio/sentry/android/replay/capture/k;->a:Lio/sentry/x2;

    iget-object v1, v1, Lio/sentry/x2;->u:Ljava/util/Date;

    invoke-virtual {v2, v1}, Lht;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object v1, LTC;->a:LTC;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Lio/sentry/android/replay/viewhierarchy/f;

    iget-object v2, v0, Lio/sentry/android/replay/t;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/replay/v;

    iget-object v3, v2, Lio/sentry/android/replay/v;->g:Ljava/lang/Object;

    iget-object v4, v1, Lio/sentry/android/replay/viewhierarchy/f;->e:Landroid/graphics/Rect;

    iget-boolean v5, v1, Lio/sentry/android/replay/viewhierarchy/f;->d:Z

    if-eqz v5, :cond_f

    iget v5, v1, Lio/sentry/android/replay/viewhierarchy/f;->a:I

    if-lez v5, :cond_f

    iget v5, v1, Lio/sentry/android/replay/viewhierarchy/f;->b:I

    if-lez v5, :cond_f

    if-nez v4, :cond_5

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_a

    :cond_5
    instance-of v5, v1, Lio/sentry/android/replay/viewhierarchy/d;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_6

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iget-object v5, v2, Lio/sentry/android/replay/v;->i:Landroid/graphics/Bitmap;

    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8, v4}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v8}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    iget-object v9, v2, Lio/sentry/android/replay/v;->k:Ljava/lang/Object;

    invoke-interface {v9}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/Matrix;

    invoke-virtual {v9, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    invoke-virtual {v4, v8}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    iget-object v4, v2, Lio/sentry/android/replay/v;->j:Ljava/lang/Object;

    invoke-interface {v4}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Canvas;

    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9, v7, v7, v6, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v8, v9, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v4, v2, Lio/sentry/android/replay/v;->h:Ljava/lang/Object;

    invoke-interface {v4}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Bitmap;

    invoke-virtual {v4, v7, v7}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, LEt;

    invoke-direct {v5, v1, v4}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_6
    instance-of v5, v1, Lio/sentry/android/replay/viewhierarchy/e;

    const/high16 v8, -0x1000000

    if-eqz v5, :cond_d

    check-cast v1, Lio/sentry/android/replay/viewhierarchy/e;

    iget-object v5, v1, Lio/sentry/android/replay/viewhierarchy/e;->g:Lio/sentry/android/replay/util/i;

    if-eqz v5, :cond_7

    invoke-interface {v5}, Lio/sentry/android/replay/util/i;->c()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_7

    :goto_3
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_4

    :cond_7
    iget-object v9, v1, Lio/sentry/android/replay/viewhierarchy/e;->h:Ljava/lang/Integer;

    if-eqz v9, :cond_8

    goto :goto_3

    :cond_8
    :goto_4
    iget v9, v1, Lio/sentry/android/replay/viewhierarchy/e;->i:I

    iget v1, v1, Lio/sentry/android/replay/viewhierarchy/e;->j:I

    if-nez v5, :cond_9

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_7

    :cond_9
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Lio/sentry/android/replay/util/i;->b()I

    move-result v11

    move v12, v7

    :goto_5
    if-ge v12, v11, :cond_c

    invoke-interface {v5, v12}, Lio/sentry/android/replay/util/i;->a(I)I

    move-result v13

    invoke-interface {v5, v12, v13}, Lio/sentry/android/replay/util/i;->f(II)F

    move-result v13

    float-to-int v13, v13

    invoke-interface {v5, v12}, Lio/sentry/android/replay/util/i;->g(I)I

    move-result v14

    invoke-interface {v5, v12}, Lio/sentry/android/replay/util/i;->d(I)I

    move-result v15

    sub-int v16, v15, v14

    if-lez v14, :cond_a

    move v14, v6

    goto :goto_6

    :cond_a
    move v14, v7

    :goto_6
    add-int v14, v16, v14

    invoke-interface {v5, v12, v14}, Lio/sentry/android/replay/util/i;->f(II)F

    move-result v14

    float-to-int v14, v14

    if-nez v14, :cond_b

    if-lez v15, :cond_b

    add-int/lit8 v15, v15, -0x1

    invoke-interface {v5, v12, v15}, Lio/sentry/android/replay/util/i;->f(II)F

    move-result v14

    float-to-int v14, v14

    add-int/2addr v14, v6

    :cond_b
    invoke-interface {v5, v12}, Lio/sentry/android/replay/util/i;->e(I)I

    move-result v15

    invoke-interface {v5, v12}, Lio/sentry/android/replay/util/i;->h(I)I

    move-result v16

    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    iget v7, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v9

    add-int/2addr v7, v13

    iput v7, v6, Landroid/graphics/Rect;->left:I

    sub-int/2addr v14, v13

    add-int/2addr v14, v7

    iput v14, v6, Landroid/graphics/Rect;->right:I

    iget v7, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v1

    add-int/2addr v7, v15

    iput v7, v6, Landroid/graphics/Rect;->top:I

    sub-int v16, v16, v15

    add-int v7, v16, v7

    iput v7, v6, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_5

    :cond_c
    move-object v1, v10

    :goto_7
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, LEt;

    invoke-direct {v5, v1, v4}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, LEt;

    invoke-direct {v5, v1, v4}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_8
    iget-object v1, v5, LEt;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v4, v5, LEt;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-interface {v3}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Paint;

    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, v0, Lio/sentry/android/replay/t;->d:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Canvas;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-interface {v3}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Paint;

    const/high16 v7, 0x41200000    # 10.0f

    invoke-virtual {v4, v6, v7, v7, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_9

    :cond_e
    iget-object v1, v2, Lio/sentry/android/replay/v;->b:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getReplayController()Lio/sentry/k1;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_f
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_a
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

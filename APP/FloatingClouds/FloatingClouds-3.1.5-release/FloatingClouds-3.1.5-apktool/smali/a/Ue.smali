.class public final La/Ue;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# static fields
.field public static volatile t:La/Ue;


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/view/View;

.field public c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public e:Z

.field public f:I

.field public g:J

.field public h:Z

.field public volatile i:Z

.field public j:F

.field public k:F

.field public final l:Landroid/os/Handler;

.field public final m:La/M2;

.field public n:I

.field public o:La/Ue$a;

.field public final p:Landroid/os/Handler;

.field public q:Z

.field public final r:La/Ue$b;

.field public s:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, La/Ue;->l:Landroid/os/Handler;

    new-instance v0, La/M2;

    const/16 v1, 0x10

    invoke-direct {v0, v1, p0}, La/M2;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, La/Ue;->m:La/M2;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, La/Ue;->p:Landroid/os/Handler;

    new-instance v0, La/Ue$b;

    invoke-direct {v0, p0}, La/Ue$b;-><init>(La/Ue;)V

    iput-object v0, p0, La/Ue;->r:La/Ue$b;

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Landroid/view/View;)V
    .locals 3

    iput-object p2, p0, La/Ue;->b:Landroid/view/View;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/Ue;->c:Ljava/lang/ref/WeakReference;

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    invoke-static {}, La/K3$a;->l()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, v0, La/jc;->u:Z

    if-nez v1, :cond_1

    iget-boolean v0, v0, La/jc;->x:Z

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TempUnhideTrigger: attachIfNeeded (rootView="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, La/Ue;->c(Landroid/app/Activity;)V

    invoke-virtual {p0, p1, p2}, La/Ue;->d(Landroid/app/Activity;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, La/Ue;->f()V

    return-void

    :cond_2
    const/4 v0, 0x0

    iput v0, p0, La/Ue;->n:I

    invoke-virtual {p0, p2}, La/Ue;->e(Landroid/view/View;)V

    new-instance v0, La/Ue$a;

    invoke-direct {v0, p0, p2, p1}, La/Ue$a;-><init>(La/Ue;Landroid/view/View;Landroid/app/Activity;)V

    iput-object v0, p0, La/Ue;->o:La/Ue$a;

    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    new-instance p1, La/P0;

    const/16 v0, 0xf

    invoke-direct {p1, p0, v0, p2}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const-wide/16 v0, 0xbb8

    invoke-virtual {p2, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final b(Landroid/view/MotionEvent;Landroid/app/Activity;)V
    .locals 22

    move-object/from16 v1, p0

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1a

    :cond_0
    iget-boolean v0, v2, La/jc;->u:Z

    if-nez v0, :cond_1

    iget-boolean v0, v2, La/jc;->x:Z

    if-nez v0, :cond_1

    goto/16 :goto_1a

    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-string v6, ")"

    if-eqz v0, :cond_12

    const/4 v7, 0x3

    if-eq v0, v5, :cond_6

    if-eq v0, v3, :cond_4

    if-eq v0, v7, :cond_2

    goto/16 :goto_1a

    :cond_2
    iget-boolean v0, v1, La/Ue;->e:Z

    if-nez v0, :cond_3

    goto/16 :goto_1a

    :cond_3
    iput-boolean v4, v1, La/Ue;->h:Z

    iget-object v0, v1, La/Ue;->l:Landroid/os/Handler;

    iget-object v2, v1, La/Ue;->m:La/M2;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iput-boolean v4, v1, La/Ue;->e:Z

    return-void

    :cond_4
    iget-boolean v0, v1, La/Ue;->e:Z

    if-nez v0, :cond_5

    goto/16 :goto_1a

    :cond_5
    iget-boolean v0, v1, La/Ue;->h:Z

    if-eqz v0, :cond_36

    invoke-static/range {p2 .. p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget v3, v1, La/Ue;->j:F

    sub-float/2addr v2, v3

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iget v5, v1, La/Ue;->k:F

    sub-float/2addr v3, v5

    mul-float/2addr v2, v2

    mul-float/2addr v3, v3

    add-float/2addr v3, v2

    mul-int/2addr v0, v0

    int-to-float v0, v0

    cmpl-float v0, v3, v0

    if-lez v0, :cond_36

    iput-boolean v4, v1, La/Ue;->h:Z

    iget-object v0, v1, La/Ue;->l:Landroid/os/Handler;

    iget-object v2, v1, La/Ue;->m:La/M2;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void

    :cond_6
    iget-boolean v0, v1, La/Ue;->e:Z

    if-nez v0, :cond_7

    goto/16 :goto_1a

    :cond_7
    iput v4, v1, La/Ue;->s:I

    iput-boolean v4, v1, La/Ue;->h:Z

    iget-object v0, v1, La/Ue;->l:Landroid/os/Handler;

    iget-object v3, v1, La/Ue;->m:La/M2;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-boolean v0, v2, La/jc;->u:Z

    if-eqz v0, :cond_11

    iget-boolean v0, v1, La/Ue;->i:Z

    if-nez v0, :cond_11

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v2, v0, La/jc;->u:Z

    if-nez v2, :cond_8

    goto/16 :goto_3

    :cond_8
    iget v2, v0, La/jc;->w:I

    if-lez v2, :cond_9

    int-to-long v2, v2

    goto :goto_0

    :cond_9
    const-wide/16 v2, 0x1f4

    :goto_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v8

    int-to-long v8, v8

    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    iget-wide v10, v1, La/Ue;->g:J

    sub-long v10, v8, v10

    cmp-long v10, v10, v2

    if-gez v10, :cond_a

    iget v10, v1, La/Ue;->f:I

    add-int/2addr v10, v5

    goto :goto_1

    :cond_a
    move v10, v5

    :goto_1
    iput v10, v1, La/Ue;->f:I

    iput-wide v8, v1, La/Ue;->g:J

    iget v0, v0, La/jc;->v:I

    if-lez v0, :cond_b

    move v7, v0

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v8, "TempUnhideTrigger: tap count="

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "/"

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, " (window="

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "ms)"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    iget v0, v1, La/Ue;->f:I

    if-ne v0, v7, :cond_11

    iput v4, v1, La/Ue;->f:I

    const-string v0, "TempUnhideTrigger: multi-click TRIGGERED ("

    const-string v2, " taps)"

    invoke-static {v7, v0, v2}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    invoke-static {}, La/K3$a;->l()Z

    move-result v2

    if-eqz v2, :cond_11

    iget-boolean v0, v0, La/jc;->u:Z

    if-nez v0, :cond_c

    goto :goto_3

    :cond_c
    sget-object v0, La/x8;->a:La/x8;

    sget-object v2, La/ca$c;->a:La/ca$c;

    sget-object v3, La/ca$b;->b:La/ca$b;

    sget-object v7, La/ca$b;->a:La/ca$b;

    invoke-static {v7}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    const-string v8, "singleton(...)"

    invoke-static {v7, v8}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v2, v7}, La/x8;->c(La/ca$b;La/ca$c;Ljava/util/Set;)Z

    move-result v0

    if-nez v0, :cond_d

    sget-object v0, La/x8;->b:La/ca$b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TempUnhideTrigger: multi-click unhide BLOCKED (state="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_3

    :cond_d
    const-string v0, "TempUnhideTrigger: multi-click unhide triggered"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/w1;->p:Landroid/content/Context;

    if-nez v0, :cond_e

    goto :goto_2

    :cond_e
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    iget-boolean v3, v2, La/jc;->R:Z

    if-eqz v3, :cond_10

    iget-object v2, v2, La/jc;->S:Ljava/lang/String;

    invoke-static {v2}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_f

    const-string v2, "\u523b\u821f\u6c42\u5251"

    :cond_f
    invoke-static {v0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_10
    :goto_2
    invoke-static {}, La/s4$a;->a()V

    :cond_11
    :goto_3
    iput-boolean v4, v1, La/Ue;->i:Z

    iput-boolean v4, v1, La/Ue;->e:Z

    return-void

    :cond_12
    iget-object v0, v1, La/Ue;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_4

    :cond_13
    const/4 v0, 0x0

    :goto_4
    instance-of v8, v0, Landroid/widget/TextView;

    if-eqz v8, :cond_14

    check-cast v0, Landroid/widget/TextView;

    move-object v8, v0

    goto :goto_5

    :cond_14
    const/4 v8, 0x0

    :goto_5
    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v9, v0, Landroid/util/DisplayMetrics;->density:F

    iget v10, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v11, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v12, v0

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    float-to-int v13, v0

    if-eqz v8, :cond_27

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_27

    invoke-virtual {v8}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-virtual {v8}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    const-string v15, ","

    if-nez v0, :cond_16

    :cond_15
    :goto_6
    move-object/from16 v21, v2

    move/from16 v18, v4

    move/from16 v20, v9

    const/4 v2, 0x0

    goto/16 :goto_9

    :cond_16
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v16

    if-gtz v16, :cond_17

    goto :goto_6

    :cond_17
    invoke-virtual {v0, v4}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v7

    invoke-virtual {v0, v4}, Landroid/text/Layout;->getLineRight(I)F

    move-result v14

    move/from16 v17, v5

    invoke-virtual {v0, v4}, Landroid/text/Layout;->getLineTop(I)I

    move-result v5

    invoke-virtual {v0, v4}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v0

    cmpg-float v18, v14, v7

    if-lez v18, :cond_15

    if-gt v0, v5, :cond_18

    goto :goto_6

    :cond_18
    move/from16 v18, v4

    new-array v4, v3, [I

    invoke-virtual {v8, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v19, v4, v18

    invoke-virtual {v8}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v20

    add-int v20, v20, v19

    add-float v19, v7, v14

    move/from16 v21, v0

    int-to-float v0, v3

    div-float v0, v19, v0

    float-to-int v0, v0

    add-int v0, v20, v0

    aget v19, v4, v17

    invoke-virtual {v8}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v20

    add-int v20, v20, v19

    add-int v5, v5, v21

    div-int/2addr v5, v3

    add-int v5, v5, v20

    if-ltz v0, :cond_1a

    const/16 v3, 0x4e20

    if-gt v0, v3, :cond_1a

    if-ltz v5, :cond_1a

    if-le v5, v3, :cond_19

    goto :goto_7

    :cond_19
    move-object/from16 v21, v2

    move/from16 v20, v9

    goto :goto_8

    :cond_1a
    :goto_7
    aget v3, v4, v18

    aget v4, v4, v17

    move/from16 v20, v9

    new-instance v9, Ljava/lang/StringBuilder;

    move-object/from16 v21, v2

    const-string v2, "TempUnhideTrigger: suspicious geometry loc=("

    invoke-direct {v9, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") lineLR=("

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    move/from16 v3, v17

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->e([Ljava/lang/Object;)V

    :goto_8
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2, v0, v5}, Landroid/graphics/Point;-><init>(II)V

    :goto_9
    if-eqz v2, :cond_1c

    iget v0, v2, Landroid/graphics/Point;->x:I

    if-ltz v0, :cond_1b

    if-gt v0, v10, :cond_1b

    iget v3, v2, Landroid/graphics/Point;->y:I

    if-ltz v3, :cond_1b

    if-le v3, v11, :cond_1c

    :cond_1b
    iget v2, v2, Landroid/graphics/Point;->y:I

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "TempUnhideTrigger: center("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") out of screen("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "), fallback"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    const/4 v2, 0x0

    :cond_1c
    if-nez v2, :cond_1f

    const/4 v3, 0x2

    new-array v4, v3, [I

    :try_start_0
    invoke-virtual {v8, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_a

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_a
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v5, v0, La/wd$a;

    if-eqz v5, :cond_1d

    move-object v0, v3

    :cond_1d
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1e

    aget v0, v4, v18

    if-ltz v0, :cond_1e

    if-gt v0, v10, :cond_1e

    const/16 v17, 0x1

    aget v0, v4, v17

    if-ltz v0, :cond_1e

    if-gt v0, v11, :cond_1e

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_1e

    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_1e

    new-instance v2, Landroid/graphics/Point;

    aget v0, v4, v18

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v3

    const/16 v19, 0x2

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v0

    const/16 v17, 0x1

    aget v0, v4, v17

    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v0

    invoke-direct {v2, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_b

    :cond_1e
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v8, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v3

    if-eqz v3, :cond_1f

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    if-lez v3, :cond_1f

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-lez v3, :cond_1f

    new-instance v2, Landroid/graphics/Point;

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    invoke-direct {v2, v3, v0}, Landroid/graphics/Point;-><init>(II)V

    :cond_1f
    :goto_b
    if-nez v2, :cond_21

    const-string v0, "TempUnhideTrigger: title center unresolvable, fallback to top-band"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    sget-object v0, La/qf;->a:La/qf;

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/16 v3, 0x50

    int-to-float v3, v3

    mul-float/2addr v3, v0

    float-to-int v0, v3

    int-to-float v0, v0

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_20

    :goto_c
    const/4 v0, 0x1

    goto :goto_d

    :cond_20
    move/from16 v0, v18

    :goto_d
    move v3, v0

    goto/16 :goto_13

    :cond_21
    invoke-virtual {v8}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v3

    if-lez v3, :cond_22

    move/from16 v3, v18

    invoke-virtual {v0, v3}, Landroid/text/Layout;->getLineRight(I)F

    move-result v4

    invoke-virtual {v0, v3}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v0

    sub-float/2addr v4, v0

    float-to-int v0, v4

    goto :goto_e

    :cond_22
    const/4 v0, 0x0

    :goto_e
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-lez v0, :cond_23

    move-object v7, v3

    goto :goto_f

    :cond_23
    const/4 v7, 0x0

    :goto_f
    if-eqz v7, :cond_24

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_11

    :cond_24
    invoke-virtual {v8}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_25

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    goto :goto_10

    :cond_25
    const/4 v3, 0x2

    :goto_10
    int-to-float v3, v3

    mul-float/2addr v0, v3

    float-to-int v0, v0

    :goto_11
    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v3, v3, v20

    float-to-int v3, v3

    const/16 v4, 0x30

    int-to-float v4, v4

    mul-float v4, v4, v20

    float-to-int v4, v4

    const/16 v5, 0xa0

    int-to-float v5, v5

    mul-float v5, v5, v20

    float-to-int v5, v5

    const/16 v19, 0x2

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v0

    invoke-static {v3, v4, v5}, La/Oc;->C(III)I

    move-result v0

    div-int/lit8 v3, v0, 0x2

    iget v4, v2, Landroid/graphics/Point;->x:I

    sub-int v5, v4, v3

    if-lt v12, v5, :cond_26

    add-int v5, v4, v3

    if-gt v12, v5, :cond_26

    iget v5, v2, Landroid/graphics/Point;->y:I

    sub-int v7, v5, v3

    if-lt v13, v7, :cond_26

    add-int/2addr v5, v3

    if-gt v13, v5, :cond_26

    const/4 v3, 0x1

    goto :goto_12

    :cond_26
    const/4 v3, 0x0

    :goto_12
    if-nez v3, :cond_29

    iget v2, v2, Landroid/graphics/Point;->y:I

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "TempUnhideTrigger: square center=("

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") side="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " touch("

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") outside"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_13

    :cond_27
    move-object/from16 v21, v2

    sget-object v0, La/qf;->a:La/qf;

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/16 v3, 0x50

    int-to-float v3, v3

    mul-float/2addr v3, v0

    float-to-int v0, v3

    int-to-float v0, v0

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_28

    goto/16 :goto_c

    :cond_28
    const/4 v0, 0x0

    goto/16 :goto_d

    :cond_29
    :goto_13
    sget-object v0, La/Ne;->a:La/Ne;

    iget-object v2, v1, La/Ue;->b:Landroid/view/View;

    iget-object v4, v1, La/Ue;->d:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, La/Ne;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, La/Oe;

    move-object/from16 v11, p2

    :try_start_1
    invoke-interface {v10, v11, v2, v4}, La/Oe;->a(Landroid/app/Activity;Landroid/view/View;Ljava/lang/Class;)La/Ne$a;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_15

    :catchall_1
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_15
    sget-object v12, La/Ne$a;->c:La/Ne$a;

    instance-of v13, v0, La/wd$a;

    if-eqz v13, :cond_2a

    move-object v0, v12

    :cond_2a
    check-cast v0, La/Ne$a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-eqz v12, :cond_2d

    const/4 v13, 0x1

    if-eq v12, v13, :cond_2c

    const/4 v13, 0x2

    if-ne v12, v13, :cond_2b

    goto :goto_16

    :cond_2b
    new-instance v0, La/Ob;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_2c
    const/4 v13, 0x2

    add-int/lit8 v9, v9, 0x1

    goto :goto_16

    :cond_2d
    const/4 v13, 0x2

    add-int/lit8 v8, v8, 0x1

    :goto_16
    invoke-interface {v10}, La/Oe;->b()Ljava/lang/String;

    move-result-object v10

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "="

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_14

    :cond_2e
    if-lez v8, :cond_2f

    if-eqz v9, :cond_30

    :cond_2f
    if-le v8, v9, :cond_31

    :cond_30
    const/4 v0, 0x1

    goto :goto_17

    :cond_31
    const/4 v0, 0x0

    :goto_17
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "TabDetector: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\u2192 "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, " (yes="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " no="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v13, 0x1

    invoke-static {v2, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "TempUnhideTrigger: DOWN areaHit="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, " tabHit="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v13, 0x1

    invoke-static {v2, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V

    if-eqz v3, :cond_32

    if-eqz v0, :cond_32

    const/4 v0, 0x1

    goto :goto_18

    :cond_32
    const/4 v0, 0x0

    :goto_18
    iput-boolean v0, v1, La/Ue;->e:Z

    if-nez v0, :cond_33

    goto/16 :goto_1a

    :cond_33
    iget v0, v1, La/Ue;->s:I

    const/4 v13, 0x1

    add-int/2addr v0, v13

    iput v0, v1, La/Ue;->s:I

    const/4 v2, 0x5

    if-lt v0, v2, :cond_34

    const-string v2, "TempUnhideTrigger: "

    const-string v3, " consecutive DOWN without UP \u2014 touch may be intercepted by system"

    invoke-static {v0, v2, v3}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    const/4 v3, 0x0

    iput v3, v1, La/Ue;->s:I

    :cond_34
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    float-to-int v2, v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "TempUnhideTrigger: DOWN on WeChat title (x="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",y="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    const/4 v3, 0x0

    iput-boolean v3, v1, La/Ue;->i:Z

    move-object/from16 v2, v21

    iget-boolean v0, v2, La/jc;->x:Z

    if-eqz v0, :cond_36

    const/4 v13, 0x1

    iput-boolean v13, v1, La/Ue;->h:Z

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, v1, La/Ue;->j:F

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, v1, La/Ue;->k:F

    iget-object v0, v1, La/Ue;->l:Landroid/os/Handler;

    iget-object v3, v1, La/Ue;->m:La/M2;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget v0, v2, La/jc;->y:I

    if-lez v0, :cond_35

    int-to-long v2, v0

    goto :goto_19

    :cond_35
    const-wide/16 v2, 0x320

    :goto_19
    iget-object v0, v1, La/Ue;->l:Landroid/os/Handler;

    iget-object v4, v1, La/Ue;->m:La/M2;

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_36
    :goto_1a
    return-void
.end method

.method public final c(Landroid/app/Activity;)V
    .locals 3

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v2, v1, La/yf;

    if-eqz v2, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance v2, La/yf;

    invoke-direct {v2, v1, p0, p1}, La/yf;-><init>(Landroid/view/Window$Callback;La/Ue;Landroid/app/Activity;)V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/Ue;->c:Ljava/lang/ref/WeakReference;

    const-string p1, "TempUnhideTrigger: TouchInterceptingCallback installed"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Landroid/app/Activity;Landroid/view/View;)Z
    .locals 3

    sget-object v0, La/qf;->a:La/qf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2}, La/qf;->a(Landroid/app/Activity;Landroid/view/View;)Landroid/widget/TextView;

    move-result-object p1

    const/4 p2, 0x1

    if-nez p1, :cond_0

    const-string p1, "TempUnhideTrigger: Title view not found this pass"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/Ue;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TempUnhideTrigger: Title resolved: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " text=\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    return p2
.end method

.method public final e(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, La/Ue;->o:La/Ue$a;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    sget-object p1, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, La/Ue;->o:La/Ue$a;

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 4

    iget-boolean v0, p0, La/Ue;->q:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, La/Ue;->q:Z

    iget-object v0, p0, La/Ue;->p:Landroid/os/Handler;

    iget-object v1, p0, La/Ue;->r:La/Ue$b;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const-string v0, "TempUnhideTrigger: watchdog started (5s interval)"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method

.method public final handleHook(La/J8;)V
    .locals 9

    const-string v0, "TempUnhideTrigger: Window.Callback approach installed on "

    const-string v2, "session"

    invoke-static {p1, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, La/Ue;->t:La/Ue;

    :try_start_0
    const-string v2, "com.tencent.mm.ui.LauncherUI"

    iget-object v3, p1, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v3, v2}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    iput-object v2, p0, La/Ue;->d:Ljava/lang/Class;

    const/4 v7, 0x1

    if-nez v2, :cond_0

    const-string v0, "TempUnhideTrigger: LauncherUI class NOT FOUND \u2014 touch interception disabled (no fallback to Activity)"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    move-object v3, v2

    const-string v2, "F_tempUnhide"

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "onPostResume"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Class;

    new-instance v6, La/Te;

    const/4 v8, 0x0

    invoke-direct {v6, p0, v8}, La/Te;-><init>(La/Ue;I)V

    move-object v1, p1

    invoke-static/range {v1 .. v6}, La/J8;->d(La/J8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)V

    const-string v2, "F_tempUnhide"

    iget-object v1, p0, La/Ue;->d:Ljava/lang/Class;

    invoke-static {v1}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "onConfigurationChanged"

    const-class v1, Landroid/content/res/Configuration;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v5

    new-instance v6, La/Te;

    const/4 v1, 0x1

    invoke-direct {v6, p0, v1}, La/Te;-><init>(La/Ue;I)V

    move-object v1, p1

    invoke-static/range {v1 .. v6}, La/J8;->d(La/J8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)V

    iget-object v1, p0, La/Ue;->d:Ljava/lang/Class;

    invoke-static {v1}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_1
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "TempUnhideTrigger: hook FAILED"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

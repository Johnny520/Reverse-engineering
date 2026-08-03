.class public final Lc0/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/s0;

.field public static volatile b:Ljava/lang/reflect/Field;

.field public static final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final d:Landroid/os/Handler;

.field public static volatile e:I

.field public static volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc0/s0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc0/s0;->a:Lc0/s0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lc0/s0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lc0/s0;->d:Landroid/os/Handler;

    return-void
.end method

.method public static b(Landroid/view/View;I)V
    .locals 7

    const/16 v0, 0xc

    if-le p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    goto/16 :goto_8

    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    goto/16 :goto_8

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-nez v0, :cond_10

    invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_8

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v0

    const v4, 0x3c23d70a    # 0.01f

    cmpg-float v0, v0, v4

    if-gtz v0, :cond_4

    goto/16 :goto_8

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-lez v0, :cond_5

    goto :goto_0

    :cond_5
    move-object v4, v2

    :goto_0
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_7

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_7
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_8
    move v0, v3

    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    if-lez v4, :cond_9

    goto :goto_3

    :cond_9
    move-object v5, v2

    :goto_3
    if-eqz v5, :cond_a

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-eqz v4, :cond_b

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_4

    :cond_b
    move-object v4, v2

    :goto_4
    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_5

    :cond_c
    move v4, v3

    :goto_5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    const/high16 v6, 0x3fc00000    # 1.5f

    mul-float/2addr v5, v6

    float-to-int v5, v5

    add-int/2addr v5, v1

    const/4 v6, 0x4

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    if-gt v1, v0, :cond_10

    if-gt v0, v5, :cond_10

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v5, v0, Landroid/view/View;

    if-eqz v5, :cond_d

    check-cast v0, Landroid/view/View;

    goto :goto_6

    :cond_d
    move-object v0, v2

    :goto_6
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    goto :goto_7

    :cond_e
    move v0, v3

    :goto_7
    const/4 v5, -0x1

    if-eq v4, v5, :cond_f

    if-lez v0, :cond_f

    div-int/2addr v0, v6

    if-lt v4, v0, :cond_10

    :cond_f
    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_10
    :goto_8
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_11

    move-object v2, p0

    check-cast v2, Landroid/view/ViewGroup;

    :cond_11
    if-nez v2, :cond_12

    return-void

    :cond_12
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    const/16 v0, 0x78

    if-le p0, v0, :cond_13

    move p0, v0

    :cond_13
    :goto_9
    if-ge v3, p0, :cond_15

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_a

    :cond_14
    add-int/lit8 v4, p1, 0x1

    invoke-static {v0, v4}, Lc0/s0;->b(Landroid/view/View;I)V

    :goto_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_15
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 2

    const-string v0, "[OKK-HomeDivider] "

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lde/robv/android/xposed/d;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 9

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lc0/s0;->b:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    move-object v1, v0

    :goto_0
    instance-of v2, v1, Landroid/widget/ListView;

    if-eqz v2, :cond_1

    check-cast v1, Landroid/widget/ListView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_1
    move-object v1, v0

    goto :goto_2

    :goto_1
    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_2
    instance-of v2, v1, LD0/f;

    if-eqz v2, :cond_2

    move-object v1, v0

    :cond_2
    check-cast v1, Landroid/widget/ListView;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    :try_start_1
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v3

    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_3
    :try_start_2
    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setDividerHeight(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v3

    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_4
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    move v4, v2

    :goto_5
    if-ge v4, v3, :cond_7

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_3

    goto :goto_7

    :cond_3
    sget v6, Lc0/s0;->e:I

    if-nez v6, :cond_4

    goto :goto_6

    :cond_4
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_5

    goto :goto_6

    :cond_5
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-eq v7, v8, :cond_6

    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    :goto_6
    invoke-static {v5, v2}, Lc0/s0;->b(Landroid/view/View;I)V

    :goto_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_7
    :try_start_3
    const-string v3, "getView"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {p1, v3, v4}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Landroid/view/View;

    if-eqz v4, :cond_8

    check-cast v3, Landroid/view/View;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_9

    :catchall_3
    move-exception v3

    goto :goto_8

    :cond_8
    move-object v3, v0

    goto :goto_9

    :goto_8
    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v3

    :goto_9
    instance-of v4, v3, LD0/f;

    if-eqz v4, :cond_9

    move-object v3, v0

    :cond_9
    check-cast v3, Landroid/view/View;

    if-nez v3, :cond_e

    :try_start_4
    const-string v3, "findViewById"

    const v4, 0x1020002

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {p1, v3, v4}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v3, p1, Landroid/view/View;

    if-eqz v3, :cond_a

    check-cast p1, Landroid/view/View;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_b

    :catchall_4
    move-exception p1

    goto :goto_a

    :cond_a
    move-object p1, v0

    goto :goto_b

    :goto_a
    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p1

    :goto_b
    instance-of v3, p1, LD0/f;

    if-eqz v3, :cond_b

    goto :goto_c

    :cond_b
    move-object v0, p1

    :goto_c
    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_d

    if-eqz v1, :cond_c

    goto :goto_d

    :cond_c
    return-void

    :cond_d
    move-object v1, v0

    goto :goto_d

    :cond_e
    move-object v1, v3

    :goto_d
    invoke-static {v1, v2}, Lc0/s0;->b(Landroid/view/View;I)V

    return-void
.end method

.class public final synthetic Lc0/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x5

    iput v0, p0, Lc0/H;->a:I

    sget-object v0, Lf0/f0;->a:Lf0/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc0/H;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lc0/H;->a:I

    iput-object p2, p0, Lc0/H;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget v4, p0, Lc0/H;->a:I

    packed-switch v4, :pswitch_data_0

    iget-object v0, p0, Lc0/H;->b:Ljava/lang/Object;

    check-cast v0, Lf0/f0;

    const-string v4, "$this_runCatching"

    invoke-static {v0, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v0, "j"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lb0/p;->a(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, p1

    :cond_1
    sget-object v4, Lf0/f0;->d:Ljava/util/Set;

    const-string v5, "markedModernItems"

    invoke-static {v4, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v4

    :try_start_0
    invoke-interface {v4, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_3
    :goto_0
    move v0, v3

    :goto_1
    monitor-exit v4

    if-eqz v0, :cond_5

    :cond_4
    :goto_2
    move v1, v3

    goto :goto_4

    :cond_5
    const-string v0, "v"

    const-string v4, "A6"

    filled-new-array {v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lb0/p;->a(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_6

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    :cond_6
    if-nez v2, :cond_8

    invoke-static {p1}, Lf0/f0;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    const-string v0, "j"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lb0/p;->a(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    move-object p1, v0

    :goto_3
    invoke-static {p1}, Lf0/f0;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_8
    const-string p1, "SettingGroup_Main_OKK"

    invoke-static {v2, p1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "abc_module_settings_entry"

    invoke-static {v2, p1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_2

    :cond_9
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :goto_5
    monitor-exit v4

    throw p1

    :pswitch_0
    check-cast p1, Lc0/E0;

    const-string v0, "$s"

    iget-object v2, p0, Lc0/H;->b:Ljava/lang/Object;

    check-cast v2, Lc0/E0;

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p1, v2, :cond_a

    move v1, v3

    :cond_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    const-string v0, "$identity"

    iget-object v1, p0, Lc0/H;->b:Ljava/lang/Object;

    check-cast v1, Lc0/O0;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/q1;->g:Landroid/os/Handler;

    new-instance v2, LS/h;

    const/4 v3, 0x3

    invoke-direct {v2, v1, p1, v3}, LS/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p1, LD0/l;->a:LD0/l;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lc0/H;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ClassLoader;

    check-cast p1, Landroid/widget/ImageView;

    const-string v1, "$classLoader"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "iv"

    invoke-static {p1, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/D0;->a:Lc0/D0;

    invoke-static {v0}, Lc0/D0;->p(Ljava/lang/ClassLoader;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v1, Lc0/D0;->n:Ljava/lang/String;

    :cond_b
    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    xor-int/2addr v3, v4

    if-eqz v3, :cond_d

    :try_start_1
    sget-object v3, Lc0/D0;->t:Ljava/lang/reflect/Method;

    if-nez v3, :cond_c

    invoke-static {v0}, Lc0/D0;->o(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object v3

    :cond_c
    if-eqz v3, :cond_d

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, v2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_d
    :goto_6
    sget-object p1, LD0/l;->a:LD0/l;

    return-object p1

    :pswitch_3
    iget-object v1, p0, Lc0/H;->b:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    check-cast p1, Ljava/lang/String;

    const-string v4, "it"

    invoke-static {p1, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lc0/U;->a:Ljava/util/concurrent/ConcurrentHashMap;

    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-nez p1, :cond_e

    goto :goto_d

    :cond_e
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v4

    goto :goto_7

    :catchall_2
    move-exception p1

    goto :goto_a

    :cond_f
    invoke-static {p1}, Lc0/U;->b(Landroid/graphics/Bitmap;)[B

    move-result-object v4

    :goto_7
    if-nez v4, :cond_10

    goto :goto_d

    :cond_10
    if-eqz v1, :cond_11

    move-object v0, p1

    goto :goto_8

    :cond_11
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    sub-int/2addr v5, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    sub-int/2addr v6, v0

    invoke-static {p1, v3, v3, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, LQ0/g;->b(Ljava/lang/Object;)V

    :goto_8
    if-eqz v1, :cond_12

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    goto :goto_9

    :cond_12
    invoke-static {p1}, Lc0/U;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Rect;

    move-result-object p1

    :goto_9
    new-instance v1, Lc0/S;

    invoke-direct {v1, v0, v4, p1}, Lc0/S;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_b

    :goto_a
    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_b
    instance-of p1, v1, LD0/f;

    if-eqz p1, :cond_13

    goto :goto_c

    :cond_13
    move-object v2, v1

    :goto_c
    check-cast v2, Lc0/S;

    :goto_d
    return-object v2

    :pswitch_4
    check-cast p1, Landroid/view/View;

    iget-object v4, p0, Lc0/H;->b:Ljava/lang/Object;

    check-cast v4, LQ0/l;

    const-string v5, "$count"

    invoke-static {v4, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "view"

    invoke-static {p1, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v5, p1, Landroid/widget/TextView;

    if-nez v5, :cond_14

    goto/16 :goto_19

    :cond_14
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v5

    const/4 v6, -0x1

    const-string v7, ""

    if-ne v5, v6, :cond_15

    move-object v5, v7

    goto :goto_f

    :cond_15
    :try_start_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_e

    :catchall_3
    move-exception v5

    invoke-static {v5}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v5

    :goto_e
    instance-of v6, v5, LD0/f;

    if-eqz v6, :cond_16

    move-object v5, v7

    :cond_16
    check-cast v5, Ljava/lang/String;

    :goto_f
    const-string v6, "icon_tv"

    invoke-static {v5, v6}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    sget-object v5, Lc0/J;->a:Ljava/util/Set;

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_17

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_17

    invoke-static {v5}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_17
    if-nez v2, :cond_18

    goto :goto_10

    :cond_18
    move-object v7, v2

    :goto_10
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_19

    move v2, v1

    goto :goto_11

    :cond_19
    sget-object v2, Lc0/J;->a:Ljava/util/Set;

    invoke-interface {v2, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    :goto_11
    if-eqz v2, :cond_21

    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    move-result v2

    if-nez v2, :cond_1a

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_1a

    move v0, v1

    goto :goto_16

    :cond_1a
    new-array v0, v0, [I

    :try_start_4
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    aget v0, v0, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v5

    if-lez v5, :cond_1b

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v5

    goto :goto_12

    :catchall_4
    move-exception v0

    goto :goto_14

    :cond_1b
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    :goto_12
    int-to-float v0, v0

    int-to-float v2, v2

    const v6, 0x3f6147ae    # 0.88f

    mul-float/2addr v6, v2

    cmpl-float v0, v0, v6

    if-lez v0, :cond_1c

    if-gt v3, v5, :cond_1c

    const v0, 0x3da3d70a    # 0.08f

    mul-float/2addr v2, v0

    float-to-int v0, v2

    if-gt v5, v0, :cond_1c

    move v0, v3

    goto :goto_13

    :cond_1c
    move v0, v1

    :goto_13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_15

    :goto_14
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_15
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v5, v0, LD0/f;

    if-eqz v5, :cond_1d

    move-object v0, v2

    :cond_1d
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_16
    if-nez v0, :cond_1e

    goto :goto_18

    :cond_1e
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    sget-object v2, Lc0/I;->e:Ljava/util/Set;

    const/4 v5, 0x0

    const/16 v6, 0x8

    if-ne v0, v6, :cond_20

    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result v0

    cmpg-float v0, v0, v5

    if-nez v0, :cond_1f

    move v0, v3

    goto :goto_17

    :cond_1f
    move v0, v1

    :goto_17
    if-eqz v0, :cond_20

    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_20
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :try_start_5
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1, v5}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setFocusable(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move v1, v3

    :catchall_5
    :goto_18
    if-eqz v1, :cond_21

    iget p1, v4, LQ0/l;->a:I

    add-int/2addr p1, v3

    iput p1, v4, LQ0/l;->a:I

    :cond_21
    :goto_19
    sget-object p1, LD0/l;->a:LD0/l;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

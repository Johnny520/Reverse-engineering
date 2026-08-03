.class public final Lc0/u;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(ILjava/lang/reflect/Method;)V
    .locals 0

    iput p1, p0, Lc0/u;->b:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lc0/a0;->a:Lc0/a0;

    iput-object p2, p0, Lc0/u;->c:Ljava/lang/reflect/Method;

    .line 2
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 3
    :pswitch_0
    sget-object p1, Lc0/w1;->a:Lc0/w1;

    iput-object p2, p0, Lc0/u;->c:Ljava/lang/reflect/Method;

    .line 4
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 5
    :pswitch_1
    sget-object p1, Lc0/a0;->a:Lc0/a0;

    iput-object p2, p0, Lc0/u;->c:Ljava/lang/reflect/Method;

    .line 6
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Method;IZ)V
    .locals 0

    .line 1
    iput p2, p0, Lc0/u;->b:I

    iput-object p1, p0, Lc0/u;->c:Ljava/lang/reflect/Method;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 8

    const-string v0, "args"

    iget-object v1, p0, Lc0/u;->c:Ljava/lang/reflect/Method;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget v5, p0, Lc0/u;->b:I

    packed-switch v5, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v5, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v5, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v5

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v6, v5, v3

    instance-of v7, v6, Ljava/lang/CharSequence;

    if-eqz v7, :cond_0

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_0
    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_1

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v6, v4

    :goto_1
    if-nez v6, :cond_3

    add-int/2addr v3, v2

    goto :goto_0

    :cond_2
    move-object v6, v4

    :cond_3
    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v6}, LU/S;->I(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_6

    move-object v4, p1

    check-cast v4, Landroid/view/View;

    :cond_6
    if-nez v4, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {v4}, Lc0/a0;->a(Landroid/view/View;)V

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "X2CTextView."

    invoke-static {v0, p1}, LS/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lc0/a0;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void

    :pswitch_1
    iget-object v5, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v5, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v5

    :goto_3
    if-ge v3, v0, :cond_a

    aget-object v6, v5, v3

    instance-of v7, v6, Ljava/lang/CharSequence;

    if-eqz v7, :cond_8

    check-cast v6, Ljava/lang/CharSequence;

    goto :goto_4

    :cond_8
    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_9

    check-cast v6, Ljava/lang/CharSequence;

    goto :goto_4

    :cond_9
    move-object v6, v4

    :goto_4
    if-nez v6, :cond_b

    add-int/2addr v3, v2

    goto :goto_3

    :cond_a
    move-object v6, v4

    :cond_b
    if-nez v6, :cond_c

    goto :goto_5

    :cond_c
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v2, 0x50

    if-le v0, v2, :cond_d

    goto :goto_5

    :cond_d
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LU/S;->I(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_5

    :cond_e
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_f

    move-object v4, p1

    check-cast v4, Landroid/view/View;

    :cond_f
    if-nez v4, :cond_10

    goto :goto_5

    :cond_10
    invoke-static {v4}, Lc0/a0;->a(Landroid/view/View;)V

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MMNeat."

    invoke-static {v0, p1}, LS/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lc0/a0;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    return-void

    :pswitch_2
    :try_start_0
    iget-object v5, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v5, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v5}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_11

    goto :goto_8

    :cond_11
    iget-object v6, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v6, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Ljava/lang/Number;

    if-eqz v6, :cond_12

    move-object v4, v0

    check-cast v4, Ljava/lang/Number;

    goto :goto_6

    :catchall_0
    move-exception p1

    goto :goto_7

    :cond_12
    :goto_6
    if-eqz v4, :cond_14

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    if-nez v1, :cond_13

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    if-nez v1, :cond_13

    goto :goto_8

    :cond_13
    sget-object v4, Lc0/a0;->a:Lc0/a0;

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v5, v0, v1}, Lc0/a0;->b(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_8

    :goto_7
    sget-object v0, Lc0/a0;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_14

    sget-object v0, Lc0/a0;->a:Lc0/a0;

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "bind after err: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/a0;->p0(Ljava/lang/String;)V

    :cond_14
    :goto_8
    return-void

    :pswitch_3
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_15

    move-object v4, p1

    check-cast v4, Landroid/app/Activity;

    :cond_15
    if-nez v4, :cond_16

    goto :goto_9

    :cond_16
    invoke-static {}, Lc0/r;->a()Lc0/x;

    move-result-object p1

    iget-boolean v0, p1, Lc0/x;->a:Z

    if-eqz v0, :cond_19

    iget-boolean p1, p1, Lc0/x;->e:Z

    if-nez p1, :cond_17

    goto :goto_9

    :cond_17
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_18

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_18

    new-instance v0, Lc0/v;

    invoke-direct {v0, v4, v3}, Lc0/v;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_18
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_19

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_19

    new-instance v0, Lc0/v;

    invoke-direct {v0, v4, v2}, Lc0/v;-><init>(Landroid/app/Activity;I)V

    const-wide/16 v1, 0x190

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_19
    :goto_9
    return-void

    :pswitch_4
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1a

    move-object v4, p1

    check-cast v4, Landroid/app/Activity;

    :cond_1a
    if-nez v4, :cond_1b

    goto :goto_a

    :cond_1b
    invoke-static {}, Lc0/r;->a()Lc0/x;

    move-result-object p1

    iget-boolean v0, p1, Lc0/x;->a:Z

    if-eqz v0, :cond_1d

    iget-boolean p1, p1, Lc0/x;->e:Z

    if-nez p1, :cond_1c

    goto :goto_a

    :cond_1c
    sget-object p1, Lc0/w;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "initView."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lc0/w;->a(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_1d
    :goto_a
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 9

    const/4 v0, 0x2

    const-string v1, "args"

    iget-object v2, p0, Lc0/u;->c:Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget v5, p0, Lc0/u;->b:I

    packed-switch v5, :pswitch_data_0

    :pswitch_0
    return-void

    :pswitch_1
    invoke-static {}, Lc0/v1;->a()Lc0/x1;

    move-result-object v5

    iget-boolean v6, v5, Lc0/x1;->a:Z

    if-nez v6, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v6, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v6, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v6}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Landroid/graphics/Bitmap;

    if-eqz v4, :cond_1

    check-cast v1, Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    iget-object v4, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aget-object v4, v4, v0

    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_4

    move-object v3, v4

    check-cast v3, Ljava/lang/Number;

    :cond_4
    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-float v1, v1

    const/high16 v4, 0x3f800000    # 1.0f

    cmpg-float v4, v1, v4

    if-gtz v4, :cond_5

    goto :goto_2

    :cond_5
    iget v4, v5, Lc0/x1;->b:F

    mul-float v5, v4, v1

    div-float v6, v3, v1

    const v7, 0x3cf5c28f    # 0.03f

    cmpg-float v7, v7, v6

    const v8, 0x3f19999a    # 0.6f

    if-gtz v7, :cond_6

    cmpg-float v6, v6, v8

    if-gtz v6, :cond_6

    goto :goto_1

    :cond_6
    mul-float/2addr v1, v8

    cmpl-float v1, v3, v1

    if-lez v1, :cond_7

    goto :goto_2

    :cond_7
    :goto_1
    sub-float v1, v5, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v6, 0x3c23d70a    # 0.01f

    cmpl-float v1, v1, v6

    if-lez v1, :cond_8

    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, p1, v0

    sget-object p1, Lc0/w1;->a:Lc0/w1;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "BitmapUtil."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, "\u2192"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v4}, Lc0/w1;->b(Lc0/w1;Ljava/lang/String;F)V

    :cond_8
    :goto_2
    return-void

    :pswitch_2
    const/4 v0, 0x1

    :try_start_0
    iget-object v5, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v5, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v5}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_9

    goto/16 :goto_5

    :cond_9
    iget-object v6, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v6, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v6, v1, Ljava/lang/Number;

    if-eqz v6, :cond_a

    move-object v3, v1

    check-cast v3, Ljava/lang/Number;

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_a
    :goto_3
    if-eqz v3, :cond_f

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    if-nez v2, :cond_b

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    if-nez v2, :cond_b

    goto :goto_5

    :cond_b
    sget-object v3, Lc0/a0;->a:Lc0/a0;

    invoke-static {v5}, Lc0/a0;->I(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_c

    goto :goto_5

    :cond_c
    sget-object v6, Lc0/Z0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v6, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v1, v6}, Lc0/Z0;->c(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_d

    goto :goto_5

    :cond_d
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    const v6, 0x7f09001d

    invoke-virtual {v3, v6, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz p1, :cond_e

    const v5, 0x7f09001c

    invoke-virtual {v3, v5, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_e
    invoke-static {v3, v1, v2}, Lc0/a0;->k0(Landroid/view/View;Ljava/lang/Object;Ljava/lang/ClassLoader;)Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :goto_4
    sget-object v1, Lc0/a0;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v4, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, Lc0/a0;->a:Lc0/a0;

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "bind before err: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/a0;->p0(Ljava/lang/String;)V

    :cond_f
    :goto_5
    return-void

    :pswitch_3
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, p1, Landroid/app/Activity;

    if-eqz v1, :cond_10

    move-object v3, p1

    check-cast v3, Landroid/app/Activity;

    :cond_10
    if-nez v3, :cond_11

    goto :goto_6

    :cond_11
    invoke-static {}, Lc0/r;->a()Lc0/x;

    move-result-object p1

    iget-boolean v1, p1, Lc0/x;->a:Z

    if-nez v1, :cond_12

    goto :goto_6

    :cond_12
    iget-boolean v1, p1, Lc0/x;->c:Z

    iget-boolean v5, p1, Lc0/x;->b:Z

    if-eqz v1, :cond_13

    or-int/2addr v5, v0

    :cond_13
    iget-boolean p1, p1, Lc0/x;->d:Z

    if-eqz p1, :cond_14

    or-int/lit8 v5, v5, 0x4

    :cond_14
    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "intent.key.function.control"

    invoke-virtual {p1, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "intent.key.need.show.privacy.agreement"

    invoke-virtual {p1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    sget-object p1, Lc0/w;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onCreate inject functionControl="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/w;->d(Ljava/lang/String;)V

    :goto_6
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

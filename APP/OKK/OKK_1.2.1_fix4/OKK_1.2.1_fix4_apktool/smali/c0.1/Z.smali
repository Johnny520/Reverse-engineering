.class public final Lc0/Z;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc0/a0;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc0/Z;->b:I

    sget-object v0, Lc0/a0;->a:Lc0/a0;

    iput-object v0, p0, Lc0/Z;->c:Lc0/a0;

    .line 1
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method

.method public constructor <init>(Lc0/a0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc0/Z;->b:I

    iput-object p1, p0, Lc0/Z;->c:Lc0/a0;

    .line 2
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 11

    iget v0, p0, Lc0/Z;->b:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    const-string v0, "getAbsolutePath(...)"

    iget-object v1, p0, Lc0/Z;->c:Lc0/a0;

    const-string v2, "bubble imported: "

    iget-object v3, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v4, "args"

    invoke-static {v3, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-static {v5, v3}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Ljava/lang/Integer;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    check-cast v3, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    move-object v3, v7

    :goto_0
    if-eqz v3, :cond_e

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v6, 0xa0c14

    const v8, 0xa0c15

    if-eq v3, v6, :cond_1

    if-eq v3, v8, :cond_1

    goto/16 :goto_c

    :cond_1
    iget-object v6, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v6, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x1

    invoke-static {v9, v6}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v10, v6, Ljava/lang/Integer;

    if-eqz v10, :cond_2

    check-cast v6, Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    move-object v6, v7

    :goto_1
    if-nez v6, :cond_3

    goto/16 :goto_c

    :cond_3
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v10, -0x1

    if-eq v6, v10, :cond_4

    goto/16 :goto_c

    :cond_4
    iget-object v6, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v6, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    invoke-static {v4, v6}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Landroid/content/Intent;

    if-eqz v6, :cond_5

    check-cast v4, Landroid/content/Intent;

    goto :goto_2

    :cond_5
    move-object v4, v7

    :goto_2
    if-eqz v4, :cond_e

    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    if-nez v4, :cond_6

    goto/16 :goto_c

    :cond_6
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v6, p1, Landroid/app/Activity;

    if-eqz v6, :cond_7

    check-cast p1, Landroid/app/Activity;

    goto :goto_3

    :cond_7
    move-object p1, v7

    :goto_3
    if-nez p1, :cond_8

    goto/16 :goto_c

    :cond_8
    if-ne v3, v8, :cond_9

    move v3, v9

    goto :goto_4

    :cond_9
    move v3, v5

    :goto_4
    :try_start_0
    new-instance v6, Ljava/io/File;

    const-string v8, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    invoke-direct {v6, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v8

    if-nez v8, :cond_a

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    goto :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_a
    :goto_5
    new-instance v8, Ljava/io/File;

    if-eqz v3, :cond_b

    const-string v10, "right.9.png"

    goto :goto_6

    :cond_b
    const-string v10, "left.9.png"

    :goto_6
    invoke-direct {v8, v6, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    invoke-virtual {v6, v4}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_c

    :try_start_1
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v10, 0x2000

    :try_start_2
    invoke-static {v4, v6, v10}, LA0/p;->t(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-static {v6, v7}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v4, v7}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_8

    :catchall_1
    move-exception v0

    goto :goto_7

    :catchall_2
    move-exception v0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v2

    :try_start_6
    invoke-static {v6, v0}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_7
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :catchall_4
    move-exception v2

    :try_start_8
    invoke-static {v4, v0}, LA0/p;->m(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :cond_c
    :goto_8
    sget-object v4, Lc0/h1;->a:Lc0/h1;

    if-eqz v3, :cond_d

    const-string v3, "bubble_path_right"

    goto :goto_9

    :cond_d
    const-string v3, "bubble_path_left"

    :goto_9
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3, v6, v5}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "bubble_enabled"

    invoke-virtual {v4, v3, v9, v5}, Lc0/h1;->g(Ljava/lang/String;ZZ)V

    sget-object v3, Lc0/U;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lc0/U;->c(Ljava/lang/String;)V

    const-string v0, "\u6c14\u6ce1\u76ae\u80a4\u5bfc\u5165\u6210\u529f\uff01"

    invoke-static {p1, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_b

    :goto_a
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_b
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "bubble import fail: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lc0/a0;->p0(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u5bfc\u5165\u5931\u8d25: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_e
    :goto_c
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 14

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget v2, p0, Lc0/Z;->b:I

    packed-switch v2, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v2, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v3, v2, Landroid/view/View;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/View;

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    if-nez v2, :cond_1

    goto/16 :goto_9

    :cond_1
    iget-object v3, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v5, "args"

    invoke-static {v3, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Landroid/view/MotionEvent;

    if-eqz v5, :cond_2

    check-cast v3, Landroid/view/MotionEvent;

    goto :goto_1

    :cond_2
    move-object v3, v4

    :goto_1
    if-nez v3, :cond_3

    goto/16 :goto_9

    :cond_3
    const v5, 0x7f09001e

    invoke-virtual {v2, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_4

    goto/16 :goto_9

    :cond_4
    iget-object v6, p0, Lc0/Z;->c:Lc0/a0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/p;->a()Lc0/q;

    move-result-object v6

    iget-boolean v7, v6, Lc0/q;->g:Z

    if-nez v7, :cond_5

    goto/16 :goto_9

    :cond_5
    const v7, 0x7f090022

    invoke-virtual {v2, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lc0/X;

    if-eqz v9, :cond_6

    check-cast v8, Lc0/X;

    goto :goto_2

    :cond_6
    move-object v8, v4

    :goto_2
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v9

    if-eqz v9, :cond_1e

    const-string v10, "getContext(...)"

    const/4 v11, 0x2

    const/4 v12, 0x0

    if-eq v9, v0, :cond_d

    if-eq v9, v11, :cond_7

    const/4 v13, 0x3

    if-eq v9, v13, :cond_d

    goto/16 :goto_9

    :cond_7
    if-nez v8, :cond_8

    goto/16 :goto_9

    :cond_8
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    iget v4, v8, Lc0/X;->a:F

    sub-float/2addr v1, v4

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    iget v4, v8, Lc0/X;->b:F

    sub-float/2addr v3, v4

    iget-boolean v4, v8, Lc0/X;->d:Z

    if-nez v4, :cond_a

    iget v4, v8, Lc0/X;->c:I

    iget-boolean v5, v6, Lc0/q;->g:Z

    int-to-float v4, v4

    const/high16 v7, 0x3f400000    # 0.75f

    mul-float/2addr v4, v7

    const/high16 v7, 0x40800000    # 4.0f

    invoke-static {v7, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v7

    cmpg-float v4, v7, v4

    if-lez v4, :cond_a

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v4

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpg-float v3, v4, v3

    if-gtz v3, :cond_9

    goto :goto_3

    :cond_9
    cmpg-float v3, v1, v12

    if-gez v3, :cond_a

    if-eqz v5, :cond_a

    iput-boolean v0, v8, Lc0/X;->d:Z

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-interface {v3, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_a
    :goto_3
    iget-boolean v0, v8, Lc0/X;->d:Z

    if-eqz v0, :cond_1f

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v10}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x78

    invoke-static {v0, v3}, Lc0/a0;->u(Landroid/content/Context;I)I

    move-result v0

    iget-boolean v3, v6, Lc0/q;->g:Z

    int-to-float v0, v0

    if-nez v3, :cond_b

    cmpg-float v3, v1, v12

    if-gez v3, :cond_b

    move v1, v12

    :cond_b
    cmpl-float v3, v1, v12

    if-lez v3, :cond_c

    goto :goto_4

    :cond_c
    move v12, v1

    :goto_4
    neg-float v1, v0

    invoke-static {v0, v12}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationX(F)V

    goto/16 :goto_8

    :cond_d
    if-nez v8, :cond_e

    goto/16 :goto_9

    :cond_e
    invoke-virtual {v2, v7, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    if-eqz v7, :cond_f

    invoke-interface {v7, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_f
    iget-boolean v7, v8, Lc0/X;->d:Z

    if-nez v7, :cond_10

    goto/16 :goto_9

    :cond_10
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getRawX()F

    move-result v7

    iget v8, v8, Lc0/X;->a:F

    sub-float/2addr v7, v8

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    if-ne v3, v0, :cond_1d

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v10}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    invoke-static {v3, v8}, Lc0/a0;->u(Landroid/content/Context;I)I

    move-result v3

    iget-boolean v6, v6, Lc0/q;->g:Z

    neg-int v3, v3

    int-to-float v3, v3

    cmpg-float v3, v7, v3

    if-gez v3, :cond_11

    if-eqz v6, :cond_11

    sget-object v3, Lc0/a1;->b:Lc0/a1;

    goto :goto_5

    :cond_11
    sget-object v3, Lc0/a1;->a:Lc0/a1;

    :goto_5
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_1d

    if-eq v3, v0, :cond_17

    if-ne v3, v11, :cond_16

    float-to-int v0, v7

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "right swipe repeat delta="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    sget-object v0, Lc0/a0;->A:Ljava/lang/Object;

    const-string v1, "ChatFooter"

    invoke-static {v0, v5, v1}, Lc0/a0;->T(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto/16 :goto_7

    :cond_12
    sget-object v0, Lc0/a0;->B:Ljava/lang/Object;

    const-string v1, "quoteComponent"

    invoke-static {v0, v5, v1}, Lc0/a0;->T(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    goto/16 :goto_7

    :cond_13
    invoke-static {v5}, Lc0/a0;->S(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    invoke-static {v5}, Lc0/a0;->R(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_6

    :cond_14
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "right swipe repeat not ready for "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    goto/16 :goto_7

    :cond_15
    :goto_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "right swipe fallback to quote for "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    goto :goto_7

    :cond_16
    new-instance p1, LD0/c;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_17
    float-to-int v3, v7

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "left swipe quote delta="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lc0/a0;->p0(Ljava/lang/String;)V

    invoke-static {v2, v5}, Lc0/a0;->i0(Landroid/view/View;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lc0/a0;->A:Ljava/lang/Object;

    instance-of v6, v5, Landroid/view/View;

    if-eqz v6, :cond_18

    move-object v4, v5

    check-cast v4, Landroid/view/View;

    :cond_18
    sget-object v5, Lc0/k1;->a:Lc0/k1;

    invoke-static {}, Lc0/k1;->c()Ljava/lang/Object;

    move-result-object v5

    const-string v6, "swipe.quote.prepare"

    invoke-static {v5, v6}, Lc0/k1;->k(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_19

    if-eqz v4, :cond_19

    new-instance v1, Landroidx/emoji2/text/k;

    invoke-direct {v1, v3, v4, v2, v0}, Landroidx/emoji2/text/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_7

    :cond_19
    invoke-static {v3}, Lc0/a0;->S(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_7

    :cond_1a
    invoke-static {v3}, Lc0/a0;->R(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_7

    :cond_1b
    if-eqz v4, :cond_1c

    new-instance v0, Lc0/L;

    invoke-direct {v0, v1, v2, v3}, Lc0/L;-><init>(ILandroid/view/View;Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_7

    :cond_1c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "left swipe quote target not ready for "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/a0;->p0(Ljava/lang/String;)V

    :cond_1d
    :goto_7
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xb4

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    :goto_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    goto :goto_9

    :cond_1e
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    new-instance p1, Lc0/X;

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    invoke-direct {p1, v0, v1, v3}, Lc0/X;-><init>(FFI)V

    invoke-virtual {v2, v7, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_1f
    :goto_9
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

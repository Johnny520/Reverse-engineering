.class public final Lc0/B0;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc0/D0;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/B0;->b:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_0
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_1
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_2
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_3
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_4
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_5
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_6
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_7
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_8
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_9
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_a
    sget-object p1, Lc0/D0;->a:Lc0/D0;

    iput-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 7

    const-string v0, "args"

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget v3, p0, Lc0/B0;->b:I

    packed-switch v3, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v1, p0, Lc0/B0;->c:Lc0/D0;

    iget-object v3, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "hooked tab ViewPager "

    if-eqz v3, :cond_3

    sget-boolean v4, Lc0/D0;->B:Z

    if-eqz v4, :cond_0

    goto :goto_2

    :cond_0
    :try_start_0
    invoke-static {v3}, Lc0/D0;->g(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v3

    :goto_0
    instance-of v4, v3, LD0/f;

    if-eqz v4, :cond_1

    move-object v3, v2

    :cond_1
    check-cast v3, Landroid/view/View;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    :try_start_1
    const-string v4, "onInterceptTouchEvent"

    new-instance v5, Lc0/B0;

    const/16 v6, 0xa

    invoke-direct {v5, v6}, Lc0/B0;-><init>(I)V

    invoke-static {v3, v4, v5}, Lde/robv/android/xposed/d;->a(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/c;)V

    const-string v4, "onTouchEvent"

    new-instance v5, Lc0/B0;

    const/16 v6, 0xb

    invoke-direct {v5, v6}, Lc0/B0;-><init>(I)V

    invoke-static {v3, v4, v5}, Lde/robv/android/xposed/d;->a(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/c;)V

    const/4 v4, 0x1

    sput-boolean v4, Lc0/D0;->B:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " edge intercept+touch"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/D0;->s(Ljava/lang/String;)V

    sget-object v1, LD0/l;->a:LD0/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_1
    invoke-static {v1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v3, Lc0/D0;->a:Lc0/D0;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "hookTabViewPagerSwipe fail: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_3
    :goto_2
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LE0/j;->m0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    move-object v2, p1

    check-cast v2, Ljava/lang/Integer;

    :cond_4
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    :cond_5
    sget p1, Lc0/D0;->m:I

    :goto_3
    sput p1, Lc0/D0;->m:I

    sget-object p1, Lc0/D0;->g:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-eqz p1, :cond_6

    iget-object v0, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/D0;->k(Landroid/app/Activity;)V

    :cond_6
    return-void

    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_7

    move-object v2, p1

    check-cast v2, Ljava/lang/Integer;

    :cond_7
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_8
    sput v1, Lc0/D0;->m:I

    sget-object p1, Lc0/D0;->g:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-eqz p1, :cond_9

    iget-object v0, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/D0;->k(Landroid/app/Activity;)V

    :cond_9
    return-void

    :pswitch_2
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_a

    move-object v2, p1

    check-cast v2, Landroid/app/Activity;

    :cond_a
    if-nez v2, :cond_b

    goto :goto_4

    :cond_b
    sput-boolean v1, Lc0/D0;->z:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Lc0/D0;->A:J

    iget-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lc0/D0;->q(Landroid/app/Activity;)V

    :goto_4
    return-void

    :pswitch_3
    iget-object v3, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v3, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_c

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_5

    :cond_c
    move-object v0, v2

    :goto_5
    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, p1, Landroid/app/Activity;

    if-eqz v1, :cond_d

    move-object v2, p1

    check-cast v2, Landroid/app/Activity;

    :cond_d
    if-nez v2, :cond_e

    goto :goto_6

    :cond_e
    iget-object p1, p0, Lc0/B0;->c:Lc0/D0;

    if-eqz v0, :cond_f

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "launcher focus gained -> tick"

    invoke-static {p1}, Lc0/D0;->s(Ljava/lang/String;)V

    invoke-static {v2}, Lc0/D0;->k(Landroid/app/Activity;)V

    goto :goto_6

    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "launcher focus lost (keep avatar)"

    invoke-static {p1}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_10
    :goto_6
    return-void

    :pswitch_4
    sget-object p1, Lc0/D0;->g:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-eqz p1, :cond_11

    iget-object v0, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/D0;->k(Landroid/app/Activity;)V

    :cond_11
    return-void

    :pswitch_5
    sget-object p1, Lc0/D0;->C:Ljava/lang/String;

    const-string v0, "LauncherUI"

    invoke-static {p1, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-nez p1, :cond_12

    sget-object p1, Lc0/D0;->C:Ljava/lang/String;

    const-string v0, "MainTabUI"

    invoke-static {p1, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-nez p1, :cond_12

    iget-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "dialog show on non-home -> hide avatar"

    invoke-static {p1}, Lc0/D0;->s(Ljava/lang/String;)V

    iget-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lc0/D0;->r(Z)V

    :cond_12
    return-void

    :pswitch_6
    sput-boolean v1, Lc0/D0;->z:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Lc0/D0;->A:J

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1}, Lc0/D0;->a(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object p1

    if-nez p1, :cond_15

    sget-object p1, Lc0/D0;->g:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroid/app/Activity;

    :cond_13
    if-nez v2, :cond_14

    goto :goto_7

    :cond_14
    move-object p1, v2

    :cond_15
    iget-object v0, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/D0;->q(Landroid/app/Activity;)V

    :goto_7
    return-void

    :pswitch_7
    iget-object v3, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v3, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/lang/Integer;

    if-eqz v3, :cond_16

    check-cast v0, Ljava/lang/Integer;

    goto :goto_8

    :cond_16
    move-object v0, v2

    :goto_8
    if-nez v0, :cond_17

    goto :goto_9

    :cond_17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_9

    :cond_18
    sput-boolean v1, Lc0/D0;->z:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Lc0/D0;->A:J

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1}, Lc0/D0;->a(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object p1

    if-nez p1, :cond_1b

    sget-object p1, Lc0/D0;->g:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_19

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroid/app/Activity;

    :cond_19
    if-nez v2, :cond_1a

    goto :goto_9

    :cond_1a
    move-object p1, v2

    :cond_1b
    iget-object v0, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/D0;->q(Landroid/app/Activity;)V

    :goto_9
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 12

    const/4 v0, 0x3

    const-string v1, "args"

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget v6, p0, Lc0/B0;->b:I

    sparse-switch v6, :sswitch_data_0

    return-void

    :sswitch_0
    iget-object v6, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v7, v6, Landroid/view/View;

    if-eqz v7, :cond_0

    check-cast v6, Landroid/view/View;

    goto :goto_0

    :cond_0
    move-object v6, v2

    :goto_0
    if-nez v6, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v7}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Landroid/view/MotionEvent;

    if-eqz v7, :cond_2

    move-object v2, v1

    check-cast v2, Landroid/view/MotionEvent;

    :cond_2
    if-nez v2, :cond_3

    goto/16 :goto_3

    :cond_3
    iget-object v1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Lc0/D0;->f(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_4

    goto/16 :goto_3

    :cond_4
    sget-boolean v6, LU/S;->v:Z

    if-eqz v6, :cond_d

    sget-boolean v6, LU/S;->w:Z

    if-nez v6, :cond_5

    goto/16 :goto_3

    :cond_5
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v6

    const/high16 v7, 0x3f800000    # 1.0f

    const v8, 0x3ed70a3d    # 0.42f

    const/4 v9, 0x0

    if-eq v6, v4, :cond_9

    if-eq v6, v3, :cond_6

    if-eq v6, v0, :cond_9

    goto/16 :goto_3

    :cond_6
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    sget v2, LU/S;->x:F

    sub-float/2addr v0, v2

    invoke-static {}, LU/S;->W()Ld0/n;

    move-result-object v2

    if-nez v2, :cond_8

    invoke-static {v1}, LU/S;->d(Landroid/app/Activity;)Ld0/n;

    move-result-object v0

    if-nez v0, :cond_7

    sput-boolean v5, LU/S;->v:Z

    goto/16 :goto_2

    :cond_7
    iget-object v1, v0, Ld0/n;->a:Landroid/view/View;

    iget v2, v0, Ld0/n;->c:I

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationX(F)V

    iget-object v0, v0, Ld0/n;->b:Landroid/view/View;

    invoke-virtual {v0, v9}, Landroid/view/View;->setAlpha(F)V

    goto/16 :goto_2

    :cond_8
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget-object v1, v2, Ld0/n;->a:Landroid/view/View;

    iget v3, v2, Ld0/n;->c:I

    int-to-float v3, v3

    sub-float v4, v0, v3

    neg-float v3, v3

    invoke-static {v4, v3, v9}, LA0/p;->o(FFF)F

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/View;->setTranslationX(F)V

    iget v1, v2, Ld0/n;->c:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0, v9, v7}, LA0/p;->o(FFF)F

    move-result v0

    iget-object v1, v2, Ld0/n;->b:Landroid/view/View;

    mul-float/2addr v0, v8

    invoke-static {v0, v9, v8}, LA0/p;->o(FFF)F

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    goto/16 :goto_2

    :cond_9
    sput-boolean v5, LU/S;->v:Z

    sput-boolean v5, LU/S;->w:Z

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    sget v6, LU/S;->x:F

    sub-float/2addr v1, v6

    invoke-static {}, LU/S;->W()Ld0/n;

    move-result-object v6

    if-nez v6, :cond_a

    goto :goto_2

    :cond_a
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eq v2, v0, :cond_c

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, v6, Ld0/n;->c:I

    int-to-float v1, v1

    const v2, 0x3e8f5c29    # 0.28f

    mul-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_b

    goto :goto_1

    :cond_b
    iget-object v0, v6, Ld0/n;->a:Landroid/view/View;

    iget-object v1, v6, Ld0/n;->b:Landroid/view/View;

    sput-boolean v4, LU/S;->s:Z

    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    sget-object v6, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v10

    new-array v11, v3, [F

    aput v10, v11, v5

    aput v9, v11, v4

    invoke-static {v0, v6, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    sget-object v6, Landroid/view/View;->ALPHA:Landroid/util/Property;

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v10

    new-array v11, v3, [F

    aput v10, v11, v5

    aput v8, v11, v4

    invoke-static {v1, v6, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    new-array v3, v3, [Landroid/animation/Animator;

    aput-object v0, v3, v5

    aput-object v1, v3, v4

    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const-wide/16 v0, 0xc8

    invoke-virtual {v2, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3e4ccccd    # 0.2f

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v9, v1, v7}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v0, Ld0/q;

    invoke-direct {v0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    invoke-virtual {v2, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_2

    :cond_c
    :goto_1
    invoke-static {v4}, LU/S;->n(Z)V

    :goto_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :cond_d
    :goto_3
    return-void

    :sswitch_1
    iget-object v6, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v7, v6, Landroid/view/View;

    if-eqz v7, :cond_e

    check-cast v6, Landroid/view/View;

    goto :goto_4

    :cond_e
    move-object v6, v2

    :goto_4
    if-nez v6, :cond_f

    goto/16 :goto_7

    :cond_f
    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v7}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Landroid/view/MotionEvent;

    if-eqz v7, :cond_10

    check-cast v1, Landroid/view/MotionEvent;

    goto :goto_5

    :cond_10
    move-object v1, v2

    :goto_5
    if-nez v1, :cond_11

    goto/16 :goto_7

    :cond_11
    iget-object v7, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Lc0/D0;->f(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v6

    if-nez v6, :cond_12

    goto/16 :goto_7

    :cond_12
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v7

    const/high16 v8, 0x3f000000    # 0.5f

    if-eqz v7, :cond_18

    if-eq v7, v4, :cond_16

    if-eq v7, v3, :cond_13

    if-eq v7, v0, :cond_16

    goto/16 :goto_7

    :cond_13
    sget-boolean v0, LU/S;->v:Z

    if-nez v0, :cond_14

    goto/16 :goto_7

    :cond_14
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    sget v2, LU/S;->x:F

    sub-float/2addr v0, v2

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    sget v2, LU/S;->y:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v3, v2

    add-float/2addr v3, v8

    float-to-int v2, v3

    int-to-float v2, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v3, v3, v2

    if-lez v3, :cond_15

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_15

    sput-boolean v4, LU/S;->w:Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_15
    cmpl-float p1, v1, v2

    if-lez p1, :cond_1f

    sput-boolean v5, LU/S;->v:Z

    goto/16 :goto_7

    :cond_16
    sget-boolean p1, LU/S;->v:Z

    if-nez p1, :cond_17

    goto/16 :goto_7

    :cond_17
    sput-boolean v5, LU/S;->v:Z

    sput-boolean v5, LU/S;->w:Z

    goto/16 :goto_7

    :cond_18
    sget-object p1, LU/S;->p:Landroid/widget/FrameLayout;

    if-eqz p1, :cond_19

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    :cond_19
    if-eqz v2, :cond_1a

    sget-object p1, LU/S;->p:Landroid/widget/FrameLayout;

    if-eqz p1, :cond_1a

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_1a

    goto :goto_7

    :cond_1a
    sget-boolean p1, LU/S;->s:Z

    if-nez p1, :cond_1f

    sget-boolean p1, LU/S;->v:Z

    if-eqz p1, :cond_1b

    goto :goto_7

    :cond_1b
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    const/16 v2, 0x48

    int-to-float v2, v2

    mul-float/2addr v2, p1

    add-float/2addr v2, v8

    float-to-int v2, v2

    int-to-float v2, v2

    cmpl-float v2, v0, v2

    if-lez v2, :cond_1c

    goto :goto_7

    :cond_1c
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "status_bar_height"

    const-string v7, "dimen"

    const-string v9, "android"

    invoke-virtual {v2, v3, v7, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_1d

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    goto :goto_6

    :cond_1d
    const/16 v2, 0x1c

    int-to-float v2, v2

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    :goto_6
    const/16 v3, 0x4a

    int-to-float v3, v3

    mul-float/2addr v3, p1

    add-float/2addr v3, v8

    float-to-int p1, v3

    add-int/2addr v2, p1

    int-to-float p1, v2

    cmpg-float p1, v1, p1

    if-gez p1, :cond_1e

    goto :goto_7

    :cond_1e
    sput-boolean v4, LU/S;->v:Z

    sput-boolean v5, LU/S;->w:Z

    sput v0, LU/S;->x:F

    sput v1, LU/S;->y:F

    :cond_1f
    :goto_7
    return-void

    :sswitch_2
    sput-boolean v4, Lc0/D0;->z:Z

    iget-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lc0/D0;->r(Z)V

    invoke-static {v5}, LU/S;->n(Z)V

    return-void

    :sswitch_3
    sput-boolean v4, Lc0/D0;->z:Z

    iget-object p1, p0, Lc0/B0;->c:Lc0/D0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lc0/D0;->r(Z)V

    invoke-static {v5}, LU/S;->n(Z)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_2
        0xa -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

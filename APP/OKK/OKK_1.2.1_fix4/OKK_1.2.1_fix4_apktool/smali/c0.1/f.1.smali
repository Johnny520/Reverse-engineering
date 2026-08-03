.class public final Lc0/f;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;I)V
    .locals 0

    iput p2, p0, Lc0/f;->b:I

    packed-switch p2, :pswitch_data_0

    sget-object p2, Lc0/g;->a:Lc0/g;

    iput-object p2, p0, Lc0/f;->c:Ljava/lang/Object;

    iput-object p1, p0, Lc0/f;->d:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 3
    :pswitch_0
    sget-object p2, Lc0/q1;->a:Lc0/q1;

    iput-object p2, p0, Lc0/f;->c:Ljava/lang/Object;

    iput-object p1, p0, Lc0/f;->d:Ljava/lang/Object;

    .line 4
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lc0/f;->b:I

    iput-object p1, p0, Lc0/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lc0/f;->d:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc0/f;->b:I

    sget-object v0, Lc0/n;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lc0/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lc0/f;->d:Ljava/lang/Object;

    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 13

    const-string v0, "args"

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lc0/f;->b:I

    packed-switch v4, :pswitch_data_0

    return-void

    :pswitch_0
    invoke-static {}, Lc0/v1;->a()Lc0/x1;

    move-result-object v1

    iget-boolean v4, v1, Lc0/x1;->a:Z

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p1}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    move-object v3, p1

    check-cast v3, Landroid/widget/ImageView;

    :cond_1
    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v0, p0, Lc0/f;->c:Ljava/lang/Object;

    check-cast v0, Lc0/w1;

    iget v1, v1, Lc0/x1;->b:F

    invoke-static {v0, p1, v1}, Lc0/w1;->a(Lc0/w1;Ljava/lang/Object;F)V

    invoke-virtual {v3}, Landroid/view/View;->postInvalidate()V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lc0/f;->c:Ljava/lang/Object;

    check-cast v0, Lc0/q1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/q1;->g()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_4

    move-object v3, p1

    check-cast v3, Landroid/app/Activity;

    :cond_4
    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lc0/f;->d:Ljava/lang/Object;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {v3, p1}, Lc0/q1;->f(Landroid/app/Activity;Ljava/lang/ClassLoader;)V

    :goto_1
    return-void

    :pswitch_2
    iget-object v0, p0, Lc0/f;->c:Ljava/lang/Object;

    check-cast v0, Lc0/f1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/f1;->b()Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_b

    :cond_6
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_7

    check-cast p1, Landroid/app/Activity;

    goto :goto_2

    :cond_7
    move-object p1, v3

    :goto_2
    if-nez p1, :cond_8

    goto/16 :goto_b

    :cond_8
    iget-object v0, p0, Lc0/f;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ClassLoader;

    const-string v4, "achat_profile_id"

    const-string v5, "injected profile id row: "

    const-string v6, "\u5fae\u4fe1 ID: "

    :try_start_0
    const-string v7, "getPreferenceScreen"

    new-array v8, v2, [Ljava/lang/Object;

    invoke-static {p1, v7, v8}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v7

    :try_start_1
    invoke-static {v7}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v7

    :goto_3
    instance-of v8, v7, LD0/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v8, :cond_9

    move-object v7, v3

    :cond_9
    if-nez v7, :cond_a

    goto/16 :goto_b

    :cond_a
    :try_start_2
    const-string v8, "i"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7, v8, v9}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v8

    :try_start_3
    invoke-static {v8}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v8

    :goto_4
    instance-of v9, v8, LD0/f;

    if-eqz v9, :cond_b

    move-object v8, v3

    :cond_b
    invoke-static {p1}, Lc0/f1;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_c

    const-string v9, "\u83b7\u53d6\u5931\u8d25"

    goto :goto_5

    :catchall_2
    move-exception p1

    goto/16 :goto_9

    :cond_c
    :goto_5
    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const-string v10, "notifyDataSetChanged"

    const-string v11, "null cannot be cast to non-null type kotlin.CharSequence"

    const-string v12, "K"

    if-eqz v8, :cond_d

    :try_start_4
    invoke-static {v6, v11}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v8, v12, p1}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception p1

    :try_start_5
    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_6
    :try_start_6
    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {v7, v10, p1}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto/16 :goto_b

    :catchall_4
    move-exception p1

    :try_start_7
    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto/16 :goto_b

    :cond_d
    :try_start_8
    const-string v8, "com.tencent.mm.ui.base.preference.Preference"

    invoke-static {v0, v8}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_7

    :catchall_5
    move-exception v0

    :try_start_9
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_7
    instance-of v8, v0, LD0/f;

    if-eqz v8, :cond_e

    goto :goto_8

    :cond_e
    move-object v3, v0

    :goto_8
    check-cast v3, Ljava/lang/Class;

    if-nez v3, :cond_f

    goto :goto_b

    :cond_f
    const-class v0, Landroid/content/Context;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "C"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v0, v3}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v11}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v12, v0}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "H"

    const-string v3, "\u70b9\u51fb\u590d\u5236"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v0, v3}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "d"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v7, v0, p1}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {v7, v10, p1}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/f1;->d(Ljava/lang/String;)V

    sget-object p1, LD0/l;->a:LD0/l;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_a

    :goto_9
    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p1

    :goto_a
    invoke-static {p1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_10

    sget-object v0, Lc0/f1;->a:Lc0/f1;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "inject fail: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/f1;->d(Ljava/lang/String;)V

    :cond_10
    :goto_b
    return-void

    :pswitch_3
    iget-object v4, p0, Lc0/f;->c:Ljava/lang/Object;

    check-cast v4, Lc0/n0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/n0;->p()Z

    move-result v4

    if-nez v4, :cond_11

    goto/16 :goto_11

    :cond_11
    iget-object v4, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v4, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v4

    move v6, v2

    :goto_c
    if-ge v6, v5, :cond_13

    aget-object v7, v4, v6

    instance-of v8, v7, Landroid/view/Menu;

    if-eqz v8, :cond_12

    goto :goto_d

    :cond_12
    add-int/2addr v6, v1

    goto :goto_c

    :cond_13
    move-object v7, v3

    :goto_d
    instance-of v4, v7, Landroid/view/Menu;

    if-eqz v4, :cond_14

    check-cast v7, Landroid/view/Menu;

    goto :goto_e

    :cond_14
    move-object v7, v3

    :goto_e
    if-nez v7, :cond_15

    goto/16 :goto_11

    :cond_15
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    :goto_f
    if-ge v2, v0, :cond_17

    aget-object v4, p1, v2

    instance-of v5, v4, Landroid/view/View;

    if-eqz v5, :cond_16

    goto :goto_10

    :cond_16
    add-int/2addr v2, v1

    goto :goto_f

    :cond_17
    move-object v4, v3

    :goto_10
    instance-of p1, v4, Landroid/view/View;

    if-eqz p1, :cond_18

    move-object v3, v4

    check-cast v3, Landroid/view/View;

    :cond_18
    if-nez v3, :cond_19

    goto :goto_11

    :cond_19
    iget-object p1, p0, Lc0/f;->c:Ljava/lang/Object;

    check-cast p1, Lc0/n0;

    invoke-static {p1, v3}, Lc0/n0;->a(Lc0/n0;Landroid/view/View;)Landroid/widget/TextView;

    move-result-object p1

    if-nez p1, :cond_1a

    goto :goto_11

    :cond_1a
    iget-object v0, p0, Lc0/f;->c:Ljava/lang/Object;

    check-cast v0, Lc0/n0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, p1}, Lc0/n0;->u(Landroid/view/View;Landroid/widget/TextView;)Lc0/j0;

    move-result-object v0

    if-nez v0, :cond_1b

    goto :goto_11

    :cond_1b
    sput-object v0, Lc0/n0;->o:Lc0/j0;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v1, Lc0/n0;->p:Ljava/lang/ref/WeakReference;

    iget-object p1, v0, Lc0/j0;->b:Ljava/lang/String;

    sput-object p1, Lc0/n0;->q:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lc0/n0;->r:J

    iget-object p1, p0, Lc0/f;->c:Ljava/lang/Object;

    check-cast p1, Lc0/n0;

    invoke-static {p1, v7}, Lc0/n0;->b(Lc0/n0;Landroid/view/Menu;)V

    iget-object p1, p0, Lc0/f;->c:Ljava/lang/Object;

    check-cast p1, Lc0/n0;

    iget-wide v1, v0, Lc0/j0;->a:J

    iget-object v0, v0, Lc0/j0;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0xa

    const/16 v3, 0x20

    invoke-static {v0, p1, v3}, LW0/r;->G0(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, LW0/j;->Z0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lc0/f;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "create menu bind msgId="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " text="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " method="

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/n0;->C(Ljava/lang/String;)V

    :goto_11
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "args"

    const/4 v3, 0x1

    iget-object v4, p0, Lc0/f;->d:Ljava/lang/Object;

    iget-object v5, p0, Lc0/f;->c:Ljava/lang/Object;

    iget v6, p0, Lc0/f;->b:I

    sparse-switch v6, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {}, Lc0/v1;->a()Lc0/x1;

    move-result-object v0

    iget-boolean v1, v0, Lc0/x1;->a:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    array-length v1, p1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_1

    iget v0, v0, Lc0/x1;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, p1, v2

    check-cast v5, Lc0/w1;

    check-cast v4, Ljava/lang/String;

    invoke-static {v5, v4, v0}, Lc0/w1;->b(Lc0/w1;Ljava/lang/String;F)V

    :cond_1
    :goto_0
    return-void

    :sswitch_1
    invoke-static {}, Lc0/p;->a()Lc0/q;

    move-result-object v6

    iget-boolean v7, v6, Lc0/q;->a:Z

    if-nez v7, :cond_2

    goto :goto_3

    :cond_2
    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v7

    :goto_1
    if-ge v1, v2, :cond_4

    aget-object v8, v7, v1

    instance-of v9, v8, Landroid/content/ContentValues;

    if-eqz v9, :cond_3

    goto :goto_2

    :cond_3
    add-int/2addr v1, v3

    goto :goto_1

    :cond_4
    move-object v8, v0

    :goto_2
    instance-of v1, v8, Landroid/content/ContentValues;

    if-eqz v1, :cond_5

    move-object v0, v8

    check-cast v0, Landroid/content/ContentValues;

    :cond_5
    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    sget-object v1, Lc0/n;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, LW0/j;->Y0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    check-cast v4, Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0, v6}, Lc0/n;->a(Ljava/lang/String;Landroid/content/ContentValues;Lc0/q;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :cond_7
    :goto_3
    return-void

    :sswitch_2
    check-cast v5, Lc0/g;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/g;->j()Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_11

    :cond_8
    iget-object v5, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v5, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, [B

    if-eqz v5, :cond_9

    check-cast v2, [B

    goto :goto_4

    :cond_9
    move-object v2, v0

    :goto_4
    if-nez v2, :cond_a

    goto/16 :goto_11

    :cond_a
    :try_start_0
    iget-object v5, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    const-string v6, "field_attrBuf"

    invoke-static {v5, v6}, LU/S;->y(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v5

    invoke-static {v5}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v5

    :goto_5
    instance-of v6, v5, LD0/f;

    if-eqz v6, :cond_b

    move-object v5, v0

    :cond_b
    instance-of v6, v5, [B

    if-eqz v6, :cond_c

    check-cast v5, [B

    goto :goto_6

    :cond_c
    move-object v5, v0

    :goto_6
    if-eqz v5, :cond_22

    array-length v6, v5

    if-nez v6, :cond_d

    goto/16 :goto_11

    :cond_d
    check-cast v4, Ljava/lang/ClassLoader;

    :try_start_1
    const-string v6, "com.tencent.mm.protocal.protobuf.SnsObject"

    invoke-static {v4, v6}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4, v5}, Lc0/g;->m(Ljava/lang/Class;[B)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_e

    goto/16 :goto_10

    :cond_e
    invoke-static {v4, v2}, Lc0/g;->m(Ljava/lang/Class;[B)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_f

    goto/16 :goto_10

    :cond_f
    invoke-static {v5}, Lc0/g;->n(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_10

    goto/16 :goto_10

    :cond_10
    invoke-static {v4}, Lc0/g;->n(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    if-nez v6, :cond_11

    goto/16 :goto_10

    :cond_11
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_12

    goto/16 :goto_10

    :cond_12
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_13
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_16

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_14

    move-object v9, v0

    :cond_14
    if-eqz v9, :cond_15

    invoke-static {v9}, Lc0/g;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_8

    :cond_15
    move-object v9, v0

    :goto_8
    if-eqz v9, :cond_13

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :catchall_1
    move-exception v3

    goto/16 :goto_d

    :cond_16
    new-instance v8, Ljava/util/HashSet;

    const/16 v9, 0xc

    invoke-static {v7, v9}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-static {v9}, LE0/x;->g0(I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/HashSet;-><init>(I)V

    invoke-static {v7, v8}, LE0/l;->w0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v7, v1

    :cond_17
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_18

    move-object v9, v0

    :cond_18
    if-nez v9, :cond_19

    goto :goto_9

    :cond_19
    invoke-static {v9}, Lc0/g;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_1a

    goto :goto_9

    :cond_1a
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_17

    invoke-static {v9}, Lc0/g;->l(Ljava/lang/Object;)V

    invoke-static {v9}, Lc0/g;->c(Ljava/lang/Object;)V

    instance-of v11, v6, LR0/a;

    if-eqz v11, :cond_1c

    instance-of v11, v6, LR0/b;

    if-eqz v11, :cond_1b

    goto :goto_a

    :cond_1b
    const-string v3, "kotlin.collections.MutableList"

    invoke-static {v6, v3}, LQ0/q;->d(Ljava/lang/Object;Ljava/lang/String;)V

    throw v0

    :cond_1c
    :goto_a
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v3

    goto :goto_9

    :cond_1d
    if-nez v7, :cond_1e

    goto :goto_10

    :cond_1e
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    const-string v5, "CommentCount"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6, v5}, LU/S;->j0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_b

    :catchall_2
    move-exception v5

    :try_start_3
    invoke-static {v5}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_b
    :try_start_4
    const-string v5, "CommentUserListCount"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4, v3, v5}, LU/S;->j0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_c

    :catchall_3
    move-exception v3

    :try_start_5
    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_c
    invoke-static {v4}, Lc0/g;->o(Ljava/lang/Object;)[B

    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_e

    :goto_d
    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v3

    :goto_e
    invoke-static {v3}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_1f

    sget-object v5, Lc0/g;->a:Lc0/g;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "mergeAttrBufComments: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lc0/g;->r(Ljava/lang/String;)V

    :cond_1f
    instance-of v4, v3, LD0/f;

    if-eqz v4, :cond_20

    goto :goto_f

    :cond_20
    move-object v0, v3

    :goto_f
    check-cast v0, [B

    :goto_10
    if-nez v0, :cond_21

    goto :goto_11

    :cond_21
    if-eq v0, v2, :cond_22

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_22

    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aput-object v0, p1, v1

    const-string p1, "merged CommentUserList into setAttrBuf"

    invoke-static {p1}, Lc0/g;->r(Ljava/lang/String;)V

    sget-object p1, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    const-string v0, "\u670b\u53cb\u5708\u8bc4\u8bba\u9632\u5220: \u5408\u5e76\u56de CommentUserList + [\u5df2\u5220\u9664]"

    invoke-virtual {p1, v0}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    :cond_22
    :goto_11
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_1
        0x5 -> :sswitch_0
    .end sparse-switch
.end method

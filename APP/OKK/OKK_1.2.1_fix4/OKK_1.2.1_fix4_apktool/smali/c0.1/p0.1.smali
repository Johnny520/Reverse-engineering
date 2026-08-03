.class public final Lc0/p0;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc0/q0;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/p0;->b:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lc0/q0;->a:Lc0/q0;

    iput-object p1, p0, Lc0/p0;->c:Lc0/q0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_0
    sget-object p1, Lc0/q0;->a:Lc0/q0;

    iput-object p1, p0, Lc0/p0;->c:Lc0/q0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_1
    sget-object p1, Lc0/q0;->a:Lc0/q0;

    iput-object p1, p0, Lc0/p0;->c:Lc0/q0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_2
    sget-object p1, Lc0/q0;->a:Lc0/q0;

    iput-object p1, p0, Lc0/p0;->c:Lc0/q0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_3
    sget-object p1, Lc0/q0;->a:Lc0/q0;

    iput-object p1, p0, Lc0/p0;->c:Lc0/q0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 4

    iget v0, p0, Lc0/p0;->b:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    sget-boolean v0, Lc0/q0;->c:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0, p1}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/View;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->g(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->i(Landroid/view/View;)V

    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->f(Landroid/view/View;)V

    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "addView hide fold banner id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/q0;->l(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void

    :pswitch_1
    invoke-static {}, Lc0/q0;->b()V

    sget-boolean v0, Lc0/q0;->c:Z

    if-nez v0, :cond_4

    goto/16 :goto_9

    :cond_4
    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    const-string v1, "thisObject"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-virtual {v0}, LE0/c;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.tencent.mm.ui.conversation.l5"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, ".l5"

    invoke-static {v2, v3}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_7
    :goto_3
    invoke-static {v1}, Lc0/q0;->h(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-static {v2}, Lc0/q0;->i(Landroid/view/View;)V

    invoke-static {v2}, Lc0/q0;->f(Landroid/view/View;)V

    :cond_8
    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_9

    move-object v2, v1

    check-cast v2, Landroid/view/View;

    invoke-static {v2}, Lc0/q0;->g(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_9

    move-object v2, v1

    check-cast v2, Landroid/view/View;

    invoke-static {v2}, Lc0/q0;->i(Landroid/view/View;)V

    move-object v2, v1

    check-cast v2, Landroid/view/View;

    invoke-static {v2}, Lc0/q0;->f(Landroid/view/View;)V

    :cond_9
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_5

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Lc0/q0;->e(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1}, Lc0/q0;->i(Landroid/view/View;)V

    invoke-static {v1}, Lc0/q0;->f(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_4
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_a
    :try_start_1
    instance-of v0, p1, Landroid/app/Activity;

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    check-cast p1, Landroid/app/Activity;

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_8

    :cond_b
    const-string v0, "getContext"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v3}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Landroid/app/Activity;

    if-eqz v3, :cond_c

    check-cast v0, Landroid/app/Activity;

    goto :goto_5

    :cond_c
    move-object v0, v1

    :goto_5
    if-nez v0, :cond_e

    const-string v0, "getActivity"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_d

    check-cast p1, Landroid/app/Activity;

    goto :goto_6

    :cond_d
    move-object p1, v1

    goto :goto_6

    :cond_e
    move-object p1, v0

    :goto_6
    if-eqz p1, :cond_f

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    goto :goto_7

    :cond_f
    move-object p1, v1

    :goto_7
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_10

    move-object v1, p1

    check-cast v1, Landroid/view/ViewGroup;

    :cond_10
    if-eqz v1, :cond_11

    invoke-static {v1}, Lc0/q0;->e(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_11

    invoke-static {p1}, Lc0/q0;->i(Landroid/view/View;)V

    invoke-static {p1}, Lc0/q0;->f(Landroid/view/View;)V

    const-string p1, "decor lt5 hidden"

    invoke-static {p1}, Lc0/q0;->l(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_9

    :goto_8
    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_11
    :goto_9
    return-void

    :pswitch_2
    invoke-static {}, Lc0/q0;->b()V

    sget-boolean v0, Lc0/q0;->c:Z

    if-nez v0, :cond_12

    goto :goto_a

    :cond_12
    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    const-string v1, "thisObject"

    invoke-static {p1, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->h(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_13

    goto :goto_a

    :cond_13
    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->i(Landroid/view/View;)V

    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->f(Landroid/view/View;)V

    :goto_a
    return-void

    :pswitch_3
    invoke-static {}, Lc0/q0;->b()V

    sget-boolean v0, Lc0/q0;->c:Z

    if-nez v0, :cond_14

    goto :goto_c

    :cond_14
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0, p1}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_15

    check-cast p1, Landroid/view/View;

    goto :goto_b

    :cond_15
    const/4 p1, 0x0

    :goto_b
    if-nez p1, :cond_16

    goto :goto_c

    :cond_16
    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->i(Landroid/view/View;)V

    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->f(Landroid/view/View;)V

    iget-object v0, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "setFoldBanner hide "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " id="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/q0;->l(Ljava/lang/String;)V

    :goto_c
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 3

    iget v0, p0, Lc0/p0;->b:I

    sparse-switch v0, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {}, Lc0/q0;->b()V

    sget-boolean v0, Lc0/q0;->c:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lc0/q0;->a(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, p1, v2

    iget-object p1, p0, Lc0/p0;->c:Lc0/q0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/q0;->f(Landroid/view/View;)V

    :goto_1
    return-void

    :sswitch_1
    invoke-static {}, Lc0/q0;->b()V

    sget-boolean v0, Lc0/q0;->c:Z

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    iget-object v0, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v2, v0, Ljava/lang/Integer;

    if-eqz v2, :cond_5

    check-cast v0, Ljava/lang/Integer;

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_7

    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p1, v1

    :cond_7
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x4 -> :sswitch_0
    .end sparse-switch
.end method

.class public final Lc0/d;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Lc0/n0;Ljava/lang/reflect/Method;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lc0/d;->b:I

    iput-object p1, p0, Lc0/d;->d:Ljava/lang/Object;

    iput-object p2, p0, Lc0/d;->c:Ljava/lang/Object;

    iput-object p3, p0, Lc0/d;->e:Ljava/io/Serializable;

    .line 4
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lc0/d;->b:I

    sget-object v0, Lc0/w1;->a:Lc0/w1;

    iput-object p1, p0, Lc0/d;->d:Ljava/lang/Object;

    iput-object v0, p0, Lc0/d;->c:Ljava/lang/Object;

    const-string p1, "u.a"

    iput-object p1, p0, Lc0/d;->e:Ljava/io/Serializable;

    .line 1
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc0/d;->b:I

    sget-object v0, Lc0/n0;->a:Lc0/n0;

    iput-object v0, p0, Lc0/d;->d:Ljava/lang/Object;

    iput-object p1, p0, Lc0/d;->e:Ljava/io/Serializable;

    iput-object p2, p0, Lc0/d;->c:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc0/d;->b:I

    sget-object v0, Lc0/g;->a:Lc0/g;

    iput-object v0, p0, Lc0/d;->d:Ljava/lang/Object;

    iput-object p1, p0, Lc0/d;->c:Ljava/lang/Object;

    const-string p1, "DexKit:execSQL"

    iput-object p1, p0, Lc0/d;->e:Ljava/io/Serializable;

    .line 3
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lde/robv/android/xposed/b;)V
    .locals 11

    iget v0, p0, Lc0/d;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lc0/v1;->a()Lc0/x1;

    move-result-object v0

    iget-boolean v1, v0, Lc0/x1;->a:Z

    if-nez v1, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v2, "args"

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {v3, v1}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Landroid/widget/ImageView;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    check-cast v1, Landroid/widget/ImageView;

    goto :goto_0

    :cond_1
    move-object v1, v5

    :goto_0
    if-nez v1, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v4, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v4, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-static {v2, v4}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Ljava/lang/String;

    if-eqz v6, :cond_3

    check-cast v4, Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v4, v5

    :goto_1
    if-nez v4, :cond_4

    goto/16 :goto_5

    :cond_4
    sget-object v6, Lc0/w1;->e:Ljava/lang/reflect/Method;

    if-nez v6, :cond_8

    iget-object v6, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v6

    const-string v7, "getDeclaredMethods(...)"

    invoke-static {v6, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, p0, Lc0/d;->c:Ljava/lang/Object;

    check-cast v7, Lc0/w1;

    array-length v8, v6

    :goto_2
    if-ge v3, v8, :cond_6

    aget-object v9, v6, v3

    invoke-static {v9}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v9}, Lc0/w1;->f(Ljava/lang/reflect/Method;)Z

    move-result v10

    if-eqz v10, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    move-object v9, v5

    :goto_3
    if-eqz v9, :cond_7

    invoke-virtual {v9, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v9, Lc0/w1;->e:Ljava/lang/reflect/Method;

    move-object v6, v9

    goto :goto_4

    :cond_7
    move-object v6, v5

    :goto_4
    if-nez v6, :cond_8

    goto :goto_5

    :cond_8
    :try_start_0
    iget v2, v0, Lc0/x1;->b:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v1, v4, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v5}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    iget-object p1, p0, Lc0/d;->c:Ljava/lang/Object;

    check-cast p1, Lc0/w1;

    iget-object v1, p0, Lc0/d;->e:Ljava/io/Serializable;

    check-cast v1, Ljava/lang/String;

    iget v0, v0, Lc0/x1;->b:F

    invoke-static {p1, v1, v0}, Lc0/w1;->b(Lc0/w1;Ljava/lang/String;F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lc0/d;->c:Ljava/lang/Object;

    check-cast v0, Lc0/w1;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "a\u2192b fail: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/w1;->i(Ljava/lang/String;)V

    :goto_5
    return-void

    :pswitch_0
    iget-object v0, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v0, Lc0/n0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/n0;->p()Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_9

    :cond_9
    iget-object v0, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v1, "args"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    :goto_6
    const/4 v3, 0x0

    if-ge v2, v1, :cond_b

    aget-object v4, v0, v2

    instance-of v5, v4, Landroid/view/MenuItem;

    if-eqz v5, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_b
    move-object v4, v3

    :goto_7
    instance-of v0, v4, Landroid/view/MenuItem;

    if-eqz v0, :cond_c

    check-cast v4, Landroid/view/MenuItem;

    goto :goto_8

    :cond_c
    move-object v4, v3

    :goto_8
    if-nez v4, :cond_d

    goto/16 :goto_9

    :cond_d
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x48434544    # 199957.06f

    if-eq v0, v1, :cond_e

    goto/16 :goto_9

    :cond_e
    sget-object v0, Lc0/n0;->p:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-nez v0, :cond_f

    goto/16 :goto_9

    :cond_f
    iget-object v1, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v1, Lc0/n0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/n0;->n(Landroid/widget/TextView;)Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_9

    :cond_10
    sget-object v1, Lc0/n0;->o:Lc0/j0;

    iget-object v2, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v2, Lc0/n0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lc0/n0;->o(Lc0/j0;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_9

    :cond_11
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lc0/n0;->p:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v2, Lc0/n0;

    if-eqz v1, :cond_12

    iget-object v1, v1, Lc0/j0;->b:Ljava/lang/String;

    if-nez v1, :cond_13

    :cond_12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/n0;->y(Landroid/widget/TextView;)Ljava/lang/String;

    move-result-object v1

    :cond_13
    sput-object v1, Lc0/n0;->q:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lc0/n0;->r:J

    iget-object v1, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v1, Lc0/n0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/n0;->A(Landroid/widget/TextView;)V

    iget-object v0, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v0, Lc0/n0;

    iget-object v1, p0, Lc0/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lc0/d;->e:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "edit menu selected class="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " method="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lc0/n0;->C(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :cond_14
    :goto_9
    return-void

    :pswitch_1
    iget-object v0, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v0, Lc0/n0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/n0;->p()Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_b

    :cond_15
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, v0, Landroid/view/MenuItem;

    if-eqz v1, :cond_16

    check-cast v0, Landroid/view/MenuItem;

    goto :goto_a

    :cond_16
    const/4 v0, 0x0

    :goto_a
    if-nez v0, :cond_17

    goto :goto_b

    :cond_17
    invoke-interface {v0}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x48434544    # 199957.06f

    if-eq v0, v1, :cond_18

    goto :goto_b

    :cond_18
    sget-object v0, Lc0/n0;->p:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-nez v0, :cond_19

    goto :goto_b

    :cond_19
    iget-object v1, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v1, Lc0/n0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/n0;->n(Landroid/widget/TextView;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto :goto_b

    :cond_1a
    iget-object v1, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v1, Lc0/n0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/n0;->A(Landroid/widget/TextView;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    iget-object p1, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast p1, Lc0/n0;

    iget-object v0, p0, Lc0/d;->e:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc0/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "edit menu item dispatched via "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    :cond_1b
    :goto_b
    return-void

    :pswitch_2
    iget-object v0, p0, Lc0/d;->d:Ljava/lang/Object;

    check-cast v0, Lc0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/g;->j()Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_12

    :cond_1c
    iget-object v0, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v1, "args"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {v2, v0}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_c

    :cond_1d
    move-object v0, v2

    :goto_c
    iget-object v3, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v3, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-static {v1, v3}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1e

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_d

    :cond_1e
    move-object v3, v2

    :goto_d
    const-string v4, "SnsComment"

    invoke-static {v0, v4, v1}, LW0/r;->D0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_1f

    goto :goto_e

    :cond_1f
    if-eqz v0, :cond_20

    invoke-static {v0, v4, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_20

    move-object v3, v0

    move-object v0, v2

    :cond_20
    :goto_e
    invoke-static {v0, v4, v1}, LW0/r;->D0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-static {v3}, LU/S;->E(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_21

    goto :goto_f

    :cond_21
    if-eqz v0, :cond_22

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_23

    :cond_22
    invoke-static {v3}, LU/S;->E(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23

    goto :goto_f

    :cond_23
    if-nez v3, :cond_24

    const-string v3, ""

    :cond_24
    const-string v0, "delete from SnsComment"

    invoke-static {v3, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_27

    :goto_f
    iget-object v0, p0, Lc0/d;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_25

    goto :goto_10

    :cond_25
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    goto :goto_11

    :cond_26
    :goto_10
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :goto_11
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "BLOCKED execSQL via "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lc0/d;->e:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/g;->r(Ljava/lang/String;)V

    :cond_27
    :goto_12
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

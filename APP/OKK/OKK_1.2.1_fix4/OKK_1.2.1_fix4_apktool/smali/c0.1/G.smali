.class public final Lc0/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/G;

.field public static final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile c:Ld0/s;

.field public static volatile d:Ljava/lang/Object;

.field public static volatile e:Ljava/lang/reflect/Method;

.field public static volatile f:Landroid/view/View$OnClickListener;

.field public static volatile g:Z

.field public static volatile h:Z

.field public static volatile i:J

.field public static volatile j:Z

.field public static volatile k:I

.field public static volatile l:I

.field public static volatile m:I

.field public static volatile n:Z

.field public static volatile o:Z

.field public static volatile p:Z

.field public static volatile q:I

.field public static volatile r:Ljava/lang/ref/WeakReference;

.field public static volatile s:Landroid/content/Context;

.field public static volatile t:Ljava/lang/String;

.field public static final u:Ljava/util/concurrent/atomic/AtomicReference;

.field public static volatile v:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc0/G;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc0/G;->a:Lc0/G;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lc0/G;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lc0/G;->u:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final a(Landroid/view/View;)Z
    .locals 5

    const v0, 0x7e0f1001

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    sget-object v0, Lc0/G;->c:Ld0/s;

    if-ne p0, v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "com.tencent.mm.ui.LauncherUIBottomTabView"

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_4

    const-string v3, "LauncherUIBottomTabView"

    invoke-static {v0, v3}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    :cond_4
    :goto_1
    move v1, v4

    :cond_5
    :goto_2
    return v1
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    invoke-static {}, Lc0/y;->c()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lc0/y;->a:Ljava/util/List;

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p0}, Lc0/G;->t(Ljava/lang/String;)LD0/e;

    move-result-object v2

    iget-object v4, v2, LD0/e;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, LD0/e;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v6, 0xc

    if-le v5, v6, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v4}, LW0/j;->b1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v6, 0x4

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_5

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    move-object v3, v0

    :cond_5
    :goto_2
    return-object v3
.end method

.method public static c()V
    .locals 3

    sget-object v0, Lc0/G;->c:Ld0/s;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v1, Lc0/G;->k:I

    invoke-virtual {v0, v1}, Ld0/s;->setMainUnread(I)V

    sget v1, Lc0/G;->l:I

    invoke-virtual {v0, v1}, Ld0/s;->setContactUnread(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld0/s;->setContactDot(Z)V

    sget v2, Lc0/G;->m:I

    invoke-virtual {v0, v2}, Ld0/s;->setFriendUnread(I)V

    sget v2, Lc0/G;->m:I

    if-gtz v2, :cond_2

    sget-boolean v2, Lc0/G;->n:Z

    if-nez v2, :cond_1

    sget-boolean v2, Lc0/G;->o:Z

    if-eqz v2, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    invoke-virtual {v0, v1}, Ld0/s;->setFriendDot(Z)V

    return-void
.end method

.method public static d(I)V
    .locals 8

    const-string v0, "getSupportActionBar"

    sput p0, Lc0/G;->q:I

    invoke-static {}, Lc0/y;->b()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lc0/y;->c()Ljava/util/List;

    move-result-object v1

    if-ltz p0, :cond_1f

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    if-ge p0, v2, :cond_1f

    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    :cond_1
    sget-object v2, Lc0/G;->r:Ljava/lang/ref/WeakReference;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    if-nez v2, :cond_5

    :cond_2
    sget-object v2, Lc0/G;->c:Ld0/s;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    goto :goto_0

    :cond_3
    move-object v2, v3

    :goto_0
    instance-of v4, v2, Landroid/app/Activity;

    if-eqz v4, :cond_4

    check-cast v2, Landroid/app/Activity;

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    if-nez v2, :cond_5

    return-void

    :cond_5
    invoke-static {v2}, Lc0/G;->r(Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_6

    return-void

    :cond_6
    const/4 v4, 0x1

    sput-boolean v4, Lc0/G;->p:Z

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {v2}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Landroid/app/ActionBar;->getCustomView()Landroid/view/View;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v5

    goto :goto_2

    :cond_7
    move-object v5, v3

    goto :goto_3

    :goto_2
    :try_start_1
    invoke-static {v5}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v5

    :goto_3
    instance-of v6, v5, LD0/f;

    if-eqz v6, :cond_8

    move-object v5, v3

    :cond_8
    check-cast v5, Landroid/view/View;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-nez v5, :cond_d

    :try_start_2
    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v2, v0, v5}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "getCustomView"

    new-array v7, v4, [Ljava/lang/Object;

    invoke-static {v5, v6, v7}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Landroid/view/View;

    if-eqz v6, :cond_9

    check-cast v5, Landroid/view/View;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v5

    goto :goto_4

    :cond_9
    move-object v5, v3

    goto :goto_5

    :goto_4
    :try_start_3
    invoke-static {v5}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v5

    :goto_5
    instance-of v6, v5, LD0/f;

    if-eqz v6, :cond_a

    move-object v5, v3

    :cond_a
    check-cast v5, Landroid/view/View;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-nez v5, :cond_d

    :try_start_4
    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v2, v0, v5}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "j"

    new-array v6, v4, [Ljava/lang/Object;

    invoke-static {v0, v5, v6}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v5, v0, Landroid/view/View;

    if-eqz v5, :cond_b

    check-cast v0, Landroid/view/View;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception v0

    goto :goto_6

    :cond_b
    move-object v0, v3

    goto :goto_7

    :goto_6
    :try_start_5
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_7
    instance-of v5, v0, LD0/f;

    if-eqz v5, :cond_c

    move-object v0, v3

    :cond_c
    move-object v5, v0

    check-cast v5, Landroid/view/View;

    goto :goto_8

    :catchall_3
    move-exception p0

    goto/16 :goto_10

    :cond_d
    :goto_8
    const v0, 0x1020014

    if-eqz v5, :cond_e

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-nez v5, :cond_10

    :cond_e
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_9

    :cond_f
    move-object v5, v3

    :cond_10
    :goto_9
    const-string v0, ""

    if-eqz v5, :cond_16

    :try_start_6
    invoke-static {v5}, Lc0/G;->o(Landroid/widget/TextView;)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_a

    :cond_11
    move-object v2, v3

    :goto_a
    if-nez v2, :cond_12

    goto :goto_b

    :cond_12
    move-object v0, v2

    :goto_b
    invoke-static {v0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->t(Ljava/lang/String;)LD0/e;

    move-result-object v0

    iget-object v0, v0, LD0/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-nez p0, :cond_13

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_13

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_13
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    if-eqz p0, :cond_14

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_14
    invoke-static {v3, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :cond_15
    sput-boolean v4, Lc0/G;->p:Z

    return-void

    :cond_16
    :try_start_7
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-eqz v2, :cond_17

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    goto :goto_c

    :cond_17
    move-object v2, v3

    :goto_c
    instance-of v5, v2, Landroid/view/ViewGroup;

    if-eqz v5, :cond_18

    check-cast v2, Landroid/view/ViewGroup;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_d

    :cond_18
    move-object v2, v3

    :goto_d
    if-nez v2, :cond_19

    sput-boolean v4, Lc0/G;->p:Z

    return-void

    :cond_19
    :try_start_8
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v5, v5

    const v6, 0x3e23d70a    # 0.16f

    mul-float/2addr v5, v6

    float-to-int v5, v5

    new-instance v6, LQ0/m;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-static {v6, v5, v2, v4}, Lc0/G;->i(LQ0/m;ILandroid/view/View;I)V

    iget-object v2, v6, LQ0/m;->a:Ljava/lang/Object;

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_1e

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_1a

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_e

    :cond_1a
    move-object v5, v3

    :goto_e
    if-nez v5, :cond_1b

    goto :goto_f

    :cond_1b
    move-object v0, v5

    :goto_f
    invoke-static {v0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->t(Ljava/lang/String;)LD0/e;

    move-result-object v0

    iget-object v0, v0, LD0/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-nez p0, :cond_1c

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_1c

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1c
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    if-eqz p0, :cond_1d

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1d
    invoke-static {v3, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :cond_1e
    sput-boolean v4, Lc0/G;->p:Z

    return-void

    :goto_10
    sput-boolean v4, Lc0/G;->p:Z

    throw p0

    :cond_1f
    return-void
.end method

.method public static e(Landroid/view/View;)V
    .locals 6

    if-eqz p0, :cond_5

    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, LE0/i;

    invoke-direct {v0}, LE0/i;-><init>()V

    invoke-virtual {v0, p0}, LE0/i;->addLast(Ljava/lang/Object;)V

    const/4 p0, 0x0

    move v1, p0

    :cond_1
    invoke-virtual {v0}, LE0/i;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_5

    const/16 v2, 0x258

    if-ge v1, v2, :cond_5

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0}, LE0/i;->removeFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "com.tencent.mm.ui.FrostedContentView"

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "FrostedContentView"

    invoke-static {v3, v4}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    invoke-static {v2}, Lc0/G;->x(Landroid/view/View;)V

    :cond_3
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    move v4, p0

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v5}, LE0/i;->addLast(Ljava/lang/Object;)V

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method

.method public static final f(Ld0/s;Landroid/view/ViewGroup;I)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lc0/G;->j(Landroid/view/ViewGroup;)V

    invoke-virtual {p0}, Landroid/view/View;->bringToFront()V

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_0

    :cond_1
    if-lez p2, :cond_2

    new-instance v0, LS/a;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p0, p1, v1}, LS/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;I)V

    const-wide/16 v1, 0x32

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "layout try parentW="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " bar="

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "x"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " vis="

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " children="

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lc0/G;->w(Ljava/lang/String;)V

    return-void
.end method

.method public static g(Landroid/view/View;)Landroid/view/View$OnClickListener;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-class v1, Landroid/view/View;

    const-string v2, "getListenerInfo"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v3, "mOnClickListener"

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, Landroid/view/View$OnClickListener;

    if-eqz v1, :cond_1

    check-cast p0, Landroid/view/View$OnClickListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_1
    move-object p0, v0

    goto :goto_1

    :goto_0
    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_1
    instance-of v1, p0, LD0/f;

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, p0

    :goto_2
    check-cast v0, Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public static h(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 4

    :goto_0
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, LE0/c;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onTabClick"

    invoke-static {v2, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v2, v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    return-object v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final i(LQ0/m;ILandroid/view/View;I)V
    .locals 5

    iget-object v0, p0, LQ0/m;->a:Ljava/lang/Object;

    if-nez v0, :cond_3

    const/16 v0, 0xe

    if-le p3, v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RecyclerView"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "ListView"

    invoke-static {v0, v1, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "BottomTab"

    invoke-static {v0, v1, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OKKFloating"

    invoke-static {v0, v1, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    instance-of v0, p2, Landroid/widget/TextView;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v3

    const v4, 0x1020014

    if-ne v3, v4, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    new-array v0, v0, [I

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/view/View;->getLocationOnScreen([I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    aget v0, v0, v1

    if-ltz v0, :cond_2

    if-gt v0, p1, :cond_2

    iput-object p2, p0, LQ0/m;->a:Ljava/lang/Object;

    return-void

    :cond_2
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    :goto_1
    if-ge v2, v0, :cond_3

    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-string v4, "getChildAt(...)"

    invoke-static {v3, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v4, p3, 0x1

    invoke-static {p0, p1, v3, v4}, Lc0/G;->i(LQ0/m;ILandroid/view/View;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public static j(Landroid/view/ViewGroup;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Lc0/G;->p(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Lc0/G;->u(Landroid/view/ViewGroup;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static k(Ljava/lang/Class;)V
    .locals 2

    new-instance v0, Lb0/e;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    const-string v1, "onPageScrolled"

    invoke-static {p0, v1, v0}, Lc0/G;->l(Ljava/lang/Class;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lb0/e;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lb0/e;-><init>(I)V

    const-string v1, "onPageSelected"

    invoke-static {p0, v1, v0}, Lc0/G;->l(Ljava/lang/Class;Ljava/lang/String;LP0/l;)V

    new-instance v0, Lc0/A;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc0/A;-><init>(I)V

    const-string v1, "onPageScrollStateChanged"

    invoke-static {p0, v1, v0}, Lc0/G;->l(Ljava/lang/Class;Ljava/lang/String;LP0/l;)V

    return-void
.end method

.method public static final l(Ljava/lang/Class;Ljava/lang/String;LP0/l;)V
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {v0}, LE0/c;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :try_start_0
    new-instance v2, Lc0/E;

    const/4 v3, 0x0

    invoke-direct {v2, p2, v3}, Lc0/E;-><init>(LP0/l;I)V

    invoke-static {v1, v2}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hooked "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final m(Ljava/lang/reflect/Method;LP0/l;)Z
    .locals 5

    const-string v0, "hooked unread int "

    const/4 v1, 0x0

    if-nez p0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v2, v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    aget-object v2, v2, v1

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v4}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-virtual {p0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v1, Lc0/E;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lc0/E;-><init>(LP0/l;I)V

    invoke-static {p0, v1}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lc0/G;->w(Ljava/lang/String;)V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v0, p0, LD0/f;

    if-eqz v0, :cond_2

    move-object p0, p1

    :cond_2
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_3
    :goto_1
    return v1
.end method

.method public static final varargs n(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    sget-object v1, Lb0/c;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    array-length v1, p4

    invoke-static {p4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Ljava/lang/String;

    const-string v1, "classLoader"

    invoke-static {p1, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "strings"

    invoke-static {p4, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb0/b;

    const/4 v2, 0x2

    invoke-direct {v1, p1, p4, v2}, Lb0/b;-><init>(Ljava/lang/ClassLoader;[Ljava/lang/String;I)V

    invoke-static {p0, p1, p2, v1}, Lb0/c;->f(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;LP0/l;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/reflect/Method;

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    move-object v0, p0

    :cond_3
    return-object v0
.end method

.method public static o(Landroid/widget/TextView;)Z
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x1020014

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    move v1, v2

    :goto_0
    const/16 v3, 0x8

    const/4 v4, 0x1

    if-ge v1, v3, :cond_9

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    if-nez v5, :cond_2

    const-string v5, ""

    :cond_2
    const-string v6, "RecyclerView"

    invoke-static {v5, v6, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "ListView"

    invoke-static {v5, v6, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "BottomTab"

    invoke-static {v5, v6, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "OKKFloating"

    invoke-static {v5, v6, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "Preference"

    invoke-static {v5, v6, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_5

    :cond_3
    const-string v6, "ActionBar"

    invoke-static {v5, v6, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_7

    const-string v6, "Toolbar"

    invoke-static {v5, v6, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_7

    const-string v6, "action_bar"

    invoke-static {v5, v6, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_7

    const-string v6, "ActionMenuView"

    invoke-static {v5, v6, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    instance-of v4, v0, Landroid/view/View;

    if-eqz v4, :cond_5

    check-cast v0, Landroid/view/View;

    goto :goto_2

    :cond_5
    move-object v0, v3

    :goto_2
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_3

    :cond_6
    move-object v0, v3

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    :goto_4
    return v4

    :cond_8
    :goto_5
    return v2

    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_a

    return v2

    :cond_a
    const/4 v0, 0x2

    new-array v0, v0, [I

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    sget-object v1, LD0/l;->a:LD0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_6
    invoke-static {v1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    aget v0, v0, v4

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float p0, p0

    const v1, 0x3e23d70a    # 0.16f

    mul-float/2addr p0, v1

    float-to-int p0, p0

    if-ltz v0, :cond_c

    if-gt v0, p0, :cond_c

    move v2, v4

    :cond_c
    return v2
.end method

.method public static p(Ljava/lang/Class;)Z
    .locals 2

    :goto_0
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.tencent.mm.ui.LauncherUIBottomTabView"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LauncherUIBottomTabView"

    invoke-static {v0, v1}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static q(Ljava/lang/String;)Z
    .locals 4

    invoke-static {p0}, LW0/j;->b1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0xc

    if-le v0, v2, :cond_1

    :goto_0
    return v1

    :cond_1
    invoke-static {}, Lc0/y;->c()Ljava/util/List;

    move-result-object v0

    sget-object v2, Lc0/y;->a:Ljava/util/List;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, p0}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_4
    :goto_1
    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, p0}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    :goto_2
    const/4 v1, 0x1

    :cond_7
    :goto_3
    return v1
.end method

.method public static r(Landroid/content/Context;)Z
    .locals 6

    sget-object v0, Lc0/G;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-ne v0, p0, :cond_1

    sget-boolean p0, Lc0/G;->v:Z

    return p0

    :cond_1
    const/4 v0, 0x0

    move-object v3, p0

    move v2, v0

    :goto_1
    const/16 v4, 0x8

    if-ge v0, v4, :cond_8

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_2
    if-nez v4, :cond_3

    const-string v4, ""

    :cond_3
    const-string v5, "com.tencent.mm.ui.LauncherUI"

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    const-string v5, ".LauncherUI"

    invoke-static {v4, v5}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    instance-of v4, v3, Landroid/content/ContextWrapper;

    if-eqz v4, :cond_5

    check-cast v3, Landroid/content/ContextWrapper;

    goto :goto_3

    :cond_5
    move-object v3, v1

    :goto_3
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    goto :goto_5

    :cond_6
    move-object v3, v1

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v2, 0x1

    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_8
    sget-object v0, Lc0/G;->u:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sput-boolean v2, Lc0/G;->v:Z

    return v2
.end method

.method public static s(I)V
    .locals 4

    sget-object v0, Lc0/G;->d:Ljava/lang/Object;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Lc0/G;->e:Ljava/lang/reflect/Method;

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_0
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "onTabClick: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :cond_2
    if-nez p0, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    goto :goto_1

    :cond_3
    const-wide/16 v0, 0x0

    :goto_1
    sput-wide v0, Lc0/G;->i:J

    sget-object v0, Lc0/G;->c:Ld0/s;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p0, v2}, Ld0/s;->e(IZ)V

    :cond_4
    invoke-static {p0}, Lc0/G;->d(I)V

    return-void
.end method

.method public static t(Ljava/lang/String;)LD0/e;
    .locals 6

    const-string v0, "^(.*?)(\\s*[\\(\uff08]\\d+[\\)\uff09])$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "input"

    invoke-static {p0, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v2, "matcher(...)"

    invoke-static {v0, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move-object v3, v4

    goto :goto_0

    :cond_0
    new-instance v3, LW0/d;

    invoke-direct {v3, v0, p0}, LW0/d;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    :goto_0
    const/4 v0, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LW0/d;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, LE0/z;

    invoke-virtual {p0, v5}, LE0/z;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, LW0/j;->b1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3}, LW0/d;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, LE0/z;

    invoke-virtual {v1, v0}, LE0/z;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, LD0/e;

    invoke-direct {v1, p0, v0}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_1
    const-string v3, "^(.*?)(\\s+\\d+)$"

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-static {v3, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v4, LW0/d;

    invoke-direct {v4, v1, p0}, LW0/d;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    :goto_1
    if-eqz v4, :cond_6

    invoke-virtual {v4}, LW0/d;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, LE0/z;

    invoke-virtual {v1, v5}, LE0/z;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, LW0/j;->b1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/G;->q(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    sget-object v2, Lc0/y;->a:Ljava/util/List;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_5
    invoke-virtual {v4}, LW0/d;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, LE0/z;

    invoke-virtual {p0, v0}, LE0/z;->get(I)Ljava/lang/Object;

    move-result-object p0

    new-instance v0, LD0/e;

    invoke-direct {v0, v1, p0}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_6
    :goto_2
    invoke-static {p0}, LW0/j;->b1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, LD0/e;

    const-string v1, ""

    invoke-direct {v0, p0, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static u(Landroid/view/ViewGroup;)V
    .locals 5

    const-string v0, "suppress: "

    const/4 v1, 0x1

    sput-boolean v1, Lc0/G;->j:Z

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    :try_start_1
    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    const/16 v2, 0x8

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    const/4 v3, 0x0

    invoke-virtual {p0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-eqz v3, :cond_0

    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eqz v4, :cond_0

    iput v1, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_4

    :cond_0
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v4, v3, v2

    if-gez v4, :cond_1

    goto :goto_2

    :cond_1
    move v2, v3

    :goto_2
    invoke-virtual {p0, v2}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setEnabled(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_3
    sput-boolean v1, Lc0/G;->j:Z

    goto :goto_5

    :goto_4
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :goto_5
    return-void

    :catchall_2
    move-exception p0

    sput-boolean v1, Lc0/G;->j:Z

    throw p0
.end method

.method public static final v(ILandroid/view/ViewGroup;Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 19

    move-object/from16 v3, p1

    move-object/from16 v7, p2

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lc0/G;->c:Ld0/s;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-ne v0, v5, :cond_1

    invoke-static/range {p1 .. p1}, Lc0/G;->j(Landroid/view/ViewGroup;)V

    return-void

    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v6, v4

    :goto_0
    if-ge v6, v0, :cond_3

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    instance-of v10, v9, Landroid/view/ViewGroup;

    if-eqz v10, :cond_2

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-static {v10}, Lc0/G;->p(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_2

    check-cast v9, Landroid/view/ViewGroup;

    goto :goto_1

    :cond_2
    add-int/2addr v6, v5

    goto :goto_0

    :cond_3
    const/4 v9, 0x0

    :goto_1
    if-nez v9, :cond_4

    if-lez p0, :cond_4

    new-instance v0, Lc0/C;

    move-object v1, v0

    move/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v1 .. v6}, Lc0/C;-><init>(ILandroid/view/ViewGroup;Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v1, 0x3c

    invoke-virtual {v7, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_4
    sput-object p4, Lc0/G;->d:Ljava/lang/Object;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->h(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lc0/G;->e:Ljava/lang/reflect/Method;

    if-eqz v9, :cond_a

    invoke-static {v9}, Lc0/G;->g(Landroid/view/View;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-nez v0, :cond_9

    invoke-static {v9}, Lc0/G;->g(Landroid/view/View;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    new-instance v0, LE0/i;

    invoke-direct {v0}, LE0/i;-><init>()V

    invoke-virtual {v0, v9}, LE0/i;->addLast(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v0}, LE0/i;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v5

    if-eqz v6, :cond_8

    invoke-virtual {v0}, LE0/i;->removeFirst()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-static {v6}, Lc0/G;->g(Landroid/view/View;)Landroid/view/View$OnClickListener;

    move-result-object v10

    if-eqz v10, :cond_7

    move-object v0, v10

    goto :goto_3

    :cond_7
    instance-of v10, v6, Landroid/view/ViewGroup;

    if-eqz v10, :cond_6

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    move v11, v4

    :goto_2
    if-ge v11, v10, :cond_6

    invoke-virtual {v6, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    const-string v13, "getChildAt(...)"

    invoke-static {v12, v13}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v12}, LE0/i;->addLast(Ljava/lang/Object;)V

    add-int/2addr v11, v5

    goto :goto_2

    :cond_8
    const/4 v0, 0x0

    :cond_9
    :goto_3
    sput-object v0, Lc0/G;->f:Landroid/view/View$OnClickListener;

    :cond_a
    :try_start_0
    const-string v0, "f190271a"

    move-object/from16 v6, p3

    invoke-static {v6, v0}, LU/S;->y(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Landroid/app/Activity;

    if-eqz v6, :cond_b

    check-cast v0, Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_b
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    move v6, v4

    :goto_4
    if-eqz v0, :cond_f

    add-int/lit8 v10, v6, 0x1

    const/16 v11, 0x8

    if-ge v6, v11, :cond_f

    instance-of v6, v0, Landroid/app/Activity;

    if-eqz v6, :cond_c

    check-cast v0, Landroid/app/Activity;

    goto :goto_7

    :cond_c
    instance-of v6, v0, Landroid/content/ContextWrapper;

    if-eqz v6, :cond_d

    check-cast v0, Landroid/content/ContextWrapper;

    goto :goto_5

    :cond_d
    const/4 v0, 0x0

    :goto_5
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_6

    :cond_e
    const/4 v0, 0x0

    :goto_6
    move v6, v10

    goto :goto_4

    :cond_f
    const/4 v0, 0x0

    :goto_7
    if-eqz v0, :cond_10

    move-object v11, v0

    goto :goto_8

    :cond_10
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    move-object v11, v6

    :goto_8
    const-wide/16 v14, 0xc8

    if-eqz v0, :cond_12

    new-instance v6, Ljava/lang/ref/WeakReference;

    invoke-direct {v6, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v6, Lc0/G;->r:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v6

    if-eqz v6, :cond_11

    invoke-virtual {v6}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v10, Lc0/z;

    invoke-direct {v10, v4}, Lc0/z;-><init>(I)V

    invoke-virtual {v6, v10}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_11
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance v6, Lc0/z;

    invoke-direct {v6, v5}, Lc0/z;-><init>(I)V

    invoke-virtual {v0, v6, v14, v15}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_12
    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    sub-int/2addr v0, v5

    :goto_9
    const v6, 0x7e0f1001

    if-ge v2, v0, :cond_14

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v6

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v10}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    :cond_13
    add-int/2addr v0, v2

    goto :goto_9

    :cond_14
    new-instance v13, Ld0/s;

    invoke-static {v11}, LQ0/g;->b(Ljava/lang/Object;)V

    sget-object v0, Lc0/y;->a:Ljava/util/List;

    invoke-static {}, Lc0/y;->c()Ljava/util/List;

    move-result-object v12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Lc0/y;->a(J)V

    sget-boolean v0, Lc0/y;->e:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Lc0/y;->a(J)V

    sget-boolean v16, Lc0/y;->f:Z

    new-instance v10, Lc0/A;

    invoke-direct {v10, v5}, Lc0/A;-><init>(I)V

    new-instance v8, Lc0/A;

    invoke-direct {v8, v1}, Lc0/A;-><init>(I)V

    move-object/from16 v18, v10

    move-object v10, v13

    move-object v1, v13

    move v13, v0

    move/from16 v14, v16

    move-object/from16 v15, v18

    move-object/from16 v16, v8

    invoke-direct/range {v10 .. v16}, Ld0/s;-><init>(Landroid/content/Context;Ljava/util/List;ZZLc0/A;Lc0/A;)V

    sput-object v1, Lc0/G;->c:Ld0/s;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz v9, :cond_1b

    :try_start_1
    const-string v0, "getShowFriendPoint"

    new-array v6, v4, [Ljava/lang/Object;

    invoke-static {v9, v0, v6}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Ljava/lang/Boolean;

    if-eqz v6, :cond_15

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_a

    :catchall_1
    move-exception v0

    goto :goto_c

    :cond_15
    const/4 v0, 0x0

    :goto_a
    if-eqz v0, :cond_16

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_b

    :cond_16
    move v0, v4

    :goto_b
    sput-boolean v0, Lc0/G;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_d

    :goto_c
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_d
    :try_start_2
    const-string v0, "getFriendUnreadCountView"

    new-array v6, v4, [Ljava/lang/Object;

    invoke-static {v9, v0, v6}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Landroid/widget/TextView;

    if-eqz v6, :cond_17

    check-cast v0, Landroid/widget/TextView;

    goto :goto_e

    :catchall_2
    move-exception v0

    goto :goto_11

    :cond_17
    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_18

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    if-eqz v6, :cond_18

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_18

    invoke-static {v6}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_f

    :cond_18
    const/4 v6, 0x0

    :goto_f
    if-nez v6, :cond_19

    const-string v6, ""

    :cond_19
    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1a

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1a

    invoke-static {v6}, LW0/q;->A0(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1a

    move v0, v5

    goto :goto_10

    :cond_1a
    move v0, v4

    :goto_10
    sput-boolean v0, Lc0/G;->o:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_12

    :goto_11
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_12
    sget v0, Lc0/G;->k:I

    sget v6, Lc0/G;->l:I

    sget v8, Lc0/G;->m:I

    sget-boolean v10, Lc0/G;->n:Z

    sget-boolean v11, Lc0/G;->o:Z

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "sync badge native main="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " contact="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " friend="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " dot="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " text="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :cond_1b
    invoke-static {}, Lc0/G;->c()V

    if-eqz v9, :cond_1c

    invoke-static {v9}, Lc0/G;->u(Landroid/view/ViewGroup;)V

    goto :goto_13

    :cond_1c
    invoke-static/range {p1 .. p1}, Lc0/G;->j(Landroid/view/ViewGroup;)V

    :goto_13
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    instance-of v0, v3, Landroid/widget/FrameLayout;

    const/16 v6, 0x50

    const/4 v8, -0x2

    if-eqz v0, :cond_1d

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v2, v8, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    goto :goto_14

    :cond_1d
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v2, v8, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    :goto_14
    :try_start_3
    invoke-virtual {v3, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1}, Landroid/view/View;->bringToFront()V

    new-instance v0, LS/h;

    invoke-direct {v0, v1, v3, v5}, LS/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->e(Landroid/view/View;)V

    new-instance v0, Lc0/D;

    invoke-direct {v0, v7, v4}, Lc0/D;-><init>(Landroid/view/ViewGroup;I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    new-instance v0, Lc0/D;

    invoke-direct {v0, v7, v5}, Lc0/D;-><init>(Landroid/view/ViewGroup;I)V

    const-wide/16 v8, 0xc8

    invoke-virtual {v1, v0, v8, v9}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Lc0/D;

    const/4 v2, 0x2

    invoke-direct {v0, v7, v2}, Lc0/D;-><init>(Landroid/view/ViewGroup;I)V

    const-wide/16 v6, 0x320

    invoke-virtual {v1, v0, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lc0/G;->e:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_1e

    move v1, v5

    goto :goto_15

    :cond_1e
    move v1, v4

    :goto_15
    sget-object v2, Lc0/G;->f:Landroid/view/View$OnClickListener;

    if-eqz v2, :cond_1f

    move v4, v5

    :cond_1f
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "injected parent="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " click="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " listener="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_18

    :goto_16
    const/4 v1, 0x0

    goto :goto_17

    :catchall_3
    move-exception v0

    goto :goto_16

    :goto_17
    sput-object v1, Lc0/G;->c:Ld0/s;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "addView fail: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->w(Ljava/lang/String;)V

    :goto_18
    return-void
.end method

.method public static w(Ljava/lang/String;)V
    .locals 2

    const-string v0, "[OKK-FloatTab] "

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

.method public static x(Landroid/view/View;)V
    .locals 5

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    const-string v1, "setBottomBlurAreaHeight"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {p0, v1, v2}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    const-string v1, "bottomBlurAreaHeight"

    const-string v2, "m"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v3, v4}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v2, p0, v0}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method

.class public final Lc0/m;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/m;->b:I

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    sget-object p1, Lc0/G;->a:Lc0/G;

    iput-object p1, p0, Lc0/m;->c:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 3
    :pswitch_1
    sget-object p1, Lf0/f0;->a:Lf0/f0;

    iput-object p1, p0, Lc0/m;->c:Ljava/lang/Object;

    .line 4
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 5
    :pswitch_2
    sget-object p1, Lc0/w1;->a:Lc0/w1;

    iput-object p1, p0, Lc0/m;->c:Ljava/lang/Object;

    .line 6
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 7
    :pswitch_3
    sget-object p1, Lc0/q1;->a:Lc0/q1;

    iput-object p1, p0, Lc0/m;->c:Ljava/lang/Object;

    .line 8
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 9
    :pswitch_4
    sget-object p1, Lc0/s0;->a:Lc0/s0;

    iput-object p1, p0, Lc0/m;->c:Ljava/lang/Object;

    .line 10
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 11
    :pswitch_5
    sget-object p1, Lc0/c0;->a:Lc0/c0;

    iput-object p1, p0, Lc0/m;->c:Ljava/lang/Object;

    .line 12
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lc0/m;->b:I

    iput-object p2, p0, Lc0/m;->c:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 10

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget v5, p0, Lc0/m;->b:I

    sparse-switch v5, :sswitch_data_0

    return-void

    :sswitch_0
    iget-object v5, p0, Lc0/m;->c:Ljava/lang/Object;

    check-cast v5, Lf0/V;

    const-string v6, "\u4e0b\u8f7d\u76ee\u5f55\u5df2\u8bbe\u7f6e\uff1a"

    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v8, "args"

    invoke-static {v7, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v7}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v9, v7, Ljava/lang/Integer;

    if-eqz v9, :cond_0

    check-cast v7, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    move-object v7, v3

    :goto_0
    if-eqz v7, :cond_c

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const v9, 0xa0d20

    if-eq v7, v9, :cond_1

    goto/16 :goto_7

    :cond_1
    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v7}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v9, v7, Ljava/lang/Integer;

    if-eqz v9, :cond_2

    check-cast v7, Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    move-object v7, v3

    :goto_1
    if-nez v7, :cond_3

    goto/16 :goto_7

    :cond_3
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v9, -0x1

    if-eq v7, v9, :cond_4

    goto/16 :goto_7

    :cond_4
    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v7}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Landroid/content/Intent;

    if-eqz v7, :cond_5

    check-cast v1, Landroid/content/Intent;

    goto :goto_2

    :cond_5
    move-object v1, v3

    :goto_2
    if-nez v1, :cond_6

    goto/16 :goto_7

    :cond_6
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v7, p1, Landroid/app/Activity;

    if-eqz v7, :cond_7

    move-object v3, p1

    check-cast v3, Landroid/app/Activity;

    :cond_7
    if-nez v3, :cond_8

    goto/16 :goto_7

    :cond_8
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_9

    goto :goto_7

    :cond_9
    :try_start_0
    invoke-static {v5, p1}, Lf0/V;->a(Lf0/V;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_a

    goto :goto_4

    :cond_a
    sget-object v7, Lc0/e0;->a:Lc0/e0;

    invoke-static {v1}, Lc0/e0;->d(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "toString(...)"

    invoke-static {v7, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lc0/h1;->a:Lc0/h1;

    const-string v8, "download_redirect_tree_uri"

    invoke-static {v8, v7}, Lc0/h1;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    invoke-virtual {v7, p1, v0}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    :try_start_2
    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_3
    sget-object p1, Lc0/h1;->a:Lc0/h1;

    const-string v0, "download_redirect_enabled"

    invoke-virtual {p1, v0, v2, v4}, Lc0/h1;->g(Ljava/lang/String;ZZ)V

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object p1, LD0/l;->a:LD0/l;

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_5

    :cond_b
    :goto_4
    const-string p1, "\u65e0\u6cd5\u89e3\u6790\u6240\u9009\u76ee\u5f55\uff0c\u8bf7\u91cd\u8bd5"

    invoke-static {v3, p1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_7

    :goto_5
    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p1

    :goto_6
    invoke-static {p1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u8bbe\u7f6e\u76ee\u5f55\u5931\u8d25\uff1a"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, p1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    :cond_c
    :goto_7
    return-void

    :sswitch_1
    sget-boolean v3, Lc0/s0;->f:Z

    if-nez v3, :cond_d

    goto :goto_8

    :cond_d
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    if-nez p1, :cond_e

    goto :goto_8

    :cond_e
    iget-object v3, p0, Lc0/m;->c:Ljava/lang/Object;

    check-cast v3, Lc0/s0;

    invoke-virtual {v3, p1}, Lc0/s0;->a(Ljava/lang/Object;)V

    sget-object v3, Lc0/s0;->d:Landroid/os/Handler;

    new-instance v5, Lc0/r0;

    invoke-direct {v5, v4, p1}, Lc0/r0;-><init>(ILjava/lang/Object;)V

    const-wide/16 v6, 0x78

    invoke-virtual {v3, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v4, Lc0/r0;

    invoke-direct {v4, v2, p1}, Lc0/r0;-><init>(ILjava/lang/Object;)V

    const-wide/16 v5, 0x168

    invoke-virtual {v3, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v2, Lc0/r0;

    invoke-direct {v2, v1, p1}, Lc0/r0;-><init>(ILjava/lang/Object;)V

    const-wide/16 v4, 0x320

    invoke-virtual {v3, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v1, Lc0/r0;

    invoke-direct {v1, v0, p1}, Lc0/r0;-><init>(ILjava/lang/Object;)V

    const-wide/16 v4, 0x640

    invoke-virtual {v3, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_8
    return-void

    :sswitch_2
    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_9

    :cond_f
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_10

    move-object v3, p1

    check-cast v3, Landroid/view/View;

    :cond_10
    iget-object p1, p0, Lc0/m;->c:Ljava/lang/Object;

    check-cast p1, Lc0/G;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lc0/G;->x(Landroid/view/View;)V

    :goto_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x3 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 10

    const-string v0, "j"

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "args"

    iget-object v5, p0, Lc0/m;->c:Ljava/lang/Object;

    const/4 v6, 0x1

    iget v7, p0, Lc0/m;->b:I

    packed-switch v7, :pswitch_data_0

    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    const-string v7, "thisObject"

    invoke-static {v0, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v8, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v8}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v5, Lf0/f0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    instance-of v4, v1, Ljava/lang/Number;

    if-eqz v4, :cond_0

    check-cast v1, Ljava/lang/Number;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v0}, Lf0/f0;->i(Ljava/lang/Object;)Landroid/util/SparseArray;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    :goto_1
    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lf0/f0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lf0/f0;->k(Ljava/lang/Object;)I

    move-result v0

    const v1, 0xa0c2026

    if-ne v0, v1, :cond_1

    move v0, v6

    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_4

    move-object v0, v1

    :cond_4
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_e

    :cond_5
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v0, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    new-instance v4, Lf0/Y;

    const/16 v5, 0x16

    invoke-direct {v4, v5}, Lf0/Y;-><init>(I)V

    invoke-static {v1, v4}, Lf0/f0;->d(Ljava/lang/Class;LP0/l;)Ljava/lang/reflect/Field;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_6

    :cond_6
    move-object v0, v2

    :goto_5
    instance-of v1, v0, Landroid/content/Context;

    if-eqz v1, :cond_7

    check-cast v0, Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_7

    :cond_7
    move-object v0, v2

    goto :goto_7

    :goto_6
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_7
    instance-of v1, v0, LD0/f;

    if-eqz v1, :cond_8

    move-object v0, v2

    :cond_8
    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_9

    goto/16 :goto_e

    :cond_9
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_a

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    goto :goto_8

    :cond_a
    move-object v1, v2

    :goto_8
    if-nez v1, :cond_e

    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_b

    move-object v1, v0

    check-cast v1, Landroid/content/ContextWrapper;

    goto :goto_9

    :cond_b
    move-object v1, v2

    :goto_9
    if-eqz v1, :cond_c

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_a

    :cond_c
    move-object v1, v2

    :goto_a
    instance-of v4, v1, Landroid/app/Activity;

    if-eqz v4, :cond_d

    check-cast v1, Landroid/app/Activity;

    goto :goto_b

    :cond_d
    move-object v1, v2

    :cond_e
    :goto_b
    if-eqz v1, :cond_f

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v4

    if-nez v4, :cond_f

    :try_start_2
    sget-object v4, Lf0/V;->a:Lf0/V;

    sget-object v5, Lf0/M;->b:Lf0/M;

    invoke-virtual {v4, v1, v5}, Lf0/V;->w(Landroid/app/Activity;Lf0/P;)V

    const-string v1, "embedded ui shown"

    invoke-static {v1}, Lf0/f0;->l(Ljava/lang/String;)V

    sget-object v1, LD0/l;->a:LD0/l;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_c

    :catchall_2
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_c
    invoke-static {v1}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "\u6253\u5f00\u5931\u8d25: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    sget-object v0, Lf0/f0;->a:Lf0/f0;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "open fail: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/f0;->l(Ljava/lang/String;)V

    goto :goto_d

    :cond_f
    const-string v1, "\u65e0\u6cd5\u6253\u5f00\u8bbe\u7f6e"

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_10
    :goto_d
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :goto_e
    return-void

    :pswitch_2
    sget-object v0, Lc0/L1;->a:Lc0/L1;

    invoke-static {v0}, Lc0/L1;->e(Lc0/L1;)LD0/i;

    move-result-object v0

    iget-object v0, v0, LD0/i;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_f

    :cond_11
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {p1, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LE0/j;->m0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_12

    goto :goto_f

    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    check-cast v5, Lc0/N1;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/N1;->b(Ljava/lang/Class;)V

    :goto_f
    return-void

    :pswitch_3
    invoke-static {}, Lc0/v1;->a()Lc0/x1;

    move-result-object v0

    iget-boolean v1, v0, Lc0/x1;->a:Z

    if-nez v1, :cond_13

    goto :goto_10

    :cond_13
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    check-cast v5, Lc0/w1;

    iget v0, v0, Lc0/x1;->b:F

    invoke-static {v5, p1, v0}, Lc0/w1;->a(Lc0/w1;Ljava/lang/Object;F)V

    :goto_10
    return-void

    :pswitch_4
    check-cast v5, Lc0/q1;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/q1;->g()Z

    move-result v7

    if-nez v7, :cond_14

    goto/16 :goto_19

    :cond_14
    iget-object v7, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v7, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v7}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_15

    goto/16 :goto_19

    :cond_15
    :try_start_3
    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v4, v0, v7}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_16

    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_12

    :catchall_3
    move-exception v0

    goto :goto_11

    :cond_16
    move-object v0, v2

    goto :goto_12

    :goto_11
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_12
    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_17

    move-object v0, v2

    :cond_17
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_18

    goto/16 :goto_19

    :cond_18
    const-string v4, "achat_real_name_tail"

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_19

    :cond_19
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v4, v0, Landroid/app/Activity;

    if-eqz v4, :cond_1a

    check-cast v0, Landroid/app/Activity;

    goto :goto_13

    :cond_1a
    move-object v0, v2

    :goto_13
    if-nez v0, :cond_1b

    goto/16 :goto_19

    :cond_1b
    invoke-static {v0}, Lc0/q1;->o(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_21

    invoke-static {v4}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1c

    goto :goto_17

    :cond_1c
    sget-object v7, Lc0/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v7, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_1d

    const-string v1, "\u5b9e\u540d: "

    invoke-virtual {v1, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_18

    :cond_1d
    const-string v7, "\u6b63\u5728\u83b7\u53d6..."

    invoke-static {v0, v7, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v7

    invoke-virtual {v7}, Landroid/widget/Toast;->show()V

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    if-eqz v7, :cond_1f

    const-string v8, "room_name"

    invoke-virtual {v7, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1e

    goto :goto_15

    :cond_1e
    :goto_14
    move-object v2, v7

    goto :goto_16

    :cond_1f
    :goto_15
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    if-eqz v7, :cond_20

    const-string v8, "Chat_User"

    invoke-virtual {v7, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_20

    const-string v8, "@chatroom"

    invoke-static {v7, v8}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_20

    goto :goto_14

    :cond_20
    :goto_16
    sget-object v7, Lc0/q1;->i:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-virtual {v7, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    new-instance v7, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v7, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v3, Lc0/b;

    invoke-direct {v3, v7, v0, v6}, Lc0/b;-><init>(Ljava/io/Serializable;Ljava/lang/Object;I)V

    invoke-virtual {v5, v4, v2, v3}, Lc0/q1;->c(Ljava/lang/String;Ljava/lang/String;LP0/l;)V

    sget-object v2, Lc0/q1;->g:Landroid/os/Handler;

    new-instance v3, Landroidx/emoji2/text/k;

    invoke-direct {v3, v7, v4, v0, v1}, Landroidx/emoji2/text/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-wide/16 v0, 0x32c8

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_18

    :cond_21
    :goto_17
    const-string v1, "\u65e0\u6cd5\u83b7\u53d6\u5fae\u4fe1 ID"

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_18
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :goto_19
    return-void

    :pswitch_5
    check-cast v5, Lc0/f1;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/f1;->b()Z

    move-result v1

    if-nez v1, :cond_22

    goto/16 :goto_1f

    :cond_22
    iget-object v1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v1, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v1}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_23

    goto/16 :goto_1f

    :cond_23
    :try_start_4
    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v1, v0, v4}, LU/S;->g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_24

    check-cast v0, Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_1b

    :catchall_4
    move-exception v0

    goto :goto_1a

    :cond_24
    move-object v0, v2

    goto :goto_1b

    :goto_1a
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1b
    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_25

    move-object v0, v2

    :cond_25
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_28

    :try_start_5
    const-string v0, "f191135q"

    invoke-static {v1, v0}, LU/S;->y(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_26

    check-cast v0, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_1d

    :catchall_5
    move-exception v0

    goto :goto_1c

    :cond_26
    move-object v0, v2

    goto :goto_1d

    :goto_1c
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1d
    instance-of v1, v0, LD0/f;

    if-eqz v1, :cond_27

    move-object v0, v2

    :cond_27
    check-cast v0, Ljava/lang/String;

    :cond_28
    if-nez v0, :cond_29

    goto :goto_1f

    :cond_29
    const-string v1, "achat_profile_id"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    goto :goto_1f

    :cond_2a
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2b

    move-object v2, v0

    check-cast v2, Landroid/app/Activity;

    :cond_2b
    if-nez v2, :cond_2c

    goto :goto_1f

    :cond_2c
    invoke-static {v2}, Lc0/f1;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/2addr v1, v6

    if-eqz v1, :cond_2d

    :try_start_6
    const-string v1, "clipboard"

    invoke-virtual {v2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type android.content.ClipboardManager"

    invoke-static {v1, v4}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/content/ClipboardManager;

    const-string v4, "wxid"

    invoke-static {v4, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_1e

    :catchall_6
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_1e
    const-string v1, "\u5df2\u590d\u5236 "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_2d
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :goto_1f
    return-void

    :pswitch_6
    check-cast v5, Lc0/c0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/c0;->a()Z

    move-result v0

    if-nez v0, :cond_2e

    goto :goto_20

    :cond_2e
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :goto_20
    return-void

    :pswitch_7
    invoke-static {}, Lc0/y;->b()Z

    return-void

    :pswitch_8
    sget-object v0, Lc0/b0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {v0}, Lc0/b0;->m(Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v0, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    move v7, v3

    :goto_21
    if-ge v7, v1, :cond_30

    aget-object v8, v0, v7

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_2f

    goto :goto_22

    :cond_2f
    add-int/2addr v7, v6

    goto :goto_21

    :cond_30
    move-object v8, v2

    :goto_22
    instance-of v0, v8, Ljava/lang/String;

    if-eqz v0, :cond_31

    check-cast v8, Ljava/lang/String;

    goto :goto_23

    :cond_31
    move-object v8, v2

    :goto_23
    if-nez v8, :cond_32

    goto/16 :goto_2d

    :cond_32
    invoke-static {}, Lc0/p;->a()Lc0/q;

    move-result-object v0

    iget-boolean v1, v0, Lc0/q;->e:Z

    check-cast v5, Ljava/lang/String;

    if-eqz v1, :cond_38

    sget-object v1, Lc0/L0;->a:Ljava/util/List;

    const-string v1, "methodName"

    invoke-static {v5, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/L0;->a:Ljava/util/List;

    instance-of v7, v1, Ljava/util/Collection;

    const-string v9, "delete"

    if-eqz v7, :cond_33

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_33

    goto :goto_24

    :cond_33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_34
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_35

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v8, v7, v6}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    if-eqz v7, :cond_34

    invoke-virtual {v5, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_25

    :cond_35
    :goto_24
    move v1, v3

    :goto_25
    if-eqz v1, :cond_38

    sget-object v0, Lc0/n;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v5, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    const-string v0, "update"

    invoke-static {v5, v0, v3}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_36

    goto :goto_26

    :cond_36
    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_27

    :cond_37
    :goto_26
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_27
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "BLOCKED media table "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " on "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/n;->q(Ljava/lang/String;)V

    goto/16 :goto_2d

    :cond_38
    const-string v1, "rcontact"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_43

    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {p1, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    :goto_28
    if-ge v3, v0, :cond_3a

    aget-object v1, p1, v3

    instance-of v4, v1, Landroid/content/ContentValues;

    if-eqz v4, :cond_39

    goto :goto_29

    :cond_39
    add-int/2addr v3, v6

    goto :goto_28

    :cond_3a
    move-object v1, v2

    :goto_29
    instance-of p1, v1, Landroid/content/ContentValues;

    if-eqz p1, :cond_3b

    check-cast v1, Landroid/content/ContentValues;

    goto :goto_2a

    :cond_3b
    move-object v1, v2

    :goto_2a
    sget-object p1, Lc0/b0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v1, :cond_3c

    goto/16 :goto_2d

    :cond_3c
    const-string p1, "username"

    invoke-virtual {v1, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3d

    invoke-static {p1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_3d
    if-nez v2, :cond_3e

    const-string v2, ""

    :cond_3e
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_3f

    goto/16 :goto_2d

    :cond_3f
    invoke-static {v2}, Lc0/o;->g(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_40

    goto :goto_2d

    :cond_40
    const-string p1, "conRemark"

    invoke-virtual {v1, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "nickname"

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "alias"

    invoke-virtual {v1, v3}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lc0/o;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_41

    invoke-static {v0}, Lc0/o;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_41

    invoke-static {v1}, Lc0/o;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_41
    if-nez p1, :cond_42

    goto :goto_2d

    :cond_42
    sget-object v0, Lc0/b0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2d

    :cond_43
    const-string v1, "message"

    invoke-virtual {v8, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_44

    goto :goto_2d

    :cond_44
    iget-boolean v1, v0, Lc0/q;->a:Z

    if-nez v1, :cond_45

    goto :goto_2d

    :cond_45
    iget-object v1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v1, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v1

    :goto_2b
    if-ge v3, v4, :cond_47

    aget-object v7, v1, v3

    instance-of v8, v7, Landroid/content/ContentValues;

    if-eqz v8, :cond_46

    goto :goto_2c

    :cond_46
    add-int/2addr v3, v6

    goto :goto_2b

    :cond_47
    move-object v7, v2

    :goto_2c
    instance-of v1, v7, Landroid/content/ContentValues;

    if-eqz v1, :cond_48

    move-object v2, v7

    check-cast v2, Landroid/content/ContentValues;

    :cond_48
    if-nez v2, :cond_49

    goto :goto_2d

    :cond_49
    invoke-static {v5, v2, v0}, Lc0/n;->a(Ljava/lang/String;Landroid/content/ContentValues;Lc0/q;)Z

    move-result v0

    if-eqz v0, :cond_4a

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :cond_4a
    :goto_2d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

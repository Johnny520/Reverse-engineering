.class public final synthetic Lc0/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Lc0/x0;->a:I

    iput-object p1, p0, Lc0/x0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lc0/x0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x1

    const/high16 v1, 0x3f000000    # 0.5f

    const v2, 0x3d4ccccd    # 0.05f

    const/high16 v3, 0x42c80000    # 100.0f

    const/4 v4, 0x0

    const/16 v5, 0x2d

    const-string v6, "$seek"

    iget v7, p0, Lc0/x0;->a:I

    packed-switch v7, :pswitch_data_0

    iget-object v7, p0, Lc0/x0;->b:Ljava/lang/Object;

    check-cast v7, Landroid/widget/SeekBar;

    invoke-static {v7, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Lc0/x0;->c:Ljava/lang/Object;

    check-cast v6, Landroid/app/Activity;

    const-string v8, "$host"

    invoke-static {v6, v8}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lf0/V;->a:Lf0/V;

    invoke-virtual {v7}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v7

    sget-object v8, Lc0/v1;->b:Lc0/x1;

    invoke-static {v7, v4, v5}, LA0/p;->p(III)I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v3

    add-float/2addr v5, v2

    invoke-static {v5, v2, v1}, LA0/p;->o(FFF)F

    move-result v1

    sget-object v2, Lc0/h1;->a:Lc0/h1;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v5, "%.2f"

    invoke-static {v3, v5, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "round_avatar_radius"

    invoke-virtual {v2, v3, v0, v4}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\u5df2\u4fdd\u5b58\u5706\u5ea6 "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc0/x0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/SeekBar;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Lc0/x0;->c:Ljava/lang/Object;

    check-cast v6, Landroid/widget/TextView;

    const-string v7, "$valueLabel"

    invoke-static {v6, v7}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lf0/V;->a:Lf0/V;

    sget-object v7, Lc0/v1;->b:Lc0/x1;

    const v7, 0x3eb851ec    # 0.36f

    invoke-static {v7, v2, v1}, LA0/p;->o(FFF)F

    move-result v8

    sub-float/2addr v8, v2

    mul-float/2addr v8, v3

    add-float/2addr v8, v1

    float-to-int v1, v8

    invoke-static {v1, v4, v5}, LA0/p;->p(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-static {v7}, Lf0/V;->e(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_1
    iget-object v1, p0, Lc0/x0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ClassLoader;

    iget-object v2, p0, Lc0/x0;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "$classLoader"

    invoke-static {v1, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lc0/D0;->l:Ljava/lang/String;

    invoke-static {v3}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    xor-int/2addr v4, v0

    const-string v5, "\u6211"

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v6

    :goto_0
    if-nez v3, :cond_4

    :try_start_0
    sget-object v3, Lb0/q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v3, Lc0/D0;->e:Landroid/content/Context;

    invoke-static {v3, v1, v2}, Lb0/q;->d(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_1
    instance-of v2, v1, LD0/f;

    if-eqz v2, :cond_1

    move-object v1, v6

    :cond_1
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    xor-int/2addr v0, v2

    if-eqz v0, :cond_2

    move-object v6, v1

    :cond_2
    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    move-object v5, v6

    goto :goto_2

    :cond_4
    move-object v5, v3

    :goto_2
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

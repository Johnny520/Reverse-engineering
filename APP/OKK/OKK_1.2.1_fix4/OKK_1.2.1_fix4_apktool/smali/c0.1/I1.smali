.class public final Lc0/I1;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/I1;->b:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lf0/i;->a:Lf0/i;

    .line 2
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 3
    :pswitch_0
    sget-object p1, Lf0/f0;->a:Lf0/f0;

    .line 4
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    .line 5
    :pswitch_1
    sget-object p1, Lf0/f0;->a:Lf0/f0;

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

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lc0/I1;->b:I

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    const/4 p1, 0x6

    iput p1, p0, Lc0/I1;->b:I

    sget-object p1, Lf0/f0;->a:Lf0/f0;

    .line 7
    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lde/robv/android/xposed/b;)V
    .locals 4

    const-string v0, "thisObject"

    const/4 v1, 0x0

    iget v2, p0, Lc0/I1;->b:I

    packed-switch v2, :pswitch_data_0

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf0/f0;->a:Lf0/f0;

    invoke-static {p1}, Lf0/f0;->f(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lf0/f0;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lf0/f0;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v2, v0, Landroid/app/Activity;

    if-eqz v2, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    :cond_0
    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lf0/i;->a:Lf0/i;

    iget-object p1, p1, Lde/robv/android/xposed/b;->a:Ljava/lang/reflect/Executable;

    invoke-interface {p1}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "hook:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lf0/i;->a(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_3
    iget-object v0, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v2, "args"

    invoke-static {v0, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {v2, v0}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_3

    move-object v1, p1

    check-cast v1, Landroid/app/Activity;

    :cond_3
    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const-string p1, "focus"

    invoke-static {v1, p1}, Lf0/i;->a(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void

    :pswitch_4
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_5

    move-object v1, p1

    check-cast v1, Landroid/app/Activity;

    :cond_5
    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    sget-object p1, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {p1}, Lc0/B1;->e()Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_2

    :cond_7
    sget-object p1, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v1}, Lc0/G1;->B(Landroid/app/Activity;)V

    :goto_2
    return-void

    :pswitch_5
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_8

    move-object v1, p1

    check-cast v1, Landroid/app/Activity;

    :cond_8
    if-nez v1, :cond_9

    goto :goto_3

    :cond_9
    sget-object p1, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v1}, Lc0/G1;->x(Landroid/app/Activity;)V

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v0, Lc0/v;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lc0/v;-><init>(Landroid/app/Activity;I)V

    const-wide/16 v2, 0x190

    invoke-virtual {p1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_a
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_b

    new-instance v0, Lc0/v;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lc0/v;-><init>(Landroid/app/Activity;I)V

    const-wide/16 v2, 0x4b0

    invoke-virtual {p1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_b
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v0, Lc0/v;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lc0/v;-><init>(Landroid/app/Activity;I)V

    const-wide/16 v2, 0xa28

    invoke-virtual {p1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_c
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, Lc0/v;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lc0/v;-><init>(Landroid/app/Activity;I)V

    const-wide/16 v1, 0x1450

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_d
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 2

    iget v0, p0, Lc0/I1;->b:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    sget-object v0, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v0}, Lc0/B1;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sget-object v1, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lc0/G1;->t(Landroid/app/Activity;)V

    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

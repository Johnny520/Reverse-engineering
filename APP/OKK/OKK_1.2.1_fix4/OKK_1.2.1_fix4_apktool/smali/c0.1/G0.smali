.class public final Lc0/G0;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc0/I0;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/G0;->b:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lc0/I0;->a:Lc0/I0;

    iput-object p1, p0, Lc0/G0;->c:Lc0/I0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_0
    sget-object p1, Lc0/I0;->a:Lc0/I0;

    iput-object p1, p0, Lc0/G0;->c:Lc0/I0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_1
    sget-object p1, Lc0/I0;->a:Lc0/I0;

    iput-object p1, p0, Lc0/G0;->c:Lc0/I0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lde/robv/android/xposed/b;)V
    .locals 2

    iget v0, p0, Lc0/G0;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/widget/EditText;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/widget/EditText;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lc0/I0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lc0/G0;->c:Lc0/I0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/I0;->f(Landroid/widget/EditText;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Lc0/H0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lc0/H0;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_1
    return-void

    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/widget/EditText;

    if-eqz v0, :cond_4

    check-cast p1, Landroid/widget/EditText;

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lc0/G0;->c:Lc0/I0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lc0/I0;->f:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    new-instance v0, Lc0/H0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lc0/H0;-><init>(Landroid/widget/EditText;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_3
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_6

    check-cast p1, Landroid/view/View;

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    :goto_4
    sput-object p1, Lc0/I0;->h:Landroid/view/View;

    iget-object p1, p0, Lc0/G0;->c:Lc0/I0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lc0/I0;->h:Landroid/view/View;

    if-nez p1, :cond_7

    goto :goto_5

    :cond_7
    new-instance v0, LD/u;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, LD/u;-><init>(Landroid/view/View;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

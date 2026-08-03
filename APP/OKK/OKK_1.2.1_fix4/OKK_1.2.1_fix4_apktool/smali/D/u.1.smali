.class public final synthetic LD/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput p2, p0, LD/u;->a:I

    iput-object p1, p0, LD/u;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, LD/u;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LD/u;->b:Landroid/view/View;

    const-string v1, "$footer"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/I0;->a:Lc0/I0;

    invoke-static {v0}, Lc0/I0;->b(Landroid/view/View;)V

    invoke-static {v0}, Lc0/I0;->d(Landroid/view/View;)Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lc0/I0;->a(Landroid/view/View;)V

    :cond_0
    sget-object v0, Lc0/I0;->f:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    invoke-static {v0}, LE0/l;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    sget-object v2, Lc0/I0;->a:Lc0/I0;

    invoke-static {v1}, Lc0/I0;->a(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :pswitch_0
    iget-object v0, p0, LD/u;->b:Landroid/view/View;

    const-string v1, "$view"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/a0;->a:Lc0/a0;

    invoke-static {v0}, Lc0/a0;->f0(Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, LD/u;->b:Landroid/view/View;

    const-string v1, "$view"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/a0;->a:Lc0/a0;

    invoke-static {v0}, Lc0/a0;->f0(Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, LD/u;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lf0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lf0/s;->a:I

    iput-object p2, p0, Lf0/s;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    sget-object v2, LD0/l;->a:LD0/l;

    iget-object v3, p0, Lf0/s;->b:Ljava/lang/Object;

    iget v4, p0, Lf0/s;->a:I

    packed-switch v4, :pswitch_data_0

    check-cast v3, Landroid/content/Context;

    const-string v0, "$appContext"

    invoke-static {v3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LU/S;->d0(Landroid/content/Context;)Lb0/s;

    move-result-object v0

    sget-object v1, Lf0/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "wechat "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " range=\u5fae\u4fe1 8.0.69\u20138.0.76\uff08\u56fd\u670d / Play\uff09"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lf0/c0;->d(Ljava/lang/String;)V

    sget-object v1, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    invoke-virtual {v0}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\u5f53\u524d\u5fae\u4fe1: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    return-object v2

    :pswitch_0
    const-string v4, "$cl"

    check-cast v3, Ljava/lang/ClassLoader;

    invoke-static {v3, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lc0/P1;->a:Lc0/P1;

    const-class v3, Landroid/app/Activity;

    sget-object v4, Lc0/P1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4, v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    :try_start_0
    const-string v4, "onResume"

    new-instance v5, Lc0/O1;

    invoke-direct {v5, v0}, Lc0/O1;-><init>(I)V

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v4, v0}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

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

    sget-object v4, Lc0/P1;->a:Lc0/P1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "hook onResume failed: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/P1;->c(Ljava/lang/String;)V

    :cond_1
    :try_start_1
    const-string v0, "onActivityResult"

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v5, Landroid/content/Intent;

    new-instance v6, Lc0/O1;

    invoke-direct {v6, v1}, Lc0/O1;-><init>(I)V

    filled-new-array {v4, v4, v5, v6}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v0, v1}, LU/S;->q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "hook onActivityResult failed: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/P1;->c(Ljava/lang/String;)V

    :cond_2
    const-string v0, "map pick bridge installed"

    invoke-static {v0}, Lc0/P1;->c(Ljava/lang/String;)V

    :goto_2
    return-object v2

    :pswitch_1
    const-string v0, "$template"

    check-cast v3, Lf0/I;

    invoke-static {v3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v3, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/text/Editable;->clear()V

    :cond_3
    const-string v1, "\u4eca\u65e5\u5df2\u53d1${totalMsg}\u6761"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lf0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf0/e;

.field public final synthetic c:Lb0/a;

.field public final synthetic d:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lf0/e;Lb0/a;Landroid/app/Activity;I)V
    .locals 0

    iput p4, p0, Lf0/c;->a:I

    iput-object p1, p0, Lf0/c;->b:Lf0/e;

    iput-object p2, p0, Lf0/c;->c:Lb0/a;

    iput-object p3, p0, Lf0/c;->d:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "$activity"

    const-string v3, "$merged"

    const-string v4, "$progress"

    iget v5, p0, Lf0/c;->a:I

    packed-switch v5, :pswitch_data_0

    iget-object v5, p0, Lf0/c;->b:Lf0/e;

    iget-object v6, p0, Lf0/c;->c:Lb0/a;

    iget-object v7, p0, Lf0/c;->d:Landroid/app/Activity;

    invoke-static {v5, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lf0/e;->a()V

    iget-object v2, v6, Lb0/a;->a:Ljava/lang/String;

    invoke-static {v2}, LU/S;->O(Ljava/lang/String;)V

    sput-boolean v1, LU/S;->i:Z

    sput-boolean v1, LU/S;->h:Z

    invoke-static {v6}, LU/S;->g0(Lb0/a;)V

    new-instance v2, Lf0/g;

    invoke-direct {v2, v7, v6}, Lf0/g;-><init>(Landroid/app/Activity;Lb0/a;)V

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    const-string v2, "\u62a5\u544a\u5df2\u66f4\u65b0\uff08\u5b89\u88c5\u7b56\u7565\u4e0b\u6b21\u542f\u52a8\u751f\u6548\uff09"

    invoke-static {v7, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    sget-object v2, Lf0/i;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v1, Lf0/i;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :pswitch_0
    iget-object v5, p0, Lf0/c;->b:Lf0/e;

    iget-object v6, p0, Lf0/c;->c:Lb0/a;

    iget-object v7, p0, Lf0/c;->d:Landroid/app/Activity;

    invoke-static {v5, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lf0/e;->a()V

    sget-object v2, Lf0/i;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sput-boolean v1, LU/S;->i:Z

    sput-boolean v1, LU/S;->h:Z

    iget-object v2, v6, Lb0/a;->a:Ljava/lang/String;

    invoke-static {v2}, LU/S;->O(Ljava/lang/String;)V

    invoke-static {v6}, LU/S;->g0(Lb0/a;)V

    :try_start_0
    new-instance v2, Lf0/g;

    invoke-direct {v2, v7, v6}, Lf0/g;-><init>(Landroid/app/Activity;Lb0/a;)V

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    sget-object v2, LD0/l;->a:LD0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v2

    :goto_0
    invoke-static {v2}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v6}, Lb0/a;->e()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\u9002\u914d\u5b8c\u6210 "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    sget-object v0, Lf0/i;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v0, Lf0/i;->a:Lf0/i;

    invoke-virtual {v6}, Lb0/a;->e()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "interactive done "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf0/i;->g(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

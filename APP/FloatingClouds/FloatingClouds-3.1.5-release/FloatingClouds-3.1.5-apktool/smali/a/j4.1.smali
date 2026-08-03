.class public final synthetic La/j4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/s4;


# direct methods
.method public synthetic constructor <init>(La/s4;I)V
    .locals 0

    iput p2, p0, La/j4;->a:I

    iput-object p1, p0, La/j4;->b:La/s4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget v2, p0, La/j4;->a:I

    packed-switch v2, :pswitch_data_0

    iget-object v0, p0, La/j4;->b:La/s4;

    iget-object v1, v0, La/s4;->i:Landroid/view/View;

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {v0, v1}, La/s4;->d(Landroid/view/View;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v2, p0, La/j4;->b:La/s4;

    const/4 v3, 0x0

    iput-object v3, v2, La/s4;->g:La/j4;

    sget-boolean v3, La/s4;->G:Z

    if-nez v3, :cond_2

    sget-boolean v3, La/s4;->H:Z

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {v2}, La/s4$a;->b(La/s4;)V

    iget-object v0, v2, La/s4;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v2}, La/s4;->k()V

    iget-object v0, v2, La/s4;->i:Landroid/view/View;

    if-eqz v0, :cond_3

    :try_start_1
    invoke-virtual {v2, v0}, La/s4;->c(Landroid/view/View;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_1
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "onPause delayed refresh failed"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    :goto_2
    sget-boolean v3, La/s4;->G:Z

    sget-boolean v4, La/s4;->H:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[ProfileWhitelist] onPause delayed rehide SKIPPED (whitelisted page open, profile="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " chatInfo="

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v0, v2, La/s4;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_3
    :goto_3
    return-void

    :pswitch_1
    iget-object v2, p0, La/j4;->b:La/s4;

    iget-object v3, v2, La/s4;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "[DIAG] isInBackAnimation fallback reset after 500ms"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v0, v2, La/s4;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sput-boolean v1, La/s4;->F:Z

    :cond_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

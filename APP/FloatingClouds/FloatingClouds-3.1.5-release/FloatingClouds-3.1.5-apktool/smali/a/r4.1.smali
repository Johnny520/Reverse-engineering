.class public final synthetic La/r4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:La/s4;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;La/s4;I)V
    .locals 0

    iput p3, p0, La/r4;->a:I

    iput-object p1, p0, La/r4;->b:Ljava/lang/Class;

    iput-object p2, p0, La/r4;->c:La/s4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const-wide/16 v0, 0x0

    const-string v2, "getDecorView(...)"

    const/4 v3, 0x2

    const-wide/16 v4, 0x1f4

    const/4 v6, 0x0

    const-string v7, "chain"

    const/4 v8, 0x0

    const/4 v9, 0x1

    iget v10, p0, La/r4;->a:I

    packed-switch v10, :pswitch_data_0

    iget-object v0, p0, La/r4;->b:Ljava/lang/Class;

    iget-object v1, p0, La/r4;->c:La/s4;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v7}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, La/x8;->b:La/ca$b;

    sget-object v4, La/ca$b;->c:La/ca$b;

    if-ne v0, v4, :cond_2

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->O:Z

    if-eqz v0, :cond_2

    sget-boolean v0, La/s4;->G:Z

    if-nez v0, :cond_2

    sget-boolean v0, La/s4;->H:Z

    if-nez v0, :cond_2

    const-string v0, "onStop: COMMAND source rehide (HOME key)"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/ca$c;->f:La/ca$c;

    invoke-virtual {p1, v0}, La/x8;->b(La/ca$c;)V

    sget-object p1, La/s4$a$a$a;->a:La/s4$a$a$a;

    invoke-virtual {v1, v9, p1}, La/s4;->z(ZLa/s4$a$a$a;)V

    new-instance v0, La/k4;

    invoke-direct {v0, v1, v3}, La/k4;-><init>(La/s4;I)V

    invoke-virtual {v1, v9, p1, v0}, La/s4;->y(ZLa/s4$a$a$a;La/s7;)V

    sput-boolean v8, La/s4;->F:Z

    iput-boolean v9, v1, La/s4;->h:Z

    iget-object p1, v1, La/s4;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, v1, La/s4;->i:Landroid/view/View;

    if-eqz p1, :cond_1

    invoke-virtual {v1, p1}, La/s4;->c(Landroid/view/View;)V

    invoke-virtual {v1}, La/s4;->k()V

    :cond_1
    iput-object v6, v1, La/s4;->j:Ljava/lang/ref/WeakReference;

    invoke-static {}, La/s4;->x()V

    :cond_2
    :goto_0
    return-object v2

    :pswitch_0
    iget-object v3, p0, La/r4;->b:Ljava/lang/Class;

    iget-object v10, p0, La/r4;->c:La/s4;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v7}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Landroid/app/Activity;

    if-eqz v12, :cond_3

    check-cast v11, Landroid/app/Activity;

    goto :goto_1

    :cond_3
    move-object v11, v6

    :goto_1
    if-nez v11, :cond_4

    goto/16 :goto_9

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v12, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_9

    :cond_5
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {p1, v3}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sget-object v3, La/K3;->a:La/K3$a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v3

    if-nez p1, :cond_a

    sget-object v12, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v13

    if-eqz v13, :cond_a

    sget-boolean p1, La/s4;->G:Z

    const-string v0, ")"

    if-nez p1, :cond_9

    sget-boolean p1, La/s4;->H:Z

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    iget-boolean p1, v3, La/jc;->O:Z

    if-eqz p1, :cond_11

    sget-object p1, La/x8;->b:La/ca$b;

    sget-object v1, La/ca$b;->c:La/ca$b;

    if-ne p1, v1, :cond_7

    goto/16 :goto_9

    :cond_7
    sget-object p1, La/x8;->b:La/ca$b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "rehideOnLeaveApp: focus lost, rehiding (state="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    sget-object p1, La/ca$c;->f:La/ca$c;

    invoke-virtual {v12, p1}, La/x8;->b(La/ca$c;)V

    sget-object p1, La/s4$a$a$a;->a:La/s4$a$a$a;

    invoke-virtual {v10, v9, p1}, La/s4;->z(ZLa/s4$a$a$a;)V

    new-instance v0, La/k4;

    invoke-direct {v0, v10, v9}, La/k4;-><init>(La/s4;I)V

    invoke-virtual {v10, v9, p1, v0}, La/s4;->y(ZLa/s4$a$a$a;La/s7;)V

    sput-boolean v8, La/s4;->F:Z

    iput-boolean v9, v10, La/s4;->h:Z

    iget-object p1, v10, La/s4;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, v10, La/s4;->i:Landroid/view/View;

    if-eqz p1, :cond_8

    invoke-virtual {v10, p1}, La/s4;->c(Landroid/view/View;)V

    invoke-virtual {v10}, La/s4;->k()V

    :cond_8
    iput-object v6, v10, La/s4;->j:Ljava/lang/ref/WeakReference;

    invoke-static {}, La/s4;->x()V

    goto/16 :goto_9

    :cond_9
    :goto_2
    sget-boolean p1, La/s4;->G:Z

    sget-boolean v1, La/s4;->H:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[ProfileWhitelist] focus lost while whitelisted page open, skip rehideOnLeaveApp (profile="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " chatInfo="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_a
    if-eqz p1, :cond_11

    sget-object p1, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result p1

    if-nez p1, :cond_11

    :try_start_0
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object p1

    invoke-static {}, La/K3$a;->l()Z

    move-result v3

    if-eqz v3, :cond_c

    iget-boolean v3, p1, La/jc;->u:Z

    if-nez v3, :cond_b

    iget-boolean p1, p1, La/jc;->x:Z

    if-eqz p1, :cond_c

    :cond_b
    sget-object p1, La/Ue;->t:La/Ue;

    if-eqz p1, :cond_c

    invoke-virtual {v11}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v11, v3}, La/Ue;->a(Landroid/app/Activity;Landroid/view/View;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_c
    :goto_3
    sget-object p1, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :goto_4
    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_5
    sget-object p1, La/K3;->a:La/K3$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_11

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object p1

    iget-boolean p1, p1, La/jc;->n:Z

    if-nez p1, :cond_d

    goto :goto_9

    :cond_d
    const-string p1, "window focus gained, refreshing ListView"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    iget-object p1, v10, La/s4;->i:Landroid/view/View;

    if-eqz p1, :cond_11

    :try_start_1
    iget-object p1, v10, La/s4;->j:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v6, v10, La/s4;->r:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_8

    :cond_e
    :goto_6
    sub-long/2addr v2, v0

    cmp-long v0, v2, v4

    if-ltz v0, :cond_10

    invoke-virtual {p1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    invoke-virtual {v10, p1}, La/s4;->t(Landroid/widget/ListAdapter;)V

    goto :goto_7

    :cond_f
    iput-object v6, v10, La/s4;->j:Ljava/lang/ref/WeakReference;

    :cond_10
    :goto_7
    sget-object p1, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_9

    :goto_8
    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_11
    :goto_9
    return-object v7

    :pswitch_1
    iget-object v2, p0, La/r4;->b:Ljava/lang/Class;

    iget-object v10, p0, La/r4;->c:La/s4;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v7}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v7

    if-eqz v2, :cond_12

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto/16 :goto_d

    :cond_12
    sget-object p1, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result p1

    sget-object v2, La/x8;->b:La/ca$b;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_15

    if-eq v2, v9, :cond_14

    if-ne v2, v3, :cond_13

    sget-object v2, La/s4$a$b;->c:La/s4$a$b;

    goto :goto_a

    :cond_13
    new-instance p1, La/Ob;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_14
    sget-object v2, La/s4$a$b;->b:La/s4$a$b;

    goto :goto_a

    :cond_15
    sget-object v2, La/s4$a$b;->a:La/s4$a$b;

    :goto_a
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v11, "[DIAG] onPause fired, tempUnhideMainConv="

    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v11, " source="

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v2, v10, La/s4;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sput-boolean v8, La/s4;->F:Z

    if-eqz p1, :cond_17

    sget-object p1, La/x8;->b:La/ca$b;

    sget-object v2, La/ca$b;->b:La/ca$b;

    if-ne p1, v2, :cond_17

    iget-object p1, v10, La/s4;->g:La/j4;

    iget-object v2, v10, La/s4;->f:Landroid/os/Handler;

    if-eqz p1, :cond_16

    invoke-virtual {v2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_16
    new-instance p1, La/j4;

    invoke-direct {p1, v10, v9}, La/j4;-><init>(La/s4;I)V

    iput-object p1, v10, La/s4;->g:La/j4;

    invoke-virtual {v2, p1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_17
    sget-object p1, La/Ue;->t:La/Ue;

    if-eqz p1, :cond_1b

    iput v8, p1, La/Ue;->f:I

    iput-wide v0, p1, La/Ue;->g:J

    iput-object v6, p1, La/Ue;->a:Ljava/lang/ref/WeakReference;

    iput-boolean v8, p1, La/Ue;->h:Z

    iget-object v0, p1, La/Ue;->l:Landroid/os/Handler;

    iget-object v1, p1, La/Ue;->m:La/M2;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iput-boolean v8, p1, La/Ue;->i:Z

    iput-boolean v8, p1, La/Ue;->e:Z

    iput v8, p1, La/Ue;->s:I

    iput-object v6, p1, La/Ue;->b:Landroid/view/View;

    iget-object v0, p1, La/Ue;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_b

    :cond_18
    move-object v0, v6

    :goto_b
    if-eqz v0, :cond_19

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    goto :goto_c

    :cond_19
    move-object v1, v6

    :goto_c
    instance-of v2, v1, La/yf;

    if-eqz v2, :cond_1a

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    check-cast v1, La/yf;

    iget-object v1, v1, La/yf;->a:Landroid/view/Window$Callback;

    invoke-virtual {v0, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    const-string v0, "TempUnhideTrigger: TouchInterceptingCallback restored"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :cond_1a
    iput-object v6, p1, La/Ue;->c:Ljava/lang/ref/WeakReference;

    iput-boolean v8, p1, La/Ue;->q:Z

    iget-object v0, p1, La/Ue;->p:Landroid/os/Handler;

    iget-object p1, p1, La/Ue;->r:La/Ue$b;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1b
    iput-object v6, v10, La/s4;->i:Landroid/view/View;

    :goto_d
    return-object v7

    :pswitch_2
    iget-object v0, p0, La/r4;->b:Ljava/lang/Class;

    iget-object v1, p0, La/r4;->c:La/s4;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v7}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    if-eqz v0, :cond_1c

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_f

    :cond_1c
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1d

    check-cast p1, Landroid/app/Activity;

    goto :goto_e

    :cond_1d
    move-object p1, v6

    :goto_e
    if-nez p1, :cond_1e

    goto/16 :goto_f

    :cond_1e
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget-object v0, La/m0;->a:La/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La/m0;->b(Landroid/app/Activity;)V

    sput-boolean v8, La/s4;->F:Z

    iget-object v0, v1, La/s4;->g:La/j4;

    if-eqz v0, :cond_1f

    iget-object v7, v1, La/s4;->f:Landroid/os/Handler;

    invoke-virtual {v7, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1f
    iput-object v6, v1, La/s4;->g:La/j4;

    sput-boolean v8, La/s4;->G:Z

    sput-boolean v8, La/s4;->H:Z

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v1, La/s4;->i:Landroid/view/View;

    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v2

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v6

    iget-boolean v6, v6, La/jc;->n:Z

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v7

    iget-boolean v7, v7, La/jc;->q:Z

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "[HideMainUI] DEBUG onResume: masterEnabled="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " hideMainConvList="

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " hideConversation="

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " masks="

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v2, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v2

    if-nez v2, :cond_20

    iget-object v2, v1, La/s4;->C:La/Me;

    invoke-virtual {v2}, La/Me;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Handler;

    new-instance v6, La/n4;

    invoke-direct {v6, v7}, La/n4;-><init>(Z)V

    invoke-virtual {v2, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_20
    iget-boolean v2, v1, La/s4;->h:Z

    if-eqz v2, :cond_21

    invoke-virtual {v1, v0}, La/s4;->c(Landroid/view/View;)V

    iput-boolean v8, v1, La/s4;->h:Z

    :cond_21
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    invoke-static {}, La/K3$a;->l()Z

    move-result v6

    if-eqz v6, :cond_23

    iget-boolean v6, v2, La/jc;->u:Z

    if-nez v6, :cond_22

    iget-boolean v2, v2, La/jc;->x:Z

    if-eqz v2, :cond_23

    :cond_22
    sget-object v2, La/Ue;->t:La/Ue;

    if-eqz v2, :cond_23

    invoke-virtual {v2, p1, v0}, La/Ue;->a(Landroid/app/Activity;Landroid/view/View;)V

    :cond_23
    iget-object p1, v1, La/s4;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_24

    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object p1

    new-instance v2, La/i4;

    invoke-direct {v2, v1}, La/i4;-><init>(La/s4;)V

    invoke-virtual {p1, v2}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    new-instance p1, La/j4;

    invoke-direct {p1, v1, v8}, La/j4;-><init>(La/s4;I)V

    invoke-virtual {v0, p1, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_24
    :goto_f
    return-object v3

    :pswitch_3
    iget-object v0, p0, La/r4;->b:Ljava/lang/Class;

    iget-object v1, p0, La/r4;->c:La/s4;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {p1, v7}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/app/Activity;

    if-eqz v3, :cond_25

    check-cast v2, Landroid/app/Activity;

    goto :goto_10

    :cond_25
    move-object v2, v6

    :goto_10
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Number;

    if-eqz v4, :cond_26

    move-object v6, v3

    check-cast v6, Ljava/lang/Number;

    :cond_26
    if-eqz v6, :cond_27

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v3

    goto :goto_11

    :cond_27
    move v3, v8

    :goto_11
    const/4 v4, 0x4

    if-ne v3, v4, :cond_28

    if-eqz v2, :cond_28

    if-eqz v0, :cond_28

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    sget-object v0, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v2

    if-eqz v2, :cond_28

    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    iget-boolean v2, v2, La/jc;->N:Z

    if-eqz v2, :cond_28

    const-string v2, "onKeyDown BACK in LauncherUI: rehiding (rehideOnLeaveChat)"

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v2, La/ca$c;->e:La/ca$c;

    invoke-virtual {v0, v2}, La/x8;->b(La/ca$c;)V

    sget-object v0, La/s4$a$a$a;->a:La/s4$a$a$a;

    invoke-virtual {v1, v9, v0}, La/s4;->z(ZLa/s4$a$a$a;)V

    new-instance v2, La/k4;

    invoke-direct {v2, v1, v8}, La/k4;-><init>(La/s4;I)V

    invoke-virtual {v1, v9, v0, v2}, La/s4;->y(ZLa/s4$a$a$a;La/s7;)V

    sput-boolean v8, La/s4;->F:Z

    iput-boolean v9, v1, La/s4;->h:Z

    invoke-static {}, La/s4;->x()V

    invoke-virtual {v1}, La/s4;->k()V

    iget-object v0, v1, La/s4;->i:Landroid/view/View;

    if-eqz v0, :cond_28

    :try_start_2
    invoke-virtual {v1, v0}, La/s4;->c(Landroid/view/View;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_12

    :catchall_2
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_28
    :goto_12
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

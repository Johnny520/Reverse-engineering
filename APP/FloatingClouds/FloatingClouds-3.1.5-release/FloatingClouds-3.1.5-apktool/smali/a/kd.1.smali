.class public final synthetic La/kd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, La/kd;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/Od;)V
    .locals 0

    .line 2
    const/16 p1, 0x14

    iput p1, p0, La/kd;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    const-string v0, "getDeclaredMethods(...)"

    const/4 v1, 0x0

    const-string v2, "it"

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v5, "chain"

    move-object/from16 v6, p0

    iget v7, v6, La/kd;->a:I

    packed-switch v7, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, La/K3;->a:La/K3$a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v3

    iget-boolean v3, v3, La/jc;->z:Z

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Landroid/app/Activity;

    if-eqz v3, :cond_1

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    :cond_1
    if-eqz v1, :cond_2

    :try_start_0
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_2
    :goto_0
    const-string v0, "WXMaskPlugin: blocked scan login dialog"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    :goto_1
    return-object v2

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/if;->a:La/if;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/if;->f(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/if;->a:La/if;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/if;->f(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/if;->a:La/if;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/if;->e(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/if;->a:La/if;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/if;->e(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La/if;->a:La/if;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/if;->e(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_7
    if-nez p1, :cond_3

    move v3, v4

    :cond_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-static {v0, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Landroid/app/Activity;

    if-eqz v5, :cond_4

    check-cast v2, Landroid/app/Activity;

    goto :goto_2

    :cond_4
    move-object v2, v1

    :goto_2
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/String;

    if-eqz v7, :cond_5

    check-cast v5, Ljava/lang/String;

    goto :goto_3

    :cond_5
    move-object v5, v1

    :goto_3
    if-nez v5, :cond_6

    const-string v5, ""

    :cond_6
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-object v7, v0, La/jc;->P:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    if-nez v2, :cond_7

    goto/16 :goto_7

    :cond_7
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, La/l0;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, La/l0;-><init>(I)V

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_7

    :cond_8
    iget-object v0, v0, La/jc;->Q:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_7

    :cond_9
    sget-object v0, La/Ue;->t:La/Ue;

    if-eqz v0, :cond_10

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_6

    :cond_a
    sget-object v0, La/x8;->a:La/x8;

    sget-object v5, La/ca$b;->c:La/ca$b;

    sget-object v7, La/ca$c;->c:La/ca$c;

    sget-object v8, La/ca$b;->a:La/ca$b;

    sget-object v9, La/ca$b;->b:La/ca$b;

    filled-new-array {v8, v9}, [La/ca$b;

    move-result-object v8

    invoke-static {v8}, La/n9;->z([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-virtual {v0, v5, v7, v8}, La/x8;->c(La/ca$b;La/ca$c;Ljava/util/Set;)Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v0, La/x8;->b:La/ca$b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "TempUnhideTrigger: command unhide BLOCKED (state="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_6

    :cond_b
    const-string v0, "TempUnhideTrigger: command unhide triggered"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/s4;->I:La/s4;

    if-eqz v0, :cond_10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sget-wide v9, La/s4;->L:J

    sub-long v9, v7, v9

    const-wide/16 v11, 0x1f4

    cmp-long v5, v9, v11

    if-gez v5, :cond_c

    move v5, v4

    goto :goto_4

    :cond_c
    move v5, v3

    :goto_4
    sput-wide v7, La/s4;->L:J

    if-nez v5, :cond_d

    sget-object v5, La/s4$a$a$a;->c:La/s4$a$a$a;

    new-instance v7, La/k4;

    const/4 v8, 0x6

    invoke-direct {v7, v0, v8}, La/k4;-><init>(La/s4;I)V

    invoke-virtual {v0, v3, v5, v7}, La/s4;->y(ZLa/s4$a$a$a;La/s7;)V

    invoke-virtual {v0, v3, v5}, La/s4;->z(ZLa/s4$a$a$a;)V

    :cond_d
    iget-object v3, v0, La/s4;->n:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v3, v0, La/s4;->w:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    iget-object v3, v0, La/s4;->i:Landroid/view/View;

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    :cond_e
    const-string v3, "HideMainUI: onStateUnhideCommand immediate refresh rootView="

    invoke-static {v3, v1}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v1, v0, La/s4;->i:Landroid/view/View;

    if-eqz v1, :cond_f

    :try_start_1
    invoke-virtual {v0, v1}, La/s4;->d(Landroid/view/View;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_f
    :goto_5
    invoke-static {}, La/s4;->x()V

    :cond_10
    :goto_6
    if-eqz v2, :cond_11

    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    :cond_11
    :goto_7
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->i:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->h:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_b
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->g:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_c
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->e:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->d:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->l:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->c:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->o:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->f:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->n:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->m:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_14
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->k:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_15
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->j:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_16
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    sput-object v0, La/Ed;->b:Ljava/lang/Class;

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_17
    move-object/from16 v0, p1

    check-cast v0, La/r6;

    invoke-static {v0, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, La/r6;->b()La/Y4;

    move-result-object v0

    iget-object v0, v0, La/Y4;->b:Ljava/lang/String;

    return-object v0

    :pswitch_18
    move-object/from16 v0, p1

    check-cast v0, La/r6;

    invoke-static {v0, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, La/r6;->b()La/Y4;

    move-result-object v0

    iget-object v0, v0, La/Y4;->b:Ljava/lang/String;

    return-object v0

    :pswitch_19
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Class;

    invoke-static {v1, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-static {v1, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v1

    if-nez v0, :cond_12

    sget-object v0, La/a6;->a:La/a6;

    goto :goto_8

    :cond_12
    new-instance v0, La/M1;

    invoke-direct {v0, v3, v1}, La/M1;-><init>(ILjava/lang/Object;)V

    :goto_8
    return-object v0

    :pswitch_1b
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_1c
    move-object/from16 v2, p1

    check-cast v2, La/fd;

    const-string v5, "ctx"

    invoke-static {v2, v5}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, La/Cd;->a:La/Cd;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La/a5;->a:Ljava/lang/Object;

    const-string v7, "sns_info_model"

    if-eqz v5, :cond_13

    const-string v8, "rule_class_"

    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_9

    :cond_13
    move-object v5, v1

    :goto_9
    const/16 v8, 0x1c

    iget-object v2, v2, La/fd;->b:Ljava/lang/ClassLoader;

    if-eqz v5, :cond_14

    invoke-static {v2, v5}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_14

    sget-object v0, La/cd;->c:La/cd;

    invoke-static {v5, v0, v1, v1, v8}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto/16 :goto_10

    :cond_14
    invoke-static {}, La/w1;->H()Z

    move-result v5

    sget-object v13, La/cd;->b:La/cd;

    if-nez v5, :cond_15

    sget-object v14, La/dd;->b:La/dd;

    new-instance v15, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    const-string v16, "DK_NOT_READY"

    const-string v17, "sns_info_model"

    const-string v18, "DkBridge not initialized"

    const-string v19, ""

    invoke-direct/range {v15 .. v21}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v9, La/gd;

    move-object v12, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v9 .. v16}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    :goto_a
    move-object v0, v9

    goto/16 :goto_10

    :cond_15
    :try_start_2
    const-string v5, "e4.p"

    invoke-static {v5}, La/w1;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_b

    :catch_0
    sget-object v5, La/Y5;->a:La/Y5;

    :goto_b
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    sget-object v10, La/Cd;->a:La/Cd;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v9}, La/Cd;->g(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    if-eqz v9, :cond_17

    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-static {v10, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v11, v10

    move v12, v3

    :goto_d
    if-ge v12, v11, :cond_17

    aget-object v14, v10, v12

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v15

    const-string v3, "getCommentList"

    invoke-static {v15, v3}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    const-string v14, "getParameterTypes(...)"

    invoke-static {v3, v14}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v3, v3

    if-nez v3, :cond_16

    goto :goto_e

    :cond_16
    add-int/2addr v12, v4

    const/4 v3, 0x0

    goto :goto_d

    :cond_17
    move-object v9, v1

    :goto_e
    if-eqz v9, :cond_18

    goto :goto_f

    :cond_18
    const/4 v3, 0x0

    goto :goto_c

    :cond_19
    move-object v9, v1

    :goto_f
    if-eqz v9, :cond_1a

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, La/a5;->h(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "SNS_INFO_MODEL_RESOLVED cls="

    const-string v3, " via=DkBridge"

    invoke-static {v2, v0, v3}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "RuleSystem"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-object v0, La/cd;->a:La/cd;

    invoke-static {v9, v0, v1, v1, v8}, La/gd$a;->a(Ljava/lang/Class;La/cd;Ljava/lang/reflect/Method;Ljava/util/Map;I)La/gd;

    move-result-object v0

    goto :goto_10

    :cond_1a
    sget-object v14, La/dd;->c:La/dd;

    new-instance v15, La/j6;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    const-string v16, "SNS_INFO_NOT_FOUND"

    const-string v17, "sns_info_model"

    const-string v18, "no class with getCommentList found"

    const-string v19, ""

    invoke-direct/range {v15 .. v21}, La/j6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v9, La/gd;

    move-object v12, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v9 .. v16}, La/gd;-><init>(ZLjava/lang/Class;La/j6;La/cd;La/dd;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    goto/16 :goto_a

    :goto_10
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

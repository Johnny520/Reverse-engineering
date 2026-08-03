.class public final synthetic La/A3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, La/A3;->a:I

    iput-object p2, p0, La/A3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 12

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget v4, p0, La/A3;->a:I

    packed-switch v4, :pswitch_data_0

    iget-object v0, p0, La/A3;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La/A3;->b:Ljava/lang/Object;

    check-cast v0, Lio/github/libxposed/api/XposedInterface$Chain;

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v4

    :cond_0
    if-eqz v4, :cond_9

    sget-object v0, La/Gb;->g:Ljava/lang/Object;

    if-eqz v0, :cond_1

    goto/16 :goto_a

    :cond_1
    sget-object v0, La/Gb;->a:La/Gb;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, La/Gb;->e(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_9

    sput-object v4, La/Gb;->g:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v5, "captureLiveStorageInstance: captured "

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/Gb;->j(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "ConvHide"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    sget-boolean v0, La/Gb;->b:Z

    if-nez v0, :cond_9

    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, La/Gb;->c(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_9

    sput-object v4, La/Gb;->c:Ljava/lang/Object;

    sput-object v0, La/Gb;->d:Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v6, La/O8;

    const/16 v7, 0x13

    invoke-direct {v6, v7}, La/O8;-><init>(I)V

    :goto_0
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v7

    const-string v8, "getDeclaredMethods(...)"

    invoke-static {v7, v8}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v8, v7

    move v9, v1

    :goto_1
    if-ge v9, v8, :cond_3

    aget-object v10, v7, v9

    invoke-virtual {v6, v10}, La/O8;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v9, v3

    goto :goto_1

    :cond_3
    move-object v10, v2

    :goto_2
    if-eqz v10, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_5
    move-object v10, v2

    :goto_3
    if-eqz v10, :cond_6

    invoke-virtual {v10, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_6
    move-object v10, v2

    :goto_4
    sput-object v10, La/Gb;->e:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v10, :cond_8

    :try_start_1
    const-string v0, "filehelper"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_5
    instance-of v1, v0, La/wd$a;

    if-eqz v1, :cond_7

    goto :goto_6

    :cond_7
    move-object v2, v0

    :goto_6
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_7
    if-eqz v0, :cond_8

    :try_start_3
    const-string v1, "field_parentRef"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v1, La/Gb;->f:Ljava/lang/reflect/Field;
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_8

    :catch_0
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_7

    :cond_8
    :goto_8
    sput-boolean v3, La/Gb;->b:Z

    sget-object v0, La/Gb;->a:La/Gb;

    const-string v1, "captureLiveStorageInstance: IMMEDIATE resolve OK, methodsReady=true"

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, La/Gb;->j(Ljava/lang/String;)V

    const-string v0, "captureLiveStorageInstance: immediate resolve OK"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_a

    :goto_9
    sget-object v1, La/Gb;->a:La/Gb;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "captureLiveStorageInstance: immediate resolve failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/Gb;->j(Ljava/lang/String;)V

    :cond_9
    :goto_a
    return-object v4

    :pswitch_1
    iget-object v1, p0, La/A3;->b:Ljava/lang/Object;

    check-cast v1, La/jc;

    sget-object v3, La/va;->g:La/va$a;

    iget v1, v1, La/jc;->K:I

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_5
    sget-object v3, La/w1;->p:Landroid/content/Context;

    if-nez v3, :cond_a

    goto :goto_e

    :cond_a
    const-string v4, "vibrator"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Landroid/os/Vibrator;

    if-eqz v4, :cond_b

    move-object v2, v3

    check-cast v2, Landroid/os/Vibrator;

    goto :goto_b

    :catchall_2
    move-exception v1

    goto :goto_c

    :cond_b
    :goto_b
    if-nez v2, :cond_c

    goto :goto_e

    :cond_c
    invoke-static {v2, v1}, La/va$a;->a(Landroid/os/Vibrator;I)V

    sget-object v1, La/Wf;->a:La/Wf;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_d

    :goto_c
    invoke-static {v1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v1

    :goto_d
    invoke-static {v1}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_d

    const-string v2, "[MaskedMsgVibrate] preview vibrate fail"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :cond_d
    :goto_e
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_2
    sget-object v0, La/m0;->a:La/m0;

    iget-object v1, p0, La/A3;->b:Ljava/lang/Object;

    check-cast v1, La/X9;

    invoke-virtual {v1}, Landroidx/fragment/app/b;->z()La/X6;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-boolean v0, La/m0;->c:Z

    if-eqz v0, :cond_e

    goto :goto_f

    :cond_e
    invoke-static {v1}, La/m0;->c(Landroid/app/Activity;)V

    :goto_f
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_3
    iget-object v0, p0, La/A3;->b:Ljava/lang/Object;

    check-cast v0, La/h8;

    invoke-virtual {v0}, La/h8;->j()V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_4
    iget-object v2, p0, La/A3;->b:Ljava/lang/Object;

    check-cast v2, La/s4$a$a$a;

    const-string v4, "expected"

    invoke-static {v2, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, La/x8;->a:La/x8;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_11

    if-eq v2, v3, :cond_10

    if-ne v2, v0, :cond_f

    sget-object v0, La/ca$b;->c:La/ca$b;

    goto :goto_10

    :cond_f
    new-instance v0, La/Ob;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_10
    sget-object v0, La/ca$b;->b:La/ca$b;

    goto :goto_10

    :cond_11
    sget-object v0, La/ca$b;->a:La/ca$b;

    :goto_10
    sget-object v2, La/x8;->b:La/ca$b;

    if-ne v2, v0, :cond_12

    move v1, v3

    :cond_12
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, La/A3;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/ComponentActivity;

    invoke-static {v0}, Landroidx/activity/ComponentActivity;->c(Landroidx/activity/ComponentActivity;)La/Wf;

    move-result-object v0

    return-object v0

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

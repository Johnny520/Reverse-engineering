.class public final La/va;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/va$a;
    }
.end annotation


# static fields
.field public static final g:La/va$a;

.field public static final h:Landroid/media/AudioAttributes;


# instance fields
.field public volatile a:Ljava/lang/reflect/Field;

.field public volatile b:Ljava/lang/reflect/Field;

.field public volatile c:Ljava/lang/reflect/Field;

.field public d:Z

.field public e:J

.field public f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La/va$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/va;->g:La/va$a;

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    sput-object v0, La/va;->h:Landroid/media/AudioAttributes;

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "[MaskedMsgVibrate] "

    invoke-static {v0, p0}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/ClassLoader;)V
    .locals 12

    const-string v0, "onInsert skip: dedup ("

    if-nez p1, :cond_0

    const-string p1, "onInsert skip: msgObj null"

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v1, La/K3;->a:La/K3$a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v1

    if-nez v1, :cond_1

    const-string p1, "onInsert skip: master disabled"

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v1

    iget-boolean v1, v1, La/jc;->J:Z

    if-nez v1, :cond_2

    const-string p1, "onInsert skip: switch off"

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    const-string v1, "field_talker"

    invoke-static {p1, v1}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    check-cast v1, Ljava/lang/String;

    goto :goto_0

    :cond_3
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_19

    invoke-static {v1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v3

    :goto_1
    if-nez v1, :cond_5

    goto/16 :goto_12

    :cond_5
    sget-object v2, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v1}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "onInsert skip: not masked ("

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    return-void

    :cond_6
    iget-object v2, p0, La/va;->b:Ljava/lang/reflect/Field;

    const/4 v4, 0x0

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    :try_start_0
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/lang/Boolean;

    if-eqz v5, :cond_8

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    goto :goto_2

    :catchall_0
    move-exception v2

    goto :goto_3

    :cond_8
    instance-of v5, v2, Ljava/lang/Number;

    if-eqz v5, :cond_9

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-eqz v2, :cond_9

    const/4 v4, 0x1

    :cond_9
    :goto_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    invoke-static {v2}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v2

    :goto_4
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v5, v2, La/wd$a;

    if-eqz v5, :cond_a

    move-object v2, v4

    :cond_a
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :goto_5
    if-eqz v4, :cond_b

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "onInsert skip: self-sent ("

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    return-void

    :cond_b
    sget-object v2, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    const-string v2, "cl"

    invoke-static {p2, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, La/Gb;->a:La/Gb;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, La/Gb;->e:Ljava/lang/reflect/Method;

    if-eqz p2, :cond_10

    sget-object p2, La/Gb;->f:Ljava/lang/reflect/Field;

    if-nez p2, :cond_c

    goto :goto_9

    :cond_c
    :try_start_1
    sget-object p2, La/Gb;->e:Ljava/lang/reflect/Method;

    invoke-static {p2}, La/i9;->b(Ljava/lang/Object;)V

    sget-object v2, La/Gb;->c:Ljava/lang/Object;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p2, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_d

    goto :goto_9

    :cond_d
    sget-object v2, La/Gb;->f:Ljava/lang/reflect/Field;

    invoke-static {v2}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v2, p2, Ljava/lang/String;

    if-eqz v2, :cond_e

    check-cast p2, Ljava/lang/String;

    goto :goto_6

    :catchall_1
    move-exception p2

    goto :goto_7

    :cond_e
    move-object p2, v3

    :goto_6
    const-string v2, "hidden_conv_parent"

    invoke-static {p2, v2}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_8

    :goto_7
    invoke-static {p2}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p2

    :goto_8
    instance-of v2, p2, La/wd$a;

    if-eqz v2, :cond_f

    move-object p2, v3

    :cond_f
    check-cast p2, Ljava/lang/Boolean;

    goto :goto_a

    :cond_10
    :goto_9
    move-object p2, v3

    :goto_a
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2, v2}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "onInsert skip: not hidden, wechat will notify ("

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    return-void

    :cond_11
    const-string v2, "field_msgId"

    invoke-static {p1, v2}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Ljava/lang/Long;

    if-eqz v2, :cond_12

    check-cast p1, Ljava/lang/Long;

    goto :goto_b

    :cond_12
    move-object p1, v3

    :goto_b
    const-wide/16 v4, -0x1

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_c

    :cond_13
    move-wide v6, v4

    :goto_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    monitor-enter p0

    cmp-long p1, v6, v4

    if-eqz p1, :cond_14

    :try_start_2
    iget-wide v4, p0, La/va;->e:J

    cmp-long p1, v6, v4

    if-nez p1, :cond_14

    iget-wide v4, p0, La/va;->f:J

    sub-long v4, v8, v4

    const-wide/16 v10, 0x5dc

    cmp-long p1, v4, v10

    if-gez p1, :cond_14

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " msgId="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit p0

    return-void

    :catchall_2
    move-exception p1

    goto/16 :goto_11

    :cond_14
    :try_start_3
    iput-wide v6, p0, La/va;->e:J

    iput-wide v8, p0, La/va;->f:J

    sget-object p1, La/Wf;->a:La/Wf;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit p0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "onInsert TRIGGER vibrate: talker="

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " msgId="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " hidden="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    sget-object p1, La/w1;->p:Landroid/content/Context;

    if-nez p1, :cond_15

    const-string p1, "doVibrate skip: AppContext null"

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    goto :goto_10

    :cond_15
    sget-object p2, La/K3;->a:La/K3$a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object p2

    iget p2, p2, La/jc;->K:I

    :try_start_4
    const-string v0, "vibrator"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/os/Vibrator;

    if-eqz v0, :cond_16

    move-object v3, p1

    check-cast v3, Landroid/os/Vibrator;

    goto :goto_d

    :catchall_3
    move-exception p1

    goto :goto_e

    :cond_16
    :goto_d
    if-nez v3, :cond_17

    goto :goto_10

    :cond_17
    sget-object p1, La/va;->g:La/va$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, p2}, La/va$a;->a(Landroid/os/Vibrator;I)V

    sget-object p1, La/Wf;->a:La/Wf;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_f

    :goto_e
    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p1

    :goto_f
    invoke-static {p1}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_18

    const-string p2, "[MaskedMsgVibrate] vibrate fail"

    filled-new-array {p2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->a([Ljava/lang/Object;)V

    :cond_18
    :goto_10
    return-void

    :goto_11
    monitor-exit p0

    throw p1

    :cond_19
    :goto_12
    const-string p1, "onInsert skip: talker empty"

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final handleHook(La/J8;)V
    .locals 12

    const-string v0, "session"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleHook started"

    invoke-static {v0}, La/va;->a(Ljava/lang/String;)V

    iget-object v0, p1, La/J8;->a:Ljava/lang/ClassLoader;

    new-instance v1, La/fd;

    sget v2, La/B1;->a:I

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    :try_start_0
    sget-object v2, La/w1;->p:Landroid/content/Context;

    invoke-static {v2}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const-string v5, "com.tencent.mm"

    const/4 v6, 0x0

    invoke-virtual {v2, v5, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget v4, v2, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->a([Ljava/lang/Object;)V

    :goto_0
    sput v4, La/B1;->a:I

    :cond_0
    sget v2, La/B1;->a:I

    invoke-direct {v1, v2, v0}, La/fd;-><init>(ILjava/lang/ClassLoader;)V

    sget-object v2, La/hd;->a:La/hd;

    const-string v4, "F017_msg_storage"

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v1}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v1

    iget-boolean v2, v1, La/gd;->a:Z

    const/4 v4, 0x0

    if-eqz v2, :cond_16

    iget-object v2, v1, La/gd;->b:Ljava/lang/Class;

    if-nez v2, :cond_1

    goto/16 :goto_c

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "insertMethod"

    invoke-virtual {v1, v5}, La/gd;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    const-string v5, "H9"

    :cond_2
    const-string v6, "msgInfoClass"

    invoke-virtual {v1, v6}, La/gd;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    iget-object v1, v1, La/gd;->d:La/cd;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_3
    move-object v7, v4

    :goto_1
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "hook via=ENGINE path="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " storage="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " method="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " msgInfo="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/va;->a(Ljava/lang/String;)V

    if-nez v6, :cond_4

    const-string p1, "msgInfoClass from Engine extras is null, skip vibrate hook"

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    return-void

    :cond_4
    monitor-enter p0

    :try_start_1
    iget-boolean v1, p0, La/va;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_5

    monitor-exit p0

    goto/16 :goto_7

    :cond_5
    move-object v1, v6

    :goto_2
    if-eqz v1, :cond_e

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    invoke-static {v7}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v7

    :cond_6
    :goto_3
    invoke-virtual {v7}, La/G1;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-virtual {v7}, La/G1;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/reflect/Field;

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v10

    const v11, -0x842549

    if-eq v10, v11, :cond_b

    const v11, 0x114ef53e

    if-eq v10, v11, :cond_9

    const v11, 0x297eb4f7

    if-eq v10, v11, :cond_7

    goto :goto_3

    :cond_7
    const-string v10, "field_msgId"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    goto :goto_3

    :cond_8
    iget-object v9, p0, La/va;->c:Ljava/lang/reflect/Field;

    if-nez v9, :cond_6

    invoke-virtual {v8, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    iput-object v8, p0, La/va;->c:Ljava/lang/reflect/Field;

    goto :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_b

    :cond_9
    const-string v10, "field_talker"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_3

    :cond_a
    iget-object v9, p0, La/va;->a:Ljava/lang/reflect/Field;

    if-nez v9, :cond_6

    invoke-virtual {v8, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    iput-object v8, p0, La/va;->a:Ljava/lang/reflect/Field;

    goto :goto_3

    :cond_b
    const-string v10, "field_isSend"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_3

    :cond_c
    iget-object v9, p0, La/va;->b:Ljava/lang/reflect/Field;

    if-nez v9, :cond_6

    invoke-virtual {v8, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    iput-object v8, p0, La/va;->b:Ljava/lang/reflect/Field;

    goto :goto_3

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_2

    :cond_e
    iput-boolean v3, p0, La/va;->d:Z

    iget-object v1, p0, La/va;->a:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_f
    move-object v1, v4

    :goto_4
    iget-object v3, p0, La/va;->b:Ljava/lang/reflect/Field;

    if-eqz v3, :cond_10

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_10
    move-object v3, v4

    :goto_5
    iget-object v7, p0, La/va;->c:Ljava/lang/reflect/Field;

    if-eqz v7, :cond_11

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v7

    goto :goto_6

    :cond_11
    move-object v7, v4

    :goto_6
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "resolveFields done: talker="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " isSend="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " msgId="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/va;->a(Ljava/lang/String;)V

    sget-object v1, La/Wf;->a:La/Wf;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    :goto_7
    :try_start_3
    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v1

    new-instance v3, La/l4;

    const/4 v6, 0x6

    invoke-direct {v3, p0, v6, v0}, La/l4;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {p1, v2, v5, v1, v3}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception p1

    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p1

    :goto_8
    invoke-static {p1}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "hook "

    const-string v1, "."

    const-string v3, " fail: "

    invoke-static {v0, v2, v1, v5, v3}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    :cond_12
    iget-object p1, p0, La/va;->a:Ljava/lang/reflect/Field;

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_9

    :cond_13
    move-object p1, v4

    :goto_9
    iget-object v0, p0, La/va;->b:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_a

    :cond_14
    move-object v0, v4

    :goto_a
    iget-object v1, p0, La/va;->c:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    :cond_15
    const-string v1, "hook installed ("

    const-string v3, "."

    const-string v6, ", talker="

    invoke-static {v1, v2, v3, v5, v6}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " isSend="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " msgId="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    return-void

    :goto_b
    monitor-exit p0

    throw p1

    :cond_16
    :goto_c
    iget-object p1, v1, La/gd;->c:La/j6;

    if-eqz p1, :cond_17

    iget-object v4, p1, La/j6;->c:Ljava/lang/String;

    :cond_17
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "F017_msg_storage resolve FAILED: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/va;->a(Ljava/lang/String;)V

    return-void
.end method

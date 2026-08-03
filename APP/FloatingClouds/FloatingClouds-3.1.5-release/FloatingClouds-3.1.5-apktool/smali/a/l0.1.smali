.class public final synthetic La/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La/l0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    const/4 v0, 0x2

    const/4 v1, 0x1

    iget v2, p0, La/l0;->a:I

    packed-switch v2, :pswitch_data_0

    sget-boolean v0, La/n6;->a:Z

    sput-boolean v1, La/n6;->q:Z

    return-void

    :pswitch_0
    :try_start_0
    sget-object v0, La/hd;->a:La/hd;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/hd;->b()V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_0
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "ResolverBypass"

    const-string v2, "diagnostic failed"

    filled-new-array {v1, v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :cond_0
    return-void

    :pswitch_1
    const-string v2, "LOCATE_FAILED"

    const-string v3, "[BlockHotUpdate] async locate OK: loader="

    :try_start_1
    sget-object v4, La/jf;->a:La/jf;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/jf;->b()La/kf;

    move-result-object v4

    if-eqz v4, :cond_1

    const-string v5, "LOCATE_OK"

    sput-object v5, La/if;->b:Ljava/lang/String;

    iget-object v5, v4, La/kf;->a:Ljava/lang/String;

    iget-object v4, v4, La/kf;->j:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " pathSegments="

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_1

    :cond_1
    sput-object v2, La/if;->b:Ljava/lang/String;

    const-string v3, "[BlockHotUpdate] async locate FAILED"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->a([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :goto_1
    sput-object v2, La/if;->b:Ljava/lang/String;

    const-string v2, "[BlockHotUpdate] async locate error"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_2
    return-void

    :pswitch_2
    sget-object v0, La/Y7;->c:La/Y7;

    if-eqz v0, :cond_2

    iget-object v0, v0, La/Y7;->a:Landroid/app/Activity;

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_3

    :try_start_2
    new-instance v1, La/ra;

    invoke-direct {v1, v0}, La/ra;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v1}, La/ra;->l()V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_3
    :goto_4
    return-void

    :pswitch_3
    const/4 v2, 0x0

    move v3, v2

    :goto_5
    sget-object v4, La/Yc;->a:[Ljava/lang/String;

    const/4 v4, 0x3

    if-ge v3, v4, :cond_6

    invoke-static {}, La/Yc;->a()Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_9

    :cond_4
    if-ge v3, v0, :cond_5

    const-wide/16 v4, 0xbb8

    :try_start_3
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    :cond_5
    add-int/2addr v3, v1

    goto :goto_5

    :catch_0
    :cond_6
    sget-object v0, La/Yc;->e:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_7

    const-string v3, "remote_disabled"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_6

    :cond_7
    move v0, v2

    :goto_6
    sget-object v3, La/Yc;->e:Landroid/content/SharedPreferences;

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_8

    const-string v6, "last_fetch_ts"

    invoke-interface {v3, v6, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    goto :goto_7

    :cond_8
    move-wide v6, v4

    :goto_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    cmp-long v3, v6, v4

    if-eqz v3, :cond_9

    sub-long v3, v8, v6

    const-wide v10, 0x9a7ec800L

    cmp-long v3, v3, v10

    if-lez v3, :cond_a

    :cond_9
    move v2, v1

    :cond_a
    const v3, 0x5265c00

    const-string v4, "fc-remote-killswitch"

    if-eqz v0, :cond_d

    if-nez v2, :cond_d

    sput-boolean v1, La/Yc;->b:Z

    sget-object v0, La/Yc;->e:Landroid/content/SharedPreferences;

    const-string v1, ""

    if-eqz v0, :cond_c

    const-string v2, "remote_message"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    goto :goto_8

    :cond_b
    move-object v1, v0

    :cond_c
    :goto_8
    sput-object v1, La/Yc;->c:Ljava/lang/String;

    sub-long/2addr v8, v6

    int-to-long v0, v3

    div-long/2addr v8, v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "network failed, SP disabled=true (fetched "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "d ago) \u2192 keep disabled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    :cond_d
    if-eqz v0, :cond_e

    if-eqz v2, :cond_e

    sub-long/2addr v8, v6

    int-to-long v0, v3

    div-long/2addr v8, v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "network failed, SP disabled=true but stale ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "d) \u2192 ignore, stay running"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    :cond_e
    const-string v0, "network failed, SP not disabled \u2192 stay running (fail-open)"

    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_9
    const-wide/32 v0, 0x1b7740

    :try_start_4
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1

    invoke-static {}, La/Yc;->a()Z

    goto :goto_9

    :catch_1
    return-void

    :pswitch_4
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void

    :pswitch_5
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void

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

.class public final synthetic La/P0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/fh;La/J8;Landroid/content/Context;)V
    .locals 0

    .line 1
    const/16 p1, 0x11

    iput p1, p0, La/P0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/P0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/P0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p2, p0, La/P0;->a:I

    iput-object p1, p0, La/P0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/P0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    const-string v0, "readReportStorage"

    const-wide/16 v1, 0xbb8

    const-string v3, "."

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    iget-object v8, p0, La/P0;->c:Ljava/lang/Object;

    iget-object v9, p0, La/P0;->b:Ljava/lang/Object;

    iget v10, p0, La/P0;->a:I

    packed-switch v10, :pswitch_data_0

    check-cast v9, La/J8;

    check-cast v8, Landroid/content/Context;

    const-string v0, "WXMaskPlugin: snapshot saved with "

    const-wide/16 v1, 0x1f40

    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    invoke-static {v9}, La/fh;->a(La/J8;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {}, La/B1$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v2, v1}, La/te;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " classes"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v1, "WXMaskPlugin: snapshot save failed"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    check-cast v9, La/fh;

    check-cast v8, La/J8;

    :try_start_1
    iget-object v0, v9, La/fh;->c:La/r8;

    invoke-virtual {v0, v8}, La/r8;->handleHook(La/J8;)V

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

    if-eqz v0, :cond_1

    const-string v1, "WXMaskPlugin: async init -> hideSearchListPluginPart FAIL"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :cond_1
    return-void

    :pswitch_1
    check-cast v8, Landroid/view/View;

    check-cast v9, La/Ue;

    invoke-virtual {v9, v8}, La/Ue;->e(Landroid/view/View;)V

    iget-object v0, v9, La/Ue;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    :cond_2
    if-nez v4, :cond_3

    const-string v0, "TempUnhideTrigger: 3s fallback \u2014 title still not found"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v9}, La/Ue;->f()V

    :goto_2
    return-void

    :pswitch_2
    check-cast v9, La/qd$e;

    check-cast v8, Landroid/graphics/Typeface;

    invoke-virtual {v9, v8}, La/qd$e;->c(Landroid/graphics/Typeface;)V

    return-void

    :pswitch_3
    check-cast v9, Landroidx/profileinstaller/ProfileInstallerInitializer;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Landroidx/profileinstaller/ProfileInstallerInitializer$b;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    const/16 v2, 0x3e8

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    new-instance v2, La/N0;

    check-cast v8, Landroid/content/Context;

    invoke-direct {v2, v8, v7}, La/N0;-><init>(Landroid/content/Context;I)V

    add-int/lit16 v1, v1, 0x1388

    int-to-long v3, v1

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_4
    check-cast v9, La/ra;

    iget-object v0, v9, La/ra;->a:Landroid/app/Activity;

    check-cast v8, Ljava/lang/Throwable;

    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\u6a21\u62df\u5931\u8d25: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_5
    check-cast v9, La/Qc;

    iget-boolean v0, v9, La/Qc;->a:Z

    check-cast v8, La/ra;

    if-eqz v0, :cond_4

    iget-object v0, v8, La/ra;->a:Landroid/app/Activity;

    const-string v1, "\u5df2\u6ce8\u5165\u6a21\u62df\u57fa\u7ebf\uff0c\u8bf7\u6253\u5f00\u7248\u672c\u8be6\u60c5\u9a8c\u8bc1"

    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_3

    :cond_4
    iget-object v0, v8, La/ra;->a:Landroid/app/Activity;

    const-string v1, "\u672a\u627e\u5230 tag \u8bed\u4e49\u5b57\u6bb5\uff0c\u6ce8\u5165\u5931\u8d25"

    invoke-static {v0, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_3
    return-void

    :pswitch_6
    check-cast v9, La/ra;

    check-cast v8, Ljava/lang/ClassLoader;

    const-string v0, "[SimulateHotUpdate] mp0 class loaded: "

    const-string v1, "[SimulateHotUpdate] locate result: mp0Class="

    :try_start_2
    sget-object v2, La/jg;->a:La/jg;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/jg;->d()La/kg;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v3, v2, La/kg;->c:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object v3, v4

    :goto_4
    if-eqz v2, :cond_6

    iget-object v5, v2, La/kg;->e:Ljava/lang/Object;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_5

    :catchall_2
    move-exception v0

    goto/16 :goto_9

    :cond_6
    move-object v5, v4

    :goto_5
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " fields="

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    if-eqz v2, :cond_c

    iget-object v1, v2, La/kg;->c:Ljava/lang/String;

    if-nez v1, :cond_7

    goto/16 :goto_8

    :cond_7
    invoke-static {v1, v6, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    new-instance v0, La/Qc;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v2, v2, La/kg;->e:Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v8, v6, Ljava/lang/String;

    if-eqz v8, :cond_9

    check-cast v6, Ljava/lang/String;

    goto :goto_7

    :cond_9
    move-object v6, v4

    :goto_7
    if-nez v6, :cond_a

    goto :goto_6

    :cond_a
    const/16 v8, 0x1e

    invoke-static {v6, v8}, La/Ce;->X(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "[SimulateHotUpdate] field="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " value="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, La/x1;->b([Ljava/lang/Object;)V

    invoke-static {v6}, La/kg$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "tag"

    invoke-static {v6, v8}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const-string v1, "FAKE_BASELINE_#0000"

    invoke-virtual {v5, v4, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[SimulateHotUpdate] injected FAKE_BASELINE_#0000 into "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    iput-boolean v7, v0, La/Qc;->a:Z

    :cond_b
    iget-object v1, v9, La/ra;->a:Landroid/app/Activity;

    new-instance v2, La/P0;

    const/16 v3, 0xb

    invoke-direct {v2, v0, v3, v9}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_a

    :cond_c
    :goto_8
    iget-object v0, v9, La/ra;->a:Landroid/app/Activity;

    new-instance v1, La/ma;

    invoke-direct {v1, v9, v7}, La/ma;-><init>(La/ra;I)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_a

    :goto_9
    const-string v1, "[SimulateHotUpdate] FAILED"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->e([Ljava/lang/Object;)V

    iget-object v1, v9, La/ra;->a:Landroid/app/Activity;

    new-instance v2, La/P0;

    const/16 v3, 0xc

    invoke-direct {v2, v9, v3, v0}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_a
    return-void

    :pswitch_7
    check-cast v9, La/T9;

    check-cast v8, Landroid/app/Activity;

    :try_start_3
    invoke-virtual {v8}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "getDecorView(...)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v8, v0}, La/T9;->e(Landroid/app/Activity;Landroid/view/View;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_b

    :catchall_3
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_b
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_d

    const-string v1, "LongClickInject: injectAlbumViewLongClick FAILED"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :cond_d
    return-void

    :pswitch_8
    check-cast v9, La/u8;

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->m:Z

    if-eqz v0, :cond_e

    check-cast v8, Landroid/view/View;

    invoke-virtual {v9, v8}, La/u8;->a(Landroid/view/View;)V

    :cond_e
    return-void

    :pswitch_9
    check-cast v9, La/q8;

    invoke-virtual {v9, v8}, La/q8;->n(Ljava/lang/Object;)V

    return-void

    :pswitch_a
    check-cast v9, La/m8;

    check-cast v8, Ljava/lang/String;

    :try_start_4
    iget-object v0, v9, La/m8;->g:Ljava/util/Map;

    const-string v1, "prefUserNames"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v8}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    const-string v1, "N"

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2, v1, v3}, La/m8;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_c

    :catchall_4
    move-exception v0

    goto :goto_d

    :cond_10
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_e

    :goto_d
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_e
    return-void

    :pswitch_b
    const-string v4, "F026"

    check-cast v9, La/v5;

    check-cast v8, La/J8;

    :try_start_5
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    invoke-static {}, La/v5;->f()Z

    move-result v1

    if-nez v1, :cond_11

    goto :goto_10

    :cond_11
    sget-object v1, La/Pc;->a:La/Pc;

    iget-object v2, v8, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/Pc;->b(Ljava/lang/ClassLoader;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    new-instance v5, La/q5;

    invoke-direct {v5, v9, v6}, La/q5;-><init>(La/v5;I)V

    invoke-static {v8, v4, v2, v5}, La/J8;->h(La/J8;Ljava/lang/String;Ljava/lang/reflect/Method;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    sget-object v5, La/E8;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v0, v5}, La/E8;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "DotIndicator: hooked storage clear trigger "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_f

    :catchall_5
    :cond_12
    :goto_10
    return-void

    :pswitch_c
    const-string v0, "this$0"

    check-cast v9, Landroidx/fragment/app/a;

    invoke-static {v9, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$operation"

    check-cast v8, Landroidx/fragment/app/f$c;

    invoke-static {v8, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Landroidx/fragment/app/f;->a(Landroidx/fragment/app/f$c;)V

    return-void

    :pswitch_d
    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, La/w1;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v9, Ljava/lang/ClassLoader;

    invoke-static {v9, v0}, La/w1;->V(Ljava/lang/ClassLoader;Ljava/util/List;)V

    return-void

    :pswitch_e
    const-string v4, "F025"

    check-cast v9, La/o2;

    check-cast v8, La/J8;

    :try_start_6
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    invoke-static {}, La/o2;->e()Z

    move-result v1

    if-nez v1, :cond_13

    goto :goto_12

    :cond_13
    sget-object v1, La/Pc;->a:La/Pc;

    iget-object v2, v8, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/Pc;->b(Ljava/lang/ClassLoader;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    new-instance v5, La/k2;

    invoke-direct {v5, v9, v6}, La/k2;-><init>(La/o2;I)V

    invoke-static {v8, v4, v2, v5}, La/J8;->h(La/J8;Ljava/lang/String;Ljava/lang/reflect/Method;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    sget-object v5, La/E8;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v0, v5}, La/E8;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "BoldBottomTab: hooked storage clear trigger "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, La/x1;->b([Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_11

    :catchall_6
    :cond_14
    :goto_12
    return-void

    :pswitch_f
    check-cast v9, La/o2;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, La/o2;->c(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, v9, La/o2;->d:Ljava/util/HashMap;

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    :try_start_7
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    if-eqz v2, :cond_15

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->scaledDensity:F

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    goto :goto_14

    :catchall_7
    move-exception v1

    goto :goto_15

    :cond_15
    :goto_14
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    sget-object v1, La/Wf;->a:La/Wf;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_13

    :goto_15
    invoke-static {v1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    goto :goto_13

    :cond_16
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    return-void

    :pswitch_10
    check-cast v8, Ljava/lang/Runnable;

    check-cast v9, La/O0$c;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_8
    invoke-interface {v8}, Ljava/lang/Runnable;->run()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    invoke-virtual {v9}, La/O0$c;->b()V

    return-void

    :catchall_8
    move-exception v0

    invoke-virtual {v9}, La/O0$c;->b()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
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

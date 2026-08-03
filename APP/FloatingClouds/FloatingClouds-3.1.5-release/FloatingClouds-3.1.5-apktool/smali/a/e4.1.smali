.class public final La/e4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# instance fields
.field public volatile a:Ljava/lang/String;

.field public volatile b:J

.field public final c:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, La/e4;->c:Landroid/os/Handler;

    return-void
.end method

.method public static b(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p0}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x6d617101

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-object v0, v0, La/jc;->C:Ljava/lang/String;

    invoke-static {v0}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "\u52a0\u5165\u5bc6\u53cb"

    :cond_2
    invoke-static {p0, v0}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "\u53d6\u6d88\u5bc6\u53cb"

    invoke-static {p0, v0}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_1

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "field_username"

    invoke-static {p0, v1}, La/A1;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    goto :goto_1

    :goto_0
    invoke-static {v1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v1

    :goto_1
    instance-of v2, v1, La/wd$a;

    if-eqz v2, :cond_1

    move-object v1, v0

    :cond_1
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-static {v1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    return-object v1

    :cond_3
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    :goto_3
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-static {v2}, La/w1;->I([Ljava/lang/Object;)La/G1;

    move-result-object v2

    :cond_4
    :goto_4
    invoke-virtual {v2}, La/G1;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v2}, La/G1;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Ljava/lang/String;

    invoke-static {v4, v5}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_5

    check-cast v3, Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object v3, v0

    :goto_5
    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {v3}, La/yh;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v0, v3

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_3

    :cond_8
    :goto_6
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 12

    iget-object v1, p0, La/e4;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, La/e4;->a:Ljava/lang/String;

    sget-object v0, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v1}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v0

    const-string v8, "CAM"

    const/4 v9, 0x0

    const-string v10, "\u523b\u821f\u6c42\u5251"

    if-eqz v0, :cond_4

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, La/K3$a;->o(Ljava/lang/String;)V

    sget-object v2, La/w1;->p:Landroid/content/Context;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v3, v0, La/jc;->R:Z

    if-eqz v3, :cond_3

    iget-object v0, v0, La/jc;->U:Ljava/lang/String;

    invoke-static {v0}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v10, v0

    :goto_0
    invoke-static {v2, v10, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_3
    :goto_1
    const-string v0, "removeMask OK: "

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_4
    sget-object v11, La/K3;->a:La/K3$a;

    new-instance v0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    const/16 v6, 0x1c

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v0 .. v7}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;ILa/O4;)V

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/K3$a;->a(Ltop/mmjz/floatingclouds/bean/MaskItemBean;)V

    sget-object v0, La/w1;->p:Landroid/content/Context;

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    iget-boolean v3, v2, La/jc;->R:Z

    if-eqz v3, :cond_7

    iget-object v2, v2, La/jc;->T:Ljava/lang/String;

    invoke-static {v2}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    move-object v10, v2

    :goto_2
    invoke-static {v0, v10, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_7
    :goto_3
    const-string v0, "addMask OK: "

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_4
    sget-object v0, La/s4;->M:La/k4;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, La/k4;->a()Ljava/lang/Object;

    :cond_8
    sget-object v0, La/h8;->k:La/A3;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, La/A3;->a()Ljava/lang/Object;

    :cond_9
    :goto_5
    return-void
.end method

.method public final handleHook(La/J8;)V
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v0, "session"

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "CAM"

    const-string v0, "handleHook START"

    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "com.tencent.mm.ui.conversation.m3"

    const-string v6, "com.tencent.mm.ui.conversation.n3"

    const-string v7, "com.tencent.mm.ui.conversation.r3"

    filled-new-array {v0, v6, v7}, [Ljava/lang/String;

    move-result-object v6

    move v7, v3

    move v8, v7

    :goto_0
    const-string v9, " fail: "

    const-string v10, "conv "

    const/4 v11, 0x3

    iget-object v12, v2, La/J8;->a:Ljava/lang/ClassLoader;

    if-ge v7, v11, :cond_2

    aget-object v13, v6, v7

    if-nez v8, :cond_2

    :try_start_0
    const-string v0, "onCreateContextMenu"

    const-class v11, Landroid/view/ContextMenu;

    const-class v14, Landroid/view/View;

    const-class v15, Landroid/view/ContextMenu$ContextMenuInfo;

    filled-new-array {v11, v14, v15}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v13, v12, v0, v11}, La/A1;->e(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v11, La/d4;

    invoke-direct {v11, v1, v3}, La/d4;-><init>(La/e4;I)V

    invoke-static {v2, v0, v11}, La/J8;->g(La/J8;Ljava/lang/reflect/Method;La/D7;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "conv onCreateContextMenu hooked: "

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v8, v4

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_3
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    add-int/2addr v7, v4

    goto :goto_0

    :cond_2
    if-nez v8, :cond_3

    const-string v0, "!!! conv onCreateContextMenu NOT FOUND"

    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    const-string v0, "com.tencent.mm.ui.conversation.k3"

    const-string v6, "com.tencent.mm.ui.conversation.l3"

    const-string v7, "com.tencent.mm.ui.conversation.p3"

    filled-new-array {v0, v6, v7}, [Ljava/lang/String;

    move-result-object v6

    move v7, v3

    move v8, v7

    :goto_4
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v14, Landroid/view/MenuItem;

    const-string v15, "onMMMenuItemSelected"

    move/from16 v16, v3

    if-ge v7, v11, :cond_6

    aget-object v3, v6, v7

    if-nez v8, :cond_6

    :try_start_1
    filled-new-array {v14, v13}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v12, v15, v0}, La/A1;->e(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v13, La/d4;

    invoke-direct {v13, v1, v4}, La/d4;-><init>(La/e4;I)V

    invoke-static {v2, v0, v13}, La/J8;->g(La/J8;Ljava/lang/reflect/Method;La/D7;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "onMMMenuItemSelected hooked: "

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v8, v4

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_6

    :cond_4
    :goto_5
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_7

    :goto_6
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_7
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    add-int/2addr v7, v4

    move/from16 v3, v16

    goto :goto_4

    :cond_6
    if-nez v8, :cond_9

    const-string v0, "com.tencent.mm.ui.conversation"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v16

    const-string v3, ".a"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const-string v3, ".b"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v3, ".c"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v3, ".d"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    const-string v3, ".e"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    const-string v3, ".f"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    const-string v3, ".g"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    const-string v3, ".h"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    const-string v3, ".i"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    const-string v3, ".j"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    const-string v3, ".k3"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v27

    const-string v3, ".l3"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    const-string v3, ".m3"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    const-string v3, ".n3"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    const-string v3, ".o3"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    const-string v3, ".p3"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v32

    const-string v3, ".q3"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v33

    const-string v3, ".r3"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v34

    const-string v3, ".s3"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v35

    const-string v3, ".t3"

    invoke-static {v0, v3}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    filled-new-array/range {v17 .. v36}, [Ljava/lang/String;

    move-result-object v3

    move/from16 v6, v16

    :goto_8
    const/16 v0, 0x14

    if-ge v6, v0, :cond_8

    aget-object v0, v3, v6

    :try_start_2
    filled-new-array {v14, v13}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v0, v12, v15, v7}, La/A1;->e(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v7

    if-eqz v7, :cond_7

    new-instance v8, La/d4;

    const/4 v9, 0x2

    invoke-direct {v8, v1, v9}, La/d4;-><init>(La/e4;I)V

    invoke-static {v2, v7, v8}, La/J8;->g(La/J8;Ljava/lang/reflect/Method;La/D7;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "onMMMenuItemSelected hooked (broad): "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_b

    :catchall_2
    move-exception v0

    goto :goto_9

    :cond_7
    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_a

    :goto_9
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_a
    add-int/2addr v6, v4

    goto :goto_8

    :cond_8
    const-string v0, "onMMMenuItemSelected broad search failed"

    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    :goto_b
    const-string v0, "ready"

    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

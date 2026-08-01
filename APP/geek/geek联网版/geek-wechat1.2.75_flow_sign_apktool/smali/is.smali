.class public final synthetic Lis;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ljava/lang/ClassLoader;

.field public final b:Lp00;

.field public final c:Lp00;

.field public final d:Lp00;

.field public final e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Lp00;Lp00;Lp00;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e3\u06e3"

    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    iput-object p4, p0, Lis;->d:Lp00;

    :cond_0
    const-string v1, "\u06e3\u06e0\u06e4"

    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    sget v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    div-int/lit16 v2, v2, -0xb21

    sub-int/2addr v1, v2

    if-gtz v1, :cond_1

    const/16 v1, 0x50

    sput v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v1, "\u06e7\u06e1\u06e2"

    invoke-static {v1}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    add-int/2addr v1, v2

    const v2, 0x1ab052

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/lit16 v2, v2, -0xbf0

    rem-int/2addr v1, v2

    if-ltz v1, :cond_3

    const/16 v1, 0x1c

    sput v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v1, "\u06e4\u06e1\u06e7"

    :goto_1
    invoke-static {v1}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e0\u06e1\u06e6"

    goto :goto_1

    :sswitch_4
    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v1

    if-gtz v1, :cond_2

    sget v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    mul-int/lit16 v2, v2, 0x1ff5

    xor-int/2addr v1, v2

    if-lez v1, :cond_0

    sget v1, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    xor-int/2addr v1, v2

    const v2, 0x1ab400

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    iput-object p3, p0, Lis;->c:Lp00;

    :goto_2
    const-string v1, "\u06e8\u06e8\u06e0"

    invoke-static {v1}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_6
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    add-int/lit16 v2, v2, 0x309

    div-int/2addr v1, v2

    if-eqz v1, :cond_7

    const/16 v1, 0x1e

    sput v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v1, "\u06e3\u06df\u06e8"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_7
    const-string v0, "SPL46Gx4nzpbM9gmH14YLm0"

    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۟ۥۤ۟ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v1

    if-ltz v1, :cond_4

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    goto :goto_2

    :cond_4
    const-string v1, "\u06e2\u06e4\u06e2"

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    iput-object p5, p0, Lis;->e:Ljava/lang/String;

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v1

    if-gtz v1, :cond_5

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    const-string v1, "\u06e2\u06e7\u06e2"

    invoke-static {v1}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    rem-int/2addr v1, v2

    const v2, 0x1abc18

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_9
    iput-object p1, p0, Lis;->a:Ljava/lang/ClassLoader;

    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v1, :cond_6

    const-string v1, "\u06e2\u06e4\u06e2"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e3\u06df\u06e8"

    goto :goto_3

    :sswitch_a
    iput-object p2, p0, Lis;->b:Lp00;

    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/lit16 v2, v2, -0xcb0

    or-int/2addr v1, v2

    if-ltz v1, :cond_8

    :cond_7
    const-string v1, "\u06e0\u06e1\u06e6"

    goto :goto_3

    :cond_8
    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    rem-int/2addr v1, v2

    const v2, -0x1aabda

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aab05 -> :sswitch_0
        0x1aab5b -> :sswitch_5
        0x1aaf01 -> :sswitch_9
        0x1ab2e0 -> :sswitch_6
        0x1ab33d -> :sswitch_3
        0x1ab60c -> :sswitch_a
        0x1ab627 -> :sswitch_8
        0x1ab62a -> :sswitch_7
        0x1ab667 -> :sswitch_2
        0x1abade -> :sswitch_4
        0x1ac9e0 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 24

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/16 v20, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    const-string v16, "\u06e3\u06e6\u06e6"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v16, v3

    move-object/from16 v17, v6

    :goto_0
    sparse-switch v21, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-nez v10, :cond_11

    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v6, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    mul-int/2addr v3, v6

    const v6, 0x1e7d04    # 2.799912E-39f

    add-int/2addr v3, v6

    move/from16 v21, v3

    goto :goto_0

    :sswitch_1
    const-string v3, "\u06e2\u06e7\u06e1"

    move-object v6, v3

    move v11, v12

    :goto_1
    invoke-static {v6}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v21, v3

    goto :goto_0

    :cond_0
    :sswitch_2
    sget v3, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v3, :cond_1

    const-string v3, "\u06e2\u06e8\u06e7"

    move-object v6, v13

    :goto_2
    invoke-static {v3}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v13, v6

    move/from16 v21, v3

    goto :goto_0

    :cond_1
    const-string v3, "\u06e5\u06e3\u06e8"

    :goto_3
    invoke-static {v3}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v21, v3

    goto :goto_0

    :sswitch_3
    move-object/from16 v0, p0

    iget-object v3, v0, Lis;->a:Ljava/lang/ClassLoader;

    move-object/from16 v0, p0

    iget-object v8, v0, Lis;->e:Ljava/lang/String;

    sget v6, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v16, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    rem-int v6, v6, v16

    const v16, -0x1ab0e0

    xor-int v6, v6, v16

    move-object/from16 v16, v3

    move/from16 v21, v6

    goto :goto_0

    :sswitch_4
    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v6, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    mul-int/lit16 v6, v6, -0x94f

    mul-int/2addr v3, v6

    if-gtz v3, :cond_3

    move-object v3, v14

    move v11, v15

    :cond_2
    const-string v6, "\u06e4\u06df\u06e0"

    invoke-static {v6}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v6

    move-object v14, v3

    move/from16 v21, v6

    goto :goto_0

    :cond_3
    sget v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v6, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/2addr v3, v6

    const v6, 0xda0a

    add-int/2addr v3, v6

    move/from16 v21, v3

    move v11, v15

    goto :goto_0

    :sswitch_5
    :try_start_0
    array-length v3, v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    const-string v3, "\u06e1\u06e3\u06e1"

    move-object v6, v9

    :goto_4
    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v9, v6

    move/from16 v21, v3

    goto :goto_0

    :sswitch_6
    const-string v3, "\u06e8\u06e1"

    move-object v6, v3

    goto :goto_1

    :sswitch_7
    const/4 v12, 0x1

    sget v3, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    add-int/lit16 v6, v6, 0x22d2

    xor-int/2addr v3, v6

    if-ltz v3, :cond_5

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    :cond_4
    const-string v3, "\u06e8\u06e1"

    :goto_5
    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v21, v3

    goto/16 :goto_0

    :cond_5
    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sub-int/2addr v3, v6

    const v6, 0x1aadc9

    add-int/2addr v3, v6

    move/from16 v21, v3

    goto/16 :goto_0

    :sswitch_8
    :try_start_1
    sget-object v3, Lub0;->m:Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-static {v3, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v10

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v3

    if-gtz v3, :cond_6

    const/16 v3, 0x54

    sput v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    const-string v3, "\u06e3\u06e7\u06e4"

    invoke-static {v3}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v21, v3

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06df\u06e1"

    move-object v6, v9

    goto :goto_4

    :sswitch_9
    if-eqz v18, :cond_d

    :try_start_2
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v15

    sget v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    rem-int/2addr v3, v6

    const v6, 0x1ab28a

    add-int/2addr v3, v6

    move/from16 v21, v3

    goto/16 :goto_0

    :sswitch_a
    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    rem-int/lit16 v6, v6, 0x17fc

    sub-int/2addr v3, v6

    if-gtz v3, :cond_7

    const/16 v3, 0x4c

    sput v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v3, "\u06e6\u06e4\u06e5"

    invoke-static {v3}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v21, v3

    goto/16 :goto_0

    :cond_7
    sget v3, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v6, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    xor-int/2addr v3, v6

    const v6, 0x1aaf1c

    add-int/2addr v3, v6

    move/from16 v21, v3

    goto/16 :goto_0

    :sswitch_b
    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    rem-int/lit16 v6, v6, -0xc17

    div-int/2addr v3, v6

    if-ltz v3, :cond_8

    const-string v3, "\u06e1\u06e1\u06e8"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v21, v3

    goto/16 :goto_0

    :cond_8
    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v6, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    mul-int/2addr v3, v6

    const v6, 0x1ac3da

    add-int/2addr v3, v6

    move/from16 v21, v3

    goto/16 :goto_0

    :sswitch_c
    sget v3, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/lit16 v6, v6, -0x24a7

    xor-int/2addr v3, v6

    if-gtz v3, :cond_9

    const/16 v3, 0x3b

    sput v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v3, "\u06e3\u06e1\u06e3"

    move-object v6, v3

    goto/16 :goto_1

    :cond_9
    const-string v3, "\u06e3\u06e6\u06e6"

    move-object v6, v3

    goto/16 :goto_1

    :sswitch_d
    if-eqz v13, :cond_d

    :try_start_3
    invoke-virtual {v13}, Ld4;->t()Ljava/util/List;

    move-result-object v3

    check-cast v3, Llt;

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Llt;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget v6, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v6, :cond_a

    const/16 v6, 0x18

    sput v6, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    const-string v6, "\u06e6\u06e1\u06e7"

    invoke-static {v6}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v17, v3

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_a
    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v17, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sub-int v6, v6, v17

    const v17, 0x1ac8ef

    add-int v6, v6, v17

    move-object/from16 v17, v3

    move/from16 v21, v6

    goto/16 :goto_0

    :sswitch_e
    :try_start_4
    const-string v3, "IvqcDpHEDL435rVJyI9Q1A==\n"

    const-string v6, "VpXQYeahfv0=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v9}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, v20

    invoke-static {v0, v9}, Lp00;->a(Lp00;Ljava/lang/String;)Ld4;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v6

    const-string v3, "\u06df\u06e0\u06e7"

    goto/16 :goto_2

    :sswitch_f
    const/4 v3, 0x0

    :try_start_5
    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-static {v0, v1, v3}, Lls;->e(Ljava/lang/ClassLoader;Ljava/lang/Object;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v3

    if-ltz v3, :cond_4

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v3, "\u06e2\u06e5\u06e0"

    move-object v6, v3

    :goto_6
    invoke-static {v6}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v21, v3

    goto/16 :goto_0

    :sswitch_10
    if-eqz v17, :cond_d

    :try_start_6
    invoke-static/range {v17 .. v17}, Li50;->O(Ljava/lang/String;)Ljava/lang/Integer;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v3

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v18, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int v6, v6, v18

    const v18, 0x1abbe4

    add-int v6, v6, v18

    move-object/from16 v18, v3

    move/from16 v21, v6

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v0, p0

    iget-object v3, v0, Lis;->c:Lp00;

    iget-object v3, v3, Lp00;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v5

    if-ltz v5, :cond_b

    const-string v5, "\u06e1\u06e5\u06e2"

    invoke-static {v5}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v6

    move-object v5, v3

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06e7\u06e6\u06e6"

    move-object v5, v3

    goto :goto_6

    :sswitch_12
    const-string v3, "\u06e1\u06e5\u06e2"

    move-object v6, v9

    move v11, v12

    goto/16 :goto_4

    :catchall_0
    move-exception v3

    const-string v3, "06ke\n"

    const-string v6, "p8h5VTpLcuY=\n"

    const-string v21, "N6rqmfV51s0eptuX71HQ1R4=\n"

    const-string v22, "e9+J8ow0uaM=\n"

    invoke-static/range {v21 .. v22}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    const-string v22, "tw==\n"

    const-string v23, "0vI8ySRxU5w=\n"

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v3, v6, v0, v1, v2}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v3

    if-ltz v3, :cond_f

    const-string v3, "2mv46YUKeAmGXoLNHG"

    invoke-static {v3}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۟ۥۤ۟ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v6, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v3, "\u06df\u06e6\u06df"

    move-object v6, v3

    goto :goto_6

    :sswitch_13
    :try_start_7
    invoke-static/range {v19 .. v19}, Lmp;->d(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v6, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    div-int/2addr v3, v6

    const v6, 0x1ac603

    add-int/2addr v3, v6

    move/from16 v21, v3

    goto/16 :goto_0

    :sswitch_14
    sget-object v3, Lls;->a:Lls;

    move-object/from16 v0, p0

    iget-object v3, v0, Lis;->b:Lp00;

    iget-object v3, v3, Lp00;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v6, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    or-int/lit16 v6, v6, 0x1fe6

    rem-int/2addr v4, v6

    if-ltz v4, :cond_c

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v4, "\u06df\u06e6\u06df"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v6

    move-object v4, v3

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06e5\u06e0\u06e1"

    move-object v4, v3

    :goto_7
    invoke-static {v6}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v21, v3

    goto/16 :goto_0

    :sswitch_15
    :try_start_8
    new-instance v3, Lp00;

    const-string v6, "H02vKQ0THphaYqx2XQ==\n"

    const-string v21, "cj7IXXRje6U=\n"

    move-object/from16 v0, v21

    invoke-static {v6, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Lp00;-><init>(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    sget v6, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v20, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int v6, v6, v20

    const v20, 0x1ac0de

    add-int v6, v6, v20

    move-object/from16 v20, v3

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_d
    :sswitch_16
    const-string v3, "\u06e7\u06e8"

    move-object v6, v3

    goto/16 :goto_1

    :sswitch_17
    :try_start_9
    array-length v3, v14

    invoke-static {v14, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10, v3}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-result-object v3

    sget v6, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v19, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    move/from16 v0, v19

    div-int/lit16 v0, v0, -0x1210

    move/from16 v19, v0

    mul-int v6, v6, v19

    if-eqz v6, :cond_e

    const/16 v6, 0x5c

    sput v6, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v6, "\u06e7\u06e6\u06e6"

    invoke-static {v6}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v19, v3

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_e
    sget v6, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v19, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    rem-int v6, v6, v19

    const v19, 0x1aba4e

    add-int v6, v6, v19

    move-object/from16 v19, v3

    move/from16 v21, v6

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v0, p0

    iget-object v3, v0, Lis;->d:Lp00;

    iget-object v3, v3, Lp00;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    const-string v6, "\u06e6\u06e1\u06e7"

    move-object v7, v3

    goto/16 :goto_1

    :sswitch_19
    :try_start_a
    sget-object v3, Lub0;->W0:Lrb;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual/range {v3 .. v8}, Lrb;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    sget v6, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v14, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    rem-int/lit16 v14, v14, 0x23b4

    div-int/2addr v6, v14

    if-eqz v6, :cond_2

    const/16 v6, 0x2a

    sput v6, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v6, "\u06e7\u06e8"

    move-object v14, v3

    goto/16 :goto_7

    :sswitch_1a
    sget v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v6, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    or-int/2addr v3, v6

    const v6, 0x1aafa0

    add-int/2addr v3, v6

    move/from16 v21, v3

    move v11, v12

    goto/16 :goto_0

    :cond_f
    :sswitch_1b
    sget v3, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v6, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/2addr v3, v6

    const v6, 0x1aab50

    add-int/2addr v3, v6

    move/from16 v21, v3

    goto/16 :goto_0

    :sswitch_1c
    :try_start_b
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-result-object v6

    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v9, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int/lit16 v9, v9, -0x950

    div-int/2addr v3, v9

    if-eqz v3, :cond_10

    const/16 v3, 0x45

    sput v3, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v3, "\u06df\u06e8\u06e3"

    goto/16 :goto_4

    :cond_10
    const-string v3, "\u06e0\u06df\u06df"

    move-object v9, v6

    goto/16 :goto_5

    :cond_11
    :sswitch_1d
    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v3, :cond_12

    const/16 v3, 0x27

    sput v3, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v3, "\u06e5\u06e7\u06e2"

    goto/16 :goto_3

    :cond_12
    sget v3, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v6, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    add-int/2addr v3, v6

    const v6, 0x1ab7e0

    add-int/2addr v3, v6

    move/from16 v21, v3

    goto/16 :goto_0

    :sswitch_1e
    sget v3, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v3, :cond_13

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v3, "\u06e5\u06e0\u06e1"

    invoke-static {v3}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v21, v3

    goto/16 :goto_0

    :cond_13
    sget v3, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sub-int/2addr v3, v6

    const v6, 0x1ac17b

    add-int/2addr v3, v6

    move/from16 v21, v3

    goto/16 :goto_0

    :sswitch_1f
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdce1 -> :sswitch_19
        0xdcf9 -> :sswitch_1f
        0x1aa726 -> :sswitch_7
        0x1aa742 -> :sswitch_6
        0x1aa7a2 -> :sswitch_b
        0x1aa7d8 -> :sswitch_1b
        0x1aa81a -> :sswitch_1a
        0x1aa81d -> :sswitch_1f
        0x1aaac0 -> :sswitch_e
        0x1aaeff -> :sswitch_1f
        0x1aaf3e -> :sswitch_9
        0x1aaf5e -> :sswitch_d
        0x1ab2fc -> :sswitch_14
        0x1ab2fd -> :sswitch_1d
        0x1ab303 -> :sswitch_4
        0x1ab33c -> :sswitch_10
        0x1ab604 -> :sswitch_a
        0x1ab6c0 -> :sswitch_2
        0x1ab6e3 -> :sswitch_3
        0x1ab700 -> :sswitch_12
        0x1ab9c5 -> :sswitch_5
        0x1ab9e3 -> :sswitch_15
        0x1aba65 -> :sswitch_13
        0x1abda6 -> :sswitch_11
        0x1abe08 -> :sswitch_a
        0x1abe0a -> :sswitch_17
        0x1ac18c -> :sswitch_8
        0x1ac1c7 -> :sswitch_16
        0x1ac206 -> :sswitch_c
        0x1ac244 -> :sswitch_1c
        0x1ac52e -> :sswitch_1e
        0x1ac5e7 -> :sswitch_18
        0x1ac602 -> :sswitch_f
        0x1ac608 -> :sswitch_1
    .end sparse-switch
.end method

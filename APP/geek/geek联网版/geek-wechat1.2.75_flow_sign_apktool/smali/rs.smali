.class public final synthetic Lrs;
.super Ljava/lang/Object;

# interfaces
.implements Ljm;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Application;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Application;I)V
    .locals 3

    iput p2, p0, Lrs;->a:I

    iput-object p1, p0, Lrs;->b:Landroid/app/Application;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e4\u06e1"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v1

    if-gtz v1, :cond_1

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    if-gtz v1, :cond_0

    const-string v1, "\u06e8\u06e5"

    invoke-static {v1}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sub-int/2addr v1, v2

    const v2, 0x1ab3c4

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    if-ltz v1, :cond_2

    const/16 v1, 0x5d

    sput v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v1, "\u06e5\u06df\u06e7"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e8\u06e5"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v1, :cond_3

    const/16 v1, 0x21

    sput v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v1, "\u06e6\u06e1\u06e8"

    invoke-static {v1}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e8\u06e5"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    const-string v0, "M3DaV8b"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v1

    if-gtz v1, :cond_4

    const-string v1, "\u06e2\u06e1\u06e6"

    goto :goto_2

    :cond_4
    sget v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    rem-int/2addr v1, v2

    const v2, 0x1ac993

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/lit16 v2, v2, 0x1b7f

    xor-int/2addr v1, v2

    if-ltz v1, :cond_5

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v1, "\u06e7\u06df\u06e8"

    goto :goto_1

    :cond_5
    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    div-int/2addr v1, v2

    const v2, 0x1ac965

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdcfd -> :sswitch_0
        0x1ab287 -> :sswitch_2
        0x1ab607 -> :sswitch_4
        0x1ac18d -> :sswitch_5
        0x1ac965 -> :sswitch_1
        0x1ac967 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 23

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    const-string v17, "\u06e3\u06e4\u06e2"

    invoke-static/range {v17 .. v17}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v17, v4

    move-object/from16 v18, v6

    :goto_0
    sparse-switch v20, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    :try_start_0
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    xor-int/lit16 v4, v4, -0x1fa

    aput-object v5, v9, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/lit16 v6, v6, -0x1083

    or-int/2addr v4, v6

    if-ltz v4, :cond_10

    const-string v4, "\u06e7\u06e1\u06e3"

    move-object v6, v12

    :goto_1
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v12, v6

    move/from16 v20, v4

    goto :goto_0

    :sswitch_1
    :try_start_1
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v6

    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v7, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/lit16 v7, v7, -0x24bb

    rem-int/2addr v4, v7

    if-ltz v4, :cond_0

    :goto_2
    const-string v4, "\u06df\u06e7\u06e0"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object v7, v6

    move/from16 v20, v4

    goto :goto_0

    :cond_0
    const-string v4, "\u06e4\u06e7\u06df"

    :goto_3
    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object v7, v6

    move/from16 v20, v4

    goto :goto_0

    :sswitch_2
    const-string v4, "\u06e7\u06e1\u06e3"

    :goto_4
    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto :goto_0

    :sswitch_3
    :try_start_2
    move-object/from16 v0, v16

    invoke-static {v12, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v6, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    rem-int/2addr v4, v6

    const v6, 0x1abb81

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto :goto_0

    :sswitch_4
    if-nez v11, :cond_5

    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v6, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    rem-int/lit16 v6, v6, 0x586

    mul-int/2addr v4, v6

    if-gtz v4, :cond_1

    const/16 v4, 0x2c

    sput v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    :goto_5
    const-string v4, "\u06e5\u06e0\u06e2"

    :goto_6
    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto :goto_0

    :cond_1
    const-string v4, "\u06e4\u06e5\u06e4"

    :goto_7
    invoke-static {v4}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto :goto_0

    :cond_2
    :sswitch_5
    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v6, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    mul-int/lit16 v6, v6, 0xb67

    xor-int/2addr v4, v6

    if-gtz v4, :cond_3

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v4, "\u06e2\u06e7\u06e3"

    :goto_8
    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e1\u06df\u06e7"

    goto :goto_8

    :sswitch_6
    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v4

    if-gtz v4, :cond_4

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v4, "\u06e3\u06e6\u06e4"

    :goto_9
    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e3\u06e4\u06e2"

    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_7
    const/4 v8, 0x0

    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v6, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    mul-int/lit16 v6, v6, -0x1fec

    or-int/2addr v4, v6

    if-gtz v4, :cond_23

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v4, "\u06e4\u06e5\u06e4"

    move-object v6, v7

    goto/16 :goto_3

    :cond_5
    :sswitch_8
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v6, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/2addr v4, v6

    const v6, -0x1abc21

    xor-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :catchall_0
    move-exception v4

    const-string v4, "06ke\n"

    const-string v6, "p8h5VTpLcuY=\n"

    const-string v20, "cyqUtuGJPNBUPY6M65IS\n"

    const-string v21, "IE/3xIT9eb4=\n"

    invoke-static/range {v20 .. v21}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    const-string v21, "tw==\n"

    const-string v22, "0vI8ySRxU5w=\n"

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    invoke-static {v4, v6, v0, v1, v2}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "\u06e6\u06e5\u06e3"

    :goto_a
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_9
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v6, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    mul-int/lit16 v6, v6, 0xc59

    add-int/2addr v4, v6

    if-gtz v4, :cond_6

    const/16 v4, 0x31

    sput v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v4, "\u06e5\u06e2\u06e6"

    :goto_b
    invoke-static {v4}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e4\u06e2\u06e7"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_a
    :try_start_3
    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v6, 0x1

    if-ne v4, v6, :cond_2

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v6, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/lit16 v6, v6, -0x7fc

    rem-int/2addr v4, v6

    if-gtz v4, :cond_8

    const/16 v4, 0x12

    sput v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    move-object v4, v9

    :cond_7
    const-string v6, "\u06e8\u06e8"

    move-object v9, v4

    :goto_c
    invoke-static {v6}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_8
    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v6, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    or-int/2addr v4, v6

    const v6, 0x1ac687

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_b
    :try_start_4
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    xor-int/lit16 v4, v4, 0x14d

    const-class v6, Ljava/lang/CharSequence;

    aput-object v6, v9, v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v6, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    or-int/lit16 v6, v6, -0xc45

    mul-int/2addr v4, v6

    if-gtz v4, :cond_9

    const/16 v4, 0x4a

    sput v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    const-string v4, "\u06e1\u06e5\u06e0"

    invoke-static {v4}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_9
    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    xor-int/2addr v4, v6

    const v6, 0xdfa1

    xor-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, p0

    iget v4, v0, Lrs;->a:I

    packed-switch v4, :pswitch_data_0

    :sswitch_d
    const-string v4, "\u06e2\u06e4\u06e7"

    goto/16 :goto_9

    :sswitch_e
    if-eqz v12, :cond_20

    :try_start_5
    new-instance v6, Lv9;

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    xor-int/lit16 v4, v4, -0x306

    invoke-direct {v6, v4}, Lv9;-><init>(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v4

    if-ltz v4, :cond_a

    const-string v4, "\u06e5\u06e7\u06df"

    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v16, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e1\u06e6\u06e8"

    :goto_d
    invoke-static {v4}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v16, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :pswitch_0
    :sswitch_f
    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v6, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/lit8 v6, v6, -0x77

    xor-int/2addr v4, v6

    if-gtz v4, :cond_b

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    const-string v4, "\u06e8\u06e6\u06e7"

    invoke-static {v4}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e6\u06e5"

    goto/16 :goto_b

    :sswitch_10
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v4, :cond_c

    const-string v4, "\u06e1\u06e8\u06e3"

    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_c
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v6, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    div-int/2addr v4, v6

    const v6, 0x1aa6ff

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_11
    const/4 v15, 0x0

    const-string v4, "\u06e3\u06e7\u06e7"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_12
    :try_start_6
    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    xor-int/lit8 v4, v4, 0x5e

    aput-object v5, v9, v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v4

    if-ltz v4, :cond_e

    const/16 v4, 0x3f

    sput v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    move-object v4, v11

    :cond_d
    const-string v6, "\u06e0\u06e5\u06e8"

    invoke-static {v6}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v6

    move-object v11, v4

    move/from16 v20, v6

    goto/16 :goto_0

    :cond_e
    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v6, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v4, v6

    const v6, 0x1abe6e

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_13
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v4, :cond_f

    const/16 v4, 0x1f

    sput v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v4, "\u06e3\u06e0\u06e5"

    :goto_e
    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_f
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v6, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/2addr v4, v6

    const v6, -0x1aa5a7

    xor-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_10
    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v6, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int/2addr v4, v6

    const v6, -0x1ab622

    xor-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_14
    :try_start_7
    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/lit16 v4, v4, 0x386

    aput-object v5, v9, v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v4, "\u06e5\u06e2\u06e5"

    invoke-static {v4}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_15
    const-string v4, "\u06e2\u06e2\u06e0"

    goto/16 :goto_9

    :sswitch_16
    :try_start_8
    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/lit16 v4, v4, -0x169

    aput-object v3, v9, v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    const-string v4, "\u06e3\u06e7\u06df"

    :goto_f
    invoke-static {v4}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_17
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v6, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int/lit16 v6, v6, 0xbff

    div-int/2addr v4, v6

    if-eqz v4, :cond_11

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    const-string v4, "\u06e3\u06e4\u06e2"

    invoke-static {v4}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_11
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v6, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    rem-int/2addr v4, v6

    const v6, 0x1ab343

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_18
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    div-int/lit16 v6, v6, 0x1817

    mul-int/2addr v4, v6

    if-eqz v4, :cond_12

    const/16 v4, 0x35

    sput v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    const-string v4, "\u06e6\u06e5\u06e0"

    goto :goto_f

    :cond_12
    const-string v4, "\u06e8\u06e3\u06e3"

    goto/16 :goto_6

    :sswitch_19
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v6, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/lit16 v6, v6, 0x19bf

    xor-int/2addr v4, v6

    if-gtz v4, :cond_13

    const-string v4, "\u06e8\u06e5\u06e1"

    :goto_10
    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_13
    const-string v4, "\u06e4\u06e3\u06e8"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :catchall_1
    move-exception v4

    const-string v4, "06ke\n"

    const-string v6, "p8h5VTpLcuY=\n"

    const-string v20, "PLQNG9IGL8YImQwB/DcS2hil\n"

    const-string v21, "cdFjbpdoW7Q=\n"

    invoke-static/range {v20 .. v21}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    const-string v21, "tw==\n"

    const-string v22, "0vI8ySRxU5w=\n"

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    invoke-static {v4, v6, v0, v1, v2}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v4

    if-ltz v4, :cond_14

    const-string v4, "\u06e4\u06e2\u06e7"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_14
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v6, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    rem-int/2addr v4, v6

    const v6, -0x1acacf

    xor-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_1a
    :try_start_9
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v4, Lv9;

    sget v20, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x1f8

    move/from16 v20, v0

    move/from16 v0, v20

    invoke-direct {v4, v0}, Lv9;-><init>(I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v3, :cond_15

    const/16 v3, 0x47

    sput v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    const-string v3, "\u06e4\u06e3\u06e8"

    invoke-static {v3}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v20

    move-object v3, v4

    move-object v5, v6

    goto/16 :goto_0

    :cond_15
    move-object v3, v4

    move-object v5, v6

    goto/16 :goto_5

    :sswitch_1b
    :try_start_a
    const-string v4, "oScmfWinqVC0JzZ0aLCtXqIxehcj6uw=\n"

    const-string v6, "xkJSOQ3ExTE=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v4, v7
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    sget v6, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v6, :cond_16

    const-string v6, "\u06df\u06e5\u06e4"

    invoke-static {v6}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v6

    move v13, v4

    move/from16 v20, v6

    goto/16 :goto_0

    :cond_16
    move v6, v4

    :goto_11
    const-string v4, "\u06e2\u06e6\u06e0"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v4

    move v13, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_1c
    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    if-gtz v4, :cond_17

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v4, "\u06e7\u06e4\u06e1"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_17
    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v6, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    div-int/2addr v4, v6

    const v6, 0x1abde7

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_1d
    :try_start_b
    const-string v4, "l3e+fnefNZuRdqd+bpd1jZ02sTFwn3W1uVS6I3eqNIiBaIQ5bZ40jw==\n"

    const-string v6, "9BjTUAP6W/g=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v17

    invoke-static {v4, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    move-result-object v4

    sget v6, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v11, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    rem-int/lit16 v11, v11, -0x1617

    rem-int/2addr v6, v11

    if-ltz v6, :cond_d

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-object v11, v4

    move v6, v13

    goto :goto_11

    :sswitch_1e
    move-object/from16 v0, p0

    iget-object v4, v0, Lrs;->b:Landroid/app/Application;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    const-string v6, "FyQK/UFAf5A8Lh/aSFMkzV5vVw==\n"

    const-string v20, "cEF+vi0hDOM=\n"

    move-object/from16 v0, v20

    invoke-static {v6, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "\u06e3\u06e5\u06df"

    goto/16 :goto_e

    :sswitch_1f
    :try_start_c
    const-class v4, Landroid/widget/TextView;

    move-object/from16 v0, v18

    invoke-static {v4, v0, v9}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v6, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/lit16 v6, v6, 0x1a2f

    mul-int/2addr v4, v6

    if-gtz v4, :cond_18

    const-string v4, "\u06e5\u06e6\u06e2"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_18
    const-string v4, "\u06e7\u06e1\u06e3"

    goto/16 :goto_10

    :sswitch_20
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v6, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    div-int/lit16 v6, v6, 0xe21

    xor-int/2addr v4, v6

    if-ltz v4, :cond_19

    const/4 v4, 0x4

    sput v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v4, "\u06e3\u06e7\u06e1"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    move v14, v10

    goto/16 :goto_0

    :cond_19
    move v4, v10

    :goto_12
    const-string v6, "\u06e8\u06e5\u06e3"

    invoke-static {v6}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v20, v6

    move v14, v4

    goto/16 :goto_0

    :sswitch_21
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v6, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    div-int/lit16 v6, v6, 0x1392

    xor-int/2addr v4, v6

    if-ltz v4, :cond_1a

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    move v4, v14

    goto :goto_12

    :cond_1a
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    div-int/2addr v4, v6

    const v6, 0x1aa71d

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_22
    sget-object v3, Lxh;->n:Lxh;

    :goto_13
    return-object v3

    :sswitch_23
    :try_start_d
    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    xor-int/lit8 v4, v4, 0x0

    add-int v10, v14, v4

    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v6, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/lit16 v6, v6, 0x1cc6

    add-int/2addr v4, v6

    if-gtz v4, :cond_1b

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    :goto_14
    const-string v4, "\u06e2\u06e2\u06e0"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_1b
    const-string v4, "\u06e5\u06e7\u06e4"

    move-object v6, v4

    goto/16 :goto_c

    :sswitch_24
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v6, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/lit16 v6, v6, -0x2274

    add-int/2addr v4, v6

    if-ltz v4, :cond_1c

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v4, "\u06e6\u06e5\u06e3"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    move v14, v15

    goto/16 :goto_0

    :cond_1c
    move v14, v15

    goto :goto_14

    :sswitch_25
    sget-object v3, Lxh;->n:Lxh;

    goto :goto_13

    :sswitch_26
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v4, :cond_1d

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v4, "\u06e4\u06e4\u06e7"

    move-object/from16 v6, v16

    goto/16 :goto_d

    :cond_1d
    const-string v4, "\u06e4\u06e3\u06e5"

    goto/16 :goto_b

    :sswitch_27
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v4, :cond_1e

    const/16 v4, 0x5a

    sput v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    const-string v4, "\u06e2\u06e3\u06e7"

    goto/16 :goto_a

    :cond_1e
    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    or-int/2addr v4, v6

    const v6, 0x1ac1e4

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_28
    :try_start_e
    const-string v4, "acoqCBEJgtJnyhkIDQ==\n"

    const-string v6, "BqR+bWl9wbo=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    move-result-object v4

    sget v6, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v18, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    move/from16 v0, v18

    or-int/lit16 v0, v0, -0x682

    move/from16 v18, v0

    div-int v6, v6, v18

    if-ltz v6, :cond_1f

    const/16 v6, 0xe

    sput v6, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v6, "\u06e5\u06e3\u06e3"

    invoke-static {v6}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v18, v4

    move/from16 v20, v6

    goto/16 :goto_0

    :cond_1f
    sget v6, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v18, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    or-int v6, v6, v18

    const v18, 0x1aa7dc

    add-int v6, v6, v18

    move-object/from16 v18, v4

    move/from16 v20, v6

    goto/16 :goto_0

    :sswitch_29
    const-string v4, "\u06e5\u06e2\u06e2"

    move-object v6, v8

    goto/16 :goto_1

    :cond_20
    :sswitch_2a
    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/lit16 v6, v6, 0x1ba1

    mul-int/2addr v4, v6

    if-ltz v4, :cond_21

    const/16 v4, 0xf

    sput v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v4, "\u06e0\u06e1\u06df"

    goto/16 :goto_7

    :cond_21
    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v6, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/2addr v4, v6

    const v6, 0x1ac201

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_2b
    if-ge v14, v13, :cond_25

    :try_start_f
    aget-object v19, v7, v14
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v6, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    or-int/2addr v4, v6

    const v6, 0x1ac15e

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_2c
    move-object/from16 v0, p0

    iget-object v4, v0, Lrs;->b:Landroid/app/Application;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    const-string v6, "tw1yJNNoBY6cB2cD2nte0/5GLw==\n"

    const-string v17, "0GgGZ78Jdv0=\n"

    move-object/from16 v0, v17

    invoke-static {v6, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v6, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v17, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    move/from16 v0, v17

    rem-int/lit16 v0, v0, 0x1ff6

    move/from16 v17, v0

    sub-int v6, v6, v17

    if-gtz v6, :cond_22

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    const-string v6, "\u06e1\u06df\u06e7"

    invoke-static {v6}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v17, v4

    move/from16 v20, v6

    goto/16 :goto_0

    :cond_22
    sget v6, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v17, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int v6, v6, v17

    const v17, 0x1acd27

    add-int v6, v6, v17

    move-object/from16 v17, v4

    move/from16 v20, v6

    goto/16 :goto_0

    :sswitch_2d
    const/4 v4, 0x5

    :try_start_10
    new-array v4, v4, [Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    if-gtz v6, :cond_7

    const/16 v6, 0x59

    sput v6, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    move-object v9, v4

    :cond_23
    const-string v4, "\u06e2\u06e0\u06e8"

    invoke-static {v4}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_2e
    :try_start_11
    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    const/4 v6, 0x0

    aget-object v4, v4, v6

    const-class v6, Landroid/widget/ListAdapter;

    invoke-static {v4, v6}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    move-result v4

    if-eqz v4, :cond_2

    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    div-int/lit16 v6, v6, -0x47d

    xor-int/2addr v4, v6

    if-gtz v4, :cond_24

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v4, "\u06e4\u06e3\u06e5"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v12, v19

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_24
    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    div-int/2addr v4, v6

    const v6, 0x1aaac2

    add-int/2addr v4, v6

    move-object/from16 v12, v19

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_25
    :sswitch_2f
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    div-int/lit16 v6, v6, -0x1f50

    xor-int/2addr v4, v6

    if-gtz v4, :cond_26

    const/16 v4, 0x41

    sput v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    const-string v4, "\u06e1\u06e5\u06e8"

    goto/16 :goto_4

    :cond_26
    const-string v4, "\u06e6\u06e6"

    goto/16 :goto_4

    :sswitch_30
    const-string v4, "vBrTtXMA\n"

    const-string v6, "0HWy0RZyOCI=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v6, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int/lit16 v6, v6, 0x23e6

    or-int/2addr v4, v6

    if-gtz v4, :cond_27

    const-string v4, "\u06e5\u06e8\u06e4"

    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_27
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v6, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sub-int/2addr v4, v6

    const v6, 0x1abd5f

    add-int/2addr v4, v6

    move/from16 v20, v4

    goto/16 :goto_0

    :sswitch_31
    const-string v4, "lkprkUrP\n"

    const-string v6, "+iUK9S+9u8c=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-object v6, v7

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc3f -> :sswitch_0
        0xdc81 -> :sswitch_15
        0xdcbf -> :sswitch_1e
        0xdcc0 -> :sswitch_7
        0xdd00 -> :sswitch_b
        0x1aa6ff -> :sswitch_1c
        0x1aa71e -> :sswitch_26
        0x1aa7a0 -> :sswitch_27
        0x1aa7be -> :sswitch_d
        0x1aa7d8 -> :sswitch_1a
        0x1aa7f8 -> :sswitch_1d
        0x1aaac0 -> :sswitch_10
        0x1aab83 -> :sswitch_4
        0x1aae87 -> :sswitch_13
        0x1aae89 -> :sswitch_23
        0x1aaf3c -> :sswitch_f
        0x1aaf63 -> :sswitch_3
        0x1aaf79 -> :sswitch_1c
        0x1aaf9c -> :sswitch_5
        0x1ab26a -> :sswitch_29
        0x1ab2a0 -> :sswitch_2b
        0x1ab2e5 -> :sswitch_2c
        0x1ab303 -> :sswitch_15
        0x1ab31c -> :sswitch_11
        0x1ab31d -> :sswitch_2
        0x1ab6a1 -> :sswitch_c
        0x1ab6bd -> :sswitch_30
        0x1ab6fb -> :sswitch_1f
        0x1ab6fd -> :sswitch_14
        0x1ab703 -> :sswitch_24
        0x1aba29 -> :sswitch_19
        0x1aba46 -> :sswitch_25
        0x1aba49 -> :sswitch_2a
        0x1aba83 -> :sswitch_18
        0x1ababc -> :sswitch_1b
        0x1abd86 -> :sswitch_2f
        0x1abda7 -> :sswitch_2d
        0x1abde5 -> :sswitch_e
        0x1abde8 -> :sswitch_12
        0x1abe05 -> :sswitch_16
        0x1abe61 -> :sswitch_28
        0x1abe7d -> :sswitch_1
        0x1abe82 -> :sswitch_20
        0x1abea1 -> :sswitch_6
        0x1ac201 -> :sswitch_22
        0x1ac204 -> :sswitch_26
        0x1ac50a -> :sswitch_a
        0x1ac549 -> :sswitch_21
        0x1ac61e -> :sswitch_2e
        0x1ac8f0 -> :sswitch_8
        0x1ac948 -> :sswitch_2a
        0x1ac949 -> :sswitch_31
        0x1ac984 -> :sswitch_9
        0x1ac986 -> :sswitch_17
        0x1ac9c2 -> :sswitch_2a
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

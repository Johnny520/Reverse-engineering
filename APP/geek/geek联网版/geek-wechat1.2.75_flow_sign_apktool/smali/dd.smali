.class public final synthetic Ldd;
.super Ljava/lang/Object;

# interfaces
.implements Lum;


# instance fields
.field public final a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 3

    iput p1, p0, Ldd;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e1\u06e7"

    invoke-static {v1}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v0

    if-ltz v0, :cond_3

    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac998

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "4Akda"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۢۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/lit16 v2, v2, 0x1fa4

    rem-int/2addr v1, v2

    if-gtz v1, :cond_0

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v1, "\u06e1\u06e6\u06df"

    invoke-static {v1}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    mul-int/2addr v1, v2

    const v2, 0x240a7d

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v0, "\u06e7\u06df"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sub-int/2addr v0, v2

    const v2, 0x1aae78

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v0

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v0, "\u06e6\u06e8\u06e3"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e1\u06e6\u06df"

    :goto_1
    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    :sswitch_4
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    move-result v0

    if-gtz v0, :cond_4

    const/16 v0, 0x41

    sput v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v0, "\u06e2\u06e8\u06df"

    goto :goto_1

    :cond_4
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab022

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaec7 -> :sswitch_0
        0x1aaf5a -> :sswitch_5
        0x1ab9ca -> :sswitch_2
        0x1abac2 -> :sswitch_3
        0x1ac261 -> :sswitch_4
        0x1ac9c4 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/16 v18, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const-string v14, "\u06e2\u06e5\u06e2"

    invoke-static {v14}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v20

    move-object v14, v1

    move-object v15, v6

    move-object/from16 v16, v12

    :goto_0
    sparse-switch v20, :sswitch_data_0

    goto :goto_0

    :pswitch_0
    :sswitch_0
    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sub-int/2addr v1, v6

    const v6, 0x1abba5

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/lit16 v1, v1, 0x19e

    const-string v6, ""

    aput-object v6, v3, v1

    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/lit16 v1, v1, -0x3c3

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v1

    sget v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v6, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    mul-int/lit16 v6, v6, 0x1edf

    xor-int/2addr v1, v6

    if-ltz v1, :cond_0

    const-string v1, "\u06e7\u06e2\u06e2"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/2addr v1, v6

    const v6, 0x1aaf64

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto :goto_0

    :pswitch_1
    :sswitch_2
    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int/lit8 v6, v6, -0x55

    sub-int/2addr v1, v6

    if-ltz v1, :cond_1

    const-string v1, "\u06e6\u06e7\u06e2"

    invoke-static {v1}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto :goto_0

    :cond_1
    const-string v6, "\u06e7\u06e8\u06e7"

    move-object v1, v7

    :goto_1
    invoke-static {v6}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v6

    move-object v7, v1

    move/from16 v20, v6

    goto :goto_0

    :sswitch_3
    const/4 v1, 0x0

    new-array v8, v1, [Ljava/lang/Object;

    :goto_2
    :sswitch_4
    return-object v8

    :sswitch_5
    move-object v8, v7

    goto :goto_2

    :sswitch_6
    move-object/from16 v0, v17

    iget-object v8, v0, Led;->b:Ljava/lang/String;

    goto :goto_2

    :sswitch_7
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v6, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/lit16 v6, v6, -0x3c1

    aput-object v16, v1, v6

    sget v6, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    xor-int/lit16 v6, v6, 0x3a9

    aput-object v14, v1, v6

    const-string v6, "\u06e5\u06e0\u06e5"

    goto :goto_1

    :sswitch_8
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    const-string v6, "6LJvovOMszc=\n"

    const-string v12, "jtsDx73t3lI=\n"

    invoke-static {v6, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget v12, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v15, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    mul-int/lit16 v15, v15, -0x25fb

    or-int/2addr v12, v15

    if-ltz v12, :cond_2

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v12, "\u06df\u06e6\u06e1"

    invoke-static {v12}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v12

    move-object v15, v6

    move-object/from16 v18, v1

    move/from16 v20, v12

    goto/16 :goto_0

    :cond_2
    sget v12, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sub-int/2addr v12, v15

    const v15, 0x1ac6ba

    add-int/2addr v12, v15

    move-object v15, v6

    move-object/from16 v18, v1

    move/from16 v20, v12

    goto/16 :goto_0

    :sswitch_9
    move-object v8, v3

    goto :goto_2

    :sswitch_a
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    const-string v6, "E93hGY7z4XM=\n"

    const-string v12, "dbSNfMCSjBY=\n"

    invoke-static {v6, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget v12, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v12, :cond_5

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v12, "\u06e4\u06e5\u06e4"

    invoke-static {v12}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v12

    move-object v14, v6

    move-object/from16 v16, v1

    move/from16 v20, v12

    goto/16 :goto_0

    :sswitch_b
    iget-object v8, v2, Led;->a:Ljava/lang/String;

    goto :goto_2

    :pswitch_2
    :sswitch_c
    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v1, :cond_3

    const/16 v1, 0x3a

    sput v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v1, "\u06e2\u06e1"

    invoke-static {v1}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_3
    sget v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v6, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    mul-int/2addr v1, v6

    const v6, 0x1a1ea9

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "Ksm4zDsv\n"

    const-string v6, "WKzJg1lF+BU=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x3

    new-array v13, v1, [Ljava/lang/Object;

    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    xor-int/lit16 v1, v1, 0x3a8

    aput-object p1, v13, v1

    sget v1, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/2addr v1, v6

    const v6, 0x1ab683

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :pswitch_3
    :sswitch_e
    sget v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v6, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    or-int/lit16 v6, v6, -0x690

    sub-int/2addr v1, v6

    if-gtz v1, :cond_4

    const-string v1, "\u06e0\u06e7"

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_4
    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v6, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    div-int/2addr v1, v6

    const v6, 0x1aa720

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_f
    const-string v1, "Na/ZfZNCxjR/u8U2\n"

    const-string v6, "Cdq3COAnohQ=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06e0\u06e3"

    goto :goto_3

    :sswitch_10
    move-object v8, v13

    goto/16 :goto_2

    :sswitch_11
    move-object/from16 v0, p0

    iget v1, v0, Ldd;->a:I

    packed-switch v1, :pswitch_data_0

    :sswitch_12
    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    move-result v1

    if-ltz v1, :cond_13

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v1, "\u06e5\u06e8\u06e8"

    invoke-static {v1}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_5
    const-string v12, "\u06e5\u06e2\u06e2"

    invoke-static {v12}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v12

    move-object v14, v6

    move-object/from16 v16, v1

    move/from16 v20, v12

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v1, p1

    check-cast v1, Led;

    const-string v6, "JIc=\n"

    const-string v12, "TfP2Ho0QcFg=\n"

    invoke-static {v6, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iget-boolean v1, v1, Led;->c:Z

    sget v6, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v12, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    rem-int/2addr v6, v12

    const v12, 0x1ac42f

    add-int/2addr v6, v12

    move/from16 v19, v1

    move/from16 v20, v6

    goto/16 :goto_0

    :pswitch_4
    :sswitch_14
    sget v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    xor-int/2addr v1, v6

    const v6, -0x1ac84f

    xor-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v1

    if-ltz v1, :cond_6

    const-string v1, "\u06e3\u06df\u06e6"

    invoke-static {v1}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    xor-int/2addr v1, v6

    const v6, 0x1ab69c

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :pswitch_5
    :sswitch_16
    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v1

    if-gtz v1, :cond_7

    const-string v6, "\u06e4\u06e1\u06df"

    move-object v1, v4

    :goto_4
    invoke-static {v6}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v6

    move-object v4, v1

    move/from16 v20, v6

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e3\u06df\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_17
    sget-object v8, Lxh;->n:Lxh;

    goto/16 :goto_2

    :sswitch_18
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v1

    if-gtz v1, :cond_8

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v6, "\u06e6\u06e0\u06e1"

    move-object v1, v7

    goto/16 :goto_1

    :cond_8
    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    rem-int/2addr v1, v6

    const v6, 0x1ab282

    xor-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :pswitch_6
    :sswitch_19
    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/2addr v1, v6

    const v6, 0x1ac410

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :pswitch_7
    :sswitch_1a
    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/2addr v1, v6

    const v6, 0x1ac262

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_1b
    xor-int/lit8 v1, v19, -0x1

    and-int/lit8 v1, v1, 0x1

    and-int/lit8 v2, v19, -0x2

    or-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    goto/16 :goto_2

    :sswitch_1c
    move-object v8, v11

    goto/16 :goto_2

    :sswitch_1d
    move-object/from16 v1, p1

    check-cast v1, Led;

    const-string v6, "zQA=\n"

    const-string v12, "pHSyg4uOkwg=\n"

    invoke-static {v6, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v6, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v6, :cond_9

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v6, "\u06e0\u06e5\u06e4"

    invoke-static {v6}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v17, v1

    move/from16 v20, v6

    goto/16 :goto_0

    :cond_9
    sget v6, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v12, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/2addr v6, v12

    const v12, 0x1fa7a9

    xor-int/2addr v6, v12

    move-object/from16 v17, v1

    move/from16 v20, v6

    goto/16 :goto_0

    :sswitch_1e
    move-object v8, v9

    goto/16 :goto_2

    :sswitch_1f
    sget v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    xor-int/lit16 v1, v1, -0x223

    const-string v6, ""

    aput-object v6, v11, v1

    sget v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    xor-int/lit8 v1, v1, -0x27

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v11, v1

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v6, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    rem-int/2addr v1, v6

    const v6, 0x1aab3b

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_20
    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/lit16 v1, v1, 0x2c8

    aput-object v10, v9, v1

    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/lit16 v1, v1, 0x390

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v9, v1

    move-object v1, v8

    :goto_5
    const-string v6, "\u06e0\u06e7\u06e0"

    invoke-static {v6}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v6

    move-object v8, v1

    move/from16 v20, v6

    goto/16 :goto_0

    :sswitch_21
    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    xor-int/lit16 v1, v1, -0xc8

    aput-object v4, v5, v1

    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/lit8 v1, v1, -0x64

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v6, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    rem-int/lit16 v6, v6, -0x122f

    sub-int/2addr v1, v6

    if-ltz v1, :cond_a

    :cond_a
    const-string v1, "\u06e2\u06e5"

    invoke-static {v1}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :pswitch_8
    :sswitch_22
    sget v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v1, :cond_b

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v1, "\u06e4\u06e2\u06e6"

    move-object v6, v1

    :goto_6
    invoke-static {v6}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_b
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v6, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sub-int/2addr v1, v6

    const v6, 0x1aaa1d

    xor-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_23
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v6, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    xor-int/lit16 v6, v6, -0x13a

    aput-object v18, v1, v6

    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/lit8 v6, v6, -0x64

    aput-object v15, v1, v6

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v6

    if-ltz v6, :cond_c

    const/16 v6, 0x1e

    sput v6, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    goto :goto_5

    :cond_c
    const-string v6, "\u06df\u06e7\u06e6"

    invoke-static {v6}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v6

    move-object v8, v1

    move/from16 v20, v6

    goto/16 :goto_0

    :sswitch_24
    move-object v8, v5

    goto/16 :goto_2

    :sswitch_25
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    const-string v4, "DiyBLkv2vz0=\n"

    const-string v5, "aEXtSwWX0lg=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    sget v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v6, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    mul-int/lit16 v6, v6, 0x86a

    add-int/2addr v4, v6

    if-gtz v4, :cond_d

    const-string v4, "\u06e5\u06df\u06e3"

    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v6

    move-object v4, v1

    move/from16 v20, v6

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e8\u06e1\u06e0"

    move-object v6, v4

    goto/16 :goto_4

    :sswitch_26
    const-string v1, "ATVrCjN7\n"

    const-string v3, "c1AaRVERoGM=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x3

    new-array v3, v1, [Ljava/lang/Object;

    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v1, v1, -0x187

    aput-object p1, v3, v1

    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v1, :cond_e

    const/4 v1, 0x1

    sput v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v1, "\u06e1\u06e8"

    invoke-static {v1}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_e
    move-object v1, v2

    :cond_f
    const-string v2, "\u06df\u06e6\u06e2"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v6

    move-object v2, v1

    move/from16 v20, v6

    goto/16 :goto_0

    :sswitch_27
    const-string v1, "KOGlbMzc\n"

    const-string v6, "WoTUI662KW8=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x3

    new-array v11, v1, [Ljava/lang/Object;

    sget v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    xor-int/lit16 v1, v1, -0x1b5

    aput-object p1, v11, v1

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v1

    if-gtz v1, :cond_10

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v1, "\u06e8\u06e3\u06e1"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_10
    const-string v12, "\u06e4\u06e7\u06e0"

    move-object v6, v9

    move-object v1, v10

    :goto_7
    invoke-static {v12}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v12

    move-object v9, v6

    move-object v10, v1

    move/from16 v20, v12

    goto/16 :goto_0

    :sswitch_28
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    const-string v6, "R12CkRUWkLs=\n"

    const-string v9, "ITTu9Ft3/d4=\n"

    invoke-static {v6, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    sget v9, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v9, :cond_11

    const/16 v9, 0x8

    sput v9, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v9, "\u06e0\u06e0\u06e3"

    move-object v12, v9

    goto :goto_7

    :cond_11
    const-string v9, "\u06e3\u06df"

    invoke-static {v9}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v12

    move-object v9, v6

    move-object v10, v1

    move/from16 v20, v12

    goto/16 :goto_0

    :sswitch_29
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/lit16 v1, v1, 0x9c

    const-string v6, ""

    aput-object v6, v13, v1

    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    xor-int/lit16 v1, v1, -0x2f3

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v13, v1

    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v1, :cond_12

    const-string v1, "\u06e4\u06e0"

    invoke-static {v1}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_12
    const-string v1, "\u06e7\u06e6\u06e5"

    move-object v6, v1

    goto/16 :goto_6

    :pswitch_9
    :sswitch_2a
    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/2addr v1, v6

    const v6, 0x1aaac2

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_13
    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v6, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sub-int/2addr v1, v6

    const v6, -0xdcb4

    xor-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v1, p1

    check-cast v1, Led;

    const-string v2, "Eg==\n"

    const-string v6, "cbfFHJIo4Qs=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v2

    if-gez v2, :cond_f

    const-string v6, "\u06e4\u06e5\u06e4"

    move-object v2, v1

    goto/16 :goto_6

    :pswitch_a
    :sswitch_2c
    sget v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/lit16 v6, v6, -0x2171

    rem-int/2addr v1, v6

    if-gtz v1, :cond_14

    const-string v1, "\u06df\u06e1\u06e1"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v20, v1

    goto/16 :goto_0

    :cond_14
    sget v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v6, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sub-int/2addr v1, v6

    const v6, 0x1ab838

    add-int/2addr v1, v6

    move/from16 v20, v1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc27 -> :sswitch_0
        0xdc43 -> :sswitch_24
        0xdc5c -> :sswitch_20
        0xdc7c -> :sswitch_e
        0xdcbb -> :sswitch_f
        0x1aa721 -> :sswitch_2b
        0x1aa7da -> :sswitch_22
        0x1aa7db -> :sswitch_1
        0x1aa7fe -> :sswitch_4
        0x1aa81c -> :sswitch_27
        0x1aaac2 -> :sswitch_15
        0x1aaac7 -> :sswitch_8
        0x1aaae3 -> :sswitch_3
        0x1aab61 -> :sswitch_1c
        0x1aab7f -> :sswitch_18
        0x1aabb9 -> :sswitch_1e
        0x1aaec7 -> :sswitch_16
        0x1aaf43 -> :sswitch_9
        0x1ab248 -> :sswitch_c
        0x1ab2a1 -> :sswitch_12
        0x1ab2bf -> :sswitch_17
        0x1ab2ff -> :sswitch_11
        0x1ab60a -> :sswitch_25
        0x1ab646 -> :sswitch_a
        0x1ab684 -> :sswitch_29
        0x1ab9ca -> :sswitch_13
        0x1aba48 -> :sswitch_2c
        0x1aba83 -> :sswitch_b
        0x1ababd -> :sswitch_1f
        0x1abd89 -> :sswitch_2
        0x1abdaa -> :sswitch_5
        0x1abde5 -> :sswitch_7
        0x1abde8 -> :sswitch_14
        0x1ac166 -> :sswitch_2a
        0x1ac1a8 -> :sswitch_6
        0x1ac262 -> :sswitch_26
        0x1ac567 -> :sswitch_28
        0x1ac589 -> :sswitch_1b
        0x1ac5e6 -> :sswitch_10
        0x1ac5e7 -> :sswitch_19
        0x1ac626 -> :sswitch_d
        0x1ac8c8 -> :sswitch_23
        0x1ac8ee -> :sswitch_1a
        0x1ac907 -> :sswitch_21
        0x1ac946 -> :sswitch_1d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_a
        :pswitch_2
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_1
        :pswitch_5
    .end packed-switch
.end method

.class public final Lb7;
.super Lt50;

# interfaces
.implements Lym;


# instance fields
.field public final e:I

.field public f:I

.field public final g:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lvd;I)V
    .locals 3

    iput p3, p0, Lb7;->e:I

    iput-object p1, p0, Lb7;->g:Landroid/app/Activity;

    invoke-direct {p0, p2}, Lt50;-><init>(Lvd;)V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e4\u06e1"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    rem-int/2addr v1, v2

    const v2, 0x1ab0e9

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    :sswitch_1
    const-string v1, "\u06e2\u06e3\u06e6"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    const-string v0, "UOZJv24zqDCyMvsflFepJ3tmiv"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۢ۠ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    if-ltz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v1, "\u06e2\u06df\u06e3"

    invoke-static {v1}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e6\u06e1"

    goto :goto_1

    :sswitch_3
    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v1

    if-ltz v1, :cond_2

    const/16 v1, 0x3d

    sput v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    :cond_2
    const-string v1, "\u06e7\u06e0\u06e3"

    invoke-static {v1}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    sget v1, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    add-int/lit16 v2, v2, -0x198f

    add-int/2addr v1, v2

    if-ltz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v1, "\u06e2\u06e2\u06e0"

    goto :goto_1

    :cond_3
    const-string v1, "\u06e3\u06e4\u06e1"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcbb -> :sswitch_0
        0x1ab246 -> :sswitch_1
        0x1ab248 -> :sswitch_4
        0x1ab2c5 -> :sswitch_5
        0x1ab6a0 -> :sswitch_3
        0x1ac52a -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lvd;)Lvd;
    .locals 3

    const-string v0, "\u06e0\u06e1\u06e7"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p0, Lb7;->e:I

    packed-switch v0, :pswitch_data_0

    :sswitch_1
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v0, :cond_1

    const/16 v0, 0x1d

    sput v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v0, "\u06e8\u06e7\u06df"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :pswitch_0
    :sswitch_2
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    mul-int/2addr v0, v1

    const v1, 0x1f4d6d

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/lit16 v1, v1, -0x231f

    sub-int/2addr v0, v1

    if-gtz v0, :cond_0

    const-string v0, "\u06e5\u06e5\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/2addr v0, v1

    const v1, 0x1aab04

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    new-instance v0, Lb7;

    iget-object v1, p0, Lb7;->g:Landroid/app/Activity;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Lb7;-><init>(Landroid/app/Activity;Lvd;I)V

    :goto_1
    return-object v0

    :cond_1
    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    div-int/2addr v0, v1

    const v1, 0x1aba84

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    new-instance v0, Lb7;

    iget-object v1, p0, Lb7;->g:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lb7;-><init>(Landroid/app/Activity;Lvd;I)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0x1aab06 -> :sswitch_0
        0x1aab3f -> :sswitch_2
        0x1aab9a -> :sswitch_3
        0x1aaf3f -> :sswitch_1
        0x1aba84 -> :sswitch_4
        0x1ac601 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e6\u06e8"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {p0, v1}, Lb7;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Lb7;

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Lb7;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_1
    iget v0, p0, Lb7;->e:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v2, :cond_0

    const/16 v2, 0x13

    sput v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v2, "\u06e1\u06e6\u06e8"

    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v3

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v2, "\u06e0\u06e3\u06e4"

    invoke-static {v2}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v3

    move v2, v0

    goto :goto_0

    :pswitch_0
    :sswitch_2
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    mul-int/lit16 v3, v3, -0x1044

    rem-int/2addr v0, v3

    if-ltz v0, :cond_1

    const/16 v0, 0x34

    sput v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v0, "\u06e6\u06e8\u06e0"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v3, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/2addr v0, v3

    const v3, 0x1aba14

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_3
    move-object v0, p1

    check-cast v0, Lpe;

    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v3, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    or-int/2addr v0, v3

    const v3, 0x1aae32

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_4
    move-object v0, p2

    check-cast v0, Lvd;

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v1

    if-ltz v1, :cond_2

    const-string v1, "\u06e7\u06e7\u06e8"

    invoke-static {v1}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v3, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    xor-int/2addr v1, v3

    const v3, 0x1accff

    add-int/2addr v3, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    invoke-virtual {p0, v1}, Lb7;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Lb7;

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Lb7;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :sswitch_6
    packed-switch v2, :pswitch_data_0

    :sswitch_7
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/lit16 v3, v3, -0x26bd

    sub-int/2addr v0, v3

    if-ltz v0, :cond_3

    const/16 v0, 0x46

    sput v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v0, "\u06e7\u06e8\u06df"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/2addr v0, v3

    const v3, -0xd8c8

    xor-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v0

    if-ltz v0, :cond_4

    const-string v0, "\u06e3\u06e3\u06e7"

    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v3, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    add-int/2addr v0, v3

    const v3, 0x1aabb8

    xor-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcde -> :sswitch_0
        0x1aaae8 -> :sswitch_4
        0x1aab41 -> :sswitch_3
        0x1aaf63 -> :sswitch_1
        0x1ab664 -> :sswitch_7
        0x1abadb -> :sswitch_5
        0x1ac608 -> :sswitch_8
        0x1ac92a -> :sswitch_6
        0x1ac9c3 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/16 v18, 0x0

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-string v16, "\u06e0\u06e0\u06e6"

    invoke-static/range {v16 .. v16}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v16

    move-object/from16 v22, v4

    move/from16 v23, v16

    :goto_0
    sparse-switch v23, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v10, Lqe;->a:Lqe;

    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v16, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, 0x154d

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-ltz v4, :cond_27

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v4, "\u06e8\u06e3\u06df"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto :goto_0

    :sswitch_1
    const/4 v4, 0x2

    if-ne v14, v4, :cond_2a

    invoke-static {v7}, Lgu;->M(Ljava/lang/Object;)V

    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v16, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, -0x19ed

    move/from16 v16, v0

    mul-int v4, v4, v16

    if-gtz v4, :cond_0

    :goto_1
    const-string v4, "\u06e5\u06e0\u06e6"

    :goto_2
    invoke-static {v4}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto :goto_0

    :cond_0
    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v16, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int v4, v4, v16

    const v16, 0x14be37

    add-int v4, v4, v16

    move/from16 v23, v4

    goto :goto_0

    :cond_1
    :sswitch_2
    move v4, v11

    :cond_2
    const-string v11, "\u06e1\u06e0\u06e6"

    invoke-static {v11}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v16

    move v11, v4

    move/from16 v23, v16

    goto :goto_0

    :sswitch_3
    const v4, -0x140081f3

    :try_start_0
    sget v16, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    xor-int v4, v4, v16

    invoke-virtual {v12, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v16, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    div-int v4, v4, v16

    const v16, 0x1aba81

    add-int v4, v4, v16

    move/from16 v23, v4

    goto :goto_0

    :sswitch_4
    const/4 v4, 0x3

    if-eq v11, v4, :cond_1

    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    if-ltz v4, :cond_3

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v4, "\u06e3\u06e2\u06e6"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto :goto_0

    :cond_3
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v16, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    or-int v4, v4, v16

    const v16, 0x1ab903

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :catch_0
    move-exception v4

    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v4, :cond_4

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    const-string v4, "\u06df\u06e6\u06e8"

    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_4
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v16, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int v4, v4, v16

    const v16, 0x1aba87

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_5
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v16, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    move/from16 v0, v16

    div-int/lit16 v0, v0, 0x23e3

    move/from16 v16, v0

    xor-int v4, v4, v16

    if-ltz v4, :cond_5

    const/16 v4, 0x53

    sput v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    const-string v4, "\u06e5\u06e0\u06df"

    :goto_3
    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e1\u06e2\u06e4"

    goto :goto_3

    :sswitch_6
    move-object/from16 v0, p0

    iget v4, v0, Lb7;->f:I

    if-eqz v4, :cond_9

    const/16 v16, 0x1

    move/from16 v0, v16

    if-ne v4, v0, :cond_16

    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v16, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, 0x21a2

    move/from16 v16, v0

    div-int v4, v4, v16

    if-eqz v4, :cond_6

    const/16 v4, 0x48

    sput v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v4, "\u06e5\u06e4\u06df"

    invoke-static {v4}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_6
    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v16, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    div-int v4, v4, v16

    const v16, 0x1ab33e

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_7
    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v16, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    xor-int v4, v4, v16

    const v16, 0x1aa8c7

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_8
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v16, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    move/from16 v0, v16

    mul-int/lit16 v0, v0, -0x1729

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-ltz v4, :cond_7

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    const-string v4, "\u06df\u06e0\u06e6"

    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v21, v10

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e0\u06e4\u06e7"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v21, v10

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_9
    invoke-static {v7}, Lgu;->M(Ljava/lang/Object;)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    iput v4, v0, Lb7;->f:I

    const-wide/16 v24, 0x483

    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    int-to-long v0, v4

    move-wide/from16 v26, v0

    xor-long v24, v24, v26

    move-wide/from16 v0, v24

    move-object/from16 v2, p0

    invoke-static {v0, v1, v2}, Lg80;->i(JLt50;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_d

    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v16, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, 0xb27

    move/from16 v16, v0

    add-int v4, v4, v16

    if-gtz v4, :cond_8

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v4, "\u06e7\u06e4\u06e6"

    invoke-static {v4}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e5\u06e1\u06e7"

    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_a
    const-string v4, "QxycUpfizURsDA==\n"

    const-string v16, "AmnoOtKMqi0=\n"

    move-object/from16 v0, v16

    invoke-static {v4, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v16, "Xq5CfoqgKdBLvmgzHeRGwgvUV0dNyxC1DJo9ZiuiBtxBjVQzINpI3hPUb2RN2wy0OYU9Xi2jNvBB\njVk=\n"

    const-string v19, "rjHY1qpFoF0=\n"

    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v19, "ioxU\n"

    const-string v23, "/u0zZ+lqY9I=\n"

    const-string v24, "KFnE\n"

    const-string v25, "RSqjPIOV6WI=\n"

    move-object/from16 v0, v19

    move-object/from16 v1, v23

    move-object/from16 v2, v24

    move-object/from16 v3, v25

    invoke-static {v0, v1, v4, v2, v3}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v16

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_b
    move-object/from16 v0, p0

    iget v4, v0, Lb7;->f:I

    if-eqz v4, :cond_1c

    const/4 v14, 0x1

    if-eq v4, v14, :cond_28

    :goto_4
    const-string v14, "\u06e1\u06e3\u06df"

    move-object/from16 v16, v14

    move/from16 v19, v4

    :goto_5
    invoke-static/range {v16 .. v16}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v14, v19

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_9
    :sswitch_c
    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v16, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, 0x979

    move/from16 v16, v0

    add-int v4, v4, v16

    if-ltz v4, :cond_a

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v4, "\u06e3\u06e2\u06e2"

    invoke-static {v4}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_a
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v16, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    mul-int v4, v4, v16

    const v16, -0x1aaa3d

    xor-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_d
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v9, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/lit16 v9, v9, -0x2555

    add-int/2addr v4, v9

    if-ltz v4, :cond_b

    const/16 v4, 0x10

    sput v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    move-object v9, v13

    move v4, v14

    goto :goto_4

    :cond_b
    const-string v4, "\u06e1\u06e2\u06e4"

    move-object/from16 v16, v4

    move-object v9, v13

    move/from16 v19, v11

    :goto_6
    invoke-static/range {v16 .. v16}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v11, v19

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_e
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p0 .. p0}, Lu6;->f(Lt50;)Ljava/lang/Object;

    move-result-object v5

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    if-ltz v4, :cond_c

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    :cond_c
    const-string v4, "\u06e7\u06df\u06e5"

    move-object v15, v5

    move-object/from16 v16, v5

    :goto_7
    invoke-static {v4}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v5, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_d
    :sswitch_f
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v16, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, 0x2583

    move/from16 v16, v0

    rem-int v4, v4, v16

    if-ltz v4, :cond_e

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v4, "\u06e1\u06e7\u06e2"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_e
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v16, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    div-int v4, v4, v16

    const v16, 0x1ab667

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_10
    const-string v4, "\u06e3\u06e3\u06e6"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_11
    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v16, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    move/from16 v0, v16

    or-int/lit16 v0, v0, -0x1553

    move/from16 v16, v0

    xor-int v4, v4, v16

    if-gtz v4, :cond_f

    const/16 v4, 0x11

    sput v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v4, "\u06e4\u06e6\u06e2"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_f
    const-string v4, "\u06e8\u06e5\u06e4"

    move-object/from16 v16, v5

    goto :goto_7

    :sswitch_12
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v4

    if-ltz v4, :cond_10

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v4, "\u06e4\u06e0\u06e7"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_10
    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v16, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sub-int v4, v4, v16

    const v16, 0x1abe72

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_13
    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v16, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, -0x16db

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-gtz v4, :cond_11

    const/16 v4, 0x26

    sput v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v4, "\u06e2\u06e3\u06e7"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v21, v20

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_11
    const-string v4, "\u06e7\u06df\u06e3"

    move-object/from16 v16, v20

    :goto_8
    invoke-static {v4}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v21, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_14
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v16, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, -0x901

    move/from16 v16, v0

    div-int v4, v4, v16

    if-eqz v4, :cond_12

    const/16 v4, 0x36

    sput v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v4, "\u06e0\u06e8\u06e6"

    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_12
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v16, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    xor-int v4, v4, v16

    const v16, 0x1ab3be

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_15
    packed-switch v8, :pswitch_data_0

    :sswitch_16
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v16, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    rem-int v4, v4, v16

    const v16, -0x1ac658

    xor-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_17
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v16, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, 0x1f2b

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-ltz v4, :cond_13

    const-string v4, "\u06e0\u06df\u06e8"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_13
    const-string v4, "\u06e2\u06e3\u06e8"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_18
    if-eqz v12, :cond_22

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v16, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, -0xe12

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-gtz v4, :cond_14

    const-string v19, "\u06e5\u06e1\u06e7"

    move-object/from16 v4, v17

    move-object/from16 v16, v18

    :goto_9
    invoke-static/range {v19 .. v19}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v19

    move-object/from16 v17, v4

    move-object/from16 v18, v16

    move/from16 v23, v19

    goto/16 :goto_0

    :cond_14
    const-string v4, "\u06e5\u06e0\u06e3"

    :goto_a
    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v9, v21

    :sswitch_1a
    return-object v9

    :sswitch_1b
    if-ne v15, v10, :cond_25

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v4

    if-ltz v4, :cond_15

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v4, "\u06e5\u06e0\u06e3"

    invoke-static {v4}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v9, v10

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_15
    const-string v4, "\u06e4\u06e7\u06e8"

    move-object v9, v10

    goto/16 :goto_2

    :cond_16
    :sswitch_1c
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v4, :cond_17

    const-string v4, "\u06e3\u06e8"

    invoke-static {v4}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_17
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v16, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int v4, v4, v16

    const v16, 0x1bfc38

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_18
    :sswitch_1d
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v16, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, 0x349

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-ltz v4, :cond_19

    const/16 v4, 0x4f

    sput v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v4, "\u06e8\u06e6\u06e5"

    move-object/from16 v16, v21

    goto/16 :goto_8

    :cond_19
    const-string v4, "\u06df\u06e2\u06e7"

    :goto_b
    invoke-static {v4}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_1e
    invoke-static {v7}, Lgu;->M(Ljava/lang/Object;)V

    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v16, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    move/from16 v0, v16

    or-int/lit16 v0, v0, -0x227a

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-gtz v4, :cond_1a

    move-object v4, v6

    :goto_c
    const-string v6, "\u06df\u06e2"

    invoke-static {v6}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v16

    move-object v6, v4

    move/from16 v23, v16

    goto/16 :goto_0

    :cond_1a
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v16, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    xor-int v4, v4, v16

    const v16, 0x1aadf9

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_1f
    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "KqV6dghivR1utnNpXXu3Gmmmc3xHZLcdbq14bEd9txpps39uQDaxUjurY25BeLc=\n"

    const-string v6, "ScQWGigW0j0=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    :sswitch_20
    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v4, :cond_1b

    const-string v4, "\u06e5\u06e2\u06e5"

    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_1b
    const-string v4, "\u06e6\u06e7\u06e4"

    invoke-static {v4}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_21
    move v4, v14

    :cond_1c
    sget v14, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v16, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int v14, v14, v16

    const v16, -0x1aa6dc

    xor-int v16, v16, v14

    move v14, v4

    move/from16 v23, v16

    goto/16 :goto_0

    :sswitch_22
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v4

    invoke-static {v4}, Landroid/os/Process;->killProcess(I)V

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/System;->exit(I)V

    sget-object v20, Lxh;->n:Lxh;

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v16, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, -0x24b5

    move/from16 v16, v0

    sub-int v4, v4, v16

    if-gtz v4, :cond_1d

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v4, "\u06e3\u06e1\u06e6"

    invoke-static {v4}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_1d
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v16, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int v4, v4, v16

    const v16, 0x1abb30

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_23
    :try_start_1
    invoke-virtual {v6, v12}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v4, :cond_1e

    const/16 v4, 0xa

    sput v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v4, "\u06e8\u06e5\u06e3"

    move-object/from16 v16, v4

    move/from16 v19, v11

    goto/16 :goto_6

    :cond_1e
    sget v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v16, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    or-int v4, v4, v16

    const v16, -0x1ac242

    xor-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_24
    move-object v4, v5

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-eqz v4, :cond_2

    const/4 v11, 0x2

    if-eq v4, v11, :cond_2

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v11

    if-ltz v11, :cond_1f

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    const-string v11, "\u06e4\u06e7\u06e8"

    invoke-static {v11}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v16

    move v11, v4

    move/from16 v23, v16

    goto/16 :goto_0

    :cond_1f
    const-string v11, "\u06e0\u06e1\u06df"

    move-object/from16 v16, v11

    move/from16 v19, v4

    goto/16 :goto_6

    :sswitch_25
    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    if-ltz v4, :cond_20

    const-string v4, "\u06e2\u06e0\u06e4"

    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_20
    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v16, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    rem-int v4, v4, v16

    const v16, 0x1aabdd

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_26
    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "jQnzIw4dri/JGvo8WwSkKM4K+ilBG6QvyQHxOUECpCjOH/Y7RkmiYJwH6jtHB6Q=\n"

    const-string v6, "7mifTy5pwQ8=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    :sswitch_27
    sget-object v13, Lxh;->n:Lxh;

    const-string v4, "\u06e2\u06e3\u06e7"

    :goto_d
    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_28
    sget-object v4, Lyg;->a:Lyf;

    sget-object v16, Lps;->a:Lno;

    new-instance v4, Lss;

    const/16 v17, 0x0

    const/16 v18, 0x1

    move-object/from16 v0, v17

    move/from16 v1, v18

    invoke-direct {v4, v6, v0, v1}, Lss;-><init>(Landroid/content/ContextWrapper;Lvd;I)V

    sget v17, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v18, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    move/from16 v0, v18

    xor-int/lit16 v0, v0, -0x2558

    move/from16 v18, v0

    add-int v17, v17, v18

    if-gtz v17, :cond_21

    const-string v17, "\u06e4\u06e0"

    invoke-static/range {v17 .. v17}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v19

    move-object/from16 v17, v4

    move-object/from16 v18, v16

    move/from16 v23, v19

    goto/16 :goto_0

    :cond_21
    const-string v17, "\u06e7\u06e4\u06e6"

    move-object/from16 v19, v17

    goto/16 :goto_9

    :sswitch_29
    invoke-static {v7}, Lgu;->M(Ljava/lang/Object;)V

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    div-int/2addr v4, v5

    const v5, 0x1ac5e3

    add-int/2addr v4, v5

    move-object v5, v7

    move/from16 v23, v4

    goto/16 :goto_0

    :pswitch_0
    :sswitch_2a
    const-string v4, "\u06df\u06e0\u06e6"

    goto/16 :goto_3

    :cond_22
    :sswitch_2b
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v16, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit8 v16, v16, 0x46

    div-int v4, v4, v16

    if-ltz v4, :cond_23

    const/16 v4, 0x40

    sput v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v4, "\u06e8\u06e2\u06e5"

    goto :goto_d

    :cond_23
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v16, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    mul-int v4, v4, v16

    const v16, 0x1c2457

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_2c
    :try_start_2
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v12

    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v16, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, -0xa3a

    move/from16 v16, v0

    mul-int v4, v4, v16

    if-gtz v4, :cond_24

    const-string v4, "\u06df\u06df\u06e8"

    goto/16 :goto_a

    :cond_24
    const-string v4, "\u06e8\u06e3\u06df"

    goto/16 :goto_3

    :sswitch_2d
    invoke-static {v7}, Lgu;->M(Ljava/lang/Object;)V

    sget-object v4, Lu6;->a:Lu6;

    const/16 v16, 0x1

    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lb7;->f:I

    sget v16, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v19, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int v16, v16, v19

    const v19, 0x1ac9e9

    xor-int v16, v16, v19

    move-object/from16 v22, v4

    move/from16 v23, v16

    goto/16 :goto_0

    :cond_25
    :sswitch_2e
    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v16, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    move/from16 v0, v16

    rem-int/lit16 v0, v0, -0x10f5

    move/from16 v16, v0

    div-int v4, v4, v16

    if-gtz v4, :cond_26

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    const-string v4, "\u06df\u06e1\u06e4"

    goto/16 :goto_b

    :cond_26
    const-string v4, "\u06e4\u06e3\u06e3"

    goto/16 :goto_b

    :cond_27
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v16, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    xor-int v4, v4, v16

    const v16, 0x1ac876

    xor-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_2f
    move v4, v14

    :cond_28
    sget v14, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    if-ltz v14, :cond_29

    const/16 v14, 0x45

    sput v14, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    const-string v14, "\u06e2\u06e3\u06e5"

    :goto_e
    invoke-static {v14}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v16

    move v14, v4

    move/from16 v23, v16

    goto/16 :goto_0

    :cond_29
    const-string v14, "\u06e2\u06e2\u06e7"

    goto :goto_e

    :sswitch_30
    move-object/from16 v0, p0

    iget v6, v0, Lb7;->e:I

    move-object/from16 v0, p0

    iget-object v4, v0, Lb7;->g:Landroid/app/Activity;

    move-object/from16 v7, p1

    move v8, v6

    goto/16 :goto_c

    :cond_2a
    :sswitch_31
    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v16, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int v4, v4, v16

    const v16, 0x1ab868

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_32
    const/4 v4, 0x2

    move-object/from16 v0, p0

    iput v4, v0, Lb7;->f:I

    move-object/from16 v0, v18

    move-object/from16 v1, v17

    move-object/from16 v2, p0

    invoke-static {v0, v1, v2}, Lg80;->M(Lhe;Lym;Lt50;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_18

    const-string v4, "\u06e3\u06e1\u06e6"

    move-object/from16 v16, v21

    move-object v9, v10

    goto/16 :goto_8

    :sswitch_33
    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v4

    if-gtz v4, :cond_2b

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v4, "\u06e7\u06df\u06e3"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_2b
    const-string v4, "\u06df\u06e5\u06e1"

    move-object/from16 v16, v4

    move/from16 v19, v14

    goto/16 :goto_5

    :sswitch_34
    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v16, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    move/from16 v0, v16

    add-int/lit16 v0, v0, -0x173b

    move/from16 v16, v0

    or-int v4, v4, v16

    if-ltz v4, :cond_2c

    const-string v4, "\u06e8\u06e5\u06e4"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_2c
    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v16, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    or-int v4, v4, v16

    const v16, 0xdc47

    add-int v4, v4, v16

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0xdc3e -> :sswitch_5
        0xdc7c -> :sswitch_1c
        0xdc9d -> :sswitch_2f
        0x1aa708 -> :sswitch_2d
        0x1aa725 -> :sswitch_6
        0x1aa726 -> :sswitch_31
        0x1aa764 -> :sswitch_27
        0x1aa7bb -> :sswitch_1d
        0x1aa7e1 -> :sswitch_7
        0x1aaac9 -> :sswitch_16
        0x1aaae6 -> :sswitch_30
        0x1aaafe -> :sswitch_4
        0x1aab63 -> :sswitch_11
        0x1aab83 -> :sswitch_5
        0x1aabde -> :sswitch_10
        0x1aaea7 -> :sswitch_a
        0x1aaee3 -> :sswitch_1a
        0x1aaefd -> :sswitch_1
        0x1ab266 -> :sswitch_12
        0x1ab2a1 -> :sswitch_f
        0x1ab2a7 -> :sswitch_29
        0x1ab2c6 -> :sswitch_d
        0x1ab2c7 -> :sswitch_1d
        0x1ab2e0 -> :sswitch_5
        0x1ab33e -> :sswitch_1e
        0x1ab343 -> :sswitch_2e
        0x1ab646 -> :sswitch_13
        0x1ab648 -> :sswitch_34
        0x1ab667 -> :sswitch_2c
        0x1ab686 -> :sswitch_f
        0x1ab702 -> :sswitch_33
        0x1aba44 -> :sswitch_24
        0x1aba67 -> :sswitch_26
        0x1aba81 -> :sswitch_23
        0x1aba86 -> :sswitch_20
        0x1aba9d -> :sswitch_2b
        0x1abaa0 -> :sswitch_1d
        0x1abac2 -> :sswitch_c
        0x1abac5 -> :sswitch_25
        0x1abda8 -> :sswitch_3
        0x1abdab -> :sswitch_28
        0x1abdcb -> :sswitch_8
        0x1abdeb -> :sswitch_2
        0x1abe20 -> :sswitch_1f
        0x1abe3f -> :sswitch_9
        0x1ac1a3 -> :sswitch_2a
        0x1ac243 -> :sswitch_22
        0x1ac50b -> :sswitch_19
        0x1ac50d -> :sswitch_1b
        0x1ac5a9 -> :sswitch_32
        0x1ac5e3 -> :sswitch_14
        0x1ac626 -> :sswitch_b
        0x1ac8d1 -> :sswitch_2e
        0x1ac90e -> :sswitch_20
        0x1ac944 -> :sswitch_18
        0x1ac986 -> :sswitch_21
        0x1ac987 -> :sswitch_12
        0x1ac988 -> :sswitch_15
        0x1ac9a4 -> :sswitch_e
        0x1ac9e5 -> :sswitch_17
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

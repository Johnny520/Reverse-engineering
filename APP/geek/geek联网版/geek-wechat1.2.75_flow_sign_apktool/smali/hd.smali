.class public abstract Lhd;
.super Ljava/lang/Object;


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/4 v0, 0x0

    const/4 v7, 0x0

    const-string v1, "\u06e5\u06e8\u06e3"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v8

    move v5, v0

    move v9, v0

    move v10, v0

    move v1, v0

    move v12, v0

    move v2, v0

    move v4, v0

    move v11, v0

    move v6, v0

    move v3, v0

    :goto_0
    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "L71ywBygKA==\n"

    const-string v6, "DPs0+F2WHcU=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const-string v0, "\u06e2\u06df\u06df"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    xor-int/lit16 v0, v0, 0x3c5

    aput v1, v7, v0

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x7

    sput v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v0, "\u06e2\u06df\u06e2"

    :goto_2
    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e1\u06e8\u06e3"

    goto :goto_2

    :sswitch_2
    const-string v0, "6EDBefrgcQ==\n"

    const-string v8, "y3jwOs3YRas=\n"

    invoke-static {v0, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v0, :cond_1

    const/16 v0, 0x59

    sput v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    const-string v0, "\u06e4\u06e4"

    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_1
    const-string v8, "\u06e0\u06e5\u06df"

    move-object v0, v7

    :goto_3
    invoke-static {v8}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v8

    move-object v7, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/lit16 v0, v0, -0x36c

    aput v5, v7, v0

    const-string v0, "\u06e6\u06e0\u06e6"

    :goto_4
    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "miVNVdvsqA==\n"

    const-string v5, "uREJF+2t68M=\n"

    invoke-static {v0, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v8, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    add-int/lit16 v8, v8, -0xce2

    mul-int/2addr v0, v8

    if-gtz v0, :cond_2

    const-string v0, "\u06e0\u06e6\u06e8"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_2
    const-string v0, "\u06e2\u06df\u06e2"

    :goto_5
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "/pREDDtSPw==\n"

    const-string v2, "3aAASAsXDsM=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v0, "\u06df\u06e5\u06e1"

    goto :goto_4

    :cond_3
    const-string v0, "\u06df\u06e5\u06e1"

    goto/16 :goto_1

    :sswitch_6
    const-string v0, "O7UAdszN9Q==\n"

    const-string v8, "GPA1Qf/6xiM=\n"

    invoke-static {v0, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v8

    if-ltz v8, :cond_4

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    const-string v8, "\u06e0\u06e8\u06e4"

    invoke-static {v8}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v8

    move v12, v0

    goto/16 :goto_0

    :cond_4
    sget v8, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v12, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sub-int/2addr v8, v12

    const v12, 0x1ab2e0

    add-int/2addr v8, v12

    move v12, v0

    goto/16 :goto_0

    :sswitch_7
    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    xor-int/lit16 v0, v0, -0x385

    aput v9, v7, v0

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v0

    if-gtz v0, :cond_5

    const-string v0, "\u06e0\u06e5\u06df"

    :goto_6
    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e8\u06e7\u06e1"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_8
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/lit16 v0, v0, -0x30e

    aput v11, v7, v0

    const-string v0, "\u06e4\u06e4"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "rk8SVSP8Yw==\n"

    const-string v4, "jQ1TYxu/W0M=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v0, :cond_6

    const-string v0, "\u06e6\u06e7"

    :goto_7
    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e6\u06e7"

    goto :goto_7

    :sswitch_a
    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v0, v0, -0x311

    aput v6, v7, v0

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v0

    if-ltz v0, :cond_7

    const/16 v0, 0x23

    sput v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v0, "\u06e5\u06e0\u06e1"

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u06e5\u06e2"

    goto :goto_6

    :sswitch_b
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    xor-int/lit16 v0, v0, -0x1c1

    aput v3, v7, v0

    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    if-ltz v0, :cond_8

    :goto_8
    const-string v0, "\u06e7\u06e7\u06e8"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e4\u06e6\u06df"

    goto :goto_7

    :sswitch_c
    const/16 v0, 0xa

    new-array v0, v0, [I

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v7

    if-gtz v7, :cond_9

    const-string v7, "\u06e3\u06e3\u06e5"

    invoke-static {v7}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v8

    move-object v7, v0

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u06e5\u06e8\u06e4"

    move-object v8, v7

    goto/16 :goto_3

    :sswitch_d
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v8, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    div-int/lit16 v8, v8, 0x6fa

    xor-int/2addr v0, v8

    if-ltz v0, :cond_a

    const/16 v0, 0x3b

    sput v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v0, "\u06e8\u06e5\u06e2"

    goto/16 :goto_1

    :cond_a
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v8, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    rem-int/2addr v0, v8

    const v8, 0x1abfed

    xor-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    :sswitch_e
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    xor-int/lit16 v0, v0, -0x236

    aput v12, v7, v0

    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v0, :cond_b

    const/4 v0, 0x6

    sput v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v0, "\u06e5\u06e2"

    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v8, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    div-int/2addr v0, v8

    const v8, 0x1aab9f

    add-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    :sswitch_f
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/lit16 v0, v0, -0x310

    aput v10, v7, v0

    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v8, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    rem-int/2addr v0, v8

    const v8, 0x1ab09a

    add-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    :sswitch_10
    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/lit16 v0, v0, 0x15d

    aput v4, v7, v0

    move v0, v11

    :goto_9
    const-string v8, "\u06e5\u06df\u06e1"

    invoke-static {v8}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v8

    move v11, v0

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "6lPD9yaAdQ==\n"

    const-string v8, "yWT6zxDDNzU=\n"

    invoke-static {v0, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    if-ltz v0, :cond_c

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    const-string v8, "\u06e1\u06e8\u06e3"

    move-object v0, v7

    goto/16 :goto_3

    :cond_c
    const-string v0, "\u06e0\u06e6\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "wzvMEAqa6w==\n"

    const-string v1, "4H2KUj2ur88=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v0

    if-gtz v0, :cond_d

    const-string v0, "\u06e6\u06e0\u06e6"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u06e2\u06e3"

    goto/16 :goto_4

    :sswitch_13
    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    xor-int/lit8 v0, v0, 0x58

    aput v2, v7, v0

    goto/16 :goto_8

    :sswitch_14
    sput-object v7, Lhd;->a:[I

    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v8, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    mul-int/lit16 v8, v8, -0x255f

    xor-int/2addr v0, v8

    if-gtz v0, :cond_e

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v0, "\u06e8\u06e7\u06e1"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_e
    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v8, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/2addr v0, v8

    const v8, 0x1abdfe

    add-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "pfUd93tZzw==\n"

    const-string v8, "hrMtwUlg/T0=\n"

    invoke-static {v0, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sget v8, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v11, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int/lit16 v11, v11, -0x2433

    sub-int/2addr v8, v11

    if-ltz v8, :cond_f

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    goto/16 :goto_9

    :cond_f
    sget v8, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v11, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sub-int/2addr v8, v11

    const v11, -0x1aad62

    xor-int/2addr v8, v11

    move v11, v0

    goto/16 :goto_0

    :sswitch_16
    const-string v0, "9Yz7fEvo2Q==\n"

    const-string v3, "1rrPPn6u7yk=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v0, "\u06e0\u06e8\u06e4"

    goto/16 :goto_4

    :sswitch_17
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc41 -> :sswitch_0
        0xdc80 -> :sswitch_10
        0xdc9d -> :sswitch_14
        0xdcc1 -> :sswitch_11
        0x1aa7bb -> :sswitch_4
        0x1aab7a -> :sswitch_12
        0x1aab9f -> :sswitch_8
        0x1aaba2 -> :sswitch_16
        0x1aabdc -> :sswitch_5
        0x1aaf3d -> :sswitch_9
        0x1aaf60 -> :sswitch_b
        0x1aaf9c -> :sswitch_a
        0x1ab242 -> :sswitch_c
        0x1ab245 -> :sswitch_2
        0x1ab685 -> :sswitch_d
        0x1ab703 -> :sswitch_15
        0x1aba9d -> :sswitch_13
        0x1abd87 -> :sswitch_f
        0x1abda6 -> :sswitch_17
        0x1abea0 -> :sswitch_6
        0x1abea1 -> :sswitch_e
        0x1ac16c -> :sswitch_7
        0x1ac608 -> :sswitch_3
        0x1ac9c2 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Landroid/app/Activity;Lsn;ILjava/lang/String;Ljava/lang/String;)V
    .locals 77

    const/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v43, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v34, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/16 v31, 0x0

    const/4 v11, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v28, 0x0

    const/16 v25, 0x0

    const/16 v42, 0x0

    const/16 v26, 0x0

    const/16 v52, 0x0

    const/16 v40, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v54, 0x0

    const/16 v27, 0x0

    const/16 v58, 0x0

    const/16 v23, 0x0

    const/16 v59, 0x0

    const/16 v57, 0x0

    const/16 v56, 0x0

    const/16 v24, 0x0

    const/16 v60, 0x0

    const/16 v37, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v16, 0x0

    const/16 v75, 0x0

    const/16 v49, 0x0

    const/16 v32, 0x0

    const/16 v50, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v51, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/16 v21, 0x0

    const/16 v20, 0x0

    const/16 v30, 0x0

    const/16 v61, 0x0

    const/16 v29, 0x0

    const-string v64, "\u06e6\u06e3"

    invoke-static/range {v64 .. v64}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v76

    move-object/from16 v64, v4

    move-object/from16 v65, v6

    move-object/from16 v66, v10

    move-object/from16 v67, v13

    move-object/from16 v68, v14

    move-object/from16 v69, v16

    move-object/from16 v70, v18

    move-object/from16 v71, v19

    move-object/from16 v72, v22

    move-object/from16 v73, v23

    move/from16 v74, v24

    :goto_0
    sparse-switch v76, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v29

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v6, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    add-int/lit16 v6, v6, 0x1c08

    xor-int/2addr v4, v6

    if-gtz v4, :cond_44

    const/16 v4, 0xb

    sput v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v4, "\u06e6\u06e6\u06e4"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto :goto_0

    :sswitch_1
    const-string v4, "\u06e2\u06df\u06e7"

    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto :goto_0

    :sswitch_2
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v6, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    mul-int/2addr v4, v6

    const v6, 0x2a2cb

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto :goto_0

    :sswitch_3
    new-instance v4, Landroid/widget/EditText;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const-string v6, "1AEwNAbO32CJWARhZeOvHZg4RWIrjalk2wsB/61F\n"

    const-string v10, "PL+j0YNrOfg=\n"

    invoke-static {v6, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const/16 v6, 0x78

    invoke-static/range {v45 .. v45}, Landroid/graphics/Color;->red(I)I

    move-result v10

    invoke-static/range {v45 .. v45}, Landroid/graphics/Color;->green(I)I

    move-result v13

    invoke-static/range {v45 .. v45}, Landroid/graphics/Color;->blue(I)I

    move-result v14

    invoke-static {v6, v10, v13, v14}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setHintTextColor(I)V

    move/from16 v0, v44

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v6, 0x41700000    # 15.0f

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v6, 0x10

    invoke-static {v6}, Lmp;->q(I)I

    move-result v6

    const/16 v10, 0xc

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    const/16 v13, 0x10

    invoke-static {v13}, Lmp;->q(I)I

    move-result v13

    const/16 v14, 0xc

    invoke-static {v14}, Lmp;->q(I)I

    move-result v14

    invoke-virtual {v4, v6, v10, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move/from16 v0, v48

    invoke-virtual {v6, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v10, 0x41800000    # 16.0f

    invoke-static {v10}, Lmp;->p(F)F

    move-result v10

    invoke-virtual {v6, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v6, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v10, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    mul-int/lit16 v10, v10, -0x1687

    sub-int/2addr v6, v10

    if-ltz v6, :cond_0

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v6, "\u06e5\u06df\u06e5"

    invoke-static {v6}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v70, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_0
    const-string v6, "\u06df\u06e1\u06e3"

    invoke-static {v6}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v70, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_1
    :sswitch_4
    const-string v4, "\u06e5\u06e6\u06e3"

    :goto_1
    invoke-static {v4}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_5
    :try_start_0
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v4

    const/4 v6, 0x1

    if-le v4, v6, :cond_3b

    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v6, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/lit16 v6, v6, -0x1af4

    mul-int/2addr v4, v6

    if-ltz v4, :cond_3

    move-object/from16 v4, v29

    :cond_2
    const-string v6, "\u06e0\u06e4"

    invoke-static {v6}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v29, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06df\u06df\u06e4"

    :goto_2
    invoke-static {v4}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_6
    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v6, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    div-int/2addr v4, v6

    const v6, 0x1aab7c

    xor-int/2addr v4, v6

    move-object/from16 v36, v60

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_7
    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    if-ltz v4, :cond_4

    const/16 v4, 0x51

    sput v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v4, "\u06e5\u06e0\u06e1"

    move/from16 v6, v30

    :goto_3
    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v30, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u06e5\u06e0\u06df"

    move-object/from16 v4, v31

    move/from16 v10, v32

    :goto_4
    invoke-static {v6}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v31, v4

    move/from16 v32, v10

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_8
    const-string v4, "\u06e7\u06e2\u06e2"

    :goto_5
    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_9
    const-string v4, "06ke\n"

    const-string v6, "p8h5VTpLcuY=\n"

    const-string v10, "gzyzGPGiWQepMLYJ4p5pFZ8Wrx7/sw==\n"

    const-string v13, "wFPdbJDBLVc=\n"

    invoke-static {v10, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v13, "tw==\n"

    const-string v14, "0vI8ySRxU5w=\n"

    invoke-static {v4, v6, v10, v13, v14}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v4, :cond_5

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v4, "\u06e2\u06e7\u06e0"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_5
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int/2addr v4, v6

    const v6, 0x1ac7bf

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_a
    :try_start_1
    invoke-virtual/range {v54 .. v54}, Ljava/lang/String;->length()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v4

    if-lez v4, :cond_5b

    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v6, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    xor-int/2addr v4, v6

    const v6, -0x1aaaf7

    xor-int/2addr v4, v6

    move-object/from16 v36, v54

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_b
    move/from16 v6, v30

    :cond_6
    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v10, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    div-int/lit16 v10, v10, 0x298

    xor-int/2addr v4, v10

    if-ltz v4, :cond_7

    const/16 v4, 0x3e

    sput v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v4, "\u06e1\u06e8\u06e2"

    invoke-static {v4}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v30, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e6\u06e1\u06e3"

    goto/16 :goto_3

    :sswitch_c
    move-object/from16 v0, v65

    move/from16 v1, v48

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v4

    move-object/from16 v0, v65

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v67

    move-object/from16 v1, v65

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v4, 0x4

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    const/4 v6, 0x4

    invoke-static {v6}, Lmp;->q(I)I

    move-result v6

    const/4 v10, 0x4

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    const/4 v13, 0x4

    invoke-static {v13}, Lmp;->q(I)I

    move-result v13

    move-object/from16 v0, v67

    invoke-virtual {v0, v4, v6, v10, v13}, Landroid/view/View;->setPadding(IIII)V

    new-instance v15, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v4, "JILEVCTv\n"

    const-string v6, "wSd5satkAbs=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41600000    # 14.0f

    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v4, 0x11

    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    const/4 v10, -0x1

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v4, v6, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v15, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v17, Landroid/widget/TextView;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v6, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    or-int/2addr v4, v6

    const v6, 0x1ab2b1

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    move-result v4

    if-gtz v4, :cond_8

    const-string v6, "\u06e7\u06e2\u06e3"

    move-object/from16 v4, v31

    move/from16 v10, v32

    goto/16 :goto_4

    :cond_8
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    mul-int/2addr v4, v6

    const v6, 0x1e79ff

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_e
    :try_start_2
    new-instance v6, Ldd;

    const/4 v4, 0x0

    invoke-direct {v6, v4}, Ldd;-><init>(I)V

    new-instance v10, Ldd;

    const/4 v4, 0x1

    invoke-direct {v10, v4}, Ldd;-><init>(I)V

    new-instance v4, Ltb;

    const/4 v13, 0x2

    new-array v13, v13, [Lum;

    const/4 v14, 0x0

    aput-object v6, v13, v14

    const/4 v6, 0x1

    aput-object v10, v13, v6

    invoke-direct {v4, v13}, Ltb;-><init>([Lum;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v6

    if-gtz v6, :cond_21

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v6, "\u06e3\u06e7\u06e0"

    invoke-static {v6}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v41, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_f
    new-instance v4, Landroid/app/Dialog;

    const v6, 0x1030010

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v6}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance v10, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    const/4 v13, -0x1

    const/4 v14, -0x1

    invoke-direct {v6, v13, v14}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v6, 0x0

    invoke-virtual {v10, v6}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v6, Le7;

    const/4 v13, 0x3

    invoke-direct {v6, v4, v13}, Le7;-><init>(Landroid/app/Dialog;I)V

    invoke-virtual {v10, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-double v0, v6

    move-wide/from16 v18, v0

    const-wide v22, 0x3fed70a3d70a3d71L    # 0.92

    mul-double v18, v18, v22

    move-wide/from16 v0, v18

    double-to-int v0, v0

    move/from16 v16, v0

    new-instance v6, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v13, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v14, -0x1

    move/from16 v0, v16

    invoke-direct {v13, v14, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v14, 0x50

    iput v14, v13, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v6, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v13, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v14, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    xor-int/lit16 v14, v14, -0xb97

    or-int/2addr v13, v14

    if-ltz v13, :cond_9

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v13, "\u06e4\u06e2"

    move-object/from16 v14, v36

    :goto_6
    invoke-static {v13}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v33, v4

    move-object/from16 v34, v6

    move-object/from16 v35, v10

    move-object/from16 v36, v14

    move/from16 v38, v16

    move/from16 v76, v13

    goto/16 :goto_0

    :cond_9
    sget v13, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v14, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int/2addr v13, v14

    const v14, 0x1ab952

    add-int/2addr v13, v14

    move-object/from16 v33, v4

    move-object/from16 v34, v6

    move-object/from16 v35, v10

    move/from16 v38, v16

    move/from16 v76, v13

    goto/16 :goto_0

    :sswitch_10
    const-string v4, "\u06e1\u06df\u06e1"

    move-object/from16 v6, v53

    :goto_7
    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v54, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_11
    sget-object v4, Lkn;->a:Lkn;

    const-string v6, "Obz1W1v34+xJ5OEKItW1hGaZigxFu5DROoHBWH3O4O556vA5KOGJiXO7ijhPtbr1OZfxWHnz4d59\n5ckrLvywiEaDiwN4uofYObDvWX/d4dl25O43IvmshnabijJkuJXvOYriVWjI6t1d\n"

    const-string v10, "3AxvvcddBWE=\n"

    invoke-static {v6, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, p0

    invoke-static {v0, v6}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v4, :cond_a

    const/16 v4, 0x12

    sput v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v4, "\u06e2\u06e2\u06e4"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_a
    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v6, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    rem-int/2addr v4, v6

    const v6, 0xddd6

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_12
    if-eqz v72, :cond_1d

    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sub-int/2addr v4, v6

    const v6, 0x1aa74b

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_13
    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v6, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    mul-int/lit16 v6, v6, 0x746

    mul-int/2addr v4, v6

    if-gtz v4, :cond_b

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v4, "\u06e4\u06e5\u06e6"

    :goto_8
    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_b
    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v6, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    rem-int/2addr v4, v6

    const v6, 0x1ab60d

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_14
    const/4 v4, 0x1

    move/from16 v0, p2

    if-ne v0, v4, :cond_1b

    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v6, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    add-int/lit16 v6, v6, 0xe88

    or-int/2addr v4, v6

    if-gtz v4, :cond_c

    const/16 v4, 0x5d

    sput v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v4, "\u06e2\u06e1\u06e0"

    move-object/from16 v6, v39

    :goto_9
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v39, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_c
    sget v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v6, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    or-int/2addr v4, v6

    const v6, 0x1aaf42

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_15
    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    add-int/lit16 v6, v6, -0x9c8

    xor-int/2addr v4, v6

    if-ltz v4, :cond_d

    const/16 v4, 0x58

    sput v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v4, "\u06e0\u06e8\u06e3"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06df\u06e8\u06e5"

    :goto_a
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_16
    :try_start_3
    const-string v4, "Rg4Mn7vKf4VTFQ==\n"

    const-string v6, "K2F6+u+lMeA=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    move-object/from16 v0, v72

    invoke-static {v0, v4, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v28

    const-string v4, "\u06e2\u06e2\u06e6"

    :goto_b
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_17
    :try_start_4
    move-object/from16 v0, v39

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v6, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    div-int/lit16 v6, v6, -0x1d07

    mul-int/2addr v4, v6

    if-eqz v4, :cond_46

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v4, "\u06e0\u06e2\u06df"

    invoke-static {v4}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_18
    const-string v6, "\u06e3\u06e1\u06e4"

    move-object/from16 v4, v43

    move/from16 v10, v44

    move/from16 v13, v45

    move/from16 v14, v46

    move/from16 v16, v47

    move/from16 v18, v48

    move/from16 v19, v49

    :goto_c
    invoke-static {v6}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v43, v4

    move/from16 v44, v10

    move/from16 v45, v13

    move/from16 v46, v14

    move/from16 v47, v16

    move/from16 v48, v18

    move/from16 v76, v6

    move/from16 v50, v19

    goto/16 :goto_0

    :sswitch_19
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    if-gtz v4, :cond_e

    const/16 v4, 0x1c

    sput v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v4, "\u06e4\u06e4\u06e5"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v36, v37

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_e
    const-string v13, "\u06e5\u06df\u06e7"

    move-object/from16 v4, v33

    move-object/from16 v6, v34

    move-object/from16 v10, v35

    move-object/from16 v14, v37

    move/from16 v16, v38

    goto/16 :goto_6

    :sswitch_1a
    const-string v4, "eVv7Ip3QIIYaAt1j1dhF3BBx\n"

    const-string v6, "neRmxzBIyDk=\n"

    const/high16 v10, 0x41800000    # 16.0f

    const/4 v13, -0x1

    move-object/from16 v0, v20

    invoke-static {v4, v6, v0, v10, v13}, Lg40;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object/from16 v0, v20

    invoke-virtual {v0, v4, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const/16 v4, 0x11

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v6, -0x1

    const/16 v10, 0x34

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    invoke-direct {v4, v6, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v6, 0x50

    iput v6, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move/from16 v0, v46

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v6, 0x42c80000    # 100.0f

    invoke-static {v6}, Lmp;->p(F)F

    move-result v6

    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-string v4, "\u06e1\u06e7"

    move-object v6, v4

    :goto_d
    invoke-static {v6}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_1b
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v6, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sub-int/2addr v4, v6

    const v6, -0x1ac93c

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_f
    :sswitch_1c
    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v6, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    mul-int/lit16 v6, v6, 0x22a9

    xor-int/2addr v4, v6

    if-ltz v4, :cond_10

    const-string v4, "\u06e4\u06e5"

    goto/16 :goto_1

    :cond_10
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    mul-int/2addr v4, v6

    const v6, -0x1e6699

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_1d
    invoke-interface/range {v69 .. v69}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4c

    invoke-interface/range {v69 .. v69}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v4, v6

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Li50;->F(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_55

    move-object/from16 v0, v63

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v4, "\u06e6\u06e7\u06e4"

    :goto_e
    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_1e
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v6, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    rem-int/2addr v4, v6

    const v6, 0x1acacc

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_1f
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v6, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    rem-int/2addr v4, v6

    const v6, -0x1ac13b

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_20
    new-instance v6, Landroid/view/View;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v10, 0x28

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    const/4 v13, 0x5

    invoke-static {v13}, Lmp;->q(I)I

    move-result v13

    invoke-direct {v4, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v10, 0x1

    iput v10, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/16 v10, 0x10

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    iput v10, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    const/16 v10, 0xc

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    iput v10, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v6, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move/from16 v0, v45

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v10, 0x50

    invoke-virtual {v4, v10}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    const/high16 v10, 0x41200000    # 10.0f

    invoke-static {v10}, Lmp;->p(F)F

    move-result v10

    invoke-virtual {v4, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    sget v10, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v13, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/2addr v10, v13

    const v13, 0x1aba5f

    xor-int/2addr v10, v13

    move-object/from16 v64, v4

    move-object/from16 v68, v6

    move/from16 v76, v10

    goto/16 :goto_0

    :sswitch_21
    :try_start_5
    const-string v4, "VpKnrbvEHvNWiL/h+cJf/lmUv+HvyF/zV4nmr+7LE71Mnruku8wQ6VSOpe/ZyBDxXYal\n"

    const-string v6, "OOfLwZunf50=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v28

    invoke-static {v4, v0}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v6, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    div-int/lit16 v6, v6, 0x5ad

    xor-int/2addr v4, v6

    if-ltz v4, :cond_11

    const/16 v4, 0x3f

    sput v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    const-string v4, "\u06df\u06df\u06e7"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_11
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v6, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    mul-int/2addr v4, v6

    const v6, 0x19ae88

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_22
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v4, :cond_12

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v4, "\u06e7\u06e4\u06e4"

    goto/16 :goto_a

    :cond_12
    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v6, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    or-int/2addr v4, v6

    const v6, 0x1abe6d

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_23
    const-string v4, "\u06e0\u06e8\u06e1"

    goto/16 :goto_2

    :sswitch_24
    new-instance v4, Li8;

    const/4 v6, 0x1

    move-object/from16 v0, v34

    move/from16 v1, v38

    invoke-direct {v4, v0, v1, v6}, Li8;-><init>(Landroid/widget/FrameLayout;II)V

    move-object/from16 v0, v33

    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    invoke-virtual/range {v33 .. v33}, Landroid/app/Dialog;->show()V

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v4

    if-ltz v4, :cond_61

    const-string v4, "DRZY4cCq8a1AVtTC2"

    invoke-static {v4}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۨۡۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    sget v6, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v10, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/lit16 v10, v10, -0x259f

    rem-int/2addr v6, v10

    if-gtz v6, :cond_2

    const/16 v6, 0x55

    sput v6, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v6, "\u06e4\u06e1\u06e1"

    invoke-static {v6}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v29, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_13
    :sswitch_25
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v4

    if-ltz v4, :cond_14

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v4, "\u06e8\u06e8\u06e2"

    goto/16 :goto_2

    :cond_14
    const-string v4, "\u06e0\u06e8\u06e3"

    goto/16 :goto_2

    :sswitch_26
    const/4 v4, 0x1

    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    new-instance v4, Lcd;

    const/4 v13, 0x1

    move-object/from16 v6, p1

    move/from16 v10, p2

    invoke-direct/range {v4 .. v13}, Lcd;-><init>(Ll00;Lsn;Landroid/widget/LinearLayout;Lgd;Ljava/util/ArrayList;ILjava/util/ArrayList;Lp00;I)V

    invoke-virtual {v14, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v6, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/lit16 v6, v6, -0x5cf

    mul-int/2addr v4, v6

    if-ltz v4, :cond_15

    const-string v4, "\u06e0\u06e0\u06e6"

    :goto_f
    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_15
    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v6, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/2addr v4, v6

    const v6, 0x1bd78f

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :catchall_0
    move-exception v4

    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v6, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit16 v6, v6, -0xdf0

    xor-int/2addr v4, v6

    if-ltz v4, :cond_16

    const/16 v4, 0x32

    sput v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v4, "\u06df\u06e8\u06e7"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_16
    const-string v4, "\u06e2\u06e6\u06e0"

    move-object/from16 v6, v40

    :goto_10
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v40, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_27
    const/4 v6, 0x0

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v4

    if-ltz v4, :cond_17

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v4, "\u06e2\u06e3\u06e3"

    :goto_11
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v73, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_17
    const-string v4, "\u06e6\u06e6\u06e4"

    goto :goto_11

    :sswitch_28
    const/4 v6, 0x0

    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v10, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    div-int/lit16 v10, v10, -0x1568

    xor-int/2addr v4, v10

    if-gtz v4, :cond_18

    const-string v4, "\u06e7\u06df\u06e2"

    goto :goto_10

    :cond_18
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v10, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    rem-int/2addr v4, v10

    const v10, -0x1aac0b

    xor-int/2addr v4, v10

    move-object/from16 v40, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_29
    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int/lit16 v6, v6, 0x7d2

    rem-int/2addr v4, v6

    if-ltz v4, :cond_19

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v4, "\u06e7\u06e5\u06e5"

    invoke-static {v4}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_19
    const-string v4, "\u06e6\u06e6\u06e2"

    goto/16 :goto_a

    :sswitch_2a
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    xor-int/lit16 v6, v6, -0x154e

    rem-int/2addr v4, v6

    if-ltz v4, :cond_1a

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v4, "\u06e4\u06e0\u06e1"

    goto/16 :goto_e

    :cond_1a
    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v6, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    rem-int/2addr v4, v6

    const v6, 0x1ac9f8

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_1b
    :sswitch_2b
    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v4

    if-ltz v4, :cond_1c

    const/16 v4, 0x16

    sput v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v4, "\u06e8\u06e7\u06e8"

    :goto_12
    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_1c
    const-string v4, "\u06e1\u06e3"

    :goto_13
    invoke-static {v4}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_1d
    :sswitch_2c
    const-string v4, "\u06e2\u06e4\u06df"

    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_2d
    :try_start_6
    move-object/from16 v0, v41

    invoke-static {v11, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    move-result v4

    if-ltz v4, :cond_1e

    const/16 v4, 0x56

    sput v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v4, "\u06e1\u06e3\u06e8"

    invoke-static {v4}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_1e
    const-string v4, "\u06e5\u06e0\u06df"

    goto/16 :goto_f

    :sswitch_2e
    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v4, :cond_1f

    const-string v4, "\u06df\u06e1\u06e3"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_1f
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v6, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sub-int/2addr v4, v6

    const v6, 0x1ab294

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_2f
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    if-ltz v4, :cond_20

    const/16 v4, 0x61

    sput v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v4, "\u06e3\u06e3\u06e7"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v59, v73

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_20
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v6, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    rem-int/2addr v4, v6

    const v6, 0x1ac212

    xor-int/2addr v4, v6

    move-object/from16 v59, v73

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_30
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    add-int/lit16 v6, v6, 0xbc

    mul-int/2addr v4, v6

    if-ltz v4, :cond_22

    move-object/from16 v4, v41

    move-object/from16 v37, v42

    :cond_21
    const-string v6, "\u06e2\u06e6\u06e2"

    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v41, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_22
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v6, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    or-int/2addr v4, v6

    const v6, 0x1aa4a3

    add-int/2addr v4, v6

    move-object/from16 v37, v42

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_31
    const/4 v4, 0x0

    move-object/from16 v0, v51

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    new-instance v8, Lgd;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v8, v9, v0, v1}, Lgd;-><init>(Ljava/util/ArrayList;Landroid/app/Activity;Lsn;)V

    move-object/from16 v0, v51

    invoke-virtual {v0, v8}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    move-object/from16 v0, v66

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-nez p2, :cond_4d

    const/4 v4, 0x2

    move-object/from16 v0, v66

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    const-string v4, "mgLGxOT/iHuaGN6IpvnJdpUE3oiw88l7mxmHxrHwhTWADtrN5P2HcYYYw8zq64BxkxLehoj1h3CV\nBebJvfOcYQ==\n"

    const-string v6, "9HeqqMSc6RU=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v7, Landroid/widget/LinearLayout;

    const/4 v4, 0x0

    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    new-instance v4, Lcd;

    const/4 v13, 0x0

    move-object/from16 v6, p1

    move/from16 v10, p2

    invoke-direct/range {v4 .. v13}, Lcd;-><init>(Ll00;Lsn;Landroid/widget/LinearLayout;Lgd;Ljava/util/ArrayList;ILjava/util/ArrayList;Lp00;I)V

    invoke-virtual {v14, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v6, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    xor-int/lit16 v6, v6, 0xf18

    sub-int/2addr v4, v6

    if-ltz v4, :cond_37

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    const-string v4, "\u06df\u06e6\u06e7"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_32
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/16 v49, 0x0

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v6

    if-gtz v6, :cond_23

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    const-string v6, "\u06e1\u06e6\u06e8"

    invoke-static {v6}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v75, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_23
    sget v6, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v10, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    or-int/2addr v6, v10

    const v10, 0x1aa41d

    xor-int/2addr v6, v10

    move/from16 v75, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_33
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v4

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Landroid/view/View;->setElevation(F)V

    const/16 v4, 0x1c

    if-lt v6, v4, :cond_6

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v10, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/lit16 v10, v10, -0x9da

    mul-int/2addr v4, v10

    if-gtz v4, :cond_50

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    const-string v4, "\u06e6\u06e1\u06e7"

    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v30, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_34
    new-instance v4, Lea;

    move-object/from16 v0, p3

    move-object/from16 v1, p0

    move-object/from16 v2, v33

    invoke-direct {v4, v11, v0, v1, v2}, Lea;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Landroid/app/Activity;Landroid/app/Dialog;)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v0, v21

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v34

    move-object/from16 v1, v66

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v34

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v35

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v33

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual/range {v33 .. v33}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v4

    if-eqz v4, :cond_57

    const/4 v6, -0x1

    const/4 v10, -0x1

    invoke-virtual {v4, v6, v10}, Landroid/view/Window;->setLayout(II)V

    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    const/4 v10, 0x0

    invoke-direct {v6, v10}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v4, v6}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v6, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v6, :cond_24

    const/16 v6, 0x28

    sput v6, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v6, "\u06df\u06e3\u06e4"

    invoke-static {v6}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v61, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_24
    sget v6, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v10, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    mul-int/2addr v6, v10

    const v10, 0x1acaa1

    add-int/2addr v6, v10

    move-object/from16 v61, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_35
    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v4

    if-ltz v4, :cond_25

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v6, "\u06e6\u06e7\u06e7"

    move-object/from16 v4, v43

    move/from16 v10, v44

    move/from16 v13, v45

    move/from16 v14, v46

    move/from16 v16, v47

    move/from16 v18, v48

    move/from16 v19, v50

    goto/16 :goto_c

    :cond_25
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int/2addr v4, v6

    const v6, -0xded3

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_36
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    rem-int/lit16 v6, v6, 0xe53

    or-int/2addr v4, v6

    if-ltz v4, :cond_26

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v4, "\u06e2\u06e8\u06e0"

    invoke-static {v4}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_26
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v6, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/2addr v4, v6

    const v6, 0x1ab6b8

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_37
    const-string v4, "4WTHwnCo\n"

    const-string v6, "BtpjKvEiaNs=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v17

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41600000    # 14.0f

    move-object/from16 v0, v17

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v4, 0x11

    move-object/from16 v0, v17

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    const/4 v10, -0x1

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v4, v6, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move-object/from16 v0, v17

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, p1

    move-object/from16 v1, v17

    invoke-static {v15, v5, v0, v1}, Lhd;->b(Landroid/widget/TextView;Ll00;Lsn;Landroid/widget/TextView;)V

    move-object/from16 v0, v67

    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v67

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual/range {v66 .. v67}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v13, Lbd;

    const/16 v18, 0x0

    move-object v14, v5

    move-object/from16 v16, p1

    invoke-direct/range {v13 .. v18}, Lbd;-><init>(Ll00;Landroid/widget/TextView;Lsn;Landroid/widget/TextView;I)V

    invoke-virtual {v15, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v13, Lbd;

    const/16 v18, 0x1

    move-object v14, v5

    move-object/from16 v16, p1

    invoke-direct/range {v13 .. v18}, Lbd;-><init>(Ll00;Landroid/widget/TextView;Lsn;Landroid/widget/TextView;I)V

    move-object/from16 v0, v17

    invoke-virtual {v0, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    if-ltz v4, :cond_28

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-object/from16 v4, v51

    :cond_27
    const-string v6, "\u06e3\u06e4\u06e6"

    invoke-static {v6}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v51, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_28
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    or-int/2addr v4, v6

    const v6, 0x1ac969

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_29
    :sswitch_38
    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v6, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    mul-int/2addr v4, v6

    const v6, 0x1b0181

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_39
    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v4

    if-ltz v4, :cond_2a

    const-string v4, "\u06e6\u06e1\u06e1"

    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_2a
    const-string v4, "\u06e4\u06e6"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_3a
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ll00;

    invoke-direct {v5}, Ll00;-><init>()V

    new-instance v12, Lp00;

    invoke-direct {v12}, Lp00;-><init>()V

    const-string v4, ""

    iput-object v4, v12, Lp00;->b:Ljava/lang/Object;

    if-nez p2, :cond_53

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v6

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x1

    const/16 v13, 0x28

    invoke-static {v13}, Lmp;->q(I)I

    move-result v13

    invoke-direct {v4, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x18

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    const/4 v13, 0x0

    const/16 v14, 0x18

    invoke-static {v14}, Lmp;->q(I)I

    move-result v14

    const/16 v16, 0x10

    invoke-static/range {v16 .. v16}, Lmp;->q(I)I

    move-result v16

    move/from16 v0, v16

    invoke-virtual {v4, v10, v13, v14, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v6, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v10, "\u06e7\u06e1\u06e7"

    invoke-static {v10}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v65, v4

    move-object/from16 v67, v6

    move/from16 v76, v10

    goto/16 :goto_0

    :sswitch_3b
    invoke-interface/range {v62 .. v62}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    sget v6, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v10, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    div-int/2addr v6, v10

    const v10, -0x1aaea8

    xor-int/2addr v6, v10

    move-object/from16 v69, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_3c
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v4

    if-gtz v4, :cond_2b

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v4, "\u06e3\u06e1\u06e4"

    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v59, v58

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_2b
    move-object/from16 v4, v58

    :goto_14
    const-string v6, "\u06e3\u06e8\u06e2"

    move-object/from16 v59, v4

    goto/16 :goto_d

    :sswitch_3d
    move/from16 v10, v32

    :cond_2c
    const-string v6, "\u06e4\u06e5\u06e5"

    move-object/from16 v4, v31

    goto/16 :goto_4

    :cond_2d
    :sswitch_3e
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v6, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    mul-int/lit16 v6, v6, 0x13cf

    or-int/2addr v4, v6

    if-ltz v4, :cond_2e

    const/16 v4, 0x1c

    sput v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v4, "\u06e1\u06e6\u06e0"

    :goto_15
    invoke-static {v4}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_2e
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v6, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int/2addr v4, v6

    const v6, -0x1abc92

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_3f
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v6, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int/lit8 v6, v6, -0x7

    sub-int/2addr v4, v6

    if-ltz v4, :cond_2f

    const/16 v4, 0x56

    sput v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v4, "\u06e2\u06e4\u06e6"

    goto/16 :goto_b

    :cond_2f
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/2addr v4, v6

    const v6, -0x1a4f30

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_40
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    xor-int/lit16 v6, v6, -0x1e75

    sub-int/2addr v4, v6

    if-ltz v4, :cond_30

    const-string v4, "\u06e5\u06e5\u06e7"

    move-object v6, v4

    move-object/from16 v10, v52

    :goto_16
    invoke-static {v6}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v52, v10

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_30
    sget v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v6, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    add-int/2addr v4, v6

    const v6, 0x1ac050

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_41
    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    mul-int/lit16 v6, v6, 0x1d22

    add-int/2addr v4, v6

    if-gtz v4, :cond_31

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    const-string v4, "\u06e8\u06df\u06e4"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v53, v52

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_31
    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v6, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sub-int/2addr v4, v6

    const v6, 0x1ab526

    add-int/2addr v4, v6

    move-object/from16 v53, v52

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_42
    :try_start_7
    const-string v4, "w7ZyvKggOdnu\n"

    const-string v6, "g9Ua3dxSVrY=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v42

    invoke-static {v0, v4}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result v4

    sget v6, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v10, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    div-int/2addr v6, v10

    const v10, 0x1abe63

    add-int/2addr v6, v10

    move/from16 v74, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_43
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    rem-int/lit16 v6, v6, -0xab5

    mul-int/2addr v4, v6

    if-gtz v4, :cond_33

    const/4 v4, 0x3

    sput v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    :cond_32
    const-string v4, "\u06e0\u06e2\u06e7"

    move-object/from16 v6, v54

    goto/16 :goto_7

    :cond_33
    const-string v4, "\u06e2\u06df\u06df"

    invoke-static {v4}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_44
    move-object/from16 v0, v68

    move-object/from16 v1, v64

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, v66

    move-object/from16 v1, v68

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p4

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41a00000    # 20.0f

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    move/from16 v0, v44

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v6, 0x0

    const/4 v10, 0x1

    invoke-virtual {v4, v6, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x1

    const/4 v13, -0x2

    invoke-direct {v6, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x18

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    const/4 v13, 0x0

    const/16 v14, 0x18

    invoke-static {v14}, Lmp;->q(I)I

    move-result v14

    const/16 v16, 0x10

    invoke-static/range {v16 .. v16}, Lmp;->q(I)I

    move-result v16

    move/from16 v0, v16

    invoke-virtual {v6, v10, v13, v14, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-string v6, "\u06e1\u06e8\u06e8"

    move/from16 v10, v32

    goto/16 :goto_4

    :sswitch_45
    const/high16 v4, -0x80000000

    move-object/from16 v0, v61

    invoke-virtual {v0, v4}, Landroid/view/Window;->addFlags(I)V

    const/16 v4, 0x200

    move-object/from16 v0, v61

    invoke-virtual {v0, v4}, Landroid/view/Window;->addFlags(I)V

    const/high16 v4, 0x4000000

    move-object/from16 v0, v61

    invoke-virtual {v0, v4}, Landroid/view/Window;->clearFlags(I)V

    const/4 v4, 0x0

    move-object/from16 v0, v61

    invoke-virtual {v0, v4}, Landroid/view/Window;->setStatusBarColor(I)V

    const/4 v4, 0x0

    move-object/from16 v0, v61

    invoke-virtual {v0, v4}, Landroid/view/Window;->setNavigationBarColor(I)V

    const/16 v4, 0x1f

    move/from16 v0, v30

    if-lt v0, v4, :cond_48

    const/4 v4, 0x4

    move-object/from16 v0, v61

    invoke-virtual {v0, v4}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual/range {v61 .. v61}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    invoke-static {v4}, Lz7;->u(Landroid/view/WindowManager$LayoutParams;)V

    const v4, 0x3e99999a    # 0.3f

    move-object/from16 v0, v61

    invoke-virtual {v0, v4}, Landroid/view/Window;->setDimAmount(F)V

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v4

    if-gtz v4, :cond_34

    const-string v4, "\u06e8\u06e4\u06e0"

    invoke-static {v4}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_34
    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v6, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    add-int/2addr v4, v6

    const v6, 0x1ac247

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_46
    move-object/from16 v4, v43

    move/from16 v10, v44

    move/from16 v13, v45

    move/from16 v14, v46

    move/from16 v16, v47

    move/from16 v18, v48

    :cond_35
    const-string v6, "\u06e2\u06e3\u06e3"

    move/from16 v19, v50

    goto/16 :goto_c

    :sswitch_47
    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v6, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int/lit16 v6, v6, 0x251f

    mul-int/2addr v4, v6

    if-ltz v4, :cond_36

    const/4 v4, 0x3

    sput v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v10, "\u06df\u06e8\u06e2"

    move-object/from16 v4, v20

    move-object/from16 v6, v21

    move-object/from16 v13, v55

    :goto_17
    invoke-static {v10}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v20, v4

    move-object/from16 v21, v6

    move-object/from16 v55, v13

    move/from16 v76, v10

    goto/16 :goto_0

    :cond_36
    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v6, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int/2addr v4, v6

    const v6, 0x1aa7ae

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_48
    :try_start_8
    const-string v4, "2iMdehzG0OTaOQU2XsCR6dUlBTZIypHk2zhceEnJ3arALwFzHM7e/tg/Hzhv0cPj2jE=\n"

    const-string v6, "tFZxFjylsYo=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v25

    invoke-static {v4, v0}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, v25

    check-cast v0, Ljava/lang/String;

    move-object v4, v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    sget v6, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v10, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    mul-int/lit16 v10, v10, -0x12e0

    rem-int/2addr v6, v10

    if-gtz v6, :cond_38

    move-object/from16 v42, v4

    :cond_37
    const-string v4, "\u06e2\u06e7\u06e1"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_38
    sget v6, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v10, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sub-int/2addr v6, v10

    const v10, 0x1ac191

    add-int/2addr v6, v10

    move-object/from16 v42, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_49
    :try_start_9
    const-string v4, "WBqwGG8DxlNY\n"

    const-string v6, "P3/ESxtxrz0=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v10, 0x0

    const/4 v13, 0x2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v6, v10

    move-object/from16 v0, v72

    invoke-static {v0, v4, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-result-object v27

    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v4, :cond_39

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v4, "\u06e2\u06df\u06df"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_39
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v6, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    rem-int/2addr v4, v6

    const v6, 0x1abe1b

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_4a
    :try_start_a
    invoke-virtual/range {v56 .. v56}, Ljava/lang/String;->length()I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    move-result v4

    if-lez v4, :cond_62

    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v6, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    add-int/lit16 v6, v6, -0x1eb0

    div-int/2addr v4, v6

    if-eqz v4, :cond_3a

    const-string v4, "\u06df\u06e1\u06e7"

    invoke-static {v4}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v60, v56

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_3a
    const-string v4, "\u06e0\u06e8\u06e8"

    move-object/from16 v6, v56

    :goto_18
    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v60, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_3b
    :sswitch_4b
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    rem-int/lit16 v6, v6, -0x1ce0

    mul-int/2addr v4, v6

    if-ltz v4, :cond_3c

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v4, "\u06df\u06e6\u06e2"

    move-object/from16 v6, v56

    :goto_19
    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v56, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_3c
    const-string v4, "\u06e8\u06df\u06e5"

    goto/16 :goto_b

    :sswitch_4c
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x1

    const/4 v10, -0x2

    invoke-direct {v4, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v6, 0x18

    invoke-static {v6}, Lmp;->q(I)I

    move-result v6

    const/4 v10, 0x0

    const/16 v13, 0x18

    invoke-static {v13}, Lmp;->q(I)I

    move-result v13

    const/16 v14, 0x10

    invoke-static {v14}, Lmp;->q(I)I

    move-result v14

    invoke-virtual {v4, v6, v10, v13, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    move-object/from16 v0, v70

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v0, v66

    move-object/from16 v1, v70

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/ListView;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Landroid/widget/ListView;->setDividerHeight(I)V

    const/4 v6, 0x2

    invoke-virtual {v4, v6}, Landroid/view/View;->setOverScrollMode(I)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x1

    const/4 v13, -0x1

    invoke-direct {v6, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v6, 0xc

    invoke-static {v6}, Lmp;->q(I)I

    move-result v6

    const/4 v10, 0x0

    const/16 v13, 0xc

    invoke-static {v13}, Lmp;->q(I)I

    move-result v13

    const/4 v14, 0x0

    invoke-virtual {v4, v6, v10, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    sget v6, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v10, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int/lit16 v10, v10, -0x544

    rem-int/2addr v6, v10

    if-gtz v6, :cond_27

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v6, "\u06df\u06e8\u06e6"

    invoke-static {v6}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v51, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_4d
    sget-object v4, Lkn;->a:Lkn;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, ""

    move-object/from16 v0, p3

    invoke-static {v0, v4}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    const/4 v10, 0x0

    const-string v13, "FQ==\n"

    const-string v14, "OWXYZD23agQ=\n"

    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v6, v10

    invoke-static {v4, v6}, Li50;->J(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const-string v10, "\u06e0\u06e2\u06e0"

    :goto_1a
    invoke-static {v10}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v62, v4

    move-object/from16 v63, v6

    move/from16 v76, v10

    goto/16 :goto_0

    :sswitch_4e
    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v4

    if-gtz v4, :cond_3d

    const/16 v4, 0x3b

    sput v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    const-string v4, "\u06e1\u06e2\u06e7"

    invoke-static {v4}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    move/from16 v50, v32

    goto/16 :goto_0

    :cond_3d
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v6, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    rem-int/2addr v4, v6

    const v6, 0x1ac4f9

    add-int/2addr v4, v6

    move/from16 v76, v4

    move/from16 v50, v32

    goto/16 :goto_0

    :sswitch_4f
    move-object/from16 v0, p1

    iget v14, v0, Lsn;->g:I

    const-string v4, "2ROi\n"

    const-string v6, "uHDWYHK2Rzs=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "E/ZoDis=\n"

    const-string v6, "Z54NY06RzDM=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-object/from16 v0, p1

    iget v0, v0, Lsn;->c:I

    move/from16 v18, v0

    move-object/from16 v0, p1

    iget v10, v0, Lsn;->e:I

    move-object/from16 v0, p1

    iget v13, v0, Lsn;->f:I

    move-object/from16 v0, p1

    iget v0, v0, Lsn;->b:I

    move/from16 v16, v0

    const-string v4, "hUr5K7Op/uyTRw==\n"

    const-string v6, "9j6WWdLOm6c=\n"

    const-string v19, "c+ZFYd/aZnM=\n"

    const-string v22, "B48xDbqJEgE=\n"

    move-object/from16 v0, p3

    move-object/from16 v1, v19

    move-object/from16 v2, v22

    invoke-static {v4, v6, v0, v1, v2}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p4

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v4, Lbw;->b:Ljava/lang/Object;

    if-nez v4, :cond_35

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v6

    if-gtz v6, :cond_3e

    const-string v6, "\u06e0\u06e5\u06e1"

    invoke-static {v6}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v43, v4

    move/from16 v44, v10

    move/from16 v45, v13

    move/from16 v46, v14

    move/from16 v47, v16

    move/from16 v48, v18

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_3e
    sget v6, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v19, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int v6, v6, v19

    const v19, 0x1aba81

    add-int v6, v6, v19

    move-object/from16 v43, v4

    move/from16 v44, v10

    move/from16 v45, v13

    move/from16 v46, v14

    move/from16 v47, v16

    move/from16 v48, v18

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_50
    :try_start_b
    move-object/from16 v0, v26

    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_2d

    move-object/from16 v0, v26

    check-cast v0, Ljava/lang/String;

    move-object v4, v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v6, :cond_3f

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v6, "\u06e1\u06e8\u06e8"

    invoke-static {v6}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v52, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_3f
    const-string v6, "\u06e8\u06df\u06df"

    move-object v10, v4

    goto/16 :goto_16

    :sswitch_51
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    or-int/2addr v4, v6

    const v6, 0x1aba6b

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_40
    :sswitch_52
    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    move-result v4

    if-ltz v4, :cond_41

    const/16 v4, 0x39

    sput v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v4, "\u06e6\u06e7\u06e0"

    goto/16 :goto_13

    :cond_41
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/2addr v4, v6

    const v6, -0x1a3263

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :catchall_1
    move-exception v4

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v4

    if-gtz v4, :cond_42

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    const-string v4, "\u06df\u06e0\u06df"

    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_42
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v6, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sub-int/2addr v4, v6

    const v6, 0x1ab226

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_53
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v4

    if-ltz v4, :cond_43

    const/16 v4, 0x56

    sput v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    const-string v4, "\u06e7\u06e4\u06e7"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_43
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v6, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sub-int/2addr v4, v6

    const v6, 0x1aab2a

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_44
    const-string v4, "\u06e5\u06e1\u06df"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_54
    if-nez v59, :cond_40

    :try_start_c
    const-string v57, ""
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v6, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sub-int/2addr v4, v6

    const v6, 0x1aad71

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_55
    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v4, :cond_45

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v4, "\u06e7\u06e2\u06e2"

    invoke-static {v4}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_45
    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v6, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sub-int/2addr v4, v6

    const v6, 0x1aa81e

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_56
    if-nez v53, :cond_f

    :try_start_d
    const-string v13, ""
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v6, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/lit16 v6, v6, 0x20cb

    xor-int/2addr v4, v6

    if-gtz v4, :cond_47

    move-object/from16 v55, v13

    :cond_46
    const-string v4, "\u06df\u06e6\u06e3"

    invoke-static {v4}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_47
    const-string v10, "\u06e0\u06e5\u06e1"

    move-object/from16 v4, v20

    move-object/from16 v6, v21

    goto/16 :goto_17

    :cond_48
    :sswitch_57
    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v6, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    div-int/2addr v4, v6

    const v6, 0x1ac60d

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_58
    if-nez v74, :cond_29

    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v6, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    mul-int/lit16 v6, v6, -0x118

    div-int/2addr v4, v6

    if-eqz v4, :cond_49

    const/16 v4, 0x37

    sput v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v4, "\u06e4\u06e3\u06e6"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_49
    const-string v13, "\u06e1\u06e3"

    move-object/from16 v4, v33

    move-object/from16 v6, v34

    move-object/from16 v10, v35

    move-object/from16 v14, v36

    move/from16 v16, v38

    goto/16 :goto_6

    :sswitch_59
    :try_start_e
    const-string v4, "3hptEttbDe3+OlM5+WJItK0xSDTzYUz16HMBNPdhf/3gPlM8uEl/18B/UzT3YVn57isBANBKf92t\nKlIy6mFM9eh/bxjML2HRxhoBcP9ncr2qf2AZ3C9Y6+gtTzb1ag3WwgsBG9FEaLiqemE26H8KuMwR\nZXfsdl39rXkBZrguELi9\n"

    const-string v6, "jV8hV5gPLZg=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    move-result-object v4

    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v6, :cond_4a

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v6, "\u06e2\u06e4\u06df"

    invoke-static {v6}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v71, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_4a
    sget v6, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v10, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    div-int/2addr v6, v10

    const v10, 0x1aaae6

    add-int/2addr v6, v10

    move-object/from16 v71, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_5a
    :try_start_f
    const-string v4, "QDE8bSwjfh0=\n"

    const-string v6, "MlBLPFlGDGQ=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v71, v6, v10

    const/4 v10, 0x1

    const/4 v13, 0x0

    aput-object v13, v6, v10

    move-object/from16 v0, v43

    invoke-static {v0, v4, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    move-result-object v4

    sget v6, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v10, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    mul-int/2addr v6, v10

    const v10, 0x1ab3ee

    add-int/2addr v6, v10

    move-object/from16 v72, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_5b
    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v6, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int/lit16 v6, v6, 0x228d

    or-int/2addr v4, v6

    if-gtz v4, :cond_4b

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-object/from16 v54, v55

    move-object/from16 v4, v59

    goto/16 :goto_14

    :cond_4b
    const-string v10, "\u06e8\u06df\u06e4"

    move-object/from16 v4, v62

    move-object/from16 v6, v63

    move-object/from16 v54, v55

    goto/16 :goto_1a

    :cond_4c
    :sswitch_5c
    sget v4, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    div-int/2addr v4, v6

    const v6, 0x1ac14e

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_4d
    :sswitch_5d
    const-string v4, "\u06e0\u06e5\u06df"

    goto/16 :goto_15

    :sswitch_5e
    move/from16 v0, v50

    move/from16 v1, v75

    if-ge v0, v1, :cond_5e

    move/from16 v0, v50

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v6, v50, 0x6

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v10, v6, -0x6

    check-cast v4, Led;

    iget-object v6, v4, Led;->a:Ljava/lang/String;

    move-object/from16 v0, v63

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2c

    const/4 v6, 0x1

    iput-boolean v6, v4, Led;->d:Z

    move/from16 v32, v10

    move/from16 v50, v10

    :goto_1b
    const-string v4, "\u06e0\u06e2\u06e1"

    move-object/from16 v6, v60

    goto/16 :goto_18

    :sswitch_5f
    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v6, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    add-int/lit16 v6, v6, 0x1a33

    mul-int/2addr v4, v6

    if-ltz v4, :cond_4e

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v4, "\u06e6\u06df\u06e7"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v56, v59

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_4e
    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v6, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    or-int/2addr v4, v6

    const v6, 0x1abbc7

    add-int/2addr v4, v6

    move-object/from16 v56, v59

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_60
    :try_start_10
    const-string v4, "/0QhYWM=\n"

    const-string v6, "nChOEgZApIw=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    move-object/from16 v0, v72

    invoke-static {v0, v4, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    rem-int/lit16 v6, v6, -0xfc9

    mul-int/2addr v4, v6

    if-ltz v4, :cond_32

    const/16 v4, 0x12

    sput v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v4, "\u06e0\u06e4\u06e3"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_61
    move-object/from16 v0, v66

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v6, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/2addr v4, v6

    const v6, 0x1ac500

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_62
    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v4, :cond_4f

    const/16 v4, 0x5f

    sput v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v4, "\u06e6\u06e2\u06e8"

    move-object/from16 v53, v40

    goto/16 :goto_5

    :cond_4f
    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v6, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/2addr v4, v6

    const v6, -0x1abe6b

    xor-int/2addr v4, v6

    move-object/from16 v53, v40

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_63
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v6, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    or-int/lit16 v6, v6, -0x1c3

    mul-int/2addr v4, v6

    if-gtz v4, :cond_51

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move/from16 v6, v30

    :cond_50
    const-string v4, "\u06e6\u06e5\u06df"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v30, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_51
    const-string v4, "\u06e2\u06e1\u06e0"

    :goto_1c
    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_64
    :try_start_11
    move-object/from16 v0, v27

    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_1

    move-object/from16 v0, v27

    check-cast v0, Ljava/lang/String;

    move-object v4, v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v6

    if-gtz v6, :cond_52

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-object/from16 v58, v4

    goto/16 :goto_1b

    :cond_52
    sget v6, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v10, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    div-int/2addr v6, v10

    const v10, 0x1aba04

    add-int/2addr v6, v10

    move-object/from16 v58, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :cond_53
    :sswitch_65
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v6, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int/lit16 v6, v6, -0xe47

    or-int/2addr v4, v6

    if-ltz v4, :cond_54

    const/16 v4, 0x62

    sput v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v4, "\u06e3\u06e6\u06e3"

    goto :goto_1c

    :cond_54
    const-string v4, "\u06e7\u06e6\u06e3"

    goto/16 :goto_8

    :sswitch_66
    :try_start_12
    const-string v4, "dPCzQlZHM6h0\n"

    const-string v6, "E5XHESI1WsY=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v10, 0x0

    const/4 v13, 0x1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v6, v10

    move-object/from16 v0, v72

    invoke-static {v0, v4, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    move-result-object v26

    const-string v4, "\u06e3\u06e6\u06e4"

    move-object v6, v4

    goto/16 :goto_d

    :sswitch_67
    const-string v4, "\u06e3\u06e3\u06e3"

    goto/16 :goto_2

    :cond_55
    :sswitch_68
    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v4, :cond_56

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v4, "\u06e3\u06e1\u06e8"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_56
    sget v4, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v6, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    or-int/2addr v4, v6

    const v6, 0x1aaee7

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_69
    move-object/from16 v4, v61

    :cond_57
    sget v6, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v10, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sub-int/2addr v6, v10

    const v10, 0x1ab101

    xor-int/2addr v6, v10

    move-object/from16 v61, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_6a
    :try_start_13
    move-object/from16 v0, v28

    check-cast v0, Ljava/lang/Boolean;

    move-object v4, v0

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_13

    const-string v4, "KQnaHdLK3gop\n"

    const-string v6, "TmyuTqa4t2Q=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v6, v10

    move-object/from16 v0, v72

    invoke-static {v0, v4, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    move-result-object v25

    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    or-int/2addr v4, v6

    const v6, -0x1ac1cd

    xor-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_6b
    new-instance v18, Lfd;

    move-object/from16 v19, v12

    move-object/from16 v20, v8

    move-object/from16 v21, v9

    move/from16 v22, p2

    move-object/from16 v23, v11

    move-object/from16 v24, v5

    invoke-direct/range {v18 .. v24}, Lfd;-><init>(Lp00;Lgd;Ljava/util/ArrayList;ILjava/util/ArrayList;Ll00;)V

    move-object/from16 v0, v70

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    move/from16 v10, p2

    move-object v13, v5

    move-object v14, v8

    invoke-static/range {v9 .. v14}, Lhd;->c(Ljava/util/ArrayList;ILjava/util/ArrayList;Lp00;Ll00;Landroid/widget/BaseAdapter;)V

    new-instance v6, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v10, -0x1

    const/16 v13, 0x50

    invoke-static {v13}, Lmp;->q(I)I

    move-result v13

    invoke-direct {v4, v10, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x50

    iput v10, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v6, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v4, 0x18

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    const/16 v10, 0xc

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    const/16 v13, 0x18

    invoke-static {v13}, Lmp;->q(I)I

    move-result v13

    const/16 v14, 0x10

    invoke-static {v14}, Lmp;->q(I)I

    move-result v14

    invoke-virtual {v6, v4, v10, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    const/4 v4, 0x0

    invoke-static/range {v47 .. v47}, Landroid/graphics/Color;->red(I)I

    move-result v10

    invoke-static/range {v47 .. v47}, Landroid/graphics/Color;->green(I)I

    move-result v13

    invoke-static/range {v47 .. v47}, Landroid/graphics/Color;->blue(I)I

    move-result v14

    invoke-static {v4, v10, v13, v14}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    new-instance v10, Landroid/graphics/drawable/GradientDrawable;

    sget-object v13, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    const/4 v14, 0x3

    new-array v14, v14, [I

    const/16 v16, 0x0

    aput v4, v14, v16

    const/4 v4, 0x1

    aput v47, v14, v4

    const/4 v4, 0x2

    aput v47, v14, v4

    invoke-direct {v10, v13, v14}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    invoke-virtual {v6, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v4, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v10, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v10, :cond_58

    const/16 v10, 0x62

    sput v10, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v10, "\u06e1\u06e0\u06e5"

    invoke-static {v10}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v20, v4

    move-object/from16 v21, v6

    move/from16 v76, v10

    goto/16 :goto_0

    :cond_58
    const-string v10, "\u06df\u06e8\u06e6"

    move-object/from16 v13, v55

    goto/16 :goto_17

    :sswitch_6c
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v4

    if-gtz v4, :cond_5a

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-object/from16 v56, v57

    :cond_59
    const-string v4, "\u06e6\u06e1\u06e3"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_5a
    const-string v4, "\u06e2\u06e2\u06e4"

    move-object/from16 v6, v57

    goto/16 :goto_19

    :cond_5b
    :sswitch_6d
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v6, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    mul-int/lit16 v6, v6, -0x1d0a

    rem-int/2addr v4, v6

    if-ltz v4, :cond_5c

    const-string v10, "\u06df\u06e5\u06df"

    move-object/from16 v4, v62

    move-object/from16 v6, v63

    goto/16 :goto_1a

    :cond_5c
    const-string v4, "\u06e3\u06e7\u06e0"

    invoke-static {v4}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_6e
    move-object/from16 v0, v20

    move/from16 v1, v46

    invoke-static {v0, v1}, Lc0;->B(Landroid/widget/TextView;I)V

    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    if-ltz v4, :cond_59

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v4, "\u06e3\u06df\u06df"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_6f
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    if-ltz v4, :cond_5d

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    const-string v4, "\u06e6\u06e6\u06e2"

    invoke-static {v4}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_5d
    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v6, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    mul-int/2addr v4, v6

    const v6, 0x1c98d1

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_70
    const/4 v4, 0x1

    move-object/from16 v0, v34

    invoke-virtual {v0, v4}, Landroid/view/View;->setClickable(Z)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move/from16 v0, v47

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v6, 0x8

    new-array v6, v6, [F

    const/4 v10, 0x0

    const/high16 v13, 0x42000000    # 32.0f

    invoke-static {v13}, Lmp;->p(F)F

    move-result v13

    aput v13, v6, v10

    const/4 v10, 0x1

    const/high16 v13, 0x42000000    # 32.0f

    invoke-static {v13}, Lmp;->p(F)F

    move-result v13

    aput v13, v6, v10

    const/4 v10, 0x2

    const/high16 v13, 0x42000000    # 32.0f

    invoke-static {v13}, Lmp;->p(F)F

    move-result v13

    aput v13, v6, v10

    const/4 v10, 0x3

    const/high16 v13, 0x42000000    # 32.0f

    invoke-static {v13}, Lmp;->p(F)F

    move-result v13

    aput v13, v6, v10

    const/4 v10, 0x4

    const/4 v13, 0x0

    aput v13, v6, v10

    const/4 v10, 0x5

    const/4 v13, 0x0

    aput v13, v6, v10

    const/4 v10, 0x6

    const/4 v13, 0x0

    aput v13, v6, v10

    const/4 v10, 0x7

    const/4 v13, 0x0

    aput v13, v6, v10

    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/high16 v4, 0x41c00000    # 24.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v4

    move-object/from16 v0, v34

    invoke-virtual {v0, v4}, Landroid/view/View;->setElevation(F)V

    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lg40;->g(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    move-result-object v4

    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v10, -0x1

    const/4 v13, -0x1

    invoke-direct {v6, v10, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x50

    invoke-static {v10}, Lmp;->q(I)I

    move-result v10

    iput v10, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v6, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v10, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    div-int/2addr v6, v10

    const v10, 0xdc43

    xor-int/2addr v6, v10

    move-object/from16 v66, v4

    move/from16 v76, v6

    goto/16 :goto_0

    :sswitch_71
    :try_start_14
    invoke-static/range {v36 .. v36}, Li50;->F(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_29

    new-instance v6, Led;

    move-object/from16 v0, v42

    move-object/from16 v1, v36

    move/from16 v2, v74

    invoke-direct {v6, v0, v1, v2}, Led;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    const-string v4, "\u06e8\u06e1\u06e3"

    goto/16 :goto_9

    :sswitch_72
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v6, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sub-int/2addr v4, v6

    const v6, 0x1ac526

    add-int/2addr v4, v6

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_5e
    :sswitch_73
    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v4

    if-ltz v4, :cond_5f

    const/16 v4, 0x44

    sput v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    const-string v4, "\u06e0\u06e1\u06df"

    invoke-static {v4}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_5f
    const-string v4, "\u06e0\u06e2\u06e3"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :sswitch_74
    const/high16 v4, 0x3f000000    # 0.5f

    move-object/from16 v0, v61

    invoke-virtual {v0, v4}, Landroid/view/Window;->setDimAmount(F)V

    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v6, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    add-int/lit16 v6, v6, 0xd7a

    sub-int/2addr v4, v6

    if-ltz v4, :cond_60

    const/16 v4, 0x61

    sput v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v4, "\u06e4\u06df\u06e0"

    invoke-static {v4}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v76, v4

    goto/16 :goto_0

    :cond_60
    const-string v4, "\u06e2\u06e7\u06e8"

    goto/16 :goto_a

    :cond_61
    :sswitch_75
    const-string v4, "\u06e5\u06e1\u06df"

    goto/16 :goto_1c

    :cond_62
    :sswitch_76
    const-string v4, "\u06e8\u06e7\u06e7"

    goto/16 :goto_12

    :sswitch_77
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc04 -> :sswitch_0
        0xdc22 -> :sswitch_4a
        0xdc24 -> :sswitch_13
        0xdc26 -> :sswitch_33
        0xdc42 -> :sswitch_20
        0xdc5d -> :sswitch_77
        0xdc7e -> :sswitch_3d
        0xdc82 -> :sswitch_4b
        0xdcbd -> :sswitch_4f
        0xdcde -> :sswitch_9
        0x1aa704 -> :sswitch_2d
        0x1aa707 -> :sswitch_4
        0x1aa71e -> :sswitch_19
        0x1aa741 -> :sswitch_4c
        0x1aa745 -> :sswitch_16
        0x1aa77b -> :sswitch_25
        0x1aa77f -> :sswitch_35
        0x1aa780 -> :sswitch_18
        0x1aa782 -> :sswitch_2b
        0x1aa7a2 -> :sswitch_13
        0x1aa7dc -> :sswitch_53
        0x1aa7dd -> :sswitch_73
        0x1aa7e0 -> :sswitch_6c
        0x1aa819 -> :sswitch_b
        0x1aa81c -> :sswitch_69
        0x1aa81d -> :sswitch_1a
        0x1aa81e -> :sswitch_68
        0x1aaae6 -> :sswitch_5a
        0x1aab06 -> :sswitch_38
        0x1aab1d -> :sswitch_43
        0x1aab1e -> :sswitch_3b
        0x1aab1f -> :sswitch_36
        0x1aab21 -> :sswitch_3a
        0x1aab25 -> :sswitch_67
        0x1aab45 -> :sswitch_2
        0x1aab5f -> :sswitch_5d
        0x1aab7a -> :sswitch_1e
        0x1aab7c -> :sswitch_5b
        0x1aab7d -> :sswitch_8
        0x1aabd9 -> :sswitch_3
        0x1aabdb -> :sswitch_60
        0x1aabe0 -> :sswitch_6
        0x1aae83 -> :sswitch_56
        0x1aaea6 -> :sswitch_1d
        0x1aaee6 -> :sswitch_52
        0x1aaf06 -> :sswitch_62
        0x1aaf3d -> :sswitch_58
        0x1aaf63 -> :sswitch_46
        0x1aafa1 -> :sswitch_61
        0x1ab242 -> :sswitch_d
        0x1ab24a -> :sswitch_e
        0x1ab281 -> :sswitch_40
        0x1ab2a2 -> :sswitch_68
        0x1ab2a4 -> :sswitch_42
        0x1ab2a6 -> :sswitch_21
        0x1ab2a7 -> :sswitch_37
        0x1ab2c2 -> :sswitch_f
        0x1ab2dd -> :sswitch_2e
        0x1ab31c -> :sswitch_2
        0x1ab31e -> :sswitch_5
        0x1ab320 -> :sswitch_57
        0x1ab322 -> :sswitch_75
        0x1ab323 -> :sswitch_1b
        0x1ab33b -> :sswitch_d
        0x1ab33c -> :sswitch_26
        0x1ab343 -> :sswitch_24
        0x1ab35a -> :sswitch_29
        0x1ab35b -> :sswitch_76
        0x1ab603 -> :sswitch_70
        0x1ab643 -> :sswitch_6a
        0x1ab646 -> :sswitch_5e
        0x1ab683 -> :sswitch_1
        0x1ab687 -> :sswitch_13
        0x1ab6a5 -> :sswitch_31
        0x1ab6e1 -> :sswitch_50
        0x1ab6fc -> :sswitch_30
        0x1ab6fe -> :sswitch_12
        0x1ab71d -> :sswitch_63
        0x1ab9c5 -> :sswitch_65
        0x1ab9c8 -> :sswitch_23
        0x1aba04 -> :sswitch_3c
        0x1aba46 -> :sswitch_54
        0x1aba47 -> :sswitch_2a
        0x1aba5f -> :sswitch_44
        0x1aba60 -> :sswitch_22
        0x1aba65 -> :sswitch_3e
        0x1aba80 -> :sswitch_11
        0x1aba84 -> :sswitch_4e
        0x1abd8b -> :sswitch_1
        0x1abd8d -> :sswitch_71
        0x1abda4 -> :sswitch_39
        0x1abdc3 -> :sswitch_77
        0x1abdc4 -> :sswitch_28
        0x1abdc5 -> :sswitch_6d
        0x1abe04 -> :sswitch_64
        0x1abe21 -> :sswitch_45
        0x1abe26 -> :sswitch_4b
        0x1abe60 -> :sswitch_14
        0x1abe61 -> :sswitch_1c
        0x1abe62 -> :sswitch_27
        0x1abe67 -> :sswitch_10
        0x1ac146 -> :sswitch_5c
        0x1ac14e -> :sswitch_32
        0x1ac167 -> :sswitch_38
        0x1ac186 -> :sswitch_59
        0x1ac188 -> :sswitch_34
        0x1ac18a -> :sswitch_66
        0x1ac18c -> :sswitch_48
        0x1ac1ac -> :sswitch_2
        0x1ac1c6 -> :sswitch_15
        0x1ac200 -> :sswitch_6e
        0x1ac202 -> :sswitch_5f
        0x1ac222 -> :sswitch_22
        0x1ac224 -> :sswitch_2f
        0x1ac243 -> :sswitch_55
        0x1ac509 -> :sswitch_47
        0x1ac50a -> :sswitch_40
        0x1ac52d -> :sswitch_1f
        0x1ac54d -> :sswitch_c
        0x1ac567 -> :sswitch_d
        0x1ac5aa -> :sswitch_69
        0x1ac5c2 -> :sswitch_23
        0x1ac5c4 -> :sswitch_74
        0x1ac5c7 -> :sswitch_2c
        0x1ac5e2 -> :sswitch_72
        0x1ac5e4 -> :sswitch_6f
        0x1ac8c8 -> :sswitch_41
        0x1ac8cd -> :sswitch_49
        0x1ac8ce -> :sswitch_4d
        0x1ac8e8 -> :sswitch_51
        0x1ac90a -> :sswitch_17
        0x1ac946 -> :sswitch_3f
        0x1ac964 -> :sswitch_7
        0x1ac9a6 -> :sswitch_2a
        0x1ac9c8 -> :sswitch_a
        0x1ac9e4 -> :sswitch_6b
    .end sparse-switch
.end method

.method public static final b(Landroid/widget/TextView;Ll00;Lsn;Landroid/widget/TextView;)V
    .locals 18

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/16 v16, 0x0

    const/4 v11, 0x0

    const-string v13, "\u06e0\u06e6\u06e2"

    invoke-static {v13}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v15

    move v13, v3

    :goto_0
    sparse-switch v15, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    mul-int/2addr v3, v15

    const v15, 0x1865ad

    add-int/2addr v3, v15

    move v15, v3

    goto :goto_0

    :sswitch_1
    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v11, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/lit16 v11, v11, -0x483

    xor-int/2addr v3, v11

    if-gtz v3, :cond_0

    const/16 v3, 0x61

    sput v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v3, "\u06e5\u06e5\u06e6"

    :goto_1
    invoke-static {v3}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    move/from16 v11, v16

    goto :goto_0

    :cond_0
    const-string v3, "\u06df\u06e7\u06e6"

    goto :goto_1

    :sswitch_2
    move-object/from16 v0, p2

    iget v6, v0, Lsn;->f:I

    move-object/from16 v0, p2

    iget v7, v0, Lsn;->e:I

    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v3, :cond_1

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v3, "\u06e6\u06e2\u06e4"

    :goto_2
    invoke-static {v3}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto :goto_0

    :cond_1
    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v15, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sub-int/2addr v3, v15

    const v15, 0x1ac1c3

    add-int/2addr v3, v15

    move v15, v3

    goto :goto_0

    :sswitch_3
    const/4 v3, 0x0

    xor-int/lit8 v15, v13, -0x1

    and-int/lit8 v15, v15, 0x1

    and-int/lit8 v17, v13, -0x2

    or-int v15, v15, v17

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    move-object/from16 v0, p1

    iget-boolean v3, v0, Ll00;->a:Z

    if-eqz v3, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v3

    if-ltz v3, :cond_2

    const/16 v3, 0x13

    sput v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v3, "\u06e0\u06df"

    :goto_3
    invoke-static {v3}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto :goto_0

    :cond_2
    const-string v3, "\u06e4\u06e5\u06e4"

    goto :goto_3

    :sswitch_4
    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v15, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    add-int/lit16 v15, v15, -0x98a

    add-int/2addr v3, v15

    if-ltz v3, :cond_3

    const-string v3, "\u06e0\u06df\u06e7"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_3
    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v15, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sub-int/2addr v3, v15

    const v15, 0x1ac248

    add-int/2addr v3, v15

    move v15, v3

    goto/16 :goto_0

    :sswitch_5
    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, p1

    iget-boolean v3, v0, Ll00;->a:Z

    if-nez v3, :cond_14

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    if-gtz v3, :cond_4

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move v3, v8

    :goto_4
    const-string v8, "\u06e5\u06e8\u06e8"

    invoke-static {v8}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v15

    move v8, v3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e4\u06e0\u06e2"

    :goto_5
    invoke-static {v3}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_5
    :sswitch_6
    sget v3, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v15, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    xor-int/2addr v3, v15

    const v15, 0x1aa48f

    xor-int/2addr v3, v15

    move v15, v3

    goto/16 :goto_0

    :sswitch_7
    sget v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v3, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    add-int/2addr v1, v3

    const v3, -0x1ab57a

    xor-int/2addr v3, v1

    move-object v1, v5

    move v15, v3

    goto/16 :goto_0

    :cond_6
    :sswitch_8
    sget v3, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v15, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v15, v15, 0x832

    add-int/2addr v3, v15

    if-ltz v3, :cond_7

    const/16 v3, 0x39

    sput v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v3, "\u06e5\u06e5\u06e3"

    goto :goto_5

    :cond_7
    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v15, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sub-int/2addr v3, v15

    const v15, 0x1abe78

    xor-int/2addr v3, v15

    move v15, v3

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v3

    if-gtz v3, :cond_8

    const-string v3, "\u06e8\u06e8\u06e0"

    invoke-static {v3}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e8\u06e5\u06e0"

    :goto_6
    invoke-static {v3}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v0, p1

    iget-boolean v3, v0, Ll00;->a:Z

    sget v13, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v15, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sub-int/2addr v13, v15

    const v15, -0x1aa5b3

    xor-int/2addr v15, v13

    move v13, v3

    goto/16 :goto_0

    :sswitch_b
    move-object v3, v9

    :cond_9
    sget v9, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v15, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    or-int/2addr v9, v15

    const v15, 0xdefd    # 7.9993E-41f

    add-int/2addr v15, v9

    move-object v9, v3

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, p3

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v3, 0x0

    move-object/from16 v0, p1

    iget-boolean v15, v0, Ll00;->a:Z

    move-object/from16 v0, p3

    invoke-virtual {v0, v3, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v3

    if-gtz v3, :cond_a

    const/4 v3, 0x1

    sput v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    const-string v3, "\u06e5\u06e4\u06e4"

    :goto_7
    invoke-static {v3}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e7\u06e3\u06e8"

    goto :goto_7

    :sswitch_d
    sget v3, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v12, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/2addr v3, v12

    const v12, 0x1ab324

    add-int/2addr v3, v12

    move-object v12, v9

    move v15, v3

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v3

    if-ltz v3, :cond_b

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move v3, v8

    :goto_8
    const-string v10, "\u06e4\u06e1\u06e7"

    invoke-static {v10}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v15

    move v10, v3

    goto/16 :goto_0

    :cond_b
    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v10, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    mul-int/2addr v3, v10

    const v10, 0x1fb4d4

    add-int/2addr v3, v10

    move v15, v3

    move v10, v8

    goto/16 :goto_0

    :sswitch_f
    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v3, :cond_c

    const-string v3, "\u06df\u06e5\u06e1"

    invoke-static {v3}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_c
    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v15, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    or-int/2addr v3, v15

    const v15, 0x1ac30b

    add-int/2addr v3, v15

    move v15, v3

    goto/16 :goto_0

    :sswitch_10
    move-object v2, v9

    move-object v3, v9

    :goto_9
    const-string v9, "\u06df\u06e4\u06e7"

    invoke-static {v9}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v15

    move-object v9, v3

    goto/16 :goto_0

    :sswitch_11
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    const/4 v9, 0x0

    invoke-direct {v3, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    move-object/from16 v0, p1

    iget-boolean v9, v0, Ll00;->a:Z

    if-nez v9, :cond_9

    sget v9, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v15, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int/lit16 v15, v15, 0xa73

    rem-int/2addr v9, v15

    if-ltz v9, :cond_d

    const/16 v9, 0x31

    sput v9, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    goto :goto_9

    :cond_d
    sget v9, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v15, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/2addr v9, v15

    const v15, -0x1abe53

    xor-int/2addr v15, v9

    move-object v9, v3

    goto/16 :goto_0

    :sswitch_12
    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v10, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    rem-int/lit16 v10, v10, -0x2435

    sub-int/2addr v3, v10

    if-ltz v3, :cond_e

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    const-string v3, "\u06e0\u06e5\u06e2"

    invoke-static {v3}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    move v10, v7

    goto/16 :goto_0

    :cond_e
    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v10, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sub-int/2addr v3, v10

    const v10, -0xdf4c

    xor-int/2addr v3, v10

    move v15, v3

    move v10, v7

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v0, p3

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move v3, v10

    move v11, v6

    goto/16 :goto_8

    :sswitch_14
    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v3

    if-gtz v3, :cond_f

    const/16 v3, 0xd

    sput v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v3, "\u06e8\u06e0\u06e4"

    invoke-static {v3}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v5

    move v15, v3

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u06e0\u06df\u06e7"

    move-object v4, v5

    goto/16 :goto_2

    :sswitch_15
    move-object/from16 v0, p1

    iget-boolean v3, v0, Ll00;->a:Z

    if-eqz v3, :cond_5

    sget v3, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v15, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    add-int/2addr v3, v15

    const v15, 0x1ac6a7

    add-int/2addr v3, v15

    move v15, v3

    move/from16 v16, v7

    goto/16 :goto_0

    :sswitch_16
    sget v3, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v15, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    mul-int/2addr v3, v15

    const v15, -0x1aa970

    xor-int/2addr v3, v15

    move v15, v3

    goto/16 :goto_0

    :sswitch_17
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, p2

    iget v3, v0, Lsn;->b:I

    sget v14, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v15, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sub-int/2addr v14, v15

    const v15, 0xe094

    add-int/2addr v15, v14

    move v14, v3

    goto/16 :goto_0

    :sswitch_18
    sget v3, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    div-int/lit16 v4, v4, 0x14a3

    xor-int/2addr v3, v4

    if-ltz v3, :cond_10

    const/16 v3, 0x50

    sput v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v3, "\u06e1\u06e1\u06e1"

    invoke-static {v3}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v12

    move v15, v3

    goto/16 :goto_0

    :cond_10
    const-string v3, "\u06e0\u06e5\u06e2"

    invoke-static {v3}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v12

    move v15, v3

    goto/16 :goto_0

    :sswitch_19
    invoke-virtual {v5, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v3, 0x42c80000    # 100.0f

    invoke-static {v3}, Lmp;->p(F)F

    move-result v3

    invoke-virtual {v5, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    sget v3, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v15, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/lit16 v15, v15, 0x777

    or-int/2addr v3, v15

    if-gtz v3, :cond_12

    const-string v3, "\u06df\u06df\u06e2"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :sswitch_1a
    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v15, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/2addr v3, v15

    const v15, 0x1aa999

    xor-int/2addr v3, v15

    move v15, v3

    goto/16 :goto_0

    :sswitch_1b
    move v3, v6

    goto/16 :goto_4

    :sswitch_1c
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v3

    if-ltz v3, :cond_11

    const-string v3, "\u06e7\u06e8\u06e0"

    goto/16 :goto_6

    :cond_11
    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v15, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sub-int/2addr v3, v15

    const v15, 0x1acb36

    add-int/2addr v3, v15

    move v15, v3

    goto/16 :goto_0

    :sswitch_1d
    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    rem-int/lit16 v3, v3, 0x1c4b

    or-int/2addr v1, v3

    if-ltz v1, :cond_13

    const/16 v1, 0x5e

    sput v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    move-object v1, v2

    :cond_12
    const-string v3, "\u06e1\u06e5\u06e0"

    invoke-static {v3}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_13
    const-string v1, "\u06e8\u06e5\u06e0"

    invoke-static {v1}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v2

    move v15, v3

    goto/16 :goto_0

    :cond_14
    :sswitch_1e
    sget v3, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/2addr v3, v15

    const v15, -0x1ac131

    xor-int/2addr v3, v15

    move v15, v3

    goto/16 :goto_0

    :sswitch_1f
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_0
        0xdc63 -> :sswitch_2
        0xdc83 -> :sswitch_4
        0xdc9d -> :sswitch_1c
        0xdcfa -> :sswitch_d
        0x1aa702 -> :sswitch_3
        0x1aa7a2 -> :sswitch_1d
        0x1aa7bb -> :sswitch_b
        0x1aa7fe -> :sswitch_c
        0x1aaac8 -> :sswitch_f
        0x1aab1e -> :sswitch_1e
        0x1aab1f -> :sswitch_8
        0x1aab7d -> :sswitch_5
        0x1aab9c -> :sswitch_17
        0x1aaec1 -> :sswitch_9
        0x1aaf3c -> :sswitch_11
        0x1aaf40 -> :sswitch_9
        0x1ab324 -> :sswitch_18
        0x1ab6c6 -> :sswitch_16
        0x1ab6fd -> :sswitch_6
        0x1ab9e6 -> :sswitch_12
        0x1aba0a -> :sswitch_15
        0x1aba83 -> :sswitch_7
        0x1abe05 -> :sswitch_10
        0x1abe25 -> :sswitch_1a
        0x1abe46 -> :sswitch_14
        0x1abea5 -> :sswitch_e
        0x1ac1a8 -> :sswitch_1b
        0x1ac204 -> :sswitch_0
        0x1ac266 -> :sswitch_19
        0x1ac568 -> :sswitch_1c
        0x1ac58c -> :sswitch_1f
        0x1ac8ea -> :sswitch_1
        0x1ac8ec -> :sswitch_a
        0x1ac983 -> :sswitch_13
    .end sparse-switch
.end method

.method public static final c(Ljava/util/ArrayList;ILjava/util/ArrayList;Lp00;Ll00;Landroid/widget/BaseAdapter;)V
    .locals 21

    const/4 v8, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v9, 0x0

    const-string v18, "\u06e4\u06e3\u06df"

    invoke-static/range {v18 .. v18}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v20

    move-object/from16 v18, v2

    move/from16 v19, v17

    :goto_0
    sparse-switch v20, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    if-ltz v2, :cond_1c

    const-string v2, "\u06e0\u06e2\u06e5"

    :goto_1
    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto :goto_0

    :sswitch_1
    const/4 v10, 0x0

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v17, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    xor-int v2, v2, v17

    const v17, 0x1ab429

    add-int v2, v2, v17

    move/from16 v20, v2

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p3

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_e

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v17, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    move/from16 v0, v17

    rem-int/lit16 v0, v0, 0xbd2

    move/from16 v17, v0

    mul-int v2, v2, v17

    if-ltz v2, :cond_0

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v2, "\u06e4\u06e3\u06df"

    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto :goto_0

    :cond_0
    move-object v2, v13

    :goto_2
    const-string v13, "\u06e3\u06e7\u06e6"

    invoke-static {v13}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v17

    move-object v13, v2

    move/from16 v20, v17

    goto :goto_0

    :sswitch_3
    move-object v2, v3

    check-cast v2, Led;

    iget-boolean v2, v2, Led;->c:Z

    move-object/from16 v0, p4

    iget-boolean v0, v0, Ll00;->a:Z

    move/from16 v17, v0

    move/from16 v0, v17

    if-ne v2, v0, :cond_13

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v17, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, -0xf6a

    move/from16 v17, v0

    sub-int v2, v2, v17

    if-gtz v2, :cond_1

    const-string v2, "\u06e3\u06df\u06e4"

    :goto_3
    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e3\u06e2\u06e2"

    :goto_4
    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_4
    const-string v2, "U+9UpKEuStZG833j+GUWvA==\n"

    const-string v9, "J4AYy9ZLOJU=\n"

    invoke-static {v2, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v18

    invoke-static {v2, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v9, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/2addr v2, v9

    const v9, 0x1ab69e

    add-int/2addr v2, v9

    move/from16 v20, v2

    move v9, v12

    goto/16 :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    move-result v2

    if-gtz v2, :cond_2

    const/16 v2, 0x14

    sput v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v2, "\u06e6\u06e2\u06e1"

    :goto_5
    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_2
    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v17, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    mul-int v2, v2, v17

    const v17, 0x1e927c

    add-int v2, v2, v17

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-result v2

    if-gtz v2, :cond_3

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v2, "\u06e0\u06e5\u06e4"

    :goto_6
    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06df\u06e0\u06e1"

    invoke-static {v2}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_4
    :sswitch_7
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v2, :cond_5

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v2, "\u06df\u06df"

    :goto_7
    invoke-static {v2}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e8\u06e2\u06e4"

    goto :goto_7

    :sswitch_8
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v13

    sget v14, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v17, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    move/from16 v0, v17

    mul-int/lit16 v0, v0, -0x1496

    move/from16 v17, v0

    rem-int v14, v14, v17

    if-gtz v14, :cond_6

    const/16 v14, 0x1b

    sput v14, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    move v14, v13

    goto/16 :goto_2

    :cond_6
    move v14, v13

    :goto_8
    const-string v13, "\u06e3\u06e6\u06e6"

    invoke-static {v13}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v17

    move-object v13, v2

    move/from16 v20, v17

    goto/16 :goto_0

    :cond_7
    :sswitch_9
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v17, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    div-int v2, v2, v17

    const v17, 0x1aba7f

    add-int v2, v2, v17

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_8
    :sswitch_a
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v2, :cond_9

    const-string v2, "\u06e6\u06e6\u06e3"

    :goto_9
    invoke-static {v2}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_9
    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v17, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    or-int v2, v2, v17

    const v17, -0x1aab06

    xor-int v2, v2, v17

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_a
    :sswitch_b
    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v2, :cond_b

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    const-string v2, "\u06e6\u06e8\u06e6"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_b
    const-string v2, "\u06e6\u06e5\u06e8"

    :goto_a
    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_c
    move/from16 v0, v16

    move/from16 v1, v19

    if-ge v0, v1, :cond_4

    move/from16 v0, v16

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v17, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    move/from16 v0, v17

    add-int/lit16 v0, v0, -0x80a

    move/from16 v17, v0

    rem-int v2, v2, v17

    if-gtz v2, :cond_c

    const/16 v2, 0x3a

    sput v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v2, "\u06df\u06e4\u06df"

    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e0\u06e6\u06e7"

    goto :goto_9

    :sswitch_d
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v17, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    move/from16 v0, v17

    rem-int/lit16 v0, v0, -0x1247

    move/from16 v17, v0

    xor-int v2, v2, v17

    if-ltz v2, :cond_d

    const/16 v2, 0x49

    sput v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    move-object v2, v13

    goto/16 :goto_8

    :cond_d
    const-string v2, "\u06e2\u06e4\u06e4"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_e
    :sswitch_e
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v2, :cond_f

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v2, "\u06e1\u06e5\u06e5"

    :goto_b
    invoke-static {v2}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_f
    const-string v2, "\u06e4\u06e1"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v2

    if-gtz v2, :cond_10

    const-string v2, "\u06e2\u06e4\u06e3"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_10
    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v17, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    rem-int v2, v2, v17

    const v17, 0x1aab93

    add-int v2, v2, v17

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_10
    const/4 v11, 0x0

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v17, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    move/from16 v0, v17

    add-int/lit16 v0, v0, -0x17f6

    move/from16 v17, v0

    mul-int v2, v2, v17

    if-gtz v2, :cond_11

    const-string v2, "\u06e6\u06e2\u06e7"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_11
    const-string v2, "\u06e1\u06e7\u06e7"

    goto/16 :goto_5

    :sswitch_11
    invoke-virtual/range {p5 .. p5}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    if-ltz v2, :cond_12

    const-string v2, "\u06e2\u06e8\u06e6"

    invoke-static {v2}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_12
    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v17, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    xor-int v2, v2, v17

    const v17, 0x1abdd2

    add-int v2, v2, v17

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_12
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v16, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    mul-int v2, v2, v16

    const v16, -0x1e0a23

    xor-int v2, v2, v16

    move/from16 v20, v2

    move/from16 v16, v11

    goto/16 :goto_0

    :cond_13
    :sswitch_13
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v17, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    mul-int v2, v2, v17

    const v17, 0x1a0d7d

    add-int v2, v2, v17

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v2

    if-ltz v2, :cond_14

    const/16 v2, 0x46

    sput v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v2, "\u06e5\u06e2\u06e8"

    goto/16 :goto_a

    :cond_14
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v17, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int v2, v2, v17

    const v17, 0x1abf32

    add-int v2, v2, v17

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_15
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v2, v2, -0x319

    add-int v16, v16, v2

    const-string v2, "\u06e6\u06e6\u06e4"

    move/from16 v15, v16

    move/from16 v17, v16

    :goto_c
    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    move/from16 v16, v17

    goto/16 :goto_0

    :sswitch_16
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v9, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    xor-int/lit16 v9, v9, -0xcbf

    or-int/2addr v2, v9

    if-gtz v2, :cond_15

    const/16 v2, 0x56

    sput v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    const-string v2, "\u06e5\u06e3\u06e5"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    move v9, v12

    goto/16 :goto_0

    :cond_15
    const-string v2, "\u06e3\u06df\u06e4"

    move v9, v12

    goto/16 :goto_7

    :sswitch_17
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v17, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    div-int v2, v2, v17

    const v17, 0x1abe05

    add-int v2, v2, v17

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_18
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v17, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    move/from16 v0, v17

    div-int/lit16 v0, v0, 0x10c

    move/from16 v17, v0

    xor-int v2, v2, v17

    if-gtz v2, :cond_16

    const-string v2, "\u06e5\u06e1\u06e3"

    goto/16 :goto_4

    :cond_16
    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v17, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    or-int v2, v2, v17

    const v17, 0x1ab663

    add-int v2, v2, v17

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_19
    const/4 v2, 0x1

    move/from16 v0, p1

    if-ne v0, v2, :cond_7

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v2, :cond_17

    const/16 v2, 0x5a

    sput v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v2, "\u06e1\u06e7"

    move-object v7, v8

    move/from16 v17, v16

    goto :goto_c

    :cond_17
    const-string v2, "\u06e1\u06e7"

    move-object v7, v8

    goto/16 :goto_b

    :sswitch_1a
    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v2, :cond_18

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v2, "\u06e3\u06e0\u06e1"

    invoke-static {v2}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    move v9, v10

    goto/16 :goto_0

    :cond_18
    const-string v2, "\u06e0\u06e2\u06e5"

    move v9, v10

    goto/16 :goto_b

    :sswitch_1b
    move-object/from16 v0, p3

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    const/16 v17, 0x0

    move-object/from16 v0, v18

    move/from16 v1, v17

    invoke-static {v0, v2, v1}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v17, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, 0x6a1

    move/from16 v17, v0

    div-int v2, v2, v17

    if-eqz v2, :cond_19

    const-string v2, "\u06e4\u06e6\u06e5"

    invoke-static {v2}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_19
    const-string v2, "\u06e0\u06e6\u06e3"

    goto/16 :goto_6

    :sswitch_1c
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->clear()V

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v2, :cond_1a

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v2, "\u06df\u06e4\u06e5"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v8, p2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_1a
    const-string v2, "\u06e6\u06e8\u06df"

    move-object/from16 v8, p2

    goto/16 :goto_3

    :sswitch_1d
    if-ge v9, v14, :cond_a

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v17, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    move/from16 v0, v17

    or-int/lit16 v0, v0, -0x757

    move/from16 v17, v0

    rem-int v2, v2, v17

    if-gtz v2, :cond_1b

    const-string v2, "\u06e4\u06e5\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v20, v2

    goto/16 :goto_0

    :cond_1b
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v17, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    mul-int v2, v2, v17

    const v17, 0x1b31ac

    add-int v2, v2, v17

    move/from16 v20, v2

    goto/16 :goto_0

    :sswitch_1e
    const-string v2, "\u06e5\u06e4\u06e1"

    move-object v7, v5

    goto/16 :goto_4

    :sswitch_1f
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/lit8 v2, v2, -0x73

    add-int v12, v9, v2

    move-object v2, v4

    check-cast v2, Led;

    iget-object v2, v2, Led;->b:Ljava/lang/String;

    sget-object v17, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v0, v17

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    sget v17, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v18, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sub-int v17, v17, v18

    const v18, 0xda7c

    add-int v17, v17, v18

    move-object/from16 v18, v2

    move/from16 v20, v17

    goto/16 :goto_0

    :cond_1c
    const-string v2, "\u06e6\u06e2\u06e7"

    goto/16 :goto_1

    :sswitch_20
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v16, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int v2, v2, v16

    const v16, 0x1ac1a7

    add-int v2, v2, v16

    move/from16 v20, v2

    move/from16 v16, v15

    goto/16 :goto_0

    :sswitch_21
    const-string v2, "\u06e7\u06e4"

    move-object v5, v6

    goto/16 :goto_b

    :sswitch_22
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2

    sget v17, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v19, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    move/from16 v0, v19

    mul-int/lit16 v0, v0, -0x1d4f

    move/from16 v19, v0

    or-int v17, v17, v19

    if-gtz v17, :cond_1d

    const-string v17, "\u06e0\u06e6\u06e7"

    invoke-static/range {v17 .. v17}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v17

    move/from16 v19, v2

    move/from16 v20, v17

    goto/16 :goto_0

    :cond_1d
    sget v17, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v19, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int v17, v17, v19

    const v19, 0x1abade

    add-int v17, v17, v19

    move/from16 v19, v2

    move/from16 v20, v17

    goto/16 :goto_0

    :sswitch_23
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc26 -> :sswitch_0
        0xdc7d -> :sswitch_8
        0xdcbc -> :sswitch_4
        0xdcdd -> :sswitch_1e
        0x1aa720 -> :sswitch_5
        0x1aa79a -> :sswitch_a
        0x1aa7a0 -> :sswitch_9
        0x1aab23 -> :sswitch_1d
        0x1aab7f -> :sswitch_13
        0x1aab9d -> :sswitch_16
        0x1aaba1 -> :sswitch_15
        0x1aabdf -> :sswitch_14
        0x1aaf81 -> :sswitch_12
        0x1ab2a7 -> :sswitch_b
        0x1ab2e1 -> :sswitch_c
        0x1ab2e2 -> :sswitch_a
        0x1ab359 -> :sswitch_7
        0x1ab360 -> :sswitch_e
        0x1ab608 -> :sswitch_d
        0x1ab624 -> :sswitch_1a
        0x1ab663 -> :sswitch_20
        0x1ab69e -> :sswitch_1b
        0x1ab6e3 -> :sswitch_1
        0x1ab702 -> :sswitch_6
        0x1ab71c -> :sswitch_18
        0x1aba40 -> :sswitch_1c
        0x1aba7f -> :sswitch_22
        0x1abaa3 -> :sswitch_5
        0x1abade -> :sswitch_10
        0x1abde5 -> :sswitch_23
        0x1abe07 -> :sswitch_11
        0x1abe22 -> :sswitch_2
        0x1abe45 -> :sswitch_f
        0x1ac1ab -> :sswitch_14
        0x1ac209 -> :sswitch_17
        0x1ac224 -> :sswitch_3
        0x1ac25d -> :sswitch_19
        0x1ac584 -> :sswitch_13
        0x1ac90c -> :sswitch_1f
        0x1ac92a -> :sswitch_21
    .end sparse-switch
.end method

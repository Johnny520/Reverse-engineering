.class public final Lr80;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/SensorEventListener;


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e8\u06e3"

    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v1, "\u06e1\u06e4\u06e8"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e0\u06e5\u06e2"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v1

    if-gtz v1, :cond_1

    const-string v1, "\u06e8\u06e3\u06df"

    :goto_1
    invoke-static {v1}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    :sswitch_3
    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sub-int/2addr v1, v2

    const v2, 0x1aab2b

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    const-string v0, "H1H7Wj6tXv0CIIOkMv"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->۟ۥۡۥۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v1

    if-gtz v1, :cond_2

    const-string v1, "\u06e2\u06e4\u06e0"

    goto :goto_1

    :cond_2
    sget v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/2addr v1, v2

    const v2, 0x1ac8f7

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    sget v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit16 v2, v2, 0x23e7

    div-int/2addr v1, v2

    if-eqz v1, :cond_3

    const-string v1, "\u06e4\u06e6\u06e4"

    :goto_2
    invoke-static {v1}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e1\u06e8\u06e3"

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab7d -> :sswitch_0
        0x1aaf25 -> :sswitch_5
        0x1aaf9c -> :sswitch_2
        0x1ab2de -> :sswitch_3
        0x1ac944 -> :sswitch_4
        0x1ac966 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 22

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/16 v16, 0x0

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v14, 0x0

    const/4 v13, 0x0

    const-string v11, "\u06e6\u06e0\u06e5"

    invoke-static {v11}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v11

    move/from16 v19, v2

    move/from16 v20, v10

    move/from16 v21, v11

    :goto_0
    sparse-switch v21, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-lez v1, :cond_b

    move/from16 v13, v18

    :cond_0
    const-string v2, "\u06e3\u06e1\u06e5"

    move v10, v14

    :goto_1
    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v14, v10

    move/from16 v21, v2

    goto :goto_0

    :sswitch_1
    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v2, :cond_1

    const/16 v2, 0x10

    sput v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v2, "\u06df\u06e3\u06e7"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    move/from16 v12, v20

    goto :goto_0

    :cond_1
    const-string v2, "\u06e2\u06e2\u06e3"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    move/from16 v12, v20

    goto :goto_0

    :cond_2
    :sswitch_2
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v10, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/lit16 v10, v10, -0xf2e

    mul-int/2addr v2, v10

    if-gtz v2, :cond_3

    const/16 v2, 0x36

    sput v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v2, "\u06e8\u06e3\u06e6"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :cond_3
    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v10, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    rem-int/2addr v2, v10

    const v10, 0x1abacd

    add-int/2addr v2, v10

    move/from16 v21, v2

    goto :goto_0

    :sswitch_3
    add-int/lit8 v2, v3, 0x13

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v2, v2, -0x13

    sget v10, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v10, :cond_4

    const/16 v10, 0x50

    sput v10, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v10, "\u06e8\u06e8\u06e5"

    invoke-static {v10}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v10

    move/from16 v20, v2

    move/from16 v21, v10

    goto :goto_0

    :cond_4
    sget v10, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v11, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    add-int/2addr v10, v11

    const v11, 0x1abb94

    add-int/2addr v10, v11

    move/from16 v20, v2

    move/from16 v21, v10

    goto :goto_0

    :cond_5
    :sswitch_4
    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v10, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/lit16 v10, v10, -0x1e64

    sub-int/2addr v2, v10

    if-gtz v2, :cond_6

    const-string v2, "\u06e2\u06e1\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06e2\u06e1\u06e4"

    goto :goto_2

    :sswitch_5
    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v10, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    mul-int/2addr v2, v10

    const v10, 0x1840e2

    add-int/2addr v2, v10

    move/from16 v21, v2

    move/from16 v13, v19

    goto/16 :goto_0

    :cond_7
    :sswitch_6
    const-string v2, "\u06e2\u06e1\u06e1"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_7
    const-string v2, "\u06e1\u06e5\u06e3"

    move-object v10, v2

    move v11, v8

    move v12, v5

    :goto_3
    invoke-static {v10}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move v8, v11

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/hardware/SensorEvent;->values:[F

    const/4 v6, 0x0

    aget v7, v2, v6

    const-string v2, "PGGzXSJUp14IaK9kMg==\n"

    const-string v6, "VwTKAkY9xDs=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x1

    invoke-static {v2, v6}, Lju;->o(Ljava/lang/String;I)I

    move-result v2

    add-int/lit8 v2, v2, 0x9

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v6, v2, -0x9

    const-string v2, "\u06e2\u06e4\u06df"

    :goto_4
    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_9
    const/high16 v2, -0x40400000    # -1.5f

    cmpg-float v2, v7, v2

    if-gez v2, :cond_13

    add-int/lit8 v2, v16, 0x19

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v5, v2, -0x19

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v2, :cond_8

    const-string v2, "\u06e4\u06e5\u06e1"

    :goto_5
    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_8
    move v2, v13

    :goto_6
    const-string v10, "\u06e8\u06e5\u06e2"

    invoke-static {v10}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v10

    move/from16 v21, v10

    move v13, v2

    goto/16 :goto_0

    :sswitch_a
    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v10, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    or-int/lit16 v10, v10, -0x18d3

    mul-int/2addr v2, v10

    if-ltz v2, :cond_9

    const/16 v2, 0x59

    sput v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    const-string v2, "\u06e0\u06e7\u06df"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_9
    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v10, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sub-int/2addr v2, v10

    const v10, 0x1ac1bc

    xor-int/2addr v2, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_b
    sput v12, Lg80;->t:I

    const-string v2, "CsN20OgSojkNw2n7\n"

    const-string v10, "YaYPj5pi0WY=\n"

    invoke-static {v2, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v10, 0x1

    invoke-static {v2, v10}, Lju;->o(Ljava/lang/String;I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v10, v2, -0x1

    const-string v2, "\u06e5\u06e3\u06e7"

    :goto_7
    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_c
    const-string v2, "DBE108I=\n"

    const-string v10, "aWdQvbYmIqk=\n"

    invoke-static {v2, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v2}, Landroid/hardware/Sensor;->getType()I

    move-result v2

    const/4 v10, 0x1

    if-ne v2, v10, :cond_7

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v10, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/lit16 v10, v10, 0x19a2

    sub-int/2addr v2, v10

    if-ltz v2, :cond_a

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v2, "\u06e6\u06e0\u06e5"

    goto/16 :goto_4

    :cond_a
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v10, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sub-int/2addr v2, v10

    const v10, 0x1ab31c

    xor-int/2addr v2, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_d
    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v10, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/2addr v2, v10

    const v10, -0xde7e

    xor-int/2addr v2, v10

    move/from16 v21, v2

    move v12, v6

    goto/16 :goto_0

    :cond_b
    :sswitch_e
    const-string v2, "\u06df\u06e7\u06e0"

    move/from16 v10, v18

    goto :goto_7

    :sswitch_f
    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    xor-int/lit16 v4, v2, -0xbe

    invoke-static {v15, v4}, Lju;->o(Ljava/lang/String;I)I

    move-result v3

    const-string v2, "\u06e8\u06e8\u06e5"

    goto/16 :goto_5

    :sswitch_10
    sput v13, Lg80;->u:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v10, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/lit16 v10, v10, -0xad6

    mul-int/2addr v2, v10

    if-gtz v2, :cond_c

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    move v2, v8

    :goto_8
    const-string v8, "\u06e1\u06e6"

    move-object v10, v8

    move v11, v2

    goto/16 :goto_3

    :cond_c
    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v10, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/2addr v2, v10

    const v10, 0x1ab2cf

    add-int/2addr v2, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v2

    if-gtz v2, :cond_d

    const/16 v2, 0x27

    sput v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    move v2, v14

    goto/16 :goto_6

    :cond_d
    const-string v2, "\u06e8\u06e0\u06e5"

    move v10, v14

    move v13, v14

    goto/16 :goto_1

    :sswitch_12
    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v10, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    xor-int/lit16 v10, v10, -0xfa6

    xor-int/2addr v2, v10

    if-gtz v2, :cond_e

    const-string v2, "\u06df\u06e7\u06e0"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_e
    const-string v2, "\u06e4\u06e4\u06e5"

    goto/16 :goto_2

    :sswitch_13
    const-string v2, "pGUQ74UA4gy9aQ7Ygw==\n"

    const-string v8, "zwBpsPdwkVM=\n"

    invoke-static {v2, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lju;->o(Ljava/lang/String;I)I

    move-result v2

    const-string v8, "8eNz7dPMZVb86mvG\n"

    const-string v9, "moYKsqG8Fgk=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sget v9, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/lit8 v9, v9, -0x72

    invoke-static {v8, v9}, Lju;->o(Ljava/lang/String;I)I

    move-result v8

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v9

    if-ltz v9, :cond_f

    const/16 v9, 0x42

    sput v9, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    move-object v10, v15

    move/from16 v11, v16

    move/from16 v17, v2

    move v9, v8

    :goto_9
    const-string v2, "\u06e1\u06e8\u06e8"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v2

    move-object v15, v10

    move/from16 v16, v11

    move/from16 v8, v17

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_f
    move v9, v8

    goto :goto_8

    :sswitch_14
    const-string v2, "hrVsRYkoy62yonx9hTU=\n"

    const-string v10, "7dAVGu1BqMg=\n"

    invoke-static {v2, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v10, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    xor-int/lit8 v10, v10, -0x4e

    invoke-static {v2, v10}, Lju;->o(Ljava/lang/String;I)I

    move-result v11

    const-string v2, "1HfaObmg3MjgdM8HqQ==\n"

    const-string v10, "vxKjZt3Jv60=\n"

    invoke-static {v2, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v10, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v15, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int/lit16 v15, v15, -0x7ca

    sub-int/2addr v10, v15

    if-gtz v10, :cond_10

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    const-string v10, "\u06e8\u06e5\u06e7"

    invoke-static {v10}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v10

    move-object v15, v2

    move/from16 v16, v11

    move/from16 v21, v10

    goto/16 :goto_0

    :cond_10
    move-object v10, v2

    move/from16 v17, v8

    goto :goto_9

    :sswitch_15
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v10, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/lit16 v10, v10, 0x12e

    add-int/2addr v2, v10

    if-gtz v2, :cond_11

    const/16 v2, 0x2b

    sput v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v2, "\u06e2\u06e1\u06e1"

    invoke-static {v2}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_11
    const-string v2, "\u06e3\u06e5\u06e7"

    goto/16 :goto_2

    :sswitch_16
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v10, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    mul-int/lit16 v10, v10, 0x83c

    or-int/2addr v2, v10

    if-ltz v2, :cond_12

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    const-string v2, "\u06e2\u06e2\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_12
    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v10, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/2addr v2, v10

    const v10, 0x1e229a

    xor-int/2addr v2, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_13
    :sswitch_17
    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v2

    if-gtz v2, :cond_14

    const-string v2, "\u06e2\u06e7\u06e4"

    move/from16 v10, v18

    goto/16 :goto_7

    :cond_14
    const-string v2, "\u06e7\u06e0\u06e1"

    goto/16 :goto_2

    :sswitch_18
    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v10, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    rem-int/lit16 v10, v10, -0x1924

    mul-int/2addr v2, v10

    if-gtz v2, :cond_15

    const-string v2, "\u06e7\u06e5\u06e4"

    invoke-static {v2}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_15
    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v10, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    xor-int/2addr v2, v10

    const v10, 0x1aa4a2

    add-int/2addr v2, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_19
    const-string v2, "\u06e2\u06e2\u06e3"

    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_1a
    const/high16 v1, 0x3fc00000    # 1.5f

    cmpl-float v1, v7, v1

    if-lez v1, :cond_2

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v10, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/2addr v2, v10

    const v10, 0x1aabb7

    add-int/2addr v2, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_1b
    add-int/lit8 v2, v9, 0x15

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v14, v2, -0x15

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-gez v2, :cond_0

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v10, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/2addr v2, v10

    const v10, 0x1aba86

    add-int/2addr v2, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_1c
    const/high16 v2, -0x40400000    # -1.5f

    cmpg-float v2, v7, v2

    if-gez v2, :cond_5

    add-int/lit8 v2, v8, 0x0

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v2, v2, 0x0

    sget v10, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v11, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    rem-int/lit16 v11, v11, 0x15cd

    div-int/2addr v10, v11

    if-ltz v10, :cond_16

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    :cond_16
    const-string v10, "\u06e0\u06e8\u06df"

    invoke-static {v10}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v10

    move/from16 v19, v2

    move/from16 v21, v10

    goto/16 :goto_0

    :sswitch_1d
    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v2

    if-ltz v2, :cond_17

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v2, "\u06df\u06e7\u06df"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_17
    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v10, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    or-int/2addr v2, v10

    const v10, 0x1ac980    # 2.460007E-39f

    add-int/2addr v2, v10

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_1e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc25 -> :sswitch_0
        0xdc5d -> :sswitch_15
        0x1aa720 -> :sswitch_a
        0x1aa783 -> :sswitch_19
        0x1aa7f8 -> :sswitch_1c
        0x1aaba2 -> :sswitch_12
        0x1aabd7 -> :sswitch_5
        0x1aaf3f -> :sswitch_18
        0x1aaf82 -> :sswitch_d
        0x1aafa1 -> :sswitch_f
        0x1ab282 -> :sswitch_1e
        0x1ab285 -> :sswitch_1b
        0x1ab2a3 -> :sswitch_b
        0x1ab2dd -> :sswitch_14
        0x1ab33c -> :sswitch_8
        0x1ab359 -> :sswitch_2
        0x1ab608 -> :sswitch_1d
        0x1ab647 -> :sswitch_16
        0x1ab6c5 -> :sswitch_19
        0x1ab722 -> :sswitch_11
        0x1aba65 -> :sswitch_1d
        0x1aba80 -> :sswitch_9
        0x1abdc7 -> :sswitch_17
        0x1abdeb -> :sswitch_1
        0x1abe09 -> :sswitch_13
        0x1abe62 -> :sswitch_1d
        0x1ac16b -> :sswitch_c
        0x1ac225 -> :sswitch_4
        0x1ac226 -> :sswitch_19
        0x1ac528 -> :sswitch_3
        0x1ac5c6 -> :sswitch_6
        0x1ac8ed -> :sswitch_10
        0x1ac985 -> :sswitch_7
        0x1ac98a -> :sswitch_e
        0x1ac9e5 -> :sswitch_1a
    .end sparse-switch
.end method

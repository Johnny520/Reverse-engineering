.class public final Lm80;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/SensorEventListener;


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 3

    const/4 v1, 0x0

    const-string v0, "\u06e2\u06e5\u06e3"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "7DB1yrdVtWs48GQ"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۧۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v1, :cond_0

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    :cond_0
    const-string v1, "\u06e4\u06e3\u06e4"

    move-object v2, v1

    :goto_1
    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_1
    :sswitch_1
    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    div-int/lit16 v2, v2, 0xa94

    xor-int/2addr v0, v2

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v0, "\u06e8\u06e0\u06e0"

    :goto_2
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sub-int/2addr v0, v2

    const v2, 0x1aad18

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    or-int/lit16 v2, v2, -0x1653

    add-int/2addr v0, v2

    if-ltz v0, :cond_3

    const/4 v0, 0x2

    sput v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v0, "\u06e7\u06e7\u06df"

    invoke-static {v0}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e3\u06df"

    goto :goto_2

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v0

    if-gtz v0, :cond_4

    const-string v0, "\u06e2\u06e5\u06e3"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v2, "\u06e1\u06e0\u06e5"

    move-object v0, v1

    goto :goto_1

    :sswitch_4
    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    add-int/2addr v0, v2

    const v2, 0x1ab000

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5c -> :sswitch_0
        0x1aaea6 -> :sswitch_5
        0x1ab2a4 -> :sswitch_4
        0x1ab300 -> :sswitch_2
        0x1aba45 -> :sswitch_3
        0x1ac5ff -> :sswitch_1
    .end sparse-switch
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 22

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/16 v18, 0x0

    const-string v1, "\u06e4\u06e2"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    :goto_0
    sparse-switch v21, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "cy+2bhM=\n"

    const-string v6, "FlnTAGf+rVU=\n"

    invoke-static {v1, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    iget-object v1, v0, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v1}, Landroid/hardware/Sensor;->getType()I

    move-result v1

    const/4 v6, 0x1

    if-ne v1, v6, :cond_0

    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/lit16 v6, v6, 0xb8

    add-int/2addr v1, v6

    if-ltz v1, :cond_14

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v6, "\u06e5\u06e5\u06e6"

    move-object v1, v13

    move v7, v14

    :goto_1
    invoke-static {v6}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v6

    move-object v13, v1

    move v14, v7

    move/from16 v21, v6

    goto :goto_0

    :cond_0
    :sswitch_1
    const-string v1, "\u06e8\u06e8\u06e4"

    :goto_2
    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v1

    if-gtz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v1, "\u06e5\u06e2\u06e4"

    :goto_3
    invoke-static {v1}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e2\u06e3\u06e8"

    goto :goto_3

    :sswitch_3
    const/high16 v1, -0x40400000    # -1.5f

    cmpg-float v1, v20, v1

    if-gez v1, :cond_b

    add-int/lit8 v1, v16, 0x9

    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v9, v1, -0x9

    sget v1, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v6, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    mul-int/lit16 v6, v6, -0x1d26

    add-int/2addr v1, v6

    if-ltz v1, :cond_2

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v1, "\u06e4\u06e8\u06e6"

    invoke-static {v1}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e2\u06e4\u06e0"

    move v6, v12

    :goto_4
    invoke-static {v1}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move v12, v6

    move/from16 v21, v1

    goto :goto_0

    :sswitch_4
    add-int/lit8 v1, v14, 0x15

    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v3, v1, -0x15

    const-string v1, "\u06e1\u06e4\u06e4"

    :goto_5
    invoke-static {v1}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_5
    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    if-gtz v1, :cond_3

    const-string v1, "\u06e3\u06e8\u06e3"

    goto :goto_5

    :cond_3
    const-string v1, "\u06e8\u06e8\u06e0"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "d0KH4JouNIRDVZfYljM=\n"

    const-string v6, "HCf+v/5HV+E=\n"

    invoke-static {v1, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/lit16 v6, v6, 0xcb

    invoke-static {v1, v6}, Lgt;->j(Ljava/lang/String;I)I

    move-result v13

    const-string v1, "Bl4t6J5VyT8yXTjWjg==\n"

    const-string v6, "bTtUt/o8qlo=\n"

    invoke-static {v1, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e3\u06e4\u06e7"

    move v7, v14

    move/from16 v16, v13

    goto/16 :goto_1

    :cond_4
    :sswitch_7
    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v1

    if-ltz v1, :cond_5

    const-string v1, "\u06e1\u06e5\u06e2"

    goto/16 :goto_2

    :cond_5
    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v6, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    or-int/2addr v1, v6

    const v6, 0x1ac287

    add-int/2addr v1, v6

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_8
    if-lez v17, :cond_8

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v1

    if-gtz v1, :cond_6

    const/16 v1, 0x59

    sput v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v1, "\u06df\u06e0\u06e0"

    invoke-static {v1}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    move v5, v2

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e4\u06e6\u06e0"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    move v5, v2

    goto/16 :goto_0

    :sswitch_9
    add-int/lit8 v1, v10, 0x1b

    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v6, v1, -0x1b

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v1

    if-ltz v1, :cond_7

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    const-string v1, "\u06e2\u06e4\u06e0"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v1

    move v12, v6

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e8\u06e6\u06e2"

    goto/16 :goto_4

    :sswitch_a
    sput v5, La80;->u:I

    :goto_6
    const-string v1, "\u06e8\u06e8\u06e4"

    invoke-static {v1}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_8
    :sswitch_b
    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v6, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    mul-int/lit16 v6, v6, -0x840

    sub-int/2addr v1, v6

    if-gtz v1, :cond_9

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    const-string v6, "\u06e0\u06e2\u06e5"

    move-object/from16 v1, v18

    :goto_7
    invoke-static {v6}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v18, v1

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_9
    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v6, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    or-int/2addr v1, v6

    const v6, 0x1ab8b6

    add-int/2addr v1, v6

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_c
    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int/2addr v1, v6

    const v6, 0x1acfa3

    xor-int/2addr v1, v6

    move/from16 v21, v1

    move v8, v3

    goto/16 :goto_0

    :sswitch_d
    const/high16 v1, -0x40400000    # -1.5f

    cmpg-float v1, v20, v1

    if-gez v1, :cond_4

    add-int/lit8 v1, v11, -0x3

    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v1, v1, 0x3

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v6, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v6, v6, 0x1552

    or-int/2addr v4, v6

    if-ltz v4, :cond_a

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    :goto_8
    const-string v4, "\u06e0\u06e7\u06e2"

    move-object v6, v4

    move v7, v1

    :goto_9
    invoke-static {v6}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move v4, v7

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e4\u06e8\u06e6"

    invoke-static {v4}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v6

    move v4, v1

    move/from16 v21, v6

    goto/16 :goto_0

    :sswitch_e
    const/high16 v1, 0x3fc00000    # 1.5f

    cmpl-float v1, v20, v1

    if-lez v1, :cond_1d

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v6

    if-gtz v6, :cond_15

    const/4 v6, 0x3

    sput v6, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v6, "\u06e4\u06e6\u06e7"

    invoke-static {v6}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v17, v1

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_b
    :sswitch_f
    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    if-gtz v1, :cond_c

    const/16 v1, 0x3b

    sput v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v1, "\u06e0\u06e8\u06e0"

    move v6, v10

    move v7, v11

    :goto_a
    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    move v10, v6

    move v11, v7

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06e7\u06e3\u06e8"

    move v6, v10

    move v7, v11

    goto :goto_a

    :sswitch_10
    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v1

    if-gtz v1, :cond_d

    const/16 v1, 0x61

    sput v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v1, "\u06df\u06e4\u06e0"

    invoke-static {v1}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_d
    const-string v1, "\u06e1\u06e1\u06e7"

    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_11
    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/lit16 v15, v1, 0x12c

    invoke-static {v13, v15}, Lgt;->j(Ljava/lang/String;I)I

    move-result v7

    sget v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v6, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/lit16 v6, v6, 0x16f1

    mul-int/2addr v1, v6

    if-ltz v1, :cond_e

    const-string v1, "\u06df\u06e2\u06e4"

    invoke-static {v1}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v1

    move v14, v7

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06e4\u06e6\u06e7"

    move-object v1, v13

    goto/16 :goto_1

    :sswitch_12
    sput v8, La80;->t:I

    const-string v1, "mTrfEBAugLKeOsA7\n"

    const-string v2, "8l+mT2Je8+0=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lgt;->j(Ljava/lang/String;I)I

    move-result v1

    add-int/lit8 v1, v1, 0x0

    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v2, v1, 0x0

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v1

    if-ltz v1, :cond_f

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    const-string v1, "\u06e1\u06e6\u06e5"

    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_f
    const-string v1, "\u06e0\u06e2\u06e3"

    goto/16 :goto_5

    :sswitch_13
    move/from16 v1, v19

    move/from16 v8, v19

    move/from16 v6, v20

    :goto_b
    const-string v7, "\u06e8\u06df\u06df"

    invoke-static {v7}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v7

    move/from16 v19, v1

    move/from16 v21, v7

    move/from16 v20, v6

    goto/16 :goto_0

    :sswitch_14
    const-string v1, "JwzhoQ7V/wU+AP+WCA==\n"

    const-string v6, "TGmY/nyljFo=\n"

    invoke-static {v1, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v15}, Lgt;->j(Ljava/lang/String;I)I

    move-result v7

    const-string v1, "H6PUsyI0rbkSqsyY\n"

    const-string v6, "dMat7FBE3uY=\n"

    invoke-static {v1, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v6, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    xor-int/lit16 v6, v6, -0x2bd

    invoke-static {v1, v6}, Lgt;->j(Ljava/lang/String;I)I

    move-result v6

    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v10, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/lit16 v10, v10, -0x1b06

    xor-int/2addr v1, v10

    if-gtz v1, :cond_10

    move v10, v6

    move v11, v7

    goto/16 :goto_6

    :cond_10
    const-string v1, "\u06e3\u06e6\u06e8"

    goto/16 :goto_a

    :sswitch_15
    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v1

    if-gtz v1, :cond_11

    const-string v1, "\u06e4\u06e2"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_11
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    or-int/2addr v1, v6

    const v6, -0x1aa746

    xor-int/2addr v1, v6

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_16
    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v5, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    div-int/lit16 v5, v5, 0x50c

    or-int/2addr v1, v5

    if-ltz v1, :cond_12

    const/16 v1, 0x32

    sput v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v1, "\u06e3\u06e4\u06e7"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    move v5, v4

    goto/16 :goto_0

    :cond_12
    move v1, v4

    move v5, v4

    goto/16 :goto_8

    :sswitch_17
    sget v1, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    if-ltz v1, :cond_13

    const/16 v1, 0x28

    sput v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v1, "\u06e7\u06e6"

    move v6, v12

    goto/16 :goto_4

    :cond_13
    const-string v1, "\u06e2\u06e2\u06e5"

    goto/16 :goto_3

    :cond_14
    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v6, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/2addr v1, v6

    const v6, 0x1aa818

    add-int/2addr v1, v6

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_18
    sget v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    if-gtz v1, :cond_16

    move/from16 v1, v17

    move v8, v9

    :cond_15
    const-string v6, "\u06e5\u06e6\u06e2"

    invoke-static {v6}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v17, v1

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_16
    const-string v1, "\u06e4\u06df\u06df"

    move-object v6, v1

    move v7, v4

    move v8, v9

    goto/16 :goto_9

    :sswitch_19
    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v1, :cond_17

    const/16 v1, 0x9

    sput v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v1, "\u06e2\u06e3"

    :goto_c
    invoke-static {v1}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_17
    const-string v1, "\u06e4\u06e2"

    goto :goto_c

    :sswitch_1a
    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v1, :cond_18

    const/16 v1, 0x42

    sput v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v1, "\u06e6\u06e1\u06e3"

    :goto_d
    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_18
    const-string v1, "\u06df\u06e4\u06e0"

    goto/16 :goto_3

    :sswitch_1b
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v18

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v1, :cond_19

    const-string v1, "\u06e2\u06e3\u06e8"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_19
    const-string v1, "\u06e2\u06e0\u06e7"

    goto :goto_d

    :cond_1a
    :sswitch_1c
    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/2addr v1, v6

    const v6, 0x1ab3d9

    xor-int/2addr v1, v6

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_1d
    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v1

    if-gtz v1, :cond_1a

    const-string v1, "9pR7aDG4e"

    invoke-static {v1}, L۟ۡۦۧۤ;->۟ۧۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    move-result v6

    if-gtz v6, :cond_1b

    const/16 v6, 0x60

    sput v6, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v6, "\u06e8\u06e6\u06e2"

    invoke-static {v6}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v18, v1

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_1b
    const-string v6, "\u06e1\u06e4\u06e2"

    goto/16 :goto_7

    :sswitch_1e
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v1

    if-gtz v1, :cond_1c

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    const-string v1, "\u06df\u06e3\u06e0"

    invoke-static {v1}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    move v5, v12

    goto/16 :goto_0

    :cond_1c
    sget v1, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v5, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/2addr v1, v5

    const v5, 0x1ab208

    xor-int/2addr v1, v5

    move/from16 v21, v1

    move v5, v12

    goto/16 :goto_0

    :cond_1d
    move/from16 v17, v1

    :sswitch_1f
    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    if-gtz v1, :cond_1e

    const/16 v1, 0x12

    sput v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v1, "\u06df\u06df\u06e7"

    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_1e
    const-string v1, "\u06e3\u06e7\u06e4"

    goto/16 :goto_c

    :sswitch_20
    move-object/from16 v0, p1

    iget-object v1, v0, Landroid/hardware/SensorEvent;->values:[F

    const/4 v6, 0x0

    aget v6, v1, v6

    const-string v1, "oxaoSfQkykaXH7Rw5A==\n"

    const-string v7, "yHPRFpBNqSM=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x1

    invoke-static {v1, v7}, Lgt;->j(Ljava/lang/String;I)I

    move-result v1

    add-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v1, v1, -0xa

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v7

    if-gtz v7, :cond_1f

    const/16 v7, 0x45

    sput v7, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    goto/16 :goto_b

    :cond_1f
    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v19, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int v7, v7, v19

    const v19, 0x1aaf60

    add-int v7, v7, v19

    move/from16 v19, v1

    move/from16 v21, v7

    move/from16 v20, v6

    goto/16 :goto_0

    :sswitch_21
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc7e -> :sswitch_0
        0xdcdf -> :sswitch_7
        0x1aa71f -> :sswitch_1c
        0x1aa761 -> :sswitch_2
        0x1aa77c -> :sswitch_b
        0x1aa79b -> :sswitch_2
        0x1aa81a -> :sswitch_20
        0x1aab21 -> :sswitch_14
        0x1aabbb -> :sswitch_15
        0x1aabd7 -> :sswitch_1f
        0x1aaec7 -> :sswitch_5
        0x1aaf1f -> :sswitch_1b
        0x1aaf21 -> :sswitch_c
        0x1aaf60 -> :sswitch_6
        0x1ab269 -> :sswitch_21
        0x1ab2a1 -> :sswitch_1
        0x1ab2a5 -> :sswitch_5
        0x1ab2c7 -> :sswitch_a
        0x1ab2de -> :sswitch_18
        0x1ab683 -> :sswitch_d
        0x1ab6a6 -> :sswitch_11
        0x1ab6e5 -> :sswitch_8
        0x1ab700 -> :sswitch_3
        0x1ab9c4 -> :sswitch_17
        0x1aba9e -> :sswitch_1a
        0x1abaa5 -> :sswitch_e
        0x1abae2 -> :sswitch_16
        0x1abe46 -> :sswitch_5
        0x1abe61 -> :sswitch_13
        0x1ac188 -> :sswitch_2
        0x1ac245 -> :sswitch_9
        0x1ac568 -> :sswitch_f
        0x1ac58c -> :sswitch_4
        0x1ac602 -> :sswitch_19
        0x1ac8c8 -> :sswitch_10
        0x1ac9a4 -> :sswitch_1e
        0x1ac9e0 -> :sswitch_12
        0x1ac9e4 -> :sswitch_1d
    .end sparse-switch
.end method

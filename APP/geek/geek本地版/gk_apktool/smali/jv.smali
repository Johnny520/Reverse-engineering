.class public final Ljv;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ljv;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public static final a(Landroid/content/ContentValues;)V
    .locals 26

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/16 v23, 0x0

    const/16 v22, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/16 v18, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const-string v12, "\u06e5\u06e5\u06e1"

    invoke-static {v12}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move/from16 v17, v12

    :goto_0
    sparse-switch v17, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const-string v6, "\u06e7\u06e3\u06df"

    move-object/from16 v5, v18

    :goto_1
    invoke-static {v6}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v18, v5

    move/from16 v17, v6

    goto :goto_0

    :sswitch_1
    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    if-gtz v5, :cond_1

    const-string v5, "\u06e5\u06e2\u06e6"

    :goto_2
    invoke-static {v5}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto :goto_0

    :cond_1
    const-string v5, "\u06e2\u06e5\u06e3"

    goto :goto_2

    :sswitch_2
    sget v5, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    mul-int/lit16 v6, v6, -0x30a

    div-int/2addr v5, v6

    if-eqz v5, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v5, "\u06e2\u06e1\u06e3"

    invoke-static {v5}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto :goto_0

    :cond_2
    const-string v5, "\u06e6\u06e6\u06e8"

    :goto_3
    invoke-static {v5}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto :goto_0

    :sswitch_3
    sget v5, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    xor-int/lit16 v5, v5, -0x383

    mul-int v12, v23, v5

    const-string v5, "W2lyHesRLDxqcnM=\n"

    const-string v6, "DQYbfo5dSVI=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "rcYLWWA+K3O8wRY=\n"

    const-string v17, "26liOgVSTh0=\n"

    move-object/from16 v0, v17

    invoke-static {v6, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sget v17, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v20, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/lit8 v20, v20, 0x1a

    rem-int v17, v17, v20

    if-ltz v17, :cond_1c

    const/16 v17, 0x18

    sput v17, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v17, "\u06e5\u06e5\u06e3"

    invoke-static/range {v17 .. v17}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v17

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move/from16 v22, v12

    goto :goto_0

    :sswitch_4
    const-string v5, "VrT9SidJ\n"

    const-string v6, "bMCUJ0JzbYc=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v2, v5, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_12

    const-string v3, "T2OUqAAs749eLQ==\n"

    const-string v5, "dRf9xWUWs+s=\n"

    invoke-static {v3, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "pattern"

    invoke-static {v5, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v5

    if-ltz v5, :cond_3

    const/16 v5, 0xd

    sput v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v5, "\u06e4\u06e6\u06e4"

    invoke-static {v5}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06e3\u06e3\u06e0"

    goto/16 :goto_2

    :sswitch_5
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    const-string v5, "compile(...)"

    invoke-static {v5, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, ":time:"

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v10, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v11, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v11, v11, 0x1edb

    add-int/2addr v10, v11

    if-gtz v10, :cond_4

    const-string v10, "\u06df\u06e4\u06e8"

    invoke-static {v10}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v12

    move-object v10, v5

    move-object v11, v6

    move/from16 v17, v12

    goto/16 :goto_0

    :cond_4
    const-string v10, "\u06e6\u06e2\u06e0"

    move-object v12, v10

    :goto_4
    invoke-static {v12}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v12

    move-object v10, v5

    move-object v11, v6

    move/from16 v17, v12

    goto/16 :goto_0

    :sswitch_6
    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    or-int/lit16 v6, v6, 0x14c3

    sub-int/2addr v5, v6

    if-ltz v5, :cond_5

    const/16 v5, 0x3c

    sput v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v5, "\u06e8\u06e2\u06e7"

    move v6, v7

    move v8, v7

    :goto_5
    invoke-static {v5}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v5

    move v7, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_5
    sget v5, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    or-int/2addr v5, v6

    const v6, -0x1aa8f7

    xor-int/2addr v5, v6

    move/from16 v17, v5

    move v8, v7

    goto/16 :goto_0

    :sswitch_7
    const-string v5, "uQyZ+IsiQw==\n"

    const-string v6, "2mP3jO5MN+M=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    move-object/from16 v1, v25

    invoke-virtual {v0, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget v5, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    rem-int/lit16 v6, v6, 0x1fb3

    add-int/2addr v5, v6

    if-ltz v5, :cond_6

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v5, "\u06df\u06e1\u06e3"

    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_6
    sget v5, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v6, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sub-int/2addr v5, v6

    const v6, 0x1abd21

    add-int/2addr v5, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_8
    sget v5, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/lit16 v5, v5, 0x1dc

    aput-object v15, v14, v5

    sget v5, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    xor-int/lit16 v5, v5, -0x1ba

    aput-object v13, v14, v5

    sget v5, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/lit16 v5, v5, 0x32e

    aput-object v16, v14, v5

    sget v5, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v5, :cond_7

    const-string v5, "\u06e4\u06df"

    invoke-static {v5}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_7
    sget v5, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    rem-int/2addr v5, v6

    const v6, -0x1abec5

    xor-int/2addr v5, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    move-result v5

    if-ltz v5, :cond_8

    const-string v5, "\u06e7\u06e2\u06e7"

    move v6, v9

    :goto_6
    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    move v9, v6

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e0\u06df\u06e5"

    :goto_7
    invoke-static {v5}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_a
    const-string v5, "bXGnxLp5a8N8aqY=\n"

    const-string v6, "Gx7Op98VDq0=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v5, "numD6tnvLweP8oI=\n"

    const-string v6, "yKbKqZyjakk=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "/87cN8ta\n"

    const-string v13, "kr27e640GT4=\n"

    invoke-static {v6, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v15, "\u06e8\u06e2\u06e7"

    move-object v6, v14

    move-object/from16 v16, v13

    move-object/from16 v17, v15

    :goto_8
    invoke-static/range {v17 .. v17}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v17

    move-object v13, v5

    move-object v14, v6

    move-object v15, v12

    goto/16 :goto_0

    :sswitch_b
    sget v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v6, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    div-int/2addr v5, v6

    const v6, 0x1ab71e

    xor-int/2addr v5, v6

    move/from16 v17, v5

    move/from16 v23, v9

    goto/16 :goto_0

    :sswitch_c
    move/from16 v0, v22

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sget v6, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v12, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/lit16 v12, v12, 0x2240

    rem-int/2addr v6, v12

    if-ltz v6, :cond_9

    const-string v6, "\u06e0\u06df\u06e4"

    invoke-static {v6}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v18, v5

    move/from16 v17, v6

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06e3\u06e6\u06e6"

    goto/16 :goto_1

    :sswitch_d
    :try_start_0
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    const-string v5, "\u06e3\u06df\u06e0"

    goto :goto_6

    :sswitch_e
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v24

    invoke-virtual {v5, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v5

    if-gtz v5, :cond_a

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    const-string v12, "\u06e3\u06e8\u06e3"

    move-object v5, v10

    move-object v6, v11

    goto/16 :goto_4

    :cond_a
    const-string v5, "\u06e2\u06df\u06e5"

    invoke-static {v5}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_f
    const/4 v6, 0x0

    const-string v5, "\u06e2\u06e2\u06e4"

    goto/16 :goto_5

    :sswitch_10
    sget v5, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v5, :cond_b

    const/16 v5, 0x5a

    sput v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v5, "\u06e6\u06df"

    invoke-static {v5}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_b
    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v6, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    rem-int/2addr v5, v6

    const v6, 0x1ab77d

    add-int/2addr v5, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_c
    :sswitch_11
    sget v5, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v6, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    xor-int/lit16 v6, v6, -0x1a55

    xor-int/2addr v5, v6

    if-ltz v5, :cond_d

    const-string v5, "\u06e0\u06e4\u06e7"

    :goto_9
    invoke-static {v5}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_d
    sget v5, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v6, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sub-int/2addr v5, v6

    const v6, -0x1ac0ef

    xor-int/2addr v5, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_12
    const/4 v5, 0x5

    new-array v6, v5, [Ljava/lang/String;

    sget v5, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/lit16 v5, v5, 0x1b6

    aput-object v20, v6, v5

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/lit16 v5, v5, -0xfd

    aput-object v21, v6, v5

    sget v5, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v5, :cond_e

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v14, "\u06e3\u06df\u06e5"

    move-object v5, v13

    move-object v12, v15

    move-object/from16 v17, v14

    goto/16 :goto_8

    :cond_e
    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    mul-int/2addr v5, v12

    const v12, 0x1e7ace

    add-int/2addr v5, v12

    move-object v14, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_13
    sget v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v6, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/lit16 v6, v6, -0x21c6

    sub-int/2addr v5, v6

    if-ltz v5, :cond_f

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    const-string v6, "\u06e7\u06e1\u06e6"

    move-object/from16 v5, v18

    goto/16 :goto_1

    :cond_f
    const-string v5, "\u06e5\u06e5\u06e1"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_10
    :sswitch_14
    sget v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v5, :cond_11

    const/16 v5, 0x4b

    sput v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v5, "\u06e6\u06e5"

    :goto_a
    invoke-static {v5}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_11
    const-string v5, "\u06e4\u06e6\u06e4"

    goto :goto_a

    :cond_12
    :sswitch_15
    sget v5, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/2addr v5, v6

    const v6, -0x1ac1e8

    xor-int/2addr v5, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_16
    const-string v5, "replacement"

    move-object/from16 v0, v18

    invoke-static {v5, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v11, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    move-object/from16 v0, v18

    invoke-virtual {v5, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "replaceAll(...)"

    invoke-static {v6, v5}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v6

    if-gtz v6, :cond_13

    const-string v6, "\u06e5\u06e5\u06e1"

    invoke-static {v6}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v25, v5

    move/from16 v17, v6

    goto/16 :goto_0

    :cond_13
    sget v6, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v12, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    or-int/2addr v6, v12

    const v12, 0x1aae1a

    add-int/2addr v6, v12

    move-object/from16 v25, v5

    move/from16 v17, v6

    goto/16 :goto_0

    :sswitch_17
    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v6, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v6, v6, -0x453

    rem-int/2addr v5, v6

    if-ltz v5, :cond_14

    const/16 v5, 0x11

    sput v5, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v5, "\u06e6\u06e6\u06e5"

    invoke-static {v5}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_14
    const-string v5, "\u06df\u06e1\u06e3"

    invoke-static {v5}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_15
    :sswitch_18
    sget v5, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v6, v6, 0x100f

    or-int/2addr v5, v6

    if-ltz v5, :cond_16

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v6, "\u06e7\u06e5\u06e2"

    move-object/from16 v5, v19

    :goto_b
    invoke-static {v6}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v19, v5

    move/from16 v17, v6

    goto/16 :goto_0

    :cond_16
    sget v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v6, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/2addr v5, v6

    const v6, 0x1accf3

    add-int/2addr v5, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_19
    const-string v5, "0B5++HjAvSTdJHHIYtO3FNceaQ==\n"

    const-string v6, "u3sHpwuw0ks=\n"

    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "5sY=\n"

    const-string v12, "0PY5vV+9Er0=\n"

    invoke-static {v6, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget v6, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v6, :cond_17

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    :goto_c
    const-string v6, "\u06e3\u06e0\u06e2"

    invoke-static {v6}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v19, v5

    move/from16 v17, v6

    goto/16 :goto_0

    :cond_17
    const-string v6, "\u06e2\u06e5\u06e3"

    goto :goto_b

    :sswitch_1a
    const/4 v5, 0x5

    if-ge v8, v5, :cond_c

    aget-object v4, v14, v8

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_10

    sget v5, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v5, :cond_18

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v5, "\u06e7\u06e2\u06e0"

    invoke-static {v5}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_18
    const-string v5, "\u06e4\u06e0\u06e6"

    goto/16 :goto_2

    :cond_19
    :sswitch_1b
    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v5, :cond_1a

    const/16 v5, 0x50

    sput v5, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v5, "\u06e6\u06e5\u06e8"

    goto/16 :goto_7

    :cond_1a
    const-string v5, "\u06e6\u06df"

    invoke-static {v5}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_1c
    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v6, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    xor-int/lit16 v6, v6, 0x2f1

    or-int/2addr v5, v6

    if-ltz v5, :cond_1b

    const/16 v5, 0x45

    sput v5, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v5, "\u06e6\u06e3\u06e1"

    invoke-static {v5}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_1b
    const-string v5, "\u06e7\u06e3\u06e5"

    :goto_d
    invoke-static {v5}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_1d
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v0, p0

    invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget v5, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v5, :cond_1d

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    move/from16 v12, v22

    :cond_1c
    const-string v17, "\u06e3\u06e6\u06e4"

    move/from16 v22, v12

    :goto_e
    invoke-static/range {v17 .. v17}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move/from16 v17, v12

    goto/16 :goto_0

    :cond_1d
    const-string v5, "\u06e4\u06e6\u06e4"

    goto/16 :goto_3

    :sswitch_1e
    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v5

    if-gtz v5, :cond_1e

    const-string v5, "\u06e6\u06e5\u06e1"

    invoke-static {v5}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_1e
    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v6, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    or-int/2addr v5, v6

    const v6, 0x1aa918

    add-int/2addr v5, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_1f
    :sswitch_1f
    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v5

    if-gtz v5, :cond_20

    const-string v5, "\u06e1\u06e0\u06e7"

    move/from16 v6, v23

    :goto_f
    invoke-static {v5}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    move/from16 v23, v6

    goto/16 :goto_0

    :cond_20
    const-string v5, "\u06e2\u06df\u06e5"

    invoke-static {v5}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_20
    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v5

    if-gtz v5, :cond_1f

    const-string v5, "zzb8oxINzYH5"

    invoke-static {v5}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۤۥۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    sget v6, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v12, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sub-int/2addr v6, v12

    const v12, 0x1aa9a9

    add-int/2addr v6, v12

    move-object/from16 v24, v5

    move/from16 v17, v6

    goto/16 :goto_0

    :sswitch_21
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v5

    if-gtz v5, :cond_21

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    const-string v5, "\u06e4\u06e7\u06e7"

    goto/16 :goto_3

    :cond_21
    const-string v5, "\u06e3\u06df\u06e0"

    goto/16 :goto_2

    :sswitch_22
    const-string v5, "OzezU215oXU2Dbxjd2qrRT88\n"

    const-string v6, "UFLKDB4Jzho=\n"

    sget-object v12, Lgn;->a:Lgn;

    invoke-static {v5, v6, v12}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v5

    if-nez v5, :cond_0

    sget v5, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v5, :cond_22

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    const-string v5, "\u06e3\u06df\u06e0"

    goto/16 :goto_d

    :cond_22
    const-string v12, "\u06e3\u06df\u06e5"

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    move-object/from16 v17, v12

    goto/16 :goto_e

    :sswitch_23
    sget v5, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v6, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/lit16 v6, v6, 0x375

    add-int/2addr v5, v6

    if-gtz v5, :cond_23

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v5, "\u06e7\u06e4\u06e8"

    invoke-static {v5}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    goto/16 :goto_0

    :cond_23
    sget v5, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/2addr v5, v6

    const v6, -0x1aa56b

    xor-int/2addr v5, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_24
    sget v5, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/lit16 v5, v5, -0x23b

    add-int/2addr v8, v5

    move-object/from16 v5, v19

    goto/16 :goto_c

    :catch_0
    move-exception v5

    const/16 v6, 0x3c

    sget v5, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v12, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v12, v12, -0x14ec

    sub-int/2addr v5, v12

    if-gtz v5, :cond_24

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v5, "\u06e0\u06e4\u06df"

    invoke-static {v5}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v17, v5

    move/from16 v23, v6

    goto/16 :goto_0

    :cond_24
    const-string v5, "\u06e6\u06e3"

    goto/16 :goto_f

    :sswitch_25
    const-string v2, "iSsinBuw0g==\n"

    const-string v5, "6kRM6H7epvY=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_15

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v6, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    div-int/2addr v5, v6

    const v6, 0x1aab5b

    xor-int/2addr v5, v6

    move/from16 v17, v5

    goto/16 :goto_0

    :sswitch_26
    if-gtz v23, :cond_19

    const-string v5, "\u06e2\u06e1\u06e3"

    goto/16 :goto_9

    :sswitch_27
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7b -> :sswitch_0
        0xdcb9 -> :sswitch_3
        0xdcbd -> :sswitch_17
        0x1aa71e -> :sswitch_8
        0x1aa741 -> :sswitch_26
        0x1aa783 -> :sswitch_15
        0x1aa7a3 -> :sswitch_e
        0x1aa7f7 -> :sswitch_9
        0x1aaac5 -> :sswitch_7
        0x1aaac6 -> :sswitch_1a
        0x1aab41 -> :sswitch_11
        0x1aab5b -> :sswitch_1c
        0x1aab7d -> :sswitch_14
        0x1ab248 -> :sswitch_27
        0x1ab284 -> :sswitch_2
        0x1ab2a4 -> :sswitch_6
        0x1ab300 -> :sswitch_d
        0x1ab604 -> :sswitch_b
        0x1ab609 -> :sswitch_23
        0x1ab625 -> :sswitch_1e
        0x1ab62b -> :sswitch_18
        0x1ab680 -> :sswitch_5
        0x1ab6bd -> :sswitch_9
        0x1ab6e1 -> :sswitch_a
        0x1ab6e3 -> :sswitch_16
        0x1ab703 -> :sswitch_17
        0x1ab71e -> :sswitch_10
        0x1ab9ea -> :sswitch_1d
        0x1abaa2 -> :sswitch_24
        0x1abda4 -> :sswitch_15
        0x1abe41 -> :sswitch_22
        0x1abe43 -> :sswitch_f
        0x1ac1a4 -> :sswitch_c
        0x1ac1c4 -> :sswitch_20
        0x1ac202 -> :sswitch_1b
        0x1ac228 -> :sswitch_15
        0x1ac565 -> :sswitch_13
        0x1ac583 -> :sswitch_19
        0x1ac589 -> :sswitch_15
        0x1ac58a -> :sswitch_25
        0x1ac5ab -> :sswitch_1
        0x1ac8cb -> :sswitch_1f
        0x1ac92b -> :sswitch_21
        0x1ac92d -> :sswitch_12
        0x1ac98b -> :sswitch_4
    .end sparse-switch
.end method

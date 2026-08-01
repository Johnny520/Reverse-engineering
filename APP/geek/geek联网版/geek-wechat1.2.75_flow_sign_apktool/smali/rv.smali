.class public final Lrv;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lrv;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public static final a(Landroid/content/ContentValues;)V
    .locals 24

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/16 v20, 0x0

    const-string v17, "\u06e4\u06e0\u06e6"

    invoke-static/range {v17 .. v17}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v23

    move-object/from16 v17, v4

    move-object/from16 v18, v15

    :goto_0
    sparse-switch v23, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v4, "\u06e2\u06e3\u06e1"

    :goto_1
    invoke-static {v4}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto :goto_0

    :catch_0
    move-exception v4

    const/16 v16, 0x3c

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v15, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    div-int/lit16 v15, v15, 0x2325

    xor-int/2addr v4, v15

    if-gtz v4, :cond_0

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v4, "\u06e4\u06e8\u06e2"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto :goto_0

    :cond_0
    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v15, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    div-int/2addr v4, v15

    const v15, 0x1aa786

    add-int/2addr v4, v15

    move/from16 v23, v4

    goto :goto_0

    :sswitch_1
    move-object v4, v7

    :cond_1
    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v7

    if-ltz v7, :cond_2

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v7, "\u06e6\u06e6\u06e6"

    invoke-static {v7}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v15

    move-object v7, v4

    move/from16 v23, v15

    goto :goto_0

    :cond_2
    const-string v7, "\u06e2\u06e0\u06e6"

    invoke-static {v7}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v15

    move-object v7, v4

    move/from16 v23, v15

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ":"

    move-object/from16 v0, v17

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v8

    if-ltz v8, :cond_3

    :goto_2
    const-string v8, "\u06e2\u06e0\u06df"

    invoke-static {v8}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v15

    move-object v8, v4

    move/from16 v23, v15

    goto :goto_0

    :cond_3
    sget v8, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sub-int/2addr v8, v15

    const v15, 0x1ab76b

    add-int/2addr v15, v8

    move-object v8, v4

    move/from16 v23, v15

    goto :goto_0

    :sswitch_3
    move-object v4, v10

    :cond_4
    sget v10, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v15, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/lit16 v15, v15, 0x28b

    sub-int/2addr v10, v15

    if-ltz v10, :cond_5

    const-string v10, "\u06e8\u06e7\u06df"

    move-object v15, v10

    :goto_3
    invoke-static {v15}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v15

    move-object v10, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :cond_5
    sget v10, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v15, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    xor-int/2addr v10, v15

    const v15, 0x1aaf32

    add-int/2addr v15, v10

    move-object v10, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :sswitch_4
    const-string v4, "replacement"

    invoke-static {v4, v8}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, v21

    invoke-virtual {v0, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v15, "replaceAll(...)"

    invoke-static {v15, v4}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v15, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v20, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int v15, v15, v20

    const v20, 0xcd080

    add-int v15, v15, v20

    move-object/from16 v20, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :sswitch_5
    const-string v4, "\u06e4\u06e1\u06e2"

    :goto_4
    invoke-static {v4}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_6
    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/String;

    sget v15, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    xor-int/lit16 v15, v15, -0x224

    aput-object v3, v4, v15

    sget v15, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/lit16 v15, v15, 0x390

    aput-object v2, v4, v15

    sget v15, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v19, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    move/from16 v0, v19

    mul-int/lit16 v0, v0, -0x25a0

    move/from16 v19, v0

    div-int v15, v15, v19

    if-eqz v15, :cond_6

    const-string v15, "\u06e2\u06e8\u06e4"

    invoke-static {v15}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v19, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :cond_6
    const-string v15, "\u06e1\u06e8\u06e0"

    invoke-static {v15}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v19, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :sswitch_7
    if-gtz v16, :cond_13

    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v15, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    rem-int/2addr v4, v15

    const v15, 0xde7c

    xor-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_8
    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/lit16 v15, v15, -0xb12

    xor-int/2addr v4, v15

    if-gtz v4, :cond_7

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v4, "\u06e0\u06e0\u06e3"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e4\u06e8\u06e2"

    :goto_5
    invoke-static {v4}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_9
    const-string v4, "/T5EmYiDtIXsJUU=\n"

    const-string v11, "i1Et+u3v0es=\n"

    invoke-static {v4, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v4, "3KP7bqKSd0HNuPo=\n"

    const-string v11, "iuyyLefeMg8=\n"

    invoke-static {v4, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v11, "Glny7N8+\n"

    const-string v12, "dyqVoLpQfY4=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v11

    if-ltz v11, :cond_f

    const-string v11, "\u06e4\u06e0\u06e7"

    invoke-static {v11}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v15

    move-object v11, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :sswitch_a
    const-string v4, "\u06e5\u06e4\u06df"

    :goto_6
    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_b
    const-string v4, "+nq1UODMY/r3QLpg+t9pyv5x\n"

    const-string v15, "kR/MD5O8DJU=\n"

    sget-object v23, Lkn;->a:Lkn;

    move-object/from16 v0, v23

    invoke-static {v4, v15, v0}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v4

    if-nez v4, :cond_a

    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v4, :cond_8

    const-string v4, "\u06e0\u06e0\u06e8"

    invoke-static {v4}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e8\u06df\u06e0"

    move/from16 v15, v16

    :goto_7
    invoke-static {v4}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    move/from16 v16, v15

    goto/16 :goto_0

    :sswitch_c
    const-string v4, "WxWhjyFM\n"

    const-string v15, "YWHI4kR2w/0=\n"

    invoke-static {v4, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v15, 0x0

    invoke-static {v7, v4, v15}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_1c

    const-string v4, "5ff/uS579Tb0uQ==\n"

    const-string v15, "34OW1EtBqVI=\n"

    invoke-static {v4, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v15, "pattern"

    invoke-static {v15, v4}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v15, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v18, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    move/from16 v0, v18

    div-int/lit16 v0, v0, 0xffb

    move/from16 v18, v0

    xor-int v15, v15, v18

    if-gtz v15, :cond_9

    const/16 v15, 0x9

    sput v15, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    const-string v15, "\u06e1\u06e8\u06e0"

    invoke-static {v15}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v18, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :cond_9
    sget v15, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v18, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sub-int v15, v15, v18

    const v18, 0x1aac51

    xor-int v15, v15, v18

    move-object/from16 v18, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :cond_a
    :sswitch_d
    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v4

    if-gtz v4, :cond_b

    const/16 v4, 0x46

    sput v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v4, "\u06e5\u06e8\u06e3"

    :goto_8
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e1\u06e4\u06df"

    goto/16 :goto_4

    :sswitch_e
    const-string v4, "7UiaghOVaw==\n"

    const-string v7, "jif09nb7H9c=\n"

    invoke-static {v4, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1b

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_1

    sget v7, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v15, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    mul-int/lit16 v15, v15, 0x13e5

    xor-int/2addr v7, v15

    if-gtz v7, :cond_c

    const-string v7, "\u06e2\u06e6\u06e1"

    invoke-static {v7}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v15

    move-object v7, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :cond_c
    sget v7, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v15, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    rem-int/2addr v7, v15

    const v15, -0x1abfa1

    xor-int/2addr v15, v7

    move-object v7, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :sswitch_f
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v10, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v15, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/lit16 v15, v15, 0x51d

    add-int/2addr v4, v15

    if-gtz v4, :cond_d

    const-string v4, "\u06df\u06e8\u06e7"

    invoke-static {v4}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_d
    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v15, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/2addr v4, v15

    const v15, 0x1a18c3

    add-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_10
    const-string v4, "G6H/9kMXvg==\n"

    const-string v15, "eM6RgiZ5yms=\n"

    invoke-static {v4, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    invoke-virtual {v0, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v15, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/lit16 v15, v15, -0x1fea

    div-int/2addr v4, v15

    if-eqz v4, :cond_e

    const-string v4, "\u06e7\u06e4\u06e1"

    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06e8\u06e3\u06e8"

    move-object v15, v4

    :goto_9
    invoke-static {v15}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_11
    :try_start_0
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v14

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v15, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/lit16 v15, v15, 0x18cb

    mul-int/2addr v4, v15

    if-ltz v4, :cond_10

    const/4 v4, 0x3

    sput v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    move-object v4, v11

    :cond_f
    const-string v11, "\u06e5\u06e4\u06e5"

    invoke-static {v11}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v15

    move-object v11, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :cond_10
    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v15, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    rem-int/2addr v4, v15

    const v15, 0xdec5

    add-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_12
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v15, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    mul-int/lit16 v15, v15, -0x1027

    rem-int/2addr v4, v15

    if-ltz v4, :cond_11

    const-string v4, "\u06e5\u06e5\u06e7"

    goto/16 :goto_4

    :cond_11
    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v15, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    or-int/2addr v4, v15

    const v15, 0x1aba01

    add-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_13
    const/4 v4, 0x5

    if-ge v6, v4, :cond_1a

    aget-object v4, v19, v6

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    sget v10, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v15, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    add-int/lit16 v15, v15, 0x720

    or-int/2addr v10, v15

    if-ltz v10, :cond_12

    const/4 v10, 0x4

    sput v10, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    const-string v15, "\u06e4\u06e7\u06e8"

    move-object v10, v4

    goto :goto_9

    :cond_12
    const-string v10, "\u06e2\u06e6\u06e1"

    invoke-static {v10}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v15

    move-object v10, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :sswitch_14
    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v15, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    mul-int/2addr v4, v15

    const v15, 0x1aad66

    add-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_13
    :sswitch_15
    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v4

    if-ltz v4, :cond_14

    const/16 v4, 0x3f

    sput v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    const-string v4, "\u06e1\u06e1"

    invoke-static {v4}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_14
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v15, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    rem-int/2addr v4, v15

    const v15, -0x1ab9fb

    xor-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_16
    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    xor-int/lit16 v2, v2, -0x1e3

    mul-int v5, v16, v2

    const-string v2, "4YJr06yHpQ3QmWo=\n"

    const-string v3, "t+0CsMnLwGM=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v2, "yWgQip25oyXYbw0=\n"

    const-string v4, "vwd56fjVxks=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "\u06e4\u06e7\u06e8"

    :goto_a
    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_17
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int/2addr v4, v6

    const v6, -0x139ce0

    xor-int/2addr v4, v6

    move/from16 v23, v4

    move/from16 v6, v22

    goto/16 :goto_0

    :sswitch_18
    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v15, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    add-int/lit16 v15, v15, 0x1d0e

    div-int/2addr v4, v15

    if-eqz v4, :cond_15

    const/16 v4, 0x1e

    sput v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    const-string v4, "\u06e8\u06e2\u06e4"

    move v15, v14

    goto/16 :goto_7

    :cond_15
    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v15, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    div-int/2addr v4, v15

    const v15, 0x1aaae8

    add-int/2addr v4, v15

    move/from16 v23, v4

    move/from16 v16, v14

    goto/16 :goto_0

    :sswitch_19
    const-string v4, "xV4NoiHin3DIZAKSO/GVQMJeGg==\n"

    const-string v9, "rjt0/VKS8B8=\n"

    invoke-static {v4, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v9, "PJk=\n"

    const-string v15, "Cqn2avzZ5Vc=\n"

    invoke-static {v9, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v9}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object v4, v8

    goto/16 :goto_2

    :sswitch_1a
    const/4 v4, 0x0

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v15

    if-gtz v15, :cond_16

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v15, "\u06e8\u06e2\u06e8"

    invoke-static {v15}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v15

    move/from16 v22, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :cond_16
    sget v15, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v22, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sub-int v15, v15, v22

    const v22, 0x1aaa29

    xor-int v15, v15, v22

    move/from16 v22, v4

    move/from16 v23, v15

    goto/16 :goto_0

    :sswitch_1b
    sget v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v4, v4, -0x31c

    aput-object v13, v19, v4

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v4, v4, -0x186

    aput-object v11, v19, v4

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    xor-int/lit16 v4, v4, -0xc4

    aput-object v12, v19, v4

    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v15, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int/lit16 v15, v15, 0x1197

    sub-int/2addr v4, v15

    if-ltz v4, :cond_1e

    const-string v4, "\u06e7\u06e4\u06e2"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_1c
    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v15, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sub-int/2addr v4, v15

    const v15, 0x1ac66d

    xor-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_1d
    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v15, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    rem-int/lit16 v15, v15, 0x60d

    sub-int/2addr v4, v15

    if-gtz v4, :cond_17

    const-string v4, "\u06df\u06e1\u06e1"

    goto/16 :goto_5

    :cond_17
    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v15, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    mul-int/2addr v4, v15

    const v15, 0x1909e1

    add-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_1e
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    if-ltz v4, :cond_18

    const-string v4, "\u06e2\u06e3\u06e6"

    goto/16 :goto_1

    :cond_18
    const-string v4, "\u06e8\u06e0\u06e4"

    goto/16 :goto_8

    :sswitch_1f
    invoke-static/range {v18 .. v18}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v15

    const-string v4, "compile(...)"

    invoke-static {v4, v15}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v17, ":time:"

    move-object/from16 v0, v17

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v17, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v17, :cond_19

    const-string v17, "\u06e2\u06e3\u06e1"

    invoke-static/range {v17 .. v17}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v23

    move-object/from16 v17, v4

    move-object/from16 v21, v15

    goto/16 :goto_0

    :cond_19
    sget v17, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v21, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    add-int v17, v17, v21

    const v21, 0x1ab1a6

    add-int v23, v17, v21

    move-object/from16 v17, v4

    move-object/from16 v21, v15

    goto/16 :goto_0

    :cond_1a
    :sswitch_20
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v15, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/2addr v4, v15

    const v15, 0x1ab2a1

    xor-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_1b
    move-object v7, v4

    :cond_1c
    :sswitch_21
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v4

    if-ltz v4, :cond_1d

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v4, "\u06e8\u06e5\u06e7"

    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v23, v4

    goto/16 :goto_0

    :cond_1d
    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v15, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/2addr v4, v15

    const v15, 0x1ac7b0

    add-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_22
    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v4, v4, -0x188

    add-int/2addr v6, v4

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v4

    if-ltz v4, :cond_1f

    :cond_1e
    const-string v4, "\u06e0\u06e1\u06e6"

    goto/16 :goto_a

    :cond_1f
    const-string v15, "\u06e3\u06e1\u06e6"

    move-object v4, v10

    goto/16 :goto_3

    :sswitch_23
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v4, :cond_20

    const/16 v4, 0x12

    sput v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    const-string v4, "\u06e8\u06e2\u06e0"

    goto/16 :goto_6

    :cond_20
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v15, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    mul-int/2addr v4, v15

    const v15, 0x59d47

    add-int/2addr v4, v15

    move/from16 v23, v4

    goto/16 :goto_0

    :sswitch_24
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0xdcbb -> :sswitch_12
        0xdcf7 -> :sswitch_18
        0x1aa782 -> :sswitch_1c
        0x1aa7ba -> :sswitch_20
        0x1aa81e -> :sswitch_d
        0x1aaae3 -> :sswitch_21
        0x1aaae8 -> :sswitch_a
        0x1aab05 -> :sswitch_1a
        0x1aab80 -> :sswitch_17
        0x1aaf1c -> :sswitch_19
        0x1aaf60 -> :sswitch_1f
        0x1aaf79 -> :sswitch_2
        0x1aaf99 -> :sswitch_1b
        0x1ab24a -> :sswitch_23
        0x1ab261 -> :sswitch_11
        0x1ab268 -> :sswitch_c
        0x1ab2c0 -> :sswitch_21
        0x1ab2c4 -> :sswitch_22
        0x1ab31d -> :sswitch_f
        0x1ab35e -> :sswitch_e
        0x1ab608 -> :sswitch_10
        0x1ab648 -> :sswitch_8
        0x1ab9ea -> :sswitch_b
        0x1ab9eb -> :sswitch_16
        0x1aba05 -> :sswitch_21
        0x1abac5 -> :sswitch_9
        0x1abade -> :sswitch_1e
        0x1abdaa -> :sswitch_14
        0x1abdc6 -> :sswitch_4
        0x1abe20 -> :sswitch_1c
        0x1abe26 -> :sswitch_6
        0x1ac5a4 -> :sswitch_1e
        0x1ac5a5 -> :sswitch_1
        0x1ac5aa -> :sswitch_21
        0x1ac624 -> :sswitch_1d
        0x1ac625 -> :sswitch_7
        0x1ac8c9 -> :sswitch_5
        0x1ac8ec -> :sswitch_13
        0x1ac92a -> :sswitch_3
        0x1ac92e -> :sswitch_15
        0x1ac94d -> :sswitch_24
    .end sparse-switch
.end method

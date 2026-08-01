.class public final Lcz;
.super Landroid/text/style/ReplacementSpan;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:F

.field public d:F

.field public final e:F


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 16

    const-string v1, "2CF2b+bv/A==\n"

    const-string v2, "qkABO4OXiAA=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct/range {p0 .. p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const-string v12, "\u06e2\u06e2\u06e5"

    invoke-static {v12}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v12

    move-object v13, v3

    move-object v14, v8

    move v15, v12

    :goto_0
    sparse-switch v15, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v3

    if-gtz v3, :cond_d

    const/16 v3, 0x4f

    sput v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v3, "\u06e8\u06e3\u06e5"

    :goto_1
    invoke-static {v3}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto :goto_0

    :sswitch_1
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Char sequence is empty."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    :sswitch_2
    const-string v3, "\u06e2\u06e5\u06e8"

    :goto_2
    invoke-static {v3}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto :goto_0

    :sswitch_3
    const-string v3, "\u06e2\u06e3\u06e8"

    invoke-static {v3}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v9, v14

    move v15, v3

    goto :goto_0

    :sswitch_4
    const/high16 v3, 0x41200000    # 10.0f

    move-object/from16 v0, p0

    iput v3, v0, Lcz;->c:F

    const/high16 v3, -0x40800000    # -1.0f

    move-object/from16 v0, p0

    iput v3, v0, Lcz;->d:F

    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v3, :cond_2

    const/16 v3, 0x5a

    sput v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    :cond_1
    const-string v3, "\u06e2\u06e6\u06e2"

    :goto_3
    invoke-static {v3}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto :goto_0

    :cond_2
    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v8, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    or-int/2addr v3, v8

    const v8, 0x1acb28

    add-int/2addr v3, v8

    move v15, v3

    goto :goto_0

    :sswitch_5
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v3, :cond_3

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v3, "\u06df\u06e7\u06e1"

    invoke-static {v3}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto :goto_0

    :cond_3
    const-string v8, "\u06df\u06e5"

    move-object v3, v6

    :goto_4
    invoke-static {v8}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v8

    move-object v6, v3

    move v15, v8

    goto :goto_0

    :sswitch_6
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_13

    invoke-virtual {v11, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    if-ltz v3, :cond_4

    const/16 v3, 0x37

    sput v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v3, "\u06e2\u06e8\u06e3"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e7\u06e4\u06e6"

    :goto_5
    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :sswitch_7
    const-string v1, ""

    if-lez v2, :cond_0

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    mul-int/lit16 v8, v8, -0xf1c

    rem-int/2addr v3, v8

    if-gtz v3, :cond_5

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v3, "\u06e3\u06e2\u06e5"

    goto :goto_5

    :cond_5
    const-string v3, "\u06e8\u06e2\u06e5"

    goto/16 :goto_1

    :cond_6
    :sswitch_8
    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    if-gtz v3, :cond_7

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v3, "\u06e0\u06e3\u06e1"

    goto/16 :goto_2

    :cond_7
    const-string v8, "\u06e3\u06e2\u06e5"

    move-object v3, v11

    move-object v12, v4

    :goto_6
    invoke-static {v8}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v8

    move-object v11, v3

    move-object v4, v12

    move v15, v8

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-static {v6, v3}, Lgn;->b(Ljava/lang/String;I)I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lcz;->b:I

    const-string v3, "\u06e6\u06e5\u06e2"

    :goto_7
    invoke-static {v3}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :sswitch_a
    const-string v3, "WSwD2g"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۦ۟ۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v3

    sget v8, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v12, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/2addr v8, v12

    const v12, 0xdb70

    add-int/2addr v8, v12

    move-object v13, v3

    move v15, v8

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v0, p0

    iput-object v4, v0, Lcz;->a:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move-result v3

    if-gtz v3, :cond_f

    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    if-gtz v3, :cond_8

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v3, "\u06e2\u06e5\u06e8"

    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e2\u06e4\u06df"

    move-object v8, v9

    :goto_8
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move-object v9, v8

    move v15, v3

    goto/16 :goto_0

    :sswitch_c
    sget-object v7, Lgn;->a:Lgn;

    const-string v3, "gWWdMZZob3q1boUDgVJ5ZItwlAuWUn1ik2yB\n"

    const-string v6, "6gDkbuQNDhY=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget v6, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v8, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/lit16 v8, v8, -0x7e3

    div-int/2addr v6, v8

    if-eqz v6, :cond_9

    const-string v6, "\u06df\u06e5\u06e0"

    move-object v8, v6

    goto/16 :goto_4

    :cond_9
    sget v6, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v8, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    or-int/2addr v6, v8

    const v8, -0x1aa441

    xor-int/2addr v8, v6

    move-object v6, v3

    move v15, v8

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v3

    if-ltz v3, :cond_a

    const/16 v3, 0x34

    sput v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v3, "\u06df\u06e6"

    move-object v8, v10

    goto :goto_8

    :cond_a
    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v8, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    div-int/2addr v3, v8

    const v8, 0x1ac5e4

    xor-int/2addr v3, v8

    move-object v9, v10

    move v15, v3

    goto/16 :goto_0

    :sswitch_e
    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    add-int/lit16 v4, v4, -0x566

    add-int/2addr v3, v4

    if-ltz v3, :cond_b

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    const-string v3, "\u06e5\u06e3\u06e1"

    invoke-static {v3}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v5

    move v15, v3

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06df\u06e7\u06e1"

    move-object v4, v5

    goto/16 :goto_3

    :sswitch_f
    const-string v3, ""

    sget v8, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v8, :cond_c

    const-string v8, "\u06e2\u06e2\u06e5"

    invoke-static {v8}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v8

    move-object v14, v3

    move v15, v8

    goto/16 :goto_0

    :cond_c
    sget v8, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v12, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    or-int/2addr v8, v12

    const v12, -0x1abe03

    xor-int/2addr v8, v12

    move-object v14, v3

    move v15, v8

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e2\u06e3\u06e8"

    invoke-static {v3}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :sswitch_10
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_6

    invoke-static/range {p1 .. p1}, Lb50;->D(Ljava/lang/CharSequence;)I

    move-result v3

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v10

    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v8, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    or-int/2addr v3, v8

    const v8, 0x1abaa5

    add-int/2addr v3, v8

    move v15, v3

    goto/16 :goto_0

    :sswitch_11
    const/high16 v2, 0x41000000    # 8.0f

    move-object/from16 v0, p0

    iput v2, v0, Lcz;->e:F

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v2

    sget v3, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v8, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    rem-int/lit16 v8, v8, 0xdfe

    xor-int/2addr v3, v8

    if-gtz v3, :cond_1

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v3, "\u06e6\u06e8\u06e5"

    invoke-static {v3}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v3

    if-gtz v3, :cond_e

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v8, "\u06df\u06e0\u06e7"

    move-object v3, v11

    move-object v12, v4

    goto/16 :goto_6

    :cond_e
    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v8, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    rem-int/2addr v3, v8

    const v8, 0x1ab397

    add-int/2addr v3, v8

    move v15, v3

    goto/16 :goto_0

    :cond_f
    :sswitch_13
    sget v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v8, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/lit16 v8, v8, 0x10e4

    div-int/2addr v3, v8

    if-eqz v3, :cond_10

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v3, "\u06df\u06e1\u06e0"

    goto/16 :goto_7

    :cond_10
    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v8, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    mul-int/2addr v3, v8

    const v8, 0x1a6ab4    # 2.426001E-39f

    add-int/2addr v3, v8

    move v15, v3

    goto/16 :goto_0

    :sswitch_14
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v13}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v3

    if-ltz v3, :cond_11

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    const-string v3, "\u06e8\u06e2\u06e5"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :cond_11
    const-string v3, "\u06e3\u06e6\u06e2"

    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v3

    move v15, v3

    goto/16 :goto_0

    :sswitch_15
    const-string v3, "MdZvr1L+zZAF3XedRcTcjj/Vf4g=\n"

    const-string v4, "WrMW8CCbrPw=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "7KB5\n"

    const-string v8, "CRD2Fg6e1qc=\n"

    invoke-static {v4, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v4

    if-ltz v4, :cond_12

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v4, "\u06e3\u06e5\u06e4"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v8

    move-object v11, v3

    move-object v4, v1

    move v15, v8

    goto/16 :goto_0

    :cond_12
    const-string v4, "\u06e3\u06e5\u06e4"

    move-object v8, v4

    move-object v12, v1

    goto/16 :goto_6

    :cond_13
    :sswitch_16
    const-string v8, "\u06df\u06e7\u06e1"

    move-object v3, v11

    move-object v12, v4

    goto/16 :goto_6

    :sswitch_17
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe6 -> :sswitch_0
        0xdbe7 -> :sswitch_13
        0xdc9f -> :sswitch_14
        0x1aa762 -> :sswitch_9
        0x1aa7ba -> :sswitch_0
        0x1aa7f9 -> :sswitch_b
        0x1aab23 -> :sswitch_16
        0x1aabde -> :sswitch_2
        0x1ab2a5 -> :sswitch_c
        0x1ab2c7 -> :sswitch_15
        0x1ab2dd -> :sswitch_a
        0x1ab305 -> :sswitch_f
        0x1ab31e -> :sswitch_7
        0x1ab35d -> :sswitch_8
        0x1ab666 -> :sswitch_1
        0x1ab6c2 -> :sswitch_6
        0x1ab6df -> :sswitch_17
        0x1aba82 -> :sswitch_d
        0x1abe03 -> :sswitch_3
        0x1ac203 -> :sswitch_4
        0x1ac263 -> :sswitch_12
        0x1ac5a9 -> :sswitch_e
        0x1ac5e4 -> :sswitch_5
        0x1ac92b -> :sswitch_10
        0x1ac94d -> :sswitch_11
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 38

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v35, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    const/16 v36, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/16 v24, 0x0

    const/16 v23, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v33, 0x0

    const/16 v22, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v25, "\u06e0\u06e5\u06e8"

    invoke-static/range {v25 .. v25}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v37

    move-object/from16 v25, v3

    move-object/from16 v26, v6

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    move/from16 v29, v9

    move/from16 v30, v10

    move/from16 v31, v11

    :goto_0
    sparse-switch v37, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const-string v3, "\u06df\u06e1\u06e6"

    :goto_1
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto :goto_0

    :sswitch_1
    const/high16 v3, 0x40000000    # 2.0f

    add-float/2addr v3, v4

    const/high16 v6, 0x41000000    # 8.0f

    sub-float/2addr v3, v6

    const/high16 v6, 0x40000000    # 2.0f

    sub-float v6, v3, v6

    move-object/from16 v3, p1

    move v7, v5

    move-object/from16 v8, p9

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v0, v27

    iget v7, v0, Landroid/graphics/RectF;->right:F

    move-object/from16 v0, v27

    iget v8, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v3, 0x41300000    # 11.0f

    add-float/2addr v3, v8

    const/high16 v6, 0x41000000    # 8.0f

    sub-float/2addr v3, v6

    const/high16 v6, 0x41300000    # 11.0f

    sub-float v10, v3, v6

    move-object/from16 v6, p1

    move v9, v7

    move-object/from16 v11, p9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v6, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    div-int/2addr v3, v6

    const v6, 0x1ab2fc

    xor-int/2addr v3, v6

    move/from16 v37, v3

    goto :goto_0

    :sswitch_2
    move-object v3, v12

    :cond_1
    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v7, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    xor-int/lit16 v7, v7, 0x2376

    add-int/2addr v6, v7

    if-gtz v6, :cond_2

    const-string v6, "\u06e6\u06df\u06df"

    :goto_2
    invoke-static {v6}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v6

    move-object v12, v3

    move/from16 v37, v6

    goto :goto_0

    :cond_2
    sget v6, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v7, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sub-int/2addr v6, v7

    const v7, 0x1ab97e

    add-int/2addr v6, v7

    move-object v12, v3

    move/from16 v37, v6

    goto :goto_0

    :cond_3
    :sswitch_3
    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v6, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    div-int/lit16 v6, v6, -0x175f

    xor-int/2addr v3, v6

    if-gtz v3, :cond_4

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v3, "\u06e6\u06e8\u06e1"

    :goto_3
    invoke-static {v3}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto :goto_0

    :cond_4
    const-string v3, "\u06e3\u06e3\u06e2"

    goto :goto_3

    :sswitch_4
    const/4 v3, 0x1

    move-object/from16 v0, p9

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v3

    move-object/from16 v0, p9

    invoke-virtual {v0, v12}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v6

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getTextSize()F

    move-result v7

    sget v8, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v8, :cond_5

    const-string v8, "\u06e4\u06e4\u06e1"

    invoke-static {v8}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v3

    move v14, v6

    move v15, v7

    move/from16 v37, v8

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u06e7\u06e3\u06e6"

    :goto_4
    invoke-static {v8}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v3

    move v14, v6

    move v15, v7

    move/from16 v37, v8

    goto/16 :goto_0

    :sswitch_5
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v25

    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/lit16 v6, v6, -0x14e0

    rem-int/2addr v3, v6

    if-gtz v3, :cond_22

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v3, "\u06e1\u06e1"

    invoke-static {v3}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v0, v27

    iget v8, v0, Landroid/graphics/RectF;->top:F

    const/high16 v6, 0x40800000    # 4.0f

    const/4 v7, 0x0

    sub-float v3, v7, v3

    sub-float v7, v6, v3

    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->right:F

    const/high16 v6, 0x41100000    # 9.0f

    sub-float/2addr v3, v6

    const/high16 v6, 0x40800000    # 4.0f

    sub-float/2addr v3, v6

    const/high16 v6, 0x41100000    # 9.0f

    add-float v9, v3, v6

    move-object/from16 v6, p1

    move v10, v8

    move-object/from16 v11, p9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->left:F

    const-string v6, "\u06e4\u06e4\u06e1"

    :goto_5
    invoke-static {v6}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v23, v3

    move/from16 v37, v6

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, v27

    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v3, 0x41700000    # 15.0f

    add-float/2addr v3, v5

    const/high16 v4, 0x41000000    # 8.0f

    sub-float/2addr v3, v4

    const/high16 v4, 0x41700000    # 15.0f

    sub-float v7, v3, v4

    move-object/from16 v3, p1

    move/from16 v4, v22

    move/from16 v6, v22

    move-object/from16 v8, p9

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v0, v27

    iget v4, v0, Landroid/graphics/RectF;->right:F

    move-object/from16 v0, v27

    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v3

    if-gtz v3, :cond_6

    const/16 v3, 0x4a

    sput v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v3, "\u06df\u06e8"

    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_6
    sget v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v6, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sub-int/2addr v3, v6

    const v6, 0x1ab84d

    add-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_8
    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, v27

    iget v7, v0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v6, v7

    const/high16 v7, 0x40800000    # 4.0f

    sub-float/2addr v6, v7

    sub-float v8, v3, v6

    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v6, 0x41e00000    # 28.0f

    add-float/2addr v3, v6

    const/high16 v6, 0x40800000    # 4.0f

    sub-float/2addr v3, v6

    const/high16 v6, 0x41e00000    # 28.0f

    sub-float v10, v3, v6

    move-object/from16 v6, p1

    move/from16 v7, v24

    move/from16 v9, v24

    move-object/from16 v11, p9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v6, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    add-int/lit16 v6, v6, 0x1455

    rem-int/2addr v3, v6

    if-ltz v3, :cond_7

    const-string v3, "\u06e0\u06e0\u06e5"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_7
    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v6, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    rem-int/2addr v3, v6

    const v6, 0x1aa93d

    add-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_8
    :sswitch_9
    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/2addr v3, v6

    const v6, 0x1ac255

    add-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_a
    move/from16 v0, v21

    new-array v3, v0, [F

    const/4 v6, 0x0

    const/high16 v7, 0x41000000    # 8.0f

    aput v7, v3, v6

    const/4 v6, 0x1

    const/high16 v7, 0x40c00000    # 6.0f

    aput v7, v3, v6

    new-instance v6, Landroid/graphics/DashPathEffect;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v7}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    const/high16 v3, 0x41000000    # 8.0f

    const/high16 v6, 0x41000000    # 8.0f

    move-object/from16 v0, p1

    move-object/from16 v1, v27

    move-object/from16 v2, p9

    invoke-virtual {v0, v1, v3, v6, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v6, v6, -0x3dd

    or-int/2addr v3, v6

    if-ltz v3, :cond_a

    :cond_9
    const-string v8, "\u06e3\u06e8\u06df"

    move-object v3, v13

    move v6, v14

    move v7, v15

    goto/16 :goto_4

    :cond_a
    sget v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v6, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/2addr v3, v6

    const v6, -0x1aa54e

    xor-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v0, v27

    iget v8, v0, Landroid/graphics/RectF;->bottom:F

    const/4 v3, 0x0

    const/4 v6, 0x0

    sub-float v6, v6, v23

    const/high16 v7, 0x40800000    # 4.0f

    sub-float/2addr v6, v7

    sub-float v7, v3, v6

    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->right:F

    const/high16 v6, 0x3f800000    # 1.0f

    add-float/2addr v3, v6

    const/high16 v6, 0x40800000    # 4.0f

    sub-float/2addr v3, v6

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float v9, v3, v6

    move-object/from16 v6, p1

    move v10, v8

    move-object/from16 v11, p9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    if-ltz v3, :cond_b

    const/16 v3, 0xc

    sput v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v3, "\u06e2\u06e5"

    invoke-static {v3}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u06e5\u06e7\u06e5"

    move/from16 v3, v19

    move/from16 v6, v20

    move/from16 v7, v21

    :goto_6
    invoke-static {v8}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v19, v3

    move/from16 v20, v6

    move/from16 v21, v7

    move/from16 v37, v8

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, p9

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    move-object/from16 v0, p9

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p9

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v3, 0x0

    move-object/from16 v0, p9

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v6, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/lit16 v6, v6, 0x1598

    rem-int/2addr v3, v6

    if-ltz v3, :cond_c

    const/16 v3, 0x2d

    sput v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v3, "\u06e5\u06e1\u06e7"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_c
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/2addr v3, v6

    const v6, 0x1aaa6e

    xor-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_d
    :sswitch_d
    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    or-int/lit16 v6, v6, -0x1457

    div-int/2addr v3, v6

    if-eqz v3, :cond_e

    const-string v3, "\u06e6\u06e4\u06e1"

    :goto_7
    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_e
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v6, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    mul-int/2addr v3, v6

    const v6, -0x1e536b

    xor-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_e
    move/from16 v0, v21

    int-to-float v6, v0

    move-object/from16 v0, p0

    iget v7, v0, Lcz;->c:F

    new-instance v3, Landroid/graphics/RectF;

    const/4 v8, 0x0

    sub-float v8, v8, v20

    sub-float v8, p5, v8

    const/high16 v9, 0x41a00000    # 20.0f

    add-float v9, v9, v19

    const/4 v10, 0x0

    const/high16 v11, 0x41000000    # 8.0f

    sub-float/2addr v10, v11

    sub-float v10, v15, v10

    sub-float/2addr v9, v10

    const/high16 v10, 0x41a00000    # 20.0f

    sub-float/2addr v9, v10

    const/4 v10, 0x0

    sub-float v10, v10, v20

    sub-float v10, p5, v10

    const/high16 v11, 0x41a00000    # 20.0f

    add-float/2addr v10, v11

    add-float/2addr v10, v14

    const/high16 v11, 0x41a00000    # 20.0f

    sub-float/2addr v10, v11

    const/4 v11, 0x0

    mul-float/2addr v6, v7

    sub-float v6, v11, v6

    sub-float v6, v10, v6

    move/from16 v0, v19

    invoke-direct {v3, v8, v9, v6, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->red(I)I

    move-result v6

    sget v8, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v9, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    xor-int/2addr v8, v9

    const v9, -0x1aa88b

    xor-int/2addr v8, v9

    move-object/from16 v28, v3

    move/from16 v31, v6

    move/from16 v35, v7

    move/from16 v37, v8

    goto/16 :goto_0

    :sswitch_f
    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v6, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    div-int/lit16 v6, v6, -0x165b

    add-int/2addr v3, v6

    if-gtz v3, :cond_f

    const/16 v3, 0x3d

    sput v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    const-string v3, "\u06e2\u06df"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u06df\u06e3\u06e3"

    :goto_8
    invoke-static {v3}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_10
    const/high16 v3, 0x41000000    # 8.0f

    const/high16 v6, 0x41000000    # 8.0f

    move-object/from16 v0, p1

    move-object/from16 v1, v27

    move-object/from16 v2, p9

    invoke-virtual {v0, v1, v3, v6, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v6, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/lit16 v6, v6, 0xa19

    xor-int/2addr v3, v6

    if-gtz v3, :cond_10

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v3, "\u06e0\u06e2\u06e3"

    invoke-static {v3}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_10
    sget v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/2addr v3, v6

    const v6, -0x1aa6fa

    xor-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_11
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getTextSize()F

    move-result v6

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getColor()I

    move-result v7

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v3

    const v8, 0x3f47ae14    # 0.78f

    mul-float/2addr v8, v6

    move-object/from16 v0, p9

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    sget v8, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v9, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    xor-int/lit16 v9, v9, -0x16f

    rem-int/2addr v8, v9

    if-gtz v8, :cond_19

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v8, "\u06e3\u06e8\u06e8"

    :goto_9
    invoke-static {v8}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v16, v3

    move/from16 v17, v6

    move/from16 v18, v7

    move/from16 v37, v8

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v3

    if-gtz v3, :cond_0

    const-string v3, "YdayNzzPnFCIQCpE68k0E"

    invoke-static {v3}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۣۣ۟۠۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    move-result v6

    if-ltz v6, :cond_11

    const/16 v6, 0x51

    sput v6, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v6, "\u06e2\u06e3\u06e5"

    invoke-static {v6}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v25, v3

    move/from16 v37, v6

    goto/16 :goto_0

    :cond_11
    sget v6, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v7, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    or-int/2addr v6, v7

    const v7, 0x1aa9a7

    add-int/2addr v6, v7

    move-object/from16 v25, v3

    move/from16 v37, v6

    goto/16 :goto_0

    :sswitch_13
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/lit16 v6, v6, 0xc93

    sub-int/2addr v3, v6

    if-ltz v3, :cond_12

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    const-string v3, "\u06e8\u06e7\u06e0"

    goto/16 :goto_1

    :cond_12
    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v6, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sub-int/2addr v3, v6

    const v6, -0x1aab24

    xor-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_14
    move/from16 v0, p7

    int-to-float v3, v0

    move-object/from16 v0, v16

    iget v6, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    const/4 v7, 0x0

    sub-float v3, v7, v3

    sub-float v3, v6, v3

    const/high16 v6, 0x41c00000    # 24.0f

    sub-float/2addr v3, v6

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float/2addr v3, v6

    const/high16 v6, 0x41c00000    # 24.0f

    add-float/2addr v3, v6

    move-object/from16 v0, p0

    iget v6, v0, Lcz;->e:F

    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/lit16 v7, v7, -0x1ad

    sget v8, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v9, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/lit16 v9, v9, -0x19d4

    sub-int/2addr v8, v9

    if-gtz v8, :cond_13

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v8, "\u06e0\u06e3"

    goto/16 :goto_6

    :cond_13
    sget v8, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v9, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/2addr v8, v9

    const v9, 0x1aaaeb

    xor-int/2addr v8, v9

    move/from16 v19, v3

    move/from16 v20, v6

    move/from16 v21, v7

    move/from16 v37, v8

    goto/16 :goto_0

    :cond_14
    :sswitch_15
    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v3

    if-gtz v3, :cond_15

    const-string v3, "\u06e3\u06e7\u06e4"

    :goto_a
    invoke-static {v3}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_15
    const-string v6, "\u06e1\u06e6\u06e2"

    move-object v3, v12

    goto/16 :goto_2

    :sswitch_16
    move/from16 v0, v21

    new-array v3, v0, [F

    const/4 v6, 0x0

    const/high16 v7, 0x40400000    # 3.0f

    aput v7, v3, v6

    const/4 v6, 0x1

    const/high16 v7, 0x40800000    # 4.0f

    aput v7, v3, v6

    new-instance v6, Landroid/graphics/DashPathEffect;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v7}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    move-object/from16 v0, p9

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    const/high16 v3, 0x41000000    # 8.0f

    const/high16 v6, 0x41000000    # 8.0f

    move-object/from16 v0, p1

    move-object/from16 v1, v27

    move-object/from16 v2, p9

    invoke-virtual {v0, v1, v3, v6, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const-string v3, "\u06e4\u06e4\u06e5"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_17
    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    move-result v3

    if-ltz v3, :cond_16

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v3, "\u06e7\u06e3\u06e6"

    invoke-static {v3}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_16
    const-string v8, "\u06e3\u06e4\u06e1"

    move-object/from16 v3, v16

    move/from16 v6, v17

    move/from16 v7, v18

    goto/16 :goto_9

    :sswitch_18
    const/4 v3, 0x4

    move/from16 v0, v30

    if-eq v0, v3, :cond_3

    const/4 v3, 0x5

    move/from16 v0, v30

    if-eq v0, v3, :cond_14

    const-string v3, "\u06e0\u06e0\u06e5"

    goto/16 :goto_8

    :sswitch_19
    move-object/from16 v0, p9

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    move-object/from16 v0, p9

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v6, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/2addr v3, v6

    const v6, 0x1abb5b

    add-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_1a
    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->blue(I)I

    move-result v6

    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v0, p9

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v7, 0x3fc00000    # 1.5f

    move-object/from16 v0, p9

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget v7, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v8, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    xor-int/2addr v7, v8

    const v8, 0x1ac433

    add-int/2addr v7, v8

    move/from16 v29, v3

    move/from16 v36, v6

    move/from16 v37, v7

    goto/16 :goto_0

    :sswitch_1b
    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v3, :cond_17

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v6, "\u06e2\u06e5\u06e0"

    move/from16 v3, v22

    :goto_b
    invoke-static {v6}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v22, v3

    move/from16 v37, v6

    goto/16 :goto_0

    :cond_17
    sget v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/2addr v3, v6

    const v6, 0x1ac085

    add-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_1c
    const/high16 v3, 0x40000000    # 2.0f

    sub-float v3, v34, v3

    const/high16 v6, 0x41000000    # 8.0f

    sub-float/2addr v3, v6

    const/high16 v6, 0x40000000    # 2.0f

    add-float v9, v3, v6

    move-object/from16 v6, p1

    move/from16 v7, v34

    move/from16 v8, v33

    move/from16 v10, v33

    move-object/from16 v11, p9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v0, v27

    iget v7, v0, Landroid/graphics/RectF;->right:F

    move-object/from16 v0, v27

    iget v8, v0, Landroid/graphics/RectF;->top:F

    const/4 v3, 0x0

    const/high16 v6, 0x41000000    # 8.0f

    sub-float/2addr v3, v6

    sub-float v10, v8, v3

    move-object/from16 v6, p1

    move v9, v7

    move-object/from16 v11, p9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v6, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/lit16 v6, v6, 0x1dc8

    or-int/2addr v3, v6

    if-gtz v3, :cond_18

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v3, "\u06df\u06e4\u06e2"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_18
    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v6, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/2addr v3, v6

    const v6, 0x1ac54c

    xor-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_1d
    sget v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v3, :cond_1a

    const/16 v3, 0x3a

    sput v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    move-object/from16 v3, v16

    move/from16 v6, v17

    move/from16 v7, v18

    :cond_19
    const-string v8, "\u06df\u06e6\u06e2"

    invoke-static {v8}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v16, v3

    move/from16 v17, v6

    move/from16 v18, v7

    move/from16 v37, v8

    goto/16 :goto_0

    :cond_1a
    const-string v3, "\u06e3\u06e2\u06e5"

    :goto_c
    invoke-static {v3}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_1e
    if-eqz v30, :cond_8

    const/4 v3, 0x1

    move/from16 v0, v30

    if-eq v0, v3, :cond_d

    move/from16 v0, v30

    move/from16 v1, v21

    if-eq v0, v1, :cond_26

    const/4 v3, 0x3

    move/from16 v0, v30

    if-eq v0, v3, :cond_1d

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v3

    if-gtz v3, :cond_1b

    const/16 v3, 0x5a

    sput v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    const-string v6, "\u06e3\u06e3\u06e2"

    move/from16 v3, v23

    goto/16 :goto_5

    :cond_1b
    const-string v3, "\u06e3\u06df\u06e8"

    goto/16 :goto_7

    :sswitch_1f
    move-object/from16 v0, v27

    iget v8, v0, Landroid/graphics/RectF;->top:F

    const/high16 v3, 0x40c00000    # 6.0f

    add-float/2addr v3, v8

    const/high16 v6, 0x41000000    # 8.0f

    add-float/2addr v3, v6

    const/high16 v6, 0x40c00000    # 6.0f

    sub-float v10, v3, v6

    move-object/from16 v6, p1

    move/from16 v7, v32

    move/from16 v9, v32

    move-object/from16 v11, p9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v0, v27

    iget v6, v0, Landroid/graphics/RectF;->right:F

    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->top:F

    sget v7, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v7, :cond_1c

    const-string v7, "\u06e7\u06df\u06e8"

    invoke-static {v7}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v7

    move/from16 v33, v3

    move/from16 v34, v6

    move/from16 v37, v7

    goto/16 :goto_0

    :cond_1c
    sget v7, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/2addr v7, v8

    const v8, -0x1abe46

    xor-int/2addr v7, v8

    move/from16 v33, v3

    move/from16 v34, v6

    move/from16 v37, v7

    goto/16 :goto_0

    :cond_1d
    :sswitch_20
    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v6, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/lit16 v6, v6, -0x20f1

    xor-int/2addr v3, v6

    if-ltz v3, :cond_1e

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v3, "\u06e2\u06e8\u06e6"

    :goto_d
    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_1e
    sget v3, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    mul-int/2addr v3, v6

    const v6, 0x19ec44

    add-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_21
    move-object/from16 v0, v27

    iget v7, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v0, v27

    iget v8, v0, Landroid/graphics/RectF;->bottom:F

    const/4 v3, 0x0

    const/high16 v6, 0x41000000    # 8.0f

    sub-float/2addr v3, v6

    sub-float v9, v7, v3

    move-object/from16 v6, p1

    move v10, v8

    move-object/from16 v11, p9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->left:F

    sget v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/lit16 v7, v7, -0x21bd

    sub-int/2addr v6, v7

    if-gtz v6, :cond_1f

    const-string v6, "\u06e4\u06e7\u06e4"

    invoke-static {v6}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v22, v3

    move/from16 v37, v6

    goto/16 :goto_0

    :cond_1f
    const-string v6, "\u06e5\u06df\u06e5"

    goto/16 :goto_b

    :sswitch_22
    move-object/from16 v0, v27

    iget v7, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v0, v27

    iget v8, v0, Landroid/graphics/RectF;->top:F

    const/4 v3, 0x0

    const/high16 v6, 0x41000000    # 8.0f

    sub-float/2addr v3, v6

    sub-float v9, v7, v3

    move-object/from16 v6, p1

    move v10, v8

    move-object/from16 v11, p9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->left:F

    sget v6, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/2addr v6, v7

    const v7, 0x1ac97a    # 2.459999E-39f

    add-int/2addr v6, v7

    move/from16 v32, v3

    move/from16 v37, v6

    goto/16 :goto_0

    :sswitch_23
    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v6, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    rem-int/lit16 v6, v6, 0x1d59

    sub-int/2addr v3, v6

    if-ltz v3, :cond_20

    const-string v3, "\u06e4\u06e7\u06e2"

    goto/16 :goto_8

    :cond_20
    const-string v3, "\u06df\u06df\u06e1"

    goto/16 :goto_a

    :sswitch_24
    const-string v3, "1c5xn3JH\n"

    const-string v6, "tq8f6RM0aZ0=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "jQexjyY=\n"

    const-string v6, "/WbY4VJMUSE=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p9

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcz;->a:Ljava/lang/String;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_1

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v6

    if-ltz v6, :cond_21

    const/16 v6, 0x41

    sput v6, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    const-string v6, "\u06e0\u06e5\u06e8"

    invoke-static {v6}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v6

    move-object v12, v3

    move/from16 v37, v6

    goto/16 :goto_0

    :cond_21
    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v7, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/2addr v6, v7

    const v7, 0xda76

    add-int/2addr v6, v7

    move-object v12, v3

    move/from16 v37, v6

    goto/16 :goto_0

    :sswitch_25
    invoke-virtual/range {v28 .. v28}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    iget v6, v13, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v7, v13, Landroid/graphics/Paint$FontMetrics;->ascent:F

    const/4 v8, 0x0

    sub-float v6, v8, v6

    sub-float v6, v7, v6

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    move-object/from16 v0, v28

    iget v7, v0, Landroid/graphics/RectF;->left:F

    const/4 v8, 0x0

    sub-float v8, v8, v35

    sub-float/2addr v7, v8

    const/high16 v8, 0x41100000    # 9.0f

    add-float/2addr v3, v8

    sub-float/2addr v3, v6

    const/high16 v6, 0x41100000    # 9.0f

    sub-float/2addr v3, v6

    move-object/from16 v0, p1

    move-object/from16 v1, p9

    invoke-virtual {v0, v12, v7, v3, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/lit16 v6, v6, -0x1de8

    xor-int/2addr v3, v6

    if-gtz v3, :cond_9

    const/16 v3, 0x46

    sput v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v3, "\u06e8\u06e0\u06e6"

    invoke-static {v3}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_26
    move-object/from16 v0, v27

    iget v7, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->top:F

    const/high16 v6, 0x40c00000    # 6.0f

    add-float/2addr v3, v6

    const/high16 v6, 0x40800000    # 4.0f

    add-float/2addr v3, v6

    const/high16 v6, 0x40c00000    # 6.0f

    sub-float v8, v3, v6

    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v6, 0x41d00000    # 26.0f

    add-float/2addr v3, v6

    const/high16 v6, 0x40800000    # 4.0f

    sub-float/2addr v3, v6

    const/high16 v6, 0x41d00000    # 26.0f

    sub-float v10, v3, v6

    move-object/from16 v6, p1

    move v9, v7

    move-object/from16 v11, p9

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v0, v27

    iget v3, v0, Landroid/graphics/RectF;->right:F

    const-string v6, "\u06e4\u06e1\u06e0"

    :goto_e
    invoke-static {v6}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v6

    move/from16 v24, v3

    move/from16 v37, v6

    goto/16 :goto_0

    :sswitch_27
    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v6, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    div-int/lit16 v6, v6, -0x1e23

    sub-int/2addr v3, v6

    if-gtz v3, :cond_23

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    :cond_22
    const-string v3, "\u06df\u06e1\u06e6"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_23
    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v6, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/2addr v3, v6

    const v6, 0x1aab41

    add-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_28
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    if-ltz v3, :cond_24

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v3, "\u06df\u06e3\u06e3"

    invoke-static {v3}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v37, v3

    goto/16 :goto_0

    :cond_24
    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v6, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    mul-int/2addr v3, v6

    const v6, 0x20bf3d

    add-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_29
    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    if-ltz v3, :cond_25

    const-string v6, "\u06e7\u06e8"

    move/from16 v3, v24

    goto :goto_e

    :cond_25
    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    mul-int/2addr v3, v6

    const v6, 0x1553d0

    add-int/2addr v3, v6

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_2a
    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v3, v3, -0xf4

    move/from16 v0, v31

    move/from16 v1, v29

    move/from16 v2, v36

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    move-object/from16 v0, p9

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v6, Landroid/graphics/RectF;

    move-object/from16 v0, v28

    iget v3, v0, Landroid/graphics/RectF;->left:F

    const/high16 v7, 0x41b00000    # 22.0f

    sub-float/2addr v3, v7

    const v7, 0x3f19999a    # 0.6f

    add-float/2addr v3, v7

    const/high16 v7, 0x41b00000    # 22.0f

    add-float/2addr v3, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, v28

    iget v9, v0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v8, v9

    const v9, 0x3f19999a    # 0.6f

    sub-float/2addr v8, v9

    sub-float/2addr v7, v8

    move-object/from16 v0, v28

    iget v8, v0, Landroid/graphics/RectF;->right:F

    const/high16 v9, 0x40c00000    # 6.0f

    add-float/2addr v8, v9

    const v9, 0x3f19999a    # 0.6f

    sub-float/2addr v8, v9

    const/high16 v9, 0x40c00000    # 6.0f

    sub-float/2addr v8, v9

    move-object/from16 v0, v28

    iget v9, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v10, 0x41600000    # 14.0f

    add-float/2addr v9, v10

    const v10, 0x3f19999a    # 0.6f

    sub-float/2addr v9, v10

    const/high16 v10, 0x41600000    # 14.0f

    sub-float/2addr v9, v10

    invoke-direct {v6, v3, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getPathEffect()Landroid/graphics/PathEffect;

    move-result-object v3

    move-object/from16 v0, p0

    iget v7, v0, Lcz;->b:I

    const-string v8, "\u06e7\u06e8"

    invoke-static {v8}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v26, v3

    move-object/from16 v27, v6

    move/from16 v30, v7

    move/from16 v37, v8

    goto/16 :goto_0

    :cond_26
    :sswitch_2b
    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v3

    if-ltz v3, :cond_27

    const/16 v3, 0x62

    sput v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v3, "\u06e1\u06e2"

    goto/16 :goto_c

    :cond_27
    const-string v3, "\u06e0\u06e3"

    goto/16 :goto_d

    :sswitch_2c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0xdc03 -> :sswitch_16
        0xdc20 -> :sswitch_2b
        0xdc43 -> :sswitch_12
        0xdc45 -> :sswitch_9
        0xdce1 -> :sswitch_1e
        0x1aa701 -> :sswitch_27
        0x1aa744 -> :sswitch_2c
        0x1aa77f -> :sswitch_c
        0x1aa79d -> :sswitch_28
        0x1aa7db -> :sswitch_4
        0x1aaae5 -> :sswitch_29
        0x1aab05 -> :sswitch_5
        0x1aab21 -> :sswitch_15
        0x1aab3f -> :sswitch_f
        0x1aab5f -> :sswitch_25
        0x1aab7f -> :sswitch_1a
        0x1aab83 -> :sswitch_24
        0x1aaf5d -> :sswitch_26
        0x1ab281 -> :sswitch_f
        0x1ab2c4 -> :sswitch_23
        0x1ab2fd -> :sswitch_1b
        0x1ab341 -> :sswitch_a
        0x1ab60c -> :sswitch_18
        0x1ab665 -> :sswitch_d
        0x1ab666 -> :sswitch_23
        0x1ab682 -> :sswitch_6
        0x1ab6a0 -> :sswitch_f
        0x1ab71a -> :sswitch_19
        0x1ab723 -> :sswitch_2
        0x1aba03 -> :sswitch_8
        0x1aba0b -> :sswitch_f
        0x1aba5f -> :sswitch_2c
        0x1aba61 -> :sswitch_b
        0x1aba65 -> :sswitch_17
        0x1aba9f -> :sswitch_1
        0x1abac1 -> :sswitch_11
        0x1abd8b -> :sswitch_7
        0x1abdcb -> :sswitch_3
        0x1abe23 -> :sswitch_e
        0x1abe45 -> :sswitch_1c
        0x1abe83 -> :sswitch_1d
        0x1abe9d -> :sswitch_10
        0x1ac204 -> :sswitch_22
        0x1ac225 -> :sswitch_2a
        0x1ac247 -> :sswitch_f
        0x1ac50f -> :sswitch_20
        0x1ac510 -> :sswitch_13
        0x1ac548 -> :sswitch_f
        0x1ac588 -> :sswitch_21
        0x1ac58a -> :sswitch_14
        0x1ac8ee -> :sswitch_1f
    .end sparse-switch
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 8

    const/high16 v7, 0x41e00000    # 28.0f

    const/4 v4, 0x0

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e4\u06e5"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v3

    move v0, v4

    move v5, v4

    move v2, v4

    move v6, v3

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    const-string v5, "\u06e5\u06e3\u06e0"

    invoke-static {v5}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v6

    move v5, v3

    goto :goto_0

    :sswitch_1
    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    xor-int/lit16 v2, v2, 0x1e0

    int-to-float v2, v2

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    if-ltz v3, :cond_0

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    :goto_1
    const-string v3, "\u06e7\u06e3\u06df"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto :goto_0

    :cond_0
    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v6, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/2addr v3, v6

    const v6, 0x1ab49b

    add-int/2addr v3, v6

    move v6, v3

    goto :goto_0

    :sswitch_2
    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v6, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v6, v6, 0x1865

    sub-int/2addr v3, v6

    if-ltz v3, :cond_1

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    const-string v3, "\u06df\u06e3\u06e6"

    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto :goto_0

    :cond_1
    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/2addr v3, v6

    const v6, -0x1aa7a3

    xor-int/2addr v3, v6

    move v6, v3

    goto :goto_0

    :sswitch_3
    const v3, 0x3f4ccccd    # 0.8f

    mul-float/2addr v3, v0

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    sget v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    if-ltz v3, :cond_4

    const-string v3, "\u06e5\u06e3\u06e0"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto :goto_0

    :sswitch_4
    iget v3, p0, Lcz;->c:F

    mul-float/2addr v3, v2

    sub-float v3, v4, v3

    sub-float/2addr v3, v5

    sub-float v3, v4, v3

    add-float/2addr v3, v7

    iget v6, p0, Lcz;->e:F

    add-float/2addr v3, v6

    sub-float/2addr v3, v7

    iput v3, p0, Lcz;->d:F

    goto :goto_1

    :sswitch_5
    iget v0, p0, Lcz;->d:F

    float-to-int v0, v0

    :goto_2
    return v0

    :sswitch_6
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_8

    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v6, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    or-int/lit16 v6, v6, -0x162d

    mul-int/2addr v3, v6

    if-ltz v3, :cond_2

    const/16 v3, 0x3a

    sput v3, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    const-string v3, "\u06e2\u06df\u06e7"

    invoke-static {v3}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06df\u06e5\u06e6"

    :goto_3
    invoke-static {v3}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    sget v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v6, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/lit16 v6, v6, 0x10ec

    xor-int/2addr v3, v6

    if-ltz v3, :cond_3

    const-string v3, "\u06df\u06e5\u06e6"

    goto :goto_3

    :cond_3
    const-string v3, "\u06e7\u06e6\u06e2"

    invoke-static {v3}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    sget v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    add-int/lit16 v6, v6, 0x1264

    xor-int/2addr v3, v6

    if-gtz v3, :cond_6

    :cond_4
    const-string v3, "\u06e4\u06e3"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, 0x0

    goto :goto_2

    :sswitch_a
    const-string v3, "v+2f+G0=\n"

    const-string v6, "z4z2lhlN9i0=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v6, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    or-int/lit16 v6, v6, 0x1a0c

    rem-int/2addr v3, v6

    if-ltz v3, :cond_5

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    const-string v3, "\u06e0\u06e3\u06e3"

    invoke-static {v3}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e2\u06df\u06e7"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto/16 :goto_0

    :sswitch_b
    iget-object v1, p0, Lcz;->a:Ljava/lang/String;

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v3

    if-gtz v3, :cond_7

    :cond_6
    const-string v3, "\u06e1\u06e7\u06e2"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto/16 :goto_0

    :cond_7
    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v6, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/2addr v3, v6

    const v6, 0x1aab40

    add-int/2addr v3, v6

    move v6, v3

    goto/16 :goto_0

    :cond_8
    :sswitch_c
    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v6, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/lit16 v6, v6, -0x1369

    mul-int/2addr v3, v6

    if-gtz v3, :cond_9

    const/16 v3, 0x56

    sput v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v3, "\u06e7\u06e2\u06e3"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v3

    move v6, v3

    goto/16 :goto_0

    :cond_9
    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v6, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/2addr v3, v6

    const v6, 0x1ab624

    add-int/2addr v3, v6

    move v6, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc7f -> :sswitch_0
        0x1aa7a0 -> :sswitch_a
        0x1aa7c0 -> :sswitch_9
        0x1aab40 -> :sswitch_6
        0x1aaea8 -> :sswitch_2
        0x1aaf7c -> :sswitch_3
        0x1ab24a -> :sswitch_b
        0x1ab2c5 -> :sswitch_4
        0x1ab625 -> :sswitch_8
        0x1abe02 -> :sswitch_1
        0x1ac224 -> :sswitch_c
        0x1ac583 -> :sswitch_7
        0x1ac5e3 -> :sswitch_5
    .end sparse-switch
.end method

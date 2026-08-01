.class public final synthetic Ltc;
.super Ljava/lang/Object;

# interfaces
.implements Lsm;


# instance fields
.field public final a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 3

    iput p1, p0, Ltc;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e4\u06e5"

    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "ARVw7WFI2Bvtbn"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->۟ۡۦۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    xor-int/lit16 v2, v2, -0x188

    rem-int/2addr v1, v2

    if-gtz v1, :cond_1

    const-string v1, "\u06e1\u06e2\u06e6"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    add-int/lit16 v2, v2, 0x1746

    div-int/2addr v1, v2

    if-eqz v1, :cond_0

    const-string v1, "\u06e7\u06e2\u06e0"

    invoke-static {v1}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    div-int/2addr v1, v2

    const v2, 0x1aa7a0

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    div-int/2addr v1, v2

    const v2, 0x1abe01

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_1
    const-string v1, "\u06e8\u06e7"

    :goto_1
    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    or-int/2addr v1, v2

    const v2, 0x1abe02

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v1

    if-gtz v1, :cond_2

    sget v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/lit16 v2, v2, -0x37c

    sub-int/2addr v1, v2

    if-gtz v1, :cond_3

    const-string v1, "\u06df\u06e3\u06e4"

    goto :goto_1

    :cond_3
    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/2addr v1, v2

    const v2, 0xdc4f

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc22 -> :sswitch_0
        0xdcff -> :sswitch_2
        0x1aa780 -> :sswitch_1
        0x1aa7a0 -> :sswitch_4
        0x1aaee5 -> :sswitch_3
        0x1abe01 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/4 v7, 0x0

    const-string v18, "\u06e3\u06e4\u06e7"

    invoke-static/range {v18 .. v18}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v21

    move-object/from16 v18, v2

    move-object/from16 v19, v6

    move-object/from16 v20, v13

    :goto_0
    sparse-switch v21, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/lit16 v2, v2, 0x356

    const-string v6, ""

    aput-object v6, v16, v2

    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/lit16 v2, v2, -0x26a

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v16, v2

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v2

    if-gtz v2, :cond_9

    const-string v2, "\u06e2\u06e3\u06e0"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :sswitch_1
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/String;

    const-string v6, "gUJ8BR5pxLA=\n"

    const-string v11, "5ysQYFAIqdU=\n"

    invoke-static {v6, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget v11, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v12, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    add-int/lit16 v12, v12, 0x7ca

    xor-int/2addr v11, v12

    if-gtz v11, :cond_a

    const/16 v11, 0x61

    sput v11, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v11, "\u06e4\u06e4\u06e5"

    invoke-static {v11}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v13

    move-object v11, v2

    move-object v12, v6

    move/from16 v21, v13

    goto :goto_0

    :pswitch_0
    :sswitch_2
    const-string v2, "\u06e6\u06e7\u06e1"

    move-object v13, v2

    :goto_1
    invoke-static {v13}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :sswitch_3
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v6, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    or-int/lit16 v6, v6, -0xd27

    or-int/2addr v2, v6

    if-ltz v2, :cond_1

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-object v2, v3

    :cond_0
    const-string v3, "\u06e3\u06e5\u06e8"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v6

    move-object v3, v2

    move/from16 v21, v6

    goto :goto_0

    :cond_1
    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v6, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    rem-int/2addr v2, v6

    const v6, 0x1aaf04

    add-int/2addr v2, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_4
    const-string v2, "UBOMsSR0Tl8aB5D6\n"

    const-string v6, "bGbixFcRKn8=\n"

    invoke-static {v2, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v2, :cond_2

    const-string v2, "\u06e1\u06e2\u06e6"

    invoke-static {v2}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_2
    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sub-int/2addr v2, v6

    const v6, 0x1aad3f

    add-int/2addr v2, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_5
    const/4 v2, 0x2

    new-array v15, v2, [Ljava/lang/Object;

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/lit16 v2, v2, 0x267

    aput-object v3, v15, v2

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/lit16 v2, v2, -0x127

    aput-object v4, v15, v2

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    if-ltz v2, :cond_3

    const/16 v2, 0x1b

    sput v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v2, "\u06e3\u06e3\u06e0"

    invoke-static {v2}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06e3\u06e5\u06e2"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :pswitch_1
    :sswitch_6
    const-string v2, "\u06e2\u06e0\u06e7"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v2, p1

    check-cast v2, Luc;

    const-string v6, "qg==\n"

    const-string v7, "ybJjiH/Jm3Y=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v7, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/lit16 v7, v7, 0x184f

    or-int/2addr v6, v7

    if-gtz v6, :cond_4

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v6, "\u06e6\u06e6\u06e7"

    invoke-static {v6}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v6

    move-object v7, v2

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_4
    move-object v6, v8

    :goto_3
    const-string v7, "\u06e8\u06e8"

    invoke-static {v7}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v13

    move-object v7, v2

    move-object v8, v6

    move/from16 v21, v13

    goto/16 :goto_0

    :pswitch_2
    :sswitch_8
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v2

    if-gtz v2, :cond_5

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v6, "\u06e7\u06df\u06e6"

    move-object v2, v5

    :goto_4
    invoke-static {v6}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v6

    move-object v5, v2

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_5
    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v6, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    div-int/2addr v2, v6

    const v6, 0x1aa792

    add-int/2addr v2, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_9
    const/4 v2, 0x2

    new-array v6, v2, [Ljava/lang/Object;

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    xor-int/lit16 v2, v2, -0x1bb

    aput-object v11, v6, v2

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/lit16 v2, v2, -0x31e

    aput-object v12, v6, v2

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v8, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    or-int/lit16 v8, v8, -0x1fdc

    or-int/2addr v2, v8

    if-ltz v2, :cond_6

    const/16 v2, 0x57

    sput v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    move-object v2, v7

    goto :goto_3

    :cond_6
    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v8, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    div-int/2addr v2, v8

    const v8, 0x1ac238

    add-int/2addr v2, v8

    move-object v8, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_a
    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    xor-int/lit16 v2, v2, -0xec

    aput-object v9, v10, v2

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    xor-int/lit16 v2, v2, -0x2b6

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v10, v2

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v2

    if-ltz v2, :cond_7

    const-string v2, "\u06e2\u06e0\u06e3"

    invoke-static {v2}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_7
    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/2addr v2, v6

    const v6, 0x1abf8b

    add-int/2addr v2, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/String;

    const-string v6, "+Z03TD2Ia2g=\n"

    const-string v9, "n/RbKXPpBg0=\n"

    invoke-static {v6, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v9

    if-ltz v9, :cond_8

    :goto_5
    const-string v9, "\u06e2\u06e1\u06e2"

    invoke-static {v9}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v13

    move-object v9, v2

    move-object v10, v6

    move/from16 v21, v13

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u06e4\u06e4\u06e8"

    move-object v9, v2

    move-object v10, v6

    goto/16 :goto_1

    :cond_9
    const-string v2, "\u06e0\u06e4\u06df"

    :goto_6
    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_c
    move-object v10, v14

    :goto_7
    :sswitch_d
    return-object v10

    :sswitch_e
    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/lit16 v2, v2, 0x1fd

    const-string v6, ""

    aput-object v6, v17, v2

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/lit16 v2, v2, 0x265

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v17, v2

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v6, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    mul-int/lit16 v6, v6, 0xa02

    add-int/2addr v2, v6

    if-ltz v2, :cond_b

    const/16 v2, 0x54

    sput v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    move-object v2, v11

    move-object v6, v12

    :cond_a
    const-string v11, "\u06e1\u06e0\u06e3"

    invoke-static {v11}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v13

    move-object v11, v2

    move-object v12, v6

    move/from16 v21, v13

    goto/16 :goto_0

    :cond_b
    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v6, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/2addr v2, v6

    const v6, 0x1ac767

    xor-int/2addr v2, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_f
    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/lit16 v2, v2, -0x97

    const-string v6, ""

    aput-object v6, v5, v2

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/lit16 v2, v2, 0x345

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v6, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/lit16 v6, v6, 0x75f

    sub-int/2addr v2, v6

    if-ltz v2, :cond_c

    const-string v2, "\u06e8\u06df\u06e1"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_c
    move-object v2, v9

    move-object v6, v10

    goto/16 :goto_5

    :sswitch_10
    iget-object v10, v7, Luc;->a:Ljava/lang/String;

    goto :goto_7

    :sswitch_11
    move-object v10, v15

    goto :goto_7

    :pswitch_3
    :sswitch_12
    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v6, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/lit16 v6, v6, -0x26ef

    add-int/2addr v2, v6

    if-ltz v2, :cond_d

    const/16 v2, 0x56

    sput v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v2, "\u06e6\u06e7"

    move-object v13, v2

    goto/16 :goto_1

    :cond_d
    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v6, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/2addr v2, v6

    const v6, -0x1ab1be

    xor-int/2addr v2, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_13
    const-string v2, "jU2Xyvxh\n"

    const-string v6, "/yjmhZ4LtFE=\n"

    invoke-static {v2, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x3

    new-array v0, v2, [Ljava/lang/Object;

    move-object/from16 v17, v0

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/lit16 v2, v2, -0x27f

    aput-object p1, v17, v2

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v2, :cond_e

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v2, "\u06e0\u06e2\u06e0"

    invoke-static {v2}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_e
    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v6, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    mul-int/2addr v2, v6

    const v6, 0x1b51af

    add-int/2addr v2, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :pswitch_4
    :sswitch_14
    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v6, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    or-int/lit16 v6, v6, -0xcfc

    or-int/2addr v2, v6

    if-ltz v2, :cond_f

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v2, "\u06e7\u06e2\u06e5"

    invoke-static {v2}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_f
    const-string v2, "\u06e4\u06e7\u06e7"

    invoke-static {v2}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, v20

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    xor-int/lit16 v6, v6, 0x437

    mul-int/2addr v2, v6

    if-ltz v2, :cond_10

    const-string v2, "\u06e7\u06e4\u06e2"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e2\u06e0\u06df"

    move-object v13, v2

    goto/16 :goto_1

    :sswitch_16
    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v2, :cond_11

    const/16 v2, 0x38

    sput v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v2, "\u06df\u06e2\u06e6"

    goto/16 :goto_2

    :cond_11
    const-string v2, "\u06e3\u06e4\u06e7"

    goto/16 :goto_2

    :pswitch_5
    :sswitch_17
    const-string v2, "\u06e3\u06e7\u06e6"

    :goto_8
    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v10, v16

    goto/16 :goto_7

    :sswitch_19
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/String;

    const-string v6, "6ibouFMoWpg=\n"

    const-string v13, "jE+E3R1JN/0=\n"

    invoke-static {v6, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v6, 0x2

    new-array v14, v6, [Ljava/lang/Object;

    sget v6, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v13, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    or-int/lit16 v13, v13, 0x1e67

    mul-int/2addr v6, v13

    if-ltz v6, :cond_12

    const/16 v6, 0x63

    sput v6, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v6, "\u06e6\u06e7\u06e1"

    invoke-static {v6}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v18, v2

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_12
    sget v6, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v13, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/2addr v6, v13

    const v13, 0x1ab13a

    add-int/2addr v6, v13

    move-object/from16 v18, v2

    move/from16 v21, v6

    goto/16 :goto_0

    :sswitch_1a
    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    xor-int/lit8 v2, v2, 0x37

    aput-object v18, v14, v2

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/lit16 v2, v2, 0x17d

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v14, v2

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v6, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    mul-int/lit16 v6, v6, 0x1e1c

    add-int/2addr v2, v6

    if-ltz v2, :cond_17

    const-string v2, "\u06e8\u06e0\u06e2"

    invoke-static {v2}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :pswitch_6
    :sswitch_1b
    const-string v6, "\u06e7\u06e4\u06e2"

    move-object v2, v5

    goto/16 :goto_4

    :sswitch_1c
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/String;

    const-string v3, "w7a9lWqnuMM=\n"

    const-string v4, "pd/R8CTG1aY=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v3

    if-ltz v3, :cond_0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v3, "\u06e3\u06e5\u06e2"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v6

    move-object v3, v2

    move/from16 v21, v6

    goto/16 :goto_0

    :sswitch_1d
    const-string v2, "TpVsGEFv\n"

    const-string v6, "PPAdVyMFB3k=\n"

    invoke-static {v2, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x3

    new-array v0, v2, [Ljava/lang/Object;

    move-object/from16 v16, v0

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    xor-int/lit16 v2, v2, -0x383

    aput-object p1, v16, v2

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v6, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    rem-int/lit16 v6, v6, 0x1f0f

    mul-int/2addr v2, v6

    if-gtz v2, :cond_13

    const-string v2, "\u06e6\u06e6\u06e1"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_13
    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    add-int/2addr v2, v6

    const v6, 0xdd53

    add-int/2addr v2, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :pswitch_7
    :sswitch_1e
    const-string v2, "\u06e1\u06e2\u06e6"

    :goto_9
    invoke-static {v2}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_1f
    sget-object v10, Lvh;->n:Lvh;

    goto/16 :goto_7

    :sswitch_20
    const/4 v2, 0x0

    new-array v10, v2, [Ljava/lang/Object;

    goto/16 :goto_7

    :pswitch_8
    :sswitch_21
    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v6, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    div-int/lit16 v6, v6, -0xf38

    xor-int/2addr v2, v6

    if-ltz v2, :cond_14

    const/16 v2, 0x41

    sput v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v2, "\u06e2\u06e8\u06e3"

    goto/16 :goto_6

    :cond_14
    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v6, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    xor-int/2addr v2, v6

    const v6, 0x1ab5d0

    add-int/2addr v2, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :pswitch_9
    :sswitch_22
    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v6, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    add-int/lit16 v6, v6, 0x104

    xor-int/2addr v2, v6

    if-ltz v2, :cond_15

    const-string v2, "\u06e0\u06e8"

    goto/16 :goto_8

    :cond_15
    const-string v6, "\u06e4\u06e2\u06e2"

    move-object v2, v5

    goto/16 :goto_4

    :sswitch_23
    move-object/from16 v10, v17

    goto/16 :goto_7

    :sswitch_24
    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_7

    :sswitch_25
    move-object v10, v5

    goto/16 :goto_7

    :sswitch_26
    const-string v2, "AAERqGrb\n"

    const-string v5, "cmRg5wix2Gg=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/lit16 v5, v5, 0x163

    aput-object p1, v2, v5

    sget v5, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    if-gtz v5, :cond_16

    const/16 v5, 0x2d

    sput v5, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v5, "\u06e6\u06e5\u06e7"

    invoke-static {v5}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v6

    move-object v5, v2

    move/from16 v21, v6

    goto/16 :goto_0

    :cond_16
    const-string v5, "\u06e5\u06e0\u06e3"

    move-object v6, v5

    goto/16 :goto_4

    :sswitch_27
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/String;

    const-string v6, "FXY=\n"

    const-string v13, "fAJvGEUj2pE=\n"

    invoke-static {v6, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v13, "\'"

    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v13, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v19, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    mul-int v13, v13, v19

    const v19, 0x1f94c1

    add-int v13, v13, v19

    move-object/from16 v19, v2

    move-object/from16 v20, v6

    move/from16 v21, v13

    goto/16 :goto_0

    :sswitch_28
    move-object/from16 v0, p0

    iget v2, v0, Ltc;->a:I

    packed-switch v2, :pswitch_data_0

    :sswitch_29
    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v2, :cond_18

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v2, "\u06e5\u06e1\u06e6"

    goto/16 :goto_9

    :cond_17
    const-string v2, "\u06e1\u06e5\u06df"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_18
    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v6, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/2addr v2, v6

    const v6, 0x1aa7fa

    xor-int/2addr v2, v6

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_2a
    move-object v10, v8

    goto/16 :goto_7

    :sswitch_data_0
    .sparse-switch
        0xdcbb -> :sswitch_0
        0xdd00 -> :sswitch_10
        0x1aa79c -> :sswitch_1d
        0x1aa7f9 -> :sswitch_4
        0x1aab1e -> :sswitch_8
        0x1aab5b -> :sswitch_18
        0x1aab62 -> :sswitch_1e
        0x1aabbe -> :sswitch_20
        0x1aaea4 -> :sswitch_9
        0x1aaee5 -> :sswitch_19
        0x1aaf1f -> :sswitch_1f
        0x1aaf3b -> :sswitch_c
        0x1ab261 -> :sswitch_24
        0x1ab265 -> :sswitch_6
        0x1ab269 -> :sswitch_b
        0x1ab283 -> :sswitch_25
        0x1ab288 -> :sswitch_26
        0x1ab2bf -> :sswitch_1a
        0x1ab31d -> :sswitch_27
        0x1ab680 -> :sswitch_29
        0x1ab6a6 -> :sswitch_28
        0x1ab6c0 -> :sswitch_11
        0x1ab6c4 -> :sswitch_12
        0x1ab6c6 -> :sswitch_5
        0x1ab6e5 -> :sswitch_15
        0x1ab702 -> :sswitch_3
        0x1aba24 -> :sswitch_13
        0x1aba65 -> :sswitch_17
        0x1aba68 -> :sswitch_a
        0x1abaa6 -> :sswitch_e
        0x1abac4 -> :sswitch_7
        0x1abda6 -> :sswitch_1b
        0x1abda7 -> :sswitch_22
        0x1abda8 -> :sswitch_f
        0x1abe66 -> :sswitch_d
        0x1ac208 -> :sswitch_21
        0x1ac221 -> :sswitch_23
        0x1ac227 -> :sswitch_2a
        0x1ac240 -> :sswitch_1
        0x1ac247 -> :sswitch_16
        0x1ac5a5 -> :sswitch_1c
        0x1ac8ca -> :sswitch_2
        0x1ac8ea -> :sswitch_14
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_8
        :pswitch_5
        :pswitch_0
        :pswitch_9
        :pswitch_6
        :pswitch_2
        :pswitch_7
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

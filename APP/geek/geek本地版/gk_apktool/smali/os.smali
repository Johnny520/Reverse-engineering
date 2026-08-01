.class public final Los;
.super Lm50;

# interfaces
.implements Lwm;


# instance fields
.field public final e:Landroid/app/Application;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lld;)V
    .locals 3

    iput-object p1, p0, Los;->e:Landroid/app/Application;

    invoke-direct {p0, p2}, Lm50;-><init>(Lld;)V

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e2\u06e6"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "eKo9xkf0edxs8wzFFyoVJ"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣۨۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/lit16 v2, v2, -0x721

    mul-int/2addr v0, v2

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v0, "\u06e6\u06e3"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-result v0

    if-gtz v0, :cond_2

    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    xor-int/2addr v0, v2

    const v2, 0xdd6b

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v0, :cond_0

    const/16 v0, 0x8

    sput v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    const-string v0, "\u06e4\u06e4\u06e2"

    invoke-static {v0}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/2addr v0, v2

    const v2, 0x1aa6f6

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    div-int/2addr v0, v2

    const v2, 0x1ac9cf

    add-int/2addr v0, v2

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    add-int/2addr v0, v2

    const v2, 0x1abfb2

    add-int/2addr v0, v2

    goto :goto_0

    :cond_2
    :sswitch_4
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    rem-int/lit16 v2, v2, 0x839

    sub-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e2\u06e2\u06e7"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sub-int/2addr v0, v2

    const v2, 0x1ac855

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcbd -> :sswitch_0
        0x1aa763 -> :sswitch_1
        0x1ab2e4 -> :sswitch_4
        0x1ab322 -> :sswitch_2
        0x1abe27 -> :sswitch_3
        0x1ac9c7 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lld;)Lld;
    .locals 2

    const-string v0, "\u06e8\u06e5\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/2addr v0, v1

    const v1, 0x1ac683

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    new-instance v0, Los;

    iget-object v1, p0, Los;->e:Landroid/app/Application;

    invoke-direct {v0, v1, p1}, Los;-><init>(Landroid/app/Application;Lld;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1aa81e -> :sswitch_0
        0x1ac988 -> :sswitch_1
    .end sparse-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e6\u06e5"

    invoke-static {v1}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    move-object v2, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    xor-int/lit16 v3, v3, 0x22cb

    div-int/2addr v0, v3

    if-eqz v0, :cond_0

    const/16 v0, 0x62

    sput v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v0, "\u06e0\u06e8\u06e0"

    :goto_1
    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_0
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    rem-int/2addr v0, v3

    const v3, 0x1abac6

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p2

    check-cast v0, Lld;

    invoke-virtual {p0, v0}, Los;->a(Lld;)Lld;

    move-result-object v0

    check-cast v0, Los;

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    add-int/2addr v2, v3

    const v3, 0x1ab19f

    xor-int/2addr v3, v2

    move-object v2, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Lvh;->n:Lvh;

    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    div-int/lit16 v3, v3, 0x2030

    or-int/2addr v1, v3

    if-gtz v1, :cond_1

    const-string v1, "\u06e2\u06df\u06e7"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto :goto_0

    :cond_1
    sget v1, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    xor-int/2addr v1, v3

    const v3, 0x1abe80

    add-int/2addr v3, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    invoke-virtual {v2, v1}, Los;->g(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    div-int/lit16 v3, v3, 0x1cf2

    sub-int/2addr v0, v3

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v0, "\u06e4\u06e6\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e7\u06e2\u06e6"

    goto :goto_2

    :sswitch_4
    move-object v0, p1

    check-cast v0, Loe;

    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    xor-int/lit16 v3, v3, 0xd0c

    add-int/2addr v0, v3

    if-ltz v0, :cond_3

    const/16 v0, 0x48

    sput v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    const-string v0, "\u06e7\u06e2\u06e6"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e2\u06df\u06e7"

    goto :goto_1

    :sswitch_5
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0x1aa81a -> :sswitch_0
        0x1ab24a -> :sswitch_1
        0x1ab2c4 -> :sswitch_2
        0x1abaa3 -> :sswitch_4
        0x1ac148 -> :sswitch_3
        0x1ac56b -> :sswitch_5
    .end sparse-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    const-wide/16 v6, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const-wide/16 v14, 0x0

    const/4 v9, 0x0

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const-string v16, "\u06e3\u06e2\u06e0"

    invoke-static/range {v16 .. v16}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v22

    move-object/from16 v16, v8

    move-object/from16 v17, v11

    :goto_0
    sparse-switch v22, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v8, "5yVsGqgaq1U=\n"

    sget v11, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v19, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    div-int v11, v11, v19

    const v19, 0x1aba43

    add-int v11, v11, v19

    move-object/from16 v19, v8

    move-object/from16 v21, v9

    move/from16 v22, v11

    goto :goto_0

    :sswitch_1
    const-string v8, "xwGO\n"

    const-string v11, "s2Dpd1+FjZU=\n"

    const-string v22, "53vj\n"

    const-string v23, "igiEy7e+YPk=\n"

    move-object/from16 v0, v18

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v8, v11, v0, v1, v2}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v0, v17

    invoke-static {v8, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v8, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v11, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/lit16 v11, v11, -0x2070

    add-int/2addr v8, v11

    if-ltz v8, :cond_a

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v8, "\u06e1\u06e1\u06e4"

    invoke-static {v8}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v22, v8

    goto :goto_0

    :sswitch_2
    sget-object v5, Lin;->a:Lin;

    move-object/from16 v0, p0

    iget-object v4, v0, Los;->e:Landroid/app/Application;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v8

    if-ltz v8, :cond_1

    :cond_0
    const-string v8, "\u06e0\u06e6\u06e8"

    invoke-static {v8}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v22, v8

    goto :goto_0

    :cond_1
    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v11, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    div-int/2addr v8, v11

    const v11, 0x1ac92c

    add-int/2addr v8, v11

    move/from16 v22, v8

    goto :goto_0

    :sswitch_3
    sget v8, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v11, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/lit16 v11, v11, 0x6c5

    rem-int/2addr v8, v11

    if-gtz v8, :cond_2

    const/16 v8, 0x3b

    sput v8, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    const-string v8, "\u06e6\u06e5\u06e8"

    :goto_1
    invoke-static {v8}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v22, v8

    goto :goto_0

    :cond_2
    sget v8, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v11, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sub-int/2addr v8, v11

    const v11, -0x1ab2b4

    xor-int/2addr v8, v11

    move/from16 v22, v8

    goto/16 :goto_0

    :sswitch_4
    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v8

    if-ltz v8, :cond_3

    const-string v11, "\u06e5\u06e5\u06e3"

    move-object v8, v10

    :goto_2
    invoke-static {v11}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v11

    move-object v10, v8

    move/from16 v22, v11

    goto/16 :goto_0

    :cond_3
    sget v8, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v11, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sub-int/2addr v8, v11

    const v11, 0x1ab590

    add-int/2addr v8, v11

    move/from16 v22, v8

    goto/16 :goto_0

    :sswitch_5
    const-string v12, "+sfb\n"

    const-string v11, "zvfvJqT4dx4=\n"

    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    if-ltz v8, :cond_4

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v8, "\u06df\u06df\u06e2"

    move-object v13, v12

    :goto_3
    invoke-static {v8}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v8

    move-object v12, v11

    move/from16 v22, v8

    goto/16 :goto_0

    :cond_4
    const-string v8, "\u06e0\u06e1\u06e7"

    move-object v13, v12

    goto :goto_3

    :cond_5
    :sswitch_6
    sget v8, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v11, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/2addr v8, v11

    const v11, 0x1aae81

    xor-int/2addr v8, v11

    move/from16 v22, v8

    goto/16 :goto_0

    :sswitch_7
    sget v8, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v8, :cond_6

    const/16 v8, 0x1d

    sput v8, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v8, "\u06e5\u06e1\u06e6"

    invoke-static {v8}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v20, v19

    move/from16 v22, v8

    goto/16 :goto_0

    :cond_6
    sget v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v11, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    rem-int/2addr v8, v11

    const v11, 0x1aa519

    xor-int/2addr v8, v11

    move-object/from16 v20, v19

    move/from16 v22, v8

    goto/16 :goto_0

    :sswitch_8
    sget-object v4, Lvh;->n:Lvh;

    return-object v4

    :sswitch_9
    const-string v8, "\u06e5\u06e5\u06e3"

    :goto_4
    invoke-static {v8}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v22, v8

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    sget-object v8, Lin;->b:Ljava/lang/Class;

    if-eqz v8, :cond_5

    const-string v8, "\u06e0\u06e2\u06df"

    move-object v11, v12

    goto :goto_3

    :sswitch_b
    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v11

    if-ltz v11, :cond_7

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v11, "\u06e8\u06e2\u06e5"

    invoke-static {v11}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v11

    move-object/from16 v17, v8

    move/from16 v22, v11

    goto/16 :goto_0

    :cond_7
    sget v11, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v17, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    add-int v11, v11, v17

    const v17, 0x1abe30

    add-int v11, v11, v17

    move-object/from16 v17, v8

    move/from16 v22, v11

    goto/16 :goto_0

    :sswitch_c
    const-wide/16 v22, 0x12

    sub-long v22, v14, v22

    sub-long v22, v22, v6

    const-wide/16 v24, 0x12

    add-long v22, v22, v24

    move-object/from16 v0, v16

    move-wide/from16 v1, v22

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, "ms, stat: "

    move-object/from16 v0, v16

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v8, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v11, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/2addr v8, v11

    const v11, 0x1ac58d

    add-int/2addr v8, v11

    move/from16 v22, v8

    goto/16 :goto_0

    :sswitch_d
    sget-object v8, Lin;->m:Ljava/lang/Class;

    if-eqz v8, :cond_5

    const-string v9, "1RVc\n"

    const-string v8, "\u06df\u06df\u06e2"

    goto/16 :goto_1

    :sswitch_e
    move-object/from16 v0, v21

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sget v10, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v10, :cond_8

    const/16 v10, 0x40

    sput v10, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    const-string v10, "\u06e3\u06e5\u06e2"

    invoke-static {v10}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v11

    move-object v10, v8

    move/from16 v22, v11

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u06df\u06e0\u06e0"

    move-object v11, v10

    goto/16 :goto_2

    :sswitch_f
    const-string v8, "fCwvCXlbmcNXJjoucEjCnjVncg==\n"

    const-string v11, "G0lbShU66rA=\n"

    invoke-static {v8, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v5, v4}, Lin;->b(Ljava/lang/ClassLoader;)V

    sget v8, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v11, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    mul-int/2addr v8, v11

    const v11, -0x182635

    xor-int/2addr v8, v11

    move/from16 v22, v8

    goto/16 :goto_0

    :sswitch_10
    const-string v8, "hF9uyDmFQyK+VQ==\n"

    const-string v11, "0DYAo1z3EFs=\n"

    invoke-static {v8, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v16, "bg dexopt init done: "

    move-object/from16 v0, v16

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v16

    if-ltz v16, :cond_9

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v16, "\u06e3\u06df\u06e8"

    invoke-static/range {v16 .. v16}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v22

    move-object/from16 v16, v8

    move-object/from16 v18, v11

    goto/16 :goto_0

    :cond_9
    sget v16, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v18, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int v16, v16, v18

    const v18, 0x1ab758

    add-int v22, v16, v18

    move-object/from16 v16, v8

    move-object/from16 v18, v11

    goto/16 :goto_0

    :sswitch_11
    invoke-static/range {p1 .. p1}, Lct;->y(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v8

    if-gtz v8, :cond_0

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    :cond_a
    const-string v8, "\u06df\u06e4\u06e6"

    invoke-static {v8}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v22, v8

    goto/16 :goto_0

    :sswitch_12
    sget v8, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v11, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/lit16 v11, v11, -0x457

    div-int/2addr v8, v11

    if-ltz v8, :cond_b

    const-string v8, "\u06e4\u06e8\u06e5"

    goto/16 :goto_4

    :cond_b
    const-string v8, "\u06df\u06e2\u06e3"

    goto/16 :goto_1

    :sswitch_13
    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v11, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/lit16 v11, v11, 0x1734

    mul-int/2addr v8, v11

    if-ltz v8, :cond_c

    const-string v8, "\u06e7\u06e6\u06e7"

    invoke-static {v8}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v20, v12

    move-object/from16 v21, v13

    move/from16 v22, v8

    goto/16 :goto_0

    :cond_c
    sget v8, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v11, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    mul-int/2addr v8, v11

    const v11, 0x183f41

    add-int/2addr v8, v11

    move-object/from16 v20, v12

    move-object/from16 v21, v13

    move/from16 v22, v8

    goto/16 :goto_0

    :sswitch_14
    sget v8, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    if-gtz v8, :cond_d

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v8, "\u06e4\u06e6\u06e6"

    invoke-static {v8}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v22, v8

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06e7\u06e7\u06e2"

    goto/16 :goto_4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa702 -> :sswitch_0
        0x1aa71f -> :sswitch_4
        0x1aa760 -> :sswitch_e
        0x1aa7a1 -> :sswitch_8
        0x1aab06 -> :sswitch_13
        0x1aab1d -> :sswitch_d
        0x1aaba2 -> :sswitch_2
        0x1aaec4 -> :sswitch_5
        0x1aaf41 -> :sswitch_9
        0x1ab284 -> :sswitch_6
        0x1ab60c -> :sswitch_12
        0x1ab661 -> :sswitch_11
        0x1ab6c0 -> :sswitch_c
        0x1aba44 -> :sswitch_7
        0x1abaa4 -> :sswitch_1
        0x1abdc6 -> :sswitch_9
        0x1abdca -> :sswitch_3
        0x1abe43 -> :sswitch_10
        0x1ac54d -> :sswitch_14
        0x1ac5c5 -> :sswitch_a
        0x1ac5e8 -> :sswitch_b
        0x1ac602 -> :sswitch_12
        0x1ac92b -> :sswitch_f
    .end sparse-switch
.end method

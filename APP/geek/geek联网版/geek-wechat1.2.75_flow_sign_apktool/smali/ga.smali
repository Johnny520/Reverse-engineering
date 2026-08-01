.class public final Lga;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final a:Ln00;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ln00;


# direct methods
.method public constructor <init>(Ln00;Ljava/util/ArrayList;Ln00;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e8\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p3, p0, Lga;->c:Ln00;

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x13

    sput v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v0, "\u06e6\u06e5"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput-object p1, p0, Lga;->a:Ln00;

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e5\u06df\u06e0"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06df\u06e7\u06df"

    goto :goto_1

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    or-int/2addr v0, v2

    const v2, -0x1aaee4

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p2, p0, Lga;->b:Ljava/util/ArrayList;

    const-string v0, "\u06e4\u06e1"

    goto :goto_1

    :sswitch_3
    const-string v0, "GoG"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟۟ۥۥۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    xor-int/lit16 v2, v2, -0x25c7

    mul-int/2addr v1, v2

    if-gtz v1, :cond_2

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v1, "\u06e4\u06e1"

    invoke-static {v1}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    move-result v0

    if-gtz v0, :cond_6

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v0

    if-gtz v0, :cond_3

    const/16 v0, 0x32

    sput v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    move-object v0, v1

    :cond_2
    const-string v1, "\u06e4\u06e7\u06e4"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    add-int/lit16 v2, v2, 0x1f51

    sub-int/2addr v0, v2

    if-ltz v0, :cond_4

    :cond_3
    const-string v0, "\u06e2\u06e6\u06df"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    div-int/2addr v0, v2

    const v2, 0xdcbf

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v0

    if-ltz v0, :cond_5

    const-string v0, "\u06e4\u06e1\u06e3"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    mul-int/2addr v0, v2

    const v2, -0x1870a1

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_6
    :sswitch_7
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v0

    if-ltz v0, :cond_7

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v0, "\u06e1\u06e8\u06e8"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    or-int/2addr v0, v2

    const v2, 0xde02

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc7d -> :sswitch_0
        0xdcbf -> :sswitch_8
        0x1aa7f7 -> :sswitch_2
        0x1aaee3 -> :sswitch_4
        0x1ab31b -> :sswitch_3
        0x1ab9cc -> :sswitch_7
        0x1abac1 -> :sswitch_5
        0x1abd86 -> :sswitch_6
        0x1ac9df -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 18

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/16 v16, 0x0

    const/4 v15, 0x0

    const-string v11, "\u06df\u06e4\u06e2"

    invoke-static {v11}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v14

    move-object v11, v1

    move-object v12, v4

    :goto_0
    sparse-switch v14, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v1, :cond_e

    const/16 v1, 0x30

    sput v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v1, "\u06e0\u06e4\u06e0"

    invoke-static {v1}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto :goto_0

    :sswitch_1
    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    if-ltz v1, :cond_1

    const-string v1, "\u06e8\u06e8\u06e1"

    invoke-static {v1}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e8\u06e8\u06e2"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto :goto_0

    :sswitch_2
    const-string v6, ""

    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v1, :cond_2

    const-string v1, "\u06e2\u06e0\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    mul-int/2addr v1, v4

    const v4, 0x1ae7b4

    add-int/2addr v1, v4

    move v14, v1

    goto :goto_0

    :sswitch_3
    const-string v1, "\u06e6\u06e5\u06e1"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    move-object v5, v9

    move v14, v1

    goto :goto_0

    :sswitch_4
    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    div-int/2addr v1, v4

    const v4, 0x1ac8cc

    xor-int/2addr v1, v4

    move v14, v1

    goto :goto_0

    :cond_3
    :sswitch_5
    sget v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/lit16 v4, v4, -0x1ef9

    rem-int/2addr v1, v4

    if-ltz v1, :cond_4

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    const-string v4, "\u06e4\u06e3\u06e8"

    move-object v1, v3

    :goto_1
    invoke-static {v4}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v1

    move v14, v4

    goto :goto_0

    :cond_4
    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/2addr v1, v4

    const v4, -0x1ab05a

    xor-int/2addr v1, v4

    move v14, v1

    goto :goto_0

    :sswitch_6
    const-string v1, "compile(...)"

    invoke-static {v1, v12}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v1, :cond_5

    :cond_5
    const-string v1, "\u06e5\u06e1\u06e4"

    invoke-static {v1}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v11, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "YLR+074/Ral49giFzn08+Ro=\n"

    const-string v3, "Ppcl45MGBIQ=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v3

    if-gtz v3, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v3, "\u06df\u06e1\u06e6"

    invoke-static {v3}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v1

    move v14, v4

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e8\u06e0\u06e5"

    move-object v4, v3

    goto :goto_1

    :sswitch_8
    const-string v1, "pattern"

    invoke-static {v1, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v12, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    mul-int/2addr v4, v12

    const v12, 0x1b73d1

    xor-int/2addr v4, v12

    move-object v12, v1

    move v14, v4

    goto/16 :goto_0

    :sswitch_9
    if-nez v9, :cond_14

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    or-int/lit16 v4, v4, 0x21d0

    mul-int/2addr v1, v4

    if-ltz v1, :cond_7

    :cond_7
    const-string v1, "\u06e6\u06e8\u06e7"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto/16 :goto_0

    :sswitch_a
    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    or-int/2addr v1, v4

    const v4, -0x1aa7b6

    xor-int/2addr v1, v4

    move v14, v1

    goto/16 :goto_0

    :sswitch_b
    :try_start_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lga;->c:Ln00;

    const/4 v4, -0x1

    iput v4, v1, Ln00;->a:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/lit16 v4, v4, 0x559

    sub-int/2addr v1, v4

    if-ltz v1, :cond_8

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v1, "\u06e7\u06df\u06e7"

    invoke-static {v1}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06e6\u06e6\u06e3"

    :goto_2
    invoke-static {v1}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto/16 :goto_0

    :sswitch_c
    if-eqz p1, :cond_c

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e7\u06df\u06e7"

    :goto_3
    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v7, v1

    move v14, v4

    goto/16 :goto_0

    :sswitch_d
    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v4, "compile(...)"

    invoke-static {v4, v1}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v11, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v11, v11, -0x11bd

    div-int/2addr v4, v11

    if-eqz v4, :cond_9

    const/16 v4, 0x4b

    sput v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    :cond_9
    const-string v4, "\u06e3\u06e5\u06e7"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v11, v1

    move v14, v4

    goto/16 :goto_0

    :sswitch_e
    :try_start_1
    move-object v0, v2

    check-cast v0, Landroid/view/View;

    move-object v1, v0

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    add-int/lit16 v4, v4, -0xb4f

    mul-int/2addr v1, v4

    if-ltz v1, :cond_a

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    const-string v1, "\u06e5\u06e3\u06e1"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    move/from16 v15, v16

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u06e1\u06e3\u06e1"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    move/from16 v15, v16

    goto/16 :goto_0

    :catch_0
    move-exception v1

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit16 v4, v4, 0x1d6b

    add-int/2addr v1, v4

    if-gtz v1, :cond_b

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v1, "\u06e0\u06df\u06e5"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto/16 :goto_0

    :cond_b
    sget v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    xor-int/2addr v1, v4

    const v4, 0x1aa9ef

    add-int/2addr v1, v4

    move v14, v1

    goto/16 :goto_0

    :cond_c
    :sswitch_f
    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/2addr v1, v4

    const v4, -0x187833

    xor-int/2addr v1, v4

    move v14, v1

    goto/16 :goto_0

    :sswitch_10
    sget v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v1, v4

    const v4, 0x1ac9f1

    add-int/2addr v1, v4

    move v14, v1

    move/from16 v15, v17

    goto/16 :goto_0

    :sswitch_11
    :try_start_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lga;->a:Ln00;

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    iput v4, v1, Ln00;->a:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lga;->b:Ljava/util/ArrayList;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    sget v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v1, :cond_d

    const/16 v1, 0xc

    sput v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v1, "\u06e1\u06df\u06e4"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e0\u06df\u06e5"

    move-object v1, v7

    goto/16 :goto_3

    :cond_e
    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sub-int/2addr v1, v4

    const v4, 0x1ac4d0

    add-int/2addr v1, v4

    move v14, v1

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "DlS8CFoOLsQWFspeKkxZlHQ=\n"

    const-string v4, "UHfnOHc3b+k=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "pattern"

    invoke-static {v4, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    if-gtz v4, :cond_f

    const/16 v4, 0xa

    sput v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v4, "\u06e7\u06e0\u06e0"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object v10, v1

    move v14, v4

    goto/16 :goto_0

    :cond_f
    const-string v4, "\u06e6\u06e4\u06e1"

    :goto_4
    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v10, v1

    move v14, v4

    goto/16 :goto_0

    :sswitch_13
    const/16 v17, 0x0

    sget v1, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sub-int/2addr v1, v4

    const v4, 0x1ab960

    add-int/2addr v1, v4

    move v14, v1

    goto/16 :goto_0

    :sswitch_14
    :try_start_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-result v1

    const-string v4, "\u06e7\u06e0\u06e0"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v4

    move v13, v1

    move v14, v4

    goto/16 :goto_0

    :sswitch_15
    if-eqz v7, :cond_c

    invoke-static {v7}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v1

    if-ltz v1, :cond_10

    const-string v4, "\u06e4\u06e0\u06e6"

    move-object v1, v7

    goto/16 :goto_3

    :cond_10
    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sub-int/2addr v1, v4

    const v4, -0x1aca41

    xor-int/2addr v1, v4

    move v14, v1

    goto/16 :goto_0

    :cond_11
    :sswitch_16
    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    add-int/lit16 v4, v4, -0xb3a

    div-int/2addr v1, v4

    if-eqz v1, :cond_12

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    const-string v1, "\u06e0\u06e1\u06df"

    goto/16 :goto_2

    :cond_12
    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sub-int/2addr v1, v4

    const v4, 0x1ab3d6

    add-int/2addr v1, v4

    move v14, v1

    goto/16 :goto_0

    :sswitch_17
    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v1, :cond_13

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    const-string v1, "\u06e2\u06e3\u06e1"

    invoke-static {v1}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v1

    move-object v5, v6

    move v14, v1

    goto/16 :goto_0

    :cond_13
    const-string v4, "\u06df\u06e1\u06e6"

    move-object v1, v3

    move-object v5, v6

    goto/16 :goto_1

    :cond_14
    :sswitch_18
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v1

    if-ltz v1, :cond_15

    const-string v1, "\u06e6\u06df\u06df"

    invoke-static {v1}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto/16 :goto_0

    :cond_15
    sget v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    add-int/2addr v1, v4

    const v4, 0x1aa3de

    add-int/2addr v1, v4

    move v14, v1

    goto/16 :goto_0

    :sswitch_19
    if-ge v15, v13, :cond_11

    :try_start_4
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-result-object v2

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v1

    if-ltz v1, :cond_16

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    const-string v1, "\u06e8\u06e8\u06e2"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto/16 :goto_0

    :cond_16
    const-string v1, "\u06e5\u06e0\u06e8"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto/16 :goto_0

    :sswitch_1a
    invoke-virtual {v12, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    move-result v1

    if-ltz v1, :cond_17

    const-string v4, "\u06e8\u06e0\u06e5"

    move-object v1, v10

    goto/16 :goto_4

    :cond_17
    sget v1, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    div-int/2addr v1, v4

    const v4, -0x1ab26c

    xor-int/2addr v1, v4

    move v14, v1

    goto/16 :goto_0

    :sswitch_1b
    :try_start_5
    sget v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    xor-int/lit16 v1, v1, -0x284

    add-int v16, v15, v1

    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v1, :cond_18

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v1, "\u06e6\u06e5\u06e1"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v14, v1

    goto/16 :goto_0

    :cond_18
    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/2addr v1, v4

    const v4, -0x1ab128

    xor-int/2addr v1, v4

    move v14, v1

    goto/16 :goto_0

    :sswitch_1c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa700 -> :sswitch_0
        0x1aa744 -> :sswitch_12
        0x1aa79d -> :sswitch_c
        0x1aaac6 -> :sswitch_14
        0x1aaae6 -> :sswitch_f
        0x1aae86 -> :sswitch_b
        0x1aaeff -> :sswitch_1
        0x1aaf5d -> :sswitch_0
        0x1ab268 -> :sswitch_11
        0x1ab2c0 -> :sswitch_16
        0x1ab2c2 -> :sswitch_18
        0x1ab35b -> :sswitch_a
        0x1ab628 -> :sswitch_17
        0x1ab667 -> :sswitch_4
        0x1ab6c5 -> :sswitch_7
        0x1ab720 -> :sswitch_e
        0x1ab9ea -> :sswitch_5
        0x1abdad -> :sswitch_1b
        0x1abdc8 -> :sswitch_1a
        0x1abe03 -> :sswitch_10
        0x1ac1e3 -> :sswitch_d
        0x1ac202 -> :sswitch_9
        0x1ac223 -> :sswitch_1c
        0x1ac265 -> :sswitch_2
        0x1ac50f -> :sswitch_15
        0x1ac527 -> :sswitch_13
        0x1ac8cc -> :sswitch_19
        0x1ac8ed -> :sswitch_8
        0x1ac90c -> :sswitch_6
        0x1ac9e1 -> :sswitch_3
        0x1ac9e2 -> :sswitch_4
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const-string v0, "\u06e4\u06e5\u06e7"

    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    if-ltz v0, :cond_0

    const/16 v0, 0x2e

    sput v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v0, "\u06df\u06df\u06e7"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    rem-int/2addr v0, v1

    const v1, 0x1ab7f9

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa81b -> :sswitch_0
        0x1aba86 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e2\u06e7"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v0, "\u06e1\u06e6\u06e4"

    :goto_1
    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06df\u06e0\u06e1"

    goto :goto_1

    :sswitch_2
    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    xor-int/lit16 v2, v2, -0x1041

    xor-int/2addr v0, v2

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v0, "\u06e1\u06e2\u06e4"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sub-int/2addr v0, v2

    const v2, -0x1abe8d

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "8VcN0qY3SlUBQfXLyc1NQ9UXsgYGL"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    xor-int/lit16 v2, v2, -0x21c9

    or-int/2addr v1, v2

    if-ltz v1, :cond_2

    const/16 v1, 0x2f

    sput v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v1, "\u06e5\u06e2\u06e7"

    invoke-static {v1}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    mul-int/2addr v1, v2

    const v2, 0x1cb1a8

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e0\u06e5"

    goto :goto_1

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    if-gtz v0, :cond_4

    const/16 v0, 0x36

    sput v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v0, "\u06e4\u06e4\u06e8"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    xor-int/2addr v0, v2

    const v2, 0x1aa9e8

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc20 -> :sswitch_0
        0x1aa720 -> :sswitch_3
        0x1aaae5 -> :sswitch_5
        0x1aaf81 -> :sswitch_2
        0x1aba68 -> :sswitch_4
        0x1abdea -> :sswitch_1
    .end sparse-switch
.end method

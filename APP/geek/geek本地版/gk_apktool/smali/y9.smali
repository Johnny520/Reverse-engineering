.class public final Ly9;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final a:Lg00;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lg00;


# direct methods
.method public constructor <init>(Lg00;Ljava/util/ArrayList;Lg00;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e2\u06e2"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p2, p0, Ly9;->b:Ljava/util/ArrayList;

    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac21c

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v0

    if-ltz v0, :cond_5

    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/lit16 v2, v2, 0x1974

    rem-int/2addr v0, v2

    if-gtz v0, :cond_0

    const/16 v0, 0x10

    sput v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    :cond_0
    const-string v0, "\u06e1\u06df\u06e2"

    invoke-static {v0}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "Wj3p7KcNDm880a"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۨۧۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v1, :cond_1

    const/16 v1, 0x5b

    sput v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    const-string v1, "\u06df\u06e4\u06e0"

    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_1
    const-string v1, "\u06df\u06e8\u06e5"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    if-ltz v0, :cond_2

    const/16 v0, 0x1e

    sput v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v0, "\u06e7\u06e8\u06e6"

    :goto_1
    invoke-static {v0}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e5\u06e2\u06e2"

    goto :goto_1

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v0, "\u06e5\u06e2\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab467

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    iput-object p1, p0, Ly9;->a:Lg00;

    sget v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    mul-int/lit16 v2, v2, -0xf89

    add-int/2addr v0, v2

    if-ltz v0, :cond_4

    :goto_2
    const-string v0, "\u06e6\u06e3\u06e3"

    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06df\u06e1\u06e3"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput-object p3, p0, Ly9;->c:Lg00;

    goto :goto_2

    :cond_5
    :sswitch_7
    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    mul-int/lit16 v2, v2, 0x1bdc

    mul-int/2addr v0, v2

    if-ltz v0, :cond_6

    const/16 v0, 0xe

    sput v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v0, "\u06e2\u06e4\u06e3"

    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e3\u06e0\u06e2"

    goto :goto_1

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa741 -> :sswitch_0
        0x1aa79b -> :sswitch_3
        0x1aa81c -> :sswitch_4
        0x1aae84 -> :sswitch_2
        0x1ab35a -> :sswitch_7
        0x1ab625 -> :sswitch_8
        0x1abde5 -> :sswitch_5
        0x1ac1c6 -> :sswitch_1
        0x1ac203 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 19

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const-string v15, "\u06e8\u06e3"

    invoke-static {v15}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v18

    move-object v15, v1

    move-object/from16 v16, v11

    move-object/from16 v17, v13

    :goto_0
    sparse-switch v18, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-eqz v16, :cond_11

    invoke-static/range {v16 .. v16}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v11, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    xor-int/2addr v1, v11

    const v11, 0x1ac09d

    add-int/2addr v1, v11

    move/from16 v18, v1

    goto :goto_0

    :sswitch_1
    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, "\u06e6\u06e8\u06e1"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto :goto_0

    :sswitch_2
    const-string v1, "bWUlmtK4lCl1J1PMovrjeRc=\n"

    const-string v10, "M0Z+qv+B1QQ=\n"

    invoke-static {v1, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v10, "pattern"

    invoke-static {v10, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v10, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v11, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    add-int/lit16 v11, v11, -0x550

    mul-int/2addr v10, v11

    if-ltz v10, :cond_0

    const/16 v10, 0x30

    sput v10, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    const-string v10, "\u06e8\u06e2\u06e1"

    invoke-static {v10}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v11

    move-object v10, v1

    move/from16 v18, v11

    goto :goto_0

    :cond_0
    const-string v11, "\u06e2\u06df\u06df"

    move-object v10, v1

    move v13, v9

    :goto_2
    invoke-static {v11}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    move v9, v13

    goto :goto_0

    :sswitch_3
    sget v1, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v1, :cond_1

    const/4 v1, 0x5

    sput v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v1, "\u06e7\u06df\u06e7"

    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v5, v17

    move/from16 v18, v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int/2addr v1, v5

    const v5, 0x1ab33e

    add-int/2addr v1, v5

    move-object/from16 v5, v17

    move/from16 v18, v1

    goto :goto_0

    :sswitch_4
    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v11, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sub-int/2addr v1, v11

    const v11, -0x1abd56

    xor-int/2addr v1, v11

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_5
    :try_start_0
    move-object v0, v2

    check-cast v0, Landroid/view/View;

    move-object v1, v0

    const/4 v11, 0x0

    invoke-virtual {v1, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "\u06e0\u06e5\u06df"

    move-object v11, v1

    move v12, v9

    move v13, v9

    goto :goto_2

    :sswitch_6
    :try_start_1
    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    xor-int/lit16 v1, v1, -0xfd

    add-int/2addr v1, v12

    sget v9, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v11, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    mul-int/lit16 v11, v11, 0x173b

    xor-int/2addr v9, v11

    if-gtz v9, :cond_e

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v9, "\u06e2\u06df\u06df"

    invoke-static {v9}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v11

    move/from16 v18, v11

    move v9, v1

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "compile(...)"

    invoke-static {v1, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    if-gtz v1, :cond_3

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-object v1, v3

    :cond_2
    const-string v3, "\u06e6\u06e4\u06df"

    invoke-static {v3}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v11

    move-object v3, v1

    move/from16 v18, v11

    goto/16 :goto_0

    :cond_3
    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v11, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    xor-int/2addr v1, v11

    const v11, 0x1abb3f

    add-int/2addr v1, v11

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_8
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v5, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    xor-int/lit16 v5, v5, -0xdb6

    add-int/2addr v1, v5

    if-gtz v1, :cond_5

    const/16 v1, 0x5a

    sput v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    move-object v1, v4

    move-object v5, v6

    :cond_4
    const-string v4, "\u06e0\u06e1\u06e7"

    invoke-static {v4}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v11

    move-object v4, v1

    move/from16 v18, v11

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e3\u06e8\u06e5"

    move-object v5, v6

    move v11, v14

    :goto_3
    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    move v14, v11

    goto/16 :goto_0

    :cond_6
    :sswitch_9
    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v11, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    rem-int/2addr v1, v11

    const v11, 0x1ac2f7

    add-int/2addr v1, v11

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_a
    :try_start_2
    move-object/from16 v0, p0

    iget-object v1, v0, Ly9;->c:Lg00;

    const/4 v11, -0x1

    iput v11, v1, Lg00;->a:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v11, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/lit16 v11, v11, 0x8af

    div-int/2addr v1, v11

    if-eqz v1, :cond_7

    const-string v1, "\u06e8\u06e0\u06e8"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_7
    sget v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v11, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    div-int/2addr v1, v11

    const v11, 0x1ac927

    add-int/2addr v1, v11

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_8
    :sswitch_b
    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v11, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    div-int/lit16 v11, v11, -0x2059

    xor-int/2addr v1, v11

    if-ltz v1, :cond_9

    const/16 v1, 0x54

    sput v1, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v1, "\u06e5\u06e8\u06e6"

    :goto_4
    invoke-static {v1}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_9
    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v11, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    xor-int/2addr v1, v11

    const v11, 0x1ac70e

    add-int/2addr v1, v11

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_c
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v11, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    or-int/2addr v1, v11

    const v11, 0x1ac09b

    add-int/2addr v1, v11

    move/from16 v18, v1

    move v12, v14

    goto/16 :goto_0

    :sswitch_d
    const-string v1, ""

    sget v11, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v13, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/lit16 v13, v13, 0x23d3

    mul-int/2addr v11, v13

    if-ltz v11, :cond_a

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v11, "\u06e8\u06e0\u06e4"

    invoke-static {v11}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v11

    move-object/from16 v17, v1

    move/from16 v18, v11

    goto/16 :goto_0

    :cond_a
    sget v11, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v13, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/2addr v11, v13

    const v13, 0x1abb06

    add-int/2addr v11, v13

    move-object/from16 v17, v1

    move/from16 v18, v11

    goto/16 :goto_0

    :sswitch_e
    :try_start_3
    move-object/from16 v0, p0

    iget-object v1, v0, Ly9;->a:Lg00;

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    iput v11, v1, Lg00;->a:I

    move-object/from16 v0, p0

    iget-object v8, v0, Ly9;->b:Ljava/util/ArrayList;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    const-string v1, "\u06e5\u06e7\u06e6"

    :goto_5
    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_f
    if-ge v12, v7, :cond_14

    :try_start_4
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-result-object v2

    sget v1, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v11, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/lit16 v11, v11, 0x1226

    mul-int/2addr v1, v11

    if-ltz v1, :cond_b

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v1, "\u06e5\u06e7\u06e6"

    goto :goto_5

    :cond_b
    const-string v1, "\u06e8\u06e0\u06e8"

    invoke-static {v1}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v11, "compile(...)"

    invoke-static {v11, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v11

    if-ltz v11, :cond_c

    const-string v11, "\u06e4\u06e8\u06e7"

    invoke-static {v11}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v11

    move-object v15, v1

    move/from16 v18, v11

    goto/16 :goto_0

    :cond_c
    sget v11, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v13, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    or-int/2addr v11, v13

    const v13, 0x1ac019

    add-int/2addr v11, v13

    move-object v15, v1

    move/from16 v18, v11

    goto/16 :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v1

    if-gtz v1, :cond_d

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v1, "\u06e6\u06e7\u06e3"

    :goto_6
    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_d
    const-string v1, "\u06e3\u06e2\u06e8"

    goto :goto_6

    :sswitch_11
    if-nez v6, :cond_10

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    if-gtz v1, :cond_f

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move v1, v9

    :cond_e
    const-string v9, "\u06e4\u06e7\u06e7"

    move-object v11, v9

    move v13, v1

    goto/16 :goto_2

    :cond_f
    sget v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v11, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/2addr v1, v11

    const v11, -0x1ac983

    xor-int/2addr v1, v11

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_10
    :sswitch_12
    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v11, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sub-int/2addr v1, v11

    const v11, 0x1ab474

    add-int/2addr v1, v11

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_13
    sget v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v11, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sub-int/2addr v1, v11

    const v11, 0x1ab271

    xor-int/2addr v1, v11

    move/from16 v18, v1

    goto/16 :goto_0

    :cond_11
    :sswitch_14
    const-string v1, "\u06e8\u06e0\u06e4"

    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_15
    :try_start_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-result v7

    const-string v1, "\u06e1\u06e5\u06e1"

    goto/16 :goto_4

    :sswitch_16
    const/4 v11, 0x0

    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v13, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    rem-int/lit16 v13, v13, -0x45f

    mul-int/2addr v1, v13

    if-gtz v1, :cond_12

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    const-string v1, "\u06e2\u06e1\u06e0"

    goto/16 :goto_3

    :cond_12
    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v13, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/2addr v1, v13

    const v13, -0x1aba8a

    xor-int/2addr v1, v13

    move/from16 v18, v1

    move v14, v11

    goto/16 :goto_0

    :sswitch_17
    if-eqz p1, :cond_11

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    sget v11, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v13, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    mul-int/lit16 v13, v13, 0x149b

    mul-int/2addr v11, v13

    if-ltz v11, :cond_13

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v11, "\u06e4\u06e7\u06e8"

    invoke-static {v11}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v11

    move-object/from16 v16, v1

    move/from16 v18, v11

    goto/16 :goto_0

    :cond_13
    sget v11, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v13, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    or-int/2addr v11, v13

    const v13, 0xdc0d

    add-int/2addr v11, v13

    move-object/from16 v16, v1

    move/from16 v18, v11

    goto/16 :goto_0

    :sswitch_18
    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v11, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/2addr v1, v11

    const v11, -0xdd19

    xor-int/2addr v1, v11

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_19
    const-string v1, "pattern"

    invoke-static {v1, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v11, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    add-int/lit16 v11, v11, -0x19a4

    sub-int/2addr v4, v11

    if-gtz v4, :cond_4

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    const-string v4, "\u06e6\u06e4\u06e5"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v11

    move-object v4, v1

    move/from16 v18, v11

    goto/16 :goto_0

    :sswitch_1a
    invoke-virtual {v15, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "e94axQfq7kZjnGyTd6iXFgE=\n"

    const-string v3, "Jf1B9SrTr2s=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v3, :cond_2

    const/16 v3, 0x20

    sput v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v3, "\u06e8\u06e3"

    invoke-static {v3}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v11

    move-object v3, v1

    move/from16 v18, v11

    goto/16 :goto_0

    :cond_14
    :sswitch_1b
    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v1

    if-ltz v1, :cond_15

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v1, "\u06e6\u06e2"

    goto/16 :goto_1

    :cond_15
    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v11, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/2addr v1, v11

    const v11, 0x1aac43

    add-int/2addr v1, v11

    move/from16 v18, v1

    goto/16 :goto_0

    :sswitch_1c
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc80 -> :sswitch_0
        0xdcfb -> :sswitch_17
        0x1aa723 -> :sswitch_14
        0x1aa7d8 -> :sswitch_12
        0x1aab06 -> :sswitch_7
        0x1aab7a -> :sswitch_13
        0x1aaf3d -> :sswitch_16
        0x1aaf3f -> :sswitch_a
        0x1ab242 -> :sswitch_10
        0x1ab281 -> :sswitch_18
        0x1ab33e -> :sswitch_2
        0x1ab625 -> :sswitch_4
        0x1ab669 -> :sswitch_b
        0x1ab6c2 -> :sswitch_4
        0x1ab720 -> :sswitch_11
        0x1ab9ea -> :sswitch_9
        0x1abaa5 -> :sswitch_3
        0x1abac4 -> :sswitch_5
        0x1abac5 -> :sswitch_1
        0x1abae3 -> :sswitch_c
        0x1abd8a -> :sswitch_f
        0x1abe08 -> :sswitch_1a
        0x1abe84 -> :sswitch_15
        0x1ac1e1 -> :sswitch_19
        0x1ac1e7 -> :sswitch_8
        0x1ac242 -> :sswitch_1b
        0x1ac25f -> :sswitch_e
        0x1ac50f -> :sswitch_b
        0x1ac8ec -> :sswitch_d
        0x1ac8f0 -> :sswitch_6
        0x1ac927 -> :sswitch_1c
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e2\u06e8"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "gbIGEhTlb"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢۨۦ;->ۥۦۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    mul-int/2addr v1, v2

    const v2, 0x183859

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-result v1

    if-gtz v1, :cond_0

    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/2addr v1, v2

    const v2, 0x1ab9c8

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/2addr v1, v2

    const v2, 0x1aabcd

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    :sswitch_4
    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v1

    if-ltz v1, :cond_1

    const-string v1, "\u06e0\u06e8\u06e2"

    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    rem-int/2addr v1, v2

    const v2, 0x1aac7c

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    sget v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    add-int/2addr v1, v2

    const v2, 0x1aab7f

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaac1 -> :sswitch_0
        0x1aab26 -> :sswitch_2
        0x1ab24a -> :sswitch_5
        0x1ab681 -> :sswitch_3
        0x1ab9c8 -> :sswitch_1
        0x1ac14d -> :sswitch_4
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    const-string v0, "\u06e5\u06e3"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v0, :cond_0

    const-string v0, "\u06e4\u06e7\u06e4"

    :goto_1
    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e5\u06e3"

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9e -> :sswitch_0
        0x1aa7c2 -> :sswitch_1
    .end sparse-switch
.end method

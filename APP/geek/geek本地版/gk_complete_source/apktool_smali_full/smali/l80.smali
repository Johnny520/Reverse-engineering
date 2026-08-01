.class public final Ll80;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:Li00;

.field public final c:I


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Li00;I)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v2, 0x0

    const-string v0, "\u06e2\u06df\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "luOJzSkUvVM3Jd3"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۣۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-string v0, "\u06df\u06e4\u06e4"

    :goto_1
    invoke-static {v0}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    iput p3, p0, Ll80;->c:I

    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/2addr v0, v1

    const v1, -0x1aaa78

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(D)V

    const-string v0, "\u06e8\u06e1\u06e1"

    :goto_2
    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    iput-object p1, p0, Ll80;->a:Landroid/widget/TextView;

    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    mul-int/lit16 v1, v1, -0x315

    mul-int/2addr v0, v1

    if-gtz v0, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v0, "\u06e2\u06df\u06e2"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/2addr v0, v1

    const v1, 0x1abffd

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    iput-object p2, p0, Ll80;->b:Li00;

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v0, :cond_1

    const/4 v0, 0x6

    sput v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    :cond_1
    const-string v0, "\u06e8\u06e8\u06e4"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e3\u06e0"

    goto :goto_2

    :cond_2
    const-string v0, "\u06e2\u06df\u06e2"

    goto :goto_2

    :sswitch_6
    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v0

    if-ltz v0, :cond_3

    const-string v0, "\u06df\u06e0\u06e6"

    goto :goto_1

    :cond_3
    :sswitch_7
    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v0

    if-gtz v0, :cond_4

    const/16 v0, 0x4a

    sput v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v0, "\u06e8\u06e7\u06e1"

    goto :goto_1

    :cond_4
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int/2addr v0, v1

    const v1, 0x1ac908

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa725 -> :sswitch_0
        0x1aa79f -> :sswitch_2
        0x1aabda -> :sswitch_6
        0x1ab245 -> :sswitch_3
        0x1ab33a -> :sswitch_5
        0x1aba05 -> :sswitch_4
        0x1abd86 -> :sswitch_7
        0x1ac908 -> :sswitch_8
        0x1ac9e4 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 22

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/16 v18, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    const/16 v21, 0x0

    const-string v11, "\u06e0\u06e7\u06e1"

    invoke-static {v11}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v20

    move-object v11, v5

    move-object v12, v9

    move-object v13, v10

    :goto_0
    sparse-switch v20, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v5, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    if-gtz v5, :cond_29

    const/16 v5, 0x3a

    sput v5, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    const-string v5, "\u06e6\u06e7\u06e3"

    invoke-static {v5}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto :goto_0

    :sswitch_1
    sget v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v7, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    mul-int/2addr v5, v7

    const v7, -0x1ab058

    xor-int/2addr v5, v7

    move-object/from16 v7, v18

    move/from16 v20, v5

    goto :goto_0

    :sswitch_2
    invoke-static {v14}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "top_title_text_"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v10, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v11, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    or-int/lit16 v11, v11, 0x1204

    mul-int/2addr v10, v11

    if-ltz v10, :cond_0

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v10, "\u06df\u06e6\u06df"

    invoke-static {v10}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v10

    move-object v11, v5

    move-object v13, v9

    move/from16 v20, v10

    goto :goto_0

    :cond_0
    sget v10, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v11, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sub-int/2addr v10, v11

    const v11, 0x1ac049

    add-int/2addr v10, v11

    move-object v11, v5

    move-object v13, v9

    move/from16 v20, v10

    goto :goto_0

    :sswitch_3
    invoke-virtual {v8, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    const-string v9, ""

    invoke-virtual {v5, v9}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "replaceAll(...)"

    invoke-static {v9, v5}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget v9, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v10, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    div-int/lit16 v10, v10, 0xb50

    xor-int/2addr v9, v10

    if-gtz v9, :cond_1

    const-string v9, "\u06e5\u06e1\u06e4"

    invoke-static {v9}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v9

    move-object v14, v5

    move/from16 v20, v9

    goto :goto_0

    :cond_1
    sget v9, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v10, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sub-int/2addr v9, v10

    const v10, 0xd8ec

    xor-int/2addr v9, v10

    move-object v14, v5

    move/from16 v20, v9

    goto/16 :goto_0

    :sswitch_4
    const-string v5, "\u06e7\u06e2\u06e7"

    :goto_1
    invoke-static {v5}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_2
    :sswitch_5
    sget v5, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v9, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/lit16 v9, v9, -0xbbb

    or-int/2addr v5, v9

    if-ltz v5, :cond_3

    const/16 v5, 0x4a

    sput v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v5, "\u06e3\u06e1"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_3
    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v9, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    rem-int/2addr v5, v9

    const v9, -0x1ab67e

    xor-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_6
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v0, v17

    move/from16 v1, v19

    invoke-virtual {v0, v1, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v9, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    rem-int/lit16 v9, v9, -0x1541

    xor-int/2addr v5, v9

    if-gtz v5, :cond_4

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v5, "\u06df\u06e2\u06e8"

    invoke-static {v5}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06e0\u06df\u06e6"

    invoke-static {v5}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_7
    if-eqz v2, :cond_19

    sget v5, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v9, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/lit16 v9, v9, -0x148a

    sub-int/2addr v5, v9

    if-gtz v5, :cond_5

    const/16 v5, 0x60

    sput v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v5, "\u06e4\u06e4\u06e1"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_5
    sget v5, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v9, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sub-int/2addr v5, v9

    const v9, 0x1aaf0f

    add-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_8
    if-eqz v2, :cond_18

    sget v5, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v9, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/lit16 v9, v9, 0x589

    div-int/2addr v5, v9

    if-eqz v5, :cond_6

    const-string v5, "\u06e8\u06e0\u06e4"

    invoke-static {v5}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u06e8\u06e3\u06e0"

    move-object v5, v8

    move-object v10, v6

    :goto_2
    invoke-static {v9}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v9

    move-object v8, v5

    move-object v6, v10

    move/from16 v20, v9

    goto/16 :goto_0

    :cond_7
    :sswitch_9
    sget v5, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v9, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    or-int/lit16 v9, v9, -0x222b

    sub-int/2addr v5, v9

    if-gtz v5, :cond_8

    const/16 v5, 0x1c

    sput v5, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v5, "\u06e1\u06e5\u06e5"

    invoke-static {v5}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_8
    sget v5, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v9, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    or-int/2addr v5, v9

    const v9, 0x1ab396

    add-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v0, v17

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v5

    if-gtz v5, :cond_9

    const-string v5, "\u06e2\u06e8\u06e8"

    invoke-static {v5}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e7\u06e6\u06e1"

    :goto_3
    invoke-static {v5}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v0, p0

    iget-object v5, v0, Ll80;->b:Li00;

    iput-object v7, v5, Li00;->b:Ljava/lang/Object;

    const-string v5, "xbUXImuIHgXdtgsPQIkPBMG2MRJx\n"

    const-string v9, "rtBufR/6f2s=\n"

    sget-object v10, Lgn;->a:Lgn;

    invoke-static {v5, v9, v10}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v5

    if-nez v5, :cond_7

    sget v5, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v9, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    mul-int/2addr v5, v9

    const v9, 0x11db6d

    add-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_c
    const-string v5, "f6YcbqMxV6U=\n"

    const-string v9, "I45ACohtfoE=\n"

    invoke-static {v5, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "pattern"

    invoke-static {v9, v5}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v9, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v9, :cond_a

    const/16 v9, 0xb

    sput v9, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v9, "\u06e8\u06e0"

    invoke-static {v9}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v9

    move-object v12, v5

    move/from16 v20, v9

    goto/16 :goto_0

    :cond_a
    sget v9, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v10, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    div-int/2addr v9, v10

    const v10, 0x1aabe6

    add-int/2addr v9, v10

    move-object v12, v5

    move/from16 v20, v9

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v5, "\u06e3\u06e7\u06e2"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_b
    :sswitch_e
    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v5

    if-ltz v5, :cond_c

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v5, "\u06e7\u06e6"

    invoke-static {v5}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_c
    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v9, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    mul-int/2addr v5, v9

    const v9, 0x1a8c97

    xor-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_f
    invoke-static {v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    const-string v8, "compile(...)"

    invoke-static {v8, v5}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v9, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    div-int/lit16 v9, v9, 0x1fde

    or-int/2addr v8, v9

    if-ltz v8, :cond_d

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v8, "\u06e5\u06e0\u06e4"

    invoke-static {v8}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v9

    move-object v8, v5

    move/from16 v20, v9

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06e4\u06e6\u06e1"

    move-object v9, v8

    move-object v10, v6

    goto/16 :goto_2

    :sswitch_10
    move-object/from16 v0, v17

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v9

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget v10, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v15, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sub-int/2addr v10, v15

    const v15, 0x1ab950

    add-int/2addr v10, v15

    move-object v15, v5

    move-object/from16 v16, v9

    move/from16 v20, v10

    goto/16 :goto_0

    :sswitch_11
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "top_title_color_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v5

    if-gtz v5, :cond_e

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    const-string v5, "\u06e5\u06e2\u06e3"

    :goto_4
    invoke-static {v5}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_e
    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v9, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/2addr v5, v9

    const v9, 0x1aa911

    add-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v5

    if-gtz v5, :cond_f

    const/16 v5, 0x10

    sput v5, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v5, "\u06df\u06e2\u06df"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v5

    move-object v7, v6

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_f
    move-object v5, v6

    :goto_5
    const-string v7, "\u06e6\u06e1\u06e1"

    invoke-static {v7}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v9

    move-object v7, v5

    move/from16 v20, v9

    goto/16 :goto_0

    :cond_10
    :sswitch_13
    const-string v5, "\u06df\u06e7\u06e7"

    :goto_6
    invoke-static {v5}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v5

    if-gtz v5, :cond_12

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    :cond_11
    const-string v5, "\u06df\u06e4\u06e8"

    invoke-static {v5}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_12
    sget v5, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v9, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    or-int/2addr v5, v9

    const v9, 0x1abc76

    add-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_15
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_b

    sget v5, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v9, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/lit16 v9, v9, 0x5d9

    xor-int/2addr v5, v9

    if-ltz v5, :cond_13

    const-string v5, "\u06e3\u06e7\u06e2"

    invoke-static {v5}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_13
    sget v5, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v9, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    or-int/2addr v5, v9

    const v9, 0xde0b

    add-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_16
    sget v5, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    if-gtz v5, :cond_14

    const-string v5, "\u06e5\u06e0\u06e0"

    invoke-static {v5}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    move/from16 v21, v2

    goto/16 :goto_0

    :cond_14
    sget v5, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v9, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    rem-int/2addr v5, v9

    const v9, 0x1ac1cf

    add-int/2addr v5, v9

    move/from16 v20, v5

    move/from16 v21, v2

    goto/16 :goto_0

    :sswitch_17
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v2, v5}, Lgn;->b(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v9, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/2addr v5, v9

    const v9, -0x1aa64b

    xor-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_18
    sget v5, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    if-ltz v5, :cond_15

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v5, "\u06e8\u06e5\u06e5"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_15
    const-string v5, "\u06e6\u06e3\u06e5"

    invoke-static {v5}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_19
    if-nez v6, :cond_1d

    sget v5, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v9, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    div-int/lit16 v9, v9, -0xa96

    add-int/2addr v5, v9

    if-ltz v5, :cond_16

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v5, "\u06e1\u06e0\u06e3"

    invoke-static {v5}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_16
    const-string v5, "\u06e3\u06e3"

    goto/16 :goto_1

    :sswitch_1a
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, ""

    invoke-static {v3, v5}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget v5, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v9, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/lit16 v9, v9, -0xf46

    div-int/2addr v5, v9

    if-eqz v5, :cond_17

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-object v5, v7

    goto/16 :goto_5

    :cond_17
    const-string v5, "\u06e2\u06e2"

    goto/16 :goto_4

    :cond_18
    :sswitch_1b
    const-string v5, "\u06e1\u06e8"

    invoke-static {v5}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_19
    :sswitch_1c
    sget v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v9, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/lit16 v9, v9, 0x722

    or-int/2addr v5, v9

    if-gtz v5, :cond_1a

    const-string v5, "\u06df\u06e6\u06e7"

    goto/16 :goto_1

    :cond_1a
    sget v5, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v9, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sub-int/2addr v5, v9

    const v9, 0x1aa9fe

    add-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_1d
    const-string v5, ""

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v9

    if-gtz v9, :cond_1b

    const-string v9, "\u06e0\u06e3\u06e6"

    invoke-static {v9}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v18, v5

    move/from16 v20, v9

    goto/16 :goto_0

    :cond_1b
    const-string v9, "\u06df\u06e7\u06e6"

    invoke-static {v9}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v18, v5

    move/from16 v20, v9

    goto/16 :goto_0

    :sswitch_1e
    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v5, :cond_1c

    const/16 v5, 0x52

    sput v5, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v5, "\u06e4\u06e6\u06e1"

    invoke-static {v5}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_1c
    const-string v5, "\u06e4\u06e0\u06df"

    :goto_7
    invoke-static {v5}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_1f
    move-object/from16 v0, p0

    iget v9, v0, Ll80;->c:I

    sget v5, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v10, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    rem-int/2addr v5, v10

    const v10, 0x1ac985

    add-int/2addr v5, v10

    move/from16 v20, v5

    move/from16 v21, v9

    goto/16 :goto_0

    :cond_1d
    :sswitch_20
    const-string v5, "\u06e2\u06e8\u06e8"

    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_21
    move-object/from16 v0, v16

    invoke-static {v0, v15}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    sget v5, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v9, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    rem-int/lit16 v9, v9, 0xe81

    or-int/2addr v5, v9

    if-ltz v5, :cond_11

    const/16 v5, 0x19

    sput v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    const-string v5, "\u06e3\u06e3"

    invoke-static {v5}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_22
    move-object/from16 v0, v17

    move/from16 v1, v19

    invoke-virtual {v0, v1, v15}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1f

    sget v5, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v9, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/lit16 v9, v9, 0x124b

    div-int/2addr v5, v9

    if-eqz v5, :cond_1e

    const-string v5, "\u06e6\u06e7\u06e2"

    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_1e
    const-string v5, "\u06df\u06e2\u06e8"

    :goto_8
    invoke-static {v5}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_1f
    :sswitch_23
    sget v5, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v9, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/lit16 v9, v9, -0x2db

    rem-int/2addr v5, v9

    if-ltz v5, :cond_20

    const/16 v5, 0x4a

    sput v5, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v9, "\u06e8\u06df\u06e6"

    move-object v5, v8

    move-object v10, v6

    goto/16 :goto_2

    :cond_20
    const-string v5, "\u06e3\u06e7\u06e2"

    invoke-static {v5}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_24
    move-object/from16 v0, p0

    iget-object v5, v0, Ll80;->a:Landroid/widget/TextView;

    const v9, 0x7e1201c9

    sget v10, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    xor-int/2addr v9, v10

    sget v10, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v10, :cond_21

    const/4 v10, 0x6

    sput v10, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v10, "\u06df\u06e7\u06e7"

    invoke-static {v10}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v17, v5

    move/from16 v19, v9

    move/from16 v20, v10

    goto/16 :goto_0

    :cond_21
    const-string v10, "\u06e3\u06e8"

    invoke-static {v10}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v17, v5

    move/from16 v19, v9

    move/from16 v20, v10

    goto/16 :goto_0

    :sswitch_25
    sget v5, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v9, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    mul-int/lit16 v9, v9, 0x660

    xor-int/2addr v5, v9

    if-gtz v5, :cond_22

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v5, "\u06e2\u06e8\u06e1"

    goto/16 :goto_3

    :cond_22
    const-string v5, "\u06e2\u06e1\u06df"

    invoke-static {v5}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_26
    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v5, :cond_23

    const/16 v5, 0x26

    sput v5, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    const-string v5, "\u06e3\u06e6\u06e5"

    invoke-static {v5}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_23
    const-string v5, "\u06e4\u06e5\u06df"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_27
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v5

    if-gtz v5, :cond_24

    const/16 v5, 0x1b

    sput v5, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    const-string v5, "\u06e1\u06e5\u06e0"

    goto/16 :goto_7

    :cond_24
    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v9, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    div-int/2addr v5, v9

    const v9, 0x1ac925

    add-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_28
    sget v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v9, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/lit16 v9, v9, 0x1e9c

    mul-int/2addr v5, v9

    if-ltz v5, :cond_25

    const-string v5, "\u06e0\u06df\u06df"

    goto/16 :goto_8

    :cond_25
    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v9, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    xor-int/2addr v5, v9

    const v9, 0x1ac308

    add-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_29
    if-eqz p1, :cond_28

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v5

    if-gtz v5, :cond_26

    const/16 v5, 0x37

    sput v5, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v5, "\u06e7\u06e2\u06e7"

    invoke-static {v5}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v5

    move-object v6, v10

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_26
    const-string v6, "\u06e6\u06e7\u06e2"

    move-object v5, v8

    move-object v9, v6

    goto/16 :goto_2

    :sswitch_2a
    sget v5, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v9, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    or-int/lit16 v9, v9, 0x130a

    rem-int/2addr v5, v9

    if-ltz v5, :cond_27

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v5, "\u06e4\u06e3\u06e6"

    goto/16 :goto_6

    :cond_27
    sget v5, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v9, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sub-int/2addr v5, v9

    const v9, -0x1aa8cd

    xor-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :cond_28
    :sswitch_2b
    const-string v5, "\u06e3\u06e3"

    goto/16 :goto_6

    :cond_29
    sget v5, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v9, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    mul-int/2addr v5, v9

    const v9, -0x1fb27a

    xor-int/2addr v5, v9

    move/from16 v20, v5

    goto/16 :goto_0

    :sswitch_2c
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc02 -> :sswitch_0
        0xdc07 -> :sswitch_1c
        0xdc27 -> :sswitch_1f
        0xdc40 -> :sswitch_11
        0xdc42 -> :sswitch_2
        0xdc60 -> :sswitch_1d
        0xdc65 -> :sswitch_10
        0xdcf8 -> :sswitch_25
        0x1aa75c -> :sswitch_b
        0x1aa765 -> :sswitch_d
        0x1aa7a0 -> :sswitch_2a
        0x1aa7a3 -> :sswitch_18
        0x1aa7d8 -> :sswitch_4
        0x1aa7f9 -> :sswitch_2b
        0x1aa7fe -> :sswitch_1
        0x1aa7ff -> :sswitch_29
        0x1aa81c -> :sswitch_5
        0x1aaac7 -> :sswitch_2c
        0x1aab43 -> :sswitch_17
        0x1aabba -> :sswitch_24
        0x1aabdf -> :sswitch_f
        0x1aaea4 -> :sswitch_28
        0x1aaf3c -> :sswitch_1c
        0x1ab280 -> :sswitch_22
        0x1ab2c5 -> :sswitch_c
        0x1ab362 -> :sswitch_15
        0x1ab606 -> :sswitch_21
        0x1ab641 -> :sswitch_7
        0x1ab6fe -> :sswitch_8
        0x1ab9e3 -> :sswitch_1c
        0x1aba61 -> :sswitch_28
        0x1aba7e -> :sswitch_6
        0x1aba9f -> :sswitch_3
        0x1abaa0 -> :sswitch_1e
        0x1abda5 -> :sswitch_26
        0x1abda9 -> :sswitch_13
        0x1abdc8 -> :sswitch_e
        0x1abde6 -> :sswitch_1b
        0x1ac14a -> :sswitch_1a
        0x1ac186 -> :sswitch_19
        0x1ac1c8 -> :sswitch_1c
        0x1ac241 -> :sswitch_12
        0x1ac242 -> :sswitch_a
        0x1ac56c -> :sswitch_25
        0x1ac5e2 -> :sswitch_27
        0x1ac8ec -> :sswitch_20
        0x1ac925 -> :sswitch_26
        0x1ac945 -> :sswitch_16
        0x1ac964 -> :sswitch_23
        0x1ac988 -> :sswitch_14
        0x1ac9a1 -> :sswitch_9
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    const-string v0, "\u06e2\u06e2\u06e3"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    if-gtz v0, :cond_0

    const-string v0, "\u06e1\u06e0\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e2\u06e3"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab2a3 -> :sswitch_0
        0x1ac146 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e4\u06e7"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v0

    if-ltz v0, :cond_2

    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v0, "\u06e7\u06e2\u06e4"

    :goto_1
    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "5W8cL"

    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۣۤۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-result v1

    if-ltz v1, :cond_0

    :cond_0
    const-string v1, "\u06e0\u06e0\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    or-int/2addr v0, v2

    const v2, 0x1aa7a4

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06e2\u06e4"

    goto :goto_1

    :cond_2
    :sswitch_3
    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v0, "\u06e6\u06e7\u06e3"

    :goto_2
    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/2addr v0, v2

    const v2, 0x1ac13a

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit16 v2, v2, -0x19df

    or-int/2addr v0, v2

    if-ltz v0, :cond_4

    const/16 v0, 0x35

    sput v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    const-string v0, "\u06df\u06e4\u06e7"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e6\u06e7\u06df"

    goto :goto_2

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7a2 -> :sswitch_0
        0x1aaae6 -> :sswitch_4
        0x1ab340 -> :sswitch_3
        0x1ab688 -> :sswitch_2
        0x1ac23e -> :sswitch_5
        0x1ac569 -> :sswitch_1
    .end sparse-switch
.end method

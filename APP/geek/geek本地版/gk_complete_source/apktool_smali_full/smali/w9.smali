.class public final synthetic Lw9;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Lg00;

.field public final b:I

.field public final c:Ljava/util/ArrayList;

.field public final d:Landroid/widget/FrameLayout;

.field public final e:Landroid/graphics/drawable/GradientDrawable;

.field public final f:Lg00;

.field public final g:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Lg00;ILjava/util/ArrayList;Landroid/widget/FrameLayout;Landroid/graphics/drawable/GradientDrawable;Lg00;Landroid/widget/EditText;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e7\u06e6"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    iput-object p5, p0, Lw9;->e:Landroid/graphics/drawable/GradientDrawable;

    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    or-int/lit16 v2, v2, -0xb14

    rem-int/2addr v1, v2

    if-gtz v1, :cond_0

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v1, "\u06e4\u06df\u06e7"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    div-int/2addr v1, v2

    const v2, -0x1ab30d

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    const-string v0, "bnFL"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۡۢۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    :goto_1
    const-string v1, "\u06e1\u06e6\u06e7"

    invoke-static {v1}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    rem-int/lit16 v2, v2, -0x7b2

    add-int/2addr v1, v2

    if-ltz v1, :cond_1

    const/16 v1, 0x13

    sput v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v1, "\u06e2\u06e4\u06e3"

    invoke-static {v1}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    div-int/2addr v1, v2

    const v2, 0xdc00

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_2
    :sswitch_4
    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v1, :cond_3

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v1, "\u06df\u06df\u06e4"

    :goto_2
    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e0\u06e0"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    iput-object p7, p0, Lw9;->g:Landroid/widget/EditText;

    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v2, v2, -0xe9b

    xor-int/2addr v1, v2

    if-gtz v1, :cond_4

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v1, "\u06e5\u06e7\u06e6"

    :goto_3
    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    sget v1, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sub-int/2addr v1, v2

    const v2, -0x1ab6f0

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_6
    iput-object p1, p0, Lw9;->a:Lg00;

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    or-int/lit16 v2, v2, 0x19ad

    sub-int/2addr v1, v2

    if-gtz v1, :cond_5

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v1, "\u06e1\u06e5\u06e0"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e6\u06e5\u06e8"

    goto :goto_3

    :sswitch_7
    iput p2, p0, Lw9;->b:I

    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v1, :cond_6

    const/4 v1, 0x1

    sput v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    :cond_6
    const-string v1, "\u06e5\u06e6\u06e4"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    iput-object p6, p0, Lw9;->f:Lg00;

    sget v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    if-ltz v1, :cond_7

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    goto/16 :goto_1

    :cond_7
    const-string v1, "\u06e4\u06df\u06e7"

    goto :goto_2

    :sswitch_9
    iput-object p3, p0, Lw9;->c:Ljava/util/ArrayList;

    sget v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    mul-int/lit16 v2, v2, -0x15f0

    sub-int/2addr v1, v2

    if-gtz v1, :cond_9

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    :cond_8
    const-string v1, "\u06e7\u06e0\u06df"

    invoke-static {v1}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_9
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    add-int/2addr v1, v2

    const v2, 0x1abfdc

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v1

    if-gtz v1, :cond_2

    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v1, :cond_8

    const-string v1, "\u06e1\u06e7\u06e2"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_b
    sget v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v1, :cond_a

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v1, "\u06df\u06e3"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_a
    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/2addr v1, v2

    const v2, -0x1abfeb

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_c
    iput-object p4, p0, Lw9;->d:Landroid/widget/FrameLayout;

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v1

    if-ltz v1, :cond_b

    const/16 v1, 0x4e

    sput v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v1, "\u06e6\u06e2\u06e2"

    invoke-static {v1}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06e1\u06e5\u06e0"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc00 -> :sswitch_0
        0x1aaf3c -> :sswitch_1
        0x1aaf62 -> :sswitch_3
        0x1aaf7c -> :sswitch_b
        0x1ab2e1 -> :sswitch_a
        0x1ab304 -> :sswitch_8
        0x1ab9cc -> :sswitch_5
        0x1abd85 -> :sswitch_c
        0x1abe63 -> :sswitch_9
        0x1abe84 -> :sswitch_6
        0x1ac1a6 -> :sswitch_4
        0x1ac209 -> :sswitch_7
        0x1ac526 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 17

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const-string v10, "\u06e1\u06e1\u06df"

    invoke-static {v10}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v16

    move-object v10, v1

    move-object v11, v6

    :goto_0
    sparse-switch v16, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v6, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    add-int/lit16 v6, v6, 0x257d

    div-int/2addr v1, v6

    if-eqz v1, :cond_9

    const-string v1, "\u06e8\u06e2"

    invoke-static {v1}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto :goto_0

    :sswitch_1
    sget v6, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    move-object/from16 v0, p0

    iget-object v1, v0, Lw9;->g:Landroid/widget/EditText;

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v12

    if-gtz v12, :cond_1

    const/16 v12, 0x17

    sput v12, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v12, "\u06e3\u06e8\u06e1"

    invoke-static {v12}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v16

    move-object v12, v1

    move v14, v6

    goto :goto_0

    :cond_1
    sget v12, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v14, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int/2addr v12, v14

    const v14, 0x1ab782

    xor-int v16, v12, v14

    move-object v12, v1

    move v14, v6

    goto :goto_0

    :sswitch_2
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    sget v1, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    xor-int/lit16 v1, v1, -0x2b6

    add-int/2addr v1, v8

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    move-result v5

    if-ltz v5, :cond_11

    const-string v5, "\u06e3\u06e4"

    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v6

    move v5, v1

    move/from16 v16, v6

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v1, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v6, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    mul-int/lit16 v6, v6, -0xda3

    or-int/2addr v1, v6

    if-ltz v1, :cond_3

    const-string v1, "\u06e8\u06df\u06e4"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e2\u06df\u06e5"

    goto :goto_1

    :sswitch_4
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v9, 0x0

    sget v6, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v15, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/lit16 v15, v15, -0x1efe

    add-int/2addr v6, v15

    if-ltz v6, :cond_4

    const/16 v6, 0x1e

    sput v6, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v6, "\u06e0\u06df\u06e3"

    invoke-static {v6}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v6

    move v15, v1

    move/from16 v16, v6

    goto/16 :goto_0

    :cond_4
    sget v6, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v15, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/2addr v6, v15

    const v15, -0x1bbce4

    xor-int/2addr v6, v15

    move v15, v1

    move/from16 v16, v6

    goto/16 :goto_0

    :sswitch_5
    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v6, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    rem-int/2addr v1, v6

    const v6, 0x1abd5a

    add-int/2addr v1, v6

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_6
    sget-object v1, Lgn;->a:Lgn;

    invoke-static/range {p1 .. p1}, Lip;->l(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v6

    if-ltz v6, :cond_5

    const-string v6, "\u06e7\u06e1\u06e4"

    invoke-static {v6}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v6

    move-object v11, v1

    move/from16 v16, v6

    goto/16 :goto_0

    :cond_5
    sget v6, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v11, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    mul-int/2addr v6, v11

    const v11, 0x21edb2

    add-int/2addr v6, v11

    move-object v11, v1

    move/from16 v16, v6

    goto/16 :goto_0

    :cond_6
    :sswitch_7
    sget v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v1, :cond_7

    const-string v1, "\u06e7\u06e3"

    invoke-static {v1}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_7
    sget v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    or-int/2addr v1, v6

    const v6, 0x1ac424

    add-int/2addr v1, v6

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_8
    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v6, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    rem-int/2addr v1, v6

    const v6, 0x1aae42

    add-int/2addr v1, v6

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_9
    move-object v1, v4

    :cond_8
    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v6, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    div-int/2addr v4, v6

    const v6, -0x1aaac5

    xor-int/2addr v6, v4

    move-object v4, v1

    move/from16 v16, v6

    goto/16 :goto_0

    :sswitch_a
    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v6, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sub-int/2addr v1, v6

    const v6, 0x1ac236

    add-int/2addr v1, v6

    move-object v13, v7

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_9
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v6, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    or-int/2addr v1, v6

    const v6, 0x1ab813

    xor-int/2addr v1, v6

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v1, :cond_a

    const/16 v1, 0xe

    sput v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v1, "\u06e7\u06e5\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_a
    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v6, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    mul-int/2addr v1, v6

    const v6, -0x10c5c9

    xor-int/2addr v1, v6

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_c
    instance-of v1, v2, Landroid/text/TextWatcher;

    if-eqz v1, :cond_6

    move-object v1, v2

    check-cast v1, Landroid/text/TextWatcher;

    sget v6, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v7, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    or-int/lit16 v7, v7, -0xa45

    add-int/2addr v6, v7

    if-ltz v6, :cond_b

    const-string v6, "\u06e3\u06e8\u06e2"

    move-object v7, v1

    :goto_2
    invoke-static {v6}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06e1\u06e6\u06e7"

    invoke-static {v6}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v6

    move-object v7, v1

    move/from16 v16, v6

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v6, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    add-int/lit16 v6, v6, 0xac

    xor-int/2addr v1, v6

    if-gtz v1, :cond_c

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v1, "\u06e8\u06e1\u06e5"

    invoke-static {v1}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_c
    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    or-int/2addr v1, v6

    const v6, -0x1ab3eb

    xor-int/2addr v1, v6

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v0, p0

    iget-object v1, v0, Lw9;->a:Lg00;

    move-object/from16 v0, p0

    iget v6, v0, Lw9;->b:I

    iput v6, v1, Lg00;->a:I

    move-object/from16 v0, p0

    iget-object v1, v0, Lw9;->c:Ljava/util/ArrayList;

    sget v6, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v6, :cond_d

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v6, "\u06e7\u06e3\u06e3"

    invoke-static {v6}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v6

    move-object v10, v1

    move/from16 v16, v6

    goto/16 :goto_0

    :cond_d
    sget v6, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v10, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    rem-int/2addr v6, v10

    const v10, 0x1aae25

    add-int/2addr v6, v10

    move-object v10, v1

    move/from16 v16, v6

    goto/16 :goto_0

    :sswitch_f
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v1}, Lgn;->i(Landroid/view/View;I)V

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v6, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    div-int/lit16 v6, v6, -0x214b

    xor-int/2addr v1, v6

    if-gtz v1, :cond_e

    const/16 v1, 0x20

    sput v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    :cond_e
    const-string v1, "\u06e5\u06e7\u06e1"

    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_10
    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v6, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/lit16 v6, v6, 0x1dd5

    mul-int/2addr v1, v6

    if-gtz v1, :cond_f

    const/16 v1, 0x2a

    sput v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    const-string v1, "\u06e7\u06e2\u06e1"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_f
    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    mul-int/2addr v1, v6

    const v6, -0x1897e8

    xor-int/2addr v1, v6

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_11
    const v1, 0x7e1200c5

    xor-int/2addr v1, v14

    invoke-virtual {v12, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    sget v1, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v1, :cond_10

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v1, "\u06e0\u06e7\u06e0"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    move-object v13, v4

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_10
    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    div-int/2addr v1, v6

    const v6, 0x1abe20

    xor-int/2addr v1, v6

    move-object v13, v4

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_12
    move-object v1, v3

    check-cast v1, Landroid/view/View;

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-string v1, "\u06e8\u06e1\u06e5"

    move-object v6, v1

    move v8, v5

    :goto_3
    invoke-static {v6}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v0, p0

    iget-object v1, v0, Lw9;->d:Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iget-object v6, v0, Lw9;->e:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object/from16 v0, p0

    iget-object v1, v0, Lw9;->f:Lg00;

    const/4 v6, -0x1

    iput v6, v1, Lg00;->a:I

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v6, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    add-int/lit16 v6, v6, 0x20d5

    or-int/2addr v1, v6

    if-ltz v1, :cond_12

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move v1, v5

    :cond_11
    const-string v5, "\u06e3\u06e8\u06e3"

    invoke-static {v5}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v6

    move v5, v1

    move/from16 v16, v6

    goto/16 :goto_0

    :cond_12
    const-string v1, "\u06e3\u06e3\u06e5"

    move-object v6, v1

    goto/16 :goto_2

    :sswitch_14
    const-string v1, ""

    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v13, :cond_2

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v1

    if-ltz v1, :cond_13

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    const-string v1, "\u06e4\u06e0\u06e8"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_13
    move v1, v8

    :goto_4
    const-string v6, "\u06df\u06e7\u06e1"

    move v8, v1

    goto :goto_3

    :sswitch_15
    if-eqz v13, :cond_0

    sget v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v6, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    mul-int/lit16 v6, v6, -0x8a6

    mul-int/2addr v1, v6

    if-ltz v1, :cond_14

    const-string v1, "\u06df\u06df\u06e3"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    goto/16 :goto_0

    :cond_14
    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v6, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    or-int/2addr v1, v6

    const v6, 0x1abf71

    add-int/2addr v1, v6

    move/from16 v16, v1

    goto/16 :goto_0

    :sswitch_16
    const/4 v1, 0x0

    if-ge v8, v15, :cond_8

    sget v4, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v6, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    div-int/2addr v4, v6

    const v6, 0x1abd8b

    add-int/2addr v6, v4

    move-object v4, v1

    move/from16 v16, v6

    goto/16 :goto_0

    :sswitch_17
    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v1

    if-ltz v1, :cond_15

    move v1, v9

    goto :goto_4

    :cond_15
    const-string v1, "\u06e3\u06e8\u06e2"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v16, v1

    move v8, v9

    goto/16 :goto_0

    :sswitch_18
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc61 -> :sswitch_0
        0x1aa703 -> :sswitch_9
        0x1aa708 -> :sswitch_10
        0x1aa7f9 -> :sswitch_d
        0x1aaac4 -> :sswitch_13
        0x1aab3f -> :sswitch_17
        0x1aabb9 -> :sswitch_4
        0x1aaebf -> :sswitch_6
        0x1aaf62 -> :sswitch_a
        0x1ab248 -> :sswitch_18
        0x1ab305 -> :sswitch_f
        0x1ab685 -> :sswitch_1
        0x1ab6fe -> :sswitch_11
        0x1ab71c -> :sswitch_3
        0x1ab71d -> :sswitch_16
        0x1ab71e -> :sswitch_12
        0x1ab9ec -> :sswitch_14
        0x1abd8a -> :sswitch_2
        0x1abdc4 -> :sswitch_10
        0x1abe20 -> :sswitch_c
        0x1abe60 -> :sswitch_b
        0x1abe7f -> :sswitch_e
        0x1ac54a -> :sswitch_8
        0x1ac587 -> :sswitch_15
        0x1ac5c8 -> :sswitch_7
        0x1ac90c -> :sswitch_5
    .end sparse-switch
.end method

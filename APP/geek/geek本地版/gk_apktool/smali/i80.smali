.class public final synthetic Li80;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Lg00;

.field public final c:I

.field public final d:Ljava/util/ArrayList;

.field public final e:Landroid/graphics/drawable/GradientDrawable;

.field public final f:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;Lg00;ILjava/util/ArrayList;Landroid/graphics/drawable/GradientDrawable;Landroid/widget/EditText;)V
    .locals 4

    const/4 v3, 0x3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e6\u06e7\u06e1"

    invoke-static {v0}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "0PtB2TGOqYCayGQp9J"

    invoke-static {v0}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۦ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    if-gtz v0, :cond_2

    sput v3, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v0, "\u06e4\u06e0\u06e7"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    add-int/lit16 v2, v2, 0xd1b

    add-int/2addr v0, v2

    if-gtz v0, :cond_0

    const-string v0, "\u06e5\u06e7"

    :goto_1
    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    mul-int/2addr v0, v2

    const v2, 0x19cdd8

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_2
    iput p3, p0, Li80;->c:I

    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/lit16 v2, v2, 0x1aed

    rem-int/2addr v0, v2

    if-ltz v0, :cond_1

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v0, "\u06df\u06e7\u06e1"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/2addr v0, v2

    const v2, 0x1ab5ab

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_2
    const-string v0, "\u06e4\u06e2\u06e8"

    :goto_2
    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    iput-object p6, p0, Li80;->f:Landroid/widget/EditText;

    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v0, :cond_3

    sput v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    const-string v0, "\u06e8\u06df\u06e5"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e8\u06df\u06e5"

    :goto_3
    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_4
    :sswitch_4
    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    div-int/2addr v0, v2

    const v2, -0x1abafa

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    iput-object p5, p0, Li80;->e:Landroid/graphics/drawable/GradientDrawable;

    const-string v0, "\u06e5\u06e5\u06e5"

    goto :goto_3

    :sswitch_6
    iput-object p4, p0, Li80;->d:Ljava/util/ArrayList;

    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v0, :cond_6

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v0, "\u06e4\u06e7\u06e8"

    goto :goto_2

    :sswitch_7
    iput-object p1, p0, Li80;->a:Landroid/widget/FrameLayout;

    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    if-gtz v0, :cond_5

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    const-string v0, "\u06e2\u06e4\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e5\u06e2\u06e6"

    goto :goto_1

    :sswitch_8
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    or-int/lit16 v2, v2, -0x2e2

    div-int/2addr v0, v2

    if-eqz v0, :cond_7

    const/16 v0, 0x61

    sput v0, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    :cond_6
    const-string v0, "\u06e7\u06e8\u06e1"

    goto :goto_3

    :cond_7
    const-string v0, "\u06e4\u06e7\u06e8"

    goto/16 :goto_1

    :sswitch_9
    iput-object p2, p0, Li80;->b:Lg00;

    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    if-ltz v0, :cond_8

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v0, "\u06e4\u06e2\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/2addr v0, v2

    const v2, 0x1aa7f9

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-result v0

    if-ltz v0, :cond_4

    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    if-ltz v0, :cond_9

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v0, "\u06e5\u06e5\u06e5"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_9
    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    div-int/2addr v0, v2

    const v2, 0xdcb7

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_b
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc44 -> :sswitch_0
        0x1aa7f9 -> :sswitch_2
        0x1ab2dd -> :sswitch_4
        0x1ab6c4 -> :sswitch_6
        0x1ab9eb -> :sswitch_1
        0x1aba2a -> :sswitch_8
        0x1abac5 -> :sswitch_b
        0x1abde9 -> :sswitch_9
        0x1abe45 -> :sswitch_3
        0x1ac240 -> :sswitch_7
        0x1ac620 -> :sswitch_5
        0x1ac8ce -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-string v0, "\u06df\u06e4\u06e3"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v0

    move-object v8, v9

    move-object v10, v9

    move-object v1, v9

    move-object v6, v9

    move-object v11, v9

    move v12, v3

    move v7, v3

    move v5, v3

    move v13, v0

    move v2, v3

    :goto_0
    sparse-switch v13, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Li80;->d:Ljava/util/ArrayList;

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v6, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    or-int/lit16 v6, v6, -0x13eb

    div-int/2addr v4, v6

    if-eqz v4, :cond_c

    move v4, v7

    :goto_1
    const-string v6, "\u06e3\u06e7\u06e3"

    invoke-static {v6}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v13

    move-object v6, v0

    move v7, v4

    goto :goto_0

    :sswitch_1
    const v0, 0xffff68

    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/2addr v0, v4

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setTextColor(I)V

    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    mul-int/2addr v0, v4

    const v4, 0x607fe

    add-int/2addr v0, v4

    move v13, v0

    goto :goto_0

    :sswitch_2
    invoke-virtual {v10, v7}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move v0, v2

    :goto_2
    const-string v2, "\u06e3\u06e4\u06e7"

    move-object v4, v2

    :goto_3
    invoke-static {v4}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v4

    move v13, v4

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/2addr v0, v4

    const v4, 0x1ab08d

    add-int/2addr v0, v4

    move v13, v0

    goto :goto_0

    :sswitch_3
    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/lit16 v0, v0, 0x2fd

    add-int/2addr v0, v2

    const-string v4, "\u06e6\u06e4\u06e1"

    :goto_4
    invoke-static {v4}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v4

    move v5, v0

    move v13, v4

    goto :goto_0

    :sswitch_4
    iget v4, p0, Li80;->c:I

    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/lit16 v7, v7, -0x1ace

    xor-int/2addr v0, v7

    if-ltz v0, :cond_1

    const/16 v0, 0x3b

    sput v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    const-string v0, "\u06e2\u06e8\u06e8"

    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v7, v4

    move v13, v0

    goto :goto_0

    :cond_1
    move-object v0, v6

    goto :goto_1

    :sswitch_5
    move v0, v3

    goto :goto_2

    :sswitch_6
    const-string v0, "\u06e4\u06e7\u06e1"

    :goto_5
    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v13, v0

    goto :goto_0

    :sswitch_7
    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    if-gtz v0, :cond_2

    const-string v0, "\u06e5\u06e7\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v13, v0

    goto/16 :goto_0

    :cond_2
    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    or-int/2addr v0, v4

    const v4, -0x1aa697

    xor-int/2addr v0, v4

    move v13, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v12, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    div-int/lit16 v12, v12, -0x9b9

    add-int/2addr v4, v12

    if-ltz v4, :cond_3

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    const-string v4, "\u06e6\u06e6"

    invoke-static {v4}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v4

    move v12, v0

    move v13, v4

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e6\u06e7\u06e3"

    invoke-static {v4}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v4

    move v12, v0

    move v13, v4

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Li80;->a:Landroid/widget/FrameLayout;

    const-string v4, "\u06e6\u06e6"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v11, v0

    move v13, v4

    goto/16 :goto_0

    :cond_4
    :sswitch_a
    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/lit16 v4, v4, -0x1596

    rem-int/2addr v0, v4

    if-gtz v0, :cond_5

    const/16 v0, 0xd

    sput v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v0, "\u06e1\u06e4\u06e2"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v13, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e4\u06e8\u06df"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v13, v0

    goto/16 :goto_0

    :sswitch_b
    if-eqz v7, :cond_4

    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/2addr v0, v4

    const v4, -0x1abc10

    xor-int/2addr v0, v4

    move v13, v0

    goto/16 :goto_0

    :sswitch_c
    iget-object v0, p0, Li80;->e:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v11, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v4, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    rem-int/lit16 v4, v4, -0x951

    mul-int/2addr v0, v4

    if-ltz v0, :cond_6

    const/16 v0, 0x38

    sput v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    const-string v0, "\u06e1\u06df\u06e8"

    :goto_6
    invoke-static {v0}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v13, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e0\u06e7\u06e2"

    goto :goto_6

    :sswitch_d
    iget-object v0, p0, Li80;->f:Landroid/widget/EditText;

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v4, :cond_7

    const-string v4, "\u06e6\u06e0\u06e7"

    invoke-static {v4}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object v10, v0

    move v13, v4

    goto/16 :goto_0

    :cond_7
    sget v4, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v10, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    add-int/2addr v4, v10

    const v10, 0x1ab7a1

    xor-int/2addr v4, v10

    move-object v10, v0

    move v13, v4

    goto/16 :goto_0

    :sswitch_e
    sget-object v0, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "\u06e3\u06df"

    move v0, v5

    goto/16 :goto_4

    :sswitch_f
    move-object v0, v1

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/lit16 v4, v4, -0xec9

    sub-int/2addr v0, v4

    if-ltz v0, :cond_8

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v0, "\u06e6\u06e2\u06e2"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v13, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    mul-int/2addr v0, v4

    const v4, 0x182a67

    xor-int/2addr v0, v4

    move v13, v0

    goto/16 :goto_0

    :sswitch_10
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    mul-int/2addr v0, v4

    const v4, -0x1843b5

    xor-int/2addr v0, v4

    move v13, v0

    goto/16 :goto_0

    :sswitch_11
    iput v7, v8, Lg00;->a:I

    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    div-int/2addr v0, v4

    const v4, 0xdbe1

    add-int/2addr v0, v4

    move v13, v0

    goto/16 :goto_0

    :sswitch_12
    sget v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    or-int/lit16 v4, v4, 0x1dcf

    or-int/2addr v0, v4

    if-ltz v0, :cond_9

    const-string v4, "\u06e8\u06e0\u06e3"

    move v0, v5

    goto/16 :goto_4

    :cond_9
    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    rem-int/2addr v0, v4

    const v4, 0x1ab6b0

    add-int/2addr v0, v4

    move v13, v0

    goto/16 :goto_0

    :sswitch_13
    if-ge v2, v12, :cond_d

    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sub-int/2addr v0, v4

    const v4, 0x1ac5e7

    add-int/2addr v0, v4

    move v13, v0

    goto/16 :goto_0

    :sswitch_14
    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    if-gtz v0, :cond_a

    const/16 v0, 0x27

    sput v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v0, "\u06e3\u06e1\u06e3"

    move v2, v5

    goto/16 :goto_5

    :cond_a
    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    div-int/2addr v0, v2

    const v2, 0x1abec7

    add-int/2addr v0, v2

    move v13, v0

    move v2, v5

    goto/16 :goto_0

    :sswitch_15
    const/4 v0, 0x1

    invoke-static {v11, v0}, Lgn;->i(Landroid/view/View;I)V

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v0

    if-gtz v0, :cond_b

    const/16 v0, 0x16

    sput v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v0, "\u06e0\u06e6\u06e7"

    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v13, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    rem-int/2addr v0, v4

    const v4, -0x1ab26b

    xor-int/2addr v0, v4

    move v13, v0

    goto/16 :goto_0

    :cond_c
    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v6, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/2addr v4, v6

    const v6, -0x196f78

    xor-int/2addr v4, v6

    move-object v6, v0

    move v13, v4

    goto/16 :goto_0

    :sswitch_16
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v4, "\u06e6\u06e2\u06e2"

    move v0, v2

    goto/16 :goto_3

    :cond_d
    :sswitch_17
    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    or-int/lit16 v4, v4, -0x317

    or-int/2addr v0, v4

    if-ltz v0, :cond_e

    const/16 v0, 0x5f

    sput v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v0, "\u06e3\u06e5\u06e7"

    :goto_7
    invoke-static {v0}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v13, v0

    goto/16 :goto_0

    :cond_e
    const-string v0, "\u06e2\u06e8\u06e8"

    goto :goto_7

    :sswitch_18
    iget-object v0, p0, Li80;->b:Lg00;

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v8, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/lit16 v8, v8, 0x2685

    mul-int/2addr v4, v8

    if-gtz v4, :cond_f

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    const-string v4, "\u06e5\u06e6\u06e4"

    invoke-static {v4}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v8, v0

    move v13, v4

    goto/16 :goto_0

    :cond_f
    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v8, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    mul-int/2addr v4, v8

    const v8, -0x1b2e80

    xor-int/2addr v4, v8

    move-object v8, v0

    move v13, v4

    goto/16 :goto_0

    :sswitch_19
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdc5c -> :sswitch_9
        0xdc60 -> :sswitch_19
        0xdcc0 -> :sswitch_15
        0x1aa705 -> :sswitch_8
        0x1aa79e -> :sswitch_e
        0x1aab07 -> :sswitch_4
        0x1aab22 -> :sswitch_7
        0x1aaba1 -> :sswitch_12
        0x1aabbb -> :sswitch_d
        0x1aae8a -> :sswitch_17
        0x1ab2dd -> :sswitch_a
        0x1ab2de -> :sswitch_b
        0x1ab35b -> :sswitch_18
        0x1ab362 -> :sswitch_c
        0x1ab645 -> :sswitch_12
        0x1ab669 -> :sswitch_14
        0x1ab6a6 -> :sswitch_13
        0x1ab6ff -> :sswitch_11
        0x1ababe -> :sswitch_5
        0x1abadb -> :sswitch_1
        0x1abe63 -> :sswitch_2
        0x1abea3 -> :sswitch_10
        0x1ac16d -> :sswitch_19
        0x1ac1a6 -> :sswitch_3
        0x1ac1ab -> :sswitch_16
        0x1ac1e3 -> :sswitch_f
        0x1ac242 -> :sswitch_6
    .end sparse-switch
.end method

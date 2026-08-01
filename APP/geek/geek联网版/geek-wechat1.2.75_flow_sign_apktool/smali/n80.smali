.class public final synthetic Ln80;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Ln00;

.field public final c:I

.field public final d:Ljava/util/ArrayList;

.field public final e:Landroid/graphics/drawable/GradientDrawable;

.field public final f:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;Ln00;ILjava/util/ArrayList;Landroid/graphics/drawable/GradientDrawable;Landroid/widget/EditText;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e5\u06e0"

    invoke-static {v1}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    add-int/lit16 v2, v2, -0x20cf

    div-int/2addr v1, v2

    if-eqz v1, :cond_4

    const/16 v1, 0x2d

    sput v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v1, "\u06e2\u06e0\u06e7"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    const-string v0, "z8F"

    invoke-static {v0}, Lۤۨۤۨ;->۟ۧۡۦ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "\u06e7\u06df\u06e4"

    :goto_1
    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    :sswitch_2
    sget v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/lit16 v2, v2, -0x8c2

    xor-int/2addr v1, v2

    if-gtz v1, :cond_1

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v1, "\u06e1\u06e8\u06e7"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/2addr v1, v2

    const v2, 0x1ac81c

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v1

    if-gtz v1, :cond_0

    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    xor-int/lit16 v2, v2, -0x8a4

    add-int/2addr v1, v2

    if-gtz v1, :cond_2

    const-string v1, "\u06e0\u06e4\u06e2"

    invoke-static {v1}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/2addr v1, v2

    const v2, 0x1ab785

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    iput-object p5, p0, Ln80;->e:Landroid/graphics/drawable/GradientDrawable;

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v1

    if-ltz v1, :cond_3

    const-string v1, "\u06e3\u06e3\u06e1"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e7\u06df\u06e3"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/2addr v1, v2

    const v2, 0x1ab9e4

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_5
    iput-object p1, p0, Ln80;->a:Landroid/widget/FrameLayout;

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v1

    if-ltz v1, :cond_6

    :cond_5
    const-string v1, "\u06e2\u06e1\u06e3"

    invoke-static {v1}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    mul-int/2addr v1, v2

    const v2, -0x1ac52e

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_6
    iput-object p6, p0, Ln80;->f:Landroid/widget/EditText;

    sget v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    mul-int/2addr v1, v2

    const v2, 0x23bb15

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_7
    iput-object p4, p0, Ln80;->d:Ljava/util/ArrayList;

    const-string v1, "\u06e8\u06e5\u06e7"

    :goto_2
    invoke-static {v1}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    iput p3, p0, Ln80;->c:I

    :goto_3
    const-string v1, "\u06e3\u06e3\u06e2"

    goto/16 :goto_1

    :sswitch_9
    iput-object p2, p0, Ln80;->b:Ln00;

    sget v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/lit16 v2, v2, 0x74c

    sub-int/2addr v1, v2

    if-ltz v1, :cond_5

    const/16 v1, 0x11

    sput v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    goto :goto_3

    :sswitch_a
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int/lit16 v2, v2, 0x1fa9

    div-int/2addr v1, v2

    if-eqz v1, :cond_7

    const/16 v1, 0x26

    sput v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    const-string v1, "\u06e4\u06e5\u06e0"

    goto :goto_2

    :cond_7
    const-string v1, "\u06e8\u06e4\u06df"

    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_b
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab5e -> :sswitch_0
        0x1ab284 -> :sswitch_8
        0x1ab681 -> :sswitch_2
        0x1ab682 -> :sswitch_7
        0x1ab6c2 -> :sswitch_1
        0x1ab9c5 -> :sswitch_9
        0x1aba7f -> :sswitch_5
        0x1ac50b -> :sswitch_6
        0x1ac50c -> :sswitch_a
        0x1ac5e2 -> :sswitch_3
        0x1ac963 -> :sswitch_b
        0x1ac98a -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    const/4 v13, 0x0

    const/4 v3, 0x0

    const-string v0, "\u06e6\u06e5\u06e6"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move-object v8, v13

    move-object v1, v13

    move-object v12, v13

    move-object v5, v13

    move-object v10, v13

    move v11, v3

    move v6, v3

    move v9, v3

    move v7, v0

    move v2, v3

    :goto_0
    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setTextColor(I)V

    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v0, :cond_f

    const/16 v0, 0x3b

    sput v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    move-object v0, v12

    :cond_0
    const-string v4, "\u06e3\u06e4\u06df"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v4

    move-object v12, v0

    move v7, v4

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Ln80;->d:Ljava/util/ArrayList;

    const-string v5, "\u06e2\u06e7\u06df"

    move v4, v6

    move-object v7, v5

    :goto_1
    invoke-static {v7}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v7

    move-object v5, v0

    move v6, v4

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x57

    sput v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    const-string v0, "\u06e2\u06e2\u06df"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/2addr v0, v4

    const v4, 0x1ac167

    xor-int/2addr v0, v4

    move v7, v0

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v0, :cond_3

    const/16 v0, 0x43

    sput v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v4, "\u06e3\u06df\u06e6"

    move v0, v2

    :goto_2
    invoke-static {v4}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v4

    move v7, v4

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/2addr v0, v4

    const v4, 0x223b4c

    add-int/2addr v0, v4

    move v7, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v0

    if-ltz v0, :cond_4

    const-string v0, "\u06e1\u06e7\u06e5"

    :goto_3
    invoke-static {v0}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06df\u06e6\u06df"

    invoke-static {v0}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto :goto_0

    :sswitch_5
    iget v4, p0, Ln80;->c:I

    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    if-gtz v0, :cond_5

    const-string v0, "\u06e6\u06e8\u06e2"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v11, v4

    move v7, v0

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u06e2\u06e0\u06e4"

    move-object v0, v10

    :goto_4
    invoke-static {v7}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v7

    move-object v10, v0

    move v11, v4

    goto/16 :goto_0

    :sswitch_6
    const/4 v0, 0x1

    invoke-static {v12, v0}, Lkn;->i(Landroid/view/View;I)V

    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v0, :cond_7

    :cond_6
    const-string v7, "\u06e1\u06e1\u06e6"

    move-object v0, v5

    move v4, v6

    goto/16 :goto_1

    :cond_7
    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    div-int/2addr v0, v4

    const v4, 0x1aabd9

    xor-int/2addr v0, v4

    move v7, v0

    goto/16 :goto_0

    :sswitch_7
    iget-object v0, p0, Ln80;->e:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v12, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    add-int/lit16 v4, v4, -0x1a8e

    mul-int/2addr v0, v4

    if-ltz v0, :cond_8

    const/16 v0, 0x26

    sput v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v7, "\u06df\u06e4\u06e7"

    move-object v0, v8

    move v4, v9

    :goto_5
    invoke-static {v7}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v7

    move-object v8, v0

    move v9, v4

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e8\u06e6\u06e1"

    :goto_6
    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :sswitch_8
    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    xor-int/lit16 v0, v0, -0x302

    add-int v4, v2, v0

    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v7, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    div-int/lit16 v7, v7, 0x266e

    sub-int/2addr v0, v7

    if-gtz v0, :cond_9

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    const-string v0, "\u06df\u06e3\u06e3"

    invoke-static {v0}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v4

    move v7, v0

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u06e4\u06e7\u06e7"

    move-object v0, v8

    goto :goto_5

    :sswitch_9
    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v0

    if-ltz v0, :cond_a

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v0, "\u06e5\u06e6\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    move v2, v3

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06df\u06e4\u06e7"

    move v0, v3

    move-object v4, v2

    goto/16 :goto_2

    :cond_b
    :sswitch_a
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    xor-int/2addr v0, v4

    const v4, 0x1aabcb

    xor-int/2addr v0, v4

    move v7, v0

    goto/16 :goto_0

    :sswitch_b
    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/lit16 v4, v4, 0xdea

    mul-int/2addr v0, v4

    if-eqz v0, :cond_c

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v0, "\u06e7\u06e4\u06e2"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06e7\u06e0\u06df"

    move-object v0, v8

    move v4, v9

    goto :goto_5

    :sswitch_c
    iget-object v0, p0, Ln80;->a:Landroid/widget/FrameLayout;

    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v7, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/lit16 v7, v7, 0x1db9

    sub-int/2addr v4, v7

    if-gtz v4, :cond_0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v4, "\u06e3\u06e8\u06e8"

    invoke-static {v4}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v12, v0

    move v7, v4

    goto/16 :goto_0

    :sswitch_d
    iget-object v0, p0, Ln80;->b:Ln00;

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v4

    if-ltz v4, :cond_d

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    :goto_7
    const-string v7, "\u06e4\u06e3\u06e4"

    move v4, v11

    goto/16 :goto_4

    :cond_d
    const-string v7, "\u06e2\u06e2\u06df"

    move v4, v11

    goto/16 :goto_4

    :sswitch_e
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    or-int/2addr v0, v2

    const v2, 0x1ab036

    add-int/2addr v0, v2

    move v7, v0

    move v2, v9

    goto/16 :goto_0

    :sswitch_f
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    or-int/lit16 v4, v4, -0x20d0

    or-int/2addr v0, v4

    if-ltz v0, :cond_e

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v0, "\u06e5\u06e8\u06e4"

    goto/16 :goto_6

    :cond_e
    const-string v0, "\u06df\u06e4\u06e7"

    :goto_8
    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :sswitch_10
    iget-object v0, p0, Ln80;->f:Landroid/widget/EditText;

    const-string v7, "\u06e5\u06e6\u06e0"

    move v4, v9

    goto/16 :goto_5

    :cond_f
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    rem-int/2addr v0, v4

    const v4, 0x1ac76d

    add-int/2addr v0, v4

    move v7, v0

    goto/16 :goto_0

    :sswitch_11
    const v0, 0xfffd7d

    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/2addr v0, v4

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextColor(I)V

    move-object v0, v10

    goto :goto_7

    :sswitch_12
    iput v11, v10, Ln00;->a:I

    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v0, :cond_10

    const-string v0, "\u06e4\u06e6\u06e3"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_10
    const-string v4, "\u06e8\u06df\u06e8"

    move v0, v2

    goto/16 :goto_2

    :sswitch_13
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    const-string v6, "\u06df\u06e3\u06e3"

    move-object v0, v5

    move-object v7, v6

    goto/16 :goto_1

    :sswitch_14
    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v0

    if-gtz v0, :cond_11

    const-string v0, "\u06e3\u06e5\u06e0"

    goto :goto_8

    :cond_11
    const-string v0, "\u06e6\u06e5\u06e6"

    goto :goto_8

    :sswitch_15
    if-eqz v11, :cond_b

    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    if-gtz v0, :cond_12

    sput v3, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    :cond_12
    const-string v0, "\u06df\u06e2\u06df"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :sswitch_16
    move-object v0, v1

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_13

    const-string v0, "\u06e2\u06e7\u06df"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_13
    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    add-int/2addr v0, v4

    const v4, 0x1ab889

    add-int/2addr v0, v4

    move v7, v0

    goto/16 :goto_0

    :sswitch_17
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v0

    if-ltz v0, :cond_6

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v0, "\u06e6\u06e5\u06e6"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :sswitch_18
    if-ge v2, v6, :cond_2

    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    mul-int/lit16 v4, v4, 0x1976

    xor-int/2addr v0, v4

    if-gtz v0, :cond_14

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    const-string v0, "\u06e7\u06e0\u06df"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_14
    const-string v0, "\u06e7\u06e3\u06e7"

    goto/16 :goto_3

    :sswitch_19
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa75c -> :sswitch_0
        0x1aa77f -> :sswitch_b
        0x1aa7a2 -> :sswitch_18
        0x1aa7d8 -> :sswitch_f
        0x1aaac8 -> :sswitch_11
        0x1aabd9 -> :sswitch_d
        0x1aaec6 -> :sswitch_8
        0x1aaf7f -> :sswitch_4
        0x1ab266 -> :sswitch_12
        0x1ab29f -> :sswitch_5
        0x1ab33a -> :sswitch_13
        0x1ab641 -> :sswitch_7
        0x1ab663 -> :sswitch_e
        0x1ab69e -> :sswitch_6
        0x1ab723 -> :sswitch_f
        0x1aba45 -> :sswitch_19
        0x1abaa1 -> :sswitch_3
        0x1abac4 -> :sswitch_16
        0x1abe5f -> :sswitch_15
        0x1ac207 -> :sswitch_2
        0x1ac243 -> :sswitch_14
        0x1ac260 -> :sswitch_c
        0x1ac526 -> :sswitch_9
        0x1ac58b -> :sswitch_17
        0x1ac5a5 -> :sswitch_19
        0x1ac8d1 -> :sswitch_1
        0x1ac92b -> :sswitch_a
        0x1ac9a3 -> :sswitch_10
    .end sparse-switch
.end method

.class public final synthetic Ljn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final a:Landroid/view/Window;

.field public final b:Z

.field public final c:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;ZI)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v2, 0x0

    const-string v0, "\u06e1\u06e3\u06e7"

    invoke-static {v0}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-boolean p2, p0, Ljn;->b:Z

    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v0, :cond_0

    const-string v0, "\u06e3\u06e1\u06e3"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "RvwclJt6OZtSTlzbcbK2ww"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۧۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-string v0, "\u06df\u06e5\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    div-int/2addr v0, v1

    const v1, 0x1aa7fa

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v0

    if-ltz v0, :cond_4

    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    add-int/lit16 v1, v1, 0xf3f

    add-int/2addr v0, v1

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v0, "\u06e1\u06e3\u06e7"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e3\u06e1\u06e3"

    invoke-static {v0}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    rem-int/lit16 v1, v1, 0x265f

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v0, "\u06e0\u06e8"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    mul-int/2addr v0, v1

    const v1, 0x1ee3fd

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    iput-object p1, p0, Ljn;->a:Landroid/view/Window;

    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    add-int/2addr v0, v1

    const v1, 0xde88

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(D)V

    sget v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v0, :cond_3

    const/16 v0, 0x32

    sput v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v0, "\u06e8\u06e0\u06e0"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e8\u06e0\u06e0"

    goto :goto_2

    :cond_4
    :sswitch_6
    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/lit16 v1, v1, 0x23e4

    xor-int/2addr v0, v1

    if-gtz v0, :cond_5

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v0, "\u06e6\u06df\u06e0"

    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/2addr v0, v1

    const v1, 0x1ac6b7

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_7
    iput p3, p0, Ljn;->c:I

    const-string v0, "\u06e5\u06e5\u06e7"

    goto :goto_1

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0x1aa7be -> :sswitch_5
        0x1aa7f9 -> :sswitch_7
        0x1aaf05 -> :sswitch_4
        0x1ab645 -> :sswitch_1
        0x1abe47 -> :sswitch_2
        0x1ac16a -> :sswitch_6
        0x1ac605 -> :sswitch_3
        0x1ac8e8 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 19

    const/4 v2, 0x0

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const-string v7, "\u06e4\u06e6\u06e4"

    invoke-static {v7}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v7

    move v15, v1

    move/from16 v16, v3

    move/from16 v17, v10

    :goto_0
    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    mul-int/lit16 v3, v3, -0x16b6

    sub-int/2addr v1, v3

    if-gtz v1, :cond_14

    const-string v1, "\u06df\u06e1\u06e5"

    :goto_1
    invoke-static {v1}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    mul-int/2addr v1, v3

    const v3, 0x16b8d6

    add-int/2addr v1, v3

    move v7, v1

    move v12, v15

    goto :goto_0

    :cond_0
    :sswitch_2
    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v1, :cond_1

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    const-string v1, "\u06e4\u06e0\u06e8"

    move v3, v4

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v1

    move v4, v3

    move v7, v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/2addr v1, v3

    const v3, 0xde37

    add-int/2addr v1, v3

    move v7, v1

    goto :goto_0

    :sswitch_3
    const-string v1, "\u06e6\u06e8\u06e7"

    :goto_3
    invoke-static {v1}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    goto :goto_0

    :sswitch_4
    sget v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v1, :cond_2

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v1, "\u06e4\u06e6\u06e4"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    move v12, v5

    goto :goto_0

    :cond_2
    const-string v1, "\u06e3\u06e7\u06e1"

    move v3, v5

    :goto_4
    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    move v12, v3

    goto :goto_0

    :sswitch_5
    move/from16 v0, v17

    int-to-float v1, v0

    mul-float v1, v1, v18

    float-to-int v3, v1

    const/4 v1, 0x1

    if-ge v3, v1, :cond_9

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v1

    if-ltz v1, :cond_3

    const-string v4, "\u06e3\u06e7\u06e1"

    move-object v1, v6

    move-object v7, v4

    move v10, v3

    :goto_5
    invoke-static {v7}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v3

    move-object v6, v1

    move v4, v10

    move v7, v3

    goto :goto_0

    :cond_3
    const-string v1, "\u06e1\u06e1\u06e1"

    goto :goto_2

    :sswitch_6
    move-object/from16 v0, p0

    iget-boolean v8, v0, Ljn;->b:Z

    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/lit16 v9, v1, -0x319

    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v1, :cond_4

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v1, "\u06e2\u06e2"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e4\u06e8\u06e8"

    move-object v1, v6

    move-object v7, v3

    move v10, v4

    goto :goto_5

    :sswitch_7
    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    div-int/lit16 v3, v3, 0x731

    mul-int/2addr v1, v3

    if-eqz v1, :cond_5

    const/16 v1, 0x1e

    sput v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v1, "\u06e1\u06e2\u06e4"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    move/from16 v17, v16

    goto/16 :goto_0

    :cond_5
    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    rem-int/2addr v1, v3

    const v3, 0xdcbf

    add-int/2addr v1, v3

    move v7, v1

    move/from16 v17, v16

    goto/16 :goto_0

    :sswitch_8
    if-lez v13, :cond_b

    invoke-virtual {v14, v9}, Landroid/view/Window;->addFlags(I)V

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v1

    if-gtz v1, :cond_6

    const/16 v1, 0x19

    sput v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v1, "\u06e2\u06e0"

    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e8\u06e2\u06e1"

    move-object v1, v6

    :goto_6
    invoke-static {v3}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v6, v1

    move v7, v3

    goto/16 :goto_0

    :sswitch_9
    if-eqz v8, :cond_b

    move-object/from16 v0, p0

    iget v3, v0, Ljn;->c:I

    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v7, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    add-int/lit16 v7, v7, -0x37f

    rem-int/2addr v1, v7

    if-gtz v1, :cond_7

    const-string v1, "\u06e7\u06e2\u06e4"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move v13, v3

    move v7, v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e1\u06e2\u06e4"

    :goto_7
    invoke-static {v1}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move v13, v3

    move v7, v1

    goto/16 :goto_0

    :sswitch_a
    sget v1, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    if-gtz v1, :cond_8

    const-string v1, "\u06e6\u06e7\u06df"

    goto/16 :goto_3

    :cond_8
    const-string v1, "\u06e3\u06e7\u06e1"

    goto/16 :goto_1

    :sswitch_b
    move v3, v4

    :cond_9
    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v1

    if-gtz v1, :cond_a

    const-string v1, "\u06e2\u06e2\u06e5"

    :goto_8
    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v1

    move v4, v3

    move v7, v1

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u06e1\u06e6\u06e7"

    goto :goto_8

    :cond_b
    :sswitch_c
    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    move-result v1

    if-ltz v1, :cond_c

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v1, "\u06e4\u06e4\u06e7"

    move v3, v12

    goto/16 :goto_4

    :cond_c
    const-string v1, "\u06e6\u06e1\u06e1"

    goto/16 :goto_1

    :sswitch_d
    const/4 v1, 0x1

    if-ge v11, v1, :cond_0

    const/4 v1, 0x1

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v3

    if-gtz v3, :cond_d

    const-string v3, "\u06e5\u06e7"

    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v16, v1

    move v7, v3

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e1\u06e6\u06df"

    invoke-static {v3}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v16, v1

    move v7, v3

    goto/16 :goto_0

    :sswitch_e
    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    add-int/lit16 v3, v3, 0x11eb

    add-int/2addr v1, v3

    if-gtz v1, :cond_e

    const-string v3, "\u06e8\u06e2\u06e1"

    move-object v1, v14

    move v5, v4

    :goto_9
    invoke-static {v3}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v14, v1

    move v7, v3

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u06e7\u06e2\u06e4"

    move v3, v4

    move v5, v4

    goto/16 :goto_2

    :sswitch_f
    invoke-virtual {v14}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    int-to-float v3, v13

    const/high16 v6, 0x42c80000    # 100.0f

    div-float/2addr v3, v6

    sget v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int/lit8 v6, v6, -0x27

    int-to-float v6, v6

    mul-float/2addr v3, v6

    float-to-int v6, v3

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v3

    if-gtz v3, :cond_f

    const-string v3, "\u06df\u06df\u06e1"

    move v11, v6

    goto/16 :goto_6

    :cond_f
    const-string v3, "\u06df\u06df\u06e1"

    move-object v7, v3

    move v10, v4

    move v11, v6

    goto/16 :goto_5

    :sswitch_10
    const-string v1, "Fpqa+Q==\n"

    const-string v2, "d/TzlBN8WQY=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v2

    sget v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    if-gtz v1, :cond_10

    const-string v1, "\u06df\u06e3\u06e1"

    move v3, v13

    goto/16 :goto_7

    :cond_10
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    rem-int/2addr v1, v3

    const v3, 0x1ab9a5

    add-int/2addr v1, v3

    move v7, v1

    goto/16 :goto_0

    :sswitch_11
    const/4 v1, 0x1

    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v7, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/2addr v3, v7

    const v7, 0x1ac5c8

    xor-int/2addr v3, v7

    move v15, v1

    move v7, v3

    move/from16 v17, v11

    goto/16 :goto_0

    :sswitch_12
    invoke-static {v6, v12}, Lp7;->n(Landroid/view/WindowManager$LayoutParams;I)V

    invoke-virtual {v14, v6}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    add-int/lit16 v3, v3, -0x1a11

    mul-int/2addr v1, v3

    if-ltz v1, :cond_11

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    const-string v1, "\u06e1\u06e1\u06e1"

    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    goto/16 :goto_0

    :cond_11
    const-string v1, "\u06e3\u06e2\u06e6"

    invoke-static {v1}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    goto/16 :goto_0

    :sswitch_13
    const-string v1, "SlQxeCaNjkhKTik0ZIvPRUVSKTRygc9IS09wenOCgwZQWC1xJoWAUkhIMzpAgoBHUA==\n"

    const-string v3, "JCFdFAbu7yY=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v1, v2

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v3

    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v7, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    rem-int/lit16 v7, v7, -0x27a

    mul-int/2addr v1, v7

    if-ltz v1, :cond_12

    const/16 v1, 0x14

    sput v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v1, "\u06e3\u06e2\u06e6"

    invoke-static {v1}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    move/from16 v18, v3

    goto/16 :goto_0

    :cond_12
    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v7, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    div-int/2addr v1, v7

    const v7, 0xdca2

    xor-int/2addr v1, v7

    move v7, v1

    move/from16 v18, v3

    goto/16 :goto_0

    :sswitch_14
    invoke-virtual {v14, v9}, Landroid/view/Window;->clearFlags(I)V

    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    rem-int/lit16 v3, v3, 0x7ce

    rem-int/2addr v1, v3

    if-ltz v1, :cond_13

    const-string v1, "\u06e1\u06e0\u06e1"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v1

    move v7, v1

    goto/16 :goto_0

    :cond_13
    const-string v1, "\u06e1\u06e0\u06e1"

    move v3, v12

    goto/16 :goto_4

    :cond_14
    const-string v1, "\u06e4\u06e6\u06e4"

    goto/16 :goto_1

    :sswitch_15
    move-object/from16 v0, p0

    iget-object v1, v0, Ljn;->a:Landroid/view/Window;

    const v3, 0x3ecccccd    # 0.4f

    mul-float v3, v3, v18

    invoke-virtual {v1, v3}, Landroid/view/Window;->setDimAmount(F)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v3

    if-gtz v3, :cond_15

    const-string v3, "\u06e6\u06e8\u06e7"

    invoke-static {v3}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v14, v1

    move v7, v3

    goto/16 :goto_0

    :cond_15
    const-string v3, "\u06e7\u06df\u06e8"

    goto/16 :goto_9

    :sswitch_16
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc3e -> :sswitch_0
        0xdc40 -> :sswitch_a
        0xdca2 -> :sswitch_15
        0xdcbb -> :sswitch_b
        0xdcd8 -> :sswitch_5
        0x1aa701 -> :sswitch_11
        0x1aa77d -> :sswitch_3
        0x1aabbf -> :sswitch_c
        0x1aaea2 -> :sswitch_16
        0x1aaec1 -> :sswitch_1
        0x1aaee3 -> :sswitch_8
        0x1aaf5a -> :sswitch_7
        0x1aaf62 -> :sswitch_e
        0x1ab667 -> :sswitch_16
        0x1ab6fd -> :sswitch_12
        0x1aba02 -> :sswitch_13
        0x1aba48 -> :sswitch_2
        0x1abaa2 -> :sswitch_10
        0x1abae4 -> :sswitch_9
        0x1ac186 -> :sswitch_14
        0x1ac265 -> :sswitch_a
        0x1ac510 -> :sswitch_6
        0x1ac569 -> :sswitch_4
        0x1ac5c8 -> :sswitch_d
        0x1ac927 -> :sswitch_f
    .end sparse-switch
.end method

.class public final synthetic Lrn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Le00;

.field public final c:F

.field public final d:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Le00;FI)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e4\u06e2"

    invoke-static {v1}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    iput-object p2, p0, Lrn;->b:Le00;

    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/2addr v1, v2

    const v2, 0x1aaea1

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v1

    if-ltz v1, :cond_0

    const-string v1, "\u06e8\u06e5\u06e6"

    :goto_1
    invoke-static {v1}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    or-int/2addr v1, v2

    const v2, 0x1ac6a7

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    iput p4, p0, Lrn;->d:I

    sget v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    or-int/lit16 v2, v2, 0x23e7

    or-int/2addr v1, v2

    if-gtz v1, :cond_1

    const-string v1, "\u06df\u06e7\u06e2"

    :goto_2
    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    div-int/2addr v1, v2

    const v2, 0x1ab2a9

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v1, :cond_2

    const/16 v1, 0x24

    sput v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v1, "\u06df\u06e5\u06e0"

    invoke-static {v1}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06df\u06e5\u06e0"

    goto :goto_1

    :sswitch_5
    const-string v0, "VRb"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۧۢ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "\u06e3\u06e4\u06e1"

    :goto_3
    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    :sswitch_6
    sget v1, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v1, :cond_4

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v1, "\u06e5\u06e3\u06e4"

    invoke-static {v1}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    const-string v1, "\u06df\u06e5\u06e0"

    goto :goto_1

    :sswitch_7
    iput-object p1, p0, Lrn;->a:Landroid/view/View;

    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    mul-int/lit16 v2, v2, 0x6a4

    add-int/2addr v1, v2

    if-gtz v1, :cond_6

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v1, "\u06e4\u06e0\u06e8"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    iput p3, p0, Lrn;->c:F

    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    mul-int/lit16 v2, v2, 0x18cb

    div-int/2addr v1, v2

    if-eqz v1, :cond_5

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v1, "\u06e2\u06e2\u06e8"

    invoke-static {v1}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06df\u06e7\u06e2"

    goto :goto_2

    :sswitch_9
    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v1

    if-gtz v1, :cond_3

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v1

    if-ltz v1, :cond_7

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    :cond_6
    const-string v1, "\u06e1\u06e1\u06e4"

    goto :goto_3

    :cond_7
    const-string v1, "\u06e4\u06e0\u06e8"

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0x1aa7ba -> :sswitch_0
        0x1aa7fa -> :sswitch_3
        0x1aaac3 -> :sswitch_6
        0x1aaec4 -> :sswitch_1
        0x1aaee1 -> :sswitch_8
        0x1ab2a8 -> :sswitch_9
        0x1ab6a0 -> :sswitch_4
        0x1ab9ec -> :sswitch_5
        0x1ac5a5 -> :sswitch_7
        0x1ac9e7 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 9

    const/high16 v8, 0x41700000    # 15.0f

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const-string v1, "\u06e5\u06e4\u06e0"

    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v5

    move-object v2, v0

    move-object v1, v0

    move-object v4, v0

    move-object v6, v0

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object v0, v1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/lit16 v5, v5, 0x140d

    sub-int/2addr v0, v5

    if-ltz v0, :cond_3

    const/16 v0, 0x49

    sput v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v0, "\u06e5\u06e8\u06e6"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "BVo=\n"

    const-string v5, "bC5yyrKkNVs=\n"

    invoke-static {v0, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v5, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    add-int/lit16 v5, v5, -0x15fb

    div-int/2addr v0, v5

    if-eqz v0, :cond_0

    const/16 v0, 0x14

    sput v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    :cond_0
    const-string v0, "\u06df\u06e1\u06e1"

    :goto_2
    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "b+zS/sGdADZv9sqyg5tBO2DqyrKVkUE2bveT/JSSDXh14M73wZUOLG3w0LyokBU=\n"

    const-string v5, "AZm+kuH+YVg=\n"

    invoke-static {v0, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    rem-int/lit16 v5, v5, -0x12a9

    rem-int/2addr v0, v5

    if-ltz v0, :cond_2

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    :cond_1
    const-string v0, "\u06e6\u06e2\u06e3"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06df"

    goto :goto_1

    :cond_3
    sget v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v5, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    mul-int/2addr v0, v5

    const v5, 0x74ff9

    add-int/2addr v0, v5

    move v5, v0

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lrn;->a:Landroid/view/View;

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v4

    if-gtz v4, :cond_4

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    const-string v4, "\u06e1\u06e6\u06e8"

    move-object v5, v4

    :goto_3
    invoke-static {v5}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v4, v0

    goto :goto_0

    :cond_4
    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v5, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    div-int/2addr v4, v5

    const v5, 0x1aa740

    add-int/2addr v5, v4

    move-object v4, v0

    goto/16 :goto_0

    :sswitch_4
    iget v0, p0, Lrn;->c:F

    sub-float/2addr v0, v8

    sub-float/2addr v0, v7

    add-float/2addr v0, v8

    invoke-virtual {v4, v0}, Landroid/view/View;->setTranslationX(F)V

    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v0, "\u06e0\u06e2\u06e0"

    invoke-static {v0}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :sswitch_5
    iput v3, v6, Landroid/widget/FrameLayout$LayoutParams;->width:I

    const-string v0, "\u06df\u06e6\u06e0"

    :goto_4
    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :sswitch_6
    add-int/lit8 v0, v3, -0x13

    iget v5, p0, Lrn;->d:I

    sub-int/2addr v0, v5

    add-int/lit8 v0, v0, 0x13

    int-to-float v7, v0

    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    rem-int/2addr v0, v5

    const v5, 0x1ab649

    add-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/2addr v0, v5

    const v5, 0xdbf9

    add-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "tyvuXV3LR/G3MfYRH80G/Lgt9hEJxwbxtjCvXwjESr+tJ/JUXclI+6sx61VT30/7vjv2HzvaR/K8\nEuNIEt1SsZU/+14I3Hb+qz/vQg==\n"

    const-string v5, "2V6CMX2oJp8=\n"

    invoke-static {v0, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "\u06e0\u06e2\u06e0"

    move-object v0, v4

    goto :goto_3

    :sswitch_9
    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    xor-int/lit16 v5, v5, 0x1b4d

    mul-int/2addr v0, v5

    if-ltz v0, :cond_5

    const/16 v0, 0x15

    sput v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v0, "\u06df\u06e1\u06e2"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e5\u06e8\u06e6"

    goto/16 :goto_2

    :sswitch_a
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    mul-int/lit16 v5, v5, -0x2497

    div-int/2addr v0, v5

    if-eqz v0, :cond_6

    const-string v0, "\u06e2\u06e5\u06df"

    :goto_5
    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e5\u06e4\u06e0"

    goto :goto_5

    :sswitch_b
    move-object v0, v2

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v5

    if-ltz v5, :cond_7

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v5, "\u06e8\u06e7"

    :goto_6
    invoke-static {v5}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v6, v0

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06df\u06e3\u06e8"

    goto :goto_6

    :sswitch_c
    iget-object v0, p0, Lrn;->b:Le00;

    iget-boolean v0, v0, Le00;->a:Z

    if-eqz v0, :cond_a

    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    if-ltz v0, :cond_8

    const/16 v0, 0x56

    sput v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v0, "\u06df\u06df"

    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e7\u06e2\u06e2"

    goto :goto_5

    :sswitch_d
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/lit16 v5, v5, -0xe7a

    xor-int/2addr v0, v5

    if-ltz v0, :cond_9

    const-string v0, "\u06e0\u06e8\u06e5"

    goto/16 :goto_4

    :cond_9
    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v5, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    xor-int/2addr v0, v5

    const v5, 0x1ac65a

    xor-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :cond_a
    :sswitch_e
    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v0

    if-gtz v0, :cond_b

    const-string v0, "\u06e5\u06df"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v5, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sub-int/2addr v0, v5

    const v5, 0x1ac1be

    add-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_f
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe0 -> :sswitch_0
        0xdcbf -> :sswitch_5
        0xdcff -> :sswitch_8
        0x1aa73f -> :sswitch_3
        0x1aa740 -> :sswitch_7
        0x1aa784 -> :sswitch_d
        0x1aa7d9 -> :sswitch_c
        0x1aab1e -> :sswitch_b
        0x1aabdd -> :sswitch_a
        0x1aaf63 -> :sswitch_e
        0x1ab682 -> :sswitch_4
        0x1abe21 -> :sswitch_1
        0x1abea3 -> :sswitch_f
        0x1ac1a7 -> :sswitch_9
        0x1ac567 -> :sswitch_6
        0x1ac627 -> :sswitch_2
    .end sparse-switch
.end method

.class public final Lrs;
.super Landroid/view/ViewOutlineProvider;


# instance fields
.field public final a:F


# direct methods
.method public constructor <init>(F)V
    .locals 4

    iput p1, p0, Lrs;->a:F

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    const-wide/16 v2, 0x0

    const-string v0, "\u06e7\u06e1\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :cond_0
    :sswitch_1
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v0, :cond_1

    const/16 v0, 0x5f

    sput v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v0, "\u06e3\u06e8\u06e1"

    :goto_1
    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e4\u06e6\u06e8"

    goto :goto_1

    :sswitch_2
    const-string v0, "dVsuwM"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۣ۟ۤ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    xor-int/lit16 v1, v1, -0xfb4

    div-int/2addr v0, v1

    if-eqz v0, :cond_2

    const/16 v0, 0x1a

    sput v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    const-string v0, "\u06e7\u06e1\u06e2"

    invoke-static {v0}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v1, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/2addr v0, v1

    const v1, 0x1ac926

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    or-int/2addr v0, v1

    const v1, 0x1ac309

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(D)V

    const-string v0, "\u06e4\u06e6\u06e8"

    invoke-static {v0}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/2addr v0, v1

    const v1, -0x1ac6b4

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1abaa6 -> :sswitch_0
        0x1ac548 -> :sswitch_5
        0x1ac54a -> :sswitch_3
        0x1ac54c -> :sswitch_2
        0x1ac908 -> :sswitch_1
        0x1ac926 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 11

    const/4 v1, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x0

    const-string v0, "\u06e3\u06e8\u06e1"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v7, v1

    move v10, v9

    move v8, v9

    move v5, v9

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "uMSC/KsmTza43pqw6SAOO7fCmrD/Kg42ud/D/v4pQniiyJ71qyRAPKTeh/SlMkc8sdSavs03TzWz\n/Y/p5DBadprQl//+MX45pNCD4w==\n"

    const-string v2, "1rHukItFLlg=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    const-string v0, "\u06e1\u06e7"

    :goto_1
    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    move-object v0, v6

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    const-string v0, "\u06df\u06e6\u06e8"

    :goto_2
    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v7, v2

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    sget v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    or-int/lit16 v2, v2, -0xfcf

    xor-int/2addr v0, v2

    if-ltz v0, :cond_1

    const-string v0, "\u06e7\u06e4\u06e0"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/2addr v0, v2

    const v2, 0xda9f

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    if-gtz v0, :cond_2

    const/16 v0, 0x4b

    sput v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v0, "\u06e2\u06e8\u06e3"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    or-int/2addr v0, v2

    const v2, 0x1aaa66

    add-int/2addr v0, v2

    goto :goto_0

    :cond_3
    :sswitch_4
    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v0

    if-ltz v0, :cond_4

    const-string v0, "\u06df\u06df\u06e0"

    move v2, v7

    goto :goto_2

    :cond_4
    const-string v0, "\u06df\u06e0\u06e8"

    :goto_3
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float v2, v0, v10

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v0

    if-gtz v0, :cond_5

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v0, "\u06e5\u06e1\u06e5"

    invoke-static {v0}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v8, v2

    goto :goto_0

    :cond_5
    const-string v0, "\u06e4\u06e3\u06e5"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v8, v2

    goto/16 :goto_0

    :sswitch_6
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    rem-int/2addr v0, v2

    const v2, 0x1aaa9b

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_7
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v0, :cond_6

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v0, "\u06e8\u06e8\u06e0"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e8\u06e6\u06e7"

    move v2, v8

    goto :goto_4

    :sswitch_8
    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v0

    if-ltz v0, :cond_7

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v0, "\u06e3\u06e7\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v5, v9

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e6\u06df\u06e5"

    move v5, v9

    goto :goto_3

    :sswitch_9
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/lit16 v2, v2, 0x1360

    mul-int/2addr v0, v2

    if-gez v0, :cond_0

    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1acaf3

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_a
    iget v2, p0, Lrs;->a:F

    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/lit16 v3, v3, 0x1dfa

    rem-int/2addr v0, v3

    if-ltz v0, :cond_8

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    const-string v0, "\u06df\u06e6\u06e8"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v10, v2

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e6\u06e8\u06df"

    :goto_5
    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v10, v2

    goto/16 :goto_0

    :sswitch_b
    const/high16 v0, 0x40c00000    # 6.0f

    mul-float/2addr v0, v10

    float-to-int v0, v0

    invoke-virtual {p2, v1, v0}, Landroid/graphics/Outline;->offset(II)V

    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/2addr v0, v2

    const v2, 0x1aa782

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_3

    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/lit16 v2, v2, -0x5e7

    or-int/2addr v0, v2

    if-ltz v0, :cond_9

    const-string v0, "\u06e6\u06e8\u06df"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_9
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1aba85

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_d
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/lit16 v2, v2, -0x1567

    or-int/2addr v0, v2

    if-ltz v0, :cond_a

    const-string v0, "\u06df\u06e7"

    move v2, v8

    goto/16 :goto_4

    :cond_a
    const-string v0, "\u06e3\u06e8\u06e1"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v0

    if-gtz v0, :cond_c

    move v5, v8

    :cond_b
    const-string v0, "\u06e0\u06e0\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_c
    sget v0, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    mul-int/2addr v0, v2

    const v2, 0x169105

    add-int/2addr v0, v2

    move v5, v8

    goto/16 :goto_0

    :cond_d
    :sswitch_f
    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/lit16 v2, v2, -0x1c74

    div-int/2addr v0, v2

    if-gtz v0, :cond_e

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v0, "\u06e7\u06e7\u06e7"

    goto/16 :goto_3

    :cond_e
    const-string v0, "\u06e4\u06e2\u06e4"

    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_10
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    sget v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    mul-int/lit16 v2, v2, 0xd0d

    add-int/2addr v0, v2

    if-ltz v0, :cond_f

    const/16 v0, 0xd

    sput v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v0, "\u06e3\u06e3\u06e6"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_f
    const-string v0, "\u06e5\u06e1\u06e5"

    move v2, v7

    goto/16 :goto_2

    :sswitch_11
    if-lez v7, :cond_d

    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    mul-int/lit16 v2, v2, 0x18cf

    rem-int/2addr v0, v2

    if-ltz v0, :cond_10

    const/16 v0, 0x42

    sput v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v0, "\u06e4\u06e5\u06e7"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_10
    const-string v0, "\u06e6\u06e7"

    goto/16 :goto_3

    :sswitch_12
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    if-ltz v0, :cond_11

    const/4 v0, 0x7

    sput v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v0, "\u06df\u06e6\u06e3"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_11
    const-string v0, "\u06e1\u06e7\u06e0"

    goto/16 :goto_1

    :sswitch_13
    const-string v0, "HUKugA==\n"

    const-string v2, "ayvL9/eKsiU=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    if-gtz v0, :cond_12

    const/16 v0, 0x17

    sput v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v0, "\u06e6\u06e7"

    move v2, v10

    goto/16 :goto_5

    :cond_12
    const-string v0, "\u06e2\u06df\u06e5"

    move v2, v8

    goto/16 :goto_4

    :sswitch_14
    const-string v0, "Q98pAUBAqQ==\n"

    const-string v2, "LKpdbSkuzKc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/lit16 v2, v2, 0x24b6

    xor-int/2addr v0, v2

    if-ltz v0, :cond_b

    const-string v0, "\u06df\u06e4"

    invoke-static {v0}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_15
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_0
        0xdc26 -> :sswitch_1
        0xdcc1 -> :sswitch_5
        0x1aa727 -> :sswitch_15
        0x1aa745 -> :sswitch_6
        0x1aa7dc -> :sswitch_7
        0x1aa7e1 -> :sswitch_a
        0x1aaae2 -> :sswitch_2
        0x1aabc1 -> :sswitch_4
        0x1aaf7a -> :sswitch_8
        0x1ab248 -> :sswitch_14
        0x1ab686 -> :sswitch_d
        0x1ab701 -> :sswitch_7
        0x1ab71c -> :sswitch_13
        0x1aba26 -> :sswitch_12
        0x1aba46 -> :sswitch_e
        0x1aba86 -> :sswitch_b
        0x1abdc9 -> :sswitch_c
        0x1abe0a -> :sswitch_3
        0x1ac14c -> :sswitch_9
        0x1ac25d -> :sswitch_11
        0x1ac5a3 -> :sswitch_f
        0x1ac9a9 -> :sswitch_10
        0x1ac9e1 -> :sswitch_3
    .end sparse-switch
.end method

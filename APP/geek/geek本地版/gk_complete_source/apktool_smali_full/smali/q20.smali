.class public final synthetic Lq20;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:Lh40;

.field public final b:Lh40;


# direct methods
.method public synthetic constructor <init>(Lh40;Lh40;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e4\u06e4"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "zyKoTlHNvRaW4qYpsZa"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->ۣۦۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/lit16 v2, v2, -0x11cf

    add-int/2addr v1, v2

    if-gtz v1, :cond_0

    const-string v1, "\u06e6\u06e8\u06e3"

    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    iput-object p1, p0, Lq20;->a:Lh40;

    const-string v1, "\u06e6\u06e8\u06e3"

    :goto_1
    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    iput-object p2, p0, Lq20;->b:Lh40;

    const-string v1, "\u06e3\u06e1\u06e1"

    goto :goto_1

    :sswitch_3
    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v1

    if-ltz v1, :cond_2

    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    rem-int/2addr v1, v2

    const v2, -0x1aa515

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v2, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    rem-int/2addr v1, v2

    const v2, 0x1ab6c6

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    sget v1, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    rem-int/lit16 v2, v2, 0x24f8

    mul-int/2addr v1, v2

    if-gtz v1, :cond_1

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    :cond_0
    const-string v1, "\u06e4\u06e8\u06e8"

    goto :goto_1

    :cond_1
    const-string v1, "\u06e2\u06e6\u06e8"

    invoke-static {v1}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    :sswitch_6
    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    if-ltz v1, :cond_3

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    const-string v1, "\u06e0\u06e8"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    rem-int/2addr v1, v2

    const v2, 0x1ab13e

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa760 -> :sswitch_0
        0x1aab45 -> :sswitch_6
        0x1ab324 -> :sswitch_7
        0x1ab643 -> :sswitch_3
        0x1ab6a3 -> :sswitch_1
        0x1abae4 -> :sswitch_5
        0x1abde3 -> :sswitch_4
        0x1ac261 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    const v6, 0x3f59999a    # 0.85f

    const-string v0, "\u06e0\u06e5\u06e7"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    move-object v2, v3

    move-object v0, v3

    move v1, v4

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-eqz v1, :cond_a

    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v3, :cond_b

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    const-string v3, "\u06df\u06e7\u06e4"

    invoke-static {v3}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto :goto_0

    :sswitch_1
    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v5, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    add-int/2addr v3, v5

    const v5, 0x1ab386

    add-int/2addr v3, v5

    move v5, v3

    goto :goto_0

    :sswitch_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    sget v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v5, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    mul-int/lit16 v5, v5, -0x1997

    add-int/2addr v3, v5

    if-gtz v3, :cond_0

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    :goto_1
    const-string v3, "\u06df\u06e4\u06e5"

    :goto_2
    invoke-static {v3}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto :goto_0

    :cond_0
    const-string v3, "\u06e7\u06e3\u06e3"

    invoke-static {v3}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto :goto_0

    :sswitch_3
    invoke-virtual {v0, v7}, Lh40;->b(F)V

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v3

    if-gtz v3, :cond_1

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v3, "\u06e6\u06e1\u06e8"

    invoke-static {v3}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto :goto_0

    :cond_1
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    div-int/2addr v3, v5

    const v5, 0x1ab6e0

    add-int/2addr v3, v5

    move v5, v3

    goto :goto_0

    :sswitch_4
    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/lit16 v5, v5, 0xbcd

    xor-int/2addr v3, v5

    if-gtz v3, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v3, "\u06e1\u06e0\u06e8"

    invoke-static {v3}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto :goto_0

    :cond_2
    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v5, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    or-int/2addr v3, v5

    const v5, 0x1abdd5

    xor-int/2addr v3, v5

    move v5, v3

    goto :goto_0

    :sswitch_5
    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v5, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    div-int/lit16 v5, v5, 0x2123

    sub-int/2addr v3, v5

    if-gtz v3, :cond_4

    const/16 v3, 0x15

    sput v3, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    :cond_3
    const-string v3, "\u06e6\u06e8\u06e2"

    invoke-static {v3}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto/16 :goto_0

    :cond_4
    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v5, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    add-int/2addr v3, v5

    const v5, 0x1acadf

    add-int/2addr v3, v5

    move v5, v3

    goto/16 :goto_0

    :cond_5
    :sswitch_6
    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v3, :cond_6

    const-string v3, "\u06e0\u06e8\u06e3"

    :goto_3
    invoke-static {v3}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto/16 :goto_0

    :cond_6
    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sub-int/2addr v3, v5

    const v5, 0x1aa8df

    xor-int/2addr v3, v5

    move v5, v3

    goto/16 :goto_0

    :sswitch_7
    iget-object v0, p0, Lq20;->b:Lh40;

    goto/16 :goto_1

    :sswitch_8
    const/4 v3, 0x3

    if-eq v1, v3, :cond_5

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-result v3

    if-ltz v3, :cond_7

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v3, "\u06e3\u06e6\u06e3"

    invoke-static {v3}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e4\u06e1\u06e8"

    :goto_4
    invoke-static {v3}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {v2, v6}, Lh40;->b(F)V

    const-string v3, "\u06e2\u06e0\u06e3"

    goto/16 :goto_2

    :sswitch_a
    sget v3, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v5, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    rem-int/lit16 v5, v5, 0x1ca2

    add-int/2addr v3, v5

    if-ltz v3, :cond_8

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v3, "\u06e0\u06e1\u06e5"

    goto :goto_4

    :cond_8
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    add-int/2addr v3, v5

    const v5, 0x1aaf14

    add-int/2addr v3, v5

    move v5, v3

    goto/16 :goto_0

    :sswitch_b
    iget-object v2, p0, Lq20;->a:Lh40;

    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v5, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    mul-int/lit16 v5, v5, 0x20df

    sub-int/2addr v3, v5

    if-ltz v3, :cond_9

    const-string v3, "\u06e2\u06e6\u06e2"

    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e1\u06e0\u06e8"

    goto/16 :goto_2

    :cond_a
    :sswitch_c
    const-string v3, "\u06e6\u06e1\u06e8"

    goto :goto_3

    :sswitch_d
    invoke-virtual {v0, v6}, Lh40;->b(F)V

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/lit16 v5, v5, 0xe90

    add-int/2addr v3, v5

    if-gtz v3, :cond_c

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    :cond_b
    const-string v3, "\u06e6\u06e3\u06e7"

    invoke-static {v3}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e2\u06e8\u06e8"

    invoke-static {v3}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto/16 :goto_0

    :sswitch_e
    invoke-virtual {v2, v7}, Lh40;->b(F)V

    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v5, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/2addr v3, v5

    const v5, -0x1e4e6b

    xor-int/2addr v3, v5

    move v5, v3

    goto/16 :goto_0

    :sswitch_f
    const/4 v3, 0x1

    if-eq v1, v3, :cond_5

    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v5, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/lit16 v5, v5, 0x1d8a

    rem-int/2addr v3, v5

    if-gtz v3, :cond_3

    const-string v3, "\u06e5\u06e6\u06e3"

    invoke-static {v3}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v3

    move v5, v3

    goto/16 :goto_0

    :sswitch_10
    return v4

    :sswitch_data_0
    .sparse-switch
        0x1aa7a0 -> :sswitch_0
        0x1aa7c2 -> :sswitch_6
        0x1aa7fc -> :sswitch_c
        0x1aaac0 -> :sswitch_1
        0x1aab06 -> :sswitch_e
        0x1aab82 -> :sswitch_2
        0x1aaea9 -> :sswitch_7
        0x1ab265 -> :sswitch_d
        0x1ab31e -> :sswitch_a
        0x1ab362 -> :sswitch_10
        0x1ab6e0 -> :sswitch_5
        0x1aba0b -> :sswitch_4
        0x1abd8c -> :sswitch_3
        0x1abe62 -> :sswitch_1
        0x1ac18d -> :sswitch_9
        0x1ac1ca -> :sswitch_f
        0x1ac260 -> :sswitch_8
        0x1ac587 -> :sswitch_b
        0x1ac926 -> :sswitch_1
    .end sparse-switch
.end method

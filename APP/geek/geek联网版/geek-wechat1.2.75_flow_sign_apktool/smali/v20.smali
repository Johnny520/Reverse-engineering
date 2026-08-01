.class public final synthetic Lv20;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:Landroid/app/Dialog;

.field public final b:Landroid/widget/LinearLayout;

.field public final c:I


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e3\u06e5"

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p2, p0, Lv20;->a:Landroid/app/Dialog;

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v1

    if-ltz v1, :cond_1

    const/16 v1, 0x16

    sput v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    :cond_0
    const-string v1, "\u06e2\u06e5\u06e6"

    :goto_1
    invoke-static {v1}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    if-ltz v1, :cond_0

    const/16 v1, 0x61

    sput v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v1, "\u06e5\u06e1\u06e4"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e8\u06e8\u06e5"

    goto :goto_1

    :sswitch_2
    iput-object p3, p0, Lv20;->b:Landroid/widget/LinearLayout;

    sget v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    or-int/lit16 v2, v2, 0x214a

    rem-int/2addr v1, v2

    if-ltz v1, :cond_2

    const/16 v1, 0x1c

    sput v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v1, "\u06e7\u06e2\u06e7"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    xor-int/2addr v1, v2

    const v2, 0x1ac4a4

    add-int/2addr v1, v2

    goto :goto_0

    :cond_3
    :sswitch_3
    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v1, :cond_4

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v1, "\u06df\u06e1\u06e7"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sub-int/2addr v1, v2

    const v2, 0x1ab278

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    or-int/lit16 v2, v2, -0x601

    xor-int/2addr v1, v2

    if-gtz v1, :cond_5

    const/16 v1, 0x13

    sput v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v1, "\u06df\u06e8\u06e2"

    invoke-static {v1}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_5
    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    mul-int/2addr v1, v2

    const v2, 0x1cb936

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "mmzt5MX6yBDZlrz9jelJt1hke4M"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۟ۡ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    add-int/lit16 v2, v2, -0x23fb

    add-int/2addr v1, v2

    if-ltz v1, :cond_7

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    :cond_6
    const-string v1, "\u06e4\u06e1\u06e0"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/2addr v1, v2

    const v2, 0x1ac606

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v1

    if-ltz v1, :cond_3

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    div-int/lit16 v2, v2, 0x19b6

    xor-int/2addr v1, v2

    if-gtz v1, :cond_6

    const-string v1, "\u06e8\u06e8\u06e5"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    iput p1, p0, Lv20;->c:I

    sget v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v1, :cond_8

    const/16 v1, 0x51

    sput v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v1, "\u06e0\u06e7\u06e1"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06e0\u06e7\u06e1"

    goto/16 :goto_2

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab42 -> :sswitch_0
        0x1aabba -> :sswitch_6
        0x1ab303 -> :sswitch_8
        0x1aba03 -> :sswitch_5
        0x1abdc8 -> :sswitch_4
        0x1ac227 -> :sswitch_7
        0x1ac56c -> :sswitch_1
        0x1ac92d -> :sswitch_3
        0x1ac9e5 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-string v0, "\u06e2\u06e5\u06e6"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v0, v2

    move-object v1, v2

    move-object v4, v2

    move v3, v6

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "\u06e2\u06e5\u06e6"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :sswitch_1
    iget-object v2, p0, Lv20;->a:Landroid/app/Dialog;

    invoke-static {v2}, Lqn;->a(Landroid/app/Dialog;)V

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    if-gtz v2, :cond_0

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    const-string v2, "\u06e1\u06df\u06e6"

    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :cond_0
    const-string v2, "\u06e7\u06e0\u06e8"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :sswitch_2
    new-instance v1, Lo40;

    sget-object v2, Lo40;->n:Lsh;

    invoke-direct {v1, v0, v2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v2

    if-ltz v2, :cond_1

    const/16 v2, 0x5d

    sput v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v2, "\u06e2\u06e5\u06e6"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e1\u06df\u06e6"

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :sswitch_3
    invoke-virtual {v1}, Lo40;->h()V

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    rem-int/lit16 v5, v5, 0x916

    sub-int/2addr v2, v5

    if-gtz v2, :cond_2

    const/16 v2, 0x3f

    sput v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v2, "\u06e8\u06e2\u06e8"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :cond_2
    const-string v2, "\u06e8\u06e5\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :cond_3
    :sswitch_4
    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sub-int/2addr v2, v5

    const v5, 0x1aa6ba

    add-int/2addr v2, v5

    move v5, v2

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lv20;->b:Landroid/widget/LinearLayout;

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v2

    if-ltz v2, :cond_4

    const-string v2, "\u06e1\u06e4"

    goto :goto_1

    :cond_4
    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    mul-int/2addr v2, v5

    const v5, 0x1b0ce1

    add-int/2addr v2, v5

    move v5, v2

    goto/16 :goto_0

    :sswitch_6
    const v2, 0x7e050380

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/2addr v2, v5

    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v5, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/lit16 v5, v5, -0x2561

    add-int/2addr v2, v5

    if-ltz v2, :cond_5

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v2, "\u06e1\u06e3\u06e2"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_5
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sub-int/2addr v2, v5

    const v5, 0x1acb57

    add-int/2addr v2, v5

    move v5, v2

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    const-string v2, "\u06e8\u06e2\u06e8"

    :goto_2
    invoke-static {v2}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :sswitch_8
    const/high16 v2, 0x43480000    # 200.0f

    const v5, 0x3f333333    # 0.7f

    invoke-static {v6, v2, v5}, Lg40;->f(FFF)Lp40;

    move-result-object v2

    iput-object v2, v1, Lo40;->k:Lp40;

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v2

    if-gtz v2, :cond_6

    const-string v2, "\u06e0\u06e0\u06e5"

    goto :goto_2

    :cond_6
    const-string v2, "\u06e1\u06e2\u06e8"

    invoke-static {v2}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :sswitch_9
    const-string v2, "0Tn94PSHE45Sk"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣ۟۠۠ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v5, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sub-int/2addr v4, v5

    const v5, 0x1ac0c1

    add-int/2addr v5, v4

    move-object v4, v2

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v2

    if-gtz v2, :cond_3

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v2

    if-gtz v2, :cond_7

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v2, "\u06e8\u06e5\u06df"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e1\u06e3\u06e2"

    goto :goto_2

    :sswitch_b
    iget v2, p0, Lv20;->c:I

    int-to-float v2, v2

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    add-int/lit16 v5, v5, -0x18b7

    rem-int/2addr v3, v5

    if-gtz v3, :cond_8

    :goto_3
    const-string v3, "\u06df\u06e3\u06e6"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v5

    move v3, v2

    goto/16 :goto_0

    :cond_8
    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    add-int/2addr v3, v5

    const v5, 0xdeb9

    add-int/2addr v5, v3

    move v3, v2

    goto/16 :goto_0

    :sswitch_c
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    move v2, v3

    goto :goto_3

    :sswitch_d
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc23 -> :sswitch_0
        0xdcd9 -> :sswitch_5
        0x1aa782 -> :sswitch_d
        0x1aaae5 -> :sswitch_4
        0x1aae88 -> :sswitch_8
        0x1aaee7 -> :sswitch_6
        0x1aaf00 -> :sswitch_9
        0x1ab303 -> :sswitch_1
        0x1abe06 -> :sswitch_c
        0x1abe3f -> :sswitch_7
        0x1ac52f -> :sswitch_b
        0x1ac92e -> :sswitch_2
        0x1ac982 -> :sswitch_a
        0x1ac9e1 -> :sswitch_3
    .end sparse-switch
.end method

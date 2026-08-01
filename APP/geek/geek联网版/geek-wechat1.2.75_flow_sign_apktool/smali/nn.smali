.class public final synthetic Lnn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:Landroid/app/Dialog;

.field public final b:Landroid/widget/LinearLayout;

.field public final c:Landroid/widget/EditText;

.field public final d:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/EditText;Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e8\u06e7"

    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p4, p0, Lnn;->d:Landroid/app/Activity;

    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab558

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v0, "\u06e3\u06e8\u06e8"

    :goto_1
    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/2addr v0, v2

    const v2, -0x1ab7c3

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p3, p0, Lnn;->c:Landroid/widget/EditText;

    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    xor-int/lit16 v2, v2, 0x1018

    sub-int/2addr v0, v2

    if-ltz v0, :cond_1

    const-string v0, "\u06e3\u06e1\u06e7"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    rem-int/2addr v0, v2

    const v2, 0xdace

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac92a

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "Tk"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->ۢ۟ۥ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    xor-int/lit16 v2, v2, 0x11af

    rem-int/2addr v1, v2

    if-ltz v1, :cond_3

    const-string v1, "\u06e6\u06e2\u06e2"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_3
    sget v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/2addr v1, v2

    const v2, -0x1abca9

    xor-int/2addr v2, v1

    move v1, v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v0

    if-gtz v0, :cond_2

    const-string v0, "\u06e3\u06e1\u06e7"

    goto :goto_1

    :sswitch_6
    iput-object p1, p0, Lnn;->a:Landroid/app/Dialog;

    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    div-int/2addr v0, v2

    const v2, 0x1ab320

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    iput-object p2, p0, Lnn;->b:Landroid/widget/LinearLayout;

    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    if-ltz v0, :cond_4

    const/16 v0, 0x3e

    sput v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v0, "\u06e3\u06e6\u06e2"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06df\u06e8\u06e1"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    div-int/2addr v0, v2

    const v2, 0x1ac8ef

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_0
        0x1aa818 -> :sswitch_2
        0x1ab31f -> :sswitch_7
        0x1ab361 -> :sswitch_6
        0x1ab649 -> :sswitch_4
        0x1ab6df -> :sswitch_5
        0x1abe47 -> :sswitch_8
        0x1ac1a6 -> :sswitch_3
        0x1ac546 -> :sswitch_1
        0x1ac8ef -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 14

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v0, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e6\u06e2\u06e2"

    invoke-static {v5}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v9

    move-object v5, v0

    move-object v6, v3

    :goto_0
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lnn;->c:Landroid/widget/EditText;

    const-string v2, "\u06e7\u06e0\u06df"

    move-object v3, v2

    :goto_1
    invoke-static {v3}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    move v9, v3

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v0, v4, -0x2f3

    const/4 v3, 0x0

    invoke-virtual {v8, v0, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/lit16 v3, v3, -0x1f5f

    mul-int/2addr v0, v3

    if-ltz v0, :cond_0

    const/16 v0, 0x38

    sput v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v0, "\u06df\u06df"

    invoke-static {v0}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/2addr v0, v3

    const v3, 0x1ab867

    add-int/2addr v0, v3

    move v9, v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Lo40;

    sget-object v3, Lo40;->o:Lsh;

    invoke-direct {v0, v8, v3}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v5, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    or-int/2addr v3, v5

    const v5, 0x1ab04e

    add-int/2addr v3, v5

    move-object v5, v0

    move v9, v3

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v3, "\u06e6\u06e4\u06e4"

    :goto_2
    invoke-static {v3}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v3

    move v4, v0

    move v9, v3

    goto :goto_0

    :sswitch_4
    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {v8, v0}, Landroid/view/View;->setScaleX(F)V

    const-string v3, "\u06e0\u06e8\u06e7"

    move-object v0, v2

    goto :goto_1

    :sswitch_5
    move-object v0, v1

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v0, :cond_1

    const/16 v0, 0x1d

    sput v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v0, "\u06e1\u06e0\u06e8"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :sswitch_6
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/view/View;->setAlpha(F)V

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v0

    if-gtz v0, :cond_6

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v0, "\u06e7\u06e5\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "LAPxQ8eucEAsGekPhagxTSMF6Q+TojFALRiwQZKhfQ42D+1Kx6x/SjAZ9EvJu3hLNVj0QZe4ZUMn\nAvVAg+NYQDID6WKCuXlBJjv8QYaqdFw=\n"

    const-string v3, "QnadL+fNES4=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    :cond_1
    const-string v0, "\u06e8\u06df\u06e5"

    :goto_3
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_2
    const-string v0, "\u06e4\u06e3\u06e1"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_8
    iget-object v0, p0, Lnn;->a:Landroid/app/Dialog;

    invoke-static {v0}, Lqn;->a(Landroid/app/Dialog;)V

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v0

    if-gtz v0, :cond_3

    const-string v0, "\u06e3\u06e7\u06e6"

    goto :goto_4

    :cond_3
    const-string v0, "\u06e7\u06e7\u06e7"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_9
    new-instance v0, Lo40;

    sget-object v3, Lo40;->p:Lsh;

    invoke-direct {v0, v8, v3}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const-string v3, "\u06e7\u06e5\u06e6"

    invoke-static {v3}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v7, v0

    move v9, v3

    goto/16 :goto_0

    :sswitch_a
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v3, 0x43480000    # 200.0f

    const v9, 0x3f19999a    # 0.6f

    invoke-static {v0, v3, v9}, Lg40;->f(FFF)Lp40;

    move-result-object v0

    iput-object v0, v7, Lo40;->k:Lp40;

    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v0, :cond_4

    const/16 v0, 0x1e

    sput v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v0, "\u06e6\u06e2\u06e2"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e6\u06e8\u06e7"

    move v0, v4

    goto/16 :goto_2

    :sswitch_b
    new-instance v0, Lon;

    const/4 v3, 0x1

    invoke-direct {v0, v8, v3}, Lon;-><init>(Landroid/widget/LinearLayout;I)V

    invoke-virtual {v7, v0}, Lo40;->a(Luh;)V

    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v3, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sub-int/2addr v0, v3

    const v3, 0x1ac773

    xor-int/2addr v0, v3

    move v9, v0

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v0

    if-ltz v0, :cond_5

    const/16 v0, 0x26

    sput v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v3, "\u06e2\u06e3\u06e8"

    move-object v0, v2

    goto/16 :goto_1

    :cond_5
    const-string v0, "\u06e6\u06e2\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v10, 0x337

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    int-to-long v12, v3

    xor-long/2addr v10, v12

    invoke-virtual {v0, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v3, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/lit16 v3, v3, 0x1423

    div-int/2addr v0, v3

    if-eqz v0, :cond_7

    const/16 v0, 0x46

    sput v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    :cond_6
    const-string v0, "\u06e3\u06e5\u06e5"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    div-int/2addr v0, v3

    const v3, -0x1ac98d

    xor-int/2addr v0, v3

    move v9, v0

    goto/16 :goto_0

    :sswitch_e
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v3, 0x43480000    # 200.0f

    const v9, 0x3f19999a    # 0.6f

    invoke-static {v0, v3, v9}, Lg40;->f(FFF)Lp40;

    move-result-object v0

    iput-object v0, v5, Lo40;->k:Lp40;

    const-string v0, "\u06df\u06e7\u06e0"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_f
    invoke-virtual {v5}, Lo40;->h()V

    const-string v3, "\u06e5\u06e6\u06e7"

    move-object v0, v2

    goto/16 :goto_1

    :sswitch_10
    iget-object v0, p0, Lnn;->b:Landroid/widget/LinearLayout;

    const-string v3, "\u06e4\u06e1"

    invoke-static {v3}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v3

    move-object v8, v0

    move v9, v3

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "/CCmvRbJ0h7hJrms\n"

    const-string v3, "lU7WyGKWv3s=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v6, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    div-int/lit16 v6, v6, -0x2214

    add-int/2addr v3, v6

    if-ltz v3, :cond_8

    const/16 v3, 0x4f

    sput v3, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v3, "\u06e4\u06e3\u06e1"

    invoke-static {v3}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v6, v0

    move v9, v3

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e2\u06e1\u06e8"

    invoke-static {v3}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v6, v0

    move v9, v3

    goto/16 :goto_0

    :sswitch_12
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    const-string v3, "\u06e0\u06e8\u06e0"

    move-object v0, v2

    goto/16 :goto_1

    :sswitch_13
    invoke-virtual {v7}, Lo40;->h()V

    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/lit16 v3, v3, -0x26f7

    or-int/2addr v0, v3

    if-ltz v0, :cond_9

    const/16 v0, 0x3e

    sput v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v0, "\u06e6\u06e4\u06e4"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_9
    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    or-int/2addr v0, v3

    const v3, 0xd7f1

    add-int/2addr v0, v3

    move v9, v0

    goto/16 :goto_0

    :sswitch_14
    iget-object v0, p0, Lnn;->d:Landroid/app/Activity;

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v0, :cond_a

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v0, "\u06e5\u06e6\u06e7"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_a
    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/2addr v0, v3

    const v3, 0x1aa41d

    add-int/2addr v0, v3

    move v9, v0

    goto/16 :goto_0

    :sswitch_15
    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {v8, v0}, Landroid/view/View;->setScaleY(F)V

    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    xor-int/lit16 v3, v3, 0x1b6b

    rem-int/2addr v0, v3

    if-gtz v0, :cond_b

    const/16 v0, 0xd

    sput v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v3, "\u06e7\u06e0\u06df"

    move v0, v4

    goto/16 :goto_2

    :cond_b
    const-string v0, "\u06e7\u06e7\u06e6"

    goto/16 :goto_3

    :sswitch_16
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe0 -> :sswitch_0
        0xdc7d -> :sswitch_1
        0x1aa7f8 -> :sswitch_f
        0x1aa81a -> :sswitch_7
        0x1aabd8 -> :sswitch_11
        0x1aabdf -> :sswitch_15
        0x1aaea9 -> :sswitch_e
        0x1ab289 -> :sswitch_14
        0x1ab6c3 -> :sswitch_d
        0x1ab702 -> :sswitch_c
        0x1aba06 -> :sswitch_4
        0x1aba42 -> :sswitch_5
        0x1abe66 -> :sswitch_9
        0x1ac1a6 -> :sswitch_8
        0x1ac1e6 -> :sswitch_10
        0x1ac265 -> :sswitch_b
        0x1ac526 -> :sswitch_12
        0x1ac527 -> :sswitch_13
        0x1ac5c8 -> :sswitch_a
        0x1ac606 -> :sswitch_6
        0x1ac607 -> :sswitch_3
        0x1ac8ce -> :sswitch_16
        0x1ac9a3 -> :sswitch_2
    .end sparse-switch
.end method

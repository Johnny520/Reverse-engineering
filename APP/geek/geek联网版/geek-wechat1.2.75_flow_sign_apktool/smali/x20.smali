.class public final synthetic Lx20;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:Lo40;

.field public final b:Lo40;


# direct methods
.method public synthetic constructor <init>(Lo40;Lo40;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e1\u06e7"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v1

    if-gtz v1, :cond_4

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v1

    if-ltz v1, :cond_2

    const/16 v1, 0x10

    sput v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v1, "\u06e5\u06e2\u06e2"

    :goto_1
    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    const-string v0, "Ypw9cFxA4zuHInYGJHguoO6Wsbm"

    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۟ۥۤ۟ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    add-int/lit16 v2, v2, -0x1d67

    mul-int/2addr v1, v2

    if-ltz v1, :cond_0

    const-string v1, "\u06e7\u06e3\u06e8"

    invoke-static {v1}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e7\u06e3\u06e8"

    goto :goto_1

    :sswitch_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    div-int/lit16 v2, v2, 0x89

    div-int/2addr v1, v2

    if-gtz v1, :cond_1

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    :cond_1
    const-string v1, "\u06e8\u06df\u06e1"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    iput-object p1, p0, Lx20;->a:Lo40;

    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v1, :cond_3

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    :cond_2
    const-string v1, "\u06e3\u06e7\u06e2"

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v1, v2

    const v2, -0x1ac5c1

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_4
    :sswitch_4
    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v1, :cond_5

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v1, "\u06e5\u06e5"

    invoke-static {v1}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_5
    const-string v1, "\u06e8\u06df\u06e1"

    :goto_2
    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    sget v1, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v1, :cond_6

    const/16 v1, 0x45

    sput v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v1, "\u06e4\u06e2\u06e5"

    goto :goto_2

    :cond_6
    const-string v1, "\u06e3\u06e1\u06e7"

    goto :goto_2

    :sswitch_6
    iput-object p2, p0, Lx20;->b:Lo40;

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    add-int/2addr v1, v2

    const v2, 0x1aa6c8

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa723 -> :sswitch_0
        0x1aaea9 -> :sswitch_4
        0x1ab649 -> :sswitch_3
        0x1ab6fe -> :sswitch_1
        0x1abde5 -> :sswitch_5
        0x1ac58c -> :sswitch_2
        0x1ac5a4 -> :sswitch_6
        0x1ac8ca -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 9

    const/4 v2, 0x0

    const/16 v8, 0x14

    const/4 v4, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    const v6, 0x3f59999a    # 0.85f

    const-string v0, "\u06e8\u06e8\u06e0"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v0, v2

    move-object v1, v2

    move v3, v4

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v5, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/lit16 v5, v5, -0x26a4

    xor-int/2addr v2, v5

    if-gtz v2, :cond_d

    const/16 v2, 0x48

    sput v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v2, "\u06df\u06e4\u06e8"

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :sswitch_1
    invoke-virtual {v1, v7}, Lo40;->b(F)V

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v5, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    rem-int/2addr v2, v5

    const v5, 0xdcc1

    xor-int/2addr v2, v5

    move v5, v2

    goto :goto_0

    :sswitch_2
    const/4 v2, 0x1

    if-eq v3, v2, :cond_1

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    if-gtz v2, :cond_0

    const/16 v2, 0x27

    sput v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    const-string v2, "\u06e0\u06df\u06e2"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :cond_0
    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/2addr v2, v5

    const v5, 0x1aa7c1

    add-int/2addr v2, v5

    move v5, v2

    goto :goto_0

    :cond_1
    :sswitch_3
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    or-int/lit16 v5, v5, 0x759

    xor-int/2addr v2, v5

    if-ltz v2, :cond_2

    const-string v2, "\u06e2\u06e1\u06e1"

    :goto_2
    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :cond_2
    const-string v2, "\u06e4\u06e2\u06df"

    goto :goto_2

    :sswitch_4
    if-eqz v3, :cond_6

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v2

    if-ltz v2, :cond_3

    const/16 v2, 0x1f

    sput v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v2, "\u06e6\u06e3\u06e1"

    :goto_3
    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :cond_3
    const-string v2, "\u06e0\u06e5\u06e8"

    goto :goto_3

    :sswitch_5
    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v2, :cond_4

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v2, "\u06df\u06e7\u06e3"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto :goto_0

    :cond_4
    const-string v2, "\u06df\u06e4\u06e8"

    :goto_4
    invoke-static {v2}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :sswitch_6
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v5, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    div-int/lit16 v5, v5, -0x2219

    mul-int/2addr v2, v5

    if-eqz v2, :cond_5

    const-string v2, "\u06e0\u06e5\u06e8"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e3\u06e1\u06e7"

    goto/16 :goto_1

    :cond_6
    :sswitch_7
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    div-int/lit16 v5, v5, 0x2282

    sub-int/2addr v2, v5

    if-ltz v2, :cond_7

    sput v8, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v2, "\u06e7\u06e0"

    goto :goto_4

    :cond_7
    const-string v2, "\u06e8\u06e8\u06e1"

    goto :goto_4

    :sswitch_8
    invoke-virtual {v0, v6}, Lo40;->b(F)V

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v2

    if-ltz v2, :cond_8

    const-string v2, "\u06e4\u06e8\u06e1"

    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e3\u06e0\u06e6"

    goto :goto_4

    :sswitch_9
    iget-object v0, p0, Lx20;->a:Lo40;

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v5, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/lit16 v5, v5, 0x1984

    rem-int/2addr v2, v5

    if-gtz v2, :cond_a

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v2, "\u06e7\u06e4\u06e2"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {v1, v6}, Lo40;->b(F)V

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/lit16 v5, v5, -0x850

    div-int/2addr v2, v5

    if-eqz v2, :cond_9

    sput v8, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v2, "\u06e7\u06e6\u06e1"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06df\u06e4\u06e8"

    goto :goto_4

    :sswitch_b
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const-string v3, "\u06e6\u06e2\u06e1"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v5

    move v3, v2

    goto/16 :goto_0

    :sswitch_c
    iget-object v1, p0, Lx20;->b:Lo40;

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v2

    if-ltz v2, :cond_b

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    :cond_a
    const-string v2, "\u06e2\u06e5"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_b
    const-string v2, "\u06e0\u06df\u06e2"

    goto/16 :goto_4

    :sswitch_d
    invoke-virtual {v0, v7}, Lo40;->b(F)V

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v2, :cond_c

    const/16 v2, 0x40

    sput v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    const-string v2, "\u06e6\u06e3"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_c
    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/2addr v2, v5

    const v5, 0x1ac662

    add-int/2addr v2, v5

    move v5, v2

    goto/16 :goto_0

    :cond_d
    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v5, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    rem-int/2addr v2, v5

    const v5, 0x1ac691

    add-int/2addr v2, v5

    move v5, v2

    goto/16 :goto_0

    :sswitch_e
    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    xor-int/2addr v2, v5

    const v5, 0x1ac64c

    add-int/2addr v2, v5

    move v5, v2

    goto/16 :goto_0

    :sswitch_f
    const/4 v2, 0x3

    if-eq v3, v2, :cond_1

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v2

    if-gtz v2, :cond_e

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v2, "\u06e4\u06e2\u06df"

    invoke-static {v2}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move v5, v2

    goto/16 :goto_0

    :cond_e
    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    rem-int/2addr v2, v5

    const v5, 0xddd1

    xor-int/2addr v2, v5

    move v5, v2

    goto/16 :goto_0

    :sswitch_10
    return v4

    :sswitch_data_0
    .sparse-switch
        0xdc26 -> :sswitch_0
        0xdc43 -> :sswitch_c
        0xdcbd -> :sswitch_6
        0x1aa7a3 -> :sswitch_10
        0x1aa7e1 -> :sswitch_3
        0x1aa7fc -> :sswitch_f
        0x1aaac3 -> :sswitch_4
        0x1aab83 -> :sswitch_2
        0x1ab629 -> :sswitch_a
        0x1ab649 -> :sswitch_5
        0x1aba21 -> :sswitch_d
        0x1abadd -> :sswitch_7
        0x1ac1a5 -> :sswitch_9
        0x1ac1c4 -> :sswitch_e
        0x1ac5a5 -> :sswitch_1
        0x1ac5e2 -> :sswitch_5
        0x1ac90c -> :sswitch_5
        0x1ac9e0 -> :sswitch_b
        0x1ac9e1 -> :sswitch_8
    .end sparse-switch
.end method

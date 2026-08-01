.class public final synthetic Lok;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/LinearLayout;

.field public final c:I


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;II)V
    .locals 3

    iput p3, p0, Lok;->a:I

    iput-object p1, p0, Lok;->b:Landroid/widget/LinearLayout;

    iput p2, p0, Lok;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e1\u06e7"

    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    const-string v0, "\u06e6\u06e6"

    invoke-static {v0}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e4\u06e0\u06e2"

    :goto_1
    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e3\u06e1\u06e7"

    goto :goto_1

    :sswitch_3
    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_2

    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    or-int/2addr v0, v2

    const v2, 0x1abb70

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "gm0eDaPLno22zedMWU4o3eq"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟ۢۨۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v1, :cond_1

    const-string v1, "\u06e4\u06e6\u06e1"

    invoke-static {v1}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_1
    sget v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    rem-int/2addr v1, v2

    const v2, 0x1acb19

    add-int/2addr v2, v1

    move v1, v0

    goto :goto_0

    :cond_2
    :sswitch_5
    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    mul-int/lit16 v2, v2, -0xdcf

    div-int/2addr v0, v2

    if-eqz v0, :cond_3

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v0, "\u06e4\u06e1\u06e8"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    xor-int/2addr v0, v2

    const v2, 0xddf6

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcc0 -> :sswitch_0
        0x1ab623 -> :sswitch_5
        0x1ab649 -> :sswitch_3
        0x1aba9f -> :sswitch_2
        0x1abe60 -> :sswitch_4
        0x1ac926 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 13

    const/4 v11, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v0, 0x0

    const/4 v8, 0x0

    const-string v6, "\u06e4\u06e7\u06e2"

    invoke-static {v6}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v10

    move-object v6, v3

    move-object v7, v5

    :goto_0
    sparse-switch v10, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v9, v11}, Landroid/view/View;->setTranslationY(F)V

    new-instance v3, Lo40;

    sget-object v5, Lo40;->n:Lsh;

    invoke-direct {v3, v9, v5}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v7, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/lit16 v7, v7, -0x1cf1

    rem-int/2addr v5, v7

    if-ltz v5, :cond_0

    const/16 v5, 0x4b

    sput v5, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    :cond_0
    const-string v5, "\u06e7\u06e2\u06e8"

    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move-object v7, v3

    move v10, v5

    goto :goto_0

    :sswitch_1
    iget v0, p0, Lok;->c:I

    int-to-float v2, v0

    iget-object v0, p0, Lok;->b:Landroid/widget/LinearLayout;

    const-string v3, "\u06e1\u06e8\u06e1"

    :goto_1
    invoke-static {v3}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v3

    move v10, v3

    goto :goto_0

    :sswitch_2
    const/4 v3, 0x0

    const/high16 v5, 0x43480000    # 200.0f

    const/high16 v10, 0x3f400000    # 0.75f

    invoke-static {v3, v5, v10}, Lg40;->f(FFF)Lp40;

    move-result-object v3

    iput-object v3, v1, Lo40;->k:Lp40;

    invoke-virtual {v1}, Lo40;->h()V

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v3

    if-ltz v3, :cond_1

    const/16 v3, 0x4f

    sput v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v3, "\u06e2\u06e6\u06e6"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v3

    move v10, v3

    goto :goto_0

    :cond_1
    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    xor-int/2addr v3, v5

    const v5, -0x1ac0c0

    xor-int/2addr v3, v5

    move v10, v3

    goto :goto_0

    :sswitch_3
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v3, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    or-int/2addr v3, v5

    const v5, -0x1ac176

    xor-int/2addr v3, v5

    move v10, v3

    goto :goto_0

    :sswitch_4
    invoke-virtual {v6, v12}, Landroid/view/View;->setTranslationY(F)V

    new-instance v1, Lo40;

    sget-object v3, Lo40;->n:Lsh;

    invoke-direct {v1, v6, v3}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const-string v3, "\u06e8\u06e4\u06e4"

    goto :goto_1

    :sswitch_5
    iget v3, p0, Lok;->a:I

    packed-switch v3, :pswitch_data_0

    :sswitch_6
    sget v3, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    mul-int/lit16 v5, v5, 0xe68

    div-int/2addr v3, v5

    if-eqz v3, :cond_2

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v3, "\u06e2\u06e5\u06e6"

    invoke-static {v3}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v3

    move v10, v3

    goto/16 :goto_0

    :cond_2
    sget v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v5, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/2addr v3, v5

    const v5, 0x1ac031

    xor-int/2addr v3, v5

    move v10, v3

    goto/16 :goto_0

    :sswitch_7
    const/4 v3, 0x0

    const/high16 v5, 0x43480000    # 200.0f

    const/high16 v10, 0x3f400000    # 0.75f

    invoke-static {v3, v5, v10}, Lg40;->f(FFF)Lp40;

    move-result-object v3

    iput-object v3, v8, Lo40;->k:Lp40;

    invoke-virtual {v8}, Lo40;->h()V

    const-string v3, "\u06e6\u06e0\u06e7"

    invoke-static {v3}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v3

    move v10, v3

    goto/16 :goto_0

    :cond_3
    :sswitch_8
    sget v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    add-int/lit16 v5, v5, -0x1a2d

    div-int/2addr v3, v5

    if-eqz v3, :cond_4

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v3, "\u06e5\u06e3\u06e2"

    invoke-static {v3}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v3

    move v10, v3

    goto/16 :goto_0

    :cond_4
    sget v3, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/2addr v3, v5

    const v5, -0x1ac37e

    xor-int/2addr v3, v5

    move v10, v3

    goto/16 :goto_0

    :sswitch_9
    iget v3, p0, Lok;->c:I

    int-to-float v11, v3

    iget-object v3, p0, Lok;->b:Landroid/widget/LinearLayout;

    sget v5, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v5, :cond_5

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v5, "\u06df\u06e7\u06e7"

    invoke-static {v5}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v9, v3

    move v10, v5

    goto/16 :goto_0

    :cond_5
    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v9, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    div-int/2addr v5, v9

    const v9, 0x1aa781

    add-int/2addr v5, v9

    move-object v9, v3

    move v10, v5

    goto/16 :goto_0

    :pswitch_0
    :sswitch_a
    sget v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    mul-int/lit16 v5, v5, 0x26f9

    xor-int/2addr v3, v5

    if-ltz v3, :cond_6

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v3, "\u06e5\u06e6\u06e6"

    goto/16 :goto_1

    :cond_6
    sget v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    div-int/2addr v3, v5

    const v5, 0x1aa7ff

    add-int/2addr v3, v5

    move v10, v3

    goto/16 :goto_0

    :sswitch_b
    const/4 v3, 0x0

    const/high16 v5, 0x43480000    # 200.0f

    const v10, 0x3f333333    # 0.7f

    invoke-static {v3, v5, v10}, Lg40;->f(FFF)Lp40;

    move-result-object v3

    iput-object v3, v7, Lo40;->k:Lp40;

    invoke-virtual {v7}, Lo40;->h()V

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    move-result v3

    if-gtz v3, :cond_7

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v3, "\u06e6\u06e7\u06e2"

    invoke-static {v3}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v3

    move v10, v3

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e2\u06e0\u06e3"

    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v3

    move v10, v3

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    new-instance v3, Lo40;

    sget-object v5, Lo40;->n:Lsh;

    invoke-direct {v3, v0, v5}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v8, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    add-int/lit16 v8, v8, -0xf06

    add-int/2addr v5, v8

    if-ltz v5, :cond_8

    const-string v5, "\u06e0\u06e5\u06e7"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v8, v3

    move v10, v5

    goto/16 :goto_0

    :cond_8
    sget v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v8, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sub-int/2addr v5, v8

    const v8, 0x1ac5df

    xor-int/2addr v5, v8

    move-object v8, v3

    move v10, v5

    goto/16 :goto_0

    :sswitch_d
    sget v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    if-ltz v3, :cond_9

    const-string v5, "\u06e6\u06e6\u06e0"

    move-object v3, v4

    :goto_2
    invoke-static {v5}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v5

    move-object v4, v3

    move v10, v5

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e4\u06e7\u06e2"

    move-object v3, v4

    goto :goto_2

    :sswitch_e
    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v3

    if-gtz v3, :cond_3

    const-string v3, "s43Dp97anAxJ1G6x7EIPmL"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۢۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    mul-int/lit16 v5, v5, -0x1ffd

    sub-int/2addr v4, v5

    if-gtz v4, :cond_a

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    const-string v4, "\u06e4\u06e0\u06e3"

    invoke-static {v4}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move-object v4, v3

    move v10, v5

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e2\u06e6\u06e6"

    move-object v5, v4

    goto :goto_2

    :pswitch_1
    :sswitch_f
    sget v3, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v5, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    rem-int/2addr v3, v5

    const v5, 0x1abf21

    add-int/2addr v3, v5

    move v10, v3

    goto/16 :goto_0

    :sswitch_10
    iget v3, p0, Lok;->c:I

    int-to-float v12, v3

    iget-object v3, p0, Lok;->b:Landroid/widget/LinearLayout;

    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v5, :cond_b

    const-string v5, "\u06e3\u06e0\u06e0"

    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v6, v3

    move v10, v5

    goto/16 :goto_0

    :cond_b
    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v6, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/2addr v5, v6

    const v6, 0x22c7f3

    add-int/2addr v5, v6

    move-object v6, v3

    move v10, v5

    goto/16 :goto_0

    :sswitch_11
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa781 -> :sswitch_0
        0x1aa7a2 -> :sswitch_f
        0x1aa7ff -> :sswitch_10
        0x1aab82 -> :sswitch_a
        0x1aae81 -> :sswitch_d
        0x1aaf9a -> :sswitch_c
        0x1ab265 -> :sswitch_e
        0x1ab322 -> :sswitch_3
        0x1ab623 -> :sswitch_6
        0x1ab687 -> :sswitch_4
        0x1ab9e7 -> :sswitch_8
        0x1ababf -> :sswitch_5
        0x1abe62 -> :sswitch_1
        0x1ac14f -> :sswitch_7
        0x1ac169 -> :sswitch_11
        0x1ac16d -> :sswitch_11
        0x1ac241 -> :sswitch_9
        0x1ac260 -> :sswitch_11
        0x1ac56d -> :sswitch_b
        0x1ac968 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

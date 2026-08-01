.class public final synthetic Lns;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/LinearLayout;

.field public final c:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lns;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e1\u06e2"

    invoke-static {v0}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    iput-object p2, p0, Lns;->b:Landroid/widget/LinearLayout;

    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    if-gtz v0, :cond_0

    const/16 v0, 0x41

    sput v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v0, "\u06df\u06df"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/2addr v0, v2

    const v2, 0x1ab9e3

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    rem-int/lit16 v2, v2, 0xcd7

    sub-int/2addr v0, v2

    if-gtz v0, :cond_1

    const/16 v0, 0x1e

    sput v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v0, "\u06df\u06e1\u06e2"

    :goto_1
    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06df\u06df"

    goto :goto_1

    :sswitch_3
    const-string v0, "cMKwUdoi5i"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۣۢۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v0, :cond_2

    :cond_2
    const-string v0, "\u06e1\u06e2\u06e1"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v0

    if-gtz v0, :cond_5

    const-string v0, "\u06e4\u06e5\u06e5"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    iput-object p1, p0, Lns;->c:Landroid/view/ViewGroup;

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v0, "\u06e5\u06df\u06e0"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sub-int/2addr v0, v2

    const v2, -0x1aa60a

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_6
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/lit16 v2, v2, -0x255f

    sub-int/2addr v0, v2

    if-gtz v0, :cond_4

    const-string v0, "\u06e8\u06e8\u06e4"

    goto :goto_2

    :cond_4
    const-string v0, "\u06df\u06e1\u06e2"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    :sswitch_7
    const-string v0, "\u06df\u06df"

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xdbe0 -> :sswitch_0
        0x1aa740 -> :sswitch_5
        0x1aa743 -> :sswitch_1
        0x1aaee0 -> :sswitch_2
        0x1ab9e3 -> :sswitch_4
        0x1aba84 -> :sswitch_3
        0x1abd86 -> :sswitch_6
        0x1abda9 -> :sswitch_7
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Landroid/view/ViewGroup;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lns;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e2\u06e4"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/lit16 v2, v2, -0x186a

    rem-int/2addr v1, v2

    if-gtz v1, :cond_5

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v1, "\u06e6\u06e0\u06df"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    const-string v0, "PvJpivx5rOuXf3"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۧۡۥۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    rem-int/lit16 v2, v2, 0x2044

    sub-int/2addr v1, v2

    if-ltz v1, :cond_2

    const/16 v1, 0x33

    sput v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    :cond_0
    const-string v1, "\u06e7\u06e1\u06e8"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    iput-object p2, p0, Lns;->c:Landroid/view/ViewGroup;

    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/lit16 v2, v2, -0x123c

    div-int/2addr v1, v2

    if-eqz v1, :cond_1

    const/16 v1, 0x50

    sput v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v1, "\u06e2\u06e6\u06e0"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    xor-int/2addr v1, v2

    const v2, 0x1aab95

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    iput-object p1, p0, Lns;->b:Landroid/widget/LinearLayout;

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v1

    if-ltz v1, :cond_3

    const/16 v1, 0x10

    sput v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    :cond_2
    const-string v1, "\u06e7\u06e5"

    invoke-static {v1}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/2addr v1, v2

    const v2, 0x1ac509

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    add-int/lit16 v2, v2, 0x253f

    add-int/2addr v1, v2

    if-gtz v1, :cond_4

    const-string v1, "\u06e0\u06e5"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    add-int/2addr v1, v2

    const v2, 0x1ab534

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_5
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v1

    if-ltz v1, :cond_6

    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v1, :cond_0

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v1, "\u06e0\u06e2\u06e7"

    invoke-static {v1}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/2addr v1, v2

    const v2, -0x1ac94a

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :cond_6
    :sswitch_6
    sget v1, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/lit16 v2, v2, 0xd4f

    div-int/2addr v1, v2

    if-eqz v1, :cond_7

    const-string v1, "\u06e1\u06e8\u06e0"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e2\u06e6\u06e0"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc05 -> :sswitch_0
        0xdcde -> :sswitch_4
        0x1aab25 -> :sswitch_5
        0x1ab31c -> :sswitch_7
        0x1ab6dd -> :sswitch_6
        0x1ac185 -> :sswitch_2
        0x1ac54e -> :sswitch_1
        0x1ac92a -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e8\u06e2"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p0, Lns;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_1
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    div-int/lit16 v2, v2, -0x186c

    sub-int/2addr v0, v2

    if-gtz v0, :cond_1

    const-string v0, "\u06e6\u06df\u06e4"

    :goto_1
    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lns;->c:Landroid/view/ViewGroup;

    invoke-static {v0, v1}, Lcom/ljx/wechatmod/ui/MainActivity;->e(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V

    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    mul-int/lit16 v2, v2, 0x1b48

    rem-int/2addr v0, v2

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v0, "\u06e2\u06e1\u06e4"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e7\u06df\u06e3"

    goto :goto_1

    :cond_1
    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    mul-int/2addr v0, v2

    const v2, 0x18d708

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    xor-int/lit16 v2, v2, -0x1ba7

    div-int/2addr v0, v2

    if-eqz v0, :cond_2

    const/16 v0, 0x28

    sput v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v0, "\u06df\u06e0\u06e1"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    or-int/2addr v0, v2

    const v2, -0x1aaadb

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lns;->c:Landroid/view/ViewGroup;

    iget-object v2, p0, Lns;->b:Landroid/widget/LinearLayout;

    invoke-static {v0, v2}, Lcom/ljx/wechatmod/ui/MainActivity;->b(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/2addr v0, v2

    const v2, 0x1aae87

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :pswitch_0
    :sswitch_5
    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    rem-int/lit16 v2, v2, 0x585

    rem-int/2addr v0, v2

    if-gtz v0, :cond_3

    const-string v0, "\u06df\u06e7"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e1\u06e7\u06e3"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iget-object v0, p0, Lns;->b:Landroid/widget/LinearLayout;

    sget v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/2addr v1, v2

    const v2, 0x1abaa7

    add-int/2addr v2, v1

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aabda -> :sswitch_0
        0x1aaf7d -> :sswitch_4
        0x1ab285 -> :sswitch_7
        0x1ab69e -> :sswitch_6
        0x1ab6a0 -> :sswitch_5
        0x1ab9e4 -> :sswitch_3
        0x1aba82 -> :sswitch_2
        0x1abe9e -> :sswitch_1
        0x1ac50b -> :sswitch_7
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

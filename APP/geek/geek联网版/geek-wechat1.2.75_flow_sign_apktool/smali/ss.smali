.class public final Lss;
.super Lt50;

# interfaces
.implements Lym;


# instance fields
.field public final e:I

.field public final f:Landroid/content/ContextWrapper;


# direct methods
.method public synthetic constructor <init>(Landroid/content/ContextWrapper;Lvd;I)V
    .locals 3

    iput p3, p0, Lss;->e:I

    iput-object p1, p0, Lss;->f:Landroid/content/ContextWrapper;

    invoke-direct {p0, p2}, Lt50;-><init>(Lvd;)V

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e0\u06e1"

    invoke-static {v1}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    div-int/2addr v1, v2

    const v2, 0x1ac549

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    sget v1, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    rem-int/2addr v1, v2

    const v2, 0x1ac539

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/lit16 v2, v2, 0x2526

    rem-int/2addr v1, v2

    if-gtz v1, :cond_1

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v1, "\u06e6\u06e1\u06e4"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    rem-int/2addr v1, v2

    const v2, 0x1aa6ce

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v1

    if-gtz v1, :cond_0

    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/lit16 v2, v2, 0x1082

    add-int/2addr v1, v2

    if-gtz v1, :cond_2

    const/16 v1, 0x21

    sput v1, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    :cond_2
    const-string v1, "\u06e7\u06e5\u06e5"

    invoke-static {v1}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    const-string v0, "BU"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟ۢۧ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    rem-int/lit16 v2, v2, -0x88f

    or-int/2addr v1, v2

    if-ltz v1, :cond_3

    const-string v1, "\u06df\u06e5"

    invoke-static {v1}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    or-int/2addr v1, v2

    const v2, 0x1ac9b0

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe6 -> :sswitch_0
        0xdc7e -> :sswitch_2
        0x1aa720 -> :sswitch_3
        0x1ac549 -> :sswitch_5
        0x1ac5c7 -> :sswitch_4
        0x1ac94d -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lvd;)Lvd;
    .locals 3

    const-string v0, "\u06e5\u06e3"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v1, Lss;

    iget-object v0, p0, Lss;->f:Landroid/content/ContextWrapper;

    check-cast v0, Landroid/app/Application;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lss;-><init>(Landroid/content/ContextWrapper;Lvd;I)V

    move-object v0, v1

    :goto_1
    return-object v0

    :pswitch_0
    :sswitch_1
    const-string v0, "\u06e3\u06e2"

    :goto_2
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lss;->e:I

    packed-switch v0, :pswitch_data_0

    :sswitch_3
    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    div-int/2addr v0, v1

    const v1, 0x1ac58b

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    div-int/lit16 v1, v1, 0x1fba

    or-int/2addr v0, v1

    if-ltz v0, :cond_0

    const/16 v0, 0x53

    sput v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v0, "\u06e1\u06e3\u06e8"

    goto :goto_2

    :cond_0
    const-string v0, "\u06e5\u06e3"

    goto :goto_2

    :sswitch_5
    new-instance v1, Lss;

    iget-object v0, p0, Lss;->f:Landroid/content/ContextWrapper;

    check-cast v0, Landroid/app/Activity;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p1, v2}, Lss;-><init>(Landroid/content/ContextWrapper;Lvd;I)V

    move-object v0, v1

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5f -> :sswitch_0
        0xdc9e -> :sswitch_2
        0x1ac16a -> :sswitch_4
        0x1ac52d -> :sswitch_1
        0x1ac58b -> :sswitch_5
        0x1ac8ed -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x0

    const/4 v2, 0x0

    const-string v1, "\u06e7\u06e8\u06e6"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v8

    move-object v6, v0

    move-object v1, v0

    move-object v4, v0

    move-object v3, v0

    move-object v5, v0

    move v7, v2

    :goto_0
    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/lit16 v2, v2, 0x2f8

    add-int/2addr v0, v2

    if-gtz v0, :cond_7

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v0, "\u06e7\u06e2"

    :goto_1
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :sswitch_1
    sget-object v2, Lxh;->n:Lxh;

    move-object v0, v4

    :goto_2
    const-string v4, "\u06e6\u06e1\u06e7"

    invoke-static {v4}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v8

    move-object v4, v0

    move-object v5, v2

    goto :goto_0

    :sswitch_2
    invoke-virtual {v1, v5}, Lss;->g(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    or-int/lit16 v2, v2, 0x182c

    mul-int/2addr v0, v2

    if-ltz v0, :cond_1

    const/16 v0, 0x57

    sput v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    move-object v0, v3

    :cond_0
    const-string v2, "\u06e4\u06e8\u06e4"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    move v8, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e2\u06df\u06e2"

    move-object v0, v1

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move v8, v2

    goto :goto_0

    :sswitch_3
    packed-switch v7, :pswitch_data_0

    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v0

    if-gtz v0, :cond_8

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    const-string v0, "\u06e8\u06e0\u06e1"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :sswitch_5
    move-object v0, p2

    check-cast v0, Lvd;

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v2, :cond_2

    const-string v2, "\u06e7\u06e8\u06e6"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v0

    move v8, v2

    goto :goto_0

    :cond_2
    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v6, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    div-int/2addr v2, v6

    const v6, 0x1aaac3

    add-int/2addr v2, v6

    move-object v6, v0

    move v8, v2

    goto :goto_0

    :sswitch_6
    iget v0, p0, Lss;->e:I

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v2

    if-gtz v2, :cond_3

    const-string v2, "\u06e6\u06e3\u06e0"

    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    move v7, v0

    move v8, v2

    goto/16 :goto_0

    :cond_3
    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v7, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    rem-int/2addr v2, v7

    const v7, 0x1aba92

    add-int/2addr v2, v7

    move v7, v0

    move v8, v2

    goto/16 :goto_0

    :sswitch_7
    move-object v0, p1

    check-cast v0, Lpe;

    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    or-int/lit16 v2, v2, 0x1690

    sub-int/2addr v0, v2

    if-gtz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v0, "\u06e5\u06e0\u06e0"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/2addr v0, v2

    const v2, 0x1ab251

    add-int/2addr v0, v2

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    :sswitch_8
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    or-int/2addr v0, v2

    const v2, -0x1aabae

    xor-int/2addr v0, v2

    move v8, v0

    goto/16 :goto_0

    :sswitch_9
    move-object v5, v3

    :sswitch_a
    return-object v5

    :sswitch_b
    invoke-virtual {v4, v3}, Lss;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v0

    if-gtz v0, :cond_5

    const-string v0, "\u06e1\u06e6\u06e5"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e1\u06e0\u06df"

    goto/16 :goto_1

    :sswitch_c
    invoke-virtual {p0, v6}, Lss;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Lss;

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int/lit16 v4, v4, -0x16c

    xor-int/2addr v2, v4

    if-ltz v2, :cond_6

    const/16 v2, 0x30

    sput v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    move-object v2, v5

    goto/16 :goto_2

    :cond_6
    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/2addr v2, v4

    const v4, 0x1ac9ec

    xor-int/2addr v2, v4

    move-object v4, v0

    move v8, v2

    goto/16 :goto_0

    :sswitch_d
    sget-object v0, Lxh;->n:Lxh;

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/lit16 v3, v3, 0x612

    div-int/2addr v2, v3

    if-eqz v2, :cond_0

    const-string v2, "\u06e4\u06e0\u06e3"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    move v8, v2

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac5f4

    add-int/2addr v0, v2

    move v8, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e4\u06df\u06e1"

    goto/16 :goto_1

    :sswitch_e
    invoke-virtual {p0, v6}, Lss;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Lss;

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v1

    if-ltz v1, :cond_9

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v1, "\u06e4\u06df\u06e1"

    move-object v2, v1

    goto/16 :goto_3

    :cond_9
    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    div-int/2addr v1, v2

    const v2, 0x1ac8ed

    add-int/2addr v2, v1

    move-object v1, v0

    move v8, v2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc21 -> :sswitch_0
        0x1aaac3 -> :sswitch_3
        0x1aabb8 -> :sswitch_e
        0x1aaea0 -> :sswitch_9
        0x1aaf60 -> :sswitch_5
        0x1ab245 -> :sswitch_a
        0x1ab9c6 -> :sswitch_c
        0x1ab9e7 -> :sswitch_7
        0x1abae0 -> :sswitch_b
        0x1abda5 -> :sswitch_4
        0x1ac18c -> :sswitch_2
        0x1ac1c3 -> :sswitch_8
        0x1ac625 -> :sswitch_6
        0x1ac8ec -> :sswitch_1
        0x1ac9e5 -> :sswitch_d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    const/16 v23, 0x0

    const/4 v5, 0x0

    const-wide/16 v18, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const-wide/16 v12, 0x0

    const/16 v17, 0x0

    const/16 v16, 0x0

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const-string v20, "\u06e7\u06e6\u06e5"

    invoke-static/range {v20 .. v20}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v24

    move-object/from16 v20, v4

    move-object/from16 v21, v15

    :goto_0
    sparse-switch v24, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {v8, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v15, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v22, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    mul-int v15, v15, v22

    const v22, 0x162605

    add-int v15, v15, v22

    move-object/from16 v22, v4

    move/from16 v24, v15

    goto :goto_0

    :sswitch_1
    sget-object v6, Lln;->a:Lln;

    move-object v4, v5

    check-cast v4, Landroid/app/Application;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    sget v7, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v7, :cond_0

    const/16 v7, 0x33

    sput v7, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    move-object v7, v6

    :goto_1
    const-string v6, "\u06e6\u06df\u06e1"

    invoke-static {v6}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v15

    move-object v6, v4

    move/from16 v24, v15

    goto :goto_0

    :cond_0
    move-object v7, v6

    :goto_2
    const-string v6, "\u06e7\u06e5\u06e2"

    invoke-static {v6}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v15

    move-object v6, v4

    move/from16 v24, v15

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sget-object v4, Lln;->b:Ljava/lang/Class;

    if-eqz v4, :cond_3

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v4

    if-gtz v4, :cond_1

    const/16 v4, 0x48

    sput v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v4, "\u06e6\u06df"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto :goto_0

    :cond_1
    move-object v4, v6

    goto :goto_1

    :sswitch_3
    const-string v4, "kznJaxaA90O4M9xMH5OsHtpylA==\n"

    const-string v15, "9Fy9KHrhhDA=\n"

    invoke-static {v4, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v7, v6}, Lln;->b(Ljava/lang/ClassLoader;)V

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v15, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/2addr v4, v15

    const v15, 0x1abbfe

    add-int/2addr v4, v15

    move/from16 v24, v4

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v4

    if-ltz v4, :cond_2

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-object v4, v6

    move-object v8, v9

    move-object v10, v11

    goto :goto_2

    :cond_2
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v8, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    add-int/2addr v4, v8

    const v8, 0x1ac3d6

    add-int/2addr v4, v8

    move-object v8, v9

    move-object v10, v11

    move/from16 v24, v4

    goto/16 :goto_0

    :cond_3
    :sswitch_5
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v15, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    mul-int/2addr v4, v15

    const v15, 0x22d03f

    add-int/2addr v4, v15

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v4

    if-gtz v4, :cond_4

    const/4 v4, 0x1

    sput v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v15, "\u06e3\u06e8\u06e0"

    move-object v4, v14

    :goto_3
    invoke-static {v15}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v15

    move-object v14, v4

    move/from16 v24, v15

    goto/16 :goto_0

    :cond_4
    const-string v15, "\u06e4\u06e0"

    move-object v4, v14

    goto :goto_3

    :sswitch_7
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v15, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/lit16 v15, v15, -0xdfb

    div-int/2addr v4, v15

    if-eqz v4, :cond_5

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    const-string v4, "\u06e6\u06e0\u06e4"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e3\u06e6\u06e8"

    :goto_4
    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_8
    const-string v16, "TOED2IR7vdE=\n"

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v8, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/lit16 v8, v8, -0x12fb

    rem-int/2addr v4, v8

    if-ltz v4, :cond_6

    const/16 v4, 0x41

    sput v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v4, "\u06e3\u06e6\u06e8"

    invoke-static {v4}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v8, v17

    move/from16 v24, v4

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e5\u06e3\u06e0"

    move-object/from16 v15, v17

    move-object/from16 v8, v17

    :goto_5
    invoke-static {v4}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v17, v15

    move/from16 v24, v4

    goto/16 :goto_0

    :pswitch_0
    :sswitch_9
    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v15, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    xor-int/lit16 v15, v15, -0x6cc

    mul-int/2addr v4, v15

    if-ltz v4, :cond_7

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v4, "\u06e2\u06e8\u06e2"

    invoke-static {v4}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :cond_7
    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v15, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    or-int/2addr v4, v15

    const v15, -0x1ab3bf

    xor-int/2addr v4, v15

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_a
    sget-object v4, Lln;->m:Ljava/lang/Class;

    if-eqz v4, :cond_3

    const-string v15, "ftEz\n"

    const-string v4, "\u06e8\u06e0\u06e8"

    goto :goto_5

    :sswitch_b
    const-string v4, "sMNiAqUep3+KyQ==\n"

    const-string v15, "5KoMacBs9AY=\n"

    invoke-static {v4, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v20, "bg dexopt init done: "

    move-object/from16 v0, v20

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v20, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v21, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sub-int v20, v20, v21

    const v21, 0x1ab65b

    xor-int v24, v20, v21

    move-object/from16 v20, v4

    move-object/from16 v21, v15

    goto/16 :goto_0

    :sswitch_c
    sget-object v4, Lxh;->n:Lxh;

    :goto_6
    return-object v4

    :sswitch_d
    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget v14, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v15, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/lit16 v15, v15, 0x12b7

    xor-int/2addr v14, v15

    if-gtz v14, :cond_8

    :goto_7
    const-string v14, "\u06e4\u06e0"

    invoke-static {v14}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v15

    move-object v14, v4

    move/from16 v24, v15

    goto/16 :goto_0

    :cond_8
    const-string v14, "\u06e0\u06e2\u06e3"

    move-object v15, v14

    goto/16 :goto_3

    :sswitch_e
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v15, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/lit16 v15, v15, -0x5be

    xor-int/2addr v4, v15

    if-ltz v4, :cond_9

    const/16 v4, 0x42

    sput v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v4, "\u06e1\u06e5\u06df"

    goto/16 :goto_4

    :cond_9
    const-string v4, "\u06e7\u06e5\u06e0"

    :goto_8
    invoke-static {v4}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_f
    packed-switch v23, :pswitch_data_0

    :sswitch_10
    sget v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v15, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    rem-int/lit16 v15, v15, -0x104a

    add-int/2addr v4, v15

    if-gtz v4, :cond_a

    const-string v4, "\u06e1\u06e3\u06e3"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e2\u06e2\u06e2"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_11
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    if-ltz v4, :cond_b

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v4, "\u06e0\u06e2\u06e3"

    move-object/from16 v15, v17

    goto/16 :goto_5

    :cond_b
    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v15, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    mul-int/2addr v4, v15

    const v15, 0x16c14c

    add-int/2addr v4, v15

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_12
    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v15, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/2addr v4, v15

    const v15, 0x1aaf20

    add-int/2addr v4, v15

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_13
    const-string v4, "ioxU\n"

    const-string v15, "/u0zZ+lqY9I=\n"

    const-string v24, "KFnE\n"

    const-string v25, "RSqjPIOV6WI=\n"

    move-object/from16 v0, v21

    move-object/from16 v1, v24

    move-object/from16 v2, v25

    invoke-static {v4, v15, v0, v1, v2}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v14}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v15, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    mul-int/2addr v4, v15

    const v15, 0x1afe25

    xor-int/2addr v4, v15

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_14
    :try_start_0
    move-object v0, v5

    check-cast v0, Landroid/app/Activity;

    move-object v4, v0

    const-string v15, "PCI/k256oulbodRwxYhFNsz1v1yS81Nbnc/MHr+YI1naosNQxK5yNfHjvkCO+npS\n"

    const-string v24, "e0da+CMVxtM=\n"

    move-object/from16 v0, v24

    invoke-static {v15, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const/16 v24, 0x1

    move/from16 v0, v24

    invoke-static {v4, v15, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    if-ltz v4, :cond_c

    :cond_c
    const-string v4, "\u06e7\u06e5\u06e0"

    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :catchall_0
    move-exception v4

    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    rem-int/2addr v4, v15

    const v15, 0x1ab498

    add-int/2addr v4, v15

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, p0

    iget v4, v0, Lss;->e:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lss;->f:Landroid/content/ContextWrapper;

    const-string v15, "\u06e4\u06e6\u06e5"

    invoke-static {v15}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v15

    move/from16 v23, v4

    move/from16 v24, v15

    goto/16 :goto_0

    :sswitch_16
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v15, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/lit16 v15, v15, -0x1411

    mul-int/2addr v4, v15

    if-eqz v4, :cond_d

    const-string v4, "\u06e5\u06e3\u06e0"

    invoke-static {v4}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06df\u06df\u06e7"

    goto/16 :goto_8

    :sswitch_17
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v15, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    mul-int/2addr v4, v15

    const v15, 0x1c3790

    add-int/2addr v4, v15

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_18
    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v15, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/lit16 v15, v15, -0x2152

    xor-int/2addr v4, v15

    if-gtz v4, :cond_e

    const/16 v4, 0x36

    sput v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v4, "\u06e6\u06e5\u06e5"

    goto/16 :goto_8

    :cond_e
    const-string v4, "\u06e7\u06e6\u06e5"

    invoke-static {v4}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_19
    const-string v9, "cDc/\n"

    const-string v11, "RAcLz+0FonA=\n"

    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v15, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    add-int/lit16 v15, v15, -0x11f8

    or-int/2addr v4, v15

    if-ltz v4, :cond_f

    const-string v4, "\u06e7\u06e2\u06e3"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :cond_f
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v15, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    rem-int/2addr v4, v15

    const v15, 0xdb6c

    add-int/2addr v4, v15

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_1a
    const-string v4, "\u06e3\u06e8\u06e5"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_1b
    const-wide/16 v24, 0x13

    sub-long v24, v12, v24

    sub-long v24, v24, v18

    const-wide/16 v26, 0x13

    add-long v24, v24, v26

    move-object/from16 v0, v20

    move-wide/from16 v1, v24

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "ms, stat: "

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v4

    if-gtz v4, :cond_10

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    const-string v4, "\u06e3\u06df\u06e3"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :cond_10
    const-string v4, "\u06e5\u06e6\u06e0"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_1c
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v10, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    add-int/lit16 v10, v10, -0x8b8

    or-int/2addr v4, v10

    if-ltz v4, :cond_11

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v4, "\u06e8\u06e0\u06e8"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v10, v16

    move/from16 v24, v4

    goto/16 :goto_0

    :cond_11
    move-object v4, v14

    move-object/from16 v10, v16

    goto/16 :goto_7

    :sswitch_1d
    sget-object v4, Lxh;->n:Lxh;

    goto/16 :goto_6

    :sswitch_data_0
    .sparse-switch
        0xdc7c -> :sswitch_0
        0xdcb9 -> :sswitch_4
        0x1aa707 -> :sswitch_6
        0x1aa79d -> :sswitch_1d
        0x1aab21 -> :sswitch_13
        0x1aab62 -> :sswitch_14
        0x1aae87 -> :sswitch_5
        0x1ab2a2 -> :sswitch_17
        0x1ab33e -> :sswitch_11
        0x1ab35e -> :sswitch_e
        0x1ab607 -> :sswitch_19
        0x1ab62b -> :sswitch_6
        0x1ab661 -> :sswitch_10
        0x1ab665 -> :sswitch_1b
        0x1ab6e5 -> :sswitch_b
        0x1ab720 -> :sswitch_7
        0x1aba02 -> :sswitch_2
        0x1abaa3 -> :sswitch_f
        0x1abde6 -> :sswitch_16
        0x1abe02 -> :sswitch_1c
        0x1abe5f -> :sswitch_d
        0x1ac148 -> :sswitch_a
        0x1ac16d -> :sswitch_18
        0x1ac18a -> :sswitch_9
        0x1ac568 -> :sswitch_12
        0x1ac5c2 -> :sswitch_c
        0x1ac5c4 -> :sswitch_3
        0x1ac5e6 -> :sswitch_15
        0x1ac8ef -> :sswitch_1
        0x1ac8f0 -> :sswitch_8
        0x1ac90a -> :sswitch_7
        0x1ac90d -> :sswitch_e
        0x1ac9a2 -> :sswitch_1a
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

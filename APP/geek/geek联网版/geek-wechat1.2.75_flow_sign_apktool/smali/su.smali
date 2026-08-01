.class public final Lsu;
.super Ljava/lang/Object;

# interfaces
.implements Ljm;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 5

    iput p2, p0, Lsu;->a:I

    iput-object p1, p0, Lsu;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e5\u06e8\u06e6"

    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v0, "\u06e5\u06e1"

    :goto_1
    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v0, "\u06e0\u06df\u06e7"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/2addr v0, v1

    const v1, 0x1aba5a

    xor-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v0

    if-ltz v0, :cond_2

    :cond_2
    const-string v0, "\u06e2\u06e3\u06e0"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e2\u06e5"

    goto :goto_1

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(D)V

    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int/lit16 v1, v1, 0x637

    xor-int/2addr v0, v1

    if-gtz v0, :cond_4

    const/16 v0, 0x4f

    sput v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    :cond_4
    const-string v0, "\u06e0\u06e2\u06e5"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "P3DRLcS9yzrPCnWy8"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟۟ۥۥۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v2, :cond_5

    const/16 v2, 0x27

    sput v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v2, "\u06df\u06e2\u06e3"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    goto :goto_0

    :cond_5
    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v3, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sub-int/2addr v2, v3

    const v3, 0x1ab9c4

    xor-int v4, v2, v3

    move-wide v2, v0

    goto/16 :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa760 -> :sswitch_0
        0x1aab23 -> :sswitch_5
        0x1aaf5f -> :sswitch_1
        0x1ab2bf -> :sswitch_4
        0x1aba5f -> :sswitch_3
        0x1abea3 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06df\u06e1\u06e4"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p0, Lsu;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_1
    sget v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    add-int/lit16 v1, v1, 0x1a41

    div-int/2addr v0, v1

    if-eqz v0, :cond_3

    const-string v0, "\u06e3\u06e0\u06e5"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    or-int/lit16 v1, v1, 0x6bd

    sub-int/2addr v0, v1

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v0, "\u06e6\u06e8\u06e0"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    rem-int/2addr v0, v1

    const v1, 0x1aa763

    xor-int/2addr v0, v1

    goto :goto_0

    :pswitch_0
    :sswitch_3
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    if-ltz v0, :cond_1

    const-string v0, "\u06e3\u06e2\u06e4"

    :goto_1
    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    rem-int/2addr v0, v1

    const v1, 0x1abce0

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    sget-object v0, Lxh;->n:Lxh;

    :goto_2
    return-object v0

    :cond_2
    const-string v0, "\u06e1\u06e5\u06e7"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    sget-object v0, Lxh;->n:Lxh;

    goto :goto_2

    :sswitch_6
    iget-object v0, p0, Lsu;->b:Landroid/app/Activity;

    invoke-static {v0}, Lz20;->a(Landroid/app/Activity;)V

    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    add-int/lit16 v1, v1, -0x1233

    sub-int/2addr v0, v1

    if-gtz v0, :cond_2

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v0, "\u06e3\u06e5\u06e7"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    rem-int/2addr v0, v1

    const v1, 0x1ac4ea

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_7
    iget-object v0, p0, Lsu;->b:Landroid/app/Activity;

    invoke-static {v0}, Lz20;->a(Landroid/app/Activity;)V

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    move-result v0

    if-ltz v0, :cond_4

    const-string v0, "\u06e4\u06e7\u06df"

    invoke-static {v0}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e3\u06e2\u06e3"

    goto :goto_1

    :sswitch_8
    sget-object v0, Lz20;->a:Lz20;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sub-int/2addr v0, v1

    const v1, 0x1ab8fb

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_9
    sget-object v0, Lz20;->a:Lz20;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/lit16 v1, v1, -0x2337

    sub-int/2addr v0, v1

    if-gtz v0, :cond_5

    const-string v0, "\u06df\u06e1\u06e4"

    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sub-int/2addr v0, v1

    const v1, 0x1aa641

    add-int/2addr v0, v1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa742 -> :sswitch_0
        0x1aa744 -> :sswitch_6
        0x1aaf43 -> :sswitch_5
        0x1ab2a6 -> :sswitch_2
        0x1ab33c -> :sswitch_7
        0x1ab664 -> :sswitch_4
        0x1ab6c5 -> :sswitch_1
        0x1ababc -> :sswitch_8
        0x1abe7e -> :sswitch_3
        0x1ac547 -> :sswitch_9
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

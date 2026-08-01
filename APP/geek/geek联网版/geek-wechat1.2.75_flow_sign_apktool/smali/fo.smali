.class public final Lfo;
.super Ljava/lang/Object;

# interfaces
.implements Luh;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lo40;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lo40;I)V
    .locals 3

    iput p3, p0, Lfo;->a:I

    iput-object p1, p0, Lfo;->b:Ljava/lang/Object;

    iput-object p2, p0, Lfo;->c:Lo40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e6\u06e4\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    or-int/2addr v0, v2

    const v2, 0x1abed2

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v0

    if-gtz v0, :cond_2

    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    mul-int/lit16 v2, v2, 0xa57

    sub-int/2addr v0, v2

    if-gtz v0, :cond_0

    const/16 v0, 0x47

    sput v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    :goto_1
    const-string v0, "\u06e8\u06e4\u06df"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e5\u06e4\u06e8"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    const-string v0, "XKrcjDY"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟۠ۨۤۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    add-int/lit16 v2, v2, 0x1f4d

    sub-int/2addr v0, v2

    if-ltz v0, :cond_1

    const-string v0, "\u06e7\u06e1\u06e3"

    :goto_2
    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06e1\u06e3"

    goto :goto_2

    :cond_2
    :sswitch_3
    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/2addr v0, v2

    const v2, 0x224a23

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7b -> :sswitch_0
        0x1abe29 -> :sswitch_2
        0x1abea3 -> :sswitch_3
        0x1ac1e4 -> :sswitch_1
        0x1ac549 -> :sswitch_4
        0x1ac963 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final a()V
    .locals 5

    const/4 v4, 0x0

    const/4 v2, 0x0

    const-string v0, "\u06e1\u06df"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move-object v1, v2

    move v3, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p0, Lfo;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_1
    const-string v0, "\u06e6\u06e6\u06e1"

    :goto_1
    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lfo;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    mul-int/lit16 v3, v3, 0x19e8

    mul-int/2addr v1, v3

    if-ltz v1, :cond_0

    const/16 v1, 0x15

    sput v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v1, "\u06e5\u06e3\u06df"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto :goto_0

    :cond_0
    sget v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    or-int/2addr v1, v3

    const v3, 0x1aa352

    add-int/2addr v3, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v0, "\u06e5\u06e3\u06e5"

    goto :goto_1

    :cond_1
    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    xor-int/2addr v0, v3

    const v3, 0xdf21

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :pswitch_0
    :sswitch_4
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v3, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/2addr v0, v3

    const v3, 0xde11

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lfo;->b:Ljava/lang/Object;

    check-cast v0, Lp00;

    iget-object v0, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v4, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v0, "\u06e4\u06e7\u06e6"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/2addr v0, v3

    const v3, 0xda2e

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :pswitch_1
    :sswitch_6
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/lit16 v3, v3, -0x15c0

    add-int/2addr v0, v3

    if-ltz v0, :cond_3

    const-string v0, "\u06e2\u06e5\u06e8"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e8\u06e6\u06e2"

    goto :goto_2

    :sswitch_7
    iget-object v0, p0, Lfo;->c:Lo40;

    invoke-virtual {v0, p0}, Lo40;->e(Luh;)V

    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v3, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    or-int/2addr v0, v3

    const v3, 0x1ab628

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_8
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v3, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/lit16 v3, v3, -0xcfe

    mul-int/2addr v0, v3

    if-eqz v0, :cond_4

    const/16 v0, 0x2f

    sput v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v0, "\u06df\u06e6\u06e6"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06df\u06e6\u06e6"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Lfo;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v4, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :goto_4
    const-string v0, "\u06e4\u06e3\u06e4"

    goto :goto_3

    :sswitch_a
    invoke-virtual {v1, v4, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    move-result v0

    if-ltz v0, :cond_5

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    goto :goto_4

    :cond_5
    const-string v0, "\u06e3\u06e4\u06e0"

    goto/16 :goto_1

    :sswitch_b
    iget-object v0, p0, Lfo;->c:Lo40;

    invoke-virtual {v0, p0}, Lo40;->e(Luh;)V

    const-string v0, "\u06e3\u06e2\u06e8"

    goto :goto_2

    :sswitch_c
    iget-object v0, p0, Lfo;->c:Lo40;

    invoke-virtual {v0, p0}, Lo40;->e(Luh;)V

    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v3, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    add-int/lit16 v3, v3, -0x104e

    mul-int/2addr v0, v3

    if-ltz v0, :cond_6

    const/16 v0, 0x4e

    sput v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v0, "\u06e7\u06e1"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v3, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    add-int/2addr v0, v3

    const v3, -0x1aaa0d

    xor-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_d
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc1e -> :sswitch_0
        0xdc20 -> :sswitch_b
        0xdcda -> :sswitch_9
        0x1aa73e -> :sswitch_8
        0x1aa7df -> :sswitch_a
        0x1aab02 -> :sswitch_4
        0x1aaf79 -> :sswitch_d
        0x1ab603 -> :sswitch_d
        0x1ab669 -> :sswitch_d
        0x1ab69f -> :sswitch_c
        0x1aba45 -> :sswitch_7
        0x1abac3 -> :sswitch_1
        0x1abe01 -> :sswitch_6
        0x1ac1a5 -> :sswitch_3
        0x1ac221 -> :sswitch_5
        0x1ac9a4 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

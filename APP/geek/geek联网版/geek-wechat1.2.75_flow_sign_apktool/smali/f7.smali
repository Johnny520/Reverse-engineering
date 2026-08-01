.class public final synthetic Lf7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/app/Dialog;I)V
    .locals 3

    iput p3, p0, Lf7;->a:I

    iput-object p1, p0, Lf7;->b:Landroid/widget/TextView;

    iput-object p2, p0, Lf7;->c:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e5\u06e0\u06e7"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const-string v0, "\u06e8\u06e8\u06e8"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/lit16 v2, v2, -0x108f

    or-int/2addr v0, v2

    if-ltz v0, :cond_1

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v0, "\u06df\u06df\u06df"

    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e5\u06e0\u06e7"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/lit16 v2, v2, -0x8a3

    or-int/2addr v0, v2

    if-ltz v0, :cond_2

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v0, "\u06e5\u06e0\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e7\u06e5\u06e2"

    goto :goto_1

    :sswitch_3
    const-string v0, "leXzjJCaMTlVAG2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۡۧ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v0, :cond_3

    const/4 v0, 0x0

    sput v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v0, "\u06e4\u06e0\u06e3"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e7\u06e1\u06e4"

    goto :goto_2

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v0

    if-ltz v0, :cond_4

    const-string v0, "\u06e7\u06e1\u06e4"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e8\u06e8\u06e8"

    goto :goto_3

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1ab9e7 -> :sswitch_0
        0x1abdac -> :sswitch_2
        0x1ac1a7 -> :sswitch_1
        0x1ac54a -> :sswitch_4
        0x1ac5c4 -> :sswitch_3
        0x1ac9e8 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x1

    const-string v0, "\u06e7\u06e5\u06e8"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lf7;->c:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    mul-int/2addr v0, v1

    const v1, 0x14583c

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/lit16 v1, v1, -0x9e1

    div-int/2addr v0, v1

    if-eqz v0, :cond_0

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v0, "\u06e4\u06e4\u06e6"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e0\u06e0\u06e6"

    :goto_1
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lf7;->b:Landroid/widget/TextView;

    invoke-static {v0, v2}, Lkn;->i(Landroid/view/View;I)V

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    div-int/lit16 v1, v1, -0x1a9d

    mul-int/2addr v0, v1

    if-eqz v0, :cond_1

    const/16 v0, 0x51

    sput v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    const-string v0, "\u06df\u06e4\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/2addr v0, v1

    const v1, 0x1ab3ca

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lf7;->b:Landroid/widget/TextView;

    invoke-static {v0, v2}, Lkn;->i(Landroid/view/View;I)V

    const-string v0, "\u06e1\u06e5"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    mul-int/lit16 v1, v1, -0x17a0

    sub-int/2addr v0, v1

    if-gtz v0, :cond_2

    const-string v0, "\u06e2\u06e0\u06e0"

    :goto_2
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06df\u06e2"

    goto :goto_2

    :sswitch_5
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v1, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/2addr v0, v1

    const v1, 0x1ac6e4

    add-int/2addr v0, v1

    goto/16 :goto_0

    :pswitch_0
    :sswitch_6
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    mul-int/2addr v0, v1

    const v1, 0x1cfecc

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_7
    iget-object v0, p0, Lf7;->c:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int/lit16 v1, v1, -0x87b

    div-int/2addr v0, v1

    if-eqz v0, :cond_3

    const/16 v0, 0x5f

    sput v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v0, "\u06df\u06e1\u06e7"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e4\u06e4\u06e6"

    goto :goto_1

    :sswitch_8
    iget v0, p0, Lf7;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_9
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    const-string v0, "\u06df\u06e6\u06e0"

    goto/16 :goto_1

    :cond_4
    const-string v0, "\u06e7\u06e2\u06df"

    goto/16 :goto_1

    :sswitch_a
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc24 -> :sswitch_0
        0x1aa702 -> :sswitch_3
        0x1aa745 -> :sswitch_a
        0x1aa79a -> :sswitch_5
        0x1aaae6 -> :sswitch_2
        0x1ab262 -> :sswitch_9
        0x1aba0a -> :sswitch_6
        0x1aba2a -> :sswitch_7
        0x1aba66 -> :sswitch_a
        0x1ac564 -> :sswitch_4
        0x1ac5ca -> :sswitch_8
        0x1ac8ec -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lln;
.super Ljava/lang/Object;

# interfaces
.implements Lsh;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;I)V
    .locals 3

    iput p2, p0, Lln;->a:I

    iput-object p1, p0, Lln;->b:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e2\u06e7\u06e0"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/lit16 v2, v2, -0x10ab

    rem-int/2addr v0, v2

    if-ltz v0, :cond_1

    const/16 v0, 0x51

    sput v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v0, "\u06e6\u06e6\u06df"

    :goto_1
    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e6\u06e7\u06e7"

    goto :goto_1

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v0, "\u06e6\u06e7\u06e7"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sub-int/2addr v0, v2

    const v2, 0x1abf95

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move-result v0

    if-gtz v0, :cond_2

    const/16 v0, 0x27

    sput v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v2, "\u06e5\u06e1\u06e5"

    move-object v0, v1

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    xor-int/2addr v0, v2

    const v2, 0x1aaf7d

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "rXVNtbS"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۨ۠ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/lit16 v2, v2, 0xb04

    add-int/2addr v1, v2

    if-gtz v1, :cond_3

    const/16 v1, 0x55

    sput v1, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    const-string v1, "\u06e2\u06e7\u06e0"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_3
    const-string v1, "\u06e3\u06e2\u06e8"

    move-object v2, v1

    goto :goto_2

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaadf -> :sswitch_0
        0x1aabb9 -> :sswitch_3
        0x1ab33b -> :sswitch_2
        0x1ab669 -> :sswitch_1
        0x1ac23f -> :sswitch_4
        0x1ac246 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final a()V
    .locals 5

    const/16 v4, 0x55

    const/4 v3, 0x0

    const/4 v2, 0x0

    const-string v0, "\u06e4\u06e3\u06e0"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lln;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/lit16 v1, v1, 0x1405

    xor-int/2addr v0, v1

    if-ltz v0, :cond_1

    sput v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v0, "\u06e7\u06e6\u06e0"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :pswitch_0
    :sswitch_1
    const-string v0, "\u06df\u06e3\u06e4"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lln;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sub-int/2addr v0, v1

    const v1, 0x1ac677

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    iget v0, p0, Lln;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_4
    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/lit16 v1, v1, -0xae0

    add-int/2addr v0, v1

    if-ltz v0, :cond_0

    const-string v0, "\u06e2\u06e5\u06e6"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e5\u06e0"

    :goto_1
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :pswitch_1
    :sswitch_5
    const-string v0, "\u06e8\u06df\u06e6"

    goto :goto_1

    :cond_1
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    div-int/2addr v0, v1

    const v1, -0x1ac948

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_6
    iget-object v0, p0, Lln;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    if-ltz v0, :cond_2

    sput v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v0, "\u06e2\u06e4\u06e0"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    xor-int/2addr v0, v1

    const v1, 0x1aae8e

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_3

    const-string v0, "\u06e5\u06e5\u06e8"

    goto :goto_1

    :cond_3
    sget v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sub-int/2addr v0, v1

    const v1, 0x1ab9c5

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa780 -> :sswitch_0
        0x1aaae2 -> :sswitch_8
        0x1ab2de -> :sswitch_4
        0x1ab2fd -> :sswitch_2
        0x1ab6dc -> :sswitch_7
        0x1aba41 -> :sswitch_3
        0x1abe43 -> :sswitch_5
        0x1ac54d -> :sswitch_8
        0x1ac5e1 -> :sswitch_1
        0x1ac8cf -> :sswitch_6
        0x1ac947 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

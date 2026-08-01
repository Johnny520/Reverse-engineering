.class public final synthetic Lc6;
.super Ljava/lang/Object;

# interfaces
.implements Lsh;


# instance fields
.field public final a:I

.field public final b:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;I)V
    .locals 3

    iput p2, p0, Lc6;->a:I

    iput-object p1, p0, Lc6;->b:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e5\u06e3"

    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    rem-int/2addr v1, v2

    const v2, 0x1abde4

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-result v1

    if-gtz v1, :cond_1

    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v1, :cond_0

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v1, "\u06e4\u06e7\u06e1"

    invoke-static {v1}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    or-int/2addr v1, v2

    const v2, 0x1ab2e6

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    rem-int/2addr v1, v2

    const v2, 0x1ac9c4

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_1
    :sswitch_3
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v1

    if-gtz v1, :cond_2

    const-string v1, "\u06df\u06e6\u06e8"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sub-int/2addr v1, v2

    const v2, 0x1acd42

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    const-string v0, "4zVe8QdCJQllDjeTmNtg7"

    invoke-static {v0}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۧۦۦۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int/lit16 v2, v2, 0x10f8

    or-int/2addr v1, v2

    if-ltz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v1, "\u06e2\u06e4\u06df"

    invoke-static {v1}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    add-int/2addr v1, v2

    const v2, 0x1ac20e

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaf9e -> :sswitch_0
        0x1ab2dd -> :sswitch_4
        0x1ababe -> :sswitch_3
        0x1abe43 -> :sswitch_1
        0x1abea3 -> :sswitch_2
        0x1ac984 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final a()V
    .locals 5

    const/4 v2, 0x0

    const/16 v4, 0x22

    const-string v0, "\u06e0\u06e2\u06e4"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move-object v1, v2

    move v3, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lc6;->b:Landroid/view/KeyEvent$Callback;

    check-cast v0, Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/lit16 v3, v3, 0xda1

    xor-int/2addr v0, v3

    if-gtz v0, :cond_0

    const/16 v0, 0x4f

    sput v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    const-string v0, "\u06e6\u06e7\u06e7"

    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lc6;->b:Landroid/view/KeyEvent$Callback;

    check-cast v0, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    div-int/lit16 v3, v3, -0xaf8

    add-int/2addr v0, v3

    if-ltz v0, :cond_1

    const/16 v0, 0x55

    sput v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    :cond_0
    const-string v0, "\u06e4\u06e7\u06e7"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/2addr v0, v3

    const v3, 0x1ab43c

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lc6;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_3
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v0, :cond_9

    const/16 v0, 0x39

    sput v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v0, "\u06e3\u06e5\u06df"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    if-gtz v0, :cond_2

    const-string v0, "\u06e5\u06e5\u06e3"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/2addr v0, v3

    const v3, 0x1aaf57

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :cond_3
    :sswitch_5
    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    div-int/2addr v0, v3

    const v3, 0x1aabdf

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    move-result v0

    if-gtz v0, :cond_3

    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    div-int/lit16 v3, v3, 0x236e

    sub-int/2addr v0, v3

    if-ltz v0, :cond_4

    sput v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v0, "\u06e6\u06e4\u06e0"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06df\u06e5\u06e3"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_7
    iget-object v0, p0, Lc6;->b:Landroid/view/KeyEvent$Callback;

    check-cast v0, Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sub-int/2addr v0, v3

    const v3, 0x1aba48

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :pswitch_0
    :sswitch_8
    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v0

    if-ltz v0, :cond_5

    const-string v0, "\u06e6\u06e0\u06e2"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/2addr v0, v3

    const v3, 0xdbff

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "UI0vUmE5P1yJByWERyE"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۧۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    add-int/lit16 v3, v3, -0x23ef

    mul-int/2addr v1, v3

    if-gtz v1, :cond_6

    const/16 v1, 0x5f

    sput v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v1, "\u06e4\u06e1\u06e3"

    invoke-static {v1}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto/16 :goto_0

    :cond_6
    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int/2addr v1, v3

    const v3, 0x1ac9ff

    add-int/2addr v3, v1

    move-object v1, v0

    goto/16 :goto_0

    :pswitch_1
    :sswitch_a
    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-result v0

    if-ltz v0, :cond_7

    const/16 v0, 0x10

    sput v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    const-string v0, "\u06e6\u06e0\u06e7"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    mul-int/2addr v0, v3

    const v3, 0x201fa8

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_b
    sget v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    if-gtz v0, :cond_8

    sput v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v0, "\u06e1\u06e4\u06e2"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    add-int/2addr v0, v3

    const v3, 0x1aaa27

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e5\u06e5\u06e3"

    goto/16 :goto_1

    :sswitch_c
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc27 -> :sswitch_0
        0x1aa781 -> :sswitch_a
        0x1aa7a3 -> :sswitch_8
        0x1aa7bd -> :sswitch_9
        0x1aab22 -> :sswitch_2
        0x1aabdf -> :sswitch_c
        0x1ab646 -> :sswitch_c
        0x1ab6c5 -> :sswitch_c
        0x1aba06 -> :sswitch_5
        0x1abac4 -> :sswitch_6
        0x1abe43 -> :sswitch_1
        0x1ac1e2 -> :sswitch_b
        0x1ac246 -> :sswitch_7
        0x1ac5a3 -> :sswitch_3
        0x1ac9c2 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.class public final synthetic Lv6;
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

    iput p3, p0, Lv6;->a:I

    iput-object p1, p0, Lv6;->b:Landroid/widget/TextView;

    iput-object p2, p0, Lv6;->c:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e4\u06e4"

    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit16 v2, v2, -0xbc9

    or-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06df\u06e6\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/lit16 v2, v2, -0x2640

    xor-int/2addr v0, v2

    if-ltz v0, :cond_1

    const-string v2, "\u06e7\u06e8\u06df"

    move v0, v1

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e2\u06e6\u06e5"

    :goto_3
    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/2addr v0, v2

    const v2, 0x1ab6f4

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v0, :cond_2

    const/16 v0, 0x20

    sput v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    const-string v0, "\u06e6\u06e1\u06e8"

    goto :goto_3

    :cond_2
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    mul-int/2addr v0, v2

    const v2, 0x22682

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e7\u06e6"

    goto :goto_1

    :sswitch_4
    const-string v0, "vuVjI5snj7AjmEO"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟۠ۡۦۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    add-int/lit16 v2, v2, 0xca

    sub-int/2addr v1, v2

    if-ltz v1, :cond_4

    const/16 v1, 0xb

    sput v1, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    const-string v1, "\u06e4\u06e4"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_4
    const-string v1, "\u06df\u06e6\u06e1"

    move-object v2, v1

    goto :goto_2

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc80 -> :sswitch_0
        0x1aa7da -> :sswitch_2
        0x1aabbf -> :sswitch_4
        0x1ab321 -> :sswitch_5
        0x1ab685 -> :sswitch_1
        0x1ac90e -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e0\u06e1"

    invoke-static {v1}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    const-string v1, "\u06e6\u06e7\u06e6"

    invoke-static {v1}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    iget v1, p0, Lv6;->a:I

    packed-switch v1, :pswitch_data_0

    :sswitch_2
    sget v1, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/2addr v1, v2

    const v2, 0x1ab7f1

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_0
    :sswitch_3
    sget v1, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    or-int/lit16 v2, v2, -0x1b9

    rem-int/2addr v1, v2

    if-ltz v1, :cond_1

    const/16 v1, 0x4f

    sput v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v1, "\u06e2\u06e1\u06e2"

    invoke-static {v1}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sub-int/2addr v1, v2

    const v2, 0x1aa8a9

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    add-int/lit16 v2, v2, -0x17cb

    mul-int/2addr v1, v2

    if-ltz v1, :cond_2

    const/16 v1, 0x38

    sput v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v1, "\u06e2\u06e0\u06e1"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    xor-int/2addr v1, v2

    const v2, 0x1aaaab

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    const-string v0, "0ZhbXhqt2"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۨ۠ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v1, :cond_3

    const-string v1, "\u06e7\u06e0\u06e3"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    mul-int/2addr v1, v2

    const v2, 0x15ef92

    add-int/2addr v1, v2

    goto :goto_0

    :pswitch_0
    :sswitch_6
    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v1

    if-ltz v1, :cond_4

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v1, "\u06e2\u06e5\u06e6"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06df\u06e1\u06e6"

    invoke-static {v1}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    iget-object v1, p0, Lv6;->b:Landroid/widget/TextView;

    invoke-static {v1, v3}, Lgn;->i(Landroid/view/View;I)V

    sget v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/lit16 v2, v2, 0x1831

    or-int/2addr v1, v2

    if-ltz v1, :cond_6

    const/16 v1, 0x22

    sput v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    :cond_5
    const-string v1, "\u06e7\u06e1\u06e4"

    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    rem-int/2addr v1, v2

    const v2, 0x1abeda

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_8
    sget v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v1, :cond_7

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v1, "\u06e2\u06df\u06e6"

    invoke-static {v1}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    sget v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/2addr v1, v2

    const v2, 0x1a507f

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_9
    iget-object v1, p0, Lv6;->c:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/lit16 v2, v2, 0xcd0

    sub-int/2addr v1, v2

    if-ltz v1, :cond_5

    const-string v1, "\u06e0\u06e4\u06e4"

    invoke-static {v1}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v1

    if-gtz v1, :cond_0

    sget v1, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    add-int/2addr v1, v2

    const v2, -0x1ac0c7

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_b
    iget-object v1, p0, Lv6;->c:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sub-int/2addr v1, v2

    const v2, 0x1acbc5

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_c
    iget-object v1, p0, Lv6;->b:Landroid/widget/TextView;

    invoke-static {v1, v3}, Lgn;->i(Landroid/view/View;I)V

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    mul-int/lit16 v2, v2, -0x124

    rem-int/2addr v1, v2

    if-ltz v1, :cond_8

    const/16 v1, 0x5e

    sput v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    goto/16 :goto_1

    :cond_8
    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    div-int/2addr v1, v2

    const v2, 0x1ac983

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_d
    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sub-int/2addr v1, v2

    const v2, -0x1ac209

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_e
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa744 -> :sswitch_0
        0x1aab60 -> :sswitch_e
        0x1ab263 -> :sswitch_1
        0x1ab647 -> :sswitch_d
        0x1abea2 -> :sswitch_9
        0x1ac167 -> :sswitch_4
        0x1ac1e6 -> :sswitch_3
        0x1ac23f -> :sswitch_7
        0x1ac245 -> :sswitch_c
        0x1ac528 -> :sswitch_6
        0x1ac52a -> :sswitch_8
        0x1ac546 -> :sswitch_5
        0x1ac54a -> :sswitch_a
        0x1ac8c9 -> :sswitch_e
        0x1ac907 -> :sswitch_2
        0x1ac984 -> :sswitch_b
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

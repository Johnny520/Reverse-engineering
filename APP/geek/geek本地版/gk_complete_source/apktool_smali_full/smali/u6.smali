.class public final synthetic Lu6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;I)V
    .locals 3

    iput p2, p0, Lu6;->a:I

    iput-object p1, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06df\u06e0"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "fTV"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۦۣۢۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    div-int/lit16 v2, v2, -0x2070

    xor-int/2addr v1, v2

    if-gtz v1, :cond_0

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v1, "\u06e7\u06e3\u06e1"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e0\u06e2\u06e7"

    :goto_1
    invoke-static {v1}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06e0\u06e5"

    goto :goto_1

    :sswitch_3
    const-string v1, "\u06e1\u06df\u06e0"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v1

    if-ltz v1, :cond_2

    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    xor-int/lit16 v2, v2, -0xe8e

    add-int/2addr v1, v2

    if-ltz v1, :cond_1

    const-string v1, "\u06e0\u06e2\u06e7"

    goto :goto_1

    :cond_1
    sget v1, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    div-int/2addr v1, v2

    const v2, 0x1ac585

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    :sswitch_5
    sget v1, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    mul-int/lit16 v2, v2, 0x18f5

    mul-int/2addr v1, v2

    if-gtz v1, :cond_3

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v1, "\u06df\u06e3\u06e8"

    invoke-static {v1}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sub-int/2addr v1, v2

    const v2, 0x1aa884

    add-int/2addr v1, v2

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaae5 -> :sswitch_0
        0x1aab25 -> :sswitch_2
        0x1aae82 -> :sswitch_4
        0x1aaedf -> :sswitch_5
        0x1ac585 -> :sswitch_1
        0x1ac8ed -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e5\u06e7"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v0

    if-gtz v0, :cond_5

    const-string v0, "\u06df\u06e1\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iget v0, p0, Lu6;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_2
    sget v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    mul-int/lit16 v2, v2, 0x46f

    rem-int/2addr v0, v2

    if-gtz v0, :cond_0

    const/16 v0, 0x4a

    sput v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v0, "\u06df\u06e4\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e6\u06e7"

    goto :goto_1

    :sswitch_3
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    const-string v1, "\u06e7\u06e8\u06e1"

    move-object v2, v1

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const-string v0, "\u06e2\u06e1\u06e6"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/lit16 v2, v2, -0x24c2

    xor-int/2addr v0, v2

    if-ltz v0, :cond_1

    const/16 v0, 0x35

    sput v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v0, "\u06e8\u06e6\u06e8"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    or-int/2addr v0, v2

    const v2, 0x1ac8fa

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_6
    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e0\u06e4"

    :goto_4
    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e3\u06e5\u06e7"

    goto :goto_4

    :sswitch_7
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    div-int/lit16 v2, v2, -0x151d

    xor-int/2addr v0, v2

    if-gtz v0, :cond_3

    const-string v0, "\u06e8\u06e6\u06e7"

    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e6\u06e5\u06e2"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :pswitch_0
    :sswitch_8
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v0, :cond_4

    const-string v0, "\u06e5\u06e2"

    goto :goto_3

    :cond_4
    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    mul-int/2addr v0, v2

    const v2, 0x1b08a2

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :pswitch_1
    :sswitch_9
    const-string v2, "\u06e7\u06e6\u06e1"

    move-object v0, v1

    goto :goto_2

    :cond_5
    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    or-int/2addr v0, v2

    const v2, -0xdcb2

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :pswitch_2
    :sswitch_a
    sget v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    or-int/lit16 v2, v2, -0x18b9

    sub-int/2addr v0, v2

    if-ltz v0, :cond_6

    invoke-static {}, Landroidx/profileinstaller/ۣ۠ۨۢ;->۟ۤۥ۟۟()I

    const-string v0, "\u06e4\u06e0\u06e3"

    :goto_5
    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e7\u06e3\u06e2"

    goto :goto_4

    :sswitch_b
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v0

    if-gtz v0, :cond_7

    const/16 v0, 0x22

    sput v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v0, "\u06e4\u06e6"

    :goto_6
    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/2addr v0, v2

    const v2, 0x1ab7d6

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :pswitch_3
    :sswitch_c
    const-string v0, "\u06e5\u06e2\u06e6"

    invoke-static {v0}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_d
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    div-int/lit16 v2, v2, 0x472

    xor-int/2addr v0, v2

    if-gtz v0, :cond_8

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v0, "\u06e3\u06e5\u06e7"

    :goto_7
    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    xor-int/2addr v0, v2

    const v2, 0x1aca72

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_e
    sget-object v0, Lgn;->a:Lgn;

    invoke-static {p1}, Lip;->l(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    or-int/lit16 v2, v2, -0xc1c

    div-int/2addr v0, v2

    if-eqz v0, :cond_9

    const-string v0, "\u06e6\u06e7"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_9
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    div-int/2addr v0, v2

    const v2, 0x1ab244

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_f
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    rem-int/lit16 v2, v2, -0x223c

    add-int/2addr v0, v2

    if-ltz v0, :cond_a

    const/16 v0, 0xe

    sput v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    const-string v0, "\u06df\u06df\u06e5"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e7\u06e8"

    :goto_8
    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :pswitch_4
    :sswitch_10
    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/lit16 v2, v2, -0x378

    add-int/2addr v0, v2

    if-ltz v0, :cond_b

    const/16 v0, 0x30

    sput v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    const-string v0, "\u06e6\u06e5\u06df"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e1\u06e8\u06e4"

    :goto_9
    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :pswitch_5
    :sswitch_11
    const-string v0, "\u06e8\u06e3\u06e8"

    goto/16 :goto_4

    :pswitch_6
    :sswitch_12
    const-string v0, "\u06e8\u06e6\u06e7"

    :goto_a
    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v0

    if-ltz v0, :cond_c

    const/16 v0, 0x52

    sput v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v0, "\u06e6\u06e7\u06e6"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06e7\u06e8\u06e1"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_14
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    add-int/lit16 v2, v2, -0x17a0

    or-int/2addr v0, v2

    if-ltz v0, :cond_d

    const/16 v0, 0x53

    sput v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v0, "\u06e0\u06e0\u06e4"

    :goto_b
    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u06df\u06df\u06e6"

    goto :goto_b

    :sswitch_15
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab99c

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_16
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    mul-int/lit16 v2, v2, 0x142e

    div-int/2addr v0, v2

    if-eqz v0, :cond_e

    const-string v0, "\u06e7\u06e6\u06e1"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_e
    const-string v0, "\u06e0\u06e5\u06e5"

    goto/16 :goto_5

    :pswitch_7
    :sswitch_17
    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    or-int/2addr v0, v2

    const v2, -0x1aa546

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :pswitch_8
    :sswitch_18
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    add-int/lit16 v2, v2, 0x2053

    sub-int/2addr v0, v2

    if-ltz v0, :cond_f

    const/16 v0, 0x18

    sput v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    const-string v0, "\u06e6\u06e7\u06e4"

    :goto_c
    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_f
    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    div-int/2addr v0, v2

    const v2, 0x1abddd

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :pswitch_9
    :sswitch_19
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v0

    if-ltz v0, :cond_10

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    const-string v0, "\u06df\u06e3\u06e8"

    invoke-static {v0}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_10
    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sub-int/2addr v0, v2

    const v2, 0xda24

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_1a
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lgn;->i(Landroid/view/View;I)V

    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v0

    if-ltz v0, :cond_11

    const/16 v0, 0x26

    sput v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v0, "\u06df\u06df\u06e6"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_11
    const-string v0, "\u06e3\u06e8\u06e3"

    goto/16 :goto_7

    :sswitch_1b
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v0, :cond_12

    const-string v0, "\u06e3\u06e8\u06e6"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_12
    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab391

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :pswitch_a
    :sswitch_1c
    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/lit16 v2, v2, -0xab

    mul-int/2addr v0, v2

    if-ltz v0, :cond_13

    const-string v0, "\u06e2\u06e2\u06e1"

    :goto_d
    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_13
    const-string v0, "\u06e0\u06df\u06e6"

    goto :goto_d

    :pswitch_b
    :sswitch_1d
    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    if-gtz v0, :cond_14

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    const-string v0, "\u06e8\u06e6\u06e5"

    goto/16 :goto_9

    :cond_14
    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab9f8

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :pswitch_c
    :sswitch_1e
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v0

    if-gtz v0, :cond_15

    const-string v0, "\u06e1\u06e7\u06e0"

    goto/16 :goto_a

    :cond_15
    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    xor-int/2addr v0, v2

    const v2, 0x1abcbe

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_1f
    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    mul-int/lit16 v2, v2, 0x1ebf

    add-int/2addr v0, v2

    if-ltz v0, :cond_16

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v2, "\u06e6\u06e7\u06e0"

    move-object v0, v1

    goto/16 :goto_2

    :cond_16
    const-string v0, "\u06e6\u06e4\u06e0"

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac2c5

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_20
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    div-int/lit16 v2, v2, -0x1d7a

    or-int/2addr v0, v2

    if-ltz v0, :cond_17

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v0, "\u06e5\u06e2\u06e2"

    goto/16 :goto_8

    :cond_17
    const-string v0, "\u06e6\u06e3\u06df"

    goto/16 :goto_c

    :sswitch_21
    :try_start_0
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v2, v2, 0x82a

    mul-int/2addr v0, v2

    if-ltz v0, :cond_18

    const-string v0, "\u06e5\u06e1\u06e5"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_18
    const-string v0, "\u06e6\u06e4\u06e0"

    goto/16 :goto_6

    :cond_19
    :sswitch_22
    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v0

    if-gtz v0, :cond_1a

    const-string v0, "\u06e6\u06e0\u06e4"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_1a
    const-string v0, "\u06e4\u06e5\u06df"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_23
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v0

    if-gtz v0, :cond_19

    const-string v0, "unHbzyPHGZS8HLoHyw6"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۢ۠ۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/2addr v2, v3

    const v3, 0x1ab93f

    add-int/2addr v2, v3

    move-object v3, v0

    goto/16 :goto_0

    :pswitch_d
    :sswitch_24
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    div-int/lit16 v2, v2, 0x1bba

    xor-int/2addr v0, v2

    if-gtz v0, :cond_1b

    const/16 v0, 0x4b

    sput v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    const-string v0, "\u06e5\u06e3\u06e4"

    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_1b
    const-string v0, "\u06e5\u06e4\u06e5"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_25
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    or-int/lit16 v2, v2, -0x1504

    div-int/2addr v0, v2

    if-eqz v0, :cond_1c

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v0, "\u06e7\u06e6\u06df"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_1c
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/2addr v0, v2

    const v2, 0xdc3b

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :pswitch_e
    :sswitch_26
    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    rem-int/2addr v0, v2

    const v2, 0xdc9c

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_27
    iget-object v0, p0, Lu6;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    mul-int/lit16 v2, v2, 0x1792

    sub-int/2addr v0, v2

    if-gtz v0, :cond_1d

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v0, "\u06e7\u06e8"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_1d
    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    div-int/2addr v0, v2

    const v2, 0x1ab260

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_28
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_0
        0xdbe7 -> :sswitch_8
        0xdc43 -> :sswitch_1e
        0xdc63 -> :sswitch_9
        0xdc82 -> :sswitch_28
        0xdc9c -> :sswitch_25
        0xdcb9 -> :sswitch_28
        0xdcc1 -> :sswitch_20
        0xdce1 -> :sswitch_28
        0xdcf7 -> :sswitch_13
        0x1aa705 -> :sswitch_f
        0x1aa706 -> :sswitch_28
        0x1aa743 -> :sswitch_22
        0x1aaac0 -> :sswitch_17
        0x1aaac7 -> :sswitch_3
        0x1aaae4 -> :sswitch_19
        0x1aaae8 -> :sswitch_1c
        0x1aab1d -> :sswitch_24
        0x1aab80 -> :sswitch_28
        0x1aaea0 -> :sswitch_26
        0x1aaea1 -> :sswitch_2
        0x1aaf20 -> :sswitch_10
        0x1aaf9d -> :sswitch_7
        0x1ab245 -> :sswitch_1a
        0x1ab262 -> :sswitch_28
        0x1ab287 -> :sswitch_28
        0x1ab2c7 -> :sswitch_12
        0x1ab322 -> :sswitch_14
        0x1ab661 -> :sswitch_c
        0x1ab6c5 -> :sswitch_1
        0x1ab71e -> :sswitch_28
        0x1ab721 -> :sswitch_28
        0x1aba02 -> :sswitch_28
        0x1aba7e -> :sswitch_28
        0x1aba9e -> :sswitch_18
        0x1ababd -> :sswitch_15
        0x1abdc9 -> :sswitch_d
        0x1abde5 -> :sswitch_16
        0x1abde9 -> :sswitch_5
        0x1abe26 -> :sswitch_e
        0x1abe41 -> :sswitch_1d
        0x1abe9e -> :sswitch_1b
        0x1ac1c2 -> :sswitch_28
        0x1ac1e2 -> :sswitch_28
        0x1ac203 -> :sswitch_28
        0x1ac54b -> :sswitch_1f
        0x1ac586 -> :sswitch_4
        0x1ac5e0 -> :sswitch_a
        0x1ac5e2 -> :sswitch_27
        0x1ac620 -> :sswitch_21
        0x1ac8cd -> :sswitch_1f
        0x1ac8d1 -> :sswitch_28
        0x1ac907 -> :sswitch_28
        0x1ac94d -> :sswitch_23
        0x1ac9a9 -> :sswitch_b
        0x1ac9aa -> :sswitch_6
        0x1ac9e1 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_e
        :pswitch_6
        :pswitch_c
        :pswitch_2
        :pswitch_4
        :pswitch_b
        :pswitch_d
        :pswitch_8
        :pswitch_1
        :pswitch_9
        :pswitch_5
        :pswitch_3
        :pswitch_a
        :pswitch_7
    .end packed-switch
.end method

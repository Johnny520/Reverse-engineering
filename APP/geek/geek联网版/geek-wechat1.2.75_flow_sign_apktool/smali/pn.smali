.class public final synthetic Lpn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Lum;

.field public final b:I

.field public final c:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Lum;ILandroid/app/Dialog;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e2\u06e8\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput p2, p0, Lpn;->b:I

    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/lit16 v2, v2, 0x2354

    add-int/2addr v0, v2

    if-gtz v0, :cond_7

    :cond_0
    const-string v0, "\u06e4\u06e1"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    :sswitch_1
    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac3c9

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_2
    const-string v0, "kmKSaeksOOIEaQqlSgolToGd"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨ۠۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v0, "\u06e2\u06e8\u06df"

    :goto_1
    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e5\u06e3\u06e7"

    goto :goto_1

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    if-gtz v0, :cond_3

    const/16 v0, 0x23

    sput v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v0, "\u06e2\u06e4\u06e0"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e8\u06e5"

    :goto_2
    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    iput-object p3, p0, Lpn;->c:Landroid/app/Dialog;

    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v0, :cond_5

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    :cond_4
    const-string v0, "\u06e6\u06e5\u06e7"

    goto :goto_2

    :cond_5
    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    add-int/2addr v0, v2

    const v2, 0x1aae17

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/lit16 v2, v2, -0x1858

    div-int/2addr v0, v2

    if-eqz v0, :cond_6

    const/16 v0, 0xa

    sput v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v0, "\u06e1\u06e8\u06e3"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_6
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    or-int/2addr v0, v2

    const v2, 0x1ab360

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/lit16 v2, v2, -0x2121

    rem-int/2addr v0, v2

    if-gtz v0, :cond_4

    const/16 v0, 0x26

    sput v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v0, "\u06e1\u06e8\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_7
    iput-object p1, p0, Lpn;->a:Lum;

    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    or-int/lit16 v2, v2, -0x420

    sub-int/2addr v0, v2

    if-gtz v0, :cond_0

    const/16 v0, 0x5d

    sput v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v0, "\u06e4\u06e0\u06e3"

    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    div-int/2addr v0, v2

    const v2, 0x1ac968

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7d -> :sswitch_0
        0xdcfd -> :sswitch_2
        0x1aaf9f -> :sswitch_1
        0x1ab2de -> :sswitch_3
        0x1ab359 -> :sswitch_7
        0x1ab9e7 -> :sswitch_5
        0x1abe09 -> :sswitch_6
        0x1ac208 -> :sswitch_8
        0x1ac969 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v2, 0x0

    const-string v1, "\u06e7\u06df\u06e0"

    invoke-static {v1}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move v1, v0

    move v3, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lkn;->i(Landroid/view/View;I)V

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    const-string v0, "\u06e1\u06e1\u06e5"

    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    rem-int/2addr v0, v4

    const v4, 0x1aa6e7

    add-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :cond_2
    :sswitch_2
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/2addr v0, v4

    const v4, 0xdca3

    add-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lpn;->a:Lum;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Lum;->f(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    rem-int/lit16 v4, v4, -0x1f6d

    xor-int/2addr v0, v4

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v0, "\u06e7\u06df\u06e0"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v4, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/2addr v0, v4

    const v4, 0x1ab56f

    xor-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_4
    iget v0, p0, Lpn;->b:I

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v3

    if-ltz v3, :cond_4

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v3, "\u06e6\u06e5\u06e5"

    invoke-static {v3}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move v3, v0

    goto :goto_0

    :cond_4
    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    mul-int/2addr v3, v4

    const v4, 0x147de6

    add-int/2addr v4, v3

    move v3, v0

    goto :goto_0

    :sswitch_5
    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    if-gtz v0, :cond_5

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v0, "\u06e2\u06e4\u06df"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    rem-int/2addr v0, v4

    const v4, 0x1ac675

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_6
    iget-object v0, p0, Lpn;->c:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/lit16 v4, v4, 0x631

    mul-int/2addr v0, v4

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move v0, v1

    :goto_2
    const-string v1, "\u06e0\u06e1\u06e3"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v4

    move v1, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "\u06e5\u06e7\u06e5"

    goto :goto_1

    :sswitch_8
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int/2addr v0, v4

    const v4, 0xdd14

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "YP50pyNYqAS3T5MpjB"

    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۦۨۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_2

    :sswitch_a
    invoke-static {p1}, Lmp;->d(Ljava/lang/Object;)V

    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    if-ltz v0, :cond_6

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v0, "\u06e2\u06e5\u06e5"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/2addr v0, v4

    const v4, 0x1ac22b

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_b
    sget-object v0, Lkn;->a:Lkn;

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v2, :cond_7

    const-string v2, "\u06e0\u06e4\u06e6"

    invoke-static {v2}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v4

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v0

    if-ltz v0, :cond_2

    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    if-gtz v0, :cond_8

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    move-object v0, v2

    :cond_7
    const-string v2, "\u06e0\u06e8\u06e2"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v2, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/2addr v0, v4

    const v4, 0x1ac1e8

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdca0 -> :sswitch_0
        0x1aa746 -> :sswitch_4
        0x1aab02 -> :sswitch_8
        0x1aab62 -> :sswitch_3
        0x1aabda -> :sswitch_a
        0x1aaec5 -> :sswitch_c
        0x1ab302 -> :sswitch_5
        0x1ab6fb -> :sswitch_6
        0x1abe83 -> :sswitch_1
        0x1ac1e8 -> :sswitch_9
        0x1ac206 -> :sswitch_7
        0x1ac241 -> :sswitch_2
        0x1ac508 -> :sswitch_b
    .end sparse-switch
.end method

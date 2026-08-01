.class public final Lzn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:Ljava/lang/String;

.field public final c:Lum;

.field public final d:Landroid/widget/SeekBar;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Ljava/lang/String;Lum;Landroid/widget/SeekBar;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06df\u06e3"

    invoke-static {v1}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p3, p0, Lzn;->c:Lum;

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    mul-int/2addr v1, v2

    const v2, 0x1a8535

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v1

    if-ltz v1, :cond_5

    :cond_0
    const-string v1, "\u06e8\u06e7\u06e2"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v1

    if-gtz v1, :cond_4

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-result v1

    if-gtz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v1, "\u06e3\u06e3\u06e1"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e3\u06e0\u06e4"

    :goto_1
    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    div-int/lit16 v2, v2, 0x1a6e

    xor-int/2addr v1, v2

    if-gtz v1, :cond_2

    const/16 v1, 0x35

    sput v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    const-string v1, "\u06e7\u06e3\u06e3"

    :goto_2
    invoke-static {v1}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e1\u06df\u06e3"

    goto :goto_2

    :sswitch_4
    iput-object p1, p0, Lzn;->a:Landroid/widget/TextView;

    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    add-int/lit16 v2, v2, 0x1634

    rem-int/2addr v1, v2

    if-ltz v1, :cond_3

    const/16 v1, 0xa

    sput v1, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    const-string v1, "\u06e8\u06e6\u06e7"

    goto :goto_1

    :cond_3
    const-string v1, "\u06e2\u06df\u06e6"

    :goto_3
    invoke-static {v1}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    :sswitch_5
    const-string v1, "\u06e1\u06e3\u06e4"

    goto :goto_2

    :sswitch_6
    iput-object p2, p0, Lzn;->b:Ljava/lang/String;

    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    if-ltz v1, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    :cond_5
    const-string v1, "\u06e1\u06e3\u06e4"

    goto :goto_3

    :cond_6
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/2addr v1, v2

    const v2, 0xdbe2

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_7
    iput-object p4, p0, Lzn;->d:Landroid/widget/SeekBar;

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v1

    if-ltz v1, :cond_7

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v1, "\u06e2\u06df\u06e6"

    invoke-static {v1}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    add-int/2addr v1, v2

    const v2, 0x1ab5f5

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "iUenkAlI"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->۟ۡۨۡۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/lit16 v2, v2, -0x1d12

    sub-int/2addr v1, v2

    if-ltz v1, :cond_0

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    const-string v1, "\u06df\u06e7"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_0
        0x1aae85 -> :sswitch_4
        0x1aaf02 -> :sswitch_9
        0x1ab249 -> :sswitch_6
        0x1ab361 -> :sswitch_7
        0x1ab627 -> :sswitch_8
        0x1ab681 -> :sswitch_2
        0x1ac228 -> :sswitch_3
        0x1ac9a9 -> :sswitch_5
        0x1ac9c3 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 5

    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    const-string v1, "\u06e8\u06e3\u06e8"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v1, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-eqz p3, :cond_8

    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v0, :cond_5

    const-string v0, "\u06e5\u06e6\u06e4"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lum;->f(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v0

    if-ltz v0, :cond_1

    :cond_0
    const-string v0, "\u06e5\u06e3\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/2addr v0, v4

    const v4, 0x1ac89c

    xor-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "Q5SG"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۣۢۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    or-int/lit16 v4, v4, -0x153f

    add-int/2addr v0, v4

    if-ltz v0, :cond_2

    const-string v0, "\u06df\u06e2\u06e3"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06df\u06e2"

    goto :goto_2

    :sswitch_3
    iget-object v0, p0, Lzn;->c:Lum;

    sget v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v1, :cond_3

    const-string v1, "\u06e6\u06e2\u06e4"

    invoke-static {v1}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v1, v0

    goto :goto_0

    :cond_3
    const-string v1, "\u06df\u06e2\u06e7"

    invoke-static {v1}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v4

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lzn;->b:Ljava/lang/String;

    invoke-static {v0, p2}, Lkn;->g(Ljava/lang/String;I)V

    const-string v0, "\u06e6\u06e4\u06e6"

    :goto_3
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(J)V

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x40

    sput v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v0, "\u06e0\u06e6\u06e3"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    move-result v0

    if-ltz v0, :cond_b

    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    xor-int/lit16 v4, v4, 0xb1c

    sub-int/2addr v0, v4

    if-gtz v0, :cond_4

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v0, "\u06df\u06df\u06e2"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e8\u06e2\u06e0"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sub-int/2addr v0, v4

    const v4, 0x1ac3c8

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_7
    if-eqz v1, :cond_8

    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v4, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    or-int/lit16 v4, v4, 0xfb

    mul-int/2addr v0, v4

    if-gtz v0, :cond_6

    const/16 v0, 0x4a

    sput v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v0, "\u06e4\u06e2\u06e2"

    goto :goto_3

    :cond_6
    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sub-int/2addr v0, v4

    const v4, 0x1aa5fe

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_8
    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/2addr v0, v4

    const v4, 0x1aab9d

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Lzn;->a:Landroid/widget/TextView;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    rem-int/lit16 v4, v4, -0x16be

    add-int/2addr v0, v4

    if-ltz v0, :cond_7

    const-string v0, "\u06df\u06e2\u06e7"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06df\u06e0"

    goto/16 :goto_1

    :cond_8
    :sswitch_a
    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int/lit16 v4, v4, -0x1ec4

    xor-int/2addr v0, v4

    if-gtz v0, :cond_9

    const-string v0, "\u06e5\u06e7\u06df"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e8\u06e1\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v0

    if-ltz v0, :cond_a

    const-string v0, "\u06e6\u06e4\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e8\u06e3\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_b
    :sswitch_c
    const-string v0, "\u06e5\u06e3\u06e7"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_d
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe1 -> :sswitch_0
        0x1aa702 -> :sswitch_5
        0x1aa760 -> :sswitch_1
        0x1aa764 -> :sswitch_7
        0x1aab9d -> :sswitch_4
        0x1aba24 -> :sswitch_c
        0x1abe09 -> :sswitch_d
        0x1abe63 -> :sswitch_a
        0x1ac1a8 -> :sswitch_b
        0x1ac1e8 -> :sswitch_3
        0x1ac227 -> :sswitch_8
        0x1ac90d -> :sswitch_6
        0x1ac926 -> :sswitch_2
        0x1ac94d -> :sswitch_9
    .end sparse-switch
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    const-string v0, "\u06e4\u06df\u06e3"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/lit16 v1, v1, 0xc03

    rem-int/2addr v0, v1

    if-gtz v0, :cond_0

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v0, "\u06e8\u06e7\u06e2"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e4\u06df\u06e3"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf00 -> :sswitch_0
        0x1ab9c8 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    const-string v0, "\u06e5\u06e8\u06e5"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v1, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    rem-int/lit16 v1, v1, -0x22a8

    sub-int/2addr v0, v1

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v0, "\u06e7\u06e6\u06e2"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/2addr v0, v1

    const v1, -0x1abd00

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/2addr v0, v1

    const v1, 0x19d55a

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lzn;->d:Landroid/widget/SeekBar;

    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    xor-int/lit16 v1, v1, -0x1e2

    invoke-static {v0, v1}, Lkn;->i(Landroid/view/View;I)V

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    rem-int/lit16 v1, v1, 0x2060

    sub-int/2addr v0, v1

    if-ltz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    const-string v0, "\u06e5\u06e1\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06df\u06e7\u06e2"

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0x1aa7fa -> :sswitch_0
        0x1ab263 -> :sswitch_1
        0x1abdc6 -> :sswitch_3
        0x1abea2 -> :sswitch_2
    .end sparse-switch
.end method

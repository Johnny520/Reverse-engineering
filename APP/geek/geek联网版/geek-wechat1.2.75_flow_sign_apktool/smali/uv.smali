.class public final Luv;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 5

    const-string v0, "q844/g==\n"

    const-string v1, "2aFXiqEP/CE=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "5//e6Q==\n"

    const-string v1, "hJ2cjiNebfs=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "BWaxZ/qp\n"

    const-string v1, "ZBDQE5vbN2I=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "2ORL4aM=\n"

    const-string v1, "rI0/jcZRLIw=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "6Ch+Nmnq2wg=\n"

    const-string v1, "m10cQgCet20=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v2, 0x0

    const-string v0, "\u06e5\u06e3\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(D)V

    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    add-int/lit16 v1, v1, -0xe3a

    add-int/2addr v0, v1

    if-ltz v0, :cond_6

    const-string v0, "\u06e8\u06e3\u06df"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_1
    iput-object p2, p0, Luv;->a:Landroid/view/View;

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06df\u06e0\u06e3"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    add-int/2addr v0, v1

    const v1, -0x1acb7d

    xor-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v0

    if-ltz v0, :cond_7

    sget v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    rem-int/lit16 v1, v1, -0x17b1

    rem-int/2addr v0, v1

    if-ltz v0, :cond_1

    const/16 v0, 0x16

    sput v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v0, "\u06e0\u06e7\u06df"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e3\u06e7\u06e4"

    goto :goto_2

    :sswitch_3
    const-string v0, "6Z"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->ۣۣ۟ۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v2, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    :goto_3
    const-string v2, "\u06e4\u06e0\u06e2"

    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    goto :goto_0

    :cond_2
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/2addr v2, v3

    const v3, 0x1aa68e

    add-int v4, v2, v3

    move-wide v2, v0

    goto :goto_0

    :sswitch_4
    iput-object p3, p0, Luv;->b:Landroid/widget/TextView;

    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    add-int/lit16 v1, v1, 0xf24

    xor-int/2addr v0, v1

    if-ltz v0, :cond_3

    const/16 v0, 0x32

    sput v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v0, "\u06e2\u06e6\u06e6"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e7\u06df"

    :goto_4
    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_5
    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v0

    if-gtz v0, :cond_4

    const/16 v0, 0x2c

    sput v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    const-string v0, "\u06e0\u06e4\u06e8"

    goto :goto_4

    :cond_4
    const-string v0, "\u06e5\u06e3\u06e6"

    goto :goto_4

    :sswitch_6
    iput-object p5, p0, Luv;->d:Landroid/widget/TextView;

    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    div-int/lit16 v1, v1, -0x1f76

    add-int/2addr v0, v1

    if-gtz v0, :cond_5

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v0, "\u06e3\u06e7\u06e4"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e7\u06df"

    goto :goto_4

    :cond_6
    const-string v0, "\u06e4\u06e3\u06e7"

    goto/16 :goto_1

    :cond_7
    :sswitch_7
    sget v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    div-int/2addr v0, v1

    const v1, 0x1aba4a

    add-int/2addr v0, v1

    move v4, v0

    goto/16 :goto_0

    :sswitch_8
    iput-object p4, p0, Luv;->c:Landroid/widget/TextView;

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v0

    if-ltz v0, :cond_8

    const/16 v0, 0x4e

    sput v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v0, "\u06e5\u06e3\u06e6"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_8
    move-wide v0, v2

    goto/16 :goto_3

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa722 -> :sswitch_0
        0x1aabb8 -> :sswitch_8
        0x1ab322 -> :sswitch_5
        0x1ab6a1 -> :sswitch_7
        0x1ab6fb -> :sswitch_2
        0x1ab700 -> :sswitch_3
        0x1ab9e6 -> :sswitch_6
        0x1aba48 -> :sswitch_9
        0x1abe08 -> :sswitch_1
        0x1ac944 -> :sswitch_4
    .end sparse-switch
.end method

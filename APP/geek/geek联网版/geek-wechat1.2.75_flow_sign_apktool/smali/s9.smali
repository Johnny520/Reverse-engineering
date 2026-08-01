.class public final Ls9;
.super Ljava/lang/ThreadLocal;


# instance fields
.field public final a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 3

    iput p1, p0, Ls9;->a:I

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06df\u06e4"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/lit16 v2, v2, -0x135a

    div-int/2addr v0, v2

    if-eqz v0, :cond_2

    const/16 v0, 0x1a

    sput v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v0, "\u06df\u06e2\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "HodPhgo4A"

    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->۟۟ۢۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/2addr v1, v2

    const v2, 0x1aae4c

    add-int/2addr v2, v1

    move v1, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    mul-int/lit16 v2, v2, 0x10fe

    or-int/2addr v0, v2

    if-ltz v0, :cond_1

    const/16 v0, 0x2d

    sput v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    :cond_0
    const-string v0, "\u06e5\u06df\u06e4"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    add-int/2addr v0, v2

    const v2, 0x1ab5cf

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v0

    if-ltz v0, :cond_3

    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    or-int/lit16 v2, v2, -0x13ae

    mul-int/2addr v0, v2

    if-gtz v0, :cond_0

    const/16 v0, 0x39

    sput v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    const-string v0, "\u06e7\u06df\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sub-int/2addr v0, v2

    const v2, -0x1ac7cd

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_3
    :sswitch_4
    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    or-int/lit16 v2, v2, -0x9c4

    rem-int/2addr v0, v2

    if-gtz v0, :cond_4

    const-string v0, "\u06e3\u06e6\u06e4"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e3\u06e7\u06e6"

    goto :goto_1

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab3f -> :sswitch_0
        0x1ab249 -> :sswitch_2
        0x1ab702 -> :sswitch_5
        0x1abd8a -> :sswitch_1
        0x1abdc4 -> :sswitch_4
        0x1ac50c -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    const-string v0, "\u06e6\u06df\u06e7"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    :goto_1
    return-object v0

    :sswitch_1
    iget v0, p0, Ls9;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_2
    const-string v0, "\u06df\u06e2"

    :goto_2
    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :pswitch_0
    :sswitch_3
    const-string v0, "\u06e5\u06df\u06e4"

    goto :goto_2

    :sswitch_4
    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v0, :cond_0

    const-string v0, "\u06df\u06e4\u06e4"

    goto :goto_2

    :cond_0
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    or-int/2addr v0, v1

    const v1, 0x1abd9d

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "DSkgny4ktbE=\n"

    const-string v2, "RWEa8kMexsI=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0x1ab2fd -> :sswitch_3
        0x1aba08 -> :sswitch_4
        0x1abd8a -> :sswitch_5
        0x1ac14e -> :sswitch_1
        0x1ac965 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
